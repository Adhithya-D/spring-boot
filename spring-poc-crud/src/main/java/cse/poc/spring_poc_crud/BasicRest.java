package cse.poc.spring_poc_crud;

@restcontroller
public class BasicRest {
    private String[]industryVertical={"banking","logisitic",

    };
    public String[]getindustry(){
        return industryVertical;
    }
}
