package nested_classes.local_inner_class;

/*
   Local inner класс распологается в блоках кода таких,
   ка, например метод или конструктор

   Local inner класс не может быть static

   Область видимости Local inner класса - это блок,
   в котором он находится

   Local inner класс может обращаться даже к
   private элементам внешнего класса

   Local inner класс может обращаться к элементам
   блока, в котором он написан при условии, что они
   final или effectively final (после инициализации
   которой её назначение не меняется)
 */
public class Local_innerEx1 {
    public static void main(String[] args) {
        Math m = new Math();
        m.getResult();
    }
}

class Math{
    private int a = 10;
    private int delimoe = 21;
    public void getResult(){
        class Delenie{
            //private int delimoe;
            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnor(){
                return delimoe/delitel;
            }

            public int getOstatok(){
                System.out.println("privat int a = " + a);
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
        //delenie.setDelimoe(21);
        delenie.setDelitel(4);
        //System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnor());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}
