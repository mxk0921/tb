package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ew4 extends oy6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long[] c;
    public final long[] d;
    public final jft e;
    public final jft f;
    public final List<jft> g;
    public final List<jft> h;
    public final StackTraceElement[] i;
    public final Thread j;
    public final Map<String, List<StackTraceElement[]>> k;

    public ew4(int i, Map<String, ?> map, long[] jArr, long[] jArr2, jft jftVar, jft jftVar2, List<jft> list, List<jft> list2, StackTraceElement[] stackTraceElementArr, Thread thread) {
        super(i, map);
        this.c = jArr;
        this.d = jArr2;
        this.e = jftVar;
        this.f = jftVar2;
        this.g = list;
        this.h = list2;
        this.i = stackTraceElementArr;
        this.j = thread;
    }

    public static /* synthetic */ Object ipc$super(ew4 ew4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/cpu/CpuAbnormalCollectResult");
    }

    public boolean j() {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d159c58", new Object[]{this})).booleanValue();
        }
        long[] jArr2 = this.d;
        if (jArr2 == null || jArr2.length != 2 || (jArr = this.c) == null || jArr.length != 2) {
            return false;
        }
        return true;
    }

    public List<jft> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("235f8a86", new Object[]{this});
        }
        return this.h;
    }

    public List<jft> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("652f1a17", new Object[]{this});
        }
        return this.g;
    }

    public StackTraceElement[] m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("545bb1c3", new Object[]{this});
        }
        return this.i;
    }

    public Thread n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("bc0ac7c", new Object[]{this});
        }
        return this.j;
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f396536", new Object[]{this})).floatValue();
        }
        if (!j()) {
            return 0.0f;
        }
        long q = q();
        jft jftVar = this.f;
        jft jftVar2 = this.e;
        long j = ((jftVar.g + jftVar.f) - jftVar2.g) - jftVar2.f;
        if (q <= 0) {
            return 0.0f;
        }
        return (((1000.0f / ((float) ysg.c())) * ((float) j)) * 1.0f) / ((float) q);
    }

    public Map<String, List<StackTraceElement[]>> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("976475bc", new Object[]{this});
        }
        return this.k;
    }

    public long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e831412c", new Object[]{this})).longValue();
        }
        return this.d[0] - this.c[0];
    }

    public ew4(ew4 ew4Var, Map<String, List<StackTraceElement[]>> map) {
        this(ew4Var.i(), ew4Var.b, ew4Var.c, ew4Var.d, ew4Var.e, ew4Var.f, ew4Var.g, ew4Var.h, ew4Var.i, ew4Var.j);
        this.k = map;
    }
}
