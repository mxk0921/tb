package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cdp c = new cdp();

    /* renamed from: a  reason: collision with root package name */
    public volatile long f16994a = Long.MAX_VALUE;
    public volatile long b = 0;

    static {
        t2o.a(1034944576);
    }

    public static cdp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdp) ipChange.ipc$dispatch("3659774f", new Object[0]);
        }
        return c;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c04c7a", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public void c(MtopResponse mtopResponse, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d49e40a", new Object[]{this, mtopResponse, new Long(j), new Long(j2)});
        } else if (mtopResponse != null && !mtopResponse.isApiSuccess()) {
            try {
                long j3 = mtopResponse.getDataJsonObject().getLong("highwayTime");
                long j4 = j / 2;
                if (j4 < 0) {
                    Log.e("ServerTimeHandler", "response error" + mtopResponse.getMtopStat().toString());
                }
                synchronized (this) {
                    if (this.f16994a > j4) {
                        this.b = (j3 + j4) - j2;
                        this.f16994a = j4;
                    }
                }
            } catch (Exception e) {
                Log.e("ServerTimeHandler", "updateServerTimeDiff error: " + e.getMessage());
            }
        }
    }
}
