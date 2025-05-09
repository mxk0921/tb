package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MapUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317246);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0016, B:13:0x002a, B:18:0x0036, B:21:0x0041, B:29:0x0053, B:31:0x0060, B:33:0x006d), top: B:37:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.String r5, java.util.List r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.filter.MapUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0016
            java.lang.String r4 = "a0cdb2ad"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r5 = r3.ipc$dispatch(r4, r2)
            return r5
        L_0x0016:
            int r3 = r5.hashCode()     // Catch: all -> 0x0034
            r4 = -1430673394(0xffffffffaab9a80e, float:-3.2979213E-13)
            if (r3 == r4) goto L_0x0041
            r4 = -501711356(0xffffffffe2187e04, float:-7.032464E20)
            if (r3 == r4) goto L_0x0036
            r4 = -358728524(0xffffffffea9e3cb4, float:-9.564847E25)
            if (r3 == r4) goto L_0x002a
            goto L_0x004b
        L_0x002a:
            java.lang.String r3 = "deleteKey"
            boolean r3 = r5.equals(r3)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x0034:
            r6 = move-exception
            goto L_0x007a
        L_0x0036:
            java.lang.String r3 = "mergeMap"
            boolean r3 = r5.equals(r3)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x004b
            r3 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r3 = "buildMap"
            boolean r3 = r5.equals(r3)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x004b
            r3 = 2
            goto L_0x004c
        L_0x004b:
            r3 = -1
        L_0x004c:
            if (r3 == 0) goto L_0x006d
            if (r3 == r0) goto L_0x0060
            if (r3 == r2) goto L_0x0053
            goto L_0x0095
        L_0x0053:
            java.lang.Object r1 = r6.get(r1)     // Catch: all -> 0x0034
            java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0034
            java.lang.Object r5 = buildMap(r1, r6)     // Catch: all -> 0x0034
            return r5
        L_0x0060:
            java.lang.Object r1 = r6.get(r1)     // Catch: all -> 0x0034
            java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0034
            java.lang.Object r5 = deleteKey(r1, r6)     // Catch: all -> 0x0034
            return r5
        L_0x006d:
            java.lang.Object r1 = r6.get(r1)     // Catch: all -> 0x0034
            java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0034
            java.util.Map r5 = mergeMap(r1, r6)     // Catch: all -> 0x0034
            return r5
        L_0x007a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "error:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r6.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "map.filter"
            tb.tfs.e(r6, r5)
        L_0x0095:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.MapUtils.a(java.lang.String, java.util.List):java.lang.Object");
    }

    @FilterHandler(name = "buildMap")
    public static Object buildMap(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("533edb05", new Object[]{obj, obj2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    @FilterHandler(name = "deleteKey")
    public static Object deleteKey(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fef5c51f", new Object[]{obj, obj2});
        }
        if (obj instanceof Map) {
            obj = nwv.C0((Map) obj);
            if (obj2 instanceof List) {
                for (Object obj3 : (List) obj2) {
                    obj.remove(obj3);
                }
            } else {
                obj.remove(obj2);
            }
        }
        return obj;
    }

    @FilterHandler(name = "mergeMap")
    public static Map mergeMap(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("138d18b8", new Object[]{obj, obj2});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                linkedHashMap.putAll(map);
            }
        }
        if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            if (!map2.isEmpty()) {
                linkedHashMap.putAll(map2);
            }
        }
        return linkedHashMap;
    }
}
