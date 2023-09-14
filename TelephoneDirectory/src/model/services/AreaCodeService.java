package model.services;

import model.entities.PhoneNumber;
import model.exceptions.InvalidAreaCodeException;

public class AreaCodeService {
    protected static String getNorthAmericanRegionByAreaCode(PhoneNumber phoneNumber) {
        return switch (phoneNumber.getAreaCode()) {
            case "201", "551" -> "United States\nRegion: Jersey City, NJ";
            case "202", "771" -> "United States\nRegion: District of Columbia";
            case "203", "475" -> "United States\nRegion: Bridgeport, CT";
            case "205", "659" -> "United States\nRegion: Birmingham, AL";
            case "206" -> "United States\nRegion: Seattle, WA";
            case "207" -> "United States\nRegion: Portland, ME";
            case "208", "986" -> "United States\nRegion: Idaho";
            case "209", "350" -> "United States\nRegion: Stockton, CA";
            case "210", "726" -> "United States\nRegion: San Antonio, TX";
            case "212", "332", "347", "646", "718", "917", "929" -> "United States\nRegion: New York, NY";
            case "213", "310", "323", "424", "747", "818" -> "United States\nRegion: Los Angeles, CA";
            case "214", "469", "945", "972" -> "United States\nRegion: Dallas, TX";
            case "215", "267", "445" -> "United States\nRegion: Philadelphia, PA";
            case "216" -> "United States\nRegion: Cleveland, OH";
            case "217", "447" -> "United States\nRegion: Springfield, IL";
            case "218" -> "United States\nRegion: Duluth, MN";
            case "219" -> "United States\nRegion: Hammond, IN";
            case "220", "740" -> "United States\nRegion: Newark, OH";
            case "223", "717" -> "United States\nRegion: Lancaster, PA";
            case "224" -> "United States\nRegion: Elgin, IL";
            case "225" -> "United States\nRegion: Baton Rouge, LA";
            case "228" -> "United States\nRegion: Gulfport, MS";
            case "229" -> "United States\nRegion: Albany, GA";
            case "231" -> "United States\nRegion: Muskegon, MI";
            case "234" -> "United States\nRegion: Akron, OH";
            case "239" -> "United States\nRegion: Cape Coral, FL";
            case "240" -> "United States\nRegion: Germantown, MD";
            case "248", "947" -> "United States\nRegion: Troy, MI";
            case "251" -> "United States\nRegion: Mobile, AL";
            case "252" -> "United States\nRegion: Greenville, NC";
            case "253" -> "United States\nRegion: Tacoma, WA";
            case "254" -> "United States\nRegion: Killeen, TX";
            case "256" -> "United States\nRegion: Huntsville, AL";
            case "260" -> "United States\nRegion: Fort Wayne, IN";
            case "262" -> "United States\nRegion: Kenosha, WI";
            case "269" -> "United States\nRegion: Kalamazoo, MI";
            case "270" -> "United States\nRegion: Bowling Green, KY";
            case "272" -> "United States\nRegion: Scranton, PA";
            case "276" -> "United States\nRegion: Bristol, VA";
            case "279", "916" -> "United States\nRegion: Sacramento, CA";
            case "281", "346", "713", "832" -> "United States\nRegion: Houston, TX";
            case "301" -> "United States\nRegion: Germantown, MD";
            case "302" -> "United States\nRegion: Delaware";
            case "303", "720", "983" -> "United States\nRegion: Denver, CO";
            case "304", "681" -> "United States\nRegion: West Virginia";
            case "305", "786" -> "United States\nRegion: Miami, FL";
            case "307" -> "United States\nRegion: Wyoming";
            case "308" -> "United States\nRegion: Grand Island, NE";
            case "309" -> "United States\nRegion: Peoria, IL";
            case "312", "773", "872" -> "United States\nRegion: Chicago, IL";
            case "313" -> "United States\nRegion: Detroit, MI";
            case "314" -> "United States\nRegion: St. Louis, MO";
            case "315", "680" -> "United States\nRegion: Syracuse, NY";
            case "316" -> "United States\nRegion: Wichita, KS";
            case "317", "463" -> "United States\nRegion: Indianapolis, IN";
            case "318" -> "United States\nRegion: Shreveport, LA";
            case "319" -> "United States\nRegion: Cedar Rapids, IA";
            case "320" -> "United States\nRegion: St. Cloud, MN";
            case "321", "407", "689" -> "United States\nRegion: Orlando, FL";
            case "325" -> "United States\nRegion: Abilene, TX";
            case "326" -> "United States\nRegion: Dayton, OH";
            case "330" -> "United States\nRegion: Akron, OH";
            case "331" -> "United States\nRegion: Aurora, IL";
            case "334" -> "United States\nRegion: Montgomery, AL";
            case "336" -> "United States\nRegion: Greensboro, NC";
            case "337" -> "United States\nRegion: Lafayette, LA";
            case "339", "617", "781", "857" -> "United States\nRegion: Boston, MA";
            case "340" -> "United States\nRegion: Virgin Islands";
            case "341", "510" -> "United States\nRegion: Oakland, CA";
            case "351" -> "United States\nRegion: Lowell, MA";
            case "352" -> "United States\nRegion: Gainesville, FL";
            case "360" -> "United States\nRegion: Vancouver, WA";
            case "361" -> "United States\nRegion: Corpus Christi, TX";
            case "363", "516" -> "United States\nRegion: Hempstead, NY";
            case "364" -> "United States\nRegion: Bowling Green, KY";
            case "380" -> "United States\nRegion: Columbus, OH";
            case "385" -> "United States\nRegion: Salt Lake City, UT";
            case "386" -> "United States\nRegion: Palm Coast, FL";
            case "401" -> "United States\nRegion: Providence, RI";
            case "402" -> "United States\nRegion: Omaha, NE";
            case "404", "470", "678", "943" -> "United States\nRegion: Atlanta, GA";
            case "405" -> "United States\nRegion: Oklahoma City, OK";
            case "406" -> "United States\nRegion: Montana";
            case "408", "669" -> "United States\nRegion: San Jose, CA";
            case "409" -> "United States\nRegion: Beaumont, TX";
            case "410", "443", "667" -> "United States\nRegion: Baltimore, MD";
            case "412" -> "United States\nRegion: Pittsburgh, PA";
            case "413" -> "United States\nRegion: Springfield, MA";
            case "414" -> "United States\nRegion: Milwaukee, WI";
            case "415", "628" -> "United States\nRegion: San Francisco, CA";
            case "417" -> "United States\nRegion: Springfield, MO";
            case "419" -> "United States\nRegion: Toledo, OH";
            case "423" -> "United States\nRegion: Chattanooga, TN";
            case "425" -> "United States\nRegion: Bellevue, WA";
            case "430", "903" -> "United States\nRegion: Tyler, TX";
            case "432" -> "United States\nRegion: Midland, TX";
            case "434" -> "United States\nRegion: Lynchburg, VA";
            case "435" -> "United States\nRegion: St. George, UT";
            case "440" -> "United States\nRegion: Parma, OH";
            case "442", "760" -> "United States\nRegion: Oceanside, CA";
            case "448", "850" -> "United States\nRegion: Tallahassee, FL";
            case "458", "541" -> "United States\nRegion: Eugene, OR";
            case "464", "708" -> "United States\nRegion: Cicero, IL";
            case "472", "910" -> "United States\nRegion: Fayetteville, NC";
            case "478" -> "United States\nRegion: Macon, GA";
            case "479" -> "United States\nRegion: Fort Smith, AR";
            case "480" -> "United States\nRegion: Mesa, AZ";
            case "484" -> "United States\nRegion: Allentown, PA";
            case "501" -> "United States\nRegion: Little Rock, AR";
            case "502" -> "United States\nRegion: Louisville, KY";
            case "503", "971" -> "United States\nRegion: Portland, OR";
            case "504" -> "United States\nRegion: New Orleans, LA";
            case "505" -> "United States\nRegion: Albuquerque, NM";
            case "507" -> "United States\nRegion: Rochester, MN";
            case "508" -> "United States\nRegion: Worcester, MA";
            case "509" -> "United States\nRegion: Spokane, WA";
            case "512", "737" -> "United States\nRegion: Austin, TX";
            case "513" -> "United States\nRegion: Cincinnati, OH";
            case "515" -> "United States\nRegion: Des Moines, IA";
            case "517" -> "United States\nRegion: Lansing, MI";
            case "518", "838" -> "United States\nRegion: Albany, NY";
            case "520" -> "United States\nRegion: Tucson, AZ";
            case "530" -> "United States\nRegion: Redding, CA";
            case "531" -> "United States\nRegion: Omaha, NE";
            case "534" -> "United States\nRegion: Eau Claire, WI";
            case "539", "918" -> "United States\nRegion: Tulsa, OK";
            case "540" -> "United States\nRegion: Roanoke, VA";
            case "557" -> "United States\nRegion: St. Louis, MO";
            case "559" -> "United States\nRegion: Fresno, CA";
            case "561" -> "United States\nRegion: West Palm Beach, FL";
            case "562" -> "United States\nRegion: Long Beach, CA";
            case "563" -> "United States\nRegion: Davenport, IA";
            case "564" -> "United States\nRegion: Vancouver, WA";
            case "567" -> "United States\nRegion: Toledo, OH";
            case "570" -> "United States\nRegion: Scranton, PA";
            case "571", "703" -> "United States\nRegion: Arlington, VA";
            case "572" -> "United States\nRegion: Oklahoma City, OK";
            case "573" -> "United States\nRegion: Columbia, MO";
            case "574" -> "United States\nRegion: South Bend, IN";
            case "575" -> "United States\nRegion: Las Cruces, NM";
            case "580" -> "United States\nRegion: Lawton, OK";
            case "582" -> "United States\nRegion: Erie, PA";
            case "585" -> "United States\nRegion: Rochester, NY";
            case "586" -> "United States\nRegion: Warren, MI";
            case "601" -> "United States\nRegion: Jackson, MS";
            case "602", "623" -> "United States\nRegion: Phoenix, AZ";
            case "603" -> "United States\nRegion: New Hampshire";
            case "605" -> "United States\nRegion: South Dakota";
            case "606" -> "United States\nRegion: Ashland, KY";
            case "607" -> "United States\nRegion: Binghamton, NY";
            case "608" -> "United States\nRegion: Madison, WI";
            case "609" -> "United States\nRegion: Trenton, NJ";
            case "610" -> "United States\nRegion: Allentown, PA";
            case "612" -> "United States\nRegion: Minneapolis, MN";
            case "614" -> "United States\nRegion: Columbus, OH";
            case "615", "629" -> "United States\nRegion: Nashville, TN";
            case "616" -> "United States\nRegion: Grand Rapids, MI";
            case "618" -> "United States\nRegion: Belleville, IL";
            case "619", "858" -> "United States\nRegion: San Diego, CA";
            case "620" -> "United States\nRegion: Hutchinson, KS";
            case "626" -> "United States\nRegion: Pasadena, CA";
            case "630" -> "United States\nRegion: Aurora, IL";
            case "631", "934" -> "United States\nRegion: Brentwood, NY";
            case "636" -> "United States\nRegion: O'Fallon, MO";
            case "640" -> "United States\nRegion: Trenton, NJ";
            case "641" -> "United States\nRegion: Mason City, IA";
            case "650" -> "United States\nRegion: San Mateo, CA";
            case "651" -> "United States\nRegion: St. Paul, MN";
            case "656", "813" -> "United States\nRegion: Tampa, FL";
            case "657", "714" -> "United States\nRegion: Anaheim, CA";
            case "660" -> "United States\nRegion: Sedalia, MO";
            case "661" -> "United States\nRegion: Bakersfield, CA";
            case "662" -> "United States\nRegion: Southaven, MS";
            case "670" -> "United States\nRegion: Northern Mariana Islands";
            case "671" -> "United States\nRegion: Guam";
            case "682", "817" -> "United States\nRegion: Fort Worth, TX";
            case "684" -> "United States\nRegion: American Samoa";
            case "701" -> "United States\nRegion: North Dakota";
            case "702", "725" -> "United States\nRegion: Las Vegas, NV";
            case "704", "980" -> "United States\nRegion: Charlotte, NC";
            case "706" -> "United States\nRegion: Augusta, GA";
            case "707" -> "United States\nRegion: Santa Rosa, CA";
            case "712" -> "United States\nRegion: Sioux City, IA";
            case "715" -> "United States\nRegion: Eau Claire, WI";
            case "716" -> "United States\nRegion: Buffalo, NY";
            case "719" -> "United States\nRegion: Colorado Springs, CO";
            case "724" -> "United States\nRegion: New Castle, PA";
            case "727" -> "United States\nRegion: St. Petersburg, FL";
            case "731" -> "United States\nRegion: Jackson, TN";
            case "732" -> "United States\nRegion: Toms River, NJ";
            case "734" -> "United States\nRegion: Ann Arbor, MI";
            case "743" -> "United States\nRegion: Greensboro, NC";
            case "754", "954" -> "United States\nRegion: Fort Lauderdale, FL";
            case "757", "948" -> "United States\nRegion: Virginia Beach, VA";
            case "762" -> "United States\nRegion: Augusta, GA";
            case "763" -> "United States\nRegion: Brooklyn Park, MN";
            case "765" -> "United States\nRegion: Muncie, IN";
            case "769" -> "United States\nRegion: Jackson, MS";
            case "770" -> "United States\nRegion: Roswell, GA";
            case "772" -> "United States\nRegion: Port St. Lucie, FL";
            case "774" -> "United States\nRegion: Worcester, MA";
            case "775" -> "United States\nRegion: Reno, NV";
            case "779" -> "United States\nRegion: Rockford, IL";
            case "785" -> "United States\nRegion: Topeka, KS";
            case "787", "939" -> "United States\nRegion: Puerto Rico";
            case "801" -> "United States\nRegion: Salt Lake City, UT";
            case "802" -> "United States\nRegion: Vermont";
            case "803" -> "United States\nRegion: Columbia, SC";
            case "804" -> "United States\nRegion: Richmond, VA";
            case "805", "820" -> "United States\nRegion: Oxnard, CA";
            case "806" -> "United States\nRegion: Lubbock, TX";
            case "808" -> "United States\nRegion: Hawaii";
            case "810" -> "United States\nRegion: Flint, MI";
            case "812" -> "United States\nRegion: Evansville, IN";
            case "814" -> "United States\nRegion: Erie, PA";
            case "815" -> "United States\nRegion: Rockford, IL";
            case "816" -> "United States\nRegion: Kansas City, MO";
            case "826" -> "United States\nRegion: Roanoke, VA";
            case "828" -> "United States\nRegion: Asheville, NC";
            case "830" -> "United States\nRegion: New Braunfels, TX";
            case "831" -> "United States\nRegion: Salinas, CA";
            case "835" -> "United States\nRegion: Allentown, PA";
            case "839" -> "United States\nRegion: Columbia, SC";
            case "840", "909" -> "United States\nRegion: San Bernardino, CA";
            case "843", "854" -> "United States\nRegion: Charleston, SC";
            case "845" -> "United States\nRegion: New City, NY";
            case "847" -> "United States\nRegion: Elgin, IL";
            case "848" -> "United States\nRegion: Toms River, NJ";
            case "856" -> "United States\nRegion: Camden, NJ";
            case "859" -> "United States\nRegion: Lexington-Fayette, KY";
            case "860", "959" -> "United States\nRegion: Hartford, CT";
            case "862", "973" -> "United States\nRegion: Newark, NJ";
            case "863" -> "United States\nRegion: Lakeland, FL";
            case "864" -> "United States\nRegion: Greenville, SC";
            case "865" -> "United States\nRegion: Knoxville, TN";
            case "870" -> "United States\nRegion: Jonesboro, AR";
            case "878" -> "United States\nRegion: Pittsburgh, PA";
            case "901" -> "United States\nRegion: Memphis, TN";
            case "904" -> "United States\nRegion: Jacksonville, FL";
            case "906" -> "United States\nRegion: Marquette, MI";
            case "907" -> "United States\nRegion: Alaska";
            case "908" -> "United States\nRegion: Elizabeth, NJ";
            case "912" -> "United States\nRegion: Savannah, GA";
            case "913" -> "United States\nRegion: Overland Park, KS";
            case "914" -> "United States\nRegion: Yonkers, NY";
            case "915" -> "United States\nRegion: El Paso, TX";
            case "919" -> "United States\nRegion: Raleigh, NC";
            case "920" -> "United States\nRegion: Green Bay, WI";
            case "925" -> "United States\nRegion: Concord, CA";
            case "928" -> "United States\nRegion: Yuma, AZ";
            case "930" -> "United States\nRegion: Evansville, IN";
            case "931" -> "United States\nRegion: Clarksville, TN";
            case "936" -> "United States\nRegion: Conroe, TX";
            case "937" -> "United States\nRegion: Dayton, OH";
            case "938" -> "United States\nRegion: Huntsville, AL";
            case "940" -> "United States\nRegion: Denton, TX";
            case "941" -> "United States\nRegion: North Port, FL";
            case "949" -> "United States\nRegion: Irvine, CA";
            case "951" -> "United States\nRegion: Riverside, CA";
            case "952" -> "United States\nRegion: Bloomington, MN";
            case "956" -> "United States\nRegion: Laredo, TX";
            case "970" -> "United States\nRegion: Fort Collins, CO";
            case "978" -> "United States\nRegion: Lowell, MA";
            case "979" -> "United States\nRegion: College Station, TX";
            case "984" -> "United States\nRegion: Raleigh, NC";
            case "985" -> "United States\nRegion: Houma, LA";
            case "989" -> "United States\nRegion: Saginaw, MI";
            case "204", "431", "584" -> "Canada\nRegion: Manitoba";
            case "226", "519", "548" -> "Canada\nRegion: London, ON";
            case "236", "604", "672", "778" -> "Canada\nRegion: Vancouver, BC";
            case "249", "683", "705" -> "Canada\nRegion: Sudbury, ON";
            case "250" -> "Canada\nRegion: Kelowna, BC";
            case "263", "438", "514" -> "Canada\nRegion: Montreal, QC";
            case "289", "365", "742", "905" -> "Canada\nRegion: Hamilton, ON";
            case "306", "474", "639" -> "Canada\nRegion: Saskatchewan";
            case "343", "613", "753" -> "Canada\nRegion: Ottawa, ON";
            case "354", "450", "579" -> "Canada\nRegion: Granby, QC";
            case "367", "418", "581" -> "Canada\nRegion: Quebec, QC";
            case "368", "403", "587", "825" -> "Canada\nRegion: Calgary, AB";
            case "416", "437", "647" -> "Canada\nRegion: Toronto, ON";
            case "468", "819", "873" -> "Canada\nRegion: Sherbrooke, QC";
            case "506" -> "Canada\nRegion: New Brunswick";
            case "709" -> "Canada\nRegion: Newfoundland/Labrador";
            case "780" -> "Canada\nRegion: Edmonton, AB";
            case "782" -> "Canada\nRegion: Nova Scotia/PE Island";
            case "807" -> "Canada\nRegion: Kenora, ON";
            case "867" -> "Canada\nRegion: Northern Canada";
            case "902" -> "Canada\nRegion: Nova Scotia/PE Island";
            case "242" -> "Bahamas";
            case "246" -> "Barbados";
            case "809", "829", "849" -> "Dominican Republic";
            case "876" -> "Jamaica";
            default -> throw new InvalidAreaCodeException(phoneNumber.getAreaCode(), "the United States, Canada, Bahamas, Barbados, Dominican Republic or Jamaica");
        };
    }

