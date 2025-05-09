package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.a;
import com.taobao.android.publisher.service.export.ayscpublish.core.b;
import com.taobao.android.publisher.service.export.ayscpublish.core.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile k4n b;

    /* renamed from: a  reason: collision with root package name */
    public ded f22396a;

    public static k4n b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k4n) ipChange.ipc$dispatch("e3fd3be9", new Object[0]);
        }
        if (b == null) {
            synchronized (k4n.class) {
                try {
                    if (b == null) {
                        b = new k4n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a151973c", new Object[]{this, aVar});
        }
        return c.t().l(aVar);
    }

    public ded c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("5b317dcc", new Object[]{this});
        }
        return this.f22396a;
    }

    public void d(ded dedVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9860cea", new Object[]{this, dedVar, new Boolean(z)});
            return;
        }
        this.f22396a = dedVar;
        if (z) {
            c.t().w();
        }
    }

    public boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0e99bb", new Object[]{this, bVar})).booleanValue();
        }
        return c.t().x(bVar);
    }

    public <T extends a<?>> boolean f(Class<T> cls, b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adefd3fc", new Object[]{this, cls, bVar})).booleanValue();
        }
        return c.t().y(cls, bVar);
    }
}
