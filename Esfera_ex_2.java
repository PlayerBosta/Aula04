class Esfera_ex_2{
    private float r;
    public Esfera_ex_2(float r){
        this.r = r;
    }
    public float calcularVolume(){
        return (float) ((4/3)*3.14*(r*r*r));
    }

    public float calcularArea(){
        return (float)(4 * 3.14 * (r*r));
    }
}
