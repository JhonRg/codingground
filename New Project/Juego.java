public abstract class Juego {

    public static int getDistanceMin(Coordenada position, Coordenada destiny){
        int res, mod1, mod2;
        mod1= (int) Math.pow((position.getCoordX()-destiny.getCoordX()),2);
        mod2= (int) Math.pow((position.getCoordY()-destiny.getCoordY()),2);
        res = (int) Math.sqrt(mod1 + mod2);
        return res;
    }
    public static int getDistanceMax(Coordenada position, Coordenada destiny){
        int mod1, mod2;
        
        mod1 = Math.abs(position.getCoordX() - destiny.getCoordX());
        mod2 = Math.abs(position.getCoordY() - destiny.getCoordY());
        return mod2 + mod1;
    }

}