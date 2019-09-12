package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainStep {

MainPage mainPage = new MainPage();

@Step("выбран пункт главного меню - {0}")
    public void stepSelectMenuItem(String item){
    mainPage.selectMainMenuItem();
}
@Step ("в Меню Доставки выбран пункт - {0}")
    public void stepSelectMenuCategory(String item){

}
@Step("нажать перейти в корзину")
    public void stepGoToBasket(){

}
}
