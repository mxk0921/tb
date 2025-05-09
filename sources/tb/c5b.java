package tb;

import android.os.Handler;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.HomepageFragment;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c5b implements v11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<HomepageFragment> f16869a;
    public long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f16870a;

        public a(long j) {
            this.f16870a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f0b.i().p("profilerDump", 4);
            jdv.a(this.f16870a);
            f0b.i().c("profilerDump");
        }
    }

    static {
        t2o.a(729809261);
    }

    public c5b(HomepageFragment homepageFragment) {
        this.f16869a = new WeakReference<>(homepageFragment);
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HomepageFragment homepageFragment = this.f16869a.get();
        long r2 = homepageFragment == null ? 0L : homepageFragment.r2();
        if (i == 1) {
            bqa.a("ApmManager", "热启动结束 time=" + (System.currentTimeMillis() - r2));
        }
        if (i == 0) {
            z = true;
        }
        if (z) {
            bqa.a("ApmManager", "冷启动结束 time=" + (System.currentTimeMillis() - r2));
        }
        if (i2 == 0) {
            if (z) {
                this.b = System.currentTimeMillis();
            }
            bqa.a("ApmManager", "目标页面第一帧上屏 time=" + (System.currentTimeMillis() - r2));
        } else if (i2 == 1) {
            bqa.a("ApmManager", "目标页面可视 time=" + (System.currentTimeMillis() - r2));
            e7n.c(e7n.TAG_LAUNCH_VISIBLE);
            e7n.g("process_start_time", dvh.i());
            e7n.g("launch_visible_time", System.currentTimeMillis());
            if (z && dvh.l()) {
                dvh.n("launch_draw_start", String.valueOf(this.b));
                dvh.n(e7n.TAG_LAUNCH_VISIBLE, String.valueOf(System.currentTimeMillis()));
                dvh.n("process_start", String.valueOf(dvh.i()));
            }
            f0b.i().f(f0b.HOME_VISIBLE);
            f0b.i().f(f0b.HOME_VISIBLE_ONLY);
            f0b.i().m("homeVisible");
        } else if (i2 == 2) {
            bqa.a("ApmManager", "目标页面可交互 time=" + (System.currentTimeMillis() - r2));
            e7n.c(e7n.TAG_LAUNCH_INTERACTIVE);
            e7n.g("launch_interactive_time", System.currentTimeMillis());
            if (z && dvh.l()) {
                dvh.n(e7n.TAG_LAUNCH_INTERACTIVE, String.valueOf(System.currentTimeMillis()));
            }
            if (z) {
                f0b.i().m("homeInteractive");
            }
            long elapsedRealtime = r2 > 0 ? SystemClock.elapsedRealtime() - r2 : 0L;
            if (!vxl.j() && elapsedRealtime > 0) {
                new Handler().postDelayed(new a(elapsedRealtime), 5000L);
            }
        } else if (i2 == 3) {
            if (z && dvh.l()) {
                dvh.n("launch_ski_interactive", String.valueOf(System.currentTimeMillis()));
            }
            bqa.a("ApmManager", "目标页面可流畅交互 time=" + (System.currentTimeMillis() - r2));
        } else if (i2 == 4) {
            bqa.a("ApmManager", "启动完成 time=" + (System.currentTimeMillis() - r2));
            if (z && dvh.l()) {
                dvh.n("launch_completed", String.valueOf(System.currentTimeMillis()));
            }
            new exl().d();
            new m7p().d();
        }
    }
}
