package me.ykrank.s1next.widget

import android.content.Context
import android.util.SparseArray

import me.ykrank.s1next.R
import me.ykrank.s1next.data.api.model.Emoticon

/**
 * A factory provides emotions.
 */
class EmoticonFactory(context: Context) {

    val emotionTypeTitles: List<String> = context.resources.getStringArray(R.array.emoticon_type).toList()
    private val mEmoticons: SparseArray<List<Emoticon>> = SparseArray()

    private val faceEmoticonList: List<Emoticon> = listOf(
            emoticon("face2017/001.png", "[f:001]"),
            emoticon("face2017/002.png", "[f:002]"),
            emoticon("face2017/003.png", "[f:003]"),
            emoticon("face2017/004.gif", "[f:004]"),
            emoticon("face2017/005.png", "[f:005]"),
            emoticon("face2017/006.png", "[f:006]"),
            emoticon("face2017/007.png", "[f:007]"),
            emoticon("face2017/008.png", "[f:008]"),
            emoticon("face2017/009.gif", "[f:009]"),
            emoticon("face2017/010.png", "[f:010]"),
            emoticon("face2017/011.png", "[f:011]"),
            emoticon("face2017/012.png", "[f:012]"),
            emoticon("face2017/013.png", "[f:013]"),
            emoticon("face2017/014.png", "[f:014]"),
            emoticon("face2017/015.png", "[f:015]"),
            emoticon("face2017/016.png", "[f:016]"),
            emoticon("face2017/017.png", "[f:017]"),
            emoticon("face2017/018.png", "[f:018]"),
            emoticon("face2017/019.png", "[f:019]"),
            emoticon("face2017/020.png", "[f:020]"),
            emoticon("face2017/021.png", "[f:021]"),
            emoticon("face2017/022.png", "[f:022]"),
            emoticon("face2017/023.png", "[f:023]"),
            emoticon("face2017/024.png", "[f:024]"),
            emoticon("face2017/025.png", "[f:025]"),
            emoticon("face2017/026.png", "[f:026]"),
            emoticon("face2017/027.png", "[f:027]"),
            emoticon("face2017/028.png", "[f:028]"),
            emoticon("face2017/029.png", "[f:029]"),
            emoticon("face2017/030.png", "[f:030]"),
            emoticon("face2017/031.png", "[f:031]"),
            emoticon("face2017/032.png", "[f:032]"),
            emoticon("face2017/033.png", "[f:033]"),
            emoticon("face2017/034.png", "[f:034]"),
            emoticon("face2017/035.png", "[f:035]"),
            emoticon("face2017/036.png", "[f:036]"),
            emoticon("face2017/037.png", "[f:037]"),
            emoticon("face2017/038.png", "[f:038]"),
            emoticon("face2017/039.png", "[f:039]"),
            emoticon("face2017/040.png", "[f:040]"),
            emoticon("face2017/041.png", "[f:041]"),
            emoticon("face2017/042.png", "[f:042]"),
            emoticon("face2017/043.png", "[f:043]"),
            emoticon("face2017/044.png", "[f:044]"),
            emoticon("face2017/045.png", "[f:045]"),
            emoticon("face2017/046.png", "[f:046]"),
            emoticon("face2017/047.png", "[f:047]"),
            emoticon("face2017/048.png", "[f:048]"),
            emoticon("face2017/049.png", "[f:049]"),
            emoticon("face2017/050.png", "[f:050]"),
            emoticon("face2017/051.png", "[f:051]"),
            emoticon("face2017/052.png", "[f:052]"),
            emoticon("face2017/053.png", "[f:053]"),
            emoticon("face2017/054.png", "[f:054]"),
            emoticon("face2017/055.png", "[f:055]"),
            emoticon("face2017/056.gif", "[f:056]"),
            emoticon("face2017/057.png", "[f:057]"),
            emoticon("face2017/058.png", "[f:058]"),
            emoticon("face2017/059.png", "[f:059]"),
            emoticon("face2017/060.png", "[f:060]"),
            emoticon("face2017/061.gif", "[f:061]"),
            emoticon("face2017/062.gif", "[f:062]"),
            emoticon("face2017/063.png", "[f:063]"),
            emoticon("face2017/064.png", "[f:064]"),
            emoticon("face2017/065.png", "[f:065]"),
            emoticon("face2017/066.png", "[f:066]"),
            emoticon("face2017/067.png", "[f:067]"),
            emoticon("face2017/068.png", "[f:068]"),
            emoticon("face2017/069.png", "[f:069]"),
            emoticon("face2017/070.png", "[f:070]"),
            emoticon("face2017/071.png", "[f:071]"),
            emoticon("face2017/072.png", "[f:072]"),
            emoticon("face2017/073.png", "[f:073]"),
            emoticon("face2017/074.png", "[f:074]"),
            emoticon("face2017/075.png", "[f:075]"),
            emoticon("face2017/076.png", "[f:076]"),
            emoticon("face2017/077.png", "[f:077]"),
            emoticon("face2017/078.png", "[f:078]"),
            emoticon("face2017/079.png", "[f:079]"),
            emoticon("face2017/080.png", "[f:080]"),
            emoticon("face2017/081.png", "[f:081]"),
            emoticon("face2017/082.png", "[f:082]"),
            emoticon("face2017/083.png", "[f:083]"),
            emoticon("face2017/084.png", "[f:084]"),
            emoticon("face2017/085.png", "[f:085]"),
            emoticon("face2017/086.png", "[f:086]"),
            emoticon("face2017/087.gif", "[f:087]"),
            emoticon("face2017/088.png", "[f:088]"),
            emoticon("face2017/089.png", "[f:089]"),
            emoticon("face2017/090.png", "[f:090]"),
            emoticon("face2017/091.png", "[f:091]"),
            emoticon("face2017/092.png", "[f:092]"),
            emoticon("face2017/093.png", "[f:093]"),
            emoticon("face2017/094.png", "[f:094]"),
            emoticon("face2017/095.png", "[f:095]"),
            emoticon("face2017/096.png", "[f:096]"),
            emoticon("face2017/097.png", "[f:097]"),
            emoticon("face2017/098.png", "[f:098]"),
            emoticon("face2017/099.png", "[f:099]"),
            emoticon("face2017/100.png", "[f:100]"),
            emoticon("face2017/101.png", "[f:101]"),
            emoticon("face2017/102.png", "[f:102]"),
            emoticon("face2017/103.png", "[f:103]"),
            emoticon("face2017/104.png", "[f:104]"),
            emoticon("face2017/105.png", "[f:105]"),
            emoticon("face2017/106.png", "[f:106]"),
            emoticon("face2017/107.png", "[f:107]"),
            emoticon("face2017/108.png", "[f:108]"),
            emoticon("face2017/109.png", "[f:109]"),
            emoticon("face2017/110.png", "[f:110]"),
            emoticon("face2017/111.png", "[f:111]"),
            emoticon("face2017/112.png", "[f:112]"),
            emoticon("face2017/113.png", "[f:113]"),
            emoticon("face2017/114.png", "[f:114]"),
            emoticon("face2017/115.gif", "[f:115]"),
            emoticon("face2017/116.png", "[f:116]"),
            emoticon("face2017/117.png", "[f:117]"),
            emoticon("face2017/118.png", "[f:118]"),
            emoticon("face2017/119.png", "[f:119]"),
            emoticon("face2017/120.gif", "[f:120]"),
            emoticon("face2017/121.png", "[f:121]"),
            emoticon("face2017/122.png", "[f:122]"),
            emoticon("face2017/123.png", "[f:123]"),
            emoticon("face2017/124.png", "[f:124]"),
            emoticon("face2017/125.png", "[f:125]"),
            emoticon("face2017/126.png", "[f:126]"),
            emoticon("face2017/127.png", "[f:127]"),
            emoticon("face2017/128.png", "[f:128]"),
            emoticon("face2017/129.png", "[f:129]"),
            emoticon("face2017/130.png", "[f:130]"),
            emoticon("face2017/131.png", "[f:131]"),
            emoticon("face2017/132.png", "[f:132]"),
            emoticon("face2017/133.png", "[f:133]"),
            emoticon("face2017/134.png", "[f:134]"),
            emoticon("face2017/135.png", "[f:135]"),
            emoticon("face2017/136.png", "[f:136]"),
            emoticon("face2017/137.gif", "[f:137]"),
            emoticon("face2017/138.png", "[f:138]"),
            emoticon("face2017/139.png", "[f:139]"),
            emoticon("face2017/140.png", "[f:140]"),
            emoticon("face2017/141.png", "[f:141]"),
            emoticon("face2017/142.png", "[f:142]"),
            emoticon("face2017/143.png", "[f:143]"),
            emoticon("face2017/144.png", "[f:144]"),
            emoticon("face2017/145.png", "[f:145]"),
            emoticon("face2017/146.png", "[f:146]"),
            emoticon("face2017/147.png", "[f:147]"),
            emoticon("face2017/148.png", "[f:148]"),
            emoticon("face2017/149.png", "[f:149]"),
            emoticon("face2017/150.png", "[f:150]"),
            emoticon("face2017/151.png", "[f:151]"),
            emoticon("face2017/152.png", "[f:152]"),
            emoticon("face2017/153.png", "[f:153]"),
            emoticon("face2017/154.png", "[f:154]"),
            emoticon("face2017/155.png", "[f:155]"),
            emoticon("face2017/156.png", "[f:156]"),
            emoticon("face2017/157.png", "[f:157]"),
            emoticon("face2017/158.png", "[f:158]"),
            emoticon("face2017/159.png", "[f:159]"),
            emoticon("face2017/160.png", "[f:160]"),
            emoticon("face2017/161.png", "[f:161]"),
            emoticon("face2017/162.png", "[f:162]"),
            emoticon("face2017/163.png", "[f:163]"),
            emoticon("face2017/164.png", "[f:164]"),
            emoticon("face2017/165.png", "[f:165]"),
            emoticon("face2017/166.png", "[f:166]"),
            emoticon("face2017/167.png", "[f:167]"),
            emoticon("face2017/168.gif", "[f:168]"),
            emoticon("face2017/169.gif", "[f:169]"),
            emoticon("face2017/170.png", "[f:170]"),
            emoticon("face2017/171.png", "[f:171]"),
            emoticon("face2017/172.png", "[f:172]"),
            emoticon("face2017/173.png", "[f:173]"),
            emoticon("face2017/174.png", "[f:174]"),
            emoticon("face2017/175.gif", "[f:175]"),
            emoticon("face2017/176.png", "[f:176]"),
            emoticon("face2017/177.png", "[f:177]"),
            emoticon("face2017/178.png", "[f:178]"),
            emoticon("face2017/179.png", "[f:179]"),
            emoticon("face2017/180.png", "[f:180]"),
            emoticon("face2017/181.png", "[f:181]"),
            emoticon("face2017/182.png", "[f:182]"),
            emoticon("face2017/183.png", "[f:183]"),
            emoticon("face2017/184.png", "[f:184]"),
            emoticon("face2017/185.png", "[f:185]"),
            emoticon("face2017/186.png", "[f:186]"),
            emoticon("face2017/187.png", "[f:187]"),
            emoticon("face2017/188.png", "[f:188]"),
            emoticon("face2017/189.png", "[f:189]"),
            emoticon("face2017/190.png", "[f:190]"),
            emoticon("face2017/191.png", "[f:191]"),
            emoticon("face2017/192.png", "[f:192]"),
            emoticon("face2017/193.png", "[f:193]"),
            emoticon("face2017/194.png", "[f:194]"),
            emoticon("face2017/195.png", "[f:195]"),
            emoticon("face2017/196.png", "[f:196]"),
            emoticon("face2017/197.png", "[f:197]"),
            emoticon("face2017/198.png", "[f:198]"),
            emoticon("face2017/199.png", "[f:199]"),
            emoticon("face2017/200.png", "[f:200]"),
            emoticon("face2017/201.png", "[f:201]"),
            emoticon("face2017/202.png", "[f:202]"),
            emoticon("face2017/203.png", "[f:203]"),
            emoticon("face2017/204.png", "[f:204]"),
            emoticon("face2017/205.png", "[f:205]"),
            emoticon("face2017/206.gif", "[f:206]"),
            emoticon("face2017/207.png", "[f:207]"),
            emoticon("face2017/208.png", "[f:208]"),
            emoticon("face2017/209.gif", "[f:209]"),
            emoticon("face2017/210.gif", "[f:210]"),
            emoticon("face2017/211.gif", "[f:211]"),
            emoticon("face2017/212.gif", "[f:212]"),
            emoticon("face2017/213.png", "[f:213]"),
            emoticon("face2017/214.png", "[f:214]"),
            emoticon("face2017/215.png", "[f:215]"),
            emoticon("face2017/216.png", "[f:216]")
    )


