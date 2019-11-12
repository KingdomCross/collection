class Scramble {
    int Score(char s){
        int point = 0;
        String convert = String.valueOf(s);
        switch (convert) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "l":
            case "n":
            case "s":
            case "t":
            case "r":
                point = 1;
                break;
            case "d":
            case "g":
                point = 2;
                break;
            case "b":
            case "c":
            case "m":
            case "p":
                point = 3;
                break;
            case "f":
            case "h":
            case "v":
            case "w":
            case "y":
                point = 4;
                break;
            case "k":
                point = 5;
                break;
            case "j":
            case "x":
                point = 8;
                break;
            case "q":
            case "z":
                point = 10;
                break;
        }
        return point;
    }
}
