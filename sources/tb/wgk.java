package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wgk<T> extends kdk<T> {
    public final g79[] x;
    public final k2a<Map<Long, Object>, T> y;

    public wgk(Class cls, String str, String str2, long j, k2a<Map<Long, Object>, T> k2aVar, String[] strArr, g79[] g79VarArr, g79[] g79VarArr2, Class[] clsArr, String[] strArr2) {
        super(cls, str, str2, j, null, null, clsArr, strArr2, null, B(g79VarArr, g79VarArr2));
        this.y = k2aVar;
        this.x = g79VarArr2;
    }

    public static g79[] B(g79[] g79VarArr, g79[] g79VarArr2) {
        if (g79VarArr2 == null) {
            return g79VarArr;
        }
        int length = g79VarArr.length;
        g79[] g79VarArr3 = (g79[]) Arrays.copyOf(g79VarArr, g79VarArr2.length + length);
        System.arraycopy(g79VarArr2, 0, g79VarArr3, length, g79VarArr2.length);
        return g79VarArr3;
    }

    public T C(Map<Long, Object> map) {
        return this.y.apply(map);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T i(Collection collection) {
        long j;
        k2a M;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            g79[] g79VarArr = this.m;
            if (i >= g79VarArr.length) {
                break;
            }
            g79 g79Var = g79VarArr[i];
            if (next != null) {
                Class<?> cls = next.getClass();
                Class<?> cls2 = g79Var.c;
                Type type = g79Var.d;
                if (!(type instanceof Class)) {
                    next = TypeUtils.c(next, type, objectReaderProvider);
                } else if (!(cls == cls2 || (M = objectReaderProvider.M(cls, cls2)) == null)) {
                    next = M.apply(next);
                }
            }
            if (g79Var instanceof ia9) {
                j = ((ia9) g79Var).y;
            } else {
                j = g79Var.m;
            }
            linkedHashMap.put(Long.valueOf(j), next);
            i++;
        }
        return C(linkedHashMap);
    }

    @Override // tb.ldk, tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        LinkedHashMap linkedHashMap;
        Map<Long, Object> map;
        JSONReader.c cVar;
        Object obj2;
        long j2;
        jdk jdkVar;
        boolean z = this.i;
        Class cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        if (jSONReader.w) {
            return q(jSONReader, type, obj, 0L);
        }
        long j3 = this.d;
        long j4 = j | j3;
        boolean o1 = jSONReader.o1(j4);
        g79[] g79VarArr = this.m;
        Object obj3 = null;
        LinkedHashMap linkedHashMap2 = null;
        int i = 0;
        if (!o1 || !jSONReader.v1()) {
            if (!jSONReader.F1()) {
                if (jSONReader.r1()) {
                    jSONReader.Z2(false);
                } else if (jSONReader.D1()) {
                    return null;
                }
            }
            JSONReader.c cVar2 = jSONReader.f2453a;
            long j5 = j4 | cVar2.c;
            LinkedHashMap linkedHashMap3 = null;
            int i2 = 0;
            while (!jSONReader.E1()) {
                long h2 = jSONReader.h2();
                if (h2 == 0) {
                    obj2 = obj3;
                    cVar = cVar2;
                } else if (h2 == this.l && i2 == 0) {
                    long T2 = jSONReader.T2();
                    if (T2 == f()) {
                        cVar = cVar2;
                    } else {
                        if ((j5 & JSONReader.Feature.SupportAutoType.mask) != 0) {
                            cVar = cVar2;
                            jdkVar = jSONReader.S0(T2, this.f23271a, this.d);
                        } else {
                            cVar = cVar2;
                            jdkVar = cVar.i(jSONReader.U0(), cls);
                        }
                        if (jdkVar == null) {
                            jdkVar = cVar.j(jSONReader.U0(), cls, j3);
                        }
                        if (jdkVar != null) {
                            T t = (T) jdkVar.o(jSONReader, type, obj, 0L);
                            jSONReader.w1();
                            return t;
                        }
                    }
                    obj2 = null;
                } else {
                    cVar = cVar2;
                    g79 u = u(h2);
                    if (u == null && (j5 & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
                        u = h(jSONReader.P0());
                    }
                    if (u == null) {
                        obj2 = null;
                        k(jSONReader, null, j);
                    } else {
                        obj2 = null;
                        Object K = u.K(jSONReader);
                        if (linkedHashMap3 == null) {
                            linkedHashMap3 = new LinkedHashMap();
                        }
                        if (u instanceof ia9) {
                            j2 = ((ia9) u).y;
                        } else {
                            j2 = u.m;
                        }
                        linkedHashMap3.put(Long.valueOf(j2), K);
                        linkedHashMap3 = linkedHashMap3;
                    }
                }
                i2++;
                cVar2 = cVar;
                i = 0;
                obj3 = obj2;
            }
            if (this.h) {
                if (linkedHashMap3 == null) {
                    linkedHashMap3 = new LinkedHashMap();
                }
                linkedHashMap = linkedHashMap3;
                for (g79 g79Var : g79VarArr) {
                    if (g79Var.j != null && linkedHashMap.get(Long.valueOf(g79Var.m)) == null) {
                        linkedHashMap.put(Long.valueOf(g79Var.m), g79Var.j);
                    }
                }
            } else {
                linkedHashMap = linkedHashMap3;
            }
            if (linkedHashMap == null) {
                map = Collections.emptyMap();
            } else {
                map = linkedHashMap;
            }
            T apply = this.y.apply(map);
            g79[] g79VarArr2 = this.x;
            if (!(g79VarArr2 == null || linkedHashMap == null)) {
                while (i < g79VarArr2.length) {
                    g79 g79Var2 = g79VarArr2[i];
                    Object obj4 = linkedHashMap.get(Long.valueOf(g79Var2.m));
                    if (obj4 != null) {
                        g79Var2.h(apply, obj4);
                    }
                    i++;
                }
            }
            jSONReader.w1();
            return apply;
        }
        while (i < g79VarArr.length) {
            Object K2 = g79VarArr[i].K(jSONReader);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            linkedHashMap2.put(Long.valueOf(g79VarArr[i].m), K2);
            i++;
            linkedHashMap2 = linkedHashMap2;
        }
        if (jSONReader.u1()) {
            jSONReader.w1();
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            if (linkedHashMap2 == null) {
                linkedHashMap4 = Collections.emptyMap();
            }
            return C(linkedHashMap4);
        }
        throw new JSONException(jSONReader.a1("array not end, " + jSONReader.f0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [tb.wgk<T>, tb.wgk, tb.ldk, tb.kdk] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.kdk, tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T q(com.alibaba.fastjson2.JSONReader r16, java.lang.reflect.Type r17, java.lang.Object r18, long r19) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wgk.q(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [tb.wgk<T>, tb.wgk, tb.ldk, tb.kdk] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.kdk, tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T x(java.util.Map r11, long r12) {
        /*
            r10 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.String r1 = r10.G()
            java.lang.Object r1 = r11.get(r1)
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L_0x003e
            java.lang.String r1 = (java.lang.String) r1
            long r4 = tb.ls9.a(r1)
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r6 = r2.mask
            long r6 = r6 & r12
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0025
            tb.jdk r2 = r10.w(r0, r4)
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            if (r2 != 0) goto L_0x0035
            java.lang.Class r2 = r10.b()
            long r4 = r10.v()
            long r4 = r4 | r12
            tb.jdk r2 = r0.H(r1, r2, r4)
        L_0x0035:
            if (r2 == r10) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            java.lang.Object r11 = r2.x(r11, r12)
            return r11
        L_0x003e:
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0046:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = r4.toString()
            java.lang.Object r2 = r2.getValue()
            tb.g79 r4 = r10.j(r4)
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0078
            java.lang.Class r5 = r2.getClass()
            java.lang.Class r6 = r4.c
            if (r5 == r6) goto L_0x0078
            tb.k2a r5 = r0.M(r5, r6)
            if (r5 == 0) goto L_0x0078
            java.lang.Object r2 = r5.apply(r2)
        L_0x0078:
            if (r3 != 0) goto L_0x007f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L_0x007f:
            boolean r5 = r4 instanceof tb.ia9
            if (r5 == 0) goto L_0x0088
            tb.ia9 r4 = (tb.ia9) r4
            long r4 = r4.y
            goto L_0x008a
        L_0x0088:
            long r4 = r4.m
        L_0x008a:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r4, r2)
            goto L_0x0046
        L_0x0092:
            if (r3 != 0) goto L_0x0098
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x0098:
            java.lang.Object r1 = r10.C(r3)
            r2 = 0
            r3 = 0
        L_0x009e:
            tb.g79[] r4 = r10.x
            int r5 = r4.length
            if (r3 >= r5) goto L_0x00e9
            r4 = r4[r3]
            java.lang.String r5 = r4.b
            java.lang.Object r5 = r11.get(r5)
            if (r5 != 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            java.lang.Class r6 = r5.getClass()
            java.lang.Class r7 = r4.c
            java.lang.reflect.Type r8 = r4.d
            if (r6 == r7) goto L_0x00e3
            tb.k2a r6 = r0.M(r6, r7)
            boolean r7 = r8 instanceof java.lang.Class
            if (r7 != 0) goto L_0x00c5
            java.lang.Object r5 = com.alibaba.fastjson2.util.TypeUtils.c(r5, r8, r0)
            goto L_0x00e3
        L_0x00c5:
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r5 = r6.apply(r5)
            goto L_0x00e3
        L_0x00cc:
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L_0x00e3
            com.alibaba.fastjson2.JSONReader$Feature[] r6 = new com.alibaba.fastjson2.JSONReader.Feature[r2]
            com.alibaba.fastjson2.JSONReader$c r6 = com.alibaba.fastjson2.JSONFactory.d(r0, r6)
            tb.jdk r6 = r4.y(r6)
            java.util.Map r5 = (java.util.Map) r5
            long r7 = r4.e
            long r7 = r7 | r12
            java.lang.Object r5 = r6.x(r5, r7)
        L_0x00e3:
            r4.h(r1, r5)
        L_0x00e6:
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wgk.x(java.util.Map, long):java.lang.Object");
    }
}
