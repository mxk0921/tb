package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uyo implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "ScrollToBannerRunnable";
    private static final int d = -1;

    /* renamed from: a  reason: collision with root package name */
    private final cfc f29679a;
    private int b;

    static {
        t2o.a(491782409);
    }

    public uyo(cfc cfcVar) {
        this.f29679a = cfcVar;
    }

    private int a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e676097e", new Object[]{this, cfcVar})).intValue();
        }
        return h83.a(ul4.d(cfcVar));
    }

    private int b(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84b2b9ed", new Object[]{this, cfcVar})).intValue();
        }
        int a2 = a(cfcVar);
        if (a2 == -1) {
            fve.e(c, "未找到首焦的位置,尝试寻找信息流首坑的位置");
            a2 = lnn.b(cfcVar);
        }
        if (a2 == -1) {
            fve.e(c, "未找到首焦或信息流首坑，不执行");
            return -1;
        } else if (!d(cfcVar, a2)) {
            fve.e(c, "目标卡片上边沿不可见");
            return -1;
        } else if (a2 <= this.b) {
            return a2;
        } else {
            fve.e(c, "bannerPosition ： " + a2 + "，mLastClickIndex ： " + this.b);
            return -1;
        }
    }

    private boolean d(cfc cfcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66bba8", new Object[]{this, cfcVar, new Integer(i)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return h83.b(cfcVar, iMainFeedsViewService, i);
        }
        fve.e(c, "isCardTopEdgeVisible mainFeedsViewService is null");
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa8c3c1", new Object[]{this})).booleanValue();
        }
        if (b(this.f29679a) != -1) {
            return true;
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bcceb96", new Object[]{this});
        } else {
            g(-1);
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8de43a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        f();
        e();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fde49fb", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f29679a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            int b = b(this.f29679a);
            if (b == -1) {
                fve.e(c, "未找到目标位置");
                return;
            }
            fve.e(c, "执行滚动到banner，bannerPosition ： " + b);
            iMainFeedsViewService.smoothScrollToPositionWithOffset(b, 0);
        }
    }
}
