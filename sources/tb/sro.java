package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sro implements z1w<rro> {
    public static final sro INSTANCE = new sro();

    /* renamed from: b */
    public rro a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.e();
        }
        float Z = (float) jsonReader.Z();
        float Z2 = (float) jsonReader.Z();
        while (jsonReader.F()) {
            jsonReader.E0();
        }
        if (z) {
            jsonReader.w();
        }
        return new rro((Z / 100.0f) * f, (Z2 / 100.0f) * f);
    }
}
