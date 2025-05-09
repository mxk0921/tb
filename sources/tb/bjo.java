package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bjo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AVAIL_INTERNAL_SPACE = "availInternalSpace";
    public static final String AVAIL_MEM = "availMem";
    public static final String BATTERY_CAPACITY = "batteryLevel";
    public static final String DALVIK_MAX = "dalvikMax";
    public static final String DALVIK_PRIVATE_DIRTY = "dalvikPDirty";
    public static final String DALVIK_PSS = "dalvikPss";
    public static final String DALVIK_USED = "dalvikUsed";
    public static final String DALVIK_USED_RATIO = "dalvikUsedRatio";
    public static final String GC_ALLOC_SIZE = "gcAllocSize";
    public static final String GC_BLOCK_COUNT = "gcBlockCount";
    public static final String GC_BLOCK_TIME = "gcBlockTime";
    public static final String GC_COUNT = "gcCount";
    public static final String GC_FREE_SIZE = "gcFreeSize";
    public static final String GC_TIME = "gcTime";
    public static final String GL_DEV_MEM = "glDev";
    public static final String GL_MEM = "gl";
    public static final String GRAPHICS_MEM = "graphics";
    public static final String IS_CHARGING = "isCharging";
    public static final String NATIVE_HEAP = "nativeHeap";
    public static final String NATIVE_HEAP_USED = "nativeHeapUsed";
    public static final String NATIVE_PRIVATE_DIRTY = "nativePDirty";
    public static final String NATIVE_PSS = "nativePss";
    public static final String TOTAL_INTERNAL_SPACE = "totalInternalSpace";
    public static final String TOTAL_MEM = "totalMem";
    public static final String TOTAL_PRIVATE_DIRTY = "totalPDirty";
    public static final String TOTAL_PSS = "totalPss";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f16428a = new ConcurrentHashMap();
    public long b;

    static {
        t2o.a(615514178);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e7d20f", new Object[]{this, str});
        }
        Long l = (Long) ((ConcurrentHashMap) this.f16428a).get(str);
        if (l != null) {
            return a(str, l.longValue());
        }
        return "";
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71240614", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) this.f16428a).entrySet()) {
            hashMap.put(entry.getKey(), a((String) entry.getKey(), ((Long) entry.getValue()).longValue()));
        }
        return hashMap;
    }

    public long d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3508cf41", new Object[]{this, str})).longValue();
        }
        Long l = (Long) ((ConcurrentHashMap) this.f16428a).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public void e(long j, boolean z) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a1ef30", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        g(BATTERY_CAPACITY, j);
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        g(IS_CHARGING, j2);
    }

    public void f(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5648d1", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        g(DALVIK_USED_RATIO, j3);
        g(DALVIK_USED, j2);
        g(DALVIK_MAX, j);
    }

    public void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb51da7", new Object[]{this, str, new Long(j)});
        } else {
            ((ConcurrentHashMap) this.f16428a).put(str, Long.valueOf(j));
        }
    }

    public void h(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6318c10e", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        g(TOTAL_INTERNAL_SPACE, j);
        g(AVAIL_INTERNAL_SPACE, j2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r5.equals(tb.bjo.GC_TIME) == false) goto L_0x0031;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r5, long r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.bjo.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r5
            r6[r0] = r4
            java.lang.String r5 = "1c88c067"
            java.lang.Object r5 = r3.ipc$dispatch(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x001d:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x0026
            java.lang.String r5 = ""
            return r5
        L_0x0026:
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1708606089: goto L_0x0074;
                case -1252129335: goto L_0x006b;
                case -176816749: goto L_0x0060;
                case 199051134: goto L_0x0055;
                case 642845115: goto L_0x0049;
                case 1860104830: goto L_0x003e;
                case 2037570085: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0 = -1
            goto L_0x007e
        L_0x0033:
            java.lang.String r0 = "dalvikUsedRatio"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x003c
            goto L_0x0031
        L_0x003c:
            r0 = 6
            goto L_0x007e
        L_0x003e:
            java.lang.String r0 = "gcBlockCount"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0047
            goto L_0x0031
        L_0x0047:
            r0 = 5
            goto L_0x007e
        L_0x0049:
            java.lang.String r0 = "isCharging"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0053
            goto L_0x0031
        L_0x0053:
            r0 = 4
            goto L_0x007e
        L_0x0055:
            java.lang.String r0 = "gcBlockTime"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x005e
            goto L_0x0031
        L_0x005e:
            r0 = 3
            goto L_0x007e
        L_0x0060:
            java.lang.String r0 = "gcCount"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0069
            goto L_0x0031
        L_0x0069:
            r0 = 2
            goto L_0x007e
        L_0x006b:
            java.lang.String r1 = "gcTime"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x007e
            goto L_0x0031
        L_0x0074:
            java.lang.String r0 = "batteryLevel"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x007d
            goto L_0x0031
        L_0x007d:
            r0 = 0
        L_0x007e:
            switch(r0) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x0098;
                case 2: goto L_0x0093;
                case 3: goto L_0x0098;
                case 4: goto L_0x0086;
                case 5: goto L_0x0093;
                case 6: goto L_0x00ab;
                default: goto L_0x0081;
            }
        L_0x0081:
            java.lang.String r5 = tb.cl7.j(r6)
            return r5
        L_0x0086:
            r0 = 1
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0090
            java.lang.String r5 = "true"
            goto L_0x0092
        L_0x0090:
            java.lang.String r5 = "false"
        L_0x0092:
            return r5
        L_0x0093:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            return r5
        L_0x0098:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "ms"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        L_0x00ab:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "%"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bjo.a(java.lang.String, long):java.lang.String");
    }
}
