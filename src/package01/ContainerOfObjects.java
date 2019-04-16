package package01;


public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object objects[];

    /**
     * Construtor que permite a instanciação da classe tendo por base um vetor
     * de elementos recebido
     *
     * @param objects Lista de objectos sem tamanho fixo
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Constructor que instancia classe tendo por base um valor por defeito(100)
     */
    public ContainerOfObjects() {
        this.objects = new Object[DEFAULT_SIZE];
    }

    /**
     * Construtor que permite a instanciação da classe definindo um valor máximo
     * de elementos
     *
     * @param maxSize número máximo de elementos permitidos no vetor
     */
    public ContainerOfObjects(int maxSize) {
        this.objects = new Object[maxSize];
    }

    /**
     * Método que insere um {@link Object objeto} na coleção de
     * {@link ContainerOfObjects#objects objetos}
     *
     * @param newobject {@link Object objeto} a inserir no vetor
     * @return valor booleano que sinaliza o sucesso/falha da operação
     */
    protected boolean addObject(Object newObject) {
        boolean flag = false;
        for (int i = 0; i < this.objects.length; i++) {
            if (this.objects[i] == null) {
                this.objects[i] = newObject;
                flag = true;
            }
        }
        return flag;
    }

    /**
     * Método que remove um {@link Object objeto} do vetor de
     * {@link ContainerOfObjects#objects objetos}
     *
     * @param position índice do elemento a eliminar
     * @return o {@link Object objeto} eliminado
     */
    protected Object removeObject(int position) {
        Object object = null;
        return object;
    }

    /**
     * Método que substitui um {@link Object objeto} no vetor de
     * {@link ContainerOfObjects#objects objetos}
     *
     * @param position ìndice do elemento a substituir
     * @param newObject novo objeto
     * @return
     */
    protected boolean setObject(int position, Object newObject) {
        return true;
    }

    /**
     * Método que encontra um {@link Object objeto} no vetor de
     * {@link ContainerOfObjects#objects objetos}
     *
     * @param objeto a procurar
     * @return ìndice do objecto a procurar
     */
    protected int findObject(Object objeto) {
        return 1;
    }

}
