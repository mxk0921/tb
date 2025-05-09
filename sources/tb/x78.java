package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.homepage.LocationShopInfo;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.StringUtil;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap<String, PositionInfo> f31190a;
    public static Map<String, LocationShopInfo> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends TypeReference<List<PositionInfo>> {
    }

    static {
        t2o.a(456130568);
        LinkedHashMap<String, PositionInfo> linkedHashMap = new LinkedHashMap<>(40);
        f31190a = linkedHashMap;
        linkedHashMap.put("OLD", new PositionInfo("亲情版", o78.CHINA_MAINLAND, "156", "zh-CN", "zh-CN", "CNY", "CN|zh-CN|CNY|156", "OLD"));
        linkedHashMap.put("CUN", new PositionInfo("乡村地区", o78.CHINA_MAINLAND, "156", "zh-CN", "zh-CN", "CNY", "CN|zh-CN|CNY|156", "CUN"));
        linkedHashMap.put(o78.CHINA_MAINLAND, new PositionInfo("中国大陆", o78.CHINA_MAINLAND, "156", "zh-CN", "zh-CN", "CNY", "CN|zh-CN|CNY|156", o78.CHINA_MAINLAND));
        linkedHashMap.put("HK", new PositionInfo("中国香港", "HK", "344", "zh-HK", "zh-HK", "HKD", "HK|zh-HK|HKD|344", "HK"));
        linkedHashMap.put("MO", new PositionInfo("中国澳门", "MO", "446", "zh-MO", "zh-MO", "MOP", "MO|zh-HK|MOP|446", "MO"));
        linkedHashMap.put("TW", new PositionInfo("中国台湾", "TW", "158", "zh-TW", "zh-TW", "TWD", "TW|zh-TW|TWD|158", "TW"));
        linkedHashMap.put("SG", new PositionInfo("新加坡", "SG", "702", "en-SG", "zh-CN", "SGD", "SG|zh-CN|SGD|702", "SG"));
        linkedHashMap.put("MY", new PositionInfo("马来西亚", "MY", "458", "ms-MY", "zh-CN", "MYR", "MY|zh-CN|MYR|458", "MY"));
        linkedHashMap.put("CA", new PositionInfo("加拿大", "CA", "124", "en-CA", "zh-CN", "CAD", "CA|zh-CN|CAD|124", "CA"));
        linkedHashMap.put("AU", new PositionInfo("澳大利亚", "AU", "36", "en-AU", "zh-CN", "AUD", "AU|zh-CN|AUD|36", "AU"));
        linkedHashMap.put("NZ", new PositionInfo("新西兰", "NZ", "554", "en-NZ", "zh-CN", "NZD", "NZ|zh-CN|NZD|554", "NZ"));
        linkedHashMap.put("JP", new PositionInfo("日本", "JP", "392", "ja-JP", "zh-CN", "JPY", "JP|zh-CN|JPY|392", "JP"));
        linkedHashMap.put("KR", new PositionInfo("韩国", "KR", "410", "ko-KR", "zh-CN", "KRW", "KR|zh-CN|KRW|410", "KR"));
        linkedHashMap.put("VN", new PositionInfo("越南", "VN", "704", "vi-VN", "zh-CN", "VND", "VN|zh-CN|VND|704", "VN"));
        linkedHashMap.put("TH", new PositionInfo("泰国", "TH", "764", "th-TH", "zh-CN", "THB", "TH|zh-CN|THB|764", "TH"));
        linkedHashMap.put("PH", new PositionInfo("菲律宾", "PH", "608", "en-PH", "zh-CN", "PHP", "PH|zh-CN|PHP|608", "PH"));
        linkedHashMap.put("KH", new PositionInfo("柬埔寨", "KH", "116", "km-KH", "zh-CN", "KHR", "KH|zh-CN|KHR|116", "KH"));
        linkedHashMap.put("KZ", new PositionInfo("哈萨克斯坦", "KZ", "398", "kk-KZ", "zh-CN", "KZT", "KZ|zh-CN|KZT|398", "KZ"));
        linkedHashMap.put("KG", new PositionInfo("吉尔吉斯斯坦", "KG", "417", "ky-KG", "zh-CN", "KGS", "KG|zh-CN|KGS|417", "KG"));
        linkedHashMap.put("UZ", new PositionInfo("乌兹别克斯坦", "UZ", "860", "uz-UZ", "zh-CN", "UZS", "UZ|zh-CN|UZS|860", "UZ"));
        linkedHashMap.put("MN", new PositionInfo("蒙古国", "MN", "496", "mn-MN", "zh-CN", "MNT", "MN|zh-CN|MNT|496", "MN"));
        linkedHashMap.put("GE", new PositionInfo("格鲁吉亚", "GE", "268", "ka-GE", "zh-CN", "GEL", "GE|zh-CN|GEL|268", "GE"));
        linkedHashMap.put("GLOBAL", new PositionInfo("全球", "GLOBAL", "999", "zh-CN", "zh-CN", "USD", "GLOBAL|zh-CN|USD|999", "GLOBAL"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("567936d", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("edition_switcher", "incrementCountries", "false"));
    }

    public static PositionInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("c93858fb", new Object[0]);
        }
        PositionInfo c = c(o78.CHINA_MAINLAND);
        c.cityName = "HangZhou";
        c.cityId = "HZ";
        return c;
    }

    public static PositionInfo c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("2faca87d", new Object[]{str});
        }
        LinkedHashMap<String, PositionInfo> d = d();
        if (d.containsKey(str)) {
            return d.get(str).newInstance();
        }
        return d.get("GLOBAL").newInstance();
    }

    public static LinkedHashMap<String, PositionInfo> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("deeff1b5", new Object[0]);
        }
        try {
            List<PositionInfo> list = (List) JSON.parseObject(OrangeConfig.getInstance().getConfig("edition_switcher", "incrementCountries", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), new a(), new Feature[0]);
            if (list != null && !list.isEmpty()) {
                for (PositionInfo positionInfo : list) {
                    f31190a.put(positionInfo.countryCode, positionInfo);
                }
            }
            String config = OrangeConfig.getInstance().getConfig("edition_switcher", "removeCountries", "");
            if (!StringUtil.isEmpty(config)) {
                for (String str : Arrays.asList(config.split(","))) {
                    f31190a.remove(str);
                }
            }
        } catch (Exception unused) {
        }
        return f31190a;
    }

    public static List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0729f88", new Object[0]);
        }
        String config = OrangeConfig.getInstance().getConfig("edition_switcher", "locationBlackCountCodeList", "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return JSON.parseArray(config, String.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b4995132", new Object[0]);
        }
        String config = OrangeConfig.getInstance().getConfig("edition_switcher", "locationWhiteCountCodeList", "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return JSON.parseArray(config, String.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static LocationShopInfo f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationShopInfo) ipChange.ipc$dispatch("e775d3ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (b == null) {
            b = new ConcurrentHashMap();
            String config = OrangeConfig.getInstance().getConfig("edition_switcher", "location_shopInfo_config", "[{\"countryName\":\"中国香港\",\"countryCode\":\"HK\",\"shoppingInfo\":\"¥99包邮直送HK\"},{\"countryName\":\"中国澳门\",\"countryCode\":\"MO\",\"shoppingInfo\":\"¥49包邮直送\"},{\"countryName\":\"中国台湾\",\"countryCode\":\"TW\",\"shoppingInfo\":\"¥99免运到TW\"},{\"countryName\":\"新加坡\",\"countryCode\":\"SG\",\"shoppingInfo\":\"享¥99包邮到家\"},{\"countryName\":\"马来西亚\",\"countryCode\":\"MY\",\"shoppingInfo\":\"享¥99大马包邮\"},{\"countryName\":\"加拿大\",\"countryCode\":\"CA\",\"shoppingInfo\":\"享一键直邮到家\"},{\"countryName\":\"澳大利亚\",\"countryCode\":\"AU\",\"shoppingInfo\":\"享一键直邮到澳\"},{\"countryName\":\"新西兰\",\"countryCode\":\"NZ\",\"shoppingInfo\":\"享直邮到家\"},{\"countryName\":\"日本\",\"countryCode\":\"JP\",\"shoppingInfo\":\"享¥199日本包邮\"},{\"countryName\":\"韩国\",\"countryCode\":\"KR\",\"shoppingInfo\":\"享¥199韩国包邮\"},{\"countryName\":\"越南\",\"countryCode\":\"VN\",\"shoppingInfo\":\"享¥99包邮\"},{\"countryName\":\"泰国\",\"countryCode\":\"TH\",\"shoppingInfo\":\"享¥99包邮\"},{\"countryName\":\"菲律宾\",\"countryCode\":\"PH\",\"shoppingInfo\":\"享直邮到家\"},{\"countryName\":\"柬埔寨\",\"countryCode\":\"KH\",\"shoppingInfo\":\"享¥99KH包邮\"},{\"countryName\":\"哈萨克斯坦\",\"countryCode\":\"KZ\",\"shoppingInfo\":\"满99免国际运费\"},{\"countryName\":\"乌兹别克斯坦\",\"countryCode\":\"UZ\",\"shoppingInfo\":\"享直邮到家\"},{\"countryName\":\"吉尔吉斯斯坦\",\"countryCode\":\"KG\",\"shoppingInfo\":\"享直邮到家\"},{\"countryName\":\"蒙古国\",\"countryCode\":\"MN\",\"shoppingInfo\":\"满99免国际运费\"},{\"countryName\":\"格鲁吉亚\",\"countryCode\":\"GE\",\"shoppingInfo\":\"享直邮到家\"}]");
            if (!TextUtils.isEmpty(config)) {
                try {
                    JSONArray parseArray = JSON.parseArray(config);
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        LocationShopInfo locationShopInfo = new LocationShopInfo();
                        locationShopInfo.countryCode = jSONObject.getString("countryCode");
                        locationShopInfo.countryName = jSONObject.getString("countryName");
                        locationShopInfo.shopInfo = jSONObject.getString("shoppingInfo");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("style");
                        if (jSONObject2 != null) {
                            locationShopInfo.shopInfoTextColor = jSONObject2.getString("shoppingInfoTextColor");
                        }
                        ((ConcurrentHashMap) b).put(locationShopInfo.countryCode, locationShopInfo);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    TLog.loge("EditionSwitcherUtils", "getLocationShopInfo error " + Log.getStackTraceString(th));
                }
            }
        }
        return (LocationShopInfo) ((ConcurrentHashMap) b).get(str);
    }
}
