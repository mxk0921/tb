package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hhe implements j6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ghe f20640a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ghe f20641a;

        public a(ghe gheVar) {
            this.f20641a = gheVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20641a.W().c().b(gnf.EVENT_UI_CONTAINER_LOADED, Boolean.FALSE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ghe f20642a;

        public b(ghe gheVar) {
            this.f20642a = gheVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20642a.W().c().b(gnf.EVENT_UI_CONTAINER_LOADED, Boolean.FALSE);
            }
        }
    }

    public hhe(ghe gheVar) {
        this.f20640a = gheVar;
    }

    @Override // tb.j6x
    public void E1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // tb.j6x
    public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        this.f20640a.c(false);
        ghe gheVar = this.f20640a;
        gheVar.e0(new b(gheVar));
    }

    @Override // tb.j6x
    public void I1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K0(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        } else if (!z) {
            this.f20640a.c(true);
        }
    }

    @Override // tb.j6x
    public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        this.f20640a.c(false);
        ghe gheVar = this.f20640a;
        gheVar.e0(new a(gheVar));
    }
}
