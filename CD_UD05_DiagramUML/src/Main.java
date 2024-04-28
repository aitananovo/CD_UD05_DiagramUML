public class Main {
   
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();
        
        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", "555-1234");
        Cliente cliente2 = new Cliente("Ana Gómez", "Avenida Siempre Viva 456", "555-5678");
        
        veterinaria.agregarCliente(cliente1);
        veterinaria.agregarCliente(cliente2);
        
        Animal animal1 = new Animal("Firulais", "Perro", "Labrador", cliente1);
        Animal animal2 = new Animal("Michi", "Gato", "Siames", cliente2);
        
        veterinaria.agregarAnimal(animal1);
        veterinaria.agregarAnimal(animal2);
        
        Veterinario veterinario = new Veterinario("Dr. Rodríguez", "Medicina General");
        
        Consulta consulta1 = new Consulta("2024-04-26", "Control anual", "Saludable", "Vacunación anual", veterinario);
        
        veterinaria.asignarConsulta(animal1, consulta1);
        
        veterinaria.imprimirConsultas();
    }
        
}