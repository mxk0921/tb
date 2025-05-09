package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yjk extends jkk {
    public static final yjk g = new yjk(null, null, null, null, 0);
    public static final yjk h = new yjk(JSONArray.class, null, null, null, 0);
    public static final yjk i;
    public static final Class j;
    public static final byte[] k;
    public static final long l;

    /* renamed from: a  reason: collision with root package name */
    public final Type f32131a;
    public final Class b;
    public final Type c;
    public final long d;
    public final boolean e;
    public volatile iik f;

    static {
        Class i2 = JSONFactory.i();
        if (i2 == null) {
            i = null;
        } else {
            i = new yjk(i2, null, null, null, 0L);
        }
        j = new ArrayList().subList(0, 0).getClass();
        String n = TypeUtils.n(ArrayList.class);
        k = yqf.a(n);
        l = ls9.a(n);
    }

    public yjk(Class cls, Type type, Class cls2, Type type2, long j2) {
        boolean z;
        this.f32131a = type;
        this.b = cls2;
        this.c = type2;
        this.d = j2;
        if (cls2 == null || z1.n(cls2)) {
            z = false;
        } else {
            z = true;
        }
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    @Override // tb.jkk, tb.iik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.alibaba.fastjson2.JSONWriter r20, java.lang.Object r21, java.lang.Object r22, java.lang.reflect.Type r23, long r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yjk.e(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // tb.jkk, tb.iik
    public void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j2) {
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        List list = (List) obj;
        jSONWriter.d1(list.size());
        Class<?> cls = null;
        iik iikVar = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj3 = list.get(i2);
            if (obj3 == null) {
                jSONWriter.b2();
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    iikVar = jSONWriter.F(cls2);
                    cls = cls2;
                }
                iikVar.l(jSONWriter, obj3, Integer.valueOf(i2), this.c, this.d | j2);
            }
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j2) {
        boolean z;
        boolean z2;
        iik iikVar;
        Class<?> cls;
        iik iikVar2;
        String Y0;
        iik e;
        boolean C0;
        boolean z3;
        Class<?> cls2;
        iik iikVar3;
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        List list = (List) obj;
        Class<?> cls3 = null;
        if (jSONWriter.d) {
            jSONWriter.d1(list.size());
            iik iikVar4 = null;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj3 = list.get(i2);
                if (obj3 == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls4 = obj3.getClass();
                    if (cls4 == cls3) {
                        cls2 = cls3;
                        iikVar3 = iikVar4;
                    } else {
                        iikVar3 = jSONWriter.F(cls4);
                        cls2 = cls4;
                    }
                    iikVar4 = iikVar3;
                    iikVar4.e(jSONWriter, obj3, Integer.valueOf(i2), this.c, j2);
                    cls3 = cls2;
                }
            }
            return;
        }
        JSONWriter.a aVar = jSONWriter.f2458a;
        z1 z1Var = aVar.f2459a;
        jSONWriter.c1();
        Class<?> cls5 = null;
        iik iikVar5 = null;
        boolean z4 = true;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i3 != 0) {
                jSONWriter.t1();
            }
            Object obj4 = list.get(i3);
            if (obj4 == null) {
                jSONWriter.b2();
            } else {
                Class<?> cls6 = obj4.getClass();
                if (cls6 == String.class) {
                    jSONWriter.k2((String) obj4);
                } else if (cls6 == Integer.class) {
                    z1Var.getClass();
                    jSONWriter.L1(((Integer) obj4).intValue());
                } else if (cls6 == Long.class) {
                    z1Var.getClass();
                    jSONWriter.O1(((Long) obj4).longValue());
                } else if (cls6 == Boolean.class) {
                    z1Var.getClass();
                    jSONWriter.o1(((Boolean) obj4).booleanValue());
                } else {
                    if (cls6 == BigDecimal.class) {
                        z1Var.getClass();
                        jSONWriter.z1((BigDecimal) obj4, j2, null);
                    } else {
                        if (cls6 == this.b && this.f != null) {
                            iik iikVar6 = this.f;
                            if (!this.e || !jSONWriter.B0()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            cls = cls5;
                            iikVar = iikVar5;
                            z = z4;
                            iikVar2 = iikVar6;
                            z2 = z3;
                        } else if (cls6 == cls5) {
                            cls = cls5;
                            iikVar2 = iikVar5;
                            iikVar = iikVar2;
                            z2 = z4;
                            z = z2;
                        } else {
                            if (cls6 == JSONObject.class) {
                                e = ckk.o;
                                C0 = jSONWriter.B0();
                            } else if (cls6 == JSONFactory.j()) {
                                e = ckk.b();
                                C0 = jSONWriter.B0();
                            } else if (cls6 == JSONArray.class) {
                                e = h;
                                C0 = jSONWriter.B0();
                            } else if (cls6 == JSONFactory.i()) {
                                e = i;
                                C0 = jSONWriter.B0();
                            } else {
                                e = aVar.e(cls6);
                                C0 = jSONWriter.C0(obj4);
                            }
                            if (cls6 == this.b) {
                                this.f = e;
                            }
                            iikVar2 = e;
                            iikVar = iikVar2;
                            z2 = C0;
                            z = z2;
                            cls = cls6;
                        }
                        if (!z2 || (Y0 = jSONWriter.Y0(i3, obj4)) == null) {
                            iikVar2.y(jSONWriter, obj4, Integer.valueOf(i3), this.c, this.d);
                            if (z2) {
                                jSONWriter.X0(obj4);
                            }
                        } else {
                            jSONWriter.i2(Y0);
                            jSONWriter.X0(obj4);
                        }
                        cls5 = cls;
                        iikVar5 = iikVar;
                        z4 = z;
                    }
                }
            }
        }
        jSONWriter.e();
    }
}
