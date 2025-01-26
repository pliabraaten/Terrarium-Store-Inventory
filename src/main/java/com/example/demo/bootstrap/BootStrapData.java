<<<<<<< HEAD
package com.example.demo.bootstrap;

import com.example.demo.domain.Material;
import com.example.demo.domain.Plant;
import com.example.demo.domain.Product;
import com.example.demo.repositories.MaterialRepository;
import com.example.demo.repositories.PlantRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final PlantRepository plantRepository;
    private final MaterialRepository materialRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, PlantRepository plantRepository, MaterialRepository materialRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.plantRepository=plantRepository;
        this.materialRepository = materialRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Prepopulate inventory if none
        if (plantRepository.count() == 0 && materialRepository.count() == 0 && productRepository.count() == 0) {
            // Create Plant object moss
            Plant moss = new Plant();
            // Set values
            moss.setCompanyName("Terrarium Tribe");
            moss.setName("Cushion Moss");
            moss.setInv(30);
            moss.setMaxInv(50);
            moss.setMinInv(1);
            moss.setPrice(5.0);
            moss.setId(100L);

            plantRepository.save(moss);  // Save the moss object to the repo

            // Create Plant object Fittonia
            Plant fittonia = new Plant();
            // Set values
            fittonia.setCompanyName("Plants, Inc");
            fittonia.setName("Fittonia");
            fittonia.setInv(15);
            fittonia.setMaxInv(50);
            fittonia.setMinInv(1);
            fittonia.setPrice(6);
            fittonia.setId(101L);

            plantRepository.save(fittonia);

            // Create Plant object Syngonium
            Plant syngonium = new Plant();
            // Set values
            syngonium.setCompanyName("Extra Plants");
            syngonium.setName("Syngonium");
            syngonium.setInv(10);
            syngonium.setMaxInv(50);
            syngonium.setMinInv(1);
            syngonium.setPrice(12.0);
            syngonium.setId(102L);

            plantRepository.save(syngonium);

            // Create Plant object Pilea
            Plant pilea = new Plant();
            // Set values
            pilea.setCompanyName("Pilea's Place");
            pilea.setName("Pilea");
            pilea.setInv(20);
            pilea.setMaxInv(50);
            pilea.setMinInv(1);
            pilea.setPrice(8.0);
            pilea.setId(103L);

            plantRepository.save(pilea);

            // Create Plant object Tillandsia
            Plant tillandsia = new Plant();
            // Set values
            tillandsia.setCompanyName("Air Plants");
            tillandsia.setName("Tillandsia");
            tillandsia.setInv(10);
            tillandsia.setMaxInv(50);
            tillandsia.setMinInv(1);
            tillandsia.setPrice(5.0);
            tillandsia.setId(104L);

            plantRepository.save(tillandsia);


            // Create Material object substrate
            Material substrate = new Material();
            // Set values
            substrate.setName("Substrate");
            substrate.setInv(30);
            substrate.setMaxInv(50);
            substrate.setMinInv(1);
            substrate.setPrice(2.0);
            substrate.setId(200L);

            materialRepository.save(substrate);  // Save the substrate object to the repo

            // Create Material object charcoal
            Material charcoal = new Material();
            // Set values
            charcoal.setName("Activated Charcoal");
            charcoal.setInv(35);
            charcoal.setMaxInv(50);
            charcoal.setMinInv(1);
            charcoal.setPrice(3.0);
            charcoal.setId(201L);

            materialRepository.save(charcoal);

            // Create Material object Spiderwood
            Material spiderwood = new Material();
            // Set values
            spiderwood.setName("Spiderwood");
            spiderwood.setInv(10);
            spiderwood.setMaxInv(50);
            spiderwood.setMinInv(1);
            spiderwood.setPrice(9.0);
            spiderwood.setId(202L);

            materialRepository.save(spiderwood);

            // Create Material object small_container
            Material sContainer = new Material();
            // Set values
            sContainer.setName("Small Container");
            sContainer.setInv(12);
            sContainer.setMaxInv(50);
            sContainer.setMinInv(1);
            sContainer.setPrice(15.0);
            sContainer.setId(203L);

            materialRepository.save(sContainer);

            // Create Material object large_Container
            Material lContainer = new Material();
            // Set values
            lContainer.setName("Large Container");
            lContainer.setInv(5);
            lContainer.setMaxInv(50);
            lContainer.setMinInv(1);
            lContainer.setPrice(30.0);
            lContainer.setId(204L);

            materialRepository.save(lContainer);


            // Create Product object
            Product starter_kit = new Product(1001,"Starter Kit", 37.99, 25);
            productRepository.save(starter_kit);

            Product advanced_kit = new Product(1002,"Advanced Kit", 64.99, 15);
            productRepository.save(advanced_kit);

            Product sTerrarium = new Product(1003,"Small Terrarium", 43.00, 30);
            productRepository.save(sTerrarium);

            Product lTerrarium = new Product(1004,"Large Terrarium", 79.99, 12);
            productRepository.save(lTerrarium);

            Product openT = new Product(1005,"Open Terrarium", 29.99, 10);
            productRepository.save(openT);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
=======
package com.example.demo.bootstrap;

import com.example.demo.domain.Material;
import com.example.demo.domain.Plant;
import com.example.demo.domain.Product;
import com.example.demo.repositories.MaterialRepository;
import com.example.demo.repositories.PlantRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final PlantRepository plantRepository;
    private final MaterialRepository materialRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, PlantRepository plantRepository, MaterialRepository materialRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.plantRepository=plantRepository;
        this.materialRepository = materialRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Prepopulate inventory if none
        if (plantRepository.count() == 0 && materialRepository.count() == 0 && productRepository.count() == 0) {
            // Create Plant object moss
            Plant moss = new Plant();
            // Set values
            moss.setCompanyName("Terrarium Tribe");
            moss.setName("Cushion Moss");
            moss.setInv(30);
            moss.setMaxInv(50);
            moss.setMinInv(1);
            moss.setPrice(5.0);
            moss.setId(100L);

            plantRepository.save(moss);  // Save the moss object to the repo

            // Create Plant object Fittonia
            Plant fittonia = new Plant();
            // Set values
            fittonia.setCompanyName("Plants, Inc");
            fittonia.setName("Fittonia");
            fittonia.setInv(15);
            fittonia.setMaxInv(50);
            fittonia.setMinInv(1);
            fittonia.setPrice(6);
            fittonia.setId(101L);

            plantRepository.save(fittonia);

            // Create Plant object Syngonium
            Plant syngonium = new Plant();
            // Set values
            syngonium.setCompanyName("Extra Plants");
            syngonium.setName("Syngonium");
            syngonium.setInv(10);
            syngonium.setMaxInv(50);
            syngonium.setMinInv(1);
            syngonium.setPrice(12.0);
            syngonium.setId(102L);

            plantRepository.save(syngonium);

            // Create Plant object Pilea
            Plant pilea = new Plant();
            // Set values
            pilea.setCompanyName("Pilea's Place");
            pilea.setName("Pilea");
            pilea.setInv(20);
            pilea.setMaxInv(50);
            pilea.setMinInv(1);
            pilea.setPrice(8.0);
            pilea.setId(103L);

            plantRepository.save(pilea);

            // Create Plant object Tillandsia
            Plant tillandsia = new Plant();
            // Set values
            tillandsia.setCompanyName("Air Plants");
            tillandsia.setName("Tillandsia");
            tillandsia.setInv(10);
            tillandsia.setMaxInv(50);
            tillandsia.setMinInv(1);
            tillandsia.setPrice(5.0);
            tillandsia.setId(104L);

            plantRepository.save(tillandsia);


            // Create Material object substrate
            Material substrate = new Material();
            // Set values
            substrate.setName("Substrate");
            substrate.setInv(30);
            substrate.setMaxInv(50);
            substrate.setMinInv(1);
            substrate.setPrice(2.0);
            substrate.setId(200L);

            materialRepository.save(substrate);  // Save the substrate object to the repo

            // Create Material object charcoal
            Material charcoal = new Material();
            // Set values
            charcoal.setName("Activated Charcoal");
            charcoal.setInv(35);
            charcoal.setMaxInv(50);
            charcoal.setMinInv(1);
            charcoal.setPrice(3.0);
            charcoal.setId(201L);

            materialRepository.save(charcoal);

            // Create Material object Spiderwood
            Material spiderwood = new Material();
            // Set values
            spiderwood.setName("Spiderwood");
            spiderwood.setInv(10);
            spiderwood.setMaxInv(50);
            spiderwood.setMinInv(1);
            spiderwood.setPrice(9.0);
            spiderwood.setId(202L);

            materialRepository.save(spiderwood);

            // Create Material object small_container
            Material sContainer = new Material();
            // Set values
            sContainer.setName("Small Container");
            sContainer.setInv(12);
            sContainer.setMaxInv(50);
            sContainer.setMinInv(1);
            sContainer.setPrice(15.0);
            sContainer.setId(203L);

            materialRepository.save(sContainer);

            // Create Material object large_Container
            Material lContainer = new Material();
            // Set values
            lContainer.setName("Large Container");
            lContainer.setInv(5);
            lContainer.setMaxInv(50);
            lContainer.setMinInv(1);
            lContainer.setPrice(30.0);
            lContainer.setId(204L);

            materialRepository.save(lContainer);


            // Create Product object
            Product starter_kit = new Product(1001,"Starter Kit", 37.99, 25);
            productRepository.save(starter_kit);

            Product advanced_kit = new Product(1002,"Advanced Kit", 64.99, 15);
            productRepository.save(advanced_kit);

            Product sTerrarium = new Product(1003,"Small Terrarium", 43.00, 30);
            productRepository.save(sTerrarium);

            Product lTerrarium = new Product(1004,"Large Terrarium", 79.99, 12);
            productRepository.save(lTerrarium);

            Product openT = new Product(1005,"Open Terrarium", 29.99, 10);
            productRepository.save(openT);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
