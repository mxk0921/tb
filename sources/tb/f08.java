package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f08 {
    public static final JsonReader.a f = JsonReader.a.a("ef");
    public static final JsonReader.a g = JsonReader.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    public ix0 f18919a;
    public jx0 b;
    public jx0 c;
    public jx0 d;
    public jx0 e;

    public final void a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        jsonReader.g();
        String str = "";
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(g);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 != 1) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.d = yx0.e(jsonReader, kkhVar);
                        continue;
                    case 1:
                        this.b = yx0.f(jsonReader, kkhVar, false);
                        continue;
                    case 2:
                        this.c = yx0.f(jsonReader, kkhVar, false);
                        continue;
                    case 3:
                        this.f18919a = yx0.c(jsonReader, kkhVar);
                        continue;
                    case 4:
                        this.e = yx0.e(jsonReader, kkhVar);
                        continue;
                    default:
                        jsonReader.E0();
                        continue;
                }
            }
        }
        jsonReader.A();
    }

    public e08 b(JsonReader jsonReader, kkh kkhVar) throws IOException {
        jx0 jx0Var;
        jx0 jx0Var2;
        jx0 jx0Var3;
        jx0 jx0Var4;
        while (jsonReader.F()) {
            if (jsonReader.C0(f) != 0) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                jsonReader.e();
                while (jsonReader.F()) {
                    a(jsonReader, kkhVar);
                }
                jsonReader.w();
            }
        }
        ix0 ix0Var = this.f18919a;
        if (ix0Var == null || (jx0Var = this.b) == null || (jx0Var2 = this.c) == null || (jx0Var3 = this.d) == null || (jx0Var4 = this.e) == null) {
            return null;
        }
        return new e08(ix0Var, jx0Var, jx0Var2, jx0Var3, jx0Var4);
    }
}