    private val cartonEmoticonList: List<Emoticon> = listOf(
            emoticon("carton2017/001.png", "[c:001]"),
            emoticon("carton2017/002.png", "[c:002]"),
            emoticon("carton2017/003.png", "[c:003]"),
            emoticon("carton2017/004.png", "[c:004]"),
            emoticon("carton2017/005.png", "[c:005]"),
            emoticon("carton2017/006.png", "[c:006]"),
            emoticon("carton2017/007.png", "[c:007]"),
            emoticon("carton2017/008.png", "[c:008]"),
            emoticon("carton2017/009.png", "[c:009]"),
            emoticon("carton2017/010.png", "[c:010]"),
            emoticon("carton2017/011.png", "[c:011]"),
            emoticon("carton2017/012.png", "[c:012]"),
            emoticon("carton2017/013.png", "[c:013]"),
            emoticon("carton2017/014.png", "[c:014]"),
            emoticon("carton2017/015.png", "[c:015]"),
            emoticon("carton2017/016.gif", "[c:016]"),
            emoticon("carton2017/017.png", "[c:017]"),
            emoticon("carton2017/018.gif", "[c:018]"),
            emoticon("carton2017/019.png", "[c:019]"),
            emoticon("carton2017/020.png", "[c:020]"),
            emoticon("carton2017/021.png", "[c:021]"),
            emoticon("carton2017/022.png", "[c:022]"),
            emoticon("carton2017/023.png", "[c:023]"),
            emoticon("carton2017/024.png", "[c:024]"),
            emoticon("carton2017/025.png", "[c:025]"),
            emoticon("carton2017/026.png", "[c:026]"),
            emoticon("carton2017/027.png", "[c:027]"),
            emoticon("carton2017/028.png", "[c:028]"),
            emoticon("carton2017/029.png", "[c:029]"),
            emoticon("carton2017/030.png", "[c:030]"),
            emoticon("carton2017/031.png", "[c:031]"),
            emoticon("carton2017/032.png", "[c:032]"),
            emoticon("carton2017/033.png", "[c:033]"),
            emoticon("carton2017/034.png", "[c:034]"),
            emoticon("carton2017/035.png", "[c:035]"),
            emoticon("carton2017/036.png", "[c:036]"),
            emoticon("carton2017/037.png", "[c:037]"),
            emoticon("carton2017/038.png", "[c:038]"),
            emoticon("carton2017/039.png", "[c:039]"),
            emoticon("carton2017/040.png", "[c:040]"),
            emoticon("carton2017/041.png", "[c:041]"),
            emoticon("carton2017/042.png", "[c:042]"),
            emoticon("carton2017/043.png", "[c:043]"),
            emoticon("carton2017/044.png", "[c:044]"),
            emoticon("carton2017/045.png", "[c:045]"),
            emoticon("carton2017/046.png", "[c:046]"),
            emoticon("carton2017/047.png", "[c:047]"),
            emoticon("carton2017/048.png", "[c:048]"),
            emoticon("carton2017/049.gif", "[c:049]"),
            emoticon("carton2017/050.png", "[c:050]"),
            emoticon("carton2017/051.png", "[c:051]"),
            emoticon("carton2017/052.png", "[c:052]"),
            emoticon("carton2017/053.png", "[c:053]"),
            emoticon("carton2017/054.png", "[c:054]"),
            emoticon("carton2017/055.png", "[c:055]"),
            emoticon("carton2017/056.png", "[c:056]"),
            emoticon("carton2017/057.png", "[c:057]"),
            emoticon("carton2017/058.png", "[c:058]"),
            emoticon("carton2017/059.png", "[c:059]"),
            emoticon("carton2017/060.png", "[c:060]"),
            emoticon("carton2017/061.png", "[c:061]"),
            emoticon("carton2017/062.png", "[c:062]"),
            emoticon("carton2017/063.png", "[c:063]"),
            emoticon("carton2017/064.png", "[c:064]"),
            emoticon("carton2017/065.png", "[c:065]"),
            emoticon("carton2017/066.png", "[c:066]"),
            emoticon("carton2017/067.png", "[c:067]"),
            emoticon("carton2017/068.png", "[c:068]"),
            emoticon("carton2017/069.png", "[c:069]"),
            emoticon("carton2017/070.png", "[c:070]"),
            emoticon("carton2017/071.png", "[c:071]"),
            emoticon("carton2017/072.png", "[c:072]"),
            emoticon("carton2017/073.png", "[c:073]"),
            emoticon("carton2017/074.png", "[c:074]"),
            emoticon("carton2017/075.png", "[c:075]"),
            emoticon("carton2017/076.png", "[c:076]"),
            emoticon("carton2017/077.gif", "[c:077]"),
            emoticon("carton2017/078.png", "[c:078]"),
            emoticon("carton2017/079.png", "[c:079]"),
            emoticon("carton2017/080.png", "[c:080]"),
            emoticon("carton2017/081.png", "[c:081]"),
            emoticon("carton2017/082.png", "[c:082]"),
            emoticon("carton2017/083.png", "[c:083]"),
            emoticon("carton2017/084.png", "[c:084]"),
            emoticon("carton2017/085.png", "[c:085]"),
            emoticon("carton2017/086.png", "[c:086]"),
            emoticon("carton2017/087.png", "[c:087]"),
            emoticon("carton2017/088.png", "[c:088]"),
            emoticon("carton2017/089.gif", "[c:089]"),
            emoticon("carton2017/090.gif", "[c:090]"),
            emoticon("carton2017/091.gif", "[c:091]"),
            emoticon("carton2017/092.gif", "[c:092]"),
            emoticon("carton2017/093.gif", "[c:093]"),
            emoticon("carton2017/094.gif", "[c:094]"),
            emoticon("carton2017/095.gif", "[c:095]"),
            emoticon("carton2017/096.gif", "[c:096]"),
            emoticon("carton2017/097.gif", "[c:097]"),
            emoticon("carton2017/098.png", "[c:098]"),
            emoticon("carton2017/099.png", "[c:099]"),
            emoticon("carton2017/100.png", "[c:100]"),
            emoticon("carton2017/101.png", "[c:101]"),
            emoticon("carton2017/102.png", "[c:102]"),
            emoticon("carton2017/103.png", "[c:103]"),
            emoticon("carton2017/104.png", "[c:104]"),
            emoticon("carton2017/105.png", "[c:105]"),
            emoticon("carton2017/106.png", "[c:106]"),
            emoticon("carton2017/107.png", "[c:107]"),
            emoticon("carton2017/108.png", "[c:108]"),
            emoticon("carton2017/109.png", "[c:109]"),
            emoticon("carton2017/110.png", "[c:110]"),
            emoticon("carton2017/111.png", "[c:111]"),
            emoticon("carton2017/112.png", "[c:112]"),
            emoticon("carton2017/113.png", "[c:113]"),
            emoticon("carton2017/114.gif", "[c:114]"),
            emoticon("carton2017/115.png", "[c:115]"),
            emoticon("carton2017/116.png", "[c:116]"),
            emoticon("carton2017/117.png", "[c:117]"),
            emoticon("carton2017/118.png", "[c:118]"),
            emoticon("carton2017/119.png", "[c:119]"),
            emoticon("carton2017/120.png", "[c:120]"),
            emoticon("carton2017/121.png", "[c:121]"),
            emoticon("carton2017/122.png", "[c:122]"),
            emoticon("carton2017/123.png", "[c:123]"),
            emoticon("carton2017/124.png", "[c:124]"),
            emoticon("carton2017/125.png", "[c:125]"),
            emoticon("carton2017/126.png", "[c:126]"),
            emoticon("carton2017/127.png", "[c:127]"),
            emoticon("carton2017/128.png", "[c:128]"),
            emoticon("carton2017/129.png", "[c:129]"),
            emoticon("carton2017/130.png", "[c:130]"),
            emoticon("carton2017/131.png", "[c:131]"),
            emoticon("carton2017/132.png", "[c:132]"),
            emoticon("carton2017/133.png", "[c:133]"),
            emoticon("carton2017/134.png", "[c:134]"),
            emoticon("carton2017/135.png", "[c:135]"),
            emoticon("carton2017/136.png", "[c:136]"),
            emoticon("carton2017/137.png", "[c:137]"),
            emoticon("carton2017/138.png", "[c:138]"),
            emoticon("carton2017/139.png", "[c:139]"),
            emoticon("carton2017/140.png", "[c:140]"),
            emoticon("carton2017/141.png", "[c:141]"),
            emoticon("carton2017/142.png", "[c:142]"),
            emoticon("carton2017/143.png", "[c:143]"),
            emoticon("carton2017/144.png", "[c:144]"),
            emoticon("carton2017/145.png", "[c:145]"),
            emoticon("carton2017/146.png", "[c:146]"),
            emoticon("carton2017/147.png", "[c:147]"),
            emoticon("carton2017/148.png", "[c:148]"),
            emoticon("carton2017/149.png", "[c:149]"),
            emoticon("carton2017/150.png", "[c:150]"),
            emoticon("carton2017/151.png", "[c:151]"),
            emoticon("carton2017/152.png", "[c:152]"),
            emoticon("carton2017/153.png", "[c:153]"),
            emoticon("carton2017/154.png", "[c:154]"),
            emoticon("carton2017/155.png", "[c:155]"),
            emoticon("carton2017/156.png", "[c:156]"),
            emoticon("carton2017/157.gif", "[c:157]"),
            emoticon("carton2017/158.gif", "[c:158]"),
            emoticon("carton2017/159.png", "[c:159]"),
            emoticon("carton2017/160.png", "[c:160]"),
            emoticon("carton2017/161.png", "[c:161]"),
            emoticon("carton2017/162.png", "[c:162]"),
            emoticon("carton2017/163.png", "[c:163]"),
            emoticon("carton2017/164.png", "[c:164]"),
            emoticon("carton2017/165.png", "[c:165]"),
            emoticon("carton2017/166.png", "[c:166]"),
            emoticon("carton2017/167.png", "[c:167]"),
            emoticon("carton2017/168.png", "[c:168]"),
            emoticon("carton2017/169.png", "[c:169]"),
            emoticon("carton2017/170.png", "[c:170]"),
            emoticon("carton2017/171.png", "[c:171]"),
            emoticon("carton2017/172.png", "[c:172]"),
            emoticon("carton2017/173.png", "[c:173]"),
            emoticon("carton2017/174.png", "[c:174]"),
            emoticon("carton2017/175.png", "[c:175]"),
            emoticon("carton2017/176.png", "[c:176]"),
            emoticon("carton2017/177.png", "[c:177]"),
            emoticon("carton2017/178.png", "[c:178]"),
            emoticon("carton2017/179.png", "[c:179]"),
            emoticon("carton2017/180.png", "[c:180]"),
            emoticon("carton2017/181.png", "[c:181]"),
            emoticon("carton2017/182.png", "[c:182]"),
            emoticon("carton2017/183.png", "[c:183]"),
            emoticon("carton2017/184.png", "[c:184]"),
            emoticon("carton2017/185.png", "[c:185]"),
            emoticon("carton2017/186.png", "[c:186]"),
            emoticon("carton2017/187.png", "[c:187]"),
            emoticon("carton2017/188.png", "[c:188]"),
            emoticon("carton2017/189.png", "[c:189]"),
            emoticon("carton2017/190.png", "[c:190]"),
            emoticon("carton2017/191.png", "[c:191]"),
            emoticon("carton2017/192.png", "[c:192]"),
            emoticon("carton2017/193.png", "[c:193]"),
            emoticon("carton2017/194.png", "[c:194]"),
            emoticon("carton2017/195.png", "[c:195]"),
            emoticon("carton2017/196.png", "[c:196]"),
            emoticon("carton2017/197.png", "[c:197]"),
            emoticon("carton2017/198.png", "[c:198]"),
            emoticon("carton2017/199.png", "[c:199]"),
            emoticon("carton2017/200.png", "[c:200]"),
            emoticon("carton2017/201.png", "[c:201]"),
            emoticon("carton2017/202.png", "[c:202]"),
            emoticon("carton2017/203.png", "[c:203]"),
            emoticon("carton2017/204.gif", "[c:204]"),
            emoticon("carton2017/205.png", "[c:205]"),
            emoticon("carton2017/206.png", "[c:206]"),
            emoticon("carton2017/207.png", "[c:207]"),
            emoticon("carton2017/208.png", "[c:208]"),
            emoticon("carton2017/209.png", "[c:209]"),
            emoticon("carton2017/210.png", "[c:210]"),
            emoticon("carton2017/211.png", "[c:211]"),
            emoticon("carton2017/212.png", "[c:212]"),
            emoticon("carton2017/213.png", "[c:213]"),
            emoticon("carton2017/214.png", "[c:214]"),
            emoticon("carton2017/215.gif", "[c:215]"),
            emoticon("carton2017/216.png", "[c:216]"),
            emoticon("carton2017/217.png", "[c:217]"),
            emoticon("carton2017/218.png", "[c:218]"),
            emoticon("carton2017/219.png", "[c:219]"),
            emoticon("carton2017/220.png", "[c:220]"),
            emoticon("carton2017/221.png", "[c:221]"),
            emoticon("carton2017/222.png", "[c:222]"),
            emoticon("carton2017/223.png", "[c:223]"),
            emoticon("carton2017/224.png", "[c:224]"),
            emoticon("carton2017/225.png", "[c:225]"),
            emoticon("carton2017/226.png", "[c:226]"),
            emoticon("carton2017/227.png", "[c:227]"),
            emoticon("carton2017/228.png", "[c:228]"),
            emoticon("carton2017/229.png", "[c:229]"),
            emoticon("carton2017/230.png", "[c:230]"),
            emoticon("carton2017/231.png", "[c:231]"),
            emoticon("carton2017/232.png", "[c:232]"),
            emoticon("carton2017/233.png", "[c:233]"),
            emoticon("carton2017/234.png", "[c:234]"),
            emoticon("carton2017/235.png", "[c:235]"),
            emoticon("carton2017/236.png", "[c:236]"),
            emoticon("carton2017/237.png", "[c:237]"),
            emoticon("carton2017/238.png", "[c:238]"),
            emoticon("carton2017/239.png", "[c:239]"),
            emoticon("carton2017/240.png", "[c:240]"),
            emoticon("carton2017/241.png", "[c:241]"),
            emoticon("carton2017/242.png", "[c:242]"),
            emoticon("carton2017/243.png", "[c:243]"),
            emoticon("carton2017/244.png", "[c:244]"),
            emoticon("carton2017/245.gif", "[c:245]"),
            emoticon("carton2017/246.gif", "[c:246]"),
            emoticon("carton2017/247.gif", "[c:247]"),
            emoticon("carton2017/248.png", "[c:248]"),
            emoticon("carton2017/249.png", "[c:249]"),
            emoticon("carton2017/250.png", "[c:250]"),
            emoticon("carton2017/251.png", "[c:251]")
    )

