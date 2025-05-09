package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l2d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONSTANT_IO_WAIT_COUNT = "se.statistics.iowait_count";
    public static final String CONSTANT_IO_WAIT_SUM = "se.statistics.iowait_sum";
    public static final l2d DEFAULT;

    /* renamed from: a  reason: collision with root package name */
    public long f23066a = -1;

    static {
        t2o.a(737149020);
        l2d l2dVar = new l2d();
        DEFAULT = l2dVar;
        l2dVar.f23066a = pkl.a();
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32681a59", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e72c514f", new Object[]{this})).doubleValue();
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue();
        }
        return this.f23066a;
    }
}