    private static String getBrazilianStateByAreaCode(PhoneNumber phoneNumber) {
        return switch (phoneNumber.getAreaCode()) {
            case "11", "12", "13", "14", "15", "16", "17", "18", "19" -> "\nState: São Paulo";
            case "21", "22", "24" -> "\nState: Rio de Janeiro";
            case "27", "28" -> "\nState: Espírito Santo";
            case "31", "32", "33", "34", "35", "37", "38" -> "\nState: Minas Gerais";
            case "41", "42", "43", "44", "45", "46" -> "\nState: Paraná";
            case "47", "48", "49" -> "\nState: Santa Catarina";
            case "51", "53", "54", "55" -> "\nState: Rio Grande do Sul";
            case "61" -> "\nState: Distrito Federal";
            case "62", "64" -> "\nState: Goiás";
            case "63" -> "\nState: Tocantins";
            case "65", "66" -> "\nState: Mato Grosso";
            case "67" -> "\nState: Mato Grosso do Sul";
            case "68" -> "\nState: Acre";
            case "69" -> "\nState: Rondônia";
            case "71", "73", "74", "75", "77" -> "\nState: Bahia";
            case "79" -> "\nState: Sergipe";
            case "81", "87" -> "\nState: Pernambuco";
            case "82" -> "\nState: Alagoas";
            case "83" -> "\nState: Paraíba";
            case "84" -> "\nState: Rio Grande do Norte";
            case "85", "88" -> "\nState: Ceará";
            case "86", "89" -> "\nState: Piauí";
            case "91", "93", "94" -> "\nState: Pará";
            case "92", "97" -> "\nState: Amazonas";
            case "95" -> "\nState: Roraima";
            case "96" -> "\nState: Amapá";
            case "98", "99" -> "\nState: Maranhão";
            default -> throw new InvalidAreaCodeException(phoneNumber.getAreaCode(), "Brazil");
        };
    }

