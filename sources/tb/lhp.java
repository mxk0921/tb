package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lhp {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f23345a = JsonReader.a.a("nm", MediaConstant.DEFINITION_HD, AdvanceSetting.NETWORK_TYPE);

    public static khp a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f23345a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                z = jsonReader.L();
            } else if (C0 != 2) {
                jsonReader.E0();
            } else {
                jsonReader.e();
                while (jsonReader.F()) {
                    tp4 a2 = up4.a(jsonReader, kkhVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                jsonReader.w();
            }
        }
        return new khp(str, arrayList, z);
    }
}
