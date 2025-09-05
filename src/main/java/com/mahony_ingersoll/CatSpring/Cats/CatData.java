package com.mahony_ingersoll.CatSpring.Cats;

public class CatData {
    private int id;
    private String name;
    private String color;
    private String breed;
    private String imagePath;

    public CatData() {}

    public CatData(int id, String name, String color, String breed, String imagePath)
    {
        this.id = id;
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.imagePath = imagePath;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return  name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String  getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath (String imagePath)
    {
        this.imagePath = imagePath;
    }    
}
