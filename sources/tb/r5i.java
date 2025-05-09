package tb;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r5i {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Mask a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        char c;
        char c2;
        jsonReader.g();
        Mask.MaskMode maskMode = null;
        qx0 qx0Var = null;
        lx0 lx0Var = null;
        boolean z = false;
        while (jsonReader.F()) {
            String f0 = jsonReader.f0();
            f0.hashCode();
            switch (f0.hashCode()) {
                case 111:
                    if (f0.equals(o.b)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3588:
                    if (f0.equals(AdvertisementOption.PRIORITY_VALID_TIME)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 104433:
                    if (f0.equals("inv")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3357091:
                    if (f0.equals("mode")) {
                        c = 3;
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
                    lx0Var = yx0.h(jsonReader, kkhVar);
                    break;
                case 1:
                    qx0Var = yx0.k(jsonReader, kkhVar);
                    break;
                case 2:
                    z = jsonReader.L();
                    break;
                case 3:
                    String i0 = jsonReader.i0();
                    i0.hashCode();
                    switch (i0.hashCode()) {
                        case 97:
                            if (i0.equals("a")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 105:
                            if (i0.equals(bmv.MSGTYPE_INTERVAL)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 110:
                            if (i0.equals("n")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 115:
                            if (i0.equals("s")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            continue;
                        case 1:
                            kkhVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            continue;
                        case 2:
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            continue;
                        case 3:
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            continue;
                        default:
                            zhh.b("Unknown mask mode " + f0 + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            continue;
                    }
                default:
                    jsonReader.E0();
                    break;
            }
        }
        jsonReader.A();
        return new Mask(maskMode, qx0Var, lx0Var, z);
    }
}
