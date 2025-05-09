package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17638a;
    public String b;
    public boolean c;
    public String e;
    public long f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public String m;
    public int d = -1;
    public final Map<String, String> n = new HashMap();
    public Map<String, String> o = null;

    static {
        t2o.a(980418646);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.n).put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
            return;
        }
        if (this.o == null) {
            this.o = new HashMap();
        }
        this.o.put(str, str2);
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3847098", new Object[]{this});
        }
        return this.n;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.o;
    }
}
