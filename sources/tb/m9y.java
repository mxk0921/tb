package tb;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class m9y {
    public boolean b;
    public Object c;
    public Exception d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f23881a = new Object();
    public List<dcy<Object>> e = new ArrayList();

    public final m9y a(dcy dcyVar) {
        synchronized (this.f23881a) {
            try {
                if (!this.b) {
                    this.e.add(dcyVar);
                } else {
                    dcyVar.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final void b() {
        synchronized (this.f23881a) {
            for (dcy<Object> dcyVar : this.e) {
                try {
                    dcyVar.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.e = null;
        }
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.f23881a) {
            exc = this.d;
        }
        return exc;
    }

    public final Object d() {
        Object obj;
        synchronized (this.f23881a) {
            try {
                if (this.d == null) {
                    obj = this.c;
                } else {
                    throw new RuntimeException(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean e() {
        synchronized (this.f23881a) {
        }
        return false;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.f23881a) {
            try {
                if (this.b) {
                    e();
                    if (this.d == null) {
                        z = true;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
