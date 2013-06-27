import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.nanoTime();

        String s1 = "qjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafscl";
        String s2 = "qjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafsclqjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafsclqjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafsclqjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafscl";
        String s3 = "qjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafsclqjzccvxmbnxtemqnghnbnwsttcduyszbczkgbphtevzbqnqyvwdmzeobhasiuuruvcupwpxumrynjorsvdccyrkuqimmtswkvuppqchpnmkxsjdzwkwubzyltmmtlhnjqmdmwibwheseqlwfbammtpxyedyegzorrsrotspdjiipsvovijvhnovlvlvubjtqvkibfnrgsdryojdfunjykfynxhsszomdqryuhfsdbuypqqnuaacjwfesgdplgyopojazfzeazvwbvfjfnbpaiapbdbuimflbvdfpvulvzngwjqpraorkmvqnoxgqewpeivhzwtcwnbjkogxcnxcinpmdhwuwyefdmfzlojgynuiqubbxcwwikxlrvcmxrfcpapckywnchsmfrpsqnswbnabxfkjelkxxzcepkmfmveyjwlqyjcazusspcmsjmbxvjitifhmpvunasjfcujmokwmefwichkmgveiiftthurnsuipyhibkunvdzpmjofiominmpjnicqnaczvcxfckwtyhemvfekgypxfggcdrliukdofsxmovnkuatchvpxfxrrgeitxruqinsazetfyjvjtegaaogkuuaeoqwrfttjjepltbwtvndhdjroqsxsybxzqoxoxejraisybjjyyoncizhpmuurwbmsqhfhazkjbpubbehbspyhfizykqjcewhrtdeairdxikqbulcokqigxqxzaodmrtsqtwxmkwleruzlljnxqhleralpwudihhmeticjatnnanvflxoxevjvmlepdbkbwsdeuyqskqvfpcvwomlhrokslunpoqfuvxehkfkpvomxehlgmkoonuiojgmnoxivvttsyaximnfdbqkjxtpnciymolaehkenclebshwdnhlmeacxebnwqyruriojuqyjayepmktapoageavugsckcabfxgjdvywzsjmywcokhvggidtmximdvannsvpaoryrhfmkeebuhuklfbskaoahkfbnohyykwjzamixyegnuypacumrtioctoiurachgjagmmirzkkvhsfimzrucyidqmzumibhfidzdxvuizazgqucyivxauszqednjxircxviybawnvlfkoldwhdzzelagsqhzggymranssdhmagnhaacyljoycleleixjitgjlljtxpgjscxsvpctyzoxyrgupovlsesralkifnielpkfnzfwtvajbodulyjpktnoriuqcdocgfjbqerhdjcdgzqmgcablfqvvfiyvnfysdtkuqqlshbjiikizpiqunjizsiskndsrvoxrickplthxpmnscqpdehmmywxzijueqqbxvwyxsafkfnngkwnavvjryhcxtadantsftafwgfcqmrptyqjxcgncpurcdyewumubbwddyxdktpqieigrxrwrzgxeljfdhfzokadcybrljigkhlrlzvrdfbozydmizcfigucgnvmmenaibwqmxodlgxjcgjaeowljqfkzkvhnkpagvrqwjdihovjxqjwoxdrrdlihblwbfadljatjfrumliezczrpuwrvwmdwucpmkdnokbfrhxxujvmubiqrdgyfcmyhqseokxpdzvzikvzpflxdwrknmxiwtcltowezzovgqbxkmlhqgbxsfwwjquwxkbiffkxmjaibrwgqmadphaawekxvrgonfhypkbeiztnrgjsjemmhdcjxinhcawibbbamcxydwrdaxkzhcwobgeregxpklhwwxwagyuwjkcfowfsqhkncxbrfeqmwlqtztbhvoubypeoqtqnnflypigpkpzlpgcuynbasycdgrceiflcgbzxiwdrhosviizvvzmmlxcllklsawmfultukuhdecagnrbvsefqfbqbtoqoyjkewqvcviumtuhhsnvkdxomkpvqbdlilzjevglslaaibuctdngpznpqyxhehbddjgmltzfzwueoknjgrkjjwkrucpekzmzmqsezwbwxwigcrfzqveajorexquhgpqpzyiiuwehnprjzimqfzkdtjvjduirofscvtbtsxzaqfcgvuvanmlpnlxxdptbqhunzmhtzehrmksqwkmgrtynbliuupmzkvflteorylotverawmbvveprjziafpruswpfpaziamriygkwojmgwjuqpjwapasqxoczsxcmksjbusxtwzefarcclndcucgoozzxmezvzzcrjpazkvxnscwjmdavlknpfwldjufjbvuzlmgonaczrwnzgdyvvrqcyhjweotwujltlawnjjjcbizpkegzqrqfbxosbssadfcphfadfupwbzmfgyimzbqugsditdzgqbzfhmdfyideebphribfzbnxbbcokaaawhfjhlqzhmxgobtjdcgrtzgqfsakfspzndhknaairzlazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncaiiodliwomvixxgocjkclzhkhgtfssgkdteyfimmuiuzaoijpttvczfbrbwfsawcezoyjestgrvqjirgbsvzmgabbrwhlugbopqkfaejebmdzzbqmfvlbcidllulzepxzuqgvsrlsqqbryfyglzmvcmrcwuzrystvwzkudxolkybhsdgjyrazdfglgtxkoaergdcrzhmcnvhpjmwxosgoqtdfthsmktlixgmduuzbditbbnunaqsoclsksirwzspmezwuxvpneqiodszvpwhogttlczhajemqqptzwcorbwharzrhgsbzvlaavtnyzzzzpmhdbaeucpzhkuloqazlrzrrmtsfbantgsnkbjwsobmkgnjehuggylmigpcrzhyknyvaokrmtffxbsrqnpdknsvirbbnvyncuhfjmdzdtddokgnkkncymmxleovryozqyogzilddrcipgvlsxnsqalpevdpzvomqybgvaelsqbgimywafscl";
        String s4 = "ikqqtbcgaxpouokcinzukfbflxxedlvnwjcxvxqpprfdlnfjsbsydsbhotowsfqluyjddjjzvkomcjeqjeqhfqxlpeoegtscihbllwrcsouizxkpewioljfecoceyzufemsuwtsumgzrfogxcmcchfiddptrmywycajiswvhuimvomwllnxhnwjgkexabwlrmdrwmgndbprasmgjrpgyjmnxosdiwbgrhxeogkfoiinbzjtzcfxfmwxhwusymdkztjzrzjqeznbemdmhwvqybdtuqvbpxiyqjamvjcnvjobohuaoexxxgcbdmzrqaarqenpyieturtbexrtnvoktikzfizglgvcbjizdxjhdovzzurqtdskpgiopqtlfhwzargrkjcjolejfqdrtvzmbosojazwrltfhgshirokarcfylkasmbvykwhmkqqqvojfexgbjfmhsgievddopsnvkrkbawccffokklqtpxbymplpyqovcgatjedunhlcqbgguftsrnmgchvrigkgjhrpbzqqdxajsoyszquhiuxwxfcgpeqjqochjsuogpykrejgkcpodsqmrpzucywpdxxijgjfgesurrsxoztvcenbxfwbvafnjgexneozachiqmzceuybdiwcarqmtrrtecnjngkmhzjnbrrhrrxjhawccckedupovuldxixxdhqgbigyboopojechfkkvcbkicjhcjbtcjhemnyahfutznnxyjgqgoikrhzxwfmbtjvvwdpwtnqfizcyxcifzwtnqyjrdhxlytpuravayeibpmdqdbaforeuxoscmbbtbmjhkqvhlhrguojinhlbviwfedxwcfrrfbwvebtvafunwikewprczwoktilpygactymtebkvxwwfjaruwplntlrpuyjlxsxfuyrrlkncfcrmppfqongnjuroqocncadtyzafumkhqbnnokjxpfuinhqshuwggfiwuubimnvyqxvjgovuugwidyxofseymjmelcsfevovloyfeshfpqcufzwcjlqhjmwhmhxnkdnbdssvfyepvtufmmiqqxidxliwxszvzjnahjamnkuthflgplzckrobeqodxjhtxuhcybusxxdondpiheigvcosyfffxlshzxcteurtqvuqwynysjksywbqvwmfxmbqtiuxhrvvylwpesruwjtsogsjeulhnayhjvutuvtkzblguvkmsegclbeylzdoxmcamhqkkwkkrbmyhrrgjmqlpyfjvzpwljabkkuwatvyhgmaygfoqqlnbfmxxgqaidpfggmhfxnhwmacxajyovsxbxmrqaktakxawmmwvffecqvqepxgqcqpdrugwahjcicekwhtiunifqhyuhjkekmripysocpojlrgxfvsvqjsygpyjfieyrgaldnezcyqlxzzebjikeoayvxuqhfwdnqtmghknujnsrqkuubpbnloatkedtxbbqtyfuvuhbtvpnbwhqkmqyzoyaaobzbfnugjopvknxfpxnpmvkepekawdze";


        SuffixTree trie = new SuffixTree(4);
