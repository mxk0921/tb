package tb;

import android.content.Context;
import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.o1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a00<T extends o1> {

    /* renamed from: a  reason: collision with root package name */
    public final rtn f15458a;
    public final p1<T> b;
    public final g1<T, ? extends y00<T>> c;
    public final Map<Class, aw1> d;
    public kd8 e;
    public final Context f;
    public boolean g;
    public final Object h = new Object();
    public int i;
    public long j;
    public int k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends i30 {

        /* compiled from: Taobao */
        /* renamed from: tb.a00$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0873a extends i30 {
            public C0873a() {
            }

            @Override // tb.i30
            public void a() {
                List<T> g;
                long f = a00.this.c.f();
                long j = 0;
                int i = 0;
                while (a00.this.d()) {
                    a00 a00Var = a00.this;
                    if (i >= a00Var.j || (g = a00Var.c.g(j, f, a00Var.i)) == null) {
                        break;
                    }
                    ArrayList arrayList = (ArrayList) g;
                    if (arrayList.size() <= 0) {
                        break;
                    }
                    try {
                        a00.this.c(g);
                        j = ((o1) arrayList.get(arrayList.size() - 1)).b() + 1;
                        i++;
                    } catch (DbException unused) {
                    }
                }
                a00.this.g = false;
            }
        }

        public a() {
        }

        @Override // tb.i30
        public void a() {
            if (a00.this.c.i()) {
                a00.this.f15458a.execute(new C0873a());
            }
        }
    }

    public a00(Context context, p1<T> p1Var, g1<T, ? extends y00<T>> g1Var, rtn rtnVar) {
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        this.i = 0;
        this.j = 0L;
        this.k = 0;
        this.f = context;
        this.b = p1Var;
        this.c = g1Var;
        this.f15458a = rtnVar;
        hashMap.put(yog.class, yog.c(context));
        this.i = 20;
        this.j = 100L;
        this.k = 1;
    }

    public void b(int i) {
        List<T> list;
        g1<T, ? extends y00<T>> g1Var = this.c;
        if (i == 1) {
            list = g1Var.d();
        } else if (i == 2) {
            list = g1Var.h();
        } else {
            list = g1Var.e();
        }
        if (list != null && list.size() > 0) {
            try {
                g1Var.c(list);
            } catch (DbException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean c(List<T> list) throws DbException {
        if (list != null && list.size() > 0) {
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > this.k) {
                    break;
                } else if (!d()) {
                    return true;
                } else {
                    yog.c(this.f).b();
                    z = this.b.upload(list);
                    if (z) {
                        this.c.c(list);
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                e(list);
                return false;
            }
        }
        return true;
    }

    public boolean d() {
        Map<Class, aw1> map = this.d;
        if (map != null) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.size() != 0) {
                for (aw1 aw1Var : hashMap.values()) {
                    if (!aw1Var.a()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public abstract void e(List<T> list) throws DbException;

    public void f(ACMLimitConfig aCMLimitConfig) {
        yog c = yog.c(this.f);
        c.d(aCMLimitConfig);
        ((HashMap) this.d).put(yog.class, c);
    }

    public void g(long j) {
        this.j = j;
    }

    public void h(int i) {
        this.i = i;
    }

    public void i(int i) {
        this.k = i;
    }

    public void j(boolean z) {
        if (this.e == null) {
            this.e = new kd8();
        }
        this.e.b(z);
        ((HashMap) this.d).put(kd8.class, this.e);
    }

    public void k() {
        synchronized (this.h) {
            try {
                if (!this.g) {
                    this.g = true;
                    this.f15458a.execute(new a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
