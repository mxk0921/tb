package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rhp {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f27389a = JsonReader.a.a("nm", "ind", "ks", MediaConstant.DEFINITION_HD);

    public static qhp a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        String str = null;
        qx0 qx0Var = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f27389a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                i = jsonReader.c0();
            } else if (C0 == 2) {
                qx0Var = yx0.k(jsonReader, kkhVar);
            } else if (C0 != 3) {
                jsonReader.E0();
            } else {
                z = jsonReader.L();
            }
        }
        return new qhp(str, i, qx0Var, z);
    }
}
