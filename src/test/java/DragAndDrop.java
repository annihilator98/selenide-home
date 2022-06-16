import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void dragAndDropTest (){
        //Откройте drag and drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");

        //Проверьте, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));

    }
}