//        int strNmbr = Integer.parseInt(reader.readLine());
//
//        for(int i = 0; i < strNmbr; i++){
//            trie.addWord(reader.readLine() + "@");
//        }

        trie.addWord(s1);
        trie.addWord(s2);
        trie.addWord(s3);
        trie.addWord(s4);

        long endInsertTime = System.nanoTime();
        System.out.println("insert: " + (endInsertTime - startTime));

        String longestSubstring = trie.getLongestSubstring();
        if(longestSubstring.charAt(longestSubstring.length() - 1) == '@'){
            longestSubstring = longestSubstring.substring(0, longestSubstring.length() - 1);
        }
        System.out.println(longestSubstring);
        long endSearchTime = System.nanoTime();
        System.out.println("search: " + (endSearchTime - endInsertTime));
    }
}

class SuffixTree {

    private Vertex rootVertex;
    private String[] wordMap;
    private int wordPosition = 0;

    public SuffixTree(int wordsNr) {
        rootVertex = new Vertex(null);
        wordMap = new String[wordsNr];
    }

    public Vertex getRootVertex() {
        return rootVertex;
    }

    public void addWord(String word){
        wordMap[wordPosition++] = word;
        for (int i = 0; i < word.length() - 1; i++) {
            addSuffix(word, wordPosition - 1, i);
        }
    }

