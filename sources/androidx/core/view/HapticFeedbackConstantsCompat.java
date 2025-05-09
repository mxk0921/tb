package androidx.core.view;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class HapticFeedbackConstantsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;
    public static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;
    public static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface HapticFeedbackFlags {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface HapticFeedbackType {
    }

    private HapticFeedbackConstantsCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r7 != 17) goto L_0x004c;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getFeedbackConstantOrFallback(int r7) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.core.view.HapticFeedbackConstantsCompat.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001e
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r3
            java.lang.String r0 = "c5323ccb"
            java.lang.Object r7 = r2.ipc$dispatch(r0, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L_0x001e:
            r2 = -1
            if (r7 != r2) goto L_0x0022
            return r2
        L_0x0022:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            r5 = 4
            r6 = 6
            if (r3 >= r4) goto L_0x0033
            switch(r7) {
                case 21: goto L_0x0032;
                case 22: goto L_0x0030;
                case 23: goto L_0x0032;
                case 24: goto L_0x0030;
                case 25: goto L_0x002e;
                case 26: goto L_0x0032;
                case 27: goto L_0x0030;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0033
        L_0x002e:
            r7 = 0
            goto L_0x0033
        L_0x0030:
            r7 = 4
            goto L_0x0033
        L_0x0032:
            r7 = 6
        L_0x0033:
            r4 = 30
            if (r3 >= r4) goto L_0x004c
            r4 = 12
            if (r7 == r4) goto L_0x004a
            r4 = 13
            if (r7 == r4) goto L_0x0048
            r4 = 16
            if (r7 == r4) goto L_0x004a
            r1 = 17
            if (r7 == r1) goto L_0x004d
            goto L_0x004c
        L_0x0048:
            r0 = 6
            goto L_0x004d
        L_0x004a:
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = r7
        L_0x004d:
            r7 = 27
            if (r3 >= r7) goto L_0x005c
            r7 = 7
            if (r0 == r7) goto L_0x005d
            r7 = 8
            if (r0 == r7) goto L_0x005d
            r7 = 9
            if (r0 == r7) goto L_0x005d
        L_0x005c:
            r2 = r0
        L_0x005d:
            r7 = 23
            if (r3 >= r7) goto L_0x0063
            if (r2 == r6) goto L_0x0064
        L_0x0063:
            r5 = r2
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(int):int");
    }
}
