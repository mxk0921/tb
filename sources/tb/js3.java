package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class js3 {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22181a = JsonReader.a.a("nm", "p", "s", MediaConstant.DEFINITION_HD, "d");

    public static is3 a(JsonReader jsonReader, kkh kkhVar, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        xx0<PointF, PointF> xx0Var = null;
        ox0 ox0Var = null;
        boolean z3 = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f22181a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                xx0Var = nx0.b(jsonReader, kkhVar);
            } else if (C0 == 2) {
                ox0Var = yx0.i(jsonReader, kkhVar);
            } else if (C0 == 3) {
                z3 = jsonReader.L();
            } else if (C0 != 4) {
                jsonReader.D0();
                jsonReader.E0();
            } else if (jsonReader.c0() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return new is3(str, xx0Var, ox0Var, z2, z3);
    }
}
