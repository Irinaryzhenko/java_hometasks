package java_hometasks.homework2_and_3.Hometask3;

public enum Engine {
   ENGINE1 ("DISEL2000"),
   ENGINE2 ("DISEL1800"),
    ENGINE3("DISEL4100"),
    ENGINE4("DISEL4400"),
    ;
   String engineName;
   private int engineVolume;

   Engine (String engineName) {
       this.engineName = engineName;

   }

    public String getEngineName() {
        return engineName;
    }
}
