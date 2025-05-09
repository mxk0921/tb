package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ug7 implements MtopModule.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String[] f29356a = null;
    public static String[] b = null;

    static {
        t2o.a(468714228);
        t2o.a(502268113);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189774f4", new Object[0]);
        } else if (b == null) {
            String H2 = akt.H2("ShortVideo.IgnoreDetailParamsKeys", null);
            if (TextUtils.isEmpty(H2)) {
                b = new String[]{c4o.KEY_DATA_SOURCE, c4o.KEY_CLOSE_WANNA_SEE, c4o.KEY_SWITCH_MODE};
            } else {
                b = H2.split(",");
            }
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2a40c0", new Object[0]);
        } else if (f29356a == null) {
            String H2 = akt.H2("ShortVideo.IgnoreExtendParametersKey", null);
            if (TextUtils.isEmpty(H2)) {
                f29356a = new String[]{"bxFeature", c4o.KEY_LBS_DATA, c4o.KEY_REFRESH_TYPE, "page", c4o.KEY_FROMLAUNCHER, c4o.KEY_ISSIMPLEPAGE, c4o.KEY_ISGGPICKPRELOAD, c4o.KEY_TAB3COMPONENTSOURCE, c4o.KEY_ENABLE_SERVER_ABR, c4o.KEY_IS_PRELOAD_FILL, c4o.KEY_NETWORK_SPEED, c4o.KEY_DATA_SOURCE, c4o.KEY_CLOSE_WANNA_SEE, c4o.KEY_SWITCH_MODE, "spm-url", c4o.KEY_ISAUTOSLIDE, c4o.KEY_VERTICAL_LAYOUT, FluidSDK.FLUID_SDK_FLAG, sj4.TAB2_NATIVE, wr9.FLUID_SDK_REMOTE_VERSION};
            } else {
                f29356a = H2.split(",");
            }
        }
    }

    public final boolean a(String str, Object obj, Object obj2) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44fed4bc", new Object[]{this, str, obj, obj2})).booleanValue();
        }
        c();
        d();
        str.hashCode();
        if (str.equals("extendParameters")) {
            strArr = f29356a;
        } else if (!str.equals("detailParameters")) {
            strArr = null;
        } else {
            strArr = b;
        }
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        JSONObject parseObject = JSON.parseObject((String) obj);
        JSONObject parseObject2 = JSON.parseObject((String) obj2);
        if (strArr != null) {
            for (String str2 : strArr) {
                parseObject.remove(str2);
                parseObject2.remove(str2);
            }
        }
        return parseObject.equals(parseObject2);
    }

    public boolean b(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1d9fec5", new Object[]{this, str, obj, obj2})).booleanValue();
        }
        if ("params".equals(str)) {
            JSONObject d = k1k.d(obj);
            JSONObject d2 = k1k.d(obj2);
            if (!(d == null || d2 == null)) {
                return a("extendParameters", k1k.c(d), k1k.c(d2)) && a("detailParameters", k1k.b(d), k1k.b(d2)) && TextUtils.equals(k1k.a(d), k1k.a(d2));
            }
        }
        if (TextUtils.equals("asac", str)) {
            return true;
        }
        if ("extendParameters".equals(str)) {
            return a("extendParameters", obj, obj2);
        }
        if ("detailParameters".equals(str)) {
            return a("detailParameters", obj, obj2);
        }
        return obj.equals(obj2);
    }

    public boolean e(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9facb179", new Object[]{this, map, map2})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null || map2 == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                Object obj = map2.get(str);
                if (!value.equals(obj) && (!str.equals("params") || !(value instanceof String) || !(obj instanceof String) || !JSON.parseObject((String) value).equals(JSON.parseObject((String) obj)))) {
                    if (!b(str, value, obj)) {
                        return false;
                    }
                }
            } else if (map2.get(str) != null || !map2.containsKey(str)) {
                return false;
            }
        }
        return true;
    }
}
