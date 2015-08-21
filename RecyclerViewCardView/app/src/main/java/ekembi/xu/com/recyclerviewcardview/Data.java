package ekembi.xu.com.recyclerviewcardview;


import java.util.ArrayList;

public class Data {

    public static ArrayList<Information> getData() {

        ArrayList<Information> data = new ArrayList<>();

        int[] images = {

                R.drawable.cat_1,
                R.drawable.cat_2,
                R.drawable.cat_3,
                R.drawable.cat_4,

                R.drawable.dog_1,
                R.drawable.dog_2,
                R.drawable.dog_3,
                R.drawable.dog_4
        };

        String[] Categories = {
                "Cat 1",
                "Cat 2",
                "Cat 3",
                "Cat 4",

                "Dog 1",
                "Dog 2",
                "Dog 3",
                "Dog 4"
        };

        for (int i = 0; i < images.length; i++) {
            Information current = new Information();
            current.title = Categories[i];
            current.imageId = images[i];

            data.add(current);
        }

        return data;
    }
}
