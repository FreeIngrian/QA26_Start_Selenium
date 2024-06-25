import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTest {
@BeforeClass

public void preCondition() {

    //open browser
    //open site
}

public void  loginSuccess(){

    //open form (find element + click)
    //fill form (find element + click + clear + type)
    //submit form
}

public void loginWrongEmail(){
    //open form
    //fill form
    //submit form

}

public void loginWrongPassword(){
    //open form
    //fill form
    //submit form

}

public void loginUnregisteredUser(){
    //open form
    //fill form
    //submit form

    }

@AfterClass
public void postCondition(){
    //close browser
}

}