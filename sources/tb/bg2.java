package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bg2 {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f16364a = JsonReader.a.a("ef");
    public static final JsonReader.a b = JsonReader.a.a("ty", "v");

    public static ag2 a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        jsonReader.g();
        ag2 ag2Var = null;
        while (true) {
            boolean z = false;
            while (jsonReader.F()) {
                int C0 = jsonReader.C0(b);
                if (C0 != 0) {
                    if (C0 != 1) {
                        jsonReader.D0();
                        jsonReader.E0();
                    } else if (z) {
                        ag2Var = new ag2(yx0.e(jsonReader, kkhVar));
                    } else {
                        jsonReader.E0();
                    }
                } else if (jsonReader.c0() == 0) {
                    z = true;
                }
            }
            jsonReader.A();
            return ag2Var;
        }
    }

    public static ag2 b(JsonReader jsonReader, kkh kkhVar) throws IOException {
        ag2 ag2Var = null;
        while (jsonReader.F()) {
            if (jsonReader.C0(f16364a) != 0) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                jsonReader.e();
                while (jsonReader.F()) {
                    ag2 a2 = a(jsonReader, kkhVar);
                    if (a2 != null) {
                        ag2Var = a2;
                    }
                }
                jsonReader.w();
            }
        }
        return ag2Var;
    }
}
