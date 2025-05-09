package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import com.taobao.android.nav.binder.TransitionDrawableProviderBinder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ueu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RectF f29332a;
    public u2e b;
    public u2e c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ueu f29333a = new ueu();

        static {
            t2o.a(578814070);
        }

        public ueu a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ueu) ipChange.ipc$dispatch("24b94181", new Object[]{this});
            }
            if (ueu.b(this.f29333a) != null) {
                return this.f29333a;
            }
            if (!cw6.b()) {
                return null;
            }
            throw new IllegalArgumentException("sourceViewLocation is null");
        }

        public b b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d155f915", new Object[]{this, new Integer(i)});
            }
            ueu.a(this.f29333a, i);
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b8f5abcc", new Object[]{this, new Boolean(z)});
            }
            ueu.f(this.f29333a, z);
            return this;
        }

        public b d(u2e u2eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9dbec733", new Object[]{this, u2eVar});
            }
            ueu.e(this.f29333a, u2eVar);
            return this;
        }

        public b e(u2e u2eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f9fd6cb9", new Object[]{this, u2eVar});
            }
            ueu.d(this.f29333a, u2eVar);
            return this;
        }

        public b f(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("51c9a664", new Object[]{this, rectF});
            }
            ueu.c(this.f29333a, rectF);
            return this;
        }
    }

    static {
        t2o.a(578814068);
    }

    public static /* synthetic */ int a(ueu ueuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9507b854", new Object[]{ueuVar, new Integer(i)})).intValue();
        }
        ueuVar.getClass();
        return i;
    }

    public static /* synthetic */ RectF b(ueu ueuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c24eb5c4", new Object[]{ueuVar});
        }
        return ueuVar.f29332a;
    }

    public static /* synthetic */ RectF c(ueu ueuVar, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("518ecb15", new Object[]{ueuVar, rectF});
        }
        ueuVar.f29332a = rectF;
        return rectF;
    }

    public static /* synthetic */ u2e d(ueu ueuVar, u2e u2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2e) ipChange.ipc$dispatch("cb935ab7", new Object[]{ueuVar, u2eVar});
        }
        ueuVar.b = u2eVar;
        return u2eVar;
    }

    public static /* synthetic */ u2e e(ueu ueuVar, u2e u2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2e) ipChange.ipc$dispatch("7ff4fc38", new Object[]{ueuVar, u2eVar});
        }
        ueuVar.c = u2eVar;
        return u2eVar;
    }

    public static /* synthetic */ boolean f(ueu ueuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e894f7fb", new Object[]{ueuVar, new Boolean(z)})).booleanValue();
        }
        ueuVar.getClass();
        return z;
    }

    public BitmapBinder g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapBinder) ipChange.ipc$dispatch("cb648dba", new Object[]{this});
        }
        if (this.b == null) {
            return null;
        }
        return new TransitionDrawableProviderBinder(this.b);
    }

    public RectF h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("8348f2f5", new Object[]{this});
        }
        return this.f29332a;
    }

    public ueu() {
    }
}
