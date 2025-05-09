package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eu3 extends n8u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793458);
    }

    public eu3(String str, Map<String, String> map, int i) {
        super(l48.APP_ID_VALUE, mh1.CLICK_TRACE);
        b("vm", "nw");
        b("m", "clicktrace");
        b("rainbow", oen.j());
        if (!TextUtils.isEmpty(str)) {
            b("traceInfo", str);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    b(entry.getKey(), entry.getValue());
                }
            }
        }
        if (i >= 0) {
            b(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i));
        }
    }

    public static eu3 g(String str, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eu3) ipChange.ipc$dispatch("aefe5232", new Object[]{str, map, new Integer(i)});
        }
        eu3 eu3Var = new eu3(str, map, i);
        eu3Var.f("29790");
        eu3Var.b("isCard", "true");
        return eu3Var;
    }

    public static /* synthetic */ Object ipc$super(eu3 eu3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/realtimetag/data/ClickTraceRequest");
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffe6396", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            b("insertItems", str);
        }
    }
}
