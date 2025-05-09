package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.homepage.HomepageFragment;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j5b implements w11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<HomepageFragment> f21766a;
    public final bx b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends bx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.j5b$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0953a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f21768a;

            public RunnableC0953a(String str) {
                this.f21768a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j5b.this.c(this.f21768a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j5b.a(j5b.this);
                }
            }
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/HomepagePageListener$1");
        }

        @Override // tb.bx
        public void l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aadc606", new Object[]{this, str});
            } else {
                Coordinator.execute(new RunnableC0953a(str));
            }
        }

        @Override // tb.bx
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                m5a.a().e(new b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xpa.e();
            }
        }
    }

    static {
        t2o.a(729809273);
    }

    public j5b(HomepageFragment homepageFragment) {
        a aVar = new a();
        this.b = aVar;
        this.f21766a = new WeakReference<>(homepageFragment);
        xpa.c(true);
        s2b.c().r(aVar);
    }

    public static /* synthetic */ void a(j5b j5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a782ad4", new Object[]{j5bVar});
        } else {
            j5bVar.d();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        xpa.c(false);
        s2b.c().u(this.b);
        Coordinator.execute(new b());
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c8e6fe", new Object[]{this, str});
        } else if (f4b.b("enableHomePageReportJumpUrl", true) && !TextUtils.isEmpty(str)) {
            vxm vxmVar = vxm.b;
            vxmVar.e().a("home_page_first_jump_url", str);
            vxmVar.e().j("home_page_first_jump_time", SystemClock.uptimeMillis());
            HomepageFragment homepageFragment = this.f21766a.get();
            if (homepageFragment != null) {
                mdd j = vxmVar.j(homepageFragment);
                j.a("home_page_first_jump_url", str);
                j.j("home_page_first_jump_time", SystemClock.uptimeMillis());
            }
        }
    }

    public final void d() {
        HomepageFragment homepageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92ee89f", new Object[]{this});
        } else if (vxl.b().q() && (homepageFragment = this.f21766a.get()) != null) {
            mdd j = vxm.b.j(homepageFragment);
            Map<String, String> e = e7n.e();
            if (e != null && !e.isEmpty()) {
                new JSONObject().putAll(e);
                j.a("qosDump", e);
            }
        }
    }

    @Override // com.taobao.application.common.IPageListener
    public void onPageChanged(String str, int i, long j) {
        HomepageFragment homepageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
        } else if (TextUtils.equals(str, HomepageFragment.class.getSimpleName()) && (homepageFragment = this.f21766a.get()) != null) {
            long r2 = homepageFragment.r2();
            long elapsedRealtime = SystemClock.elapsedRealtime() - r2;
            bqa.e("ApmManager", "onPageChanged pageName=" + str + ", status=" + i + ", time=" + j + " , pageStart=" + r2 + " , cost=" + elapsedRealtime);
            if (i == 2) {
                bqa.a("ApmManager", "目标页面可见 time=" + elapsedRealtime);
                vxm.b.j(homepageFragment).a("pageVisibleTime", Long.valueOf(j));
            } else if (i == 3) {
                bqa.a("ApmManager", "目标页面可交互 time=" + elapsedRealtime);
                mdd j2 = vxm.b.j(homepageFragment);
                j2.a("pageInteractiveTime", Long.valueOf(j));
                j2.a("launchType", g0b.d("launchType", ""));
                j2.a("launchTime", Long.valueOf(g0b.f()));
                j2.a("isHomepageScrollSmoothOpt", Boolean.valueOf(bve.m()));
                String a2 = tm2.a();
                if (!TextUtils.isEmpty(a2)) {
                    j2.a("home_page_buckets", a2);
                }
                xpa.c(false);
                JSONObject e = xpa.e();
                if (e != null) {
                    bqa.e("ApmManager", "imageLoadMsg:" + e);
                    j2.a("imageLoadMsg", uwf.c(e.toJSONString()));
                }
                if (e2b.f() != null) {
                    Map<String, Long> g = e2b.f().g();
                    bqa.e("ApmManager", "totalStages:" + g);
                    j2.a("totalStages", g);
                }
            }
        }
    }
}
