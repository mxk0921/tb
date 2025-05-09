package com.taobao.browser.jsbridge.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.LetterListView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.acq;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CityList extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CITY_INFO = "city_info";
    private static final String DATA = "{\"热门\":[[110100,\"北京\",116.41210174560547,39.90364074707031],[310100,\"上海\",121.4745101928711,31.230649948120117],[440100,\"广州\",113.26525115966797,23.128700256347656],[440300,\"深圳\",114.05780029296875,22.54290008544922],[330100,\"杭州\",120.15509033203125,30.27298927307129],[430100,\"长沙\",112.93878173828125,28.227720260620117],[510100,\"成都\",104.0647201538086,30.65867042541504],[500100,\"重庆\",106.5521469116211,29.562820434570312],[210200,\"大连\",121.61470794677734,38.913631439208984],[440600,\"佛山\",113.1217269897461,23.024370193481445],[350100,\"福州\",119.29650115966797,26.073970794677734],[230100,\"哈尔滨\",126.53511810302734,45.80329895019531],[340100,\"合肥\",117.22775268554688,31.820430755615234],[370100,\"济南\",116.99520111083984,36.66537857055664],[330400,\"嘉兴\",120.74832153320312,30.745149612426758],[330700,\"金华\",119.64749145507812,29.0781192779541],[360100,\"南昌\",115.85845184326172,28.6830997467041],[320100,\"南京\",118.79637908935547,32.05830001831055],[330200,\"宁波\",121.54974365234375,29.874040603637695],[370200,\"青岛\",120.38289642333984,36.066158294677734],[460200,\"三亚\",109.51116180419922,18.252399444580078],[330600,\"绍兴\",120.57785034179688,30.004470825195312],[210100,\"沈阳\",123.43182373046875,41.80622863769531],[320500,\"苏州\",120.58541107177734,31.29878044128418],[120100,\"天津\",117.21446990966797,39.12080001831055],[320200,\"无锡\",120.30281829833984,31.56591033935547],[420100,\"武汉\",114.30522918701172,30.592769622802734],[610100,\"西安\",108.94412231445312,34.264801025390625],[350200,\"厦门\",118.0893783569336,24.479530334472656],[321000,\"扬州\",119.41354370117188,32.39379119873047]],\"A\":[[210300,\"鞍山\",122.99420166015625,41.10858154296875],[410500,\"安阳\",114.39305877685547,36.09767150878906],[340800,\"安庆\",117.0571517944336,30.52482032775879],[520400,\"安顺\",105.947509765625,26.2529296875],[513200,\"阿坝\",102.22528076171875,31.90007972717285],[652900,\"阿克苏\",80.26026916503906,41.16864013671875],[659002,\"阿拉尔\",81.2806396484375,40.547969818115234],[152900,\"阿拉善盟\",105.72894287109375,38.85150146484375],[654300,\"阿勒泰\",88.13829803466797,47.849849700927734],[542500,\"阿里地区\",81.1456298828125,30.400529861450195],[610900,\"安康\",109.02745819091797,32.68914031982422]],\"B\":[[110100,\"北京\",116.41210174560547,39.90364074707031],[130600,\"保定\",115.4645004272461,38.8739013671875],[610300,\"宝鸡\",107.23729705810547,34.36193084716797],[150200,\"包头\",109.84111785888672,40.65727996826172],[210500,\"本溪\",123.76766967773438,41.294281005859375],[450500,\"北海\",109.11990356445312,21.481220245361328],[340300,\"蚌埠\",117.3884506225586,32.91548156738281],[220800,\"白城\",122.838623046875,45.61954116821289],[652800,\"巴音郭楞\",86.14511108398438,41.76401138305664],[469025,\"白沙\",109.4537582397461,19.224079132080078],[220600,\"白山\",126.4237289428711,41.940120697021484],[620400,\"白银\",104.13768768310547,36.54467010498047],[451000,\"百色\",106.61775970458984,23.90329933166504],[469029,\"保亭\",{},{}],[530500,\"保山\",99.16179656982422,25.11203956604004],[522400,\"毕节地区\",105.28411102294922,27.302650451660156],[371600,\"滨州\",117.9822006225586,37.376888275146484],[341600,\"亳州\",115.78057098388672,33.852291107177734],[150800,\"巴彦淖尔\",107.38829803466797,40.74287033081055],[511900,\"巴中\",106.74478149414062,31.865110397338867]],\"C\":[[500100,\"重庆\",106.5521469116211,29.562820434570312],[510100,\"成都\",104.0647201538086,30.65867042541504],[430100,\"长沙\",112.93878173828125,28.227720260620117],[220100,\"长春\",125.3235092163086,43.81612014770508],[320400,\"常州\",119.97396087646484,31.80994987487793],[130800,\"承德\",117.94400024414062,40.97806167602539],[130900,\"沧州\",116.838623046875,38.30498123168945],[341100,\"滁州\",118.31688690185547,32.30181121826172],[1341700,\"池州\",{},{}],[150400,\"赤峰\",118.88912963867188,42.25831985473633],[542100,\"昌都地区\",97.17769622802734,31.141010284423828],[652300,\"昌吉州\",87.30815887451172,44.011138916015625],[140400,\"长治\",113.11795043945312,36.195560455322266],[430700,\"常德\",111.6985092163086,29.03158950805664],[341400,\"巢湖\",117.88571166992188,31.619159698486328],[211300,\"朝阳\",120.44992065429688,41.57365036010742],[445100,\"潮州\",116.62288665771484,23.65665054321289],[431000,\"郴州\",113.0145492553711,25.770540237426758],[451400,\"崇左\",107.36638641357422,22.37652015686035],[532300,\"楚雄\",101.52803802490234,25.04538917541504]],\"D\":[[210200,\"大连\",121.61470794677734,38.913631439208984],[441900,\"东莞\",113.75151824951172,23.019929885864258],[140200,\"大同\",113.3000717163086,40.07632827758789],[370500,\"东营\",118.67462158203125,37.43360900878906],[532900,\"大理\",100.26757049560547,25.606420516967773],[230600,\"大庆\",125.10324096679688,46.58930969238281],[210600,\"丹东\",124.384521484375,40.12916946411133],[533100,\"德宏\",98.58480072021484,24.432289123535156],[510600,\"德阳\",104.39755249023438,31.126680374145508],[371400,\"德州\",116.30269622802734,37.4511604309082],[511700,\"达州\",107.47225952148438,31.21441078186035],[232700,\"大兴安岭\",124.30953979492188,51.981441497802734],[533400,\"迪庆\",99.70297241210938,27.819150924682617],[621100,\"定西\",104.62619018554688,35.58047866821289]],\"E\":[[150600,\"鄂尔多斯\",110.02169036865234,39.818031311035156],[420700,\"鄂州\",114.8927001953125,30.39423942565918],[422800,\"恩施\",109.48812103271484,30.27212905883789]],\"F\":[[350100,\"福州\",119.29650115966797,26.073970794677734],[440600,\"佛山\",113.1217269897461,23.024370193481445],[210400,\"抚顺\",123.9542465209961,41.878658294677734],[361000,\"抚州\",116.35283660888672,27.94499969482422],[210900,\"阜新\",121.66963958740234,42.02191162109375],[341200,\"阜阳\",115.8139877319336,32.88970184326172],[450600,\"防城港\",108.35399627685547,21.687089920043945]],\"G\":[[440100,\"广州\",113.26525115966797,23.128700256347656],[450300,\"桂林\",110.29000091552734,25.273330688476562],[520100,\"贵阳\",106.63011932373047,26.647249221801758],[360700,\"赣州\",114.93331146240234,25.829099655151367],[623000,\"甘南\",102.91197967529297,34.98358154296875],[513300,\"甘孜\",101.9630126953125,30.050800323486328],[640400,\"固原\",106.2425537109375,36.01578140258789],[511600,\"广安\",106.63311004638672,30.455890655517578],[510800,\"广元\",105.84358978271484,32.43511962890625],[450800,\"贵港\",109.59677124023438,23.10671043395996],[632600,\"果洛\",100.24484252929688,34.471439361572266]],\"H\":[[330100,\"杭州\",120.15509033203125,30.27298927307129],[340100,\"合肥\",117.22775268554688,31.820430755615234],[230100,\"哈尔滨\",126.53511810302734,45.80329895019531],[460100,\"海口\",110.3359603881836,20.031349182128906],[150100,\"呼和浩特\",111.7499008178711,40.84267044067383],[130400,\"邯郸\",114.49340057373047,36.61172866821289],[330500,\"湖州\",120.08688354492188,30.893770217895508],[341000,\"黄山\",118.33882904052734,29.715410232543945],[441300,\"惠州\",114.41680145263672,23.111160278320312],[320800,\"淮安\",119.0155029296875,33.61022186279297],[211400,\"葫芦岛\",120.83592987060547,40.70981979370117],[421100,\"黄冈\",114.87529754638672,30.454519271850586],[420200,\"黄石\",115.03790283203125,30.19927978515625],[231100,\"黑河\",127.51904296875,50.24803924560547],[430400,\"衡阳\",112.57186126708984,26.89318084716797],[441600,\"河源\",114.70062255859375,23.743589401245117],[340400,\"淮南\",117.0029296875,32.62474822998047],[451100,\"贺州\",111.5675277709961,24.402280807495117],[340600,\"淮北\",116.79827117919922,33.95473861694336],[610700,\"汉中\",107.02342987060547,33.06753921508789],[150700,\"呼伦贝尔\",119.76608276367188,49.21223831176758],[371700,\"菏泽\",115.4798812866211,35.2353401184082],[431200,\"怀化\",109.99826049804688,27.555519104003906],[131100,\"衡水\",115.69686126708984,37.73678970336914],[632800,\"海西\",97.16259002685547,37.38842010498047],[652200,\"哈密地区\",93.51561737060547,42.81884002685547],[451200,\"河池\",108.0859603881836,24.692869186401367],[632200,\"海北\",100.9009017944336,36.954498291015625],[632100,\"海东地区\",102.11044311523438,36.506988525390625],[632500,\"海南州\",100.62042236328125,36.286380767822266],[653200,\"和田地区\",79.93112182617188,37.11376953125],[410600,\"鹤壁\",114.18417358398438,35.900489807128906],[230400,\"鹤岗\",130.29815673828125,47.34986877441406],[532500,\"红河\",103.37554168701172,23.36417007446289],[632300,\"黄南\",102.10408782958984,35.5217399597168]],\"J\":[[370100,\"济南\",116.99520111083984,36.66537857055664],[330400,\"嘉兴\",120.74832153320312,30.745149612426758],[330700,\"金华\",119.64749145507812,29.0781192779541],[440700,\"江门\",113.08177947998047,22.57879066467285],[370800,\"济宁\",116.58737182617188,35.41448974609375],[421000,\"荆州\",112.23953247070312,30.334510803222656],[220200,\"吉林\",126.54940032958984,43.83771896362305],[360400,\"九江\",116.00137329101562,29.705400466918945],[210700,\"锦州\",121.13524627685547,41.093990325927734],[360200,\"景德镇\",117.18170166015625,29.30706024169922],[230800,\"佳木斯\",130.3203125,46.79930877685547],[230300,\"鸡西\",130.97354125976562,45.2982292175293],[360800,\"吉安\",114.99349975585938,27.11383056640625],[419001,\"济源\",{},{}],[410800,\"焦作\",113.2419662475586,35.21559143066406],[445200,\"揭阳\",116.37261962890625,23.549640655517578],[620300,\"金昌\",102.18759155273438,38.52265930175781],[140500,\"晋城\",112.85164642333984,35.49037170410156],[140700,\"晋中\",112.751220703125,37.68722915649414],[420800,\"荆门\",112.19940185546875,31.035400390625],[620900,\"酒泉\",98.49388885498047,39.73823165893555],[620200,\"嘉峪关\",98.2896728515625,39.77191162109375]],\"K\":[[530100,\"昆明\",102.72216033935547,25.037879943847656],[410200,\"开封\",114.3072509765625,34.797218322753906],[653100,\"喀什地区\",75.98970794677734,39.47037124633789],[650200,\"克拉玛依\",84.88912963867188,45.57938003540039],[653000,\"克孜勒苏\",76.1668701171875,39.71649169921875]],\"L\":[[620100,\"兰州\",103.83409881591797,36.06135940551758],[530700,\"丽江\",100.22640991210938,26.85474967956543],[131000,\"廊坊\",116.7064208984375,39.52069091796875],[410300,\"洛阳\",112.4531478881836,34.618038177490234],[320700,\"连云港\",119.22174072265625,34.595211029052734],[511100,\"乐山\",103.76531982421875,29.552160263061523],[540100,\"拉萨\",91.11434173583984,29.644060134887695],[451300,\"来宾\",109.22293090820312,23.74803924560547],[371200,\"莱芜\",117.67552947998047,36.21493911743164],[331100,\"丽水\",119.92288208007812,28.467159271240234],[513400,\"凉山\",102.26776123046875,27.881040573120117],[211000,\"辽阳\",123.17279052734375,41.269649505615234],[220400,\"辽源\",125.1435775756836,42.88801956176758],[450200,\"柳州\",109.41539764404297,24.32537078857422],[371300,\"临沂\",118.34935760498047,35.0536003112793],[371500,\"聊城\",115.98538208007812,36.45587921142578],[542600,\"林芝\",94.35997772216797,29.672420501708984],[530900,\"临沧\",100.07946014404297,23.877599716186523],[141000,\"临汾\",111.51763153076172,36.08763885498047],[622900,\"临夏\",103.21099090576172,35.601409912109375],[341500,\"六安\",116.50554656982422,31.744670867919922],[520200,\"六盘水\",104.83099365234375,26.592649459838867],[350800,\"龙岩\",117.03411102294922,25.10062026977539],[621200,\"陇南\",104.9222412109375,33.39897918701172],[431300,\"娄底\",111.9945297241211,27.6972599029541],[510500,\"泸州\",105.44249725341797,28.871639251708984],[141100,\"吕梁\",111.14404296875,37.518489837646484],[411100,\"漯河\",114.0167465209961,33.581459045410156]],\"M\":[[340500,\"马鞍山\",118.50463104248047,31.697280883789062],[440900,\"茂名\",110.9251708984375,21.663240432739258],[511400,\"眉山\",103.84844970703125,30.07546043395996],[441400,\"梅州\",116.1223373413086,24.288530349731445],[510700,\"绵阳\",104.6793212890625,31.467220306396484],[231000,\"牡丹江\",129.61961364746094,44.588539123535156]],\"N\":[[320100,\"南京\",118.79637908935547,32.05830001831055],[330200,\"宁波\",121.54974365234375,29.874040603637695],[360100,\"南昌\",115.85845184326172,28.6830997467041],[450100,\"南宁\",108.36650848388672,22.816320419311523],[320600,\"南通\",120.89337158203125,31.98232078552246],[511300,\"南充\",106.11064910888672,30.83724021911621],[511000,\"内江\",105.05859375,29.580400466918945],[542400,\"那曲\",92.06072998046875,31.473970413208008],[350700,\"南平\",118.17772674560547,26.641450881958008],[411300,\"南阳\",112.52847290039062,32.99087142944336],[350900,\"宁德\",119.52632904052734,26.666419982910156],[533300,\"怒江\",98.85269165039062,25.855180740356445]],\"P\":[[510400,\"攀枝花\",101.71749114990234,26.58237075805664],[211100,\"盘锦\",122.07208251953125,41.12063980102539],[410400,\"平顶山\",113.3092269897461,33.72663879394531],[620800,\"平凉\",106.6649398803711,35.54214859008789],[360300,\"萍乡\",113.85513305664062,27.622190475463867],[350300,\"莆田\",119.0075912475586,25.453929901123047],[410900,\"濮阳\",115.03244018554688,35.75920867919922],[530800,\"普洱\",100.9702377319336,22.78215980529785]],\"Q\":[[370200,\"青岛\",120.38289642333984,36.066158294677734],[350500,\"泉州\",118.58696746826172,24.907360076904297],[130300,\"秦皇岛\",119.60186004638672,39.935638427734375],[330800,\"衢州\",118.87349700927734,28.93609046936035],[441800,\"清远\",113.05615234375,23.681739807128906],[621000,\"庆阳\",107.63298797607422,35.73843002319336],[230200,\"齐齐哈尔\",123.91716766357422,47.354408264160156],[429005,\"潜江\",112.89913177490234,30.402179718017578],[522600,\"黔东南\",107.97476196289062,26.585119247436523],[522700,\"黔南\",107.52220916748047,26.254230499267578],[522300,\"黔西南\",104.90657806396484,25.087989807128906],[450700,\"钦州\",108.65408325195312,21.980810165405273],[530300,\"曲靖\",103.79617309570312,25.48995018005371],[230900,\"七台河\",131.00302124023438,45.7706298828125]],\"R\":[[542300,\"日喀则\",88.88134002685547,29.266820907592773],[371100,\"日照\",119.53204345703125,35.41115188598633]],\"S\":[[310100,\"上海\",121.4745101928711,31.230649948120117],[440300,\"深圳\",114.05780029296875,22.54290008544922],[210100,\"沈阳\",123.43182373046875,41.80622863769531],[130100,\"石家庄\",114.5146713256836,38.04273986816406],[320500,\"苏州\",120.58541107177734,31.29878044128418],[460200,\"三亚\",109.51116180419922,18.252399444580078],[330600,\"绍兴\",120.57785034179688,30.004470825195312],[440500,\"汕头\",116.68184661865234,23.351520538330078],[440200,\"韶关\",113.59716033935547,24.81022071838379],[411200,\"三门峡\",111.20027923583984,34.77259063720703],[350400,\"三明\",117.63912963867188,26.263830184936523],[542200,\"山南地区\",91.7756576538086,29.225130081176758],[441500,\"汕尾\",115.37545013427734,22.7857608795166],[611000,\"商洛\",109.93498992919922,33.87001037597656],[411400,\"商丘\",115.65132904052734,34.44684982299805],[361100,\"上饶\",117.97589111328125,28.44384002685547],[430500,\"邵阳\",111.4677734375,27.240009307861328],[420300,\"十堰\",110.7888412475586,32.65066909790039],[640200,\"石嘴山\",106.36813354492188,39.019100189208984],[230500,\"双鸭山\",131.1590576171875,46.646541595458984],[140600,\"朔州\",112.43295288085938,39.33129119873047],[220300,\"四平\",124.34993743896484,43.165950775146484],[220700,\"松原\",124.82489013671875,45.14125061035156],[321300,\"宿迁\",118.27542114257812,33.96187973022461],[341300,\"宿州\",116.96385955810547,33.64611053466797],[231200,\"绥化\",126.9685287475586,46.65386962890625],[421300,\"随州\",113.38240814208984,31.69021987915039],[510900,\"遂宁\",105.56784057617188,30.525489807128906]],\"T\":[[120100,\"天津\",117.21446990966797,39.12080001831055],[140100,\"太原\",112.55075073242188,37.870540618896484],[130200,\"唐山\",118.18048095703125,39.630531311035156],[331000,\"台州\",121.4206771850586,28.65428924560547],[654200,\"塔城\",82.98416137695312,46.748939514160156],[370900,\"泰安\",117.08748626708984,36.2000617980957],[321200,\"泰州\",119.92294311523438,32.454830169677734],[620500,\"天水\",105.72509002685547,34.582359313964844],[211200,\"铁岭\",123.84542083740234,42.28649139404297],[220500,\"通化\",125.93991088867188,41.72819900512695],[150500,\"通辽\",122.26616668701172,43.61922073364258],[610200,\"铜川\",108.9450912475586,34.89667892456055],[340700,\"铜陵\",117.8203125,30.937599182128906],[522200,\"铜仁\",109.16011810302734,27.691560745239258],[652100,\"吐鲁番\",89.18730926513672,42.958900451660156]],\"W\":[[320200,\"无锡\",120.30281829833984,31.56591033935547],[420100,\"武汉\",114.30522918701172,30.592769622802734],[650100,\"乌鲁木齐\",87.61653900146484,43.82643127441406],[330300,\"温州\",120.69931030273438,27.994850158691406],[371000,\"威海\",122.12374114990234,37.510009765625],[370700,\"潍坊\",119.16171264648438,36.70682144165039],[340200,\"芜湖\",118.38524627685547,31.339189529418945],[610500,\"渭南\",109.51024627685547,34.49951171875],[532600,\"文山\",104.25145721435547,23.368419647216797],[150300,\"乌海\",106.82388305664062,39.68434143066406],[150900,\"乌兰察布\",113.13375091552734,40.994140625],[640300,\"吴忠\",106.19873046875,37.99750900268555],[450400,\"梧州\",111.2788314819336,23.477699279785156],[620600,\"武威\",102.63780975341797,37.931739807128906]],\"X\":[[610100,\"西安\",108.94412231445312,34.264801025390625],[350200,\"厦门\",118.0893783569336,24.479530334472656],[320300,\"徐州\",117.1915512084961,34.259761810302734],[630100,\"西宁\",101.77780151367188,36.61722183227539],[532800,\"西双版纳\",100.7976303100586,22.007179260253906],[152500,\"锡林郭勒\",116.04769134521484,43.93315887451172],[421200,\"咸宁\",114.322021484375,29.84086036682129],[610400,\"咸阳\",108.70967864990234,34.3290901184082],[430300,\"湘潭\",112.9429931640625,27.830129623413086],[433100,\"湘西\",109.7388916015625,28.311800003051758],[420600,\"襄樊\",112.15408325195312,32.02267837524414],[420900,\"孝感\",113.91635131835938,30.924739837646484],[140900,\"忻州\",112.73770141601562,38.41572952270508],[360500,\"新余\",114.9165267944336,27.81822967529297],[411500,\"信阳\",114.0686264038086,32.12303924560547],[152200,\"兴安盟\",122.06304168701172,46.07875061035156],[130500,\"邢台\",114.50493621826172,37.07059097290039],[411000,\"许昌\",113.85228729248047,34.03565979003906],[341800,\"宣城\",118.7585678100586,30.940710067749023]],\"Y\":[[321000,\"扬州\",119.41354370117188,32.39379119873047],[610600,\"延安\",109.48973846435547,36.58546829223633],[640100,\"银川\",106.23251342773438,38.488948822021484],[511800,\"雅安\",103.01318359375,29.980459213256836],[370600,\"烟台\",121.4476318359375,37.463558197021484],[222400,\"延边\",129.509033203125,42.89128875732422],[320900,\"盐城\",120.16168212890625,33.354408264160156],[441700,\"阳江\",111.98248291015625,21.858230590820312],[140300,\"阳泉\",113.58040618896484,37.85663986206055],[230700,\"伊春\",128.90399169921875,47.72737121582031],[654000,\"伊犁\",81.32746887207031,43.919368743896484],[511500,\"宜宾\",104.64334106445312,28.751750946044922],[420500,\"宜昌\",111.28685760498047,30.69202995300293],[360900,\"宜春\",114.41000366210938,27.817169189453125],[430900,\"益阳\",112.3551025390625,28.553869247436523],[360600,\"鹰潭\",117.06912231445312,28.260129928588867],[210800,\"营口\",122.23486328125,40.666778564453125],[431100,\"永州\",111.61392211914062,26.42160987854004],[610800,\"榆林\",109.7345199584961,38.28517150878906],[450900,\"玉林\",110.16455078125,22.63619041442871],[632700,\"玉树\",97.01708984375,33.02265930175781],[530400,\"玉溪\",102.5465316772461,24.35186004638672],[430600,\"岳阳\",113.12698364257812,29.3570499420166],[445300,\"云浮\",112.04454803466797,22.91489028930664],[140800,\"运城\",111.00691986083984,35.026241302490234]],\"Z\":[[410100,\"郑州\",113.6246337890625,34.74673843383789],[440400,\"珠海\",113.57672119140625,22.270910263061523],[442000,\"中山\",113.39253997802734,22.515859603881836],[330900,\"舟山\",122.20773315429688,29.985349655151367],[321100,\"镇江\",119.45674896240234,32.20021057128906],[30700,\"张家口\",{},{}],[370400,\"枣庄\",117.32357025146484,34.81003952026367],[440800,\"湛江\",110.3593978881836,21.270729064941406],[430800,\"张家界\",110.48001098632812,29.11557960510254],[1620700,\"张掖\",{},{}],[350600,\"漳州\",117.64714813232422,24.513399124145508],[530600,\"昭通\",103.71533203125,27.337890625],[441200,\"肇庆\",112.46533203125,23.047029495239258],[640500,\"中卫\",105.1736068725586,37.51694869995117],[411600,\"周口\",114.65328979492188,33.623138427734375],[430200,\"株洲\",113.13442993164062,27.82784080505371],[411700,\"驻马店\",114.0356674194336,32.981868743896484],[512000,\"资阳\",104.62857055664062,30.13071060180664],[370300,\"淄博\",118.05499267578125,36.81282043457031],[510300,\"自贡\",104.77828979492188,29.338939666748047],[520300,\"遵义\",106.9271469116211,27.725400924682617]]}";
    private static final String[] alphabetKey = {"热门", "A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
    private BaseAdapter adapter;
    private HashMap<String, Integer> alphaIndexer;
    private Handler handler;
    private LetterListView letterListView;
    private ListView mCityLit;
    private ArrayList<CityModel> mCityNames;
    private TextView overlay;
    private OverlayThread overlayThread;
    private String[] sections;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class CityListOnItemClick implements AdapterView.OnItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(619708565);
        }

        public CityListOnItemClick() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(CityList.CITY_INFO, (CityModel) CityList.access$200(CityList.this).getAdapter().getItem(i));
            CityList.this.setResult(-1, intent);
            try {
                ((WindowManager) CityList.this.getSystemService(pg1.ATOM_EXT_window)).removeView(CityList.access$300(CityList.this));
                CityList.this.finish();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class LetterListViewListener implements LetterListView.OnTouchingLetterChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(619708566);
            t2o.a(619708582);
        }

        private LetterListViewListener() {
        }

        @Override // com.taobao.browser.jsbridge.ui.LetterListView.OnTouchingLetterChangedListener
        public void onTouchingLetterChanged(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80ae351d", new Object[]{this, str});
            } else if (CityList.access$400(CityList.this).get(str) != null) {
                int intValue = ((Integer) CityList.access$400(CityList.this).get(str)).intValue();
                CityList.access$200(CityList.this).setSelection(intValue);
                CityList.access$300(CityList.this).setText(CityList.access$500(CityList.this)[intValue]);
                CityList.access$300(CityList.this).setVisibility(0);
                CityList.access$800(CityList.this).removeCallbacks(CityList.access$700(CityList.this));
                CityList.access$800(CityList.this).postDelayed(CityList.access$700(CityList.this), 1500L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ListAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LayoutInflater inflater;
        private List<CityModel> list;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class ViewHolder {
            public TextView alpha;
            public TextView name;

            static {
                t2o.a(619708568);
            }

            private ViewHolder() {
            }
        }

        static {
            t2o.a(619708567);
        }

        public ListAdapter(Context context, List<CityModel> list) {
            String str;
            this.inflater = LayoutInflater.from(context);
            this.list = list;
            CityList.access$402(CityList.this, new HashMap());
            CityList.access$502(CityList.this, new String[list.size()]);
            for (int i = 0; i < list.size(); i++) {
                String nameSort = list.get(i).getNameSort();
                int i2 = i - 1;
                if (i2 >= 0) {
                    str = list.get(i2).getNameSort();
                } else {
                    str = " ";
                }
                if (!str.equals(nameSort)) {
                    String nameSort2 = list.get(i).getNameSort();
                    CityList.access$400(CityList.this).put(nameSort2, Integer.valueOf(i));
                    CityList.access$500(CityList.this)[i] = nameSort2;
                }
            }
        }

        public static /* synthetic */ Object ipc$super(ListAdapter listAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/CityList$ListAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return this.list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return this.list.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = this.inflater.inflate(R.layout.list_item, (ViewGroup) null);
                viewHolder = new ViewHolder();
                viewHolder.alpha = (TextView) view.findViewById(R.id.alpha);
                viewHolder.name = (TextView) view.findViewById(R.id.name);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.name.setText(this.list.get(i).getCityName());
            String nameSort = this.list.get(i).getNameSort();
            int i2 = i - 1;
            if (i2 >= 0) {
                str = this.list.get(i2).getNameSort();
            } else {
                str = " ";
            }
            if (!str.equals(nameSort)) {
                viewHolder.alpha.setVisibility(0);
                viewHolder.alpha.setText(nameSort);
            } else {
                viewHolder.alpha.setVisibility(8);
            }
            return view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class OverlayThread implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(619708569);
        }

        private OverlayThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CityList.access$300(CityList.this).setVisibility(8);
            }
        }
    }

    public static /* synthetic */ ListView access$200(CityList cityList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListView) ipChange.ipc$dispatch("fa1b264a", new Object[]{cityList});
        }
        return cityList.mCityLit;
    }

    public static /* synthetic */ TextView access$300(CityList cityList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8783c7fa", new Object[]{cityList});
        }
        return cityList.overlay;
    }

    public static /* synthetic */ HashMap access$400(CityList cityList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cadd7988", new Object[]{cityList});
        }
        return cityList.alphaIndexer;
    }

    public static /* synthetic */ HashMap access$402(CityList cityList, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8b0ecb93", new Object[]{cityList, hashMap});
        }
        cityList.alphaIndexer = hashMap;
        return hashMap;
    }

    public static /* synthetic */ String[] access$500(CityList cityList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3e01a013", new Object[]{cityList});
        }
        return cityList.sections;
    }

    public static /* synthetic */ String[] access$502(CityList cityList, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("af107ec", new Object[]{cityList, strArr});
        }
        cityList.sections = strArr;
        return strArr;
    }

    public static /* synthetic */ OverlayThread access$700(CityList cityList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OverlayThread) ipChange.ipc$dispatch("d411457c", new Object[]{cityList});
        }
        return cityList.overlayThread;
    }

    public static /* synthetic */ Handler access$800(CityList cityList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9edfde45", new Object[]{cityList});
        }
        return cityList.handler;
    }

    private void initOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a099a7", new Object[]{this});
            return;
        }
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.overlay, (ViewGroup) null);
        this.overlay = textView;
        textView.setVisibility(4);
        ((WindowManager) getSystemService(pg1.ATOM_EXT_window)).addView(this.overlay, new WindowManager.LayoutParams(-2, -2, 2, 24, -3));
    }

    public static /* synthetic */ Object ipc$super(CityList cityList, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -884160602) {
            return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
        }
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/ui/CityList");
        }
    }

    private void setAdapter(List<CityModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ac8785", new Object[]{this, list});
        } else if (list != null) {
            ListAdapter listAdapter = new ListAdapter(this, list);
            this.adapter = listAdapter;
            this.mCityLit.setAdapter((android.widget.ListAdapter) listAdapter);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.city_list);
        ListView listView = (ListView) findViewById(R.id.city_list);
        this.mCityLit = listView;
        listView.setDividerHeight(0);
        this.letterListView = (LetterListView) findViewById(R.id.cityLetterListView);
        this.mCityNames = getCityNames();
        this.letterListView.setOnTouchingLetterChangedListener(new LetterListViewListener());
        this.alphaIndexer = new HashMap<>();
        this.handler = new Handler();
        this.overlayThread = new OverlayThread();
        initOverlay();
        setAdapter(this.mCityNames);
        this.mCityLit.setOnItemClickListener(new CityListOnItemClick());
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            try {
                ((WindowManager) getSystemService(pg1.ATOM_EXT_window)).removeView(this.overlay);
            } catch (Exception unused) {
            }
            setResult(0);
        }
        return super.onKeyDown(i, keyEvent);
    }

    private ArrayList<CityModel> getCityNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8ff043c8", new Object[]{this});
        }
        ArrayList<CityModel> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(DATA);
            int i = 0;
            while (true) {
                String[] strArr = alphabetKey;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null && optJSONArray.length() >= 1) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONArray jSONArray = optJSONArray.getJSONArray(i2);
                        String valueOf = String.valueOf(jSONArray.optLong(0, 0L));
                        String optString = jSONArray.optString(1);
                        String optString2 = jSONArray.optString(2);
                        String optString3 = jSONArray.optString(3);
                        CityModel cityModel = new CityModel();
                        cityModel.setCityName(optString);
                        cityModel.setCityId(valueOf);
                        cityModel.setNameSort(str);
                        cityModel.setLongitude(optString2);
                        cityModel.setLatitude(optString3);
                        arrayList.add(cityModel);
                    }
                }
                i++;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    static {
        t2o.a(619708563);
    }
}
