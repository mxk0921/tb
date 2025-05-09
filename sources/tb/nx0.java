package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.loc.at;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nx0 {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f25012a = JsonReader.a.a(at.k, "x", "y");

    public static mx0 a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.e();
            while (jsonReader.F()) {
                arrayList.add(ful.a(jsonReader, kkhVar));
            }
            jsonReader.w();
            z4g.b(arrayList);
        } else {
            arrayList.add(new w4g(cxf.e(jsonReader, fxv.e())));
        }
        return new mx0(arrayList);
    }

    public static xx0<PointF, PointF> b(JsonReader jsonReader, kkh kkhVar) throws IOException {
        jsonReader.g();
        mx0 mx0Var = null;
        jx0 jx0Var = null;
        jx0 jx0Var2 = null;
        boolean z = false;
        while (jsonReader.u0() != JsonReader.Token.END_OBJECT) {
            int C0 = jsonReader.C0(f25012a);
            if (C0 == 0) {
                mx0Var = a(jsonReader, kkhVar);
            } else if (C0 != 1) {
                if (C0 != 2) {
                    jsonReader.D0();
                    jsonReader.E0();
                } else if (jsonReader.u0() == JsonReader.Token.STRING) {
                    jsonReader.E0();
                    z = true;
                } else {
                    jx0Var2 = yx0.e(jsonReader, kkhVar);
                }
            } else if (jsonReader.u0() == JsonReader.Token.STRING) {
                jsonReader.E0();
                z = true;
            } else {
                jx0Var = yx0.e(jsonReader, kkhVar);
            }
        }
        jsonReader.A();
        if (z) {
            kkhVar.a("Lottie doesn't support expressions.");
        }
        if (mx0Var != null) {
            return mx0Var;
        }
        return new rx0(jx0Var, jx0Var2);
    }
}
