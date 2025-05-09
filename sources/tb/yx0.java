package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yx0 {
    public static <T> List<w4g<T>> a(JsonReader jsonReader, float f, kkh kkhVar, z1w<T> z1wVar) throws IOException {
        return z4g.a(jsonReader, kkhVar, f, z1wVar, false);
    }

    public static <T> List<w4g<T>> b(JsonReader jsonReader, kkh kkhVar, z1w<T> z1wVar) throws IOException {
        return z4g.a(jsonReader, kkhVar, 1.0f, z1wVar, false);
    }

    public static ix0 c(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return new ix0(b(jsonReader, kkhVar, o14.INSTANCE));
    }

    public static sx0 d(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return new sx0(b(jsonReader, kkhVar, ns7.INSTANCE));
    }

    public static jx0 e(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return f(jsonReader, kkhVar, true);
    }

    public static jx0 f(JsonReader jsonReader, kkh kkhVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = fxv.e();
        } else {
            f = 1.0f;
        }
        return new jx0(a(jsonReader, f, kkhVar, on9.INSTANCE));
    }

    public static kx0 g(JsonReader jsonReader, kkh kkhVar, int i) throws IOException {
        return new kx0(b(jsonReader, kkhVar, new pia(i)));
    }

    public static lx0 h(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return new lx0(b(jsonReader, kkhVar, fef.INSTANCE));
    }

    public static ox0 i(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return new ox0(z4g.a(jsonReader, kkhVar, fxv.e(), q9m.INSTANCE, true));
    }

    public static px0 j(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return new px0(b(jsonReader, kkhVar, sro.INSTANCE));
    }

    public static qx0 k(JsonReader jsonReader, kkh kkhVar) throws IOException {
        return new qx0(a(jsonReader, fxv.e(), kkhVar, hhp.INSTANCE));
    }
}
