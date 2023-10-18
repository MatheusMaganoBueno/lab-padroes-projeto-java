package one.digitalinnovation.gof.Singleton;
// Sigleton "preguiçoso" //
public class SigletonLazy {

    private static SigletonLazy instancia;

    private SigletonLazy(){
        super();
    }

    public static SigletonLazy getInstance(){
        if (instancia == null){
            instancia = new SigletonLazy();
        }
        return instancia;
    }

}
