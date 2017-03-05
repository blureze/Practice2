package ss.labs.pokemon;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by jerry on 2017/3/3.
 */
public class Pokedex {
    ArrayList<PokemonSpeciesData> pokemonSpeciesDataList;
    public Pokedex()
    {
        //You can remove this
        test();
    }
    public Pokedex(String filename) {

        try {
            loadFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void test()
    {
        //this is a demo of how to load, add and save. You can play with it
        //The program you take screenshot should not contain this
        try {
            loadFile("bin/pokedex.json");
            addNewPokemon(5,"Squirtle",new int[]{11,11,11,11,11,11});
            addNewPokemon(1,"Ivysoar",new int[]{11,11,11,11,11,11});
            saveFile("bin/pokedex_test.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadFile(String fileName) throws IOException {
        //use JsonReader to read json file
        JsonReader reader = new JsonReader(new FileReader(fileName));

        //use gson to convert text to object
        Gson gson = new Gson();
        PokemonSpeciesData[] dataArray = gson.fromJson(reader,PokemonSpeciesData[].class);

        //Just print out the string to see loaded result
        String jsonString = gson.toJson(dataArray);
        System.out.println(jsonString);

        //Convert array into arraylist
        pokemonSpeciesDataList = new ArrayList<>(Arrays.asList(dataArray));

        reader.close();
    }
    public void saveFile(String fileName) throws IOException {
        //TODO sort the datalist before save data

        //TODO Create JsonWriter with fileName


        //TODO use gson to write object into json file, rememeber to convert ArrayList back to normal array first

        //TODO close the writer, very important!!!

    }

    public void addNewPokemon(int id,String name, int[] speciesValue)
    {
        //TODO create a new PokemonSpeciesData and add to the datalist
        //your can print out some information if you want

    }

}
