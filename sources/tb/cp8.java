package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.tao.log.TLog;
import tb.v82;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends m02 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ bp8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, bp8 bp8Var) {
            super(str);
            this.b = bp8Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/node/compute/ExposeCompute$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (!TextUtils.equals(this.b.d, "exposeEnd") && !TextUtils.equals(this.b.g, "exposeEnd")) {
                JSONObject jSONObject = this.b.f16524a;
                if (!v82.h("enableExpSeries", false) && jSONObject != null) {
                    jSONObject.put("exposeSeries", (Object) new JSONArray());
                }
                this.b.b.k = hqv.i(jSONObject);
                BHXCXXInnerBridge.transferBaseNodeToBUFS(this.b.b, "exposeUpdate");
            }
        }
    }

    static {
        t2o.a(404750547);
    }

    public static void a(bp8 bp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfd5c9", new Object[]{bp8Var});
        } else {
            bp8Var.f = bp8Var.i;
        }
    }

    public static void b(bp8 bp8Var, String str, double d, double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9984d4b", new Object[]{bp8Var, str, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5)});
        } else if (TextUtils.equals("scrollEnd", str)) {
            bp8Var.f = bp8Var.i;
            double d6 = d * d2;
            double d7 = d3 * d4;
            if (d7 == vu3.b.GEO_NOT_SUPPORT || d5 == vu3.b.GEO_NOT_SUPPORT) {
                bp8Var.i = vu3.b.GEO_NOT_SUPPORT;
            } else {
                bp8Var.i = (Math.pow(d6 / d7, 2.0d) * d6) / d5;
            }
        }
    }

    public static void c(bp8 bp8Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431fe1d1", new Object[]{bp8Var, str, new Long(j)});
            return;
        }
        bp8Var.d = bp8Var.g;
        bp8Var.e = bp8Var.h;
        bp8Var.g = str;
        bp8Var.h = j;
    }

    public static void d(bp8 bp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535af38a", new Object[]{bp8Var});
            return;
        }
        bp8Var.f = bp8Var.i;
        bp8Var.i = vu3.b.GEO_NOT_SUPPORT;
    }

    public static void e(bp8 bp8Var) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e6114b", new Object[]{bp8Var});
        } else if (!TextUtils.equals("leave", bp8Var.d) && !TextUtils.isEmpty(bp8Var.d)) {
            if (bp8Var.e != 0) {
                if (bp8Var.h != 0) {
                    double d = ((j2 - j) * (bp8Var.f + bp8Var.i)) / 2.0d;
                    bp8Var.j += d;
                    if (TextUtils.equals("exposeEnd", bp8Var.g) && bp8Var.j == vu3.b.GEO_NOT_SUPPORT) {
                        bp8Var.j = 1.0d;
                    }
                    if (bp8Var.f16524a == null) {
                        bp8Var.f16524a = new JSONObject();
                    }
                    bp8Var.f16524a.put("exposeFocusDur", (Object) Long.valueOf((long) Math.ceil(bp8Var.j)));
                    if (!TextUtils.equals("exposeEnd", bp8Var.g) && d <= vu3.b.GEO_NOT_SUPPORT) {
                        return;
                    }
                    if ((!TextUtils.equals("scrollStart", bp8Var.g) && !TextUtils.equals("scrollEnd", bp8Var.g)) || v82.c.p()) {
                        u82.g(new a("ExposeCompute", bp8Var));
                        return;
                    }
                    return;
                }
            }
            TLog.logd("BehaviX", "computeExposeFocusDur", "TriggerTime == 0");
        }
    }

    public static void f(bp8 bp8Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0db232", new Object[]{bp8Var, str, new Long(j)});
        } else {
            g(bp8Var, str, j, 0L, 0L, 0L, 0L, 0L);
        }
    }

    public static void g(bp8 bp8Var, String str, long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466ce2d2", new Object[]{bp8Var, str, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
        } else if (bp8Var != null && v82.c.q() && !TextUtils.equals("exposeEnd", bp8Var.g)) {
            c(bp8Var, str, j);
            if (!TextUtils.equals("exposeStart", str)) {
                if (TextUtils.equals("scrollEnd", str)) {
                    b(bp8Var, str, j2, j3, j4, j5, j6);
                } else if (TextUtils.equals("exposeEnd", str)) {
                    d(bp8Var);
                } else {
                    a(bp8Var);
                }
                e(bp8Var);
            }
        }
    }
}
