import com.hxy.config.SpringConfig;
import com.hxy.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = cxt.getBean(BookService.class);
        bookService.save();
    }
}
