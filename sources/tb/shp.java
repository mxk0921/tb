package tb;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class shp {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f28059a = JsonReader.a.a("nm", "c", "w", o.b, "lc", "lj", "ml", MediaConstant.DEFINITION_HD, "d");
    public static final JsonReader.a b = JsonReader.a.a("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ShapeStroke a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        jx0 jx0Var = null;
        ix0 ix0Var = null;
        jx0 jx0Var2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = 0.0f;
        boolean z = false;
        lx0 lx0Var = null;
        while (jsonReader.F()) {
            switch (jsonReader.C0(f28059a)) {
                case 0:
                    str = jsonReader.i0();
                    break;
                case 1:
                    ix0Var = yx0.c(jsonReader, kkhVar);
                    break;
                case 2:
                    jx0Var2 = yx0.e(jsonReader, kkhVar);
                    break;
                case 3:
                    lx0Var = yx0.h(jsonReader, kkhVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.c0() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.c0() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.Z();
                    break;
                case 7:
                    z = jsonReader.L();
                    break;
                case 8:
                    jsonReader.e();
                    while (jsonReader.F()) {
                        jsonReader.g();
                        String str2 = null;
                        jx0 jx0Var3 = null;
                        while (jsonReader.F()) {
                            int C0 = jsonReader.C0(b);
                            if (C0 == 0) {
                                str2 = jsonReader.i0();
                            } else if (C0 != 1) {
                                jsonReader.D0();
                                jsonReader.E0();
                            } else {
                                jx0Var3 = yx0.e(jsonReader, kkhVar);
                            }
                        }
                        jsonReader.A();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 103:
                                if (str2.equals(at.f)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 111:
                                if (str2.equals(o.b)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                kkhVar.u(true);
                                arrayList.add(jx0Var3);
                                break;
                            case 2:
                                jx0Var = jx0Var3;
                                break;
                        }
                    }
                    jsonReader.w();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.E0();
                    break;
            }
        }
        return new ShapeStroke(str, jx0Var, arrayList, ix0Var, lx0Var == null ? new lx0(Collections.singletonList(new w4g(100))) : lx0Var, jx0Var2, lineCapType, lineJoinType, f, z);
    }
}
