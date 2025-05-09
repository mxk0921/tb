package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.gxp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lt4 extends f1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static lt4 j;
    private long i;

    private lt4(Context context) {
        super(context, "CookieSyncManager");
    }

    public static /* synthetic */ Object ipc$super(lt4 lt4Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 574135313:
                super.c();
                return null;
            case 642261956:
                super.e();
                return null;
            case 1548812690:
                super.run();
                return null;
            case 1815533986:
                super.f();
                return null;
            case 1942650916:
                super.d();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/patronus/simplecookie/CookieSyncManager");
        }
    }

    public static synchronized lt4 k(Context context) {
        synchronized (lt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lt4) ipChange.ipc$dispatch("fd988ca", new Object[]{context});
            }
            if (j == null) {
                j = new lt4(context);
            }
            return j;
        }
    }

    public static synchronized lt4 m() {
        synchronized (lt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lt4) ipChange.ipc$dispatch("baacd9cc", new Object[0]);
            }
            lt4 lt4Var = j;
            if (lt4Var != null) {
                return lt4Var;
            }
            throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
        }
    }

    private void o(ArrayList<gxp.d> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29e8807", new Object[]{this, arrayList});
            return;
        }
        Iterator<gxp.d> it = arrayList.iterator();
        while (it.hasNext()) {
            gxp.d next = it.next();
            byte b = next.i;
            if (b != 1) {
                if (b != 0) {
                    this.d.f(next.f20301a, next.b, next.c);
                }
                if (next.i != 2) {
                    this.d.a(next);
                    gxp.k().u(next);
                } else {
                    gxp.k().d(next);
                }
            }
        }
    }

    @Override // tb.f1x
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // tb.f1x
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // tb.f1x
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // tb.f1x
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // tb.f1x
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28353183", new Object[]{this});
        } else if (gxp.k().a()) {
            ArrayList<gxp.d> l = gxp.k().l(this.i);
            this.i = System.currentTimeMillis();
            o(l);
            o(gxp.k().e());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa56ee2", new Object[]{this});
            return;
        }
        l1x l1xVar = this.d;
        if (l1xVar != null) {
            l1xVar.c();
        }
    }

    public void i(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264bba26", new Object[]{this, new Long(j2)});
            return;
        }
        l1x l1xVar = this.d;
        if (l1xVar != null) {
            l1xVar.d(j2);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f570c4d", new Object[]{this});
            return;
        }
        l1x l1xVar = this.d;
        if (l1xVar != null) {
            l1xVar.e();
        }
    }

    public ArrayList<gxp.d> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e411bb7f", new Object[]{this, str});
        }
        l1x l1xVar = this.d;
        if (l1xVar == null) {
            return new ArrayList<>();
        }
        return l1xVar.g(str);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        l1x l1xVar = this.d;
        if (l1xVar == null) {
            return false;
        }
        return l1xVar.i();
    }

    @Override // tb.f1x, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
