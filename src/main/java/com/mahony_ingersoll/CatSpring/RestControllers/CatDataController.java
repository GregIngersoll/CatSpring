package com.mahony_ingersoll.CatSpring.RestControllers;

import com.mahony_ingersoll.CatSpring.Cats.CatData;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