    public void addSuffix(String suffix, int wordIndex, int startPosition) {
        addSuffix(suffix, wordIndex, rootVertex, startPosition);
    }

    private void addSuffix(String suffix, int wordIndex, Vertex parent, int shift) {
        Map.Entry<Edge, Vertex> matchingNode = findMatchingVertex(suffix, parent, shift);
        if (matchingNode != null) {
            Vertex vertex = matchingNode.getValue();
            Edge edge = matchingNode.getKey();
            String vertexString = getVertexString(edge);
            int cnt = 0;
            int length = Math.min(suffix.length() - shift, edge.getEndIndex() - edge.getStartIndex());
            for (int i = 0; i < length; i++) {
                if (suffix.charAt(i + shift) == vertexString.charAt(i)) { //wordMap.get(edge.getWordIndex()).charAt(edge.getStartIndex() + i)
                    ++cnt;
                } else {
                    break;
                }
            }
            int prefixLength = cnt;

            if (suffix.length() - shift - prefixLength == 0) {
                vertex.addWordIndex(wordIndex);
                return;
            } else if (vertexString.length() <= prefixLength) {
                vertex.addWordIndex(wordIndex);
                addSuffix(suffix, wordIndex, vertex, shift + prefixLength);
            } else {
                Edge prefixEdge = new Edge(edge.getWordIndex(), edge.getStartIndex(), edge.getStartIndex() + prefixLength);
                Vertex prefixVertex = new Vertex(parent, vertex.getIndexes());

                parent.removeChild(edge);

                edge.setStartIndex(edge.getStartIndex() + prefixLength);

                Edge newEdge = new Edge(wordIndex, shift + prefixLength, suffix.length());
                Vertex newVertex = new Vertex(prefixVertex);
                newVertex.addWordIndex(wordIndex);

                parent.addChild(prefixEdge, prefixVertex);
                parent.addWordIndex(wordIndex);

                prefixVertex.addChild(edge, vertex);
                prefixVertex.addWordIndex(edge.getWordIndex());

                prefixVertex.addChild(newEdge, newVertex);
                prefixVertex.addWordIndex(wordIndex);
            }
        } else {
            Edge edge = new Edge(wordIndex, shift, suffix.length());
            Vertex vertex = new Vertex(parent);
            vertex.addWordIndex(wordIndex);

            parent.addChild(edge, vertex);
        }
    }

