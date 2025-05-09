package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f22271a = new HashMap();

    static {
        t2o.a(944767224);
    }

    public static jxk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jxk) ipChange.ipc$dispatch("295c29f6", new Object[0]);
        }
        return new jxk();
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        return ((HashMap) this.f22271a).get(str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        Object obj = ((HashMap) this.f22271a).get(str);
        if (obj == null) {
            return null;
        }
        return (String) obj;
    }

    public jxk d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jxk) ipChange.ipc$dispatch("8446ec56", new Object[]{this, str, obj});
        }
        ((HashMap) this.f22271a).put(str, obj);
        return this;
    }
}
