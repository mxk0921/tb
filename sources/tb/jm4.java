package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.iqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jm4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements iqb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cfc f22067a;

        static {
            t2o.a(486539612);
            t2o.a(488636465);
        }

        public a(cfc cfcVar) {
            this.f22067a = cfcVar;
        }

        @Override // tb.iqb.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30cf99d1", new Object[]{this});
            }
        }

        @Override // tb.iqb.a
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df5adadd", new Object[]{this, context});
                return;
            }
            fve.e("LifecycleHandler", "createContainerBegin");
            jm4.a(jm4.this, this.f22067a, context);
        }

        @Override // tb.iqb.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afa2fd3d", new Object[]{this});
                return;
            }
            fve.f("LifecycleHandler", "createContainerFinish");
            eve.c("notifyCreateContainerEnd", "triggerCache");
            jm4.b(jm4.this, this.f22067a);
            eve.b("notifyCreateContainerEnd", "triggerCache");
        }
    }

    static {
        t2o.a(486539611);
    }

    public jm4(cfc cfcVar, xm4 xm4Var) {
        xm4Var.a(new a(cfcVar));
    }

    public static /* synthetic */ void a(jm4 jm4Var, cfc cfcVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3f6b04", new Object[]{jm4Var, cfcVar, context});
        } else {
            jm4Var.c(cfcVar, context);
        }
    }

    public static /* synthetic */ void b(jm4 jm4Var, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e91a963", new Object[]{jm4Var, cfcVar});
        } else {
            jm4Var.d(cfcVar);
        }
    }

    public final void c(cfc cfcVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecd02d3", new Object[]{this, cfcVar, context});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            iDxItemRenderService.initDx();
            if (context instanceof Activity) {
                iDxItemRenderService.setDxCurrentActivity((Activity) context);
                return;
            }
            return;
        }
        fve.e("LifecycleHandler", "initDx dxService == null");
        throw new IllegalArgumentException("triggerCache dataService 必须注册");
    }

    public final void d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f358c9ef", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.triggerEvent("LoadCache", null);
        } else {
            fve.e("LifecycleHandler", "createContainerFinish");
            throw new IllegalArgumentException("triggerCache dataService 必须注册");
        }
    }
}
