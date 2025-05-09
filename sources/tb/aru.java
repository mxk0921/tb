package tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class aru {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1996906958:
                if (str.equals(TypedValues.TransitionType.S_TRANSITION_FLAGS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1992012396:
                if (str.equals("duration")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1357874275:
                if (str.equals(TypedValues.TransitionType.S_INTERPOLATOR)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1298065308:
                if (str.equals(TypedValues.TransitionType.S_AUTO_TRANSITION)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3707:
                if (str.equals("to")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3151786:
                if (str.equals("from")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1310733335:
                if (str.equals(TypedValues.TransitionType.S_PATH_MOTION_ARC)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1839260940:
                if (str.equals(TypedValues.TransitionType.S_STAGGERED)) {
                    c = 7;
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
                return 707;
            case 1:
                return 700;
            case 2:
                return 705;
            case 3:
                return 704;
            case 4:
                return 702;
            case 5:
                return 701;
            case 6:
                return 509;
            case 7:
                return 706;
            default:
                return -1;
        }
    }

    public static int b(int i) {
        if (i == 509) {
            return 2;
        }
        switch (i) {
            case 700:
                return 2;
            case 701:
            case 702:
                return 8;
            default:
                switch (i) {
                    case 705:
                    case 707:
                        return 8;
                    case 706:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
