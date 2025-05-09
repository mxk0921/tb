package tb;

import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.impl.trace.feeds.secondrefresh.SecondRefreshStatus;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.h6c;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n7p implements g8d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_DRAW_COLD_START_DATA = "startDrawColdStartData";
    public static final String STAGE_START_COLD_START_TASK = "startColdStartTask";
    public static long l = -1;
    public static long m = -1;
    public static boolean n = false;
    public static boolean o = false;
    public final IMainLifecycleService c;
    public final IMainFeedsViewService<?> d;
    public final IContainerDataService<?> e;
    public final ImageMonitorService f;
    public ImageMonitorService.a g;
    public h6c.b h;
    public sgc.a i;
    public h6d j;

    /* renamed from: a  reason: collision with root package name */
    public long f24557a = -1;
    public long b = -1;
    public boolean k = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.n7p$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC1004a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f24559a;

            public RunnableC1004a(Map map) {
                this.f24559a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mza.d().b("homeSecondRefresh", "home_mtop_cos_time", "1.0", "Page_Home_Mtop", "", this.f24559a);
                if (cw6.b()) {
                    uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_second_refresh", "", "", this.f24559a.toString());
                }
            }
        }

        public a() {
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }

        @Override // tb.h6c.b
        public void c() {
            long startUptimeMillis;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
                return;
            }
            dvh.g(dvh.j(dvh.TASK_UI_REFRESH), true);
            if (h93.b(n7p.b(n7p.this))) {
                n7p.d(n7p.this, SystemClock.uptimeMillis());
                dvh.e(dvh.STAGE_1ST_LOCAL_DATA_UI_REFRESH, true);
            } else if (!n7p.e(n7p.this) && n7p.g(n7p.this)) {
                n7p.f(n7p.this, true);
                SecondRefreshStatus.setSecondRefreshEnd(true);
                n7p.i(n7p.this, SystemClock.uptimeMillis());
                vxm vxmVar = vxm.b;
                vxmVar.e().a("homeSecondRefreshEnd", Long.valueOf(n7p.h(n7p.this)));
                vxmVar.e().j("homeSecondRefreshEnd", n7p.h(n7p.this));
                HashMap hashMap = new HashMap(16);
                if (n7p.c(n7p.this) > 0 && n7p.h(n7p.this) > 0) {
                    hashMap.put("coldStartTotalDuration", String.valueOf(n7p.h(n7p.this) - n7p.c(n7p.this)));
                }
                if (n7p.c(n7p.this) > 0 && n7p.j() > 0) {
                    hashMap.put("coldStartTaskDispatchDuration", String.valueOf(n7p.j() - n7p.c(n7p.this)));
                }
                if (n7p.k() > 0 && n7p.h(n7p.this) > 0) {
                    hashMap.put("coldStartOnScreenDuration", String.valueOf(n7p.h(n7p.this) - n7p.k()));
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    startUptimeMillis = Process.getStartUptimeMillis();
                    if (n7p.h(n7p.this) > 0 && startUptimeMillis > 0) {
                        hashMap.put("coldStartProcessTotalDuration", String.valueOf(n7p.h(n7p.this) - startUptimeMillis));
                    }
                }
                hashMap.put(m09.TASK_TYPE_LEVEL, sue.a());
                get.a().e(new RunnableC1004a(hashMap));
                dvh.e(dvh.STAGE_1ST_NETWORK_DATA_UI_REFRESH, true);
                e7n.c(e7n.TAG_COLD_START_REFRESH_END);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements sgc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(n7p n7pVar) {
        }

        @Override // tb.sgc.a
        public void a(int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ade892a", new Object[]{this, new Integer(i), baseSectionModel, view});
            } else if (dvh.l()) {
                String j = dvh.j(dvh.TASK_UI_REFRESH);
                if (baseSectionModel.getTemplate() != null && !TextUtils.isEmpty(j)) {
                    String str = "card_" + i;
                    dvh.m(str, baseSectionModel.getTemplate().getName(), j);
                    dvh.b(str, j);
                }
            }
        }

        @Override // tb.sgc.a
        public void b(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6edee1ff", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            } else if (dvh.l()) {
                String j = dvh.j(dvh.TASK_UI_REFRESH);
                String str = "card_" + i;
                String str2 = str + "_hit_status";
                int i2 = R.id.item_hit_status;
                int intValue = view.getTag(i2) instanceof Integer ? ((Integer) view.getTag(i2)).intValue() : -1;
                view.setTag(i2, null);
                dvh.m(str2, String.valueOf(intValue), j);
                if (baseSectionModel.getTemplate() != null && !TextUtils.isEmpty(j)) {
                    dvh.f(str, true, j);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements ImageMonitorService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be6c07c", new Object[]{this, new Boolean(z)});
            } else if (dvh.l() && !z) {
                n7p.l(n7p.this, true);
            }
        }
    }

    static {
        t2o.a(491782556);
        t2o.a(491782563);
    }

    public n7p(cfc cfcVar) {
        this.d = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.e = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.c = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.f = (ImageMonitorService) cfcVar.a(ImageMonitorService.class);
    }

    public static /* synthetic */ IMainFeedsViewService b(n7p n7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("f55243ef", new Object[]{n7pVar});
        }
        return n7pVar.d;
    }

    public static /* synthetic */ long c(n7p n7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("327525a", new Object[]{n7pVar})).longValue();
        }
        return n7pVar.f24557a;
    }

    public static /* synthetic */ long d(n7p n7pVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58775e14", new Object[]{n7pVar, new Long(j)})).longValue();
        }
        n7pVar.f24557a = j;
        return j;
    }

    public static /* synthetic */ boolean e(n7p n7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("730c2c09", new Object[]{n7pVar})).booleanValue();
        }
        return n7pVar.k;
    }

    public static /* synthetic */ boolean f(n7p n7pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52df475", new Object[]{n7pVar, new Boolean(z)})).booleanValue();
        }
        n7pVar.k = z;
        return z;
    }

    public static /* synthetic */ boolean g(n7p n7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2f105a8", new Object[]{n7pVar})).booleanValue();
        }
        return n7pVar.r();
    }

    public static /* synthetic */ long h(n7p n7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52d5df37", new Object[]{n7pVar})).longValue();
        }
        return n7pVar.b;
    }

    public static /* synthetic */ long i(n7p n7pVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe9a6cd7", new Object[]{n7pVar, new Long(j)})).longValue();
        }
        n7pVar.b = j;
        return j;
    }

    public static /* synthetic */ long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552fb0", new Object[0])).longValue();
        }
        return l;
    }

    public static /* synthetic */ long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa3b6af1", new Object[0])).longValue();
        }
        return m;
    }

    public static /* synthetic */ void l(n7p n7pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae09cab4", new Object[]{n7pVar, new Boolean(z)});
        } else {
            n7pVar.u(z);
        }
    }

    @Override // tb.g8d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
        } else {
            m();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eca425", new Object[]{this});
        } else if (this.d != null) {
            this.h = n();
            this.d.getLifeCycleRegister().M(this.h);
            this.i = p();
            this.d.getLifeCycleRegister().C(this.i);
            if (this.c != null) {
                this.j = q();
                this.c.getPageLifeCycleRegister().a(this.j);
                if (this.f != null) {
                    ImageMonitorService.a o2 = o();
                    this.g = o2;
                    this.f.addImageLoadListener(o2);
                }
            }
        }
    }

    public final h6c.b n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("67dd6bff", new Object[]{this});
        }
        return new a();
    }

    public final ImageMonitorService.a o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageMonitorService.a) ipChange.ipc$dispatch("91103749", new Object[]{this});
        }
        return new d();
    }

    public final sgc.a p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.a) ipChange.ipc$dispatch("afd3240c", new Object[]{this});
        }
        return new b(this);
    }

    public final h6d q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new c();
    }

    public final boolean r() {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5815f529", new Object[]{this})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.e;
        if (iContainerDataService == null || iContainerDataService.getContainerData() == null || (base = this.e.getContainerData().getBase()) == null || base.getPageParams() == null || base.getPageParams().getPageNum() != 0) {
            return false;
        }
        return true;
    }

    @Override // tb.g8d
    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else {
            t();
        }
    }

    public final void t() {
        ImageMonitorService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f34d22", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.d;
        if (iMainFeedsViewService != null) {
            if (this.h != null) {
                iMainFeedsViewService.getLifeCycleRegister().k(this.h);
            }
            if (this.i != null) {
                this.d.getLifeCycleRegister().B(this.i);
            }
            IMainLifecycleService iMainLifecycleService = this.c;
            if (iMainLifecycleService != null) {
                if (this.j != null) {
                    iMainLifecycleService.getPageLifeCycleRegister().b(this.j);
                }
                ImageMonitorService imageMonitorService = this.f;
                if (imageMonitorService != null && (aVar = this.g) != null) {
                    imageMonitorService.removeImageLoadListener(aVar);
                }
            }
        }
    }

    public static void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d48bda2", new Object[]{str});
        } else if (str != null) {
            if (!str.equals(STAGE_START_COLD_START_TASK)) {
                if (str.equals(STAGE_DRAW_COLD_START_DATA) && !o) {
                    o = true;
                    m = SystemClock.uptimeMillis();
                }
            } else if (!n) {
                n = true;
                l = SystemClock.uptimeMillis();
            }
        }
    }

    public final void u(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724e64f2", new Object[]{this, new Boolean(z)});
        } else if (dvh.l()) {
            ImageMonitorService imageMonitorService = this.f;
            if (imageMonitorService != null) {
                dvh.n("1st_image_refresh_finish", String.valueOf(imageMonitorService.getImageLoadTimestamp(true)));
                dvh.n("2nd_image_refresh_finish", String.valueOf(this.f.getImageLoadTimestamp(false)));
                dvh.n("1st_image_refresh_count", String.valueOf(this.f.getImageCount(true)));
                dvh.n("2nd_image_refresh_count", String.valueOf(this.f.getImageCount(false)));
            }
            System.currentTimeMillis();
            PositionInfo c2 = kbq.c(Globals.getApplication());
            if (c2 != null) {
                dvh.n("country", c2.countryCode);
            }
            if (kbq.h(Globals.getApplication())) {
                str = "true";
            } else {
                str = "false";
            }
            dvh.n("is_main_land", str);
            a3w queryCurrentVersionInfo = n78.a(t1c.class) != null ? ((t1c) n78.a(t1c.class)).queryCurrentVersionInfo() : null;
            if (queryCurrentVersionInfo != null) {
                dvh.n("version_codes", queryCurrentVersionInfo.c);
            }
            dvh.p(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onNewIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            }
        }

        @Override // tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                n7p.l(n7p.this, false);
            }
        }

        @Override // tb.h6d
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onWillExit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public /* synthetic */ void onColdStartResume() {
        }

        @Override // tb.h6d
        public /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
