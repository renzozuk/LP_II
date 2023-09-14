package model.services;

import model.entities.PhoneNumber;
import model.exceptions.InvalidDDIException;

public class DDIService {
    public static String getCountryByDDI(PhoneNumber phoneNumber) {
        return switch (phoneNumber.getDDI()) {
            case "1" -> AreaCodeService.getNorthAmericanRegionByAreaCode(phoneNumber);
            case "20" -> "Egypt";
            case "211" -> "South Sudan";
            case "212" -> "Morocco";
            case "213" -> "Algeria";
            case "216" -> "Tunisia";
            case "218" -> "Libya";
            case "220" -> "Gambia";
            case "221" -> "Senegal";
            case "222" -> "Mauritania";
            case "223" -> "Mali";
            case "224" -> "Guinea";
            case "225" -> "Côte d'Ivoire (Ivory Coast)";
            case "226" -> "Burkina Faso";
            case "227" -> "Niger";
            case "228" -> "Togo";
            case "229" -> "Benin";
            case "230" -> "Mauritius";
            case "231" -> "Liberia";
            case "232" -> "Sierra Leone";
            case "233" -> "Ghana";
            case "234" -> "Nigeria";
            case "235" -> "Chad";
            case "236" -> "Central African Republic";
            case "237" -> "Cameroon";
            case "238" -> "Cape Verde";
            case "239" -> "São Tomé and Príncipe";
            case "240" -> "Equatorial Guinea";
            case "241" -> "Gabon";
            case "242" -> "Republic of the Congo (Brazzaville)";
            case "243" -> "Democratic Republic of the Congo (Kinshasa)";
            case "244" -> "Angola";
            case "245" -> "Guinea-Bissau";
            case "246" -> "British Indian Ocean Territory";
            case "247" -> "Ascension Island";
            case "248" -> "Seychelles";
            case "249" -> "Sudan";
            case "250" -> "Rwanda";
            case "251" -> "Ethiopia";
            case "252" -> "Somalia (also used in Somaliland)";
            case "253" -> "Djibouti";
            case "254" -> "Kenya";
            case "255" -> "Tanzania";
            case "256" -> "Uganda";
            case "257" -> "Burundi";
            case "258" -> "Mozambique";
            case "259" -> "Zanzibar";
            case "260" -> "Zambia";
            case "261" -> "Madagascar";
            case "262" -> "Réunion and Mayotte";
            case "263" -> "Zimbabwe";
            case "264" -> "Namibia";
            case "265" -> "Malawi";
            case "266" -> "Lesotho";
            case "267" -> "Botswana";
            case "268" -> "Swaziland";
            case "269" -> "Comoros";
            case "27" -> "South Africa";
            case "290" -> "Saint Helena";
            case "291" -> "Eritrea";
            case "297" -> "Aruba";
            case "298" -> "Faroe Islands";
            case "299" -> "Greenland";
            case "30" -> "Greece";
            case "31" -> "The Netherlands";
            case "32" -> "Belgium";
            case "33" -> "France" + AreaCodeService.getFrenchTypeNumberByAreaCode(phoneNumber);
            case "34" -> "Spain";
            case "350" -> "Gibraltar";
            case "351" -> "Portugal";
            case "352" -> "Luxembourg";
            case "353" -> "Ireland";
            case "354" -> "Iceland";
            case "355" -> "Albania";
            case "356" -> "Malta";
            case "357" -> "Cyprus";
            case "358" -> "Finland";
            case "359" -> "Bulgaria";
            case "36" -> "Hungary";
            case "370" -> "Lithuania";
            case "371" -> "Latvia";
            case "372" -> "Estonia";
            case "373" -> "Moldova";
            case "374" -> "Armenia";
            case "375" -> "Belarus";
            case "376" -> "Andorra";
            case "377" -> "Monaco";
            case "378" -> "San Marino";
            case "379" -> "Vatican City";
            case "380" -> "Ukraine";
            case "381" -> "Serbia";
            case "382" -> "Montenegro";
            case "385" -> "Croatia";
            case "386" -> "Slovenia";
            case "387" -> "Bosnia and Herzegovina";
            case "389" -> "North Macedonia";
            case "39" -> "Italy";
            case "40" -> "Romania";
            case "41" -> "Switzerland";
            case "420" -> "Czech Republic";
            case "421" -> "Slovakia";
            case "423" -> "Liechtenstein";
            case "43" -> "Austria";
            case "44" -> "United Kingdom";
            case "45" -> "Denmark";
            case "46" -> "Sweden";
            case "47" -> "Norway";
            case "48" -> "Poland";
            case "49" -> "Germany";
            case "500" -> "Falkland Islands";
            case "501" -> "Belize";
            case "502" -> "Guatemala";
            case "503" -> "El Salvador";
            case "504" -> "Honduras";
            case "505" -> "Nicaragua";
            case "506" -> "Costa Rica";
            case "507" -> "Panama";
            case "508" -> "Saint-Pierre and Miquelon";
            case "509" -> "Haiti";
            case "51" -> "Peru";
            case "52" -> "Mexico";
            case "53" -> "Cuba";
            case "54" -> "Argentina";
            case "55" -> "Brazil" + AreaCodeService.getBrazilianTypeNumber(phoneNumber);
            case "56" -> "Chile";
            case "57" -> "Colombia";
            case "58" -> "Venezuela";
            case "590" -> "Guadeloupe";
            case "591" -> "Bolivia";
            case "592" -> "Guyana";
            case "593" -> "Ecuador";
            case "594" -> "French Guiana";
            case "595" -> "Paraguay";
            case "596" -> "Martinique";
            case "597" -> "Suriname";
            case "598" -> "Uruguay" + AreaCodeService.getUruguayanTypeNumberByAreaCode(phoneNumber);
            case "599" -> "Curaçao and the Caribbean Netherlands";
            case "60" -> "Malaysia";
            case "61" -> "Australia";
            case "62" -> "Indonesia";
            case "63" -> "Philippines";
            case "64" -> "New Zealand";
            case "65" -> "Singapore";
            case "66" -> "Thailand";
            case "670" -> "Timor-Leste";
            case "673" -> "Brunei";
            case "674" -> "Nauru";
            case "675" -> "Papua New Guinea";
            case "676" -> "Tonga";
            case "677" -> "Solomon Islands";
            case "678" -> "Vanuatu";
            case "679" -> "Fiji";
            case "680" -> "Palau";
            case "681" -> "Wallis and Futuna";
            case "682" -> "Cook Islands";
            case "683" -> "Niue Island";
            case "685" -> "Samoa";
            case "686" -> "Kiribati, Gilbert Islands";
            case "687" -> "New Caledonia";
            case "688" -> "Tuvalu";
            case "689" -> "French Polynesia";
            case "690" -> "Tokelau";
            case "691" -> "Federated States of Micronesia";
            case "692" -> "Marshall Islands";
            case "7" -> "Russia";
            case "81" -> "Japan" + AreaCodeService.getJapaneseTypeNumberByAreaCode(phoneNumber);
            case "82" -> "South Korea";
            case "84" -> "Vietnam";
            case "850" -> "North Korea";
            case "852" -> "Hong Kong";
            case "853" -> "Macau";
            case "855" -> "Cambodia";
            case "856" -> "Laos";
            case "86" -> "China";
            case "880" -> "Bangladesh";
            case "90" -> "Turkey";
            case "91" -> "India";
            case "92" -> "Pakistan";
            case "93" -> "Afghanistan";
            case "94" -> "Sri Lanka";
            case "95" -> "Myanmar";
            case "960" -> "Maldives";
            case "961" -> "Lebanon";
            case "962" -> "Jordan";
            case "963" -> "Syria";
            case "964" -> "Iraq";
            case "965" -> "Kuwait";
            case "966" -> "Saudi Arabia";
            case "967" -> "Yemen";
            case "968" -> "Oman";
            case "971" -> "United Arab Emirates";
            case "972" -> "Israel";
            case "973" -> "Bahrain";
            case "974" -> "Qatar";
            case "975" -> "Bhutan";
            case "976" -> "Mongolia";
            case "977" -> "Nepal";
            case "98" -> "Iran";
            case "992" -> "Tajikistan";
            case "993" -> "Turkmenistan";
            case "994" -> "Azerbaijan";
            case "995" -> "Georgia";
            case "996" -> "Kyrgyzstan";
            case "997" -> "Kazakhstan";
            case "998" -> "Uzbekistan";
            default -> throw new InvalidDDIException(phoneNumber.getDDI());
        };
    }
}
