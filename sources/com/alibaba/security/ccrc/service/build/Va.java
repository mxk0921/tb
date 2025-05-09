package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Va extends BaseWorkConfHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private int[] a(List<Long> list, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3372e46b", new Object[]{this, list, new Long(j), new Long(j2)});
        }
        try {
            int binarySearch = Collections.binarySearch(list, Long.valueOf(j));
            int i = binarySearch < 0 ? -(binarySearch + 1) : binarySearch + 1;
            int binarySearch2 = Collections.binarySearch(list, Long.valueOf(j2));
            int i2 = binarySearch2 < 0 ? (-(binarySearch2 + 1)) - 1 : binarySearch2 - 1;
            if (i < list.size() && i2 >= i) {
                return new int[]{i, i2};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(Va va, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Va");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return r12;
     */
    @Override // com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> b(java.util.Map<java.lang.String, java.lang.Object> r11, java.util.Map<java.lang.String, java.lang.Object> r12, java.util.List<com.alibaba.security.wukong.bx.algo.BxData.OpConfItemValue> r13) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.security.ccrc.service.build.Va.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = "b3d8fb2f"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            r11 = 3
            r4[r11] = r13
            java.lang.Object r11 = r2.ipc$dispatch(r3, r4)
            java.util.Map r11 = (java.util.Map) r11
            return r11
        L_0x001e:
            java.util.Iterator r13 = r13.iterator()
        L_0x0022:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r13.next()
            com.alibaba.security.wukong.bx.algo.BxData$OpConfItemValue r2 = (com.alibaba.security.wukong.bx.algo.BxData.OpConfItemValue) r2
            java.lang.String r3 = r2.name
            java.lang.Object r3 = r12.get(r3)
            java.util.List r5 = com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler.a(r3)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x003f
            return r12
        L_0x003f:
            java.lang.String r3 = r2.op
            java.lang.String r4 = "between"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0022
            java.lang.String r13 = r2.input
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r13 = com.alibaba.security.ccrc.common.util.JsonUtils.parseObject(r13, r2)
            java.util.Map r13 = (java.util.Map) r13
            if (r13 == 0) goto L_0x00a7
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x005c
            goto L_0x00a7
        L_0x005c:
            java.lang.String r2 = "begin"
            long r6 = r10.a(r11, r13, r2)
            java.lang.String r2 = "end"
            long r8 = r10.a(r11, r13, r2)
            r2 = 0
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x00a7
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x00a7
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            goto L_0x00a7
        L_0x0077:
            r4 = r10
            int[] r11 = r4.a(r5, r6, r8)
            if (r11 != 0) goto L_0x007f
            return r12
        L_0x007f:
            java.util.Set r13 = r12.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0087:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = r11[r1]
            r4 = r11[r0]
            java.lang.Object r5 = r2.getValue()
            java.util.List r3 = a(r3, r4, r5)
            java.lang.Object r2 = r2.getKey()
            r12.put(r2, r3)
            goto L_0x0087
        L_0x00a7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.Va.b(java.util.Map, java.util.Map, java.util.List):java.util.Map");
    }

    public static List<Object> a(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c12d523", new Object[]{new Integer(i), new Integer(i2), obj});
        }
        try {
            List a2 = BaseWorkConfHandler.a(obj);
            return new ArrayList(a2.subList(i, i2 < a2.size() ? i2 + 1 : a2.size()));
        } catch (Throwable unused) {
            return null;
        }
    }

    private long a(Map<String, Object> map, Map<String, String> map2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e25c7386", new Object[]{this, map, map2, str})).longValue();
        }
        try {
            String str2 = map2.get(str);
            if (str2.startsWith("$.")) {
                return Long.parseLong(map.get(str2.substring(2)).toString());
            }
            return Long.parseLong(str2);
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
