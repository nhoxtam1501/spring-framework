import com.ducku.beans.DatabaseConnection;
import com.ducku.beans.MyBean;
import com.ducku.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DatabaseConnection postgres = context.getBean("postgresDatabase", DatabaseConnection.class);
        DatabaseConnection mysql = context.getBean("mysqlDatabase", DatabaseConnection.class);
        com.ducku.beans.MyBean myBean = context.getBean(MyBean.class);
        myBean.connect();
        context.close();
    }


}
