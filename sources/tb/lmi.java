package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ppi f23415a;
    public final String b;
    public final List<lmi> c = new ArrayList();

    static {
        t2o.a(83886257);
    }

    public lmi(String str, ppi ppiVar) {
        this.f23415a = ppiVar;
        this.b = str;
    }

    public synchronized void a(lmi lmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0993ee1", new Object[]{this, lmiVar});
            return;
        }
        if (lmiVar != null) {
            ((ArrayList) this.c).add(lmiVar);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return this.b;
    }

    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
        }
    }

    public void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1b0074", new Object[]{this, str, obj});
        } else {
            this.f23415a.a(str, obj);
        }
    }

    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d4240e", new Object[]{this, obj});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            d(((lmi) it.next()).b, obj);
        }
    }
}
