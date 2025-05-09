package tb;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jhp {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22001a = JsonReader.a.a("nm", "c", o.b, "fillEnabled", "r", MediaConstant.DEFINITION_HD);

    public static ihp a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        Path.FillType fillType;
        lx0 lx0Var = null;
        String str = null;
        ix0 ix0Var = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f22001a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                ix0Var = yx0.c(jsonReader, kkhVar);
            } else if (C0 == 2) {
                lx0Var = yx0.h(jsonReader, kkhVar);
            } else if (C0 == 3) {
                z = jsonReader.L();
            } else if (C0 == 4) {
                i = jsonReader.c0();
            } else if (C0 != 5) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                z2 = jsonReader.L();
            }
        }
        if (lx0Var == null) {
            lx0Var = new lx0(Collections.singletonList(new w4g(100)));
        }
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new ihp(str, z, fillType, ix0Var, lx0Var, z2);
    }
}
