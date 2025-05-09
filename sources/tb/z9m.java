package tb;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z9m {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f32633a = JsonReader.a.a("nm", "sy", AdvertisementOption.PRIORITY_VALID_TIME, "p", "r", "or", "os", "ir", "is", MediaConstant.DEFINITION_HD, "d");

    public static PolystarShape a(JsonReader jsonReader, kkh kkhVar, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        PolystarShape.Type type = null;
        jx0 jx0Var = null;
        xx0<PointF, PointF> xx0Var = null;
        jx0 jx0Var2 = null;
        jx0 jx0Var3 = null;
        jx0 jx0Var4 = null;
        jx0 jx0Var5 = null;
        jx0 jx0Var6 = null;
        boolean z3 = false;
        while (jsonReader.F()) {
            switch (jsonReader.C0(f32633a)) {
                case 0:
                    str = jsonReader.i0();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.c0());
                    break;
                case 2:
                    jx0Var = yx0.f(jsonReader, kkhVar, false);
                    break;
                case 3:
                    xx0Var = nx0.b(jsonReader, kkhVar);
                    break;
                case 4:
                    jx0Var2 = yx0.f(jsonReader, kkhVar, false);
                    break;
                case 5:
                    jx0Var4 = yx0.e(jsonReader, kkhVar);
                    break;
                case 6:
                    jx0Var6 = yx0.f(jsonReader, kkhVar, false);
                    break;
                case 7:
                    jx0Var3 = yx0.e(jsonReader, kkhVar);
                    break;
                case 8:
                    jx0Var5 = yx0.f(jsonReader, kkhVar, false);
                    break;
                case 9:
                    z3 = jsonReader.L();
                    break;
                case 10:
                    if (jsonReader.c0() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                default:
                    jsonReader.D0();
                    jsonReader.E0();
                    break;
            }
        }
        return new PolystarShape(str, type, jx0Var, xx0Var, jx0Var2, jx0Var3, jx0Var4, jx0Var5, jx0Var6, z3, z2);
    }
}
