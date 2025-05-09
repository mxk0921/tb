package com.alibaba.android.bindingx.core.internal;

import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.a;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import tb.pqf;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSMath {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ArgbEvaluator sArgbEvaluator = new ArgbEvaluator();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.sqrt(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.cbrt(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.log(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.abs(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            int i = (doubleValue > vu3.b.GEO_NOT_SUPPORT ? 1 : (doubleValue == vu3.b.GEO_NOT_SUPPORT ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i == 0) {
                return 0;
            }
            if (doubleValue < vu3.b.GEO_NOT_SUPPORT) {
                return -1;
            }
            return Double.valueOf(Double.NaN);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.ceil(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class g implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.floor(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class h implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Long.valueOf(Math.round(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class i implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            if (arrayList == null || arrayList.size() < 1) {
                return null;
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                double doubleValue2 = ((Double) arrayList.get(i)).doubleValue();
                if (doubleValue2 > doubleValue) {
                    doubleValue = doubleValue2;
                }
            }
            return Double.valueOf(doubleValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class j implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            if (arrayList == null || arrayList.size() < 1) {
                return null;
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                double doubleValue2 = ((Double) arrayList.get(i)).doubleValue();
                if (doubleValue2 < doubleValue) {
                    doubleValue = doubleValue2;
                }
            }
            return Double.valueOf(doubleValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class k implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.sin(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class l implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            if (arrayList == null || arrayList.size() < 3) {
                return null;
            }
            return Integer.valueOf(Color.rgb((int) ((Double) arrayList.get(0)).doubleValue(), (int) ((Double) arrayList.get(1)).doubleValue(), (int) ((Double) arrayList.get(2)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class m implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            if (arrayList == null || arrayList.size() < 4) {
                return null;
            }
            return Integer.valueOf(Color.argb((int) (((Double) arrayList.get(3)).doubleValue() * 255.0d), (int) ((Double) arrayList.get(0)).doubleValue(), (int) ((Double) arrayList.get(1)).doubleValue(), (int) ((Double) arrayList.get(2)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class n implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return JSMath.access$100().evaluate((float) Math.min(1.0d, Math.max((double) vu3.b.GEO_NOT_SUPPORT, ((Double) arrayList.get(2)).doubleValue())), Integer.valueOf(JSMath.access$000((String) arrayList.get(0))), Integer.valueOf(JSMath.access$000((String) arrayList.get(1))));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class o implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class p implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.cos(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class q implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.tan(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class r implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.asin(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class s implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.acos(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class t implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.atan(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class u implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.atan2(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class v implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.pow(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class w implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            return Double.valueOf(Math.exp(((Double) arrayList.get(0)).doubleValue()));
        }
    }

    static {
        t2o.a(87031860);
    }

    private JSMath() {
    }

    public static Object E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6939e66", new Object[0]);
        }
        return Double.valueOf(2.718281828459045d);
    }

    public static Object PI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("502a6d32", new Object[0]);
        }
        return Double.valueOf(3.141592653589793d);
    }

    public static Object abs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("162ef459", new Object[0]);
        }
        return new d();
    }

    public static /* synthetic */ int access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38fae174", new Object[]{str})).intValue();
        }
        return parseColor(str);
    }

    public static /* synthetic */ ArgbEvaluator access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArgbEvaluator) ipChange.ipc$dispatch("87573831", new Object[0]);
        }
        return sArgbEvaluator;
    }

    public static Object acos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e90407c5", new Object[0]);
        }
        return new s();
    }

    public static void applyRotationInDegreesToScope(Map<String, Object> map, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5051d83", new Object[]{map, new Double(d2)});
        } else {
            map.put("r", Double.valueOf(d2));
        }
    }

    public static void applyScaleFactorToScope(Map<String, Object> map, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79a240e", new Object[]{map, new Double(d2)});
        } else {
            map.put("s", Double.valueOf(d2));
        }
    }

    public static void applySpringValueToScope(Map<String, Object> map, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680caf9b", new Object[]{map, new Double(d2), new Double(d3)});
            return;
        }
        map.put("p", Double.valueOf(d2));
        map.put("v", Double.valueOf(d3));
    }

    public static void applyTimingValuesToScope(Map<String, Object> map, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288074ff", new Object[]{map, new Double(d2)});
        } else {
            map.put("t", Double.valueOf(d2));
        }
    }

    public static Object asArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("388eea4", new Object[0]);
        }
        return new o();
    }

    public static Object asin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4b56b914", new Object[0]);
        }
        return new r();
    }

    public static Object atan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5cb7deb", new Object[0]);
        }
        return new t();
    }

    public static Object atan2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1c92439", new Object[0]);
        }
        return new u();
    }

    public static Object cbrt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5a7d994a", new Object[0]);
        }
        return new b();
    }

    public static Object ceil() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7e960da6", new Object[0]);
        }
        return new f();
    }

    public static Object cos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d2b6da64", new Object[0]);
        }
        return new p();
    }

    public static Object evaluateColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3269f981", new Object[0]);
        }
        return new n();
    }

    public static Object exp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d2e72b8e", new Object[0]);
        }
        return new w();
    }

    public static Object floor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9d3b6cff", new Object[0]);
        }
        return new g();
    }

    public static Object log() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("608020c7", new Object[0]);
        }
        return new c();
    }

    public static Object max() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3cacb2a7", new Object[0]);
        }
        return new i();
    }

    public static Object min() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4d003279", new Object[0]);
        }
        return new j();
    }

    private static int parseColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("'") || str.startsWith("\"")) {
                str = str.substring(1, str.length() - 1);
            }
            int parseColor = Color.parseColor(str);
            return Color.argb(255, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor));
        }
        throw new IllegalArgumentException("Unknown color");
    }

    public static Object pow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b8e20633", new Object[0]);
        }
        return new v();
    }

    public static Object rgb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56600ade", new Object[0]);
        }
        return new l();
    }

    public static Object rgba() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("665378d7", new Object[0]);
        }
        return new m();
    }

    public static Object round() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8283c4bd", new Object[0]);
        }
        return new h();
    }

    public static Object sign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2a495bee", new Object[0]);
        }
        return new e();
    }

    public static Object sin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("35098bb3", new Object[0]);
        }
        return new k();
    }

    public static Object sqrt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6199c86b", new Object[0]);
        }
        return new a();
    }

    public static Object tan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("df7e508a", new Object[0]);
        }
        return new q();
    }

    public static void applyXYToScope(Map<String, Object> map, double d2, double d3, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43043e67", new Object[]{map, new Double(d2), new Double(d3), cVar});
            return;
        }
        map.put("x", Double.valueOf(cVar.b(d2, new Object[0])));
        map.put("y", Double.valueOf(cVar.b(d3, new Object[0])));
        map.put("internal_x", Double.valueOf(d2));
        map.put("internal_y", Double.valueOf(d3));
    }

    public static void applyOrientationValuesToScope(Map<String, Object> map, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd910815", new Object[]{map, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), new Double(d8), new Double(d9), new Double(d10)});
            return;
        }
        map.put("alpha", Double.valueOf(d2));
        map.put("beta", Double.valueOf(d3));
        map.put("gamma", Double.valueOf(d4));
        map.put("dalpha", Double.valueOf(d2 - d5));
        map.put("dbeta", Double.valueOf(d3 - d6));
        map.put("dgamma", Double.valueOf(d4 - d7));
        map.put("x", Double.valueOf(d8));
        map.put("y", Double.valueOf(d9));
        map.put(AmnetConstant.VAL_SUPPORT_ZSTD, Double.valueOf(d10));
    }

    public static void applyScrollValuesToScope(Map<String, Object> map, double d2, double d3, double d4, double d5, double d6, double d7, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39123d39", new Object[]{map, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), cVar});
            return;
        }
        map.put("x", Double.valueOf(cVar.b(d2, new Object[0])));
        map.put("y", Double.valueOf(cVar.b(d3, new Object[0])));
        map.put("dx", Double.valueOf(cVar.b(d4, new Object[0])));
        map.put("dy", Double.valueOf(cVar.b(d5, new Object[0])));
        map.put("tdx", Double.valueOf(cVar.b(d6, new Object[0])));
        map.put("tdy", Double.valueOf(cVar.b(d7, new Object[0])));
        map.put("internal_x", Double.valueOf(d2));
        map.put("internal_y", Double.valueOf(d3));
    }
}
