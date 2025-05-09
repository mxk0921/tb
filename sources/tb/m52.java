package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m52 extends oy6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long c;
    public final oqu d;
    public final boolean e;
    public final long f;
    public final int g;
    public final int h;

    public m52(int i, Map<String, ?> map, oqu oquVar, long j, boolean z, int i2, int i3, long j2) {
        super(i, map);
        this.d = oquVar;
        this.f = j;
        this.e = z;
        this.g = i2;
        this.h = i3;
        this.c = j2;
    }

    public static /* synthetic */ Object ipc$super(m52 m52Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/battery/BatteryCapacityCollectResult");
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfd15e7", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cf07517", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd9f906d", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f3875dc", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public oqu n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqu) ipChange.ipc$dispatch("41591d14", new Object[]{this});
        }
        return this.d;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0538c6", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BatteryCapacityCollectResult{collectTime=" + this.c + ", typedOperation=" + this.d + ", isCharging=" + this.e + ", chargeCounter=" + this.f + ", batteryLevel=" + this.g + ", batteryTemperature=" + this.h + '}';
    }
}
