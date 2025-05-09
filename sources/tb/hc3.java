package tb;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.icart.a;
import com.taobao.android.icart.performance.preloader.CartTouchDownPreloader;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.tao.TBMainHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class hc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150828);
    }

    public static long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d40d01b0", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j;
        }
        return j;
    }

    public static void b(a aVar, boolean z) {
        long j;
        String str;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c680239", new Object[]{aVar, new Boolean(z)});
            return;
        }
        BaseICartFragment g = aVar.g();
        FragmentActivity activity = g.getActivity();
        if (activity != null) {
            z9v u = z9v.u(activity);
            bav bavVar = new bav(c9x.CART_BIZ_NAME, "购物车");
            bavVar.e(new cav(ub3.PID, ub3.b()));
            bavVar.f(new lc3());
            u.y(activity, bavVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (TBMainHost.b().getContext() == activity) {
                z2 = false;
            }
            Bundle arguments = g.getArguments();
            if (z2) {
                j = activity.getIntent().getLongExtra("NAV_TO_URL_START_TIME", 0L);
            } else if (arguments != null) {
                long j2 = arguments.getLong(y9a.CLICK_STAGE);
                hav.d("CartNavStageTracker", "uptimeMills:" + j2);
                j = c(j2);
            } else {
                j = 0;
            }
            hav.d("CartNavStageTracker", "navStartTime:" + j);
            if (j <= 0) {
                j = currentTimeMillis;
            }
            ic3.j(activity, "mtop.trade.query.bag", j);
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("navStage");
            ultronPerformanceStageModel.setStartMills(j);
            ultronPerformanceStageModel.setEndMills(currentTimeMillis);
            u.h(ultronPerformanceStageModel, null, false);
            u.D("apmClientBeforeNetworkLogicProcess", null);
            if (z2) {
                str = TBBuyPreloadScene.NAV;
            } else {
                str = "tab";
            }
            u.e("startFrom", str);
            u.q("是否重建", String.valueOf(z));
            u.q("启动到购物车间隔", a(g));
            u.q("命中TouchDown", Boolean.valueOf(CartTouchDownPreloader.hitTouchDown()));
        }
    }

    public static String a(Fragment fragment) {
        String str;
        long j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56647e1", new Object[]{fragment});
        }
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            return "无效";
        }
        long j2 = arguments.getLong(y9a.CLICK_STAGE) - c21.g().getLong("startProcessSystemClockTime", -1L);
        if (j2 <= 0) {
            return "无效";
        }
        long[] jArr = {1000, 2000, 3000, 5000, 10000, 20000, 30000, 60000};
        while (true) {
            if (i >= 8) {
                str = null;
                break;
            }
            if (j2 <= jArr[i]) {
                str = "小于" + (j / 1000) + "s";
                break;
            }
            i++;
        }
        return str == null ? "大于60s" : str;
    }
}