    protected static String getBrazilianTypeNumber(PhoneNumber phoneNumber) {
        if(phoneNumber.getNumber().startsWith("9")){
            return getBrazilianStateByAreaCode(phoneNumber) + "\nType: mobile";
        }else{
            return getBrazilianStateByAreaCode(phoneNumber) + "\nType: landline";
        }
    }

    private static String getFrenchRegionByAreaCode(PhoneNumber phoneNumber){
        return switch (phoneNumber.getAreaCode()) {
            case "1", "01" -> "\nRegion: Île-de-France";
            case "2", "02" -> "\nRegion: Northwest France";
            case "3", "03" -> "\nRegion: Northeast France";
            case "4", "04" -> "\nRegion: Southeast France";
            case "5", "05" -> "\nRegion: Southwest France";
            default -> "\n Region: Unknown";
        };
    }

    protected static String getFrenchTypeNumberByAreaCode(PhoneNumber phoneNumber) {
        return switch (phoneNumber.getAreaCode()) {
            case "1", "01", "2", "02", "3", "03", "4", "04", "5", "05" -> getFrenchRegionByAreaCode(phoneNumber) + "\nType: landline";
            case "6", "06", "7", "07" -> "\nType: mobile";
            case "8", "08" -> "\nType: special";
            case "9", "09" -> "\nType: used by VoIP services";
            default -> throw new InvalidAreaCodeException(phoneNumber.getAreaCode(), "France");
        };
    }

