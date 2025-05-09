package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nu9 {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f24954a = JsonReader.a.a("ch", "size", "w", "style", "fFamily", "data");
    public static final JsonReader.a b = JsonReader.a.a("shapes");

    public static mu9 a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.g();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f24954a);
            if (C0 == 0) {
                c = jsonReader.i0().charAt(0);
            } else if (C0 == 1) {
                d2 = jsonReader.Z();
            } else if (C0 == 2) {
                d = jsonReader.Z();
            } else if (C0 == 3) {
                str = jsonReader.i0();
            } else if (C0 == 4) {
                str2 = jsonReader.i0();
            } else if (C0 != 5) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                jsonReader.g();
                while (jsonReader.F()) {
                    if (jsonReader.C0(b) != 0) {
                        jsonReader.D0();
                        jsonReader.E0();
                    } else {
                        jsonReader.e();
                        while (jsonReader.F()) {
                            arrayList.add((khp) up4.a(jsonReader, kkhVar));
                        }
                        jsonReader.w();
                    }
                }
                jsonReader.A();
            }
        }
        jsonReader.A();
        return new mu9(arrayList, c, d2, d, str, str2);
    }
}
