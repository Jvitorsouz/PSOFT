public class LanchoneteTest {
    
    public void servirCafe(){
        Lanchonete cafe = new Cafe();
        cafe.prepararBebida();

    }

    public void servirCha(){
        Lanchonete cha = new Cha();
        cha.prepararBebida();


    }

    public static void main(String[] args) {
        LanchoneteTest lanchTest = new LanchoneteTest();

        lanchTest.servirCafe();
        lanchTest.servirCha();

    }
}
