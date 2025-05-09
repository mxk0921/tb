package tb;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class thp {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f28721a = JsonReader.a.a("s", "e", o.b, "nm", "m", MediaConstant.DEFINITION_HD);

    public static ShapeTrimPath a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        jx0 jx0Var = null;
        jx0 jx0Var2 = null;
        jx0 jx0Var3 = null;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f28721a);
            if (C0 == 0) {
                jx0Var = yx0.f(jsonReader, kkhVar, false);
            } else if (C0 == 1) {
                jx0Var2 = yx0.f(jsonReader, kkhVar, false);
            } else if (C0 == 2) {
                jx0Var3 = yx0.f(jsonReader, kkhVar, false);
            } else if (C0 == 3) {
                str = jsonReader.i0();
            } else if (C0 == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.c0());
            } else if (C0 != 5) {
                jsonReader.E0();
            } else {
                z = jsonReader.L();
            }
        }
        return new ShapeTrimPath(str, type, jx0Var, jx0Var2, jx0Var3, z);
    }
}
