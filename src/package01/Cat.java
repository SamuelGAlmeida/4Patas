package package01;
import enums.CatType;
import enums.Gender;

/**
 *
 * @author Samuel Almeida
 */

public class Cat extends Animal{
    private CatType type;

    /**
     * Método construtor para inicializar uma instância de {@link Cat gato}
     *
     * @param id Identificador do gato
     * @param name Nome do gato
     * @param gender Género do gato
     * @param age Idade relativa do gato
     * @param type Tipo de gato
     */
    public Cat(int id, String name, Gender gender, int age, CatType type) {
        super(id, name, gender, age);
    }

    public CatType getType() {
        return type;
    }

    public void setType(CatType type) {
        this.type = type;
    }
}

       

