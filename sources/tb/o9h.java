package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class o9h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25228a = "";
    public final Map<String, List<pq6>> b = new HashMap();

    static {
        t2o.a(654311449);
        t2o.a(654311441);
    }

    public o9h() {
        b("clean", d.i());
        ist.b(new Runnable() { // from class: tb.n9h
            @Override // java.lang.Runnable
            public final void run() {
                o9h.this.d();
            }
        });
    }

    public void b(String str, pq6 pq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bb11b7", new Object[]{this, str, pq6Var});
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(str)) {
                    this.b.get(str).add(pq6Var);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pq6Var);
                    this.b.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b678131f", new Object[]{this, str, str2, str3});
            return;
        }
        Iterator it = new ArrayList((Collection) ((HashMap) this.b).get(str)).iterator();
        while (it.hasNext()) {
            ((pq6) it.next()).a("local", str2, str3);
        }
    }

    public final /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe10c416", new Object[]{this});
            return;
        }
        String h = o7h.b().h("local");
        this.f25228a = h;
        if (!TextUtils.isEmpty(h) && o7h.b().c().booleanValue()) {
            c("clean", "", this.f25228a);
        }
    }
}
