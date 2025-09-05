package com.mahony_ingersoll.CatSpring.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;



@Controller
public class ImageController {
    
    @Autowired
    ResourceLoader resourceLoader;



    @GetMapping("/ImageCat")
    public ResponseEntity<Resource> getImage(@RequestParam("catName") Optional<String> catName) throws Exception {

        String realCatName = catName.orElse("");

        if (realCatName.equalsIgnoreCase("Mimzy"))
        {
            
            // Path path = Paths.get("./Mimzy_On_Tree.JPEG");

            Resource resource = resourceLoader.getResource("classpath:static/images/Mimzy_On_Tree.JPEG");
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(resource);
        }
        else if (realCatName.equalsIgnoreCase("Cookie"))
        {
            // Path path = Paths.get("./Cookie.JPEG");

            // Resource resource = new UrlResource(path.toUri());
            // Path path = Paths.get("./Mimzy_On_Tree.JPEG");

            Resource resource = resourceLoader.getResource("classpath:static/images/Cookie.JPEG");
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(resource);
        }
        
        // Path path = Paths.get("./Mimzy_And_Cookie.JPEG");

        // Resource resource = new UrlResource(path.toUri());
            // Path path = Paths.get("./Mimzy_On_Tree.JPEG");

        Resource resource = resourceLoader.getResource("classpath:static/images/Mimzy_And_Cookie.JPEG");
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(resource);    
    }
}
