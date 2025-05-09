package tb;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tia {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f28730a = JsonReader.a.a("nm", at.f, o.b, "t", "s", "e", "r", MediaConstant.DEFINITION_HD);
    public static final JsonReader.a b = JsonReader.a.a("p", at.k);

    public static ria a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        lx0 lx0Var;
        GradientType gradientType;
        Path.FillType fillType;
        lx0 lx0Var2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType2 = null;
        kx0 kx0Var = null;
        ox0 ox0Var = null;
        ox0 ox0Var2 = null;
        boolean z = false;
        while (jsonReader.F()) {
            switch (jsonReader.C0(f28730a)) {
                case 0:
                    str = jsonReader.i0();
                    break;
                case 1:
                    jsonReader.g();
                    int i = -1;
                    while (jsonReader.F()) {
                        int C0 = jsonReader.C0(b);
                        if (C0 == 0) {
                            i = jsonReader.c0();
                        } else if (C0 != 1) {
                            jsonReader.D0();
                            jsonReader.E0();
                        } else {
                            kx0Var = yx0.g(jsonReader, kkhVar, i);
                        }
                    }
                    jsonReader.A();
                    break;
                case 2:
                    lx0Var2 = yx0.h(jsonReader, kkhVar);
                    break;
                case 3:
                    if (jsonReader.c0() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    gradientType2 = gradientType;
                    break;
                case 4:
                    ox0Var = yx0.i(jsonReader, kkhVar);
                    break;
                case 5:
                    ox0Var2 = yx0.i(jsonReader, kkhVar);
                    break;
                case 6:
                    if (jsonReader.c0() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = jsonReader.L();
                    break;
                default:
                    jsonReader.D0();
                    jsonReader.E0();
                    break;
            }
        }
        if (lx0Var2 == null) {
            lx0Var = new lx0(Collections.singletonList(new w4g(100)));
        } else {
            lx0Var = lx0Var2;
        }
        return new ria(str, gradientType2, fillType2, kx0Var, lx0Var, ox0Var, ox0Var2, null, null, z);
    }
}
