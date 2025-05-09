package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dgf implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG_COLLECTION = "guangguang_collection";

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f17793a;
    public rba b;
    public boolean c;
    public boolean d;
    public long e = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((ICollectionService) dgf.a(dgf.this).getService(ICollectionService.class)).openForPageEnter();
            }
        }
    }

    static {
        t2o.a(468713508);
        t2o.a(468714445);
    }

    public dgf(FluidContext fluidContext) {
        this.f17793a = fluidContext;
    }

    public static /* synthetic */ FluidContext a(dgf dgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("a17f52e1", new Object[]{dgfVar});
        }
        return dgfVar.f17793a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cf8d15", new Object[]{this});
        } else if (jz3.c()) {
            try {
                ((IContainerService) this.f17793a.getService(IContainerService.class)).getContentView().post(new a());
            } catch (Exception e) {
                ir9.b("DXCollection", e + "--e");
            }
        }
    }

    public void j(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d19c45", new Object[]{this, aVar});
        } else if (this.b == null) {
            FluidContext fluidContext = this.f17793a;
            rba rbaVar = new rba(fluidContext, (ViewGroup) ((IContainerService) fluidContext.getService(IContainerService.class)).getContentView().findViewById(R.id.fluid_sdk_global_h5));
            this.b = rbaVar;
            rbaVar.U(aVar);
            ((IMessageService) this.f17793a.getService(IMessageService.class)).registerMessageHandler(this.b);
        }
    }

    public void k() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e588ae8", new Object[]{this});
            return;
        }
        igs.a("initGlobalInteractHandler");
        ncp j = ((IDataService) this.f17793a.getService(IDataService.class)).getConfig().j();
        if (ngf.d() && !TextUtils.isEmpty(j.b) && !((IQuickOpenService) this.f17793a.getService(IQuickOpenService.class)).isInQuickOpenMode()) {
            z = true;
        }
        this.c = z;
        igs.c();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3518ab3", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void m(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead7b80f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            rba rbaVar = this.b;
            if (rbaVar != null) {
                rbaVar.s();
            }
            if (this.d) {
                this.d = false;
                boolean C = od0.D().f().C();
                if (akt.p2("ShortVideo.checkMainActivity", true)) {
                    if (od0.D().f().a() != this.f17793a.getContext()) {
                        z2 = false;
                    }
                    C &= z2;
                }
                if (C) {
                    yre.c(this.f17793a, "5", null, null, null, null);
                }
            }
        } else {
            rba rbaVar2 = this.b;
            if (rbaVar2 != null) {
                rbaVar2.m();
            }
            this.d = true;
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        rba rbaVar = this.b;
        if (rbaVar != null) {
            rbaVar.Y();
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        rba rbaVar = this.b;
        if (rbaVar != null) {
            rbaVar.X();
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.e < 0) {
            this.e = SystemClock.elapsedRealtime();
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }
}
