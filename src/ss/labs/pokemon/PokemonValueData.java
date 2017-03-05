package ss.labs.pokemon;

/**
 * Created by jerry on 2017/3/1.
 */
public class PokemonValueData {
    public int[] valArray;
    public PokemonValueData()
    {
        valArray = new int[6];
    }
    public PokemonValueData(int[] rawData)
    {
        valArray = rawData.clone();
    }

//    public int getVal(PokemonValueType type)
//    {
//        return valArray[type.getVal()];
//    }

}
