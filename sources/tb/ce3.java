package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngineFactory;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ce3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150892);
    }

    public static void a(long j, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f08b2", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
            return;
        }
        ub3.a a2 = ub3.a.a("cartPrefetch");
        long prefetchStartTime = CartVEngineFactory.getPrefetchStartTime();
        long j2 = 0;
        if (prefetchStartTime > 0) {
            j2 = j - prefetchStartTime;
        }
        a2.indicator("c1", "冷起到购物车间隔时长：" + b(j2));
        h15 success = a2.sampling(0.001f).success(z2);
        if (z2) {
            str = "预创建成功 cache=" + z;
        } else {
            str = "预创建失败";
        }
        success.tag(str).message("intervalTime=" + j2);
        ub3.e(a2);
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe0752bc", new Object[]{new Long(j)});
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            return "预热任务执行时间比进入购物车时间晚";
        }
        if (i == 0) {
            return "预热任务还未开始执行";
        }
        if (j < 500) {
            return "500ms内";
        }
        if (j < 1000) {
            return "大于500ms，小于1s";
        }
        if (j < 3000) {
            return "大于1s，小于3s";
        }
        if (j < 30000) {
            return "大于3s，小于30s";
        }
        if (j < 60000) {
            return "大于30s，小于1分钟";
        }
        if (j < xg4.DEFAULT_SMALL_MAX_AGE) {
            return "大于1分钟，小于半小时";
        }
        if (j < 3600000) {
            return "大于半小时，小于1小时";
        }
        return "大于或等于1小时";
    }
}
