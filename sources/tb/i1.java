package tb;

import android.content.Context;
import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i1 {
    public static final int UPLOAD_TYPE_MANUAL = 1;
    public static final int UPLOAD_TYPE_TIMER = 2;
    public static final AtomicInteger d = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final j1 f21027a;
    public final n1 b;
    public final h1 c;

    public i1(Context context, p1<l1> p1Var) {
        this(context, p1Var, null);
    }

    public final void a(List<l1> list) {
        try {
            this.f21027a.b(list);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public void b(int i) {
        this.b.b(i);
    }

    public void c(List<l1> list) {
        a(list);
    }

    public void d(ACMLimitConfig aCMLimitConfig) {
        this.c.a(aCMLimitConfig);
    }

    public void e(long j) {
        this.b.g(j);
    }

    public void f(int i) {
        this.b.h(i);
    }

    public void g(int i) {
        this.b.i(i);
    }

    public void h(boolean z) {
        this.c.b(z);
    }

    public void i(int i) {
        if (i == 1 || i == 2) {
            this.b.n(i);
        }
    }

    public void j() {
        this.c.c();
    }

    public void k() {
        this.b.p();
    }

    public i1(Context context, p1<l1> p1Var, String str) {
        rtn rtnVar = new rtn("ACMMonitor" + d.getAndAdd(1));
        j1 j1Var = new j1(context.getApplicationContext(), rtnVar, str == null ? a55.TABLE_NAME_MONITOR : str.concat("_alitx_monitor"), str);
        this.f21027a = j1Var;
        n1 n1Var = new n1(context.getApplicationContext(), j1Var, p1Var, rtnVar);
        this.b = n1Var;
        this.c = new h1(n1Var);
    }
}
