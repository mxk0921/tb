package tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class vqu {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1095013018:
                if (str.equals("dimension")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -925155509:
                if (str.equals(TypedValues.Custom.S_REFERENCE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -891985903:
                if (str.equals("string")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (str.equals("float")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1958052158:
                if (str.equals("integer")) {
                    c = 6;
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
                return 905;
            case 1:
                return 906;
            case 2:
                return 903;
            case 3:
                return 904;
            case 4:
                return 902;
            case 5:
                return 901;
            case 6:
                return 900;
            default:
                return -1;
        }
    }
}
