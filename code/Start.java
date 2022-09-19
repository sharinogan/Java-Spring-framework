
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(Prepare.class);
        
        
        Team t = context.getBean("second", Team.class);
        System.out.println(t.name);
        System.out.println(t); // address
    }
}

class Prepare {
    @Bean 
    Carrier thaiPost() {
        Carrier c = new Carrier();
        c.setName("Thailand Post");
        return c;
    }
    
    @Bean
    Carrier kerry() {
        Carrier c = new Carrier();
        c.setName("Kerry Express");
        return  c;
    }
}

class Carrier {
    String name;
    public void setName(String s) {
        name = s;
    }
    
    public String getName() {
        return name;
    }
}

class Package { 
    String receiver;
    String sender = "iTaow Shop";
    Carrier carrier;
    
    public void setReceiver(String r) {
        receiver = r;
    }
    
    public void setCarreier(Carrier c) {
        carrier = c;
    }
}

@Configuration
class Setup {     // This is a configuration class
    @Bean
    Team first() {
        Team t = new Team();
        t.setName("Vortex");
        t.point = 15;
        return t;           // Spring will keep this address
    }
    @Bean
    Team second() {
        Team t = new Team();
        t.setName("Electro");
        t.point = 12;
        return t;
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