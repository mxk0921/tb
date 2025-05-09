package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.loc.at;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z4g {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f32524a = JsonReader.a.a(at.k);

    public static <T> List<w4g<T>> a(JsonReader jsonReader, kkh kkhVar, float f, z1w<T> z1wVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.u0() == JsonReader.Token.STRING) {
            kkhVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.g();
        while (jsonReader.F()) {
            if (jsonReader.C0(f32524a) != 0) {
                jsonReader.E0();
            } else if (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.e();
                if (jsonReader.u0() == JsonReader.Token.NUMBER) {
                    arrayList.add(y4g.c(jsonReader, kkhVar, f, z1wVar, false, z));
                } else {
                    while (jsonReader.F()) {
                        arrayList.add(y4g.c(jsonReader, kkhVar, f, z1wVar, true, z));
                    }
                }
                jsonReader.w();
            } else {
                arrayList.add(y4g.c(jsonReader, kkhVar, f, z1wVar, false, z));
            }
        }
        jsonReader.A();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends w4g<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            w4g w4gVar = (w4g) list.get(i2);
            i2++;
            w4g w4gVar2 = (w4g) list.get(i2);
            w4gVar.h = Float.valueOf(w4gVar2.g);
            if (w4gVar.c == null && (t = w4gVar2.b) != null) {
                w4gVar.c = t;
                if (w4gVar instanceof dul) {
                    ((dul) w4gVar).i();
                }
            }
        }
        w4g w4gVar3 = (w4g) list.get(i);
        if ((w4gVar3.b == null || w4gVar3.c == null) && list.size() > 1) {
            list.remove(w4gVar3);
        }
    }
}
