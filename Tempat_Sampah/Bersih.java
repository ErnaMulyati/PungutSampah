import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.*;
/**
 * Write a description of class Bersih here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bersih extends World
{
    Counter counter = new Counter("Score: ");

    /**
     * Constructor for objects of class Bersih.
     * 
     */
    public Bersih()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the world
     * objects and add them to the world. 
     */
    private void prepare()
    {
        addObject(counter, 47,26);
        counter.setLocation(551, 385);
        
        Timer timer2 = new Timer();
        addObject(timer2, 927, 361);
        timer2.setLocation(915, 356);
        SampahKertas kertas2 = new SampahKertas();
        addObject(kertas2, 94, 618);
        Organik organik2 = new Organik();
        addObject(organik2, 346, 625);
        Kaca kaca2 = new Kaca();
        addObject(kaca2, 400, 637);
        Kaleng kaleng2 = new Kaleng();
        addObject(kaleng2, 770, 628);
        kertas2.setLocation(145, 623);
        organik2.setLocation(380, 623);
        kaca2.setLocation(615, 623);
        kaleng2.setLocation(850, 623);
        Counter counter3 = new Counter();
        addObject(counter3, 906, 414);
        counter3.setLocation(955, 395);
        removeObject(counter3);
        
        counter.setLocation(960, 394);
        counter.setLocation(967, 393);
        Cangkir cangkir = new Cangkir();
        addObject(cangkir, 945, 197);
        Kalengsarden kalengsarden = new Kalengsarden();
        addObject(kalengsarden, 861, 197);
        kalengsarden.setLocation(865, 197);
        Botol botol = new Botol();
        addObject(botol, 799, 197);
        Daun daun = new Daun();
        addObject(daun, 900, 197);
        Botolsoda botolsoda = new Botolsoda();
        addObject(botolsoda, 755, 197);
        Pisang pisang = new Pisang();
        addObject(pisang, 641, 197);
        Kalengcat kalengcat = new Kalengcat();
        addObject(kalengcat, 558, 258);
        kalengcat.setLocation(545, 197);
        Apel apel = new Apel();
        addObject(apel, 446, 197);
        Lembarankertas lembarankertas = new Lembarankertas();
        addObject(lembarankertas, 355, 197);
        Kertaskusut kertaskusut = new Kertaskusut();
        addObject(kertaskusut, 243, 197);
        lembarankertas.setLocation(345, 197);
        Botolkaca botolkaca = new Botolkaca();
        addObject(botolkaca, 175, 197);
        Kertasrusak kertasrusak = new Kertasrusak();
        addObject(kertasrusak, 104, 197);
        kertasrusak.setLocation(67, 197);
        botolkaca.setLocation(162, 197);
        kertaskusut.setLocation(238, 197);
        botolkaca.setLocation(153, 197);
        kertasrusak.setLocation(231, 197);
        lembarankertas.setLocation(335, 197);
        apel.setLocation(439, 197);
        kalengcat.setLocation(540, 197);
        pisang.setLocation(640, 197);
        botolsoda.setLocation(753, 197);
        botol.setLocation(745, 197);
        daun.setLocation(650, 197);
        botolkaca.setLocation(800, 197);
        botolsoda.setLocation(785, 197);
        kalengsarden.setLocation(863, 197);
        cangkir.setLocation(948, 197);
        kertasrusak.setLocation(80, 197);
        botolkaca.setLocation(135, 197);
        daun.setLocation(60, 197);
        kertaskusut.setLocation(206, 197);
        lembarankertas.setLocation(310, 197);
        apel.setLocation(416, 197);
        kalengcat.setLocation(524, 197);
        pisang.setLocation(632, 197);
        cangkir.setLocation(280, 181);
        lembarankertas.setLocation(942, 208);
        kalengsarden.setLocation(360, 210);
        apel.setLocation(842, 217);
        daun.setLocation(730, 197);
        apel.setLocation(857, 215);
        lembarankertas.setLocation(945, 208);
        apel.setLocation(868, 221);
        botol.setLocation(451, 195);
        kalengcat.setLocation(542, 205);
        kertasrusak.setLocation(755, 217);
        botolkaca.setLocation(407, 209);
        kalengsarden.setLocation(115, 205);
        botolkaca.setLocation(516, 198);
        pisang.setLocation(611, 198);
        kertaskusut.setLocation(692, 212);
        botol.setLocation(770, 211);
        apel.setLocation(825, 224);
        apel.setLocation(850, 217);
        lembarankertas.setLocation(943, 209);
        apel.setLocation(844, 217);
        kalengsarden.setLocation(370, 207);
        cangkir.setLocation(290, 189);
        kertasrusak.setLocation(210, 202);
        kalengcat.setLocation(395, 212);
        daun.setLocation(40, 197);
        botolsoda.setLocation(455, 201);
        botol.setLocation(33, 204);
        botolsoda.setLocation(50, 197);
    }
    
    public void countPop()
    {
        counter.add(20);
    }
    
    public void mincountPop()
    {
        counter.subtract(20);
    }
    
    public void gameOver()
    {
        addObject(new Score(counter.getValue()), getWidth()/2, getHeight()/2);
    }
}

