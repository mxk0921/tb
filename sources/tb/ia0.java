package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ia0 extends pwq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_SEARCHDOOR_FROM = "searchdoorFrom";
    public static final String PARAM_SEARCH_BAR_DISPLAY_TEXT = "placeholder";
    public static final String PARAM_SEARCH_BAR_SEARCH_TEXT = "searchquery";
    public static final String PARAM_SEARCH_HINT = "searchhint";
    public static final String PARAM_TAB = "tab";
    public static final Map<String, String> d;

    static {
        t2o.a(815793187);
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("localSearch", "24790");
    }

    public ia0(String str, String str2, String str3, String str4, String str5, Map<String, String> map, MethodEnum methodEnum) {
        super(h(map), str3, methodEnum);
        d("main-activate", 1);
        if (map != null) {
            eca.c(map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    b(key, value);
                }
            }
        }
        b("area", "active_page");
        b("src", "c2c");
        if (!((HashMap) this.f20426a.g).containsKey(r4p.KEY_GOOD_PRICE)) {
            b(r4p.KEY_GOOD_PRICE, String.valueOf(cvr.INSTANCE.d()));
        }
        if (!o4p.u2()) {
            b(PARAM_SEARCH_HINT, "on");
        } else {
            b(PARAM_SEARCH_HINT, "off");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            b("placeholder", str);
            b(PARAM_SEARCH_BAR_SEARCH_TEXT, str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            b("tab", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            b(PARAM_SEARCHDOOR_FROM, str5);
        }
        TBLocationDTO c = a4p.c();
        if (c != null) {
            b("longitude", c.longitude);
            b("latitude", c.latitude);
            b(r4p.KEY_CITY_CODE, c.cityCode);
        }
        String b = m3p.INSTANCE.b(Globals.getApplication());
        if (!TextUtils.isEmpty(b)) {
            b(r4p.KEY_GLOBAL_LBS, b);
        }
        b("versionCode", cvr.INSTANCE.b());
    }

    public static String h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51fec884", new Object[]{map});
        }
        if (map == null || map.isEmpty() || !o4p.q2()) {
            return "10211";
        }
        String b = eca.b(map, "channelSrp");
        if (TextUtils.isEmpty(b)) {
            return "10211";
        }
        String str = (String) ((HashMap) d).get(b);
        if (TextUtils.isEmpty(str)) {
            return "10211";
        }
        return str;
    }

    public static /* synthetic */ Object ipc$super(ia0 ia0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/ActivateTppRequest");
    }
}
