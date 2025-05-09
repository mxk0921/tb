package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, xkf> b;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f31439a = new ArrayList();

    static {
        t2o.a(1017118837);
    }

    public xkf(String str) {
        new HashMap();
    }

    public static xkf b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xkf) ipChange.ipc$dispatch("fe8076b7", new Object[]{str});
        }
        xkf xkfVar = new xkf(str);
        if (b == null) {
            b = new HashMap();
        }
        ((HashMap) b).put(str, xkfVar);
        return xkfVar;
    }

    public static xkf c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xkf) ipChange.ipc$dispatch("eadabcb0", new Object[]{str});
        }
        xkf d = d(str);
        if (d != null) {
            return d;
        }
        return b(str);
    }

    public static xkf d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xkf) ipChange.ipc$dispatch("4855ec91", new Object[]{str});
        }
        Map<String, xkf> map = b;
        if (map == null) {
            return null;
        }
        return (xkf) ((HashMap) map).get(str);
    }

    public xkf a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xkf) ipChange.ipc$dispatch("c4cdfde5", new Object[]{this, str, objArr});
        }
        if (objArr != null && objArr.length > 0) {
            str = str + ":" + TextUtils.join(":", objArr);
        }
        if (((ArrayList) this.f31439a).size() >= 128) {
            ((ArrayList) this.f31439a).remove(0);
        }
        ((ArrayList) this.f31439a).add(str);
        return this;
    }
}
