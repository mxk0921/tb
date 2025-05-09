package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n1o {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f24448a = JsonReader.a.a("nm", "c", o.b, "tr", MediaConstant.DEFINITION_HD);

    public static l1o a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        String str = null;
        jx0 jx0Var = null;
        jx0 jx0Var2 = null;
        vx0 vx0Var = null;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f24448a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                jx0Var = yx0.f(jsonReader, kkhVar, false);
            } else if (C0 == 2) {
                jx0Var2 = yx0.f(jsonReader, kkhVar, false);
            } else if (C0 == 3) {
                vx0Var = wx0.g(jsonReader, kkhVar);
            } else if (C0 != 4) {
                jsonReader.E0();
            } else {
                z = jsonReader.L();
            }
        }
        return new l1o(str, jx0Var, jx0Var2, vx0Var, z);
    }
}
