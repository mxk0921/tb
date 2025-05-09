package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wgo {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f30684a = JsonReader.a.a("nm", "r", MediaConstant.DEFINITION_HD);

    public static ugo a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        boolean z = false;
        String str = null;
        jx0 jx0Var = null;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f30684a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                jx0Var = yx0.f(jsonReader, kkhVar, true);
            } else if (C0 != 2) {
                jsonReader.E0();
            } else {
                z = jsonReader.L();
            }
        }
        if (z) {
            return null;
        }
        return new ugo(str, jx0Var);
    }
}
