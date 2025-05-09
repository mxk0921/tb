package com.alibaba.android.bindingx.core.internal;

import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import org.json.JSONException;
import tb.pqf;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TimingFunctions {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final h0<g0> cache = new h0<>(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf(((-doubleValue3) * ((((min * min) * min) * min) - 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a0 implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf(((-doubleValue3) * min * (min - 2.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min * min) + doubleValue2);
            }
            double d = min - 2.0d;
            return Double.valueOf((((-doubleValue3) / 2.0d) * ((((d * d) * d) * d) - 2.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b0 implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min) + doubleValue2);
            }
            double d = min - 1.0d;
            return Double.valueOf((((-doubleValue3) / 2.0d) * ((d * (d - 2.0d)) - 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * min * min * min) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c0 implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * min) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * ((min * min * min * min * min) + 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d0 implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * ((min * min * min) + 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min * min * min) + doubleValue2);
            }
            double d = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * ((d * d * d * d * d) + 2.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e0 implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min) + doubleValue2);
            }
            double d = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * ((d * d * d) + 2.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf(((-doubleValue3) * Math.cos((Math.min(doubleValue, doubleValue4) / doubleValue4) * 1.5707963267948966d)) + doubleValue3 + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f0 implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * min * min) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class g implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf((doubleValue3 * Math.sin((Math.min(doubleValue, doubleValue4) / doubleValue4) * 1.5707963267948966d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class g0 implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f2171a;
        public final float b;
        public final float c;
        public final float d;
        public final Interpolator e;

        static {
            t2o.a(87031932);
        }

        public g0(float f, float f2, float f3, float f4) {
            this.f2171a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = PathInterpolatorCompat.create(f, f2, f3, f4);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            return this.e.getInterpolation(f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class h implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf((((-doubleValue3) / 2.0d) * (Math.cos((Math.min(doubleValue, doubleValue4) * 3.141592653589793d) / doubleValue4) - 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class h0<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque<T> f2172a;

        static {
            t2o.a(87031933);
        }

        public h0(int i) {
            this.f2172a = new ArrayDeque<>(i);
        }

        public void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba2da84", new Object[]{this, t});
            } else if (this.f2172a.size() >= 4) {
                this.f2172a.removeFirst();
                this.f2172a.addLast(t);
            } else {
                this.f2172a.addLast(t);
            }
        }

        public Deque<T> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Deque) ipChange.ipc$dispatch("1633d163", new Object[]{this});
            }
            return this.f2172a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class i implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min != vu3.b.GEO_NOT_SUPPORT) {
                doubleValue2 += doubleValue3 * Math.pow(2.0d, ((min / doubleValue4) - 1.0d) * 10.0d);
            }
            return Double.valueOf(doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class j implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == doubleValue4) {
                d = doubleValue2 + doubleValue3;
            } else {
                d = doubleValue2 + (doubleValue3 * ((-Math.pow(2.0d, (min * (-10.0d)) / doubleValue4)) + 1.0d));
            }
            return Double.valueOf(d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class k implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf((doubleValue3 * (Math.min(doubleValue, doubleValue4) / doubleValue4)) + doubleValue2);
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
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            Double d = (Double) arrayList.get(1);
            double doubleValue2 = d.doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == vu3.b.GEO_NOT_SUPPORT) {
                return d;
            }
            if (min == doubleValue4) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d2 = min / (doubleValue4 / 2.0d);
            if (d2 < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * Math.pow(2.0d, (d2 - 1.0d) * 10.0d)) + doubleValue2);
            }
            return Double.valueOf(((doubleValue3 / 2.0d) * ((-Math.pow(2.0d, (d2 - 1.0d) * (-10.0d))) + 2.0d)) + doubleValue2);
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
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf(((-doubleValue3) * (Math.sqrt(1.0d - (min * min)) - 1.0d)) + doubleValue2);
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
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * Math.sqrt(1.0d - (min * min))) + doubleValue2);
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
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf((((-doubleValue3) / 2.0d) * (Math.sqrt(1.0d - (min * min)) - 1.0d)) + doubleValue2);
            }
            double d = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * (Math.sqrt(1.0d - (d * d)) + 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class p implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            Double d2 = (Double) arrayList.get(1);
            double doubleValue2 = d2.doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == vu3.b.GEO_NOT_SUPPORT) {
                return d2;
            }
            double d3 = min / doubleValue4;
            if (d3 == 1.0d) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d4 = 0.3d * doubleValue4;
            if (doubleValue3 < Math.abs(doubleValue3)) {
                d = d4 / 4.0d;
            } else {
                d = (d4 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3);
            }
            double d5 = d3 - 1.0d;
            return Double.valueOf((-(doubleValue3 * Math.pow(2.0d, 10.0d * d5) * Math.sin((((d5 * doubleValue4) - d) * 6.283185307179586d) / d4))) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class q implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            Double d2 = (Double) arrayList.get(1);
            double doubleValue2 = d2.doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == vu3.b.GEO_NOT_SUPPORT) {
                return d2;
            }
            double d3 = min / doubleValue4;
            if (d3 == 1.0d) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d4 = 0.3d * doubleValue4;
            if (doubleValue3 < Math.abs(doubleValue3)) {
                d = d4 / 4.0d;
            } else {
                d = (d4 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3);
            }
            return Double.valueOf((Math.pow(2.0d, (-10.0d) * d3) * doubleValue3 * Math.sin((((d3 * doubleValue4) - d) * 6.283185307179586d) / d4)) + doubleValue3 + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class r implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            Double d2 = (Double) arrayList.get(1);
            double doubleValue2 = d2.doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == vu3.b.GEO_NOT_SUPPORT) {
                return d2;
            }
            double d3 = min / (doubleValue4 / 2.0d);
            if (d3 == 2.0d) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d4 = 0.44999999999999996d * doubleValue4;
            if (doubleValue3 < Math.abs(doubleValue3)) {
                d = d4 / 4.0d;
            } else {
                d = (d4 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3);
            }
            if (d3 < 1.0d) {
                double d5 = d3 - 1.0d;
                return Double.valueOf((doubleValue3 * Math.pow(2.0d, d5 * 10.0d) * Math.sin((((d5 * doubleValue4) - d) * 6.283185307179586d) / d4) * (-0.5d)) + doubleValue2);
            }
            double d6 = d3 - 1.0d;
            return Double.valueOf((Math.pow(2.0d, (-10.0d) * d6) * doubleValue3 * Math.sin((((d6 * doubleValue4) - d) * 6.283185307179586d) / d4) * 0.5d) + doubleValue3 + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class s implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * ((2.70158d * min) - 1.70158d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class t implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * ((min * min * ((2.70158d * min) + 1.70158d)) + 1.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class u implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * ((3.5949095d * min) - 2.5949095d)) + doubleValue2);
            }
            double d = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * ((d * d * ((3.5949095d * d) + 2.5949095d)) + 2.0d)) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class v implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double doubleValue5 = ((Double) arrayList.get(4)).doubleValue();
            double doubleValue6 = ((Double) arrayList.get(5)).doubleValue();
            double doubleValue7 = ((Double) arrayList.get(6)).doubleValue();
            double doubleValue8 = ((Double) arrayList.get(7)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == doubleValue4) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            float f = (float) doubleValue5;
            float f2 = (float) doubleValue6;
            float f3 = (float) doubleValue7;
            float f4 = (float) doubleValue8;
            g0 access$000 = TimingFunctions.access$000(f, f2, f3, f4);
            if (access$000 == null) {
                access$000 = new g0(f, f2, f3, f4);
                TimingFunctions.access$100().a(access$000);
            }
            return Double.valueOf((doubleValue3 * access$000.getInterpolation((float) (min / doubleValue4))) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class w implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf(TimingFunctions.access$200(Math.min(doubleValue, doubleValue4), doubleValue2, doubleValue3, doubleValue4));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class x implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf(TimingFunctions.access$300(Math.min(doubleValue, doubleValue4), doubleValue2, doubleValue3, doubleValue4));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class y implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min < doubleValue4 / 2.0d) {
                return Double.valueOf((TimingFunctions.access$200(min * 2.0d, vu3.b.GEO_NOT_SUPPORT, doubleValue3, doubleValue4) * 0.5d) + doubleValue2);
            }
            return Double.valueOf((TimingFunctions.access$300((min * 2.0d) - doubleValue4, vu3.b.GEO_NOT_SUPPORT, doubleValue3, doubleValue4) * 0.5d) + (doubleValue3 * 0.5d) + doubleValue2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class z implements pqf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pqf
        public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3e08344", new Object[]{this, arrayList});
            }
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min) + doubleValue2);
        }
    }

    static {
        t2o.a(87031899);
    }

    private TimingFunctions() {
    }

    public static /* synthetic */ g0 access$000(float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0) ipChange.ipc$dispatch("a424fe71", new Object[]{new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
        }
        return isCacheHit(f2, f3, f4, f5);
    }

    public static /* synthetic */ h0 access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("a575b24d", new Object[0]);
        }
        return cache;
    }

    public static /* synthetic */ double access$200(double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2205f8e7", new Object[]{new Double(d2), new Double(d3), new Double(d4), new Double(d5)})).doubleValue();
        }
        return easeInBounce(d2, d3, d4, d5);
    }

    public static /* synthetic */ double access$300(double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6eaaba8", new Object[]{new Double(d2), new Double(d3), new Double(d4), new Double(d5)})).doubleValue();
        }
        return easeOutBounce(d2, d3, d4, d5);
    }

    public static Object cubicBezier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5cb3ca62", new Object[0]);
        }
        return new v();
    }

    public static Object easeInBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("76c5a891", new Object[0]);
        }
        return new s();
    }

    public static Object easeInBounce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fa098650", new Object[0]) : new w();
    }

    public static Object easeInCirc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ffbc9261", new Object[0]);
        }
        return new m();
    }

    public static Object easeInCubic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("24e79c94", new Object[0]);
        }
        return new c0();
    }

    public static Object easeInElastic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c03ca929", new Object[0]);
        }
        return new p();
    }

    public static Object easeInExpo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("86161866", new Object[0]);
        }
        return new i();
    }

    public static Object easeInOutBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c5099aa9", new Object[0]);
        }
        return new u();
    }

    public static Object easeInOutBounce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c7195268", new Object[0]);
        }
        return new y();
    }

    public static Object easeInOutCirc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4e008479", new Object[0]);
        }
        return new o();
    }

    public static Object easeInOutCubic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f21ed7c", new Object[0]);
        }
        return new e0();
    }

    public static Object easeInOutElastic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("95266011", new Object[0]);
        }
        return new r();
    }

    public static Object easeInOutExpo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d45a0a7e", new Object[0]);
        }
        return new l();
    }

    public static Object easeInOutQuad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f1f1fa49", new Object[0]);
        }
        return new b0();
    }

    public static Object easeInOutQuart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("47a2b227", new Object[0]);
        }
        return new b();
    }

    public static Object easeInOutQuint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fee8c41b", new Object[0]);
        }
        return new e();
    }

    public static Object easeInOutSine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("754a64c3", new Object[0]);
        }
        return new h();
    }

    public static Object easeInQuad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3ae0831", new Object[0]);
        }
        return new z();
    }

    public static Object easeInQuart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cd68613f", new Object[0]);
        }
        return new f0();
    }

    public static Object easeInQuint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("84ae7333", new Object[0]);
        }
        return new c();
    }

    public static Object easeInSine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("270672ab", new Object[0]);
        }
        return new f();
    }

    public static Object easeOutBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("db017e64", new Object[0]);
        }
        return new t();
    }

    private static double easeOutBounce(double d2, double d3, double d4, double d5) {
        double d6;
        double d7;
        double d8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e376079d", new Object[]{new Double(d2), new Double(d3), new Double(d4), new Double(d5)})).doubleValue();
        }
        double d9 = d2 / d5;
        if (d9 < 0.36363636363636365d) {
            d8 = 7.5625d * d9 * d9;
        } else {
            if (d9 < 0.7272727272727273d) {
                double d10 = d9 - 0.5454545454545454d;
                d6 = 7.5625d * d10 * d10;
                d7 = 0.75d;
            } else if (d9 < 0.9090909090909091d) {
                double d11 = d9 - 0.8181818181818182d;
                d6 = 7.5625d * d11 * d11;
                d7 = 0.9375d;
            } else {
                double d12 = d9 - 0.9545454545454546d;
                d6 = 7.5625d * d12 * d12;
                d7 = 0.984375d;
            }
            d8 = d6 + d7;
        }
        return (d4 * d8) + d3;
    }

    public static Object easeOutCirc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("63f86834", new Object[0]);
        }
        return new n();
    }

    public static Object easeOutCubic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("48268121", new Object[0]);
        }
        return new d0();
    }

    public static Object easeOutElastic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f549e76", new Object[0]);
        }
        return new q();
    }

    public static Object easeOutExpo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ea51ee39", new Object[0]);
        }
        return new j();
    }

    public static Object easeOutQuad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7e9de04", new Object[0]);
        }
        return new a0();
    }

    public static Object easeOutQuart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f0a745cc", new Object[0]);
        }
        return new a();
    }

    public static Object easeOutQuint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a7ed57c0", new Object[0]);
        }
        return new d();
    }

    public static Object easeOutSine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8b42487e", new Object[0]);
        }
        return new g();
    }

    private static g0 isCacheHit(float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0) ipChange.ipc$dispatch("17538546", new Object[]{new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
        }
        for (g0 g0Var : cache.b()) {
            if (Float.compare(g0Var.f2171a, f2) == 0 && Float.compare(g0Var.c, f4) == 0 && Float.compare(g0Var.b, f3) == 0 && Float.compare(g0Var.d, f5) == 0) {
                return g0Var;
            }
        }
        return null;
    }

    public static Object linear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f2951b86", new Object[0]);
        }
        return new k();
    }

    private static double easeInBounce(double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2067790", new Object[]{new Double(d2), new Double(d3), new Double(d4), new Double(d5)})).doubleValue() : (d4 - easeOutBounce(d5 - d2, vu3.b.GEO_NOT_SUPPORT, d4, d5)) + d3;
    }

    public static Object easeOutBounce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3ea73363", new Object[0]) : new x();
    }
}
