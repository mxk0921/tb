package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class su9 {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f28279a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    public static gu9 a(JsonReader jsonReader) throws IOException {
        jsonReader.g();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f28279a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                str2 = jsonReader.i0();
            } else if (C0 == 2) {
                str3 = jsonReader.i0();
            } else if (C0 != 3) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                f = (float) jsonReader.Z();
            }
        }
        jsonReader.A();
        return new gu9(str, str2, str3, f);
    }
}