    private val animalEmoticonList: List<Emoticon> = listOf(
            emoticon("animal2017/001.png", "[a:001]"),
            emoticon("animal2017/002.png", "[a:002]"),
            emoticon("animal2017/003.png", "[a:003]"),
            emoticon("animal2017/004.png", "[a:004]"),
            emoticon("animal2017/005.png", "[a:005]"),
            emoticon("animal2017/006.png", "[a:006]"),
            emoticon("animal2017/007.png", "[a:007]"),
            emoticon("animal2017/008.png", "[a:008]"),
            emoticon("animal2017/009.png", "[a:009]"),
            emoticon("animal2017/010.png", "[a:010]"),
            emoticon("animal2017/011.png", "[a:011]"),
            emoticon("animal2017/012.png", "[a:012]"),
            emoticon("animal2017/013.png", "[a:013]"),
            emoticon("animal2017/014.png", "[a:014]"),
            emoticon("animal2017/015.png", "[a:015]"),
            emoticon("animal2017/016.png", "[a:016]")
    )

    private val deviceEmoticonList: List<Emoticon> = listOf(
            emoticon("device2017/001.png", "[d:001]"),
            emoticon("device2017/002.png", "[d:002]"),
            emoticon("device2017/003.png", "[d:003]"),
            emoticon("device2017/004.png", "[d:004]"),
            emoticon("device2017/005.png", "[d:005]"),
            emoticon("device2017/006.png", "[d:006]"),
            emoticon("device2017/007.png", "[d:007]"),
            emoticon("device2017/008.png", "[d:008]"),
            emoticon("device2017/009.png", "[d:009]"),
            emoticon("device2017/010.png", "[d:010]"),
            emoticon("device2017/011.png", "[d:011]"),
            emoticon("device2017/012.png", "[d:012]"),
            emoticon("device2017/013.png", "[d:013]"),
            emoticon("device2017/014.png", "[d:014]"),
            emoticon("device2017/015.png", "[d:015]"),
            emoticon("device2017/016.png", "[d:016]"),
            emoticon("device2017/017.gif", "[d:017]"),
            emoticon("device2017/018.png", "[d:018]"),
            emoticon("device2017/019.png", "[d:019]"),
            emoticon("device2017/020.png", "[d:020]"),
            emoticon("device2017/021.png", "[d:021]"),
            emoticon("device2017/022.png", "[d:022]"),
            emoticon("device2017/023.png", "[d:023]"),
            emoticon("device2017/024.png", "[d:024]"),
            emoticon("device2017/025.png", "[d:025]"),
            emoticon("device2017/026.png", "[d:026]"),
            emoticon("device2017/027.png", "[d:027]"),
            emoticon("device2017/028.png", "[d:028]"),
            emoticon("device2017/029.png", "[d:029]"),
            emoticon("device2017/030.png", "[d:030]"),
            emoticon("device2017/031.png", "[d:031]"),
            emoticon("device2017/032.png", "[d:032]")
    )

