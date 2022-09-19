
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(Setup.class);
    }
}


@Configuration
class Setup {     // This is a configuration class
    @Bean
    Team createFirst() {
        Team t = new Team();
        t.setName("Vortex");
        t.point = 15;
        return t;           // Spring will keep this address
    }
}


class Team {
    String name;   // field, not a property
    int point;     // field, not a property
    
    // this is property (get, set)
    public void setName(String s) {
        name = s;
    }
}