package com.mahony_ingersoll.CatSpring.RestControllers;

import com.mahony_ingersoll.CatSpring.Cats.CatData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.ArrayList;

@RestController
public class CatDataController {

    public List<CatData> storedCats = new ArrayList<CatData>();

    public CatDataController() {
        storedCats.add (new CatData(0, "Cookie", "Calico", "Calico", "s3://gpi-cats/Cookie.jpg"));
        storedCats.add (new CatData(1, "Pucky", "White", "White", "s3://gpi-cats/Pucky.jpg"));
        storedCats.add (new CatData(2, "Pixie", "Tabby", "Tabby", "s3://gpi-cats/Pixie.jpg"));
        storedCats.add (new CatData(3, "Morris", "Orange", "Orange", "s3://gpi-cats/Morris.jpg"));
        storedCats.add (new CatData(4, "Misty", "Gray", "Tuxedo", "s3://gpi-cats/Misty.jpg"));
        storedCats.add (new CatData(5, "Cassie", "Gray", "Big and Fluffy", "s3://gpi-cats/Cassie.jpg"));
    }

    // Endpoint to return all CatData.    
    @GetMapping("/Cats")
    public List<CatData> getAllCatData()
    {
        List<CatData> catDatas = new ArrayList<CatData>();
        for (CatData catData : storedCats)
        {
            catDatas.add (catData);
        }
        return catDatas;
    }

    // Endpoint just to return one Cat ID.
    @GetMapping("/Cat/{id}")
    public CatData getCatDataById(@PathVariable int id)
    {
        for (CatData catData : storedCats)
        {
            if (catData.getId() == id)
            {
                return catData;
            }
        }

        return null;
    }

    // Endpoint to add new Cats to the "database".
    @PostMapping("/Cats")
    public ResponseEntity<CatData> addCatData (@RequestBody CatData catData)
    {
        storedCats.add(new CatData(catData.getId(), catData.getName(), catData.getColor(), catData.getBreed(), catData.getImagePath()));
        return new ResponseEntity<>(catData, HttpStatus.CREATED);
    }
}
