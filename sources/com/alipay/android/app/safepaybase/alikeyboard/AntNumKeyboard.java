package com.alipay.android.app.safepaybase.alikeyboard;

import android.content.Context;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AntNumKeyboard extends AbstractKeyboard {
    public static final int FLAG_FLOAT = 3;
    public static final int FLAG_IDCARD = 2;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PHONE = 1;
    public static final int FLAG_SPWD = 4;
    public int mFlag;

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener) {
        this(context, onKeyboardListener, 0);
    }

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener, int i) {
        this(context, onKeyboardListener, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AntNumKeyboard(final android.content.Context r11, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener r12, int r13, boolean r14) {
        /*
            r10 = this;
            r10.<init>()
            r10.mFlag = r13
            r10.onKeyboardListener = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "flag: "
            r12.<init>(r0)
            r12.append(r13)
            java.lang.String r0 = ", showConfirm: "
            r12.append(r0)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r0 = 2
            java.lang.String r1 = "AntNumKeyboard::init"
            com.alipay.android.app.safepaylog.utils.LogUtils.record(r0, r1, r12)
            r12 = 4
            r1 = 1
            r2 = 3
            if (r13 == 0) goto L_0x002e
            if (r13 == r1) goto L_0x0034
            if (r13 == r0) goto L_0x0032
            if (r13 == r2) goto L_0x0030
        L_0x002e:
            r6 = 3
            goto L_0x0035
        L_0x0030:
            r6 = 1
            goto L_0x0035
        L_0x0032:
            r6 = 2
            goto L_0x0035
        L_0x0034:
            r6 = 4
        L_0x0035:
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r0 = new com.alipay.mobile.antui.keyboard.AUNumberKeyboardView
            r7 = r14 ^ 1
            com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$1 r9 = new com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$1
            r9.<init>()
            r5 = 0
            r8 = 2
            r3 = r0
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.keyboardView = r0
            boolean r14 = com.alipay.android.app.base.SPTaskHelper.DEBUG
            if (r14 == 0) goto L_0x005c
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r14.<init>(r0)
            com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$2 r0 = new com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$2
            r0.<init>()
            r14.post(r0)
        L_0x005c:
            if (r12 != r13) goto L_0x006a
            android.view.ViewGroup r11 = r10.keyboardView     // Catch: all -> 0x0066
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r11 = (com.alipay.mobile.antui.keyboard.AUNumberKeyboardView) r11     // Catch: all -> 0x0066
            r11.hideTopbar(r1)     // Catch: all -> 0x0066
            return
        L_0x0066:
            r11 = move-exception
            com.alipay.android.app.safepaylog.utils.LogUtils.printExceptionStackTrace(r11)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard.<init>(android.content.Context, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener, int, boolean):void");
    }
}
