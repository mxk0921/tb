package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ux0 {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f29652a = JsonReader.a.a("a");
    public static final JsonReader.a b = JsonReader.a.a("fc", "sc", "sw", "t");

    public static tx0 a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        jsonReader.g();
        tx0 tx0Var = null;
        while (jsonReader.F()) {
            if (jsonReader.C0(f29652a) != 0) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                tx0Var = b(jsonReader, kkhVar);
            }
        }
        jsonReader.A();
        if (tx0Var == null) {
            return new tx0(null, null, null, null);
        }
        return tx0Var;
    }

    public static tx0 b(JsonReader jsonReader, kkh kkhVar) throws IOException {
        jsonReader.g();
        ix0 ix0Var = null;
        ix0 ix0Var2 = null;
        jx0 jx0Var = null;
        jx0 jx0Var2 = null;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(b);
            if (C0 == 0) {
                ix0Var = yx0.c(jsonReader, kkhVar);
            } else if (C0 == 1) {
                ix0Var2 = yx0.c(jsonReader, kkhVar);
            } else if (C0 == 2) {
                jx0Var = yx0.e(jsonReader, kkhVar);
            } else if (C0 != 3) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                jx0Var2 = yx0.e(jsonReader, kkhVar);
            }
        }
        jsonReader.A();
        return new tx0(ix0Var, ix0Var2, jx0Var, jx0Var2);
    }
}