    private val gooseEmoticonList: List<Emoticon> = listOf(
            emoticon("goose2017/001.png", "[g:001]"),
            emoticon("goose2017/002.png", "[g:002]"),
            emoticon("goose2017/003.png", "[g:003]"),
            emoticon("goose2017/004.png", "[g:004]"),
            emoticon("goose2017/005.png", "[g:005]"),
            emoticon("goose2017/006.png", "[g:006]"),
            emoticon("goose2017/007.png", "[g:007]"),
            emoticon("goose2017/008.png", "[g:008]"),
            emoticon("goose2017/009.png", "[g:009]"),
            emoticon("goose2017/010.png", "[g:010]"),
            emoticon("goose2017/011.png", "[g:011]"),
            emoticon("goose2017/012.png", "[g:012]"),
            emoticon("goose2017/013.png", "[g:013]"),
            emoticon("goose2017/014.png", "[g:014]"),
            emoticon("goose2017/015.png", "[g:015]"),
            emoticon("goose2017/016.png", "[g:016]"),
            emoticon("goose2017/017.png", "[g:017]"),
            emoticon("goose2017/018.png", "[g:018]"),
            emoticon("goose2017/019.png", "[g:019]"),
            emoticon("goose2017/020.png", "[g:020]"),
            emoticon("goose2017/021.png", "[g:021]"),
            emoticon("goose2017/022.png", "[g:022]"),
            emoticon("goose2017/023.png", "[g:023]"),
            emoticon("goose2017/024.png", "[g:024]"),
            emoticon("goose2017/025.png", "[g:025]"),
            emoticon("goose2017/026.png", "[g:026]"),
            emoticon("goose2017/027.png", "[g:027]"),
            emoticon("goose2017/028.png", "[g:028]"),
            emoticon("goose2017/029.png", "[g:029]"),
            emoticon("goose2017/030.png", "[g:030]"),
            emoticon("goose2017/031.png", "[g:031]"),
            emoticon("goose2017/032.png", "[g:032]"),
            emoticon("goose2017/033.png", "[g:033]"),
            emoticon("goose2017/034.png", "[g:034]"),
            emoticon("goose2017/035.png", "[g:035]"),
            emoticon("goose2017/036.png", "[g:036]"),
            emoticon("goose2017/037.png", "[g:037]"),
            emoticon("goose2017/038.png", "[g:038]"),
            emoticon("goose2017/039.png", "[g:039]"),
            emoticon("goose2017/040.png", "[g:040]"),
            emoticon("goose2017/041.png", "[g:041]"),
            emoticon("goose2017/042.png", "[g:042]"),
            emoticon("goose2017/043.png", "[g:043]"),
            emoticon("goose2017/044.png", "[g:044]"),
            emoticon("goose2017/045.png", "[g:045]"),
            emoticon("goose2017/046.png", "[g:046]"),
            emoticon("goose2017/047.png", "[g:047]"),
            emoticon("goose2017/048.png", "[g:048]"),
            emoticon("goose2017/049.png", "[g:049]"),
            emoticon("goose2017/050.png", "[g:050]"),
            emoticon("goose2017/051.png", "[g:051]"),
            emoticon("goose2017/052.png", "[g:052]"),
            emoticon("goose2017/053.png", "[g:053]"),
            emoticon("goose2017/054.png", "[g:054]"),
            emoticon("goose2017/055.png", "[g:055]"),
            emoticon("goose2017/056.png", "[g:056]"),
            emoticon("goose2017/057.png", "[g:057]"),
            emoticon("goose2017/058.png", "[g:058]"),
            emoticon("goose2017/059.png", "[g:059]"),
            emoticon("goose2017/060.png", "[g:060]"),
            emoticon("goose2017/061.png", "[g:061]"),
            emoticon("goose2017/062.png", "[g:062]"),
            emoticon("goose2017/063.png", "[g:063]"),
            emoticon("goose2017/064.png", "[g:064]"),
            emoticon("goose2017/065.png", "[g:065]"),
            emoticon("goose2017/066.png", "[g:066]"),
            emoticon("goose2017/067.png", "[g:067]"),
            emoticon("goose2017/068.png", "[g:068]"),
            emoticon("goose2017/069.png", "[g:069]"),
            emoticon("goose2017/070.png", "[g:070]"),
            emoticon("goose2017/071.png", "[g:071]"),
            emoticon("goose2017/072.png", "[g:072]"),
            emoticon("goose2017/073.png", "[g:073]"),
            emoticon("goose2017/074.png", "[g:074]")
    )

