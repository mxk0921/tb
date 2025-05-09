package tb;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVStartParams;
import com.loc.at;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ns7 implements z1w<DocumentData> {
    public static final ns7 INSTANCE = new ns7();

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f24921a = JsonReader.a.a("t", "f", "s", at.j, "tr", "lh", RVStartParams.KEY_LANDSCAPE_SHORT, "fc", "sc", "sw", pg1.ATOM_of);

    /* renamed from: b */
    public DocumentData a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.g();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (jsonReader.F()) {
            switch (jsonReader.C0(f24921a)) {
                case 0:
                    str = jsonReader.i0();
                    break;
                case 1:
                    str2 = jsonReader.i0();
                    break;
                case 2:
                    f2 = (float) jsonReader.Z();
                    break;
                case 3:
                    int c0 = jsonReader.c0();
                    DocumentData.Justification justification3 = DocumentData.Justification.CENTER;
                    if (c0 <= justification3.ordinal() && c0 >= 0) {
                        justification2 = DocumentData.Justification.values()[c0];
                        break;
                    } else {
                        justification2 = justification3;
                        break;
                    }
                    break;
                case 4:
                    i = jsonReader.c0();
                    break;
                case 5:
                    f3 = (float) jsonReader.Z();
                    break;
                case 6:
                    f4 = (float) jsonReader.Z();
                    break;
                case 7:
                    i2 = cxf.d(jsonReader);
                    break;
                case 8:
                    i3 = cxf.d(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.Z();
                    break;
                case 10:
                    z = jsonReader.L();
                    break;
                default:
                    jsonReader.D0();
                    jsonReader.E0();
                    break;
            }
        }
        jsonReader.A();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
