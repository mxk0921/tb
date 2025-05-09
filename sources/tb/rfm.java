package tb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle.TbPopLayerBroadcastReceiver;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.h6c;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TbPopLayerBroadcastReceiver p;
    public static ght q;

    /* renamed from: a  reason: collision with root package name */
    public e3b f27344a;
    public IContainerService.a b;
    public wfm c;
    public h6c.c d;
    public sgc.b e;
    public wu f;
    public IContainerDataService.e g;
    public abm h;
    public IContainerDataService.c i;
    public IContainerService j;
    public IContainerDataService k;
    public IMainFeedsViewService<RecyclerView> l;
    public IMainFeedsLoopStartStopService m;
    public IMainLifecycleService n;
    public final AtomicBoolean o = new AtomicBoolean(false);

    static {
        t2o.a(491782602);
    }

    public void a(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cabd658", new Object[]{this, e3bVar});
            return;
        }
        b(e3bVar);
        h();
    }

    public final void b(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bb74c5", new Object[]{this, e3bVar});
            return;
        }
        TbPopLayerBroadcastReceiver tbPopLayerBroadcastReceiver = p;
        if (tbPopLayerBroadcastReceiver != null) {
            tbPopLayerBroadcastReceiver.d(e3bVar);
        }
        ght ghtVar = q;
        if (ghtVar != null) {
            ghtVar.v(e3bVar);
        }
    }

    public void c(cfc cfcVar, e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98af8910", new Object[]{this, cfcVar, e3bVar});
            return;
        }
        this.f27344a = e3bVar;
        this.k = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.l = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.j = (IContainerService) cfcVar.a(IContainerService.class);
        this.m = (IMainFeedsLoopStartStopService) cfcVar.a(IMainFeedsLoopStartStopService.class);
        this.n = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        d(e3bVar);
        e();
        g(cfcVar);
    }

    public final void d(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f08925b", new Object[]{this, e3bVar});
            return;
        }
        if (p == null) {
            TbPopLayerBroadcastReceiver tbPopLayerBroadcastReceiver = new TbPopLayerBroadcastReceiver();
            p = tbPopLayerBroadcastReceiver;
            f(tbPopLayerBroadcastReceiver);
        }
        if (q == null) {
            q = new ght();
            s2b.c().r(q);
        }
        p.a(e3bVar);
        q.u(e3bVar);
    }

    public final void f(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dea5ace", new Object[]{this, broadcastReceiver});
            return;
        }
        Application a2 = eue.a();
        if (a2 != null && broadcastReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(PopLayer.ACTION_OUT_DISPLAY);
            intentFilter.addAction(PopLayer.ACTION_OUT_DISMISS);
            try {
                LocalBroadcastManager.getInstance(a2).registerReceiver(broadcastReceiver, intentFilter);
            } catch (Throwable th) {
                TLog.loge(PopConst.LOG_TAG_HOME_POP, "PopLifeCycleRegister ", "init pop lifecycle error", th);
            }
        }
    }

    public final void g(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b71b72", new Object[]{this, cfcVar});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) cfcVar.a(IPullRefreshService.class);
        if (iPullRefreshService != null) {
            iPullRefreshService.addPullRefreshListener(new ugm(cfcVar, this.f27344a));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e41e8ee", new Object[]{this});
        } else if (this.j == null || this.k == null || this.l == null || this.m == null) {
            vfm.c("PopLifeCycleRegister ", "service is null, discard registerLifeCycle");
        } else if (this.o.compareAndSet(false, true)) {
            mcm mcmVar = new mcm();
            this.i = mcmVar;
            this.k.addRequestListener(mcmVar);
            hgm hgmVar = new hgm(this.f27344a);
            this.b = hgmVar;
            this.j.addUiRefreshListener(hgmVar);
            wfm wfmVar = new wfm(this.f27344a);
            this.c = wfmVar;
            this.m.registerStartStopListener(wfmVar);
            h6c lifeCycleRegister = this.l.getLifeCycleRegister();
            kdm kdmVar = new kdm(this.f27344a);
            this.e = kdmVar;
            lifeCycleRegister.y(kdmVar);
            ggm ggmVar = new ggm(this.f27344a);
            this.d = ggmVar;
            lifeCycleRegister.h(ggmVar);
            lcm lcmVar = new lcm(this.f27344a, this.k, this.l);
            this.f = lcmVar;
            lifeCycleRegister.J(lcmVar);
            vgm vgmVar = new vgm(this.f27344a);
            this.g = vgmVar;
            this.k.addRequestBizParamsCreator(vgmVar);
            if (this.n != null) {
                this.h = new abm(this.f27344a);
                this.n.getAppLifeCycleRegister().b(this.h);
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d253f5", new Object[]{this});
        } else if (this.j == null || this.k == null || this.l == null) {
            vfm.c("PopLifeCycleRegister ", "service is null, discard unRegisterLifecycle");
        } else if (this.o.compareAndSet(true, false)) {
            this.k.removeRequestListener(this.i);
            this.j.removeUiRefreshListener(this.b);
            this.m.unregisterStartStopListener(this.c);
            h6c lifeCycleRegister = this.l.getLifeCycleRegister();
            lifeCycleRegister.q(this.e);
            lifeCycleRegister.v(this.d);
            lifeCycleRegister.E(this.f);
            this.k.removeRequestBizParamsCreator(this.g);
            IMainLifecycleService iMainLifecycleService = this.n;
            if (iMainLifecycleService != null) {
                iMainLifecycleService.getAppLifeCycleRegister().a(this.h);
            }
        }
    }
}
