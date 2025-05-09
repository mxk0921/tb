package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.bb2;
import tb.dfl;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cb2 extends AbstractEventHandler implements dfl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double o;
    public double p;
    public double q;
    public double r;
    public double s;
    public double t;
    public final dfl u;
    public efl v;
    public efl w;
    public efl x;
    public String y;
    public boolean n = false;
    public final LinkedList<Double> z = new LinkedList<>();
    public final u2w A = new u2w(vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 1.0d);
    public final u2w B = new u2w(vu3.b.GEO_NOT_SUPPORT, 1.0d, 1.0d);
    public final a C = new a(vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f16955a;
        public double b;
        public double c;

        static {
            t2o.a(87031849);
        }

        public a(double d, double d2, double d3) {
            this.f16955a = d;
            this.b = d2;
            this.c = d3;
        }
    }

    static {
        t2o.a(87031848);
        t2o.a(87031886);
    }

    public cb2(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
        super(context, aVar, objArr);
        if (context != null) {
            this.u = dfl.f(context);
        }
    }

    public static /* synthetic */ Object ipc$super(cb2 cb2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -189097425) {
            super.p((String) objArr[0], (Map) objArr[1], (fr8) objArr[2], (List) objArr[3], (bb2.g) objArr[4]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/bindingx/core/internal/BindingXOrientationHandler");
        }
    }

    public final boolean A(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7165b363", new Object[]{this, new Double(d), new Double(d2), new Double(d3)})).booleanValue();
        }
        if (!(this.v == null || this.w == null)) {
            this.z.add(Double.valueOf(d));
            if (this.z.size() > 5) {
                this.z.removeFirst();
            }
            D(this.z, 360);
            LinkedList<Double> linkedList = this.z;
            double doubleValue = (linkedList.get(linkedList.size() - 1).doubleValue() - this.o) % 360.0d;
            p7n a2 = this.v.a(d, d2, d3, doubleValue);
            p7n a3 = this.w.a(d, d2, d3, doubleValue);
            this.A.b(vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 1.0d);
            this.A.a(a2);
            this.B.b(vu3.b.GEO_NOT_SUPPORT, 1.0d, 1.0d);
            this.B.a(a3);
            double degrees = Math.toDegrees(Math.acos(this.A.f29097a)) - 90.0d;
            double degrees2 = Math.toDegrees(Math.acos(this.B.b)) - 90.0d;
            if (Double.isNaN(degrees) || Double.isNaN(degrees2) || Double.isInfinite(degrees) || Double.isInfinite(degrees2)) {
                return false;
            }
            a aVar = this.C;
            aVar.f16955a = Math.round(degrees);
            aVar.b = Math.round(degrees2);
        }
        return true;
    }

    public final boolean B(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aa2264", new Object[]{this, new Double(d), new Double(d2), new Double(d3)})).booleanValue();
        }
        if (this.x != null) {
            this.z.add(Double.valueOf(d));
            if (this.z.size() > 5) {
                this.z.removeFirst();
            }
            D(this.z, 360);
            LinkedList<Double> linkedList = this.z;
            p7n a2 = this.x.a(d, d2, d3, (linkedList.get(linkedList.size() - 1).doubleValue() - this.o) % 360.0d);
            if (Double.isNaN(a2.f25922a) || Double.isNaN(a2.b) || Double.isNaN(a2.c) || Double.isInfinite(a2.f25922a) || Double.isInfinite(a2.b) || Double.isInfinite(a2.c)) {
                return false;
            }
            a aVar = this.C;
            aVar.f16955a = a2.f25922a;
            aVar.b = a2.b;
            aVar.c = a2.c;
        }
        return true;
    }

    public final void D(List<Double> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc728120", new Object[]{this, list, new Integer(i)});
            return;
        }
        int size = list.size();
        if (size > 1) {
            for (int i2 = 1; i2 < size; i2++) {
                int i3 = i2 - 1;
                if (!(list.get(i3) == null || list.get(i2) == null)) {
                    if (list.get(i2).doubleValue() - list.get(i3).doubleValue() < (-i) / 2) {
                        double d = i;
                        list.set(i2, Double.valueOf(list.get(i2).doubleValue() + ((Math.floor(list.get(i3).doubleValue() / d) + 1.0d) * d)));
                    }
                    if (list.get(i2).doubleValue() - list.get(i3).doubleValue() > i / 2) {
                        list.set(i2, Double.valueOf(list.get(i2).doubleValue() - i));
                    }
                }
            }
        }
    }

    @Override // tb.i3c
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        r();
        if (this.u == null) {
            return false;
        }
        C("end", this.r, this.s, this.t, new Object[0]);
        return this.u.n(this);
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
        }
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        dfl dflVar = this.u;
        if (dflVar == null) {
            return false;
        }
        dflVar.a(this);
        return this.u.p(1);
    }

    @Override // tb.i3c
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        dfl dflVar = this.u;
        if (dflVar != null) {
            dflVar.q();
        }
    }

    @Override // tb.i3c
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        dfl dflVar = this.u;
        if (dflVar != null) {
            dflVar.p(1);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        dfl dflVar = this.u;
        if (dflVar != null) {
            dflVar.n(this);
            this.u.q();
        }
        if (this.f2170a != null) {
            this.f2170a.clear();
            this.f2170a = null;
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void p(String str, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, bb2.g gVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba9a2f", new Object[]{this, str, map, fr8Var, list, gVar});
            return;
        }
        super.p(str, map, fr8Var, list, gVar);
        if (map != null) {
            String str3 = (String) map.get("sceneType");
            if (TextUtils.isEmpty(str3)) {
                str2 = "2d";
            } else {
                str2 = str3.toLowerCase();
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || (!"2d".equals(str2) && !"3d".equals(str2))) {
            str2 = "2d";
        }
        this.y = str2;
        gfh.a("[ExpressionOrientationHandler] sceneType is " + str2);
        if ("2d".equals(str2)) {
            this.v = new efl(null, Double.valueOf(90.0d), null);
            this.w = new efl(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), null, Double.valueOf(90.0d));
        } else if ("3d".equals(str2)) {
            this.x = new efl(null, null, null);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
        } else {
            C("exit", ((Double) map.get("alpha")).doubleValue(), ((Double) map.get("beta")).doubleValue(), ((Double) map.get("gamma")).doubleValue(), new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
        } else {
            C("interceptor", ((Double) map.get("alpha")).doubleValue(), ((Double) map.get("beta")).doubleValue(), ((Double) map.get("gamma")).doubleValue(), Collections.singletonMap("interceptor", str));
        }
    }

    public final void C(String str, double d, double d2, double d3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de91509a", new Object[]{this, str, new Double(d), new Double(d2), new Double(d3), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("alpha", Double.valueOf(d));
            hashMap.put("beta", Double.valueOf(d2));
            hashMap.put("gamma", Double.valueOf(d3));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + "," + d + "," + d2 + "," + d3 + f7l.BRACKET_END_STR);
        }
    }

    @Override // tb.dfl.a
    public void n(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16024634", new Object[]{this, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        double round = Math.round(d);
        double round2 = Math.round(d2);
        double round3 = Math.round(d3);
        if (round != this.r || round2 != this.s || round3 != this.t) {
            if (!this.n) {
                this.n = true;
                C("start", round, round2, round3, new Object[0]);
                d4 = round;
                this.o = d4;
                d5 = round2;
                this.p = d5;
                d6 = round3;
                this.q = d6;
            } else {
                d6 = round3;
                d4 = round;
                d5 = round2;
            }
            if ("2d".equals(this.y)) {
                d7 = d6;
                d8 = d5;
                z = A(d4, d5, d7);
            } else {
                d7 = d6;
                d8 = d5;
                z = "3d".equals(this.y) ? B(d4, d8, d7) : false;
            }
            if (z) {
                a aVar = this.C;
                double d9 = aVar.f16955a;
                double d10 = aVar.b;
                double d11 = aVar.c;
                this.r = d4;
                this.s = d8;
                this.t = d7;
                try {
                    if (gfh.f19951a) {
                        gfh.a(String.format(Locale.getDefault(), "[OrientationHandler] orientation changed. (alpha:%f,beta:%f,gamma:%f,x:%f,y:%f,z:%f)", Double.valueOf(d4), Double.valueOf(d8), Double.valueOf(d7), Double.valueOf(d9), Double.valueOf(d10), Double.valueOf(d11)));
                    }
                    JSMath.applyOrientationValuesToScope(this.d, d4, d8, d7, this.o, this.p, this.q, d9, d10, d11);
                    if (!t(this.j, this.d)) {
                        s(this.f2170a, this.d, "orientation");
                    }
                } catch (Exception e) {
                    gfh.c("runtime error", e);
                }
            }
        }
    }
}
