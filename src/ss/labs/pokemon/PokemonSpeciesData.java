package ss.labs.pokemon;

/**
 * Created by jerry on 2017/3/1.
 */
//種族值
public class PokemonSpeciesData //TODO implement Comparable<PokemonSpeciesData>
{
    public int id;
    public String speciesName;
    public PokemonValueData speciesValue;

    //HashMap<Integer,MoveData> learnMoveTable;
    public PokemonSpeciesData(int id, String speciesName,PokemonValueData valueData)
    {
        this.id = id;
        this.speciesName = speciesName;
        this.speciesValue = valueData;
    }


}

//https://wiki.52poke.com/wiki/种族值