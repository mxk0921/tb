package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.yl6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class em6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f18673a;
    public final hh5 b;
    public final xc6<yl6> c = new xc6<>();
    public final Map<String, yl6> d = new LinkedHashMap();

    static {
        t2o.a(444597872);
    }

    public em6(a16 a16Var, hh5 hh5Var) {
        this.f18673a = a16Var;
        this.b = hh5Var;
    }

    public Map<String, yl6> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb64533b", new Object[]{this});
        }
        return this.d;
    }

    public void c(lg5 lg5Var, yl6 yl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ce0ac8", new Object[]{this, lg5Var, yl6Var});
            return;
        }
        byte e = lg5Var.e();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < e; i++) {
            arrayList.add(new yl6.a(lg5Var.h(), lg5Var.e()));
        }
        yl6Var.j(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r11 != 3) goto L_0x0070;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(tb.lg5 r11, tb.yl6 r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = tb.em6.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "6fe22ef6"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            r2[r0] = r11
            r11 = 2
            r2[r11] = r12
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0018:
            byte r3 = r11.e()
            byte r4 = r11.e()
            short r11 = r11.j()
            r5 = 0
            if (r3 != r0) goto L_0x002a
            r12.l(r5)
        L_0x002a:
            java.util.List r6 = r12.e()
            r7 = -1
            if (r11 == r7) goto L_0x007a
            if (r6 == 0) goto L_0x007a
            if (r11 == r0) goto L_0x0038
            if (r11 == r2) goto L_0x0054
            goto L_0x0070
        L_0x0038:
            java.util.Iterator r7 = r6.iterator()
        L_0x003c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0054
            java.lang.Object r8 = r7.next()
            tb.gc5 r8 = (tb.gc5) r8
            short r9 = r8.b()
            if (r9 == r0) goto L_0x004f
            goto L_0x003c
        L_0x004f:
            tb.yl6$b r7 = new tb.yl6$b
            r8.a()
        L_0x0054:
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0070
            java.lang.Object r7 = r6.next()
            tb.gc5 r7 = (tb.gc5) r7
            short r8 = r7.b()
            if (r8 == r2) goto L_0x006b
            goto L_0x0058
        L_0x006b:
            tb.yl6$b r2 = new tb.yl6$b
            r7.a()
        L_0x0070:
            tb.yl6$b r2 = new tb.yl6$b
            if (r4 != r0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r2.<init>(r3, r0, r11, r5)
            goto L_0x0083
        L_0x007a:
            tb.yl6$b r2 = new tb.yl6$b
            if (r4 != r0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            r2.<init>(r3, r0, r11, r5)
        L_0x0083:
            r12.l(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.em6.d(tb.lg5, tb.yl6):void");
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        yl6 yl6Var;
        byte b = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f18673a.i());
        int h = lg5Var.h();
        int i = 0;
        while (i < h) {
            int h2 = lg5Var.h();
            byte e = lg5Var.e();
            short j = lg5Var.j();
            if (e == b) {
                yl6Var = new tu5(lg5Var.h(), j);
            } else {
                yl6Var = null;
                if (e == 1) {
                    switch (j) {
                        case 1:
                            yl6Var = new j16(lg5Var.h());
                            break;
                        case 2:
                            yl6Var = new k36(lg5Var.i());
                            break;
                        case 3:
                            yl6Var = new ku5(lg5Var.f());
                            break;
                        case 4:
                            byte e2 = lg5Var.e();
                            if (e2 == 1) {
                                yl6Var = new jd6(null);
                                break;
                            } else if (e2 == 0) {
                                yl6Var = new jd6(this.b.b(lg5Var.h()));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_STRING load null flag error： " + i);
                            }
                        case 5:
                            byte e3 = lg5Var.e();
                            if (e3 == 1) {
                                yl6Var = new mg5(null);
                                break;
                            } else if (e3 == 0) {
                                yl6Var = new mg5(this.b.b(lg5Var.h()));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_COLOR load null flag error： " + i);
                            }
                        case 6:
                        case 7:
                        case 10:
                        default:
                            if (DinamicXEngine.j0()) {
                                throw new DXLoaderException("不认识的变量类型 ：fieldType： " + ((int) j));
                            }
                            break;
                        case 8:
                            byte e4 = lg5Var.e();
                            if (e4 == 1) {
                                yl6Var = new v26(null);
                                break;
                            } else if (e4 == 0) {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_LIST is not null " + i);
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_LIST load null flag error： " + i);
                            }
                        case 9:
                            byte e5 = lg5Var.e();
                            if (e5 == 1) {
                                yl6Var = new a46(null);
                                break;
                            } else if (e5 == 0) {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_MAP is not null " + i);
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_MAP load null flag error： " + i);
                            }
                        case 11:
                            byte e6 = lg5Var.e();
                            if (e6 == 1) {
                                yl6Var = new k16(null);
                                break;
                            } else if (e6 == 0) {
                                yl6Var = new k16(Integer.valueOf(lg5Var.h()));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_INT_WRAP load null flag error： " + i);
                            }
                        case 12:
                            byte e7 = lg5Var.e();
                            if (e7 == 1) {
                                yl6Var = new l36(null);
                                break;
                            } else if (e7 == 0) {
                                yl6Var = new l36(Long.valueOf(lg5Var.i()));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_LONG_WRAP load null flag error： " + i);
                            }
                        case 13:
                            byte e8 = lg5Var.e();
                            if (e8 == 1) {
                                yl6Var = new lu5(null);
                                break;
                            } else if (e8 == 0) {
                                yl6Var = new lu5(Double.valueOf(lg5Var.f()));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_DOUBLE_WRAP load null flag error： " + i);
                            }
                        case 14:
                            lb6 lb6Var = new lb6(dXRuntimeContext);
                            this.c.put(h2, lb6Var);
                            this.d.put(this.b.b(h2), lb6Var);
                            continue;
                            i++;
                            b = 2;
                        case 15:
                            yl6Var = new qd5(lg5Var.e() == 1);
                            break;
                        case 16:
                            byte e9 = lg5Var.e();
                            if (e9 == 1) {
                                yl6Var = new rd5(null);
                                break;
                            } else if (e9 == 0) {
                                yl6Var = new rd5(Boolean.valueOf(lg5Var.e() == 1));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_INT_WRAP load null flag error： " + i);
                            }
                        case 17:
                            yl6Var = new lx5(lg5Var.g());
                            break;
                        case 18:
                            byte e10 = lg5Var.e();
                            if (e10 == 1) {
                                yl6Var = new mx5(null);
                                break;
                            } else if (e10 == 0) {
                                yl6Var = new mx5(Float.valueOf(lg5Var.g()));
                                break;
                            } else {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_FLOAT_WRAP load null flag error： " + i);
                            }
                    }
                }
            }
            yl6Var.m(h2);
            byte e11 = lg5Var.e();
            if (e11 > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < e11; i2++) {
                    short j2 = lg5Var.j();
                    int h3 = lg5Var.h();
                    int h4 = lg5Var.h();
                    if (j2 == 1) {
                        arrayList.add(new uh5(this.b.b(h3), h4));
                    } else if (j2 == 3) {
                        arrayList.add(new gd6(this.b.b(h3), h4));
                    } else {
                        throw new DXLoaderException("不认识的注解类型： " + ((int) j2));
                    }
                }
                yl6Var.k(arrayList);
            }
            d(lg5Var, yl6Var);
            c(lg5Var, yl6Var);
            this.c.put(h2, yl6Var);
            this.d.put(this.b.b(h2), yl6Var);
            i++;
            b = 2;
        }
        return true;
    }
}
