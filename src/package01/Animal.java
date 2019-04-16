package package01;
import enums.Gender;

public class Animal {

    /**
     * Identificador numérico do animal
     */
    private int id;
    /**
     * Nome do animal
     */
    private String name;
    /**
     * Género do animal
     */
    private Gender gender;
    /**
     * Idade estimada do animal
     */
    private int age;

    /**
     * Método construtor para criar uma instanciação de {@link Animal animal}
     *
     * @param id Identificador do animal
     * @param name Nome do animal
     * @param gender Género do animal
     * @param age Idade estimada do animal
     */
    public Animal(int id, String name, Gender gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    /**
     * Método getter para a variável de instancia {@link Animal#id id}
     *
     * @return {@link Animal#id id} de um animal
     */
    public int getId() {
        return id;
    }

    /**
     * Método setter para a variável de instancia {@link Animal#id id}
     *
     * @param id de um animal
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método getter para a variável de instancia {@link Animal#name nome}
     *
     * @return {@link Animal#name name} de um animal
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter para a variável de instancia {@link Animal#name nome}
     *
     * @param name de um animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método getter para a variável de instancia {@link Animal#gender género}
     *
     * @return {@link Animal#gender gender} de um animal
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Método setter para a variável de instancia {@link Animal#gender género}
     *
     * @param gender de um animal
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Método getter para a variável de instancia {@link Animal#age idade}
     *
     * @return {@link Animal#age idade} de um animal
     */
    public int getAge() {
        return age;
    }

    /**
     * Método setter para a variável de instancia {@link Animal#age idade}
     *
     * @param age de um animal
     */
    public void setAge(int age) {
        this.age = age;
    }
}
