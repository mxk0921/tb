package tb;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.location.ILocationService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k3b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f22379a;

        public a(Application application) {
            this.f22379a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k3b.this.f33099a.p("locationChangeReqPrepareParams", 2);
            ILocationService iLocationService = (ILocationService) c4b.i().h(ILocationService.class);
            if (iLocationService != null) {
                iLocationService.updateLocationAtStartUp(this.f22379a);
            }
            k3b.this.f33099a.c("locationChangeReqPrepareParams");
        }
    }

    static {
        t2o.a(729809332);
    }

    public static /* synthetic */ Object ipc$super(k3b k3bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomePreRequestLauncher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        vxm vxmVar = vxm.b;
        vxmVar.e().a("preRequestStart", Long.valueOf(SystemClock.uptimeMillis()));
        super.a(application, hashMap);
        vxmVar.e().a("SecondRefreshOpt", Boolean.valueOf(p7p.k()));
        if (!vxl.b().m() && !c(hashMap)) {
            String c = dvh.c(dvh.TASK_HOME_COLD_START_PRE_REQUEST);
            phg.b("doHomeColdStartReq");
            b();
            phg.a("doHomeColdStartReq");
            dvh.g(c, true);
        }
        if (vxl.j() && !vxl.b().m()) {
            m5a.a().e(new a(application));
        }
        uqa.b("LauncherTask", "HomePreRequestLauncher", "HomePreRequestLauncher.init; 冷启发mtop请求");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911b3491", new Object[]{this});
            return;
        }
        this.f33099a.l("mtopRequestBefore");
        this.f33099a.p("mtopRequestParams", 1);
        this.f33099a.p("coldStartReqPrepareParams", 2);
        n7p.s(n7p.STAGE_START_COLD_START_TASK);
        yyj.e().x();
        this.f33099a.c("coldStartReqPrepareParams");
    }

    public final boolean c(HashMap<String, Object> hashMap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab6f6777", new Object[]{this, hashMap})).booleanValue();
        }
        if (!hashMap.containsKey("linkLaunch") || !hashMap.containsKey("startIntent")) {
            return false;
        }
        Object obj = hashMap.get("linkLaunch");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        Object obj2 = hashMap.get("startIntent");
        if (!(obj2 instanceof String)) {
            return false;
        }
        String str = (String) obj2;
        if (!str.contains("recmdparams") || !str.contains("up_nids") || vxl.b().i()) {
            z = false;
        }
        bve.h = z;
        return z;
    }
}
