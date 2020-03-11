package practice.testng.examples.testScripts;

import org.testng.annotations.Test;

public class IncludeExclude {

    @Test(groups = {"smoke"})
    public void example1(){
        System.out.println("Smoke scripts are executed");
    }
    @Test(groups = {"sanity"})
    public void example2(){
        System.out.println("inside the includeExcludeMethod");
    }
    @Test(groups = {"regression"})
    public void example3(){
        System.out.println("inside the includeExcludeMethod");
    }
}
