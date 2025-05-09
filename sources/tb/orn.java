package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class orn {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f25601a = JsonReader.a.a("nm", "p", "s", "r", MediaConstant.DEFINITION_HD);

    public static nrn a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        String str = null;
        xx0<PointF, PointF> xx0Var = null;
        ox0 ox0Var = null;
        jx0 jx0Var = null;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f25601a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                xx0Var = nx0.b(jsonReader, kkhVar);
            } else if (C0 == 2) {
                ox0Var = yx0.i(jsonReader, kkhVar);
            } else if (C0 == 3) {
                jx0Var = yx0.e(jsonReader, kkhVar);
            } else if (C0 != 4) {
                jsonReader.E0();
            } else {
                z = jsonReader.L();
            }
        }
        return new nrn(str, xx0Var, ox0Var, jx0Var, z);
    }
}
