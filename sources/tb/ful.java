package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ful {
    public static dul a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        boolean z;
        if (jsonReader.u0() == JsonReader.Token.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new dul(kkhVar, y4g.c(jsonReader, kkhVar, fxv.e(), hul.INSTANCE, z, false));
    }
}