    private Map.Entry<Edge, Vertex> findMatchingVertex(String suffix, Vertex parent, int shift) {
        Map.Entry<Edge, Vertex> match = null;
        Map<Edge, Vertex> children = parent.getChildren();
        if (children != null) {
            for (Map.Entry<Edge, Vertex> entry : children.entrySet()) {
                Edge edge = entry.getKey();
                String vertexString = getVertexString(edge);
                if (isVertexSuitable(suffix, vertexString, shift)) {
                    match = entry;
                    break;
                }
            }
        }
        return match;
    }

    private boolean isVertexSuitable(String suffix, String vertexString, int shift) {
        return vertexString.charAt(0) == suffix.charAt(shift);
    }

    private String getVertexString(Edge edge) {
        return wordMap[edge.getWordIndex()].substring(edge.getStartIndex(), edge.getEndIndex());
    }

    public String getWord(int wordIndex) {
        return wordMap[wordIndex];
    }

    public String getLongestSubstring() {
        Set<String> subSet = Collections.synchronizedSet(new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string2.length() - string1.length();
            }
        }));

        getSubstrings(rootVertex, subSet, "");

        return subSet.iterator().next();
    }

    private void getSubstrings(Vertex parent, Set<String> strings, String substring) {
        int commonSubstringsCounter = 0;
        for(Map.Entry<Edge, Vertex> entry : parent.getChildren().entrySet()){
            if(entry.getValue().getIndexes().size() == wordMap.length){
                Edge edge = entry.getKey();
                String vertexString = wordMap[edge.getWordIndex()].substring(edge.getStartIndex(), edge.getEndIndex());
                getSubstrings(entry.getValue(), strings, substring + vertexString);
                commonSubstringsCounter++;
            }
        }
        if(commonSubstringsCounter == 0){
            strings.add(substring);
        }
    }
}

class Vertex {

    private Vertex parent;
    private Map<Edge, Vertex> children = new HashMap<Edge, Vertex>();
    private Set<Integer> indexes = new HashSet<Integer>();

    public Vertex(Vertex parent) {
        this(parent, new HashSet<Integer>());
    }

    public Vertex(Vertex parent, Set<Integer> indexes) {
        this.parent = parent;
        this.indexes = indexes;
    }

    public void addChild(Edge edge, Vertex vertex){
        children.put(edge, vertex);
    }

    public Vertex getParent() {
        return parent;
    }

    public Map<Edge, Vertex> getChildren(){
        return Collections.unmodifiableMap(children);
    }

    public void addWordIndex(Integer wordIndex){
        indexes.add(wordIndex);
    }

    public Set<Integer> getIndexes() {
        return indexes;
    }

    public void removeChild(Edge edge) {
        children.remove(edge);
    }

    public void addChildren(Map<Edge, Vertex> children) {
        this.children.putAll(children);
    }
}

class Edge {
    private int startIndex;
    private int endIndex;
    private int wordIndex;

    public Edge(int wordIndex, int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.wordIndex = wordIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getWordIndex() {
        return wordIndex;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        if (endIndex != edge.endIndex) return false;
        if (startIndex != edge.startIndex) return false;
        if (wordIndex != edge.wordIndex) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = startIndex;
        result = 31 * result + endIndex;
        result = 31 * result + wordIndex;
        return result;
    }
}
