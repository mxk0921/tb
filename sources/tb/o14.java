package tb;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o14 implements z1w<Integer> {
    public static final o14 INSTANCE = new o14();

    /* renamed from: b */
    public Integer a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        double d;
        if (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.e();
        }
        double Z = jsonReader.Z();
        double Z2 = jsonReader.Z();
        double Z3 = jsonReader.Z();
        if (jsonReader.u0() == JsonReader.Token.NUMBER) {
            d = jsonReader.Z();
        } else {
            d = 1.0d;
        }
        if (z) {
            jsonReader.w();
        }
        if (Z <= 1.0d && Z2 <= 1.0d && Z3 <= 1.0d) {
            Z *= 255.0d;
            Z2 *= 255.0d;
            Z3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) Z, (int) Z2, (int) Z3));
    }
}
