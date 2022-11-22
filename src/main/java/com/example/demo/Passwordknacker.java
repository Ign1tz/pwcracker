package com.example.demo;

public class Passwordknacker {
    public static char[] arr = new char[16];
    public static void knacker(){
        arr[0] = 'A';
        arr[12] = 'Z';
        arr[14] = 'u';
        arr[15]  ='p';
        for(int second = 1; second <= 24; second++){
            arr[1] = (char) (96 + second);
            for(int third = 1; third <= 24; third++){
                arr[2] = (char) (64 + third);
                for(int forth = 1; forth <= 6; forth++){
                    switch (forth){
                        case 1:
                            arr[3] = '!';
                            System.out.println(arr);
                        case 2:
                            arr[3] = '+';
                            System.out.println(arr);
                        case 3:
                            arr[3] = '-';
                            System.out.println(arr);
                        case 4:
                            arr[3] = '<';
                            System.out.println(arr);
                        case 5:
                            arr[3] = '>';
                            System.out.println(arr);
                        case 6:
                            arr[3] = '?';
                            System.out.println(arr);
                    }
                    for(int fith = 1; fith <= 68; fith++){
                        switch (fith){
                            case 1:
                                arr[4] = '1';
                                break;
                            case 2:
                                arr[4] = '2';
                                break;
                            case 3:
                                arr[4] = '3';
                                break;
                            case 4:
                                arr[4] = '4';
                                break;
                            case 5:
                                arr[4] = '5';
                                break;
                            case 6:
                                arr[4] = '6';
                            case 7:
                                arr[4] = '7';
                            case 8:
                                arr[4] = '8';
                            case 9:
                                arr[4] = '9';
                            case 10:
                                arr[4] = '0';
                            case 11:
                                arr[4] = 'a';
                            case 12:
                                arr[4] = 'b';
                            case 13:
                                arr[4] = 'c';
                            case 14:
                                arr[4] = 'd';
                            case 15:
                                arr[4] = 'e';
                            case 16:
                                arr[4] = 'f';
                            case 17:
                                arr[4] = 'g';
                            case 18:
                                arr[4] = 'h';
                            case 19:
                                arr[4] = 'i';
                            case 20:
                                arr[4] = 'j';
                            case 21:
                                arr[4] = 'k';
                            case 22:
                                arr[4] = 'l';
                            case 23:
                                arr[4] = 'm';
                            case 24:
                                arr[4] = 'n';
                            case 25:
                                arr[4] = 'o';
                            case 26:
                                arr[4] = 'p';
                            case 27:
                                arr[4] = 'q';
                            case 28:
                                arr[4] = 'r';
                            case 29:
                                arr[4] = 's';
                            case 30:
                                arr[4] = 't';
                            case 31:
                                arr[4] = 'u';
                            case 32:
                                arr[4] = 'v';
                            case 33:
                                arr[4] = 'w';
                            case 34:
                                arr[4] = 'x';
                            case 35:
                                arr[4] = 'y';
                            case 36:
                                arr[4] = 'z';
                            case 37:
                                arr[4] = 'A';
                            case 38:
                                arr[4] = 'B';
                            case 39:
                                arr[4] = 'C';
                            case 40:
                                arr[4] = 'D';
                            case 41:
                                arr[4] = 'E';
                            case 42:
                                arr[4] = 'F';
                            case 43:
                                arr[4] = 'G';
                            case 44:
                                arr[4] = 'H';
                            case 45:
                                arr[4] = 'I';
                            case 46:
                                arr[4] = 'J';
                            case 47:
                                arr[4] = 'K';
                            case 48:
                                arr[4] = 'L';
                            case 49:
                                arr[4] = 'M';
                            case 50:
                                arr[4] = 'N';
                            case 51:
                                arr[4] = 'O';
                            case 52:
                                arr[4] = 'P';
                            case 53:
                                arr[4] = 'Q';
                            case 54:
                                arr[4] = 'R';
                            case 55:
                                arr[4] = 'S';
                            case 56:
                                arr[4] = 'T';
                            case 57:
                                arr[4] = 'U';
                            case 58:
                                arr[4] = 'V';
                            case 59:
                                arr[4] = 'W';
                            case 60:
                                arr[4] = 'X';
                            case 61:
                                arr[4] = 'Y';
                            case 62:
                                arr[4] = 'Z';
                            case 63:
                                arr[4] = '!';
                            case 64:
                                arr[4] = '?';
                            case 65:
                                arr[4] = '<';
                            case 66:
                                arr[4] = '>';
                            case 67:
                                arr[4] = '+';
                            case 68:
                                arr[4] = '-';
                        }
                        for(int sixth = 1; sixth <= 68; sixth++){
                            switch (sixth){
                                case 1:
                                    arr[5] = '1';
                                case 2:
                                    arr[5] = '2';
                                case 3:
                                    arr[5] = '3';
                                case 4:
                                    arr[5] = '4';
                                case 5:
                                    arr[5] = '5';
                                case 6:
                                    arr[5] = '6';
                                case 7:
                                    arr[5] = '7';
                                case 8:
                                    arr[5] = '8';
                                case 9:
                                    arr[5] = '9';
                                case 10:
                                    arr[5] = '0';
                                case 11:
                                    arr[5] = 'a';
                                case 12:
                                    arr[5] = 'b';
                                case 13:
                                    arr[5] = 'c';
                                case 14:
                                    arr[5] = 'd';
                                case 15:
                                    arr[5] = 'e';
                                case 16:
                                    arr[5] = 'f';
                                case 17:
                                    arr[5] = 'g';
                                case 18:
                                    arr[5] = 'h';
                                case 19:
                                    arr[5] = 'i';
                                case 20:
                                    arr[5] = 'j';
                                case 21:
                                    arr[5] = 'k';
                                case 22:
                                    arr[5] = 'l';
                                case 23:
                                    arr[5] = 'm';
                                case 24:
                                    arr[5] = 'n';
                                case 25:
                                    arr[5] = 'o';
                                case 26:
                                    arr[5] = 'p';
                                case 27:
                                    arr[5] = 'q';
                                case 28:
                                    arr[5] = 'r';
                                case 29:
                                    arr[5] = 's';
                                case 30:
                                    arr[5] = 't';
                                case 31:
                                    arr[5] = 'u';
                                case 32:
                                    arr[5] = 'v';
                                case 33:
                                    arr[5] = 'w';
                                case 34:
                                    arr[5] = 'x';
                                case 35:
                                    arr[5] = 'y';
                                case 36:
                                    arr[5] = 'z';
                                case 37:
                                    arr[5] = 'A';
                                case 38:
                                    arr[5] = 'B';
                                case 39:
                                    arr[5] = 'C';
                                case 40:
                                    arr[5] = 'D';
                                case 41:
                                    arr[5] = 'E';
                                case 42:
                                    arr[5] = 'F';
                                case 43:
                                    arr[5] = 'G';
                                case 44:
                                    arr[5] = 'H';
                                case 45:
                                    arr[5] = 'I';
                                case 46:
                                    arr[5] = 'J';
                                case 47:
                                    arr[5] = 'K';
                                case 48:
                                    arr[5] = 'L';
                                case 49:
                                    arr[5] = 'M';
                                case 50:
                                    arr[5] = 'N';
                                case 51:
                                    arr[5] = 'O';
                                case 52:
                                    arr[5] = 'P';
                                case 53:
                                    arr[5] = 'Q';
                                case 54:
                                    arr[5] = 'R';
                                case 55:
                                    arr[5] = 'S';
                                case 56:
                                    arr[5] = 'T';
                                case 57:
                                    arr[5] = 'U';
                                case 58:
                                    arr[5] = 'V';
                                case 59:
                                    arr[5] = 'W';
                                case 60:
                                    arr[5] = 'X';
                                case 61:
                                    arr[5] = 'Y';
                                case 62:
                                    arr[5] = 'Z';
                                case 63:
                                    arr[5] = '!';
                                case 64:
                                    arr[5] = '?';
                                case 65:
                                    arr[5] = '<';
                                case 66:
                                    arr[5] = '>';
                                case 67:
                                    arr[5] = '+';
                                case 68:
                                    arr[5] = '-';
                            }
                            for(int seventh = 1; seventh <= 68; seventh++){
                                switch (seventh){
                                    case 1:
                                        arr[6] = '1';
                                    case 2:
                                        arr[6] = '2';
                                    case 3:
                                        arr[6] = '3';
                                    case 4:
                                        arr[6] = '4';
                                    case 5:
                                        arr[6] = '5';
                                    case 6:
                                        arr[6] = '6';
                                    case 7:
                                        arr[6] = '7';
                                    case 8:
                                        arr[6] = '8';
                                    case 9:
                                        arr[6] = '9';
                                    case 10:
                                        arr[6] = '0';
                                    case 11:
                                        arr[6] = 'a';
                                    case 12:
                                        arr[6] = 'b';
                                    case 13:
                                        arr[6] = 'c';
                                    case 14:
                                        arr[6] = 'd';
                                    case 15:
                                        arr[6] = 'e';
                                    case 16:
                                        arr[6] = 'f';
                                    case 17:
                                        arr[6] = 'g';
                                    case 18:
                                        arr[6] = 'h';
                                    case 19:
                                        arr[6] = 'i';
                                    case 20:
                                        arr[6] = 'j';
                                    case 21:
                                        arr[6] = 'k';
                                    case 22:
                                        arr[6] = 'l';
                                    case 23:
                                        arr[6] = 'm';
                                    case 24:
                                        arr[6] = 'n';
                                    case 25:
                                        arr[6] = 'o';
                                    case 26:
                                        arr[6] = 'p';
                                    case 27:
                                        arr[6] = 'q';
                                    case 28:
                                        arr[6] = 'r';
                                    case 29:
                                        arr[6] = 's';
                                    case 30:
                                        arr[6] = 't';
                                    case 31:
                                        arr[6] = 'u';
                                    case 32:
                                        arr[6] = 'v';
                                    case 33:
                                        arr[6] = 'w';
                                    case 34:
                                        arr[6] = 'x';
                                    case 35:
                                        arr[6] = 'y';
                                    case 36:
                                        arr[6] = 'z';
                                    case 37:
                                        arr[6] = 'A';
                                    case 38:
                                        arr[6] = 'B';
                                    case 39:
                                        arr[6] = 'C';
                                    case 40:
                                        arr[6] = 'D';
                                    case 41:
                                        arr[6] = 'E';
                                    case 42:
                                        arr[6] = 'F';
                                    case 43:
                                        arr[6] = 'G';
                                    case 44:
                                        arr[6] = 'H';
                                    case 45:
                                        arr[6] = 'I';
                                    case 46:
                                        arr[6] = 'J';
                                    case 47:
                                        arr[6] = 'K';
                                    case 48:
                                        arr[6] = 'L';
                                    case 49:
                                        arr[6] = 'M';
                                    case 50:
                                        arr[6] = 'N';
                                    case 51:
                                        arr[6] = 'O';
                                    case 52:
                                        arr[6] = 'P';
                                    case 53:
                                        arr[6] = 'Q';
                                    case 54:
                                        arr[6] = 'R';
                                    case 55:
                                        arr[6] = 'S';
                                    case 56:
                                        arr[6] = 'T';
                                    case 57:
                                        arr[6] = 'U';
                                    case 58:
                                        arr[6] = 'V';
                                    case 59:
                                        arr[6] = 'W';
                                    case 60:
                                        arr[6] = 'X';
                                    case 61:
                                        arr[6] = 'Y';
                                    case 62:
                                        arr[6] = 'Z';
                                    case 63:
                                        arr[6] = '!';
                                    case 64:
                                        arr[6] = '?';
                                    case 65:
                                        arr[6] = '<';
                                    case 66:
                                        arr[6] = '>';
                                    case 67:
                                        arr[6] = '+';
                                    case 68:
                                        arr[6] = '-';
                                }
                                for(int eight = 1; eight <= 68; eight++){
                                    switch (eight){
                                        case 1:
                                            arr[7] = '1';
                                        case 2:
                                            arr[7] = '2';
                                        case 3:
                                            arr[7] = '3';
                                        case 4:
                                            arr[7] = '4';
                                        case 5:
                                            arr[7] = '5';
                                        case 6:
                                            arr[7] = '6';
                                        case 7:
                                            arr[7] = '7';
                                        case 8:
                                            arr[7] = '8';
                                        case 9:
                                            arr[7] = '9';
                                        case 10:
                                            arr[7] = '0';
                                        case 11:
                                            arr[7] = 'a';
                                        case 12:
                                            arr[7] = 'b';
                                        case 13:
                                            arr[7] = 'c';
                                        case 14:
                                            arr[7] = 'd';
                                        case 15:
                                            arr[7] = 'e';
                                        case 16:
                                            arr[7] = 'f';
                                        case 17:
                                            arr[7] = 'g';
                                        case 18:
                                            arr[7] = 'h';
                                        case 19:
                                            arr[7] = 'i';
                                        case 20:
                                            arr[7] = 'j';
                                        case 21:
                                            arr[7] = 'k';
                                        case 22:
                                            arr[7] = 'l';
                                        case 23:
                                            arr[7] = 'm';
                                        case 24:
                                            arr[7] = 'n';
                                        case 25:
                                            arr[7] = 'o';
                                        case 26:
                                            arr[7] = 'p';
                                        case 27:
                                            arr[7] = 'q';
                                        case 28:
                                            arr[7] = 'r';
                                        case 29:
                                            arr[7] = 's';
                                        case 30:
                                            arr[7] = 't';
                                        case 31:
                                            arr[7] = 'u';
                                        case 32:
                                            arr[7] = 'v';
                                        case 33:
                                            arr[7] = 'w';
                                        case 34:
                                            arr[7] = 'x';
                                        case 35:
                                            arr[7] = 'y';
                                        case 36:
                                            arr[7] = 'z';
                                        case 37:
                                            arr[7] = 'A';
                                        case 38:
                                            arr[7] = 'B';
                                        case 39:
                                            arr[7] = 'C';
                                        case 40:
                                            arr[7] = 'D';
                                        case 41:
                                            arr[7] = 'E';
                                        case 42:
                                            arr[7] = 'F';
                                        case 43:
                                            arr[7] = 'G';
                                        case 44:
                                            arr[7] = 'H';
                                        case 45:
                                            arr[7] = 'I';
                                        case 46:
                                            arr[7] = 'J';
                                        case 47:
                                            arr[7] = 'K';
                                        case 48:
                                            arr[7] = 'L';
                                        case 49:
                                            arr[7] = 'M';
                                        case 50:
                                            arr[7] = 'N';
                                        case 51:
                                            arr[7] = 'O';
                                        case 52:
                                            arr[7] = 'P';
                                        case 53:
                                            arr[7] = 'Q';
                                        case 54:
                                            arr[7] = 'R';
                                        case 55:
                                            arr[7] = 'S';
                                        case 56:
                                            arr[7] = 'T';
                                        case 57:
                                            arr[7] = 'U';
                                        case 58:
                                            arr[7] = 'V';
                                        case 59:
                                            arr[7] = 'W';
                                        case 60:
                                            arr[7] = 'X';
                                        case 61:
                                            arr[7] = 'Y';
                                        case 62:
                                            arr[7] = 'Z';
                                        case 63:
                                            arr[7] = '!';
                                        case 64:
                                            arr[7] = '?';
                                        case 65:
                                            arr[7] = '<';
                                        case 66:
                                            arr[7] = '>';
                                        case 67:
                                            arr[7] = '+';
                                        case 68:
                                            arr[7] = '-';
                                    }
                                    for(int nineth = 1; nineth <= 68; nineth++){
                                        switch (nineth){
                                        case 1:
                                            arr[8] = '1';
                                        case 2:
                                            arr[8] = '2';
                                        case 3:
                                            arr[8] = '3';
                                        case 4:
                                            arr[8] = '4';
                                        case 5:
                                            arr[8] = '5';
                                        case 6:
                                            arr[8] = '6';
                                        case 7:
                                            arr[8] = '7';
                                        case 8:
                                            arr[8] = '8';
                                        case 9:
                                            arr[8] = '9';
                                        case 10:
                                            arr[8] = '0';
                                        case 11:
                                            arr[8] = 'a';
                                        case 12:
                                            arr[8] = 'b';
                                        case 13:
                                            arr[8] = 'c';
                                        case 14:
                                            arr[8] = 'd';
                                        case 15:
                                            arr[8] = 'e';
                                        case 16:
                                            arr[8] = 'f';
                                        case 17:
                                            arr[8] = 'g';
                                        case 18:
                                            arr[8] = 'h';
                                        case 19:
                                            arr[8] = 'i';
                                        case 20:
                                            arr[8] = 'j';
                                        case 21:
                                            arr[8] = 'k';
                                        case 22:
                                            arr[8] = 'l';
                                        case 23:
                                            arr[8] = 'm';
                                        case 24:
                                            arr[8] = 'n';
                                        case 25:
                                            arr[8] = 'o';
                                        case 26:
                                            arr[8] = 'p';
                                        case 27:
                                            arr[8] = 'q';
                                        case 28:
                                            arr[8] = 'r';
                                        case 29:
                                            arr[8] = 's';
                                        case 30:
                                            arr[8] = 't';
                                        case 31:
                                            arr[8] = 'u';
                                        case 32:
                                            arr[8] = 'v';
                                        case 33:
                                            arr[8] = 'w';
                                        case 34:
                                            arr[8] = 'x';
                                        case 35:
                                            arr[8] = 'y';
                                        case 36:
                                            arr[8] = 'z';
                                        case 37:
                                            arr[8] = 'A';
                                        case 38:
                                            arr[8] = 'B';
                                        case 39:
                                            arr[8] = 'C';
                                        case 40:
                                            arr[8] = 'D';
                                        case 41:
                                            arr[8] = 'E';
                                        case 42:
                                            arr[8] = 'F';
                                        case 43:
                                            arr[8] = 'G';
                                        case 44:
                                            arr[8] = 'H';
                                        case 45:
                                            arr[8] = 'I';
                                        case 46:
                                            arr[8] = 'J';
                                        case 47:
                                            arr[8] = 'K';
                                        case 48:
                                            arr[8] = 'L';
                                        case 49:
                                            arr[8] = 'M';
                                        case 50:
                                            arr[8] = 'N';
                                        case 51:
                                            arr[8] = 'O';
                                        case 52:
                                            arr[8] = 'P';
                                        case 53:
                                            arr[8] = 'Q';
                                        case 54:
                                            arr[8] = 'R';
                                        case 55:
                                            arr[8] = 'S';
                                        case 56:
                                            arr[8] = 'T';
                                        case 57:
                                            arr[8] = 'U';
                                        case 58:
                                            arr[8] = 'V';
                                        case 59:
                                            arr[8] = 'W';
                                        case 60:
                                            arr[8] = 'X';
                                        case 61:
                                            arr[8] = 'Y';
                                        case 62:
                                            arr[8] = 'Z';
                                        case 63:
                                            arr[8] = '!';
                                        case 64:
                                            arr[8] = '?';
                                        case 65:
                                            arr[8] = '<';
                                        case 66:
                                            arr[8] = '>';
                                        case 67:
                                            arr[8] = '+';
                                        case 68:
                                            arr[8] = '-';
                                    }
                                        for(int teenth = 1; teenth <= 68; teenth++){
                                            switch (teenth){
                                                case 1:
                                                    arr[9] = '1';
                                                case 2:
                                                    arr[9] = '2';
                                                case 3:
                                                    arr[9] = '3';
                                                case 4:
                                                    arr[9] = '4';
                                                case 5:
                                                    arr[9] = '5';
                                                case 6:
                                                    arr[9] = '6';
                                                case 7:
                                                    arr[9] = '7';
                                                case 8:
                                                    arr[9] = '8';
                                                case 9:
                                                    arr[9] = '9';
                                                case 10:
                                                    arr[9] = '0';
                                                case 11:
                                                    arr[9] = 'a';
                                                case 12:
                                                    arr[9] = 'b';
                                                case 13:
                                                    arr[9] = 'c';
                                                case 14:
                                                    arr[9] = 'd';
                                                case 15:
                                                    arr[9] = 'e';
                                                case 16:
                                                    arr[9] = 'f';
                                                case 17:
                                                    arr[9] = 'g';
                                                case 18:
                                                    arr[9] = 'h';
                                                case 19:
                                                    arr[9] = 'i';
                                                case 20:
                                                    arr[9] = 'j';
                                                case 21:
                                                    arr[9] = 'k';
                                                case 22:
                                                    arr[9] = 'l';
                                                case 23:
                                                    arr[9] = 'm';
                                                case 24:
                                                    arr[9] = 'n';
                                                case 25:
                                                    arr[9] = 'o';
                                                case 26:
                                                    arr[9] = 'p';
                                                case 27:
                                                    arr[9] = 'q';
                                                case 28:
                                                    arr[9] = 'r';
                                                case 29:
                                                    arr[9] = 's';
                                                case 30:
                                                    arr[9] = 't';
                                                case 31:
                                                    arr[9] = 'u';
                                                case 32:
                                                    arr[9] = 'v';
                                                case 33:
                                                    arr[9] = 'w';
                                                case 34:
                                                    arr[9] = 'x';
                                                case 35:
                                                    arr[9] = 'y';
                                                case 36:
                                                    arr[9] = 'z';
                                                case 37:
                                                    arr[9] = 'A';
                                                case 38:
                                                    arr[9] = 'B';
                                                case 39:
                                                    arr[9] = 'C';
                                                case 40:
                                                    arr[9] = 'D';
                                                case 41:
                                                    arr[9] = 'E';
                                                case 42:
                                                    arr[9] = 'F';
                                                case 43:
                                                    arr[9] = 'G';
                                                case 44:
                                                    arr[9] = 'H';
                                                case 45:
                                                    arr[9] = 'I';
                                                case 46:
                                                    arr[9] = 'J';
                                                case 47:
                                                    arr[9] = 'K';
                                                case 48:
                                                    arr[9] = 'L';
                                                case 49:
                                                    arr[9] = 'M';
                                                case 50:
                                                    arr[9] = 'N';
                                                case 51:
                                                    arr[9] = 'O';
                                                case 52:
                                                    arr[9] = 'P';
                                                case 53:
                                                    arr[9] = 'Q';
                                                case 54:
                                                    arr[9] = 'R';
                                                case 55:
                                                    arr[9] = 'S';
                                                case 56:
                                                    arr[9] = 'T';
                                                case 57:
                                                    arr[9] = 'U';
                                                case 58:
                                                    arr[9] = 'V';
                                                case 59:
                                                    arr[9] = 'W';
                                                case 60:
                                                    arr[9] = 'X';
                                                case 61:
                                                    arr[9] = 'Y';
                                                case 62:
                                                    arr[9] = 'Z';
                                                case 63:
                                                    arr[9] = '!';
                                                case 64:
                                                    arr[9] = '?';
                                                case 65:
                                                    arr[9] = '<';
                                                case 66:
                                                    arr[9] = '>';
                                                case 67:
                                                    arr[9] = '+';
                                                case 68:
                                                    arr[9] = '-';
                                            }
                                            for(int eleventh = 1; eleventh <= 68; eleventh++){
                                                switch (eleventh){
                                                case 1:
                                                    arr[10] = '1';
                                                case 2:
                                                    arr[10] = '2';
                                                case 3:
                                                    arr[10] = '3';
                                                case 4:
                                                    arr[10] = '4';
                                                case 5:
                                                    arr[10] = '5';
                                                case 6:
                                                    arr[10] = '6';
                                                case 7:
                                                    arr[10] = '7';
                                                case 8:
                                                    arr[10] = '8';
                                                case 9:
                                                    arr[10] = '9';
                                                case 10:
                                                    arr[10] = '0';
                                                case 11:
                                                    arr[10] = 'a';
                                                case 12:
                                                    arr[10] = 'b';
                                                case 13:
                                                    arr[10] = 'c';
                                                case 14:
                                                    arr[10] = 'd';
                                                case 15:
                                                    arr[10] = 'e';
                                                case 16:
                                                    arr[10] = 'f';
                                                case 17:
                                                    arr[10] = 'g';
                                                case 18:
                                                    arr[10] = 'h';
                                                case 19:
                                                    arr[10] = 'i';
                                                case 20:
                                                    arr[10] = 'j';
                                                case 21:
                                                    arr[10] = 'k';
                                                case 22:
                                                    arr[10] = 'l';
                                                case 23:
                                                    arr[10] = 'm';
                                                case 24:
                                                    arr[10] = 'n';
                                                case 25:
                                                    arr[10] = 'o';
                                                case 26:
                                                    arr[10] = 'p';
                                                case 27:
                                                    arr[10] = 'q';
                                                case 28:
                                                    arr[10] = 'r';
                                                case 29:
                                                    arr[10] = 's';
                                                case 30:
                                                    arr[10] = 't';
                                                case 31:
                                                    arr[10] = 'u';
                                                case 32:
                                                    arr[10] = 'v';
                                                case 33:
                                                    arr[10] = 'w';
                                                case 34:
                                                    arr[10] = 'x';
                                                case 35:
                                                    arr[10] = 'y';
                                                case 36:
                                                    arr[10] = 'z';
                                                case 37:
                                                    arr[10] = 'A';
                                                case 38:
                                                    arr[10] = 'B';
                                                case 39:
                                                    arr[10] = 'C';
                                                case 40:
                                                    arr[10] = 'D';
                                                case 41:
                                                    arr[10] = 'E';
                                                case 42:
                                                    arr[10] = 'F';
                                                case 43:
                                                    arr[10] = 'G';
                                                case 44:
                                                    arr[10] = 'H';
                                                case 45:
                                                    arr[10] = 'I';
                                                case 46:
                                                    arr[10] = 'J';
                                                case 47:
                                                    arr[10] = 'K';
                                                case 48:
                                                    arr[10] = 'L';
                                                case 49:
                                                    arr[10] = 'M';
                                                case 50:
                                                    arr[10] = 'N';
                                                case 51:
                                                    arr[10] = 'O';
                                                case 52:
                                                    arr[10] = 'P';
                                                case 53:
                                                    arr[10] = 'Q';
                                                case 54:
                                                    arr[10] = 'R';
                                                case 55:
                                                    arr[10] = 'S';
                                                case 56:
                                                    arr[10] = 'T';
                                                case 57:
                                                    arr[10] = 'U';
                                                case 58:
                                                    arr[10] = 'V';
                                                case 59:
                                                    arr[10] = 'W';
                                                case 60:
                                                    arr[10] = 'X';
                                                case 61:
                                                    arr[10] = 'Y';
                                                case 62:
                                                    arr[10] = 'Z';
                                                case 63:
                                                    arr[10] = '!';
                                                case 64:
                                                    arr[10] = '?';
                                                case 65:
                                                    arr[10] = '<';
                                                case 66:
                                                    arr[10] = '>';
                                                case 67:
                                                    arr[10] = '+';
                                                case 68:
                                                    arr[10] = '-';
                                            }
                                                for(int twelth = 1; twelth <= 68; twelth++){
                                                    switch (twelth){
                                                        case 1:
                                                            arr[11] = '1';
                                                            break;
                                                        case 2:
                                                            arr[11] = '2';
                                                            break;
                                                        case 3:
                                                            arr[11] = '3';
                                                            break;
                                                        case 4:
                                                            arr[11] = '4';
                                                            break;
                                                        case 5:
                                                            arr[11] = '5';
                                                            break;
                                                        case 6:
                                                            arr[11] = '6';
                                                            break;
                                                        case 7:
                                                            arr[11] = '7';
                                                            break;
                                                        case 8:
                                                            arr[11] = '8';
                                                            break;
                                                        case 9:
                                                            arr[11] = '9';
                                                            break;
                                                        case 10:
                                                            arr[11] = '0';
                                                            break;
                                                        case 11:
                                                            arr[11] = 'a';
                                                            break;
                                                        case 12:
                                                            arr[11] = 'b';
                                                            break;
                                                        case 13:
                                                            arr[11] = 'c';
                                                            break;
                                                        case 14:
                                                            arr[11] = 'd';
                                                        case 15:
                                                            arr[11] = 'e';
                                                        case 16:
                                                            arr[11] = 'f';
                                                        case 17:
                                                            arr[11] = 'g';
                                                        case 18:
                                                            arr[11] = 'h';
                                                        case 19:
                                                            arr[11] = 'i';
                                                        case 20:
                                                            arr[11] = 'j';
                                                        case 21:
                                                            arr[11] = 'k';
                                                        case 22:
                                                            arr[11] = 'l';
                                                        case 23:
                                                            arr[11] = 'm';
                                                        case 24:
                                                            arr[11] = 'n';
                                                        case 25:
                                                            arr[11] = 'o';
                                                        case 26:
                                                            arr[11] = 'p';
                                                        case 27:
                                                            arr[11] = 'q';
                                                        case 28:
                                                            arr[11] = 'r';
                                                        case 29:
                                                            arr[11] = 's';
                                                        case 30:
                                                            arr[11] = 't';
                                                        case 31:
                                                            arr[11] = 'u';
                                                        case 32:
                                                            arr[11] = 'v';
                                                        case 33:
                                                            arr[11] = 'w';
                                                        case 34:
                                                            arr[11] = 'x';
                                                        case 35:
                                                            arr[11] = 'y';
                                                        case 36:
                                                            arr[11] = 'z';
                                                        case 37:
                                                            arr[11] = 'A';
                                                        case 38:
                                                            arr[11] = 'B';
                                                        case 39:
                                                            arr[11] = 'C';
                                                        case 40:
                                                            arr[11] = 'D';
                                                        case 41:
                                                            arr[11] = 'E';
                                                        case 42:
                                                            arr[11] = 'F';
                                                        case 43:
                                                            arr[11] = 'G';
                                                        case 44:
                                                            arr[11] = 'H';
                                                        case 45:
                                                            arr[11] = 'I';
                                                        case 46:
                                                            arr[11] = 'J';
                                                        case 47:
                                                            arr[11] = 'K';
                                                        case 48:
                                                            arr[11] = 'L';
                                                        case 49:
                                                            arr[11] = 'M';
                                                        case 50:
                                                            arr[11] = 'N';
                                                        case 51:
                                                            arr[11] = 'O';
                                                        case 52:
                                                            arr[11] = 'P';
                                                        case 53:
                                                            arr[11] = 'Q';
                                                        case 54:
                                                            arr[11] = 'R';
                                                        case 55:
                                                            arr[11] = 'S';
                                                        case 56:
                                                            arr[11] = 'T';
                                                        case 57:
                                                            arr[11] = 'U';
                                                        case 58:
                                                            arr[11] = 'V';
                                                        case 59:
                                                            arr[11] = 'W';
                                                        case 60:
                                                            arr[11] = 'X';
                                                        case 61:
                                                            arr[11] = 'Y';
                                                        case 62:
                                                            arr[11] = 'Z';
                                                        case 63:
                                                            arr[11] = '!';
                                                        case 64:
                                                            arr[11] = '?';
                                                        case 65:
                                                            arr[11] = '<';
                                                        case 66:
                                                            arr[11] = '>';
                                                        case 67:
                                                            arr[11] = '+';
                                                        case 68:
                                                            arr[11] = '-';
                                                    }
                                                    for(int fourteenth = 5; fourteenth <= 9; fourteenth++){
                                                        arr[13] = (char) (fourteenth + 48);
                                                        System.out.println(arr[11]);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void sswitch(int twelth){
        switch (twelth){
            case 1:
                arr[11] = '1';
                break;
            case 2:
                arr[11] = '2';
                break;
            case 3:
                arr[11] = '3';
                break;
            case 4:
                arr[11] = '4';
                break;
            case 5:
                arr[11] = '5';
                break;
            case 6:
                arr[11] = '6';
                break;
            case 7:
                arr[11] = '7';
                break;
            case 8:
                arr[11] = '8';
                break;
            case 9:
                arr[11] = '9';
                break;
            case 10:
                arr[11] = '0';
                break;
            case 11:
                arr[11] = 'a';
                break;
            case 12:
                arr[11] = 'b';
                break;
            case 13:
                arr[11] = 'c';
                break;
            case 14:
                arr[11] = 'd';
                break;
            case 15:
                arr[11] = 'e';
                break;
            case 16:
                arr[11] = 'f';
                break;
            case 17:
                arr[11] = 'g';
                break;
            case 18:
                arr[11] = 'h';
                break;
            case 19:
                arr[11] = 'i';
                break;
            case 20:
                arr[11] = 'j';
                break;
            case 21:
                arr[11] = 'k';
                break;
            case 22:
                arr[11] = 'l';
                break;
            case 23:
                arr[11] = 'm';
                break;
            case 24:
                arr[11] = 'n';
                break;
            case 25:
                arr[11] = 'o';
                break;
            case 26:
                arr[11] = 'p';
                break;
            case 27:
                arr[11] = 'q';
                break;
            case 28:
                arr[11] = 'r';
                break;
            case 29:
                arr[11] = 's';
                break;
            case 30:
                arr[11] = 't';
                break;
            case 31:
                arr[11] = 'u';
                break;
            case 32:
                arr[11] = 'v';
                break;
            case 33:
                arr[11] = 'w';
                break;
            case 34:
                arr[11] = 'x';
                break;
            case 35:
                arr[11] = 'y';
                break;
            case 36:
                arr[11] = 'z';
                break;
            case 37:
                arr[11] = 'A';
                break;
            case 38:
                arr[11] = 'B';
                break;
            case 39:
                arr[11] = 'C';
                break;
            case 40:
                arr[11] = 'D';
                break;
            case 41:
                arr[11] = 'E';
                break;
            case 42:
                arr[11] = 'F';
                break;
            case 43:
                arr[11] = 'G';
                break;
            case 44:
                arr[11] = 'H';
                break;
            case 45:
                arr[11] = 'I';
                break;
            case 46:
                arr[11] = 'J';
                break;
            case 47:
                arr[11] = 'K';
                break;
            case 48:
                arr[11] = 'L';
                break;
            case 49:
                arr[11] = 'M';
                break;
            case 50:
                arr[11] = 'N';
                break;
            case 51:
                arr[11] = 'O';
                break;
            case 52:
                arr[11] = 'P';
                break;
            case 53:
                arr[11] = 'Q';
                break;
            case 54:
                arr[11] = 'R';
                break;
            case 55:
                arr[11] = 'S';
                break;
            case 56:
                arr[11] = 'T';
                break;
            case 57:
                arr[11] = 'U';
                break;
            case 58:
                arr[11] = 'V';
                break;
            case 59:
                arr[11] = 'W';
                break;
            case 60:
                arr[11] = 'X';
                break;
            case 61:
                arr[11] = 'Y';
                break;
            case 62:
                arr[11] = 'Z';
                break;
            case 63:
                arr[11] = '!';
                break;
            case 64:
                arr[11] = '?';
                break;
            case 65:
                arr[11] = '<';
                break;
            case 66:
                arr[11] = '>';
                break;
            case 67:
                arr[11] = '+';
                break;
            case 68:
                arr[11] = '-';
                break;
        }
    }

    public static void main(String[] args) {
        knacker();
    }
}