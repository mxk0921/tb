package tb;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cxf {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f17411a = JsonReader.a.a("x", "y");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17412a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f17412a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17412a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17412a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(JsonReader jsonReader, float f) throws IOException {
        jsonReader.e();
        float Z = (float) jsonReader.Z();
        float Z2 = (float) jsonReader.Z();
        while (jsonReader.u0() != JsonReader.Token.END_ARRAY) {
            jsonReader.E0();
        }
        jsonReader.w();
        return new PointF(Z * f, Z2 * f);
    }

    public static PointF b(JsonReader jsonReader, float f) throws IOException {
        float Z = (float) jsonReader.Z();
        float Z2 = (float) jsonReader.Z();
        while (jsonReader.F()) {
            jsonReader.E0();
        }
        return new PointF(Z * f, Z2 * f);
    }

    public static PointF c(JsonReader jsonReader, float f) throws IOException {
        jsonReader.g();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f17411a);
            if (C0 == 0) {
                f2 = g(jsonReader);
            } else if (C0 != 1) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                f3 = g(jsonReader);
            }
        }
        jsonReader.A();
        return new PointF(f2 * f, f3 * f);
    }

    public static int d(JsonReader jsonReader) throws IOException {
        jsonReader.e();
        int Z = (int) (jsonReader.Z() * 255.0d);
        int Z2 = (int) (jsonReader.Z() * 255.0d);
        int Z3 = (int) (jsonReader.Z() * 255.0d);
        while (jsonReader.F()) {
            jsonReader.E0();
        }
        jsonReader.w();
        return Color.argb(255, Z, Z2, Z3);
    }

    public static PointF e(JsonReader jsonReader, float f) throws IOException {
        int i = a.f17412a[jsonReader.u0().ordinal()];
        if (i == 1) {
            return b(jsonReader, f);
        }
        if (i == 2) {
            return a(jsonReader, f);
        }
        if (i == 3) {
            return c(jsonReader, f);
        }
        zhh.b("Unknown point starts with " + jsonReader.u0());
        return new PointF();
    }

    public static List<PointF> f(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.e();
        while (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.e();
            arrayList.add(e(jsonReader, f));
            jsonReader.w();
        }
        jsonReader.w();
        return arrayList;
    }

    public static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token u0 = jsonReader.u0();
        int i = a.f17412a[u0.ordinal()];
        if (i == 1) {
            return (float) jsonReader.Z();
        }
        if (i != 2) {
            zhh.b("Unknown value for token of type " + u0);
            return 0.0f;
        }
        jsonReader.e();
        float Z = (float) jsonReader.Z();
        while (jsonReader.F()) {
            jsonReader.E0();
        }
        jsonReader.w();
        return Z;
    }
}