    private val bundamEmoticonList: List<Emoticon> = listOf(
            emoticon("bundam2017/001.png", "[b:001]"),
            emoticon("bundam2017/002.png", "[b:002]"),
            emoticon("bundam2017/003.png", "[b:003]"),
            emoticon("bundam2017/004.png", "[b:004]"),
            emoticon("bundam2017/005.png", "[b:005]"),
            emoticon("bundam2017/006.png", "[b:006]"),
            emoticon("bundam2017/007.png", "[b:007]"),
            emoticon("bundam2017/008.png", "[b:008]"),
            emoticon("bundam2017/009.png", "[b:009]"),
            emoticon("bundam2017/010.png", "[b:010]"),
            emoticon("bundam2017/011.png", "[b:011]"),
            emoticon("bundam2017/012.png", "[b:012]"),
            emoticon("bundam2017/013.png", "[b:013]"),
            emoticon("bundam2017/014.png", "[b:014]"),
            emoticon("bundam2017/015.png", "[b:015]"),
            emoticon("bundam2017/016.png", "[b:016]"),
            emoticon("bundam2017/017.png", "[b:017]"),
            emoticon("bundam2017/018.png", "[b:018]"),
            emoticon("bundam2017/019.png", "[b:019]"),
            emoticon("bundam2017/020.png", "[b:020]"),
            emoticon("bundam2017/021.png", "[b:021]"),
            emoticon("bundam2017/022.png", "[b:022]"),
            emoticon("bundam2017/023.png", "[b:023]"),
            emoticon("bundam2017/024.png", "[b:024]"),
            emoticon("bundam2017/025.png", "[b:025]"),
            emoticon("bundam2017/026.png", "[b:026]"),
            emoticon("bundam2017/027.png", "[b:027]"),
            emoticon("bundam2017/028.png", "[b:028]"),
            emoticon("bundam2017/029.png", "[b:029]"),
            emoticon("bundam2017/030.png", "[b:030]"),
            emoticon("bundam2017/031.png", "[b:031]"),
            emoticon("bundam2017/032.png", "[b:032]"),
            emoticon("bundam2017/033.png", "[b:033]"),
            emoticon("bundam2017/034.png", "[b:034]"),
            emoticon("bundam2017/035.png", "[b:035]"),
            emoticon("bundam2017/036.png", "[b:036]")
    )

    fun getEmoticonsByIndex(index: Int): List<Emoticon> {
        var emoticons: List<Emoticon>? = mEmoticons.get(index)
        if (emoticons == null) {
            when (index) {
                0 -> emoticons = faceEmoticonList
                1 -> emoticons = cartonEmoticonList
                2 -> emoticons = animalEmoticonList
                3 -> emoticons = deviceEmoticonList
                4 -> emoticons = gooseEmoticonList
                5 -> emoticons = bundamEmoticonList
                else -> throw IllegalStateException("Unknown emoticon index: $index.")
            }
        }
        mEmoticons.put(index, emoticons)

        return emoticons
    }


    companion object {
        val ASSET_PATH_EMOTICON = "file:///android_asset/image/emoticon/"

        private fun emoticon(emoticonFileName: String, emoticonEntity: String): Emoticon {
            return Emoticon(ASSET_PATH_EMOTICON + emoticonFileName, emoticonEntity)
        }
    }
}
