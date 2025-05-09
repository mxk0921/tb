package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o82 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEHAVIX_IPV_FEATURE_NAME = "ipv";
    public static o82 b;
    public static List<n82> c;

    /* renamed from: a  reason: collision with root package name */
    public final bwo f25207a = new bwo();

    static {
        t2o.a(404750520);
    }

    public o82() {
        new HashMap();
        c = new ArrayList();
    }

    public static o82 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o82) ipChange.ipc$dispatch("f327fe85", new Object[0]);
        }
        if (b == null) {
            synchronized (o82.class) {
                try {
                    if (b == null) {
                        b = new o82();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public synchronized void a(n82 n82Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("746c2946", new Object[]{this, n82Var});
            return;
        }
        if (n82Var != null) {
            ArrayList arrayList = new ArrayList(c);
            arrayList.add(n82Var);
            if (arrayList.size() > 50) {
                arrayList.remove(0);
            }
            c = arrayList;
        }
    }

    public List<n82> b(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19a8da0a", new Object[]{this, str, new Long(j), str2});
        }
        ArrayList arrayList = new ArrayList(c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j2 = j;
        while (it.hasNext()) {
            n82 n82Var = (n82) it.next();
            if (j <= 0 || n82Var.b >= j) {
                if (TextUtils.equals(str, n82Var.f24567a) && (TextUtils.isEmpty(str2) || TextUtils.equals(str2, n82Var.c))) {
                    long j3 = n82Var.b;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                    arrayList2.add(n82Var);
                }
            }
        }
        return arrayList2;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96318b4", new Object[]{this});
        } else {
            this.f25207a.s();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578b94ea", new Object[]{this});
            return;
        }
        boolean h = v82.h("enableNewIPV", bkt.c().e());
        DAIKVStoreage.put("BehaviX", "enableNewIPV", h + "");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e96462d", new Object[]{this});
        } else {
            this.f25207a.t();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
        } else {
            e();
        }
    }
}
