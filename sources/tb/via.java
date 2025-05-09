package tb;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class via {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f30031a = JsonReader.a.a("nm", at.f, o.b, "t", "s", "e", "w", "lc", "lj", "ml", MediaConstant.DEFINITION_HD, "d");
    public static final JsonReader.a b = JsonReader.a.a("p", at.k);
    public static final JsonReader.a c = JsonReader.a.a("n", "v");

    public static a a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        GradientType gradientType = null;
        kx0 kx0Var = null;
        ox0 ox0Var = null;
        ox0 ox0Var2 = null;
        jx0 jx0Var = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = 0.0f;
        jx0 jx0Var2 = null;
        boolean z = false;
        lx0 lx0Var = null;
        while (jsonReader.F()) {
            switch (jsonReader.C0(f30031a)) {
                case 0:
                    str = jsonReader.i0();
                    continue;
                case 1:
                    str = str;
                    jsonReader.g();
                    int i = -1;
                    while (jsonReader.F()) {
                        int C0 = jsonReader.C0(b);
                        if (C0 != 0) {
                            kx0Var = kx0Var;
                            if (C0 != 1) {
                                jsonReader.D0();
                                jsonReader.E0();
                            } else {
                                kx0Var = yx0.g(jsonReader, kkhVar, i);
                            }
                        } else {
                            kx0Var = kx0Var;
                            i = jsonReader.c0();
                        }
                    }
                    jsonReader.A();
                    break;
                case 2:
                    lx0Var = yx0.h(jsonReader, kkhVar);
                    continue;
                case 3:
                    str = str;
                    if (jsonReader.c0() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    break;
                case 4:
                    ox0Var = yx0.i(jsonReader, kkhVar);
                    continue;
                case 5:
                    ox0Var2 = yx0.i(jsonReader, kkhVar);
                    continue;
                case 6:
                    jx0Var = yx0.e(jsonReader, kkhVar);
                    continue;
                case 7:
                    str = str;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.c0() - 1];
                    break;
                case 8:
                    str = str;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.c0() - 1];
                    break;
                case 9:
                    str = str;
                    f = (float) jsonReader.Z();
                    break;
                case 10:
                    z = jsonReader.L();
                    continue;
                case 11:
                    jsonReader.e();
                    while (jsonReader.F()) {
                        jsonReader.g();
                        String str2 = null;
                        jx0 jx0Var3 = null;
                        while (jsonReader.F()) {
                            int C02 = jsonReader.C0(c);
                            if (C02 != 0) {
                                if (C02 != 1) {
                                    jsonReader.D0();
                                    jsonReader.E0();
                                } else {
                                    jx0Var3 = yx0.e(jsonReader, kkhVar);
                                }
                                jx0Var2 = jx0Var2;
                            } else {
                                str2 = jsonReader.i0();
                            }
                        }
                        jsonReader.A();
                        if (str2.equals(o.b)) {
                            jx0Var2 = jx0Var3;
                        } else {
                            if (str2.equals("d") || str2.equals(at.f)) {
                                kkhVar.u(true);
                                arrayList.add(jx0Var3);
                            }
                            jx0Var2 = jx0Var2;
                        }
                    }
                    jsonReader.w();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    jx0Var2 = jx0Var2;
                    continue;
                    break;
                default:
                    jsonReader.D0();
                    jsonReader.E0();
                    continue;
            }
        }
        if (lx0Var == null) {
            lx0Var = new lx0(Collections.singletonList(new w4g(100)));
        }
        return new a(str, gradientType, kx0Var, lx0Var, ox0Var, ox0Var2, jx0Var, lineCapType, lineJoinType, f, arrayList, jx0Var2, z);
    }
}
