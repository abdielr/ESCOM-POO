class Carrete {
    private int cantidad;

    public Carrete() {
        int cantidad = 200;
    }

    public void cortar(int corte) {
        if (corte <= 200){
            cantidad = cantidad - corte;
            System.out.println("Has comprado " + corte + "m de tela");
        } else {
            System.out.println("No hay tela suficiente");
        }

    }
}