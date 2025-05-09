package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Debug;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xki extends k04<uki> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f31441a;
    public ActivityManager b;
    public final boolean c;

    public xki(Application application) {
        this.f31441a = application;
        String str = Build.BRAND;
        this.c = "vivo".equalsIgnoreCase(str) || DeviceProperty.ALIAS_ONEPLUS.equalsIgnoreCase(str);
    }

    public static /* synthetic */ Object ipc$super(xki xkiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/memory/MemoryCollector");
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    /* renamed from: e */
    public uki a(int i, Map<String, ?> map) {
        long j;
        Debug.MemoryInfo memoryInfo;
        Map runtimeStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uki) ipChange.ipc$dispatch("2be14983", new Object[]{this, new Integer(i), map});
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new uki(Collections.emptyMap());
        }
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j2 = runtime.totalMemory();
        long freeMemory = j2 - runtime.freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        if (!this.c) {
            j = Debug.getPss() * 1024;
        } else {
            j = 0;
        }
        if (i == 13 || i == 14) {
            try {
                if (this.b == null) {
                    this.b = (ActivityManager) this.f31441a.getSystemService("activity");
                }
                memoryInfo = this.b.getProcessMemoryInfo(new int[]{kw4.pid})[0];
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            runtimeStats = Debug.getRuntimeStats();
            return new uki(i, map, maxMemory, j2, freeMemory, nativeHeapSize, nativeHeapAllocatedSize, j, runtimeStats, memoryInfo);
        }
        memoryInfo = null;
        runtimeStats = Debug.getRuntimeStats();
        return new uki(i, map, maxMemory, j2, freeMemory, nativeHeapSize, nativeHeapAllocatedSize, j, runtimeStats, memoryInfo);
    }
}
