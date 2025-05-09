package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r1w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27050a;
    public final String b;
    public String c;
    public final long d = SystemClock.uptimeMillis();
    public List<r1w> e;
    public List<Map<String, Object>> f;
    public List<cj8> g;
    public List<ugq> h;
    public Map<String, Object> i;
    public Map<String, Object> j;
    public List<kd2> k;
    public Map<String, kd2> l;
    public Map<String, Integer> m;
    public final boolean n;
    public final boolean o;

    public r1w(String str, boolean z, boolean z2) {
        int i;
        this.f27050a = str;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1 || str.length() <= (i = lastIndexOf + 1)) {
            this.b = str;
        } else {
            this.b = str.substring(i);
        }
        this.n = z;
        this.o = z2;
        m();
    }

    public r1w a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("2e103ab6", new Object[]{this, str, map});
        }
        if (str != null) {
            kd2 kd2Var = (kd2) ((ConcurrentHashMap) this.l).get(str);
            if (kd2Var == null) {
                kd2Var = new kd2(str, map);
                ((ConcurrentHashMap) this.l).put(str, kd2Var);
                synchronized (this.k) {
                    ((LinkedList) this.k).add(kd2Var);
                }
            }
            kd2Var.c(map);
        }
        return this;
    }

    public r1w b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("9cd26aa9", new Object[]{this, str, map});
        }
        if (str != null) {
            kd2 kd2Var = (kd2) ((ConcurrentHashMap) this.l).get(str);
            if (kd2Var == null) {
                kd2Var = new kd2(str, null);
                ((ConcurrentHashMap) this.l).put(str, kd2Var);
                synchronized (this.k) {
                    ((LinkedList) this.k).add(kd2Var);
                }
            }
            kd2Var.b(map);
        }
        return this;
    }

    public r1w c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("f74e8970", new Object[]{this, str, map});
        }
        if (str != null) {
            kd2 kd2Var = (kd2) ((ConcurrentHashMap) this.l).get(str);
            if (kd2Var == null) {
                kd2Var = new kd2(str, null);
                ((ConcurrentHashMap) this.l).put(str, kd2Var);
                synchronized (this.k) {
                    ((LinkedList) this.k).add(kd2Var);
                }
            }
            kd2Var.d(map);
        }
        return this;
    }

    public r1w d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("f6860ab5", new Object[]{this, str, obj});
        }
        if (!(obj == null || str == null)) {
            this.j.put(str, obj);
        }
        return this;
    }

    public r1w e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("7ee8f012", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public r1w f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("845d3cfc", new Object[]{this, str, obj});
        }
        if (!(obj == null || str == null)) {
            ((ConcurrentHashMap) this.i).put(str, obj);
        }
        return this;
    }

    public r1w g(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("9b0b757e", new Object[]{this, map});
        }
        if (map != null && ((LinkedList) this.f).size() <= 200) {
            ((LinkedList) this.f).add(map);
        }
        return this;
    }

    public r1w h(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("b192fe5d", new Object[]{this, r1wVar});
        }
        if (r1wVar != null) {
            String str = r1wVar.b;
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Integer num = (Integer) ((ConcurrentHashMap) this.m).get(str);
            if (num == null) {
                ((ConcurrentHashMap) this.m).put(str, 1);
            } else {
                ((ConcurrentHashMap) this.m).put(str, Integer.valueOf(num.intValue() + 1));
            }
            if (r1wVar.o) {
                for (ugq ugqVar : r1wVar.h) {
                    char[] charArray = ugqVar.a().toCharArray();
                    char c = charArray[0];
                    if (c >= 'a') {
                        charArray[0] = (char) (c - ' ');
                    }
                    String str2 = str + String.valueOf(charArray);
                    Integer num2 = (Integer) ((ConcurrentHashMap) this.m).get(str2);
                    if (num2 == null) {
                        ((ConcurrentHashMap) this.m).put(str2, 1);
                    } else {
                        ((ConcurrentHashMap) this.m).put(str2, Integer.valueOf(num2.intValue() + 1));
                    }
                }
            }
            synchronized (this.e) {
                try {
                    if (!r1wVar.n) {
                        ((LinkedList) this.e).add(r1wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this;
    }

    public List<kd2> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("40925120", new Object[]{this});
        }
        return this.k;
    }

    public Map<String, Integer> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3f1518b3", new Object[]{this});
        }
        return this.m;
    }

    public r1w k(cj8 cj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("ecbee318", new Object[]{this, cj8Var});
        }
        if (cj8Var != null) {
            synchronized (this.g) {
                ((LinkedList) this.g).add(cj8Var);
            }
        }
        return this;
    }

    public List<cj8> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3f43d27", new Object[]{this});
        }
        return this.g;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.g = new LinkedList();
        this.h = new LinkedList();
        this.i = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new LinkedList();
        this.l = new ConcurrentHashMap();
    }

    public Map<String, Object> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92db64ef", new Object[]{this});
        }
        return this.j;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1b4623", new Object[]{this});
        }
        return this.c;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab13f87c", new Object[]{this});
        }
        return this.b;
    }

    public r1w q(ugq ugqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("fa5aec98", new Object[]{this, ugqVar});
        }
        if (ugqVar != null) {
            synchronized (this.h) {
                this.h.add(ugqVar);
            }
        }
        return this;
    }

    public List<ugq> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7330738b", new Object[]{this});
        }
        return this.h;
    }

    public Map<String, Object> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39c36cdf", new Object[]{this});
        }
        return this.i;
    }

    public List<Map<String, Object>> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5d617ef2", new Object[]{this});
        }
        return this.f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f27050a;
    }

    public List<r1w> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6630b41e", new Object[]{this});
        }
        return this.e;
    }

    public r1w v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("9ae31d0b", new Object[]{this});
        }
        r1w r1wVar = new r1w(this.b, this.n, this.o);
        r1wVar.h = this.h;
        r1wVar.j = this.j;
        return r1wVar;
    }

    public long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79d83291", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this});
        }
        return this.f27050a;
    }
}
