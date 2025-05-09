package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import com.alipay.android.app.safepaybase.alikeyboard.AbstractKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AntNumKeyboard extends AbstractKeyboard {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_FLOAT = 3;
    public static final int FLAG_IDCARD = 2;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PHONE = 1;
    public static final int FLAG_SPWD = 4;
    public int mFlag;

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener) {
        this(context, onKeyboardListener, 0);
    }

    public static /* synthetic */ void access$000(AntNumKeyboard antNumKeyboard, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52ebe9f", new Object[]{antNumKeyboard, str});
        } else {
            antNumKeyboard.onInput(str);
        }
    }

    public static /* synthetic */ void access$100(AntNumKeyboard antNumKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d126f5f4", new Object[]{antNumKeyboard});
        } else {
            antNumKeyboard.onDel();
        }
    }

    public static /* synthetic */ void access$200(AntNumKeyboard antNumKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1a5bd3", new Object[]{antNumKeyboard});
        } else {
            antNumKeyboard.onOK();
        }
    }

    public static /* synthetic */ void access$300(AntNumKeyboard antNumKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0dc1b2", new Object[]{antNumKeyboard});
        } else {
            antNumKeyboard.onClose();
        }
    }

    public static /* synthetic */ Object ipc$super(AntNumKeyboard antNumKeyboard, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/AntNumKeyboard");
    }

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener, int i) {
        this(context, onKeyboardListener, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AntNumKeyboard(android.content.Context r11, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener r12, int r13, boolean r14) {
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
            java.lang.String r0 = "AntNumKeyboard::init"
            com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils.a(r0, r12)
            r12 = 4
            r0 = 1
            r1 = 3
            if (r13 == 0) goto L_0x002e
            if (r13 == r0) goto L_0x0034
            r2 = 2
            if (r13 == r2) goto L_0x0032
            if (r13 == r1) goto L_0x0030
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
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r1 = new com.alipay.mobile.antui.keyboard.AUNumberKeyboardView
            r7 = r14 ^ 1
            com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard$1 r9 = new com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard$1
            r9.<init>()
            r5 = 0
            r8 = 2
            r3 = r1
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.keyboardView = r1
            if (r12 != r13) goto L_0x0051
            r1.hideTopbar(r0)     // Catch: all -> 0x004d
            return
        L_0x004d:
            r11 = move-exception
            com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils.a(r11)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard.<init>(android.content.Context, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener, int, boolean):void");
    }
}
