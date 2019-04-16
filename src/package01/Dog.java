package package01;
import enums.DogBuild;
import enums.Gender;

public class Dog extends Animal {

    /**
     * Porte do cão
     */
    private DogBuild size;

    /**
     * Método construtor para inicializar uma instância de {@link Dog cão}
     *
     * @param id Identificador do cão
     * @param name Nome do cão
     * @param gender Género do cão
     * @param age Idade estimada do cão
     * @param size Porte do cão
     */
    public Dog(int id, String name, Gender gender, int age, DogBuild size) {
        super(id, name, gender, age);
        this.size = size;
    }

    /**
     * Método getter para a variável de instância de {@link Dog#size porte}
     *
     * @return {@link Dog#size porte}
     */
    public DogBuild getSize() {
        return size;
    }

    /**
     * Método setter para a variável de instância de {@link Dog#size porte}
     *
     * @param size de um cão
     */
    public void setSize(DogBuild size) {
        this.size = size;
    }

}
