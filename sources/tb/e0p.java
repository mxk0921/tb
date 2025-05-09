package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.v2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<JSONObject> f18197a;

    static {
        t2o.a(729810352);
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d740eb57", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) "home");
        jSONObject2.put("content", (Object) jSONObject3);
        jSONObject.put("0", (Object) jSONObject2);
        return jSONObject;
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("262b96f1", new Object[]{jSONObject, str});
        }
        if (!(f0p.a() || jSONObject == null || TextUtils.isEmpty(str) || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("tabBar")) == null || (jSONObject4 = jSONObject3.getJSONObject("item")) == null || jSONObject4.size() <= 0)) {
            for (String str2 : jSONObject4.keySet()) {
                JSONObject jSONObject6 = jSONObject4.getJSONObject(str2);
                if (!(jSONObject6 == null || (jSONObject5 = jSONObject6.getJSONObject("content")) == null || !TextUtils.equals(str, jSONObject5.getString("type")))) {
                    return jSONObject6;
                }
            }
        }
        return null;
    }

    public static void c(SectionModel sectionModel) {
        JSONObject d;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a9df71", new Object[]{sectionModel});
            return;
        }
        String f = yyj.e().f();
        List<SectionModel> H = zza.d(f).H(f);
        if (H != null && !H.isEmpty() && (d = d()) != null && (indexOf = H.indexOf(d)) >= 0) {
            H.set(indexOf, sectionModel);
        }
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f8f8201a", new Object[0]);
        }
        vqa e = vqa.k().i("SearchBar").j("getD3SearchViewSection").e("SearchBarDataUtil.getD3SearchViewSection");
        String f = yyj.e().f();
        imn d = zza.d(f);
        if (d == null) {
            e.g(c4o.KEY_DATA_SOURCE, "is null").a();
            return null;
        }
        List<SectionModel> H = d.H(f);
        e.g("isNewFace", "true").g("主容器Id", f);
        if (H == null) {
            e.g("sections", "is null").a();
            return null;
        }
        for (SectionModel sectionModel : H) {
            if (TextUtils.equals(sectionModel.getString("sectionBizCode"), "DXSearchBar")) {
                return sectionModel;
            }
        }
        e.g("getSection", "null").a();
        return null;
    }

    public static List<JSONObject> f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f8566924", new Object[0]);
        }
        JSONObject l = l();
        if (l == null) {
            fve.e("SearchBarDataUtil", "getNewTabItemList tabBar == null");
            jSONObject = a();
        } else {
            jSONObject = l.getJSONObject("item");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            for (Map.Entry entry : new TreeMap(jSONObject).entrySet()) {
                arrayList.add((JSONObject) entry.getValue());
            }
        }
        return arrayList;
    }

    public static String g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c99d829", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            uqa.b("SearchBar", "getPartialRefreshNode", "searchBarSection == null");
            return "";
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            return jSONObject2.getString("refreshWidgetNode");
        }
        uqa.b("SearchBar", "getPartialRefreshNode", "ext == null");
        return "";
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb88d809", new Object[0]);
        }
        JSONObject d = d();
        if (d == null) {
            return null;
        }
        return d.getString("sectionBizCode");
    }

    public static JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8f854332", new Object[]{jSONObject});
        }
        if (f0p.a()) {
            return null;
        }
        if (jSONObject == null) {
            uqa.b("SearchBar", "getSearchBoxData", "getSearchBoxData searchBarData == null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            uqa.b("SearchBar", "getSearchBoxData", "getSearchBoxData subSection == null");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("home");
        if (jSONObject3 == null) {
            uqa.b("SearchBar", "getSearchBoxData", "getSearchBoxData subSectionHome == null");
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("subSection");
        if (jSONObject4 != null) {
            return jSONObject4.getJSONObject(cpj.SEARCH_BOX);
        }
        uqa.b("SearchBar", "getSearchBoxData", "getSearchBoxData homeSubSection == null");
        return null;
    }

    public static JSONObject j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82813d3d", new Object[]{jSONObject});
        }
        if (jSONObject == null || f0p.a() || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("tabBar");
    }

    public static JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e949ff72", new Object[0]);
        }
        Object k = a3b.k(l(), "subSection.tabSelect.subSection.popContentSection.item");
        if (k instanceof JSONObject) {
            return (JSONObject) k;
        }
        return null;
    }

    public static JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80478cdb", new Object[0]);
        }
        JSONObject d = d();
        if (d == null) {
            fve.e("SearchBarDataUtil", "getTabBar searchBarSection == null");
            return null;
        }
        JSONObject jSONObject = d.getJSONObject("subSection");
        if (jSONObject != null) {
            return jSONObject.getJSONObject("tabBar");
        }
        fve.e("SearchBarDataUtil", "getTabBar subSection == null");
        return null;
    }

    public static JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ee6648e", new Object[0]);
        }
        JSONObject l = l();
        if (l == null) {
            fve.e("SearchBarDataUtil", "getTabBarItem tabBar == null");
            return a();
        }
        JSONObject jSONObject = l.getJSONObject("item");
        if (jSONObject != null) {
            return jSONObject;
        }
        fve.e("SearchBarDataUtil", "getTabBarItem item == null");
        return a();
    }

    public static List<String> n() {
        JSONObject k;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4226cc3", new Object[0]);
        }
        if (f0p.a() || (k = k()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < k.size(); i++) {
            JSONObject jSONObject2 = k.getJSONObject(String.valueOf(i));
            if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(vaj.KEY_SMART_CONTENT)) == null)) {
                String string = jSONObject.getString("ssrPageUrl");
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    public static boolean o() {
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ab6e0c7", new Object[0])).booleanValue();
        }
        String f = yyj.e().f();
        imn d = zza.d(f);
        if (d == null || (m = vaj.m(d.H(f))) == null || (jSONObject = m.getJSONObject("ext")) == null) {
            return false;
        }
        return TextUtils.equals(jSONObject.getString("categoryTabVersion"), v2.d);
    }

    public static void q(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26504bd2", new Object[]{str, obj, jSONObject});
        } else if (obj != null && !TextUtils.isEmpty(str)) {
            jSONObject.put(str, obj);
        }
    }

    public static JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("17150e3a", new Object[0]);
        }
        WeakReference<JSONObject> weakReference = f18197a;
        if (weakReference != null && weakReference.get() != null) {
            return f18197a.get();
        }
        uqa.b("SearchBar", "getPreSearchBarData", "TopMultiTabPresetDataLoader.getHomepageSearchBarTopMultiTabPresetData;首页多tab情况下，获取本地预置的数据");
        try {
            JSONObject parseObject = JSON.parseObject("{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Button-searchBar\",\"args\":{\"expo\":\"a2141.1.searchbar.tbpassport1:1007.home_topbar.tbpassport1.d;a2141.1.searchbar.scan:1007.home_topbar.scan.d;a2141.1.searchbar.pailitao:1007.home_topbar.pailitao.d;a2141.1.searchbar.location:1007.home_topbar.redpacket.d;a2141.1.searchbar.searchbox:1007.home_topbar.searchbox.d;\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{\"hidden\":\"true\",\"expandSearchBarHeight\":\"87np\",\"isClearSearchBar\":\"false\",\"isExpandNaviBar\":\"true\",\"zoomSearchBarHeight\":\"45np\"},\"index\":\"0\",\"invalidType\":\"error\",\"item\":{\"bg\":{\"clickParam\":{},\"content\":{\"bgColor\":\"#ffffff\",\"bgImg\":\"\",\"darkBgColor\":\"\",\"darkBgImg\":\"\",\"darkModeBgColor\":\"\",\"darkModeBgImg\":\"\",\"lightBgColor\":\"\",\"lightBgImg\":\"\",\"taoImg\":\"https://gw.alicdn.com/tfs/TB1lKN.zUY1gK0jSZFCXXcwqXXa-411-88.png\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"memberCode\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.tbpassport1\"},\"smartContent\":{},\"targetUrl\":\"https://market.m.taobao.com/app/big-vip/vip-code/pages/index_v4?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.tbpassport1&scm=1007.home_topbar.tbpassport1.d&wh_weex=true&wx_navbar_transparent=true\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar\",\"subSection\":{\"leftTopIcon\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-tbpassport1\",\"args\":{\"spm\":\"a2141.1.searchbar.tbpassport1\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.tbpassport1.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"img\":\"https://gw.alicdn.com/tfs/TB1L5S0VAL0gK0jSZFtXXXQCXXa-108-108.png\",\"title\":\"签到\",\"titleColor\":\"#FA3B32\",\"bgColor\":\"#FFE5D1\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"memberCode\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.tbpassport1\"},\"smartContent\":{},\"targetUrl\":\"https://market.m.taobao.com/app/tmall-def/daily-welfare/pages/index?wh_weex=true&_wx_statusbar_hidden=true&wx_navbar_hidden=true&wx_navbar_transparent=true&spma=uhf&spmb=14164841\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-memberCode\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"rightTopIcon\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-tbpassport1\",\"args\":{\"spm\":\"a2141.1.searchbar.tbpassport1\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.tbpassport1.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"img\":\"https://gw.alicdn.com/tfs/TB1n9z0iypE_u4jSZKbXXbCUVXa-108-108.png\",\"title\":\"会员码\",\"titleColor\":\"#FA3B32\",\"bgColor\":\"#FFE5D1\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"memberCode\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.tbpassport1\"},\"smartContent\":{},\"targetUrl\":\"http://market.m.taobao.com/app/big-vip/vip-code/pages/index_v4?&wh_weex=true&wx_navbar_transparent=true\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-memberCode\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"scan\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-scan\",\"args\":{\"spm\":\"a2141.1.searchbar.scan\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.scan.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"darkImg\":\"https://gw.alicdn.com/tfs/TB1Pi4rxrY1gK0jSZTEXXXDQVXa-50-50.png\",\"img\":\"https://gw.alicdn.com/tfs/TB1Pi4rxrY1gK0jSZTEXXXDQVXa-50-50.png\",\"lightImg\":\"https://gw.alicdn.com/tfs/TB1Pi4rxrY1gK0jSZTEXXXDQVXa-50-50.png\",\"scm\":\"1007.home_topbar.scan.d\",\"voiceText\":\"扫一扫\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"scan\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.scan\"},\"smartContent\":{},\"targetUrl\":\"http://tb.cn/n/scancode?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.scan&scm=1007.home_topbar.scan.d\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-scan\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"pailitao\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-pailitao\",\"args\":{\"spm\":\"a2141.1.searchbar.pailitao\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.pailitao.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"darkImg\":\"https://gw.alicdn.com/tfs/TB1BqgOf.T1gK0jSZFrXXcNCXXa-72-72.png\",\"img\":\"https://gw.alicdn.com/tfs/TB1BqgOf.T1gK0jSZFrXXcNCXXa-72-72.png\",\"lightImg\":\"https://gw.alicdn.com/tfs/TB1BqgOf.T1gK0jSZFrXXcNCXXa-72-72.png\",\"scm\":\"1007.home_topbar.pailitao.d\",\"voiceText\":\"拍立淘\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"pailitao\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.pailitao\"},\"smartContent\":{},\"targetUrl\":\"http://h5.m.taobao.com/tusou/index.html?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.pailitao&scm=1007.home_topbar.pailitao.d&is_act_show=0&pssource=sy\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-pailitao\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"searchBox\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.searchbox.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"\",\"borderColor\":\"#FF5000\",\"searchIcon\":\"https://gw.alicdn.com/tfs/TB1cM7RfYH1gK0jSZFwXXc7aXXa-72-72.png\",\"btnEndColor\":\"#FF5000\",\"loopBeginTime\":\"4000\",\"searchTextArea\":\"shouye_query_rec_hintq_rolling\",\"btnTitle\":\"搜索\",\"btnStartColor\":\"#FF8D0E\",\"abtest\":\"\",\"loopInterval\":\"3000\",\"searchWidth\":\"54\",\"scm\":\"1007.home_topbar.searchbox.d\",\"voiceText\":\"搜索\",\"displayTextColor\":\"#666666\",\"festivalBorderWidth\":\"3\",\"btnTitleBold\":\"true\",\"btnTitleSize\":\"15\",\"textBold\":\"true\",\"textSize\":\"15\",\"textMaskImg\":\"https://gw.alicdn.com/tfs/TB19if0AeH2gK0jSZJnXXaT1FXa-63-64.png\",\"bgColor\":\"#ffffff\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"searchBox\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.searchbox\"},\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-searchBox\",\"subSection\":{\"0\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Show-inner_search_text\",\"args\":{\"suggest_rn\":\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\",\"display_text\":\"%E5%9C%B0%E7%97%9E%E5%B8%BD\",\"search_text\":\"%E5%9C%B0%E7%97%9E%E5%B8%BD\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"scm\":\"1007.home_topbar.searchbox.d\",\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"地痞帽\",\"searchTextConfig\":\"{\\\"displayText\\\":\\\"地痞帽\\\",\\\"searchText\\\":\\\"地痞帽\\\",\\\"searchparams\\\":[],\\\"suggest_rn\\\":\\\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\\\"}\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"mst_roll_0\",\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"1\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Show-inner_search_text\",\"args\":{\"suggest_rn\":\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\",\"display_text\":\"%E5%9C%86%E8%84%B8%E9%80%82%E5%90%88%E7%9A%84%E5%B8%BD%E5%AD%90%E5%86%AC%E5%AD%A3\",\"search_text\":\"%E5%9C%86%E8%84%B8%E9%80%82%E5%90%88%E7%9A%84%E5%B8%BD%E5%AD%90%E5%86%AC%E5%AD%A3\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"scm\":\"1007.home_topbar.searchbox.d\",\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"圆脸适合的帽子冬季\",\"searchTextConfig\":\"{\\\"displayText\\\":\\\"圆脸适合的帽子冬季\\\",\\\"searchText\\\":\\\"圆脸适合的帽子冬季\\\",\\\"searchparams\\\":[],\\\"suggest_rn\\\":\\\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\\\"}\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"mst_roll_1\",\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"2\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Show-inner_search_text\",\"args\":{\"suggest_rn\":\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\",\"display_text\":\"%E5%A4%A7%E8%A1%A3%E8%85%B0%E5%B8%A6%E9%85%8D%E4%BB%B6\",\"search_text\":\"%E5%A4%A7%E8%A1%A3%E8%85%B0%E5%B8%A6%E9%85%8D%E4%BB%B6\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"scm\":\"1007.home_topbar.searchbox.d\",\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"大衣腰带配件\",\"searchTextConfig\":\"{\\\"displayText\\\":\\\"大衣腰带配件\\\",\\\"searchText\\\":\\\"大衣腰带配件\\\",\\\"searchparams\\\":[],\\\"suggest_rn\\\":\\\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\\\"}\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"mst_roll_2\",\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"}},\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"tabBar\":{\"ext\":{\"titleColor\":\"#111111\",\"darkTitleColor\":\"#000000\",\"selectedTitleColor\":\"#ff5000\",\"darkSelectedTitleColor\":\"#ff5000\"},\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-tabdingyue\",\"args\":{\"spm\":\"a2141.1.searchbar.dingyue\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"title\":\"订阅\",\"type\":\"subscribe\",\"isDefault\":\"false\"}},\"1\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-tabtuijian\",\"args\":{\"spm\":\"a21acg.b41183928.c1600427199067.d1600427199067\"},\"eventId\":\"2101\",\"page\":\"Page_DingYueindexall\"},\"content\":{\"title\":\"推荐\",\"type\":\"home\",\"isDefault\":\"true\"}}}}},\"template\":{\"name\":\"home_m_h_v7_searchbar\",\"version\":\"13\",\"url\":\"https://ossgw.alicdn.com/rapid-oss-bucket/1602211077610/m_h_v7_searchbar.zip\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"}", Feature.OrderedField);
            f18197a = new WeakReference<>(parseObject);
            return parseObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONObject p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("431f37f8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(i));
            if (jSONObject3 == null) {
                break;
            }
            jSONArray.add(jSONObject3);
            i++;
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            JSONObject jSONObject6 = jSONArray.getJSONObject(i2);
            Object k = a3b.k(jSONObject6, "item.0.content");
            Object k2 = a3b.k(jSONObject6, "item.0.targetUrl");
            Object k3 = a3b.k(jSONObject6, "item.1.targetUrl");
            JSONObject jSONObject7 = (JSONObject) k;
            q("searchBoxUrl", k2, jSONObject7);
            q("searchButtonUrl", k3, jSONObject7);
            jSONObject4.put(String.valueOf(i2), k);
            Object k4 = a3b.k(jSONObject6, "item.0.clickParam");
            Object k5 = a3b.k(jSONObject6, "item.1.clickParam");
            Object k6 = a3b.k(jSONObject6, i2b.TRACK_EXPOSURE_PARAM);
            JSONObject jSONObject8 = new JSONObject();
            q("clickParam", k4, jSONObject8);
            q(i2b.TRACK_EXPOSURE_PARAM, k6, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            q("clickParam", k5, jSONObject9);
            q(i2b.TRACK_EXPOSURE_PARAM, k6, jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("text", (Object) jSONObject8);
            jSONObject10.put(pg1.ATOM_EXT_button, (Object) jSONObject9);
            jSONObject5.put(String.valueOf(i2), (Object) jSONObject10);
        }
        JSONObject jSONObject11 = new JSONObject();
        jSONObject11.put("searchText", (Object) jSONObject4);
        JSONObject jSONObject12 = new JSONObject();
        jSONObject12.put("searchText", (Object) jSONObject5);
        Object k7 = a3b.k(jSONObject, i2b.TRACK_EXPOSURE_PARAM);
        if (k7 instanceof JSONObject) {
            jSONObject12.put(cpj.SEARCH_BOX, k7);
        }
        JSONObject jSONObject13 = new JSONObject();
        jSONObject13.put("content", (Object) jSONObject11);
        jSONObject13.put("track", (Object) jSONObject12);
        return jSONObject13;
    }
}
