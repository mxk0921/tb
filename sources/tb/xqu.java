package tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class xqu {
    public static int a(String str) {
        str.hashCode();
        if (!str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            return !str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION) ? -1 : 601;
        }
        return 600;
    }

    public static int b(int i) {
        if (i == 600) {
            return 2;
        }
        if (i != 601) {
            return -1;
        }
        return 1;
    }
}
