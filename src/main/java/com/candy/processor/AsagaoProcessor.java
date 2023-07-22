package com.candy.processor;

import com.candy.entity.CandyBox;
import com.candy.entity.Color;
import com.candy.entity.Command;
import com.candy.enums.ColorEnum;
import com.candy.repository.ColorRepo;
import com.candy.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Component
public class AsagaoProcessor {

    @Autowired
    private ColorService colorService;

    public Command getCommand(int quantite){
        Command command = new Command();

        int currentHour = getCurrentHour();

        if(currentHour >= 6 && currentHour <= 12){
            // Generer les bonbons aleatoirement
            List<Color> colorBonbon = generateRandomColors(quantite);

            // diviser les bonbon en candyBoxes
           List<CandyBox> candyBoxes = nombreCandyBoxes(colorBonbon);

            // definir la command
           command.setCandyBox(candyBoxes);
        } else {
         System.out.println("Cette commande n'est pas possible entre 6h et midi, desolé !!! ");
        }
        return command;

    }

    private List<CandyBox> nombreCandyBoxes(List<Color> colorBonbon) {
        List<CandyBox> nombreBox = new ArrayList<>();
        CandyBox currentBox = new CandyBox();
        for (Color color : colorBonbon){
            currentBox.getColors().add(color);
            if(currentBox.getColors().size() == 10){
                nombreBox.add(currentBox);

                currentBox = new CandyBox();
            } else if(!currentBox.getColors().isEmpty()){
                nombreBox.add(currentBox);
            }
        }

        return nombreBox;

    }

    private List<Color> generateRandomColors(int quantite) {
        List<Color> colorList = new ArrayList<Color>();
        List<Color> colors = colorService.getColor();

        for (int i = 0; i < quantite; i++){
            Random random = new Random();
            Color colorBbb  =  colors.get(random.nextInt(colors.size()));
            colorList.add(colorBbb);
        }

        return colorList;

    }

    private int getCurrentHour() {
        Random hourRandom = new Random();
        return hourRandom.nextInt(24);
    }


}