    protected static String getJapaneseTypeNumberByAreaCode(PhoneNumber phoneNumber) {
        return switch (phoneNumber.getAreaCode()) {
            case "70", "070", "80", "080", "90", "090" -> "\nType: mobile";
            default -> "\nType: landline";
        };
    }

    private static String getUruguayanDepartmentByAreaCode(PhoneNumber phoneNumber) {
        if(phoneNumber.getAreaCode().startsWith("2")){
            return "\nDepartment: Montevideo";
        }else if(phoneNumber.getAreaCode().startsWith("433")){
            return "\nDepartment: Canelones";
        }else if(phoneNumber.getAreaCode().startsWith("42")){
            return "\nDepartment: Rocha";
        }else if(phoneNumber.getAreaCode().startsWith("447")){
            return "\nDepartment: Treinta y Tres";
        }else if(phoneNumber.getAreaCode().startsWith("464")){
            return "\nDepartment: Cerro Largo";
        }else if(phoneNumber.getAreaCode().startsWith("462")){
            return "\nDepartment: Rivera";
        }else if(phoneNumber.getAreaCode().startsWith("477")){
            return "\nDepartment: Artigas";
        }else if(phoneNumber.getAreaCode().startsWith("473")){
            return "\nDepartment: Salto";
        }else if(phoneNumber.getAreaCode().startsWith("472")){
            return "\nDepartment: Paysandú";
        }else if(phoneNumber.getAreaCode().startsWith("456")){
            return "\nDepartment: Río Negro";
        }else if(phoneNumber.getAreaCode().startsWith("453")){
            return "\nDepartment: Soriano";
        }else if(phoneNumber.getAreaCode().startsWith("452")){
            return "\nDepartment: Colonia";
        }else if(phoneNumber.getAreaCode().startsWith("434")){
            return "\nDepartment: San José";
        }else if(phoneNumber.getAreaCode().startsWith("4364")){
            return "\nDepartment: Flores";
        }else if(phoneNumber.getAreaCode().startsWith("435")){
            return "\nDepartment: Florida";
        }else if(phoneNumber.getAreaCode().startsWith("444")){
            return "\nDepartment: Lavalleja";
        }else if(phoneNumber.getAreaCode().startsWith("436")){
            return "\nDepartment: Durazno";
        }else if(phoneNumber.getAreaCode().startsWith("463")){
            return "\nDepartment: Tacuarembó";
        }
        throw new InvalidAreaCodeException(phoneNumber.getAreaCode(), "Uruguay");
    }

    protected static String getUruguayanTypeNumberByAreaCode(PhoneNumber phoneNumber) {
        if(phoneNumber.getAreaCode().length() == 0){
            return "\nType: Mobile";
        }
        return switch (phoneNumber.getAreaCode().charAt(0)) {
            case '2', '4' -> getUruguayanDepartmentByAreaCode(phoneNumber) + "\nType: landline";
            case '9' -> "\nType: mobile";
            default -> throw new InvalidAreaCodeException(phoneNumber.getAreaCode(), "Uruguay");
        };
    }
}
