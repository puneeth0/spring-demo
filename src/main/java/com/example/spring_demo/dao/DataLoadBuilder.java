package com.example.spring_demo.dao;

import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.model.HarryPotterCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoadBuilder {

    public List<FrequentlyUsedSpell> buildSpellsLoad() {
        return Arrays.asList(new FrequentlyUsedSpell( "Expelliarmus", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Avada Kedavra", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Stupefy", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Expecto Patronum", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Incendio", FrequentlyUsedSpell.Severity.LOW)
                , new FrequentlyUsedSpell( "Crucio", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Leviosa", FrequentlyUsedSpell.Severity.LOW)
                , new FrequentlyUsedSpell( "Protego", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Lumos", FrequentlyUsedSpell.Severity.LOW)
                , new FrequentlyUsedSpell( "Riddikulus", FrequentlyUsedSpell.Severity.LOW)
                , new FrequentlyUsedSpell( "Petrificus Totalus", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Sectumsempra", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Impedimenta", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Alohomora", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "time-turner", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Scourgify", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Fawkestears", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "phoenix Flame", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Legilimency", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "finite Incantatem", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Levicorpus", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Engorgio", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Serpensortia", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "HomenumRevelio", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Transfiguration", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Imperius", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Morsmordre", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Muffliato", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Bombarda", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "batbogey hex", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Animagus Transformation", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Incarcerous", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell("BanishmentCharm", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell("Nox", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell("MemorCharm hex", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Metamorphmagusability", FrequentlyUsedSpell.Severity.MID)
                , new FrequentlyUsedSpell( "Cruciatus Curse", FrequentlyUsedSpell.Severity.HIGH)
                , new FrequentlyUsedSpell( "Quick QuotesQ uill", FrequentlyUsedSpell.Severity.MID));
    }


    public List<HarryPotterCharacter> getHogwartsStudents() {

        // Creating FrequentlyUsedSpell objects
        FrequentlyUsedSpell expelliarmus = new FrequentlyUsedSpell(1, "Expelliarmus", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell avadaKedavra = new FrequentlyUsedSpell(2, "Avada Kedavra", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell stupefy = new FrequentlyUsedSpell(3, "Stupefy", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell expectoPatronum = new FrequentlyUsedSpell(4, "Expecto Patronum", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell incendio = new FrequentlyUsedSpell(5, "Incendio", FrequentlyUsedSpell.Severity.LOW);
        FrequentlyUsedSpell crucio = new FrequentlyUsedSpell(6, "Crucio", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell leviosa = new FrequentlyUsedSpell(7, "Leviosa", FrequentlyUsedSpell.Severity.LOW);
        FrequentlyUsedSpell protego = new FrequentlyUsedSpell(8, "Protego", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell lumos = new FrequentlyUsedSpell(9, "Lumos", FrequentlyUsedSpell.Severity.LOW);
        FrequentlyUsedSpell riddikulus = new FrequentlyUsedSpell(10, "Riddikulus", FrequentlyUsedSpell.Severity.LOW);
        FrequentlyUsedSpell petrificusTotalus = new FrequentlyUsedSpell(11, "Petrificus Totalus", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell sectumsempra = new FrequentlyUsedSpell(12, "Sectumsempra", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell impedimenta = new FrequentlyUsedSpell(13, "Impedimenta", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell alohomora = new FrequentlyUsedSpell(14, "Alohomora", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell timeTurner = new FrequentlyUsedSpell(14, "time-turner", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell scourgify = new FrequentlyUsedSpell(15, "Scourgify", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell fawkestears = new FrequentlyUsedSpell(16, "Fawkestears", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell phoenixFlame = new FrequentlyUsedSpell(17, "phoenix Flame", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell legilimency = new FrequentlyUsedSpell(18, "Legilimency", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell finiteIncantatem = new FrequentlyUsedSpell(19, "finite Incantatem", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell levicorpus = new FrequentlyUsedSpell(20, "Levicorpus", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell engorgio = new FrequentlyUsedSpell(21, "Engorgio", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell serpensortia = new FrequentlyUsedSpell(22, "Serpensortia", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell homenumRevelio = new FrequentlyUsedSpell(23, "HomenumRevelio", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell transfigurationspells = new FrequentlyUsedSpell(24, "Transfiguration spells", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell imperius = new FrequentlyUsedSpell(25, "Imperius", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell morsmordre = new FrequentlyUsedSpell(26, "Morsmordre", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell muffliato = new FrequentlyUsedSpell(27, "Muffliato", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell bombarda = new FrequentlyUsedSpell(28, "Bombarda", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell batbogeyhex = new FrequentlyUsedSpell(29, "batbogey hex", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell animagusTransformation = new FrequentlyUsedSpell(30, "Animagus Transformation", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell incarcerous = new FrequentlyUsedSpell(31, "Incarcerous", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell banishmentCharm = new FrequentlyUsedSpell(32, "BanishmentCharm", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell nox = new FrequentlyUsedSpell(33, "Nox", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell memorCharm = new FrequentlyUsedSpell(34, "MemorCharm hex", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell metamorphmagusability = new FrequentlyUsedSpell(35, "Metamorphmagusability", FrequentlyUsedSpell.Severity.MID);
        FrequentlyUsedSpell cruciatusCurse = new FrequentlyUsedSpell(36, "Cruciatus Curse", FrequentlyUsedSpell.Severity.HIGH);
        FrequentlyUsedSpell quickQuotesQuill = new FrequentlyUsedSpell(37, "Quick QuotesQ uill", FrequentlyUsedSpell.Severity.MID);

        return new ArrayList<>(Arrays.asList(
                new HarryPotterCharacter("Harry Potter", 17, "Gryffindor", "Student", "Half-blood", "Potter", "Yes", "Male", Arrays.asList(expelliarmus, expectoPatronum, stupefy, leviosa, protego)),
                new HarryPotterCharacter("Hermione Granger", 17, "Gryffindor", "Student", "Muggle-born", "Potter", "No", "Female", Arrays.asList(timeTurner, expectoPatronum, leviosa, impedimenta, timeTurner)),
                new HarryPotterCharacter("Ron Weasley", 17, "Gryffindor", "Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(riddikulus, expelliarmus, scourgify, leviosa, protego)),
                new HarryPotterCharacter("Albus Dumbledore", 115, "Gryffindor", "Headmaster", "Half-blood", "Potter", "No", "Male", Arrays.asList(fawkestears, expectoPatronum, phoenixFlame, legilimency, finiteIncantatem)),
                new HarryPotterCharacter("Severus Snape", 38, "Slytherin", "Professor (Potions/Defense)", "Half-blood", "Potter (Spy)", "No", "Male", Arrays.asList(sectumsempra, legilimency, expelliarmus, protego, avadaKedavra)),
                new HarryPotterCharacter("Draco Malfoy", 17, "Slytherin", "Student", "Pure-blood", "Voldemort", "Yes", "Male", Arrays.asList(serpensortia, expelliarmus, crucio, levicorpus, impedimenta)),
                new HarryPotterCharacter("Rubeus Hagrid", 63, "Gryffindor", "Care of Magical Creatures Professor", "Half-giant", "Potter", "No", "Male", Arrays.asList(alohomora, incendio, engorgio, expelliarmus, homenumRevelio)),
                new HarryPotterCharacter("Minerva McGonagall", 85, "Gryffindor", "Deputy Headmistress Professor", "Half-blood", "Potter", "No", "Female", Arrays.asList(transfigurationspells, petrificusTotalus, protego, levicorpus, animagusTransformation)),
                new HarryPotterCharacter("Lord Voldemort", 71, "Slytherin", "Former Student", "Half-blood", "Voldemort", "No", "Male", Arrays.asList(avadaKedavra, crucio, imperius, morsmordre, legilimency)),
                new HarryPotterCharacter("Sirius Black", 36, "Gryffindor", "Former Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(expectoPatronum, stupefy, expelliarmus, protego, petrificusTotalus)),
                new HarryPotterCharacter("Remus Lupin", 36, "Gryffindor", "Professor (Defense Against the Dark Arts)", "Half-blood", "Potter", "No", "Male", Arrays.asList(expectoPatronum, lumos, stupefy, riddikulus, expelliarmus)),
                new HarryPotterCharacter("Ginny Weasley", 16, "Gryffindor", "Student", "Pure-blood", "Potter", "Yes", "Female", Arrays.asList(batbogeyhex, expelliarmus, stupefy, sectumsempra, protego)),
                new HarryPotterCharacter("Fred Weasley", 20, "Gryffindor", "Former Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(expelliarmus, stupefy, protego, lumos, engorgio)),
                new HarryPotterCharacter("George Weasley", 20, "Gryffindor", "Former Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(expelliarmus, stupefy, protego, lumos, engorgio)),
                new HarryPotterCharacter("Luna Lovegood", 16, "Ravenclaw", "Student", "Pure-blood", "Potter", "No", "Female", Arrays.asList(expectoPatronum, leviosa, incendio, riddikulus, muffliato)),
                new HarryPotterCharacter("Neville Longbottom", 17, "Gryffindor", "Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(bombarda, expectoPatronum, petrificusTotalus, leviosa, incendio)),
                new HarryPotterCharacter("Bellatrix Lestrange", 47, "Slytherin", "Former Student", "Pure-blood", "Voldemort", "No", "Female", Arrays.asList(crucio, avadaKedavra, imperius, sectumsempra, morsmordre)),
                new HarryPotterCharacter("Lucius Malfoy", 45, "Slytherin", "Former Student", "Pure-blood", "Voldemort", "No", "Male", Arrays.asList(crucio, imperius, expelliarmus, petrificusTotalus, avadaKedavra)),
                new HarryPotterCharacter("Narcissa Malfoy", 41, "Slytherin", "Former Student", "Pure-blood", "Voldemort", "No", "Female", Arrays.asList(crucio, expelliarmus, petrificusTotalus, protego, leviosa)),
                new HarryPotterCharacter("Cho Chang", 17, "Ravenclaw", "Student", "Half-blood", "Potter", "Yes", "Female", Arrays.asList(expelliarmus, incendio, protego, stupefy, leviosa)),
                new HarryPotterCharacter("Cedric Diggory", 17, "Hufflepuff", "Student", "Pure-blood", "Potter", "Yes", "Male", Arrays.asList(expelliarmus, stupefy, protego, leviosa, incendio)),
                new HarryPotterCharacter("Dolores Umbridge", 40, "Slytherin", "Professor (Defense Against the Dark Arts)", "Half-blood", "Voldemort", "No", "Female", Arrays.asList(crucio, protego, expelliarmus, imperius, leviosa)),
                new HarryPotterCharacter("Dobby", 101, "None", "N/A", "House-elf", "Potter", "No", "Male", Arrays.asList(banishmentCharm, leviosa, muffliato, nox, expelliarmus)),
                new HarryPotterCharacter("Kreacher", 101, "None", "N/A", "House-elf", "Potter", "No", "Male", Arrays.asList(leviosa, protego, petrificusTotalus, expelliarmus, incarcerous)),
                new HarryPotterCharacter("Fleur Delacour", 21, "Gryffindor", "Visiting Student", "Half-blood (Veela)", "Potter", "No", "Female", Arrays.asList(incendio, leviosa, expelliarmus, protego, stupefy)),
                new HarryPotterCharacter("Viktor Krum", 21, "Durmstrang", "Visiting Student", "Pure-blood", "Neutral", "Yes", "Male", Arrays.asList(expelliarmus, stupefy, protego, leviosa, incendio)),
                new HarryPotterCharacter("Gilderoy Lockhart", 46, "Ravenclaw", "Professor (Defense Against the Dark Arts)", "Half-blood", "Neutral", "No", "Male", Arrays.asList(memorCharm, expelliarmus, leviosa, petrificusTotalus, alohomora)),
                new HarryPotterCharacter("Horace Slughorn", 70, "Slytherin", "Potions Professor", "Pure-blood", "Potter", "No", "Male", Arrays.asList(leviosa, expectoPatronum, incendio, impedimenta, lumos)),
                new HarryPotterCharacter("Peter Pettigrew", 38, "Gryffindor", "Former Student", "Half-blood", "Voldemort", "No", "Male", Arrays.asList(avadaKedavra, crucio, imperius, animagusTransformation, expelliarmus)),
                new HarryPotterCharacter("Moaning Myrtle", 101, "Ravenclaw", "Ghost", "Muggle-born", "Neutral", "No", "Female", null),
                new HarryPotterCharacter("Argus Filch", 60, "None", "Caretaker", "Squib", "Neutral", "No", "Male", null),
                new HarryPotterCharacter("Mad-Eye Moody", 25, "None", "Substitute Defense Against the Dark Arts Professor", "Pure-blood", "Potter", "No", "Male", Arrays.asList(imperius, crucio, morsmordre, imperius, expelliarmus)),
                new HarryPotterCharacter("Nymphadora Tonks", 45, "Gryffindor", "Auror", "Half-blood", "Potter", "No", "Female", Arrays.asList(metamorphmagusability, expelliarmus, stupefy, protego, lumos)),
                new HarryPotterCharacter("Arthur Weasley", 45, "Gryffindor", "Former Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(protego, incendio)),
                new HarryPotterCharacter("Molly Weasley", 22, "Gryffindor", "Former Student", "Pure-blood", "Potter", "No", "Female", Arrays.asList(protego, stupefy, leviosa, incendio, avadaKedavra)),
                new HarryPotterCharacter("Percy Weasley", 17, "Gryffindor", "Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(expelliarmus, stupefy, protego, leviosa, impedimenta)),
                new HarryPotterCharacter("Pansy Parkinson", 17, "Slytherin", "Student", "Pure-blood", "Voldemort", "No", "Female", Arrays.asList(cruciatusCurse, leviosa, expelliarmus, stupefy, protego)),
                new HarryPotterCharacter("Dean Thomas", 50, "Gryffindor", "Student", "Muggle-born", "Potter", "No", "Male", Arrays.asList(expelliarmus, leviosa, protego, incendio, stupefy)),
                new HarryPotterCharacter("Seamus Finnigan", 35, "Gryffindor", "Student", "Half-blood", "Potter", "No", "Female", Arrays.asList(incendio, expelliarmus, leviosa, stupefy, protego)),
                new HarryPotterCharacter("Parvati Patil", 41, "Gryffindor", "Student", "Pure-blood", "Potter", "No", "Female", Arrays.asList(expelliarmus, leviosa, protego, incendio, stupefy)),
                new HarryPotterCharacter("Padma Patil", 65, "Gryffindor", "Student", "Pure-blood", "Potter", "No", "Male", Arrays.asList(expelliarmus, leviosa, protego, incendio, stupefy)),
                new HarryPotterCharacter("Kingsley Shacklebolt", 101, "Gryffindor", "Auror", "Half-blood", "Potter", "No", "Male", Arrays.asList(expelliarmus, stupefy, protego, imperius, expectoPatronum)),
                new HarryPotterCharacter("Barty Crouch Jr.", 95, "Slytherin", "None", "Pure-blood", "Voldemort", "No", "Female", Arrays.asList(crucio, imperius, avadaKedavra, morsmordre, expelliarmus)),
                new HarryPotterCharacter("Rita Skeeter", 100, "Ravenclaw", "Journalist", "Half-blood", "Neutral", "No", "Male", Arrays.asList(quickQuotesQuill, petrificusTotalus, impedimenta, expelliarmus)),
                new HarryPotterCharacter("Cornelius Fudge", 12, "None", "Minister of Magic", "Half-blood", "Neutral", "No", "Male", null),
                new HarryPotterCharacter("Griphook", 50, "None", "Goblin", "Goblin", "Neutral", "No", "Male", null),
                new HarryPotterCharacter("Ollivander", 101, "None", "Wandmaker", "Pure-blood", "Neutral", "No", "Male", null),
                new HarryPotterCharacter("Bathilda Bagshot", 101, "None", "Historian", "Pure-blood", "Neutral", "No", "Female", null),
                new HarryPotterCharacter("Grawp", 101, "None", "N/A", "Giant", "Neutral", "No", "Female", null),
                new HarryPotterCharacter("Fenrir Greyback", 101, "None", "Werewolf", "Werewolf", "Voldemort", "No", "Male", null)
        ));
    }
}