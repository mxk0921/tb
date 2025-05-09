package tb;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y4g {
    public static SparseArrayCompat<WeakReference<Interpolator>> b;

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f31847a = new LinearInterpolator();
    public static final JsonReader.a c = JsonReader.a.a("t", "s", "e", o.b, bmv.MSGTYPE_INTERVAL, "h", "to", "ti");
    public static final JsonReader.a d = JsonReader.a.a("x", "y");

    public static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (y4g.class) {
            weakReference = g().get(i);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        Interpolator linearInterpolator;
        pointF.x = uvi.c(pointF.x, -1.0f, 1.0f);
        pointF.y = uvi.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = uvi.c(pointF2.x, -1.0f, 1.0f);
        float c2 = uvi.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c2;
        int i = fxv.i(pointF.x, pointF.y, pointF2.x, c2);
        WeakReference<Interpolator> a2 = a(i);
        if (a2 != null) {
            interpolator = a2.get();
        } else {
            interpolator = null;
        }
        if (a2 == null || interpolator == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    public static <T> w4g<T> c(JsonReader jsonReader, kkh kkhVar, float f, z1w<T> z1wVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(kkhVar, jsonReader, f, z1wVar);
        }
        if (z) {
            return d(kkhVar, jsonReader, f, z1wVar);
        }
        return f(jsonReader, f, z1wVar);
    }

    public static <T> w4g<T> d(kkh kkhVar, JsonReader jsonReader, float f, z1w<T> z1wVar) throws IOException {
        Interpolator interpolator;
        T t;
        jsonReader.g();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (jsonReader.F()) {
            switch (jsonReader.C0(c)) {
                case 0:
                    f2 = (float) jsonReader.Z();
                    break;
                case 1:
                    t3 = z1wVar.a(jsonReader, f);
                    break;
                case 2:
                    t2 = z1wVar.a(jsonReader, f);
                    break;
                case 3:
                    pointF = cxf.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF2 = cxf.e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.c0() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = cxf.e(jsonReader, f);
                    break;
                case 7:
                    pointF4 = cxf.e(jsonReader, f);
                    break;
                default:
                    jsonReader.E0();
                    break;
            }
        }
        jsonReader.A();
        Interpolator interpolator2 = f31847a;
        if (z) {
            interpolator = interpolator2;
            t = t3;
        } else {
            if (!(pointF == null || pointF2 == null)) {
                interpolator2 = b(pointF, pointF2);
            }
            interpolator = interpolator2;
            t = t2;
        }
        w4g<T> w4gVar = new w4g<>(kkhVar, t3, t, interpolator, f2, null);
        w4gVar.o = pointF3;
        w4gVar.p = pointF4;
        return w4gVar;
    }

    public static <T> w4g<T> e(kkh kkhVar, JsonReader jsonReader, float f, z1w<T> z1wVar) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        PointF pointF;
        w4g<T> w4gVar;
        PointF pointF2;
        float f2;
        float f3;
        JsonReader.a aVar;
        jsonReader.g();
        PointF pointF3 = null;
        boolean z = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t2 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        float f4 = 0.0f;
        PointF pointF10 = null;
        T t3 = null;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(c);
            JsonReader.a aVar2 = d;
            switch (C0) {
                case 0:
                    pointF2 = pointF3;
                    f4 = (float) jsonReader.Z();
                    pointF10 = pointF10;
                    pointF3 = pointF2;
                    break;
                case 1:
                    t2 = z1wVar.a(jsonReader, f);
                    pointF10 = pointF10;
                    break;
                case 2:
                    t3 = z1wVar.a(jsonReader, f);
                    pointF10 = pointF10;
                    break;
                case 3:
                    if (jsonReader.u0() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.g();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (jsonReader.F()) {
                            int C02 = jsonReader.C0(aVar2);
                            if (C02 == 0) {
                                JsonReader.Token u0 = jsonReader.u0();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (u0 == token) {
                                    aVar = aVar2;
                                    f7 = (float) jsonReader.Z();
                                    f5 = f7;
                                } else {
                                    aVar = aVar2;
                                    jsonReader.e();
                                    f5 = (float) jsonReader.Z();
                                    if (jsonReader.u0() == token) {
                                        f7 = (float) jsonReader.Z();
                                    } else {
                                        f7 = f5;
                                    }
                                    jsonReader.w();
                                }
                                aVar2 = aVar;
                            } else if (C02 != 1) {
                                jsonReader.E0();
                            } else {
                                JsonReader.Token u02 = jsonReader.u0();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (u02 == token2) {
                                    f8 = (float) jsonReader.Z();
                                    f6 = f8;
                                    aVar2 = aVar2;
                                } else {
                                    jsonReader.e();
                                    float Z = (float) jsonReader.Z();
                                    if (jsonReader.u0() == token2) {
                                        f3 = Z;
                                        Z = (float) jsonReader.Z();
                                    } else {
                                        f3 = Z;
                                    }
                                    jsonReader.w();
                                    aVar2 = aVar2;
                                    f8 = Z;
                                    f6 = f3;
                                }
                            }
                        }
                        PointF pointF11 = new PointF(f5, f6);
                        PointF pointF12 = new PointF(f7, f8);
                        jsonReader.A();
                        pointF7 = pointF12;
                        pointF6 = pointF11;
                    } else {
                        pointF4 = cxf.e(jsonReader, f);
                    }
                    pointF10 = pointF10;
                    pointF3 = pointF3;
                    f4 = f4;
                    break;
                case 4:
                    if (jsonReader.u0() != JsonReader.Token.BEGIN_OBJECT) {
                        pointF5 = cxf.e(jsonReader, f);
                        pointF10 = pointF10;
                        break;
                    } else {
                        jsonReader.g();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (jsonReader.F()) {
                            int C03 = jsonReader.C0(aVar2);
                            if (C03 != 0) {
                                f2 = f4;
                                if (C03 != 1) {
                                    jsonReader.E0();
                                } else {
                                    JsonReader.Token u03 = jsonReader.u0();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (u03 == token3) {
                                        f12 = (float) jsonReader.Z();
                                        f10 = f12;
                                    } else {
                                        jsonReader.e();
                                        float Z2 = (float) jsonReader.Z();
                                        if (jsonReader.u0() == token3) {
                                            f12 = (float) jsonReader.Z();
                                        } else {
                                            f12 = Z2;
                                        }
                                        jsonReader.w();
                                        f10 = Z2;
                                    }
                                }
                            } else {
                                f2 = f4;
                                JsonReader.Token u04 = jsonReader.u0();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (u04 == token4) {
                                    f11 = (float) jsonReader.Z();
                                    f9 = f11;
                                } else {
                                    jsonReader.e();
                                    float Z3 = (float) jsonReader.Z();
                                    if (jsonReader.u0() == token4) {
                                        f11 = (float) jsonReader.Z();
                                    } else {
                                        f11 = Z3;
                                    }
                                    jsonReader.w();
                                    f9 = Z3;
                                }
                            }
                            pointF3 = pointF3;
                            f4 = f2;
                        }
                        pointF2 = pointF3;
                        PointF pointF13 = new PointF(f9, f10);
                        PointF pointF14 = new PointF(f11, f12);
                        jsonReader.A();
                        pointF8 = pointF13;
                        pointF9 = pointF14;
                        pointF10 = pointF10;
                        pointF3 = pointF2;
                        break;
                    }
                case 5:
                    if (jsonReader.c0() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pointF10 = pointF10;
                    break;
                case 6:
                    pointF10 = cxf.e(jsonReader, f);
                    break;
                case 7:
                    pointF3 = cxf.e(jsonReader, f);
                    pointF10 = pointF10;
                    break;
                default:
                    jsonReader.E0();
                    pointF10 = pointF10;
                    break;
            }
        }
        jsonReader.A();
        Interpolator interpolator3 = f31847a;
        if (z) {
            t = t2;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator3 = b(pointF4, pointF5);
            } else if (!(pointF6 == null || pointF7 == null || pointF8 == null || pointF9 == null)) {
                interpolator2 = b(pointF6, pointF8);
                interpolator = b(pointF7, pointF9);
                t = t3;
                interpolator3 = null;
                if (interpolator2 != null || interpolator == null) {
                    pointF = pointF10;
                    w4gVar = new w4g<>(kkhVar, t2, t, interpolator3, f4, null);
                } else {
                    pointF = pointF10;
                    w4gVar = new w4g<>(kkhVar, t2, t, interpolator2, interpolator, f4, null);
                }
                w4gVar.o = pointF;
                w4gVar.p = pointF3;
                return w4gVar;
            }
            t = t3;
        }
        interpolator2 = null;
        interpolator = null;
        if (interpolator2 != null) {
        }
        pointF = pointF10;
        w4gVar = new w4g<>(kkhVar, t2, t, interpolator3, f4, null);
        w4gVar.o = pointF;
        w4gVar.p = pointF3;
        return w4gVar;
    }

    public static <T> w4g<T> f(JsonReader jsonReader, float f, z1w<T> z1wVar) throws IOException {
        return new w4g<>(z1wVar.a(jsonReader, f));
    }

    public static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (b == null) {
            b = new SparseArrayCompat<>();
        }
        return b;
    }

    public static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (y4g.class) {
            b.put(i, weakReference);
        }
    }
}
