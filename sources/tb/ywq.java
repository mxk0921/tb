package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ywq extends pwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> d;

    static {
        t2o.a(815793283);
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("localSearch", "24883");
        hashMap.put(use.CHANNEL_NAME, "29364");
    }

    public ywq(String str, String str2, String str3, Map<String, String> map, MethodEnum methodEnum) {
        super(h(map), "suggest", methodEnum);
        if (map != null) {
            eca.c(map);
            if ("shop_wireless".equals(map.get("area"))) {
                d("inshop-suggest", 1);
            } else {
                d("main-suggest", 1);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    b(key, value);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            b("q", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b("tab", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            b(ia0.PARAM_SEARCHDOOR_FROM, str3);
        }
        String c = k1p.c();
        if (!TextUtils.isEmpty(c)) {
            b(r4p.KEY_EDITION_CODE, c);
        }
        if (!((HashMap) this.f20426a.g).containsKey(r4p.KEY_GOOD_PRICE)) {
            b(r4p.KEY_GOOD_PRICE, String.valueOf(cvr.INSTANCE.d()));
        }
        TBLocationDTO c2 = a4p.c();
        if (c2 != null) {
            b("longitude", c2.longitude);
            b("latitude", c2.latitude);
            b(r4p.KEY_CITY_CODE, c2.cityCode);
        }
        String b = m3p.INSTANCE.b(Globals.getApplication());
        if (!TextUtils.isEmpty(b)) {
            b(r4p.KEY_GLOBAL_LBS, b);
        }
        b("area", "wireless_gbdt_newoutput");
        b("src", "c2c");
        b("sversion", r4p.SERVER_VERSION_VALUE);
        zzo.d.b().d(c().g);
    }

    public static String h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51fec884", new Object[]{map});
        }
        if (map == null || map.isEmpty() || !o4p.q2()) {
            return "10650";
        }
        String b = eca.b(map, "channelSrp");
        if (TextUtils.isEmpty(b)) {
            return "10650";
        }
        String str = (String) ((HashMap) d).get(b);
        if (use.CHANNEL_NAME.equals(b) && l3p.INSTANCE.b()) {
            str = "35111";
        }
        if (TextUtils.isEmpty(str)) {
            return "10650";
        }
        return str;
    }

    public static /* synthetic */ Object ipc$super(ywq ywqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/data/SuggestTppRequest");
    }

    public ywq(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, map, null);
    }
}
