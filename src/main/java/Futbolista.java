public abstract class Futbolista implements Comparable<Futbolista>{
    private String nombre;
    private int edad;
    private final String posicion;

    Futbolista(String nombre,int edad,String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    @Override
    public String toString(){
        return ("El futbolista "+this.getNombre()+" tiene "+this.getEdad()+" años, y juega de "+this.getPosicion());
    }

    public boolean equals(Futbolista f){
        return this == f;
    }

    public abstract boolean jugarConLasManos();

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getPosicion(){
        return this.posicion;
    }
}