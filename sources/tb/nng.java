package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f24847a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nng f24848a = new nng();

        public static /* synthetic */ nng a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nng) ipChange.ipc$dispatch("ee6e5a26", new Object[0]);
            }
            return f24848a;
        }
    }

    public static nng b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nng) ipChange.ipc$dispatch("d6214821", new Object[0]);
        }
        return a.a();
    }

    public <T> T a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5f246c2a", new Object[]{this, str, t});
        }
        T t2 = (T) ((HashMap) this.f24847a).get(c(str));
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) n81.l(str, t);
        ((HashMap) this.f24847a).put(c(str), t3);
        return t3;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b72d4027", new Object[]{this, str});
        }
        return "cycleSwitch_" + str;
    }

    public <T> void d(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c480d27c", new Object[]{this, str, t});
        } else {
            ((HashMap) this.f24847a).put(c(str), t);
        }
    }
}
