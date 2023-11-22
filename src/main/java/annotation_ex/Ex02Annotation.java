package annotation_ex;

import java.lang.annotation.*;

public class Ex02Annotation {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiomiClass = Class.forName("annotation_ex.Xiomi");
        Annotation annotation1 = xiomiClass.getAnnotation(SmartPhone.class);

        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiomi class: " +
                sm1.OS() + ", " + sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("annotation_ex.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);

        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone class: " +
                sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }


}




@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    // элементы внутри аннотации
    // если указаны default, то можно не указывать
    // в самой аннотации
    String OS() default "Android";

    int yearOfCompanyCreation();
}


@SmartPhone(yearOfCompanyCreation = 2010)
class Xiomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
