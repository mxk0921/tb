package tb;

import android.os.Build;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29436a;
    public final Map<String, ?> b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final Map<String, String> i;
    public final Debug.MemoryInfo j;

    public uki(Map<String, String> map) {
        this.i = new HashMap(map);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("893e55e3", new Object[]{this})).longValue();
        }
        return rrl.f(((HashMap) this.i).get("art.gc.blocking-gc-count"), 0L);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f98d29cf", new Object[]{this})).longValue();
        }
        return rrl.f(((HashMap) this.i).get("art.gc.blocking-gc-time"), 0L);
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b5fb90d", new Object[]{this})).longValue();
        }
        return rrl.f(((HashMap) this.i).get("art.gc.bytes-allocated"), 0L);
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76e634be", new Object[]{this})).longValue();
        }
        return rrl.f(((HashMap) this.i).get("art.gc.bytes-freed"), 0L);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23373fb8", new Object[]{this})).intValue();
        }
        return this.f29436a;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("232c758", new Object[]{this})).longValue();
        }
        return rrl.f(((HashMap) this.i).get("art.gc.gc-count"), 0L);
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("163a35ba", new Object[]{this})).longValue();
        }
        return rrl.f(((HashMap) this.i).get("art.gc.gc-time"), 0L);
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59afc227", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0259607", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b611a870", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public Map<String, Long> l() {
        Debug.MemoryInfo memoryInfo;
        Map memoryStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cc030b64", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return Collections.emptyMap();
        }
        memoryStats = memoryInfo.getMemoryStats();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : memoryStats.entrySet()) {
            hashMap.put(entry.getKey(), Long.valueOf(rrl.f(entry.getValue(), 0L) * 1024));
        }
        return hashMap;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db22c04a", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eda59db5", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d2e8b15", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13a84a45", new Object[]{this})).intValue();
        }
        Map<String, ?> map = this.b;
        if (map != null && map.containsKey(m09.TASK_TYPE_LEVEL)) {
            Object obj = this.b.get(m09.TASK_TYPE_LEVEL);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return -1;
    }

    public uki(int i, Map<String, ?> map, long j, long j2, long j3, long j4, long j5, long j6, Map<String, String> map2, Debug.MemoryInfo memoryInfo) {
        this.f29436a = i;
        this.b = map;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = new HashMap(map2);
        this.j = memoryInfo;
    }

    public int k() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62ee1bcc", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return -1;
        }
        try {
            return ((Integer) xva.b(Debug.MemoryInfo.class, "getOtherPrivate", memoryInfo, new Class[]{Integer.TYPE}, new Object[]{4})).intValue() * 1024;
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("MetricKit.MemoryCollectResult", "memoryInfo OTHER_GL_DEV get fail.", e);
            return -1;
        }
    }

    public int o() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a21a9964", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return -1;
        }
        try {
            return ((Integer) xva.b(Debug.MemoryInfo.class, "getOtherPrivate", memoryInfo, new Class[]{Integer.TYPE}, new Object[]{15})).intValue() * 1024;
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("MetricKit.MemoryCollectResult", "memoryInfo OTHER_GL get fail.", e);
            return -1;
        }
    }

    public int p() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eb4304a", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return -1;
        }
        try {
            return ((Integer) xva.b(Debug.MemoryInfo.class, "getOtherPrivate", memoryInfo, new Class[]{Integer.TYPE}, new Object[]{14})).intValue() * 1024;
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("MetricKit.MemoryCollectResult", "memoryInfo OTHER_GRAPHICS get fail.", e);
            return -1;
        }
    }
}
