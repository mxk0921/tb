package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q9m implements z1w<PointF> {
    public static final q9m INSTANCE = new q9m();

    /* renamed from: b */
    public PointF a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token u0 = jsonReader.u0();
        if (u0 == JsonReader.Token.BEGIN_ARRAY) {
            return cxf.e(jsonReader, f);
        }
        if (u0 == JsonReader.Token.BEGIN_OBJECT) {
            return cxf.e(jsonReader, f);
        }
        if (u0 == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.Z()) * f, ((float) jsonReader.Z()) * f);
            while (jsonReader.F()) {
                jsonReader.E0();
            }
            return pointF;
        }
        zhh.b("Cannot convert json to point. Next token is " + u0);
        return new PointF();
    }
}
