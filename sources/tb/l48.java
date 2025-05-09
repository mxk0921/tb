package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l48 extends n8u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_ID_VALUE = "8940";
    public boolean c;
    public final int d;
    public JSONObject e;

    static {
        t2o.a(815793459);
    }

    public l48(String str, String str2, Map<String, String> map, int i) {
        super(str, mh1.CLICK_TRACE);
        this.c = false;
        b("vm", "nw");
        b("m", r4p.VALUE_MODULE_DYNAMIC_CARD);
        b("ttid", TaoHelper.getTTID());
        if (!TextUtils.isEmpty(str2)) {
            b("traceInfo", str2);
        }
        i(map);
        if (i >= 0) {
            this.d = i;
            b(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i));
        }
    }

    public static /* synthetic */ Object ipc$super(l48 l48Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/realtimetag/data/DynamicCardRequest");
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eb6f615", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b06", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    a(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f04140c", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    b(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8aa4ddd", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffe6396", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            b("insertItems", str);
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4797153", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b66320", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            c4p.m("DynamicCardRequest", "jarvis feature: " + str);
            b(r4p.KEY_JARVIS_FEATURE, str);
        }
    }

    public void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf570fdc", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18d97ca", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            c4p.m("DynamicCardRequest", "jarvis status: " + str);
            b(r4p.KEY_JARVIS_STATUS, str);
        }
    }

    public l48(String str, Map<String, String> map, int i) {
        this(y4p.b(), str, map, i);
    }
}
