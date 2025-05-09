package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ww4 extends oy6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final oqu c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final jft h;
    public final jft i;
    public final Map<String, jft> j;

    public ww4(int i, Map<String, ?> map, oqu oquVar, int i2, long j, long j2, long j3, jft jftVar, jft jftVar2, Map<String, jft> map2) {
        super(i, map);
        this.c = oquVar;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = jftVar;
        this.i = jftVar2;
        this.j = map2;
    }

    public static /* synthetic */ Object ipc$super(ww4 ww4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/cpu/CpuUsageCollectResult");
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa641e2e", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c59933e6", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac1f7211", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public jft m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("38dd403e", new Object[]{this});
        }
        return this.i;
    }

    public Map<String, jft> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("306e68c6", new Object[]{this});
        }
        return this.j;
    }

    public jft o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("9194815e", new Object[]{this});
        }
        return this.h;
    }

    public long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee63a822", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public oqu q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqu) ipChange.ipc$dispatch("41591d14", new Object[]{this});
        }
        return this.c;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b9ccff1", new Object[]{this})).booleanValue();
        }
        if (this.h == null || this.i == null) {
            return false;
        }
        return true;
    }
}
