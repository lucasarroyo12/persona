public static void main(String[] args) {

    Persona persona = new Persona();
    
    persona.setEdad(20);
    persona.setNombre("juan");
    persona.setTelefono(4234567);

    System.out.println("La edad es: " + persona.getEdad + " , El nombre es: " + persona.getNombre + " ,El telefono es: " + persona.getTelefono);
    
}

Public class Persona(){

    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getTelefono(){
        return telefono;
    }

    public int setEdad(){
        this.edad=edad;
    }

    public String setNombre(){
        this.nombre=nombre;
    }

    public int setTelefono(){
        this.telefono=telefono;
    }

}








