package com.candy.processor;

import com.candy.entity.Command;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AsagaoProcessorTest {


    @Autowired
    private AsagaoProcessor asagaoProcessor;

    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCommand() {
        //  le scénario où quantite est égal à 60

        int quantite = 25;
        Command result = asagaoProcessor.getCommand(quantite);
        assertEquals(25, result.getQuantite());

        // Testez d'autres scénarios avec différentes valeurs de quantite et vérifiez les résultats attendus
        // ...

    }
}