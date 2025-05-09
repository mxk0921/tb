package com.alipay.android.msp.ui.widget.input.watcher;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.alipay.android.msp.ui.widget.input.PasswordInputPlugin;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Character;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NormalPasswordTextWatcher implements TextWatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3746a = false;
    public final PasswordInputPlugin b;
    public final EditText c;
    public final int d;

    public NormalPasswordTextWatcher(PasswordInputPlugin passwordInputPlugin) {
        this.b = passwordInputPlugin;
        this.c = (EditText) passwordInputPlugin.getInnerView();
        this.d = passwordInputPlugin.getBusinessId();
    }

    public static String a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc861514", new Object[]{charSequence});
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            Character.UnicodeBlock of = Character.UnicodeBlock.of(charAt);
            if (charAt == 247 || charAt == 65509 || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || of == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
                z = true;
            } else {
                sb.append(charAt);
            }
        }
        if (z) {
            return "";
        }
        return sb.toString();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            return;
        }
        try {
            if (!(this.b == null || this.c == null)) {
                String a2 = a(editable);
                if (this.c == null || TextUtils.equals(a2, editable.toString())) {
                    int length = editable.length();
                    for (int i = 0; i < length; i++) {
                        if (editable.charAt(i) != '*') {
                            this.f3746a = true;
                            editable.replace(i, i + 1, "*");
                        }
                    }
                    return;
                }
                this.c.setText(a2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String a2 = a(charSequence);
        if (!TextUtils.equals(a2, charSequence.toString())) {
            this.c.setText(a2);
            if (TextUtils.isEmpty(a2)) {
                this.b.getPasswordService().clear(this.d);
                return;
            }
            return;
        }
        if (!this.f3746a) {
            try {
                this.b.getPasswordService().onTextChanged(this.d, charSequence.toString(), i, i2, i3);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        this.f3746a = false;
    }
}
