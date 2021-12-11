package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.AssertionUtil;

/**
 * @Author:lym
 * @Date:2021/12/9 22:20
 */
public class Search extends Base {

    private Logger logger=Logger.getLogger(Search.class);

    @Test
    public void sucessCase(){
        to("http://www.baidu.com/");
//        driver.findElement(By.id("kw")).sendKeys("自动化测试");
        sendKeys(getElement("百度页", "百度搜索框"),"Jenkins");
        click(getElement("百度页", "百度一下"));
        //拿地址的时候页面可能还没调整，需要时间
        AssertionUtil.assertTrue(urlPresenceContent("baidu"));

    }
}
