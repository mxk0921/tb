package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uaa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final uaa d = new uaa();

    /* renamed from: a  reason: collision with root package name */
    public int f29259a;
    public long b;
    public WeakReference<n> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends dk8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/event/GlobalClickManager$1");
        }

        @Override // tb.dk8
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2529a815", new Object[]{this});
                return;
            }
            uaa.b(uaa.this);
            tfs.f("[GlobalClickManager] runningMonitorCount " + uaa.a(uaa.this));
        }
    }

    static {
        t2o.a(503317235);
    }

    public static /* synthetic */ int a(uaa uaaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdbf6597", new Object[]{uaaVar})).intValue();
        }
        return uaaVar.f29259a;
    }

    public static /* synthetic */ int b(uaa uaaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af10f518", new Object[]{uaaVar})).intValue();
        }
        int i = uaaVar.f29259a;
        uaaVar.f29259a = i - 1;
        return i;
    }

    public static uaa e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uaa) ipChange.ipc$dispatch("b5b573bd", new Object[0]);
        }
        return d;
    }

    public boolean c(n nVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf8ed15f", new Object[]{this, nVar})).booleanValue();
        }
        if (!akt.E0()) {
            return true;
        }
        boolean z2 = nVar.g0().K() instanceof PopLayerComponent;
        boolean z0 = nVar.P().d0().z0();
        boolean z02 = nVar.g0().z0();
        if (akt.V()) {
            if (z0 || z02) {
                z0 = true;
            } else {
                z0 = false;
            }
        }
        tfs.f("[GlobalClickManager] canHandleClick runningMonitorCount:" + this.f29259a + "  rootAppear:" + z0);
        if (this.f29259a > 0 || ((!z0 && !z2) || !d(nVar))) {
            z = false;
        }
        if (z) {
            this.b = System.currentTimeMillis();
            this.c = new WeakReference<>(nVar);
        }
        return z;
    }

    public final boolean d(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3df24962", new Object[]{this, nVar})).booleanValue();
        }
        WeakReference<n> weakReference = this.c;
        if (weakReference == null || weakReference.get() == nVar || System.currentTimeMillis() - this.b > akt.v2()) {
            return true;
        }
        return false;
    }

    public dk8 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dk8) ipChange.ipc$dispatch("6a94e063", new Object[]{this});
        }
        this.f29259a++;
        return new a();
    }
}
