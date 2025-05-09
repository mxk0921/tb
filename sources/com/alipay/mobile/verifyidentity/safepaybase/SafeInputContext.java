package com.alipay.mobile.verifyidentity.safepaybase;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.safepaybase.widget.SafeInputWidget;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SafeInputContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SafeInputWidget f4438a;

    public SafeInputContext(Activity activity, boolean z) {
        this.f4438a = new SafeInputWidget(activity, z);
    }

    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
        } else {
            this.f4438a.a();
        }
    }

    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f4438a.f;
    }

    public String getEditContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this});
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        return safeInputWidget.e.a(safeInputWidget.h, safeInputWidget.k, safeInputWidget.l, safeInputWidget.m);
    }

    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        if (safeInputWidget.g) {
            return safeInputWidget.b.getEditText();
        }
        return safeInputWidget.f4443a;
    }

    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        safeInputWidget.l = str;
        safeInputWidget.m = encryptRandomType;
        if (safeInputWidget.g) {
            safeInputWidget.b.setEncryptRandomStringAndType(str, encryptRandomType);
        }
    }

    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        if (!z) {
            safeInputWidget.c.setVisibility(8);
            safeInputWidget.d.setVisibility(8);
        }
    }

    public void setOkButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af3ace", new Object[]{this, str});
            return;
        }
        Button button = this.f4438a.c;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        if (safeInputWidget.g) {
            safeInputWidget.b.setOnClickListener(onClickListener);
        } else {
            safeInputWidget.f4443a.setOnClickListener(onClickListener);
        }
    }

    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        safeInputWidget.i = onConfirmListener;
        if (safeInputWidget.g) {
            safeInputWidget.b.setmSubmitInterface(onConfirmListener);
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        if (safeInputWidget.g) {
            safeInputWidget.b.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            safeInputWidget.j = onFocusChangeListener;
        }
    }

    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        safeInputWidget.k = str;
        if (safeInputWidget.g) {
            safeInputWidget.b.setRsaPublicKey(str);
        }
    }

    public void setTextWatcherListener(TextWatcherListener textWatcherListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff30b6d9", new Object[]{this, textWatcherListener});
            return;
        }
        SafeInputWidget safeInputWidget = this.f4438a;
        if (safeInputWidget.g) {
            safeInputWidget.b.setTextWatcherListener(textWatcherListener);
        } else {
            safeInputWidget.n = textWatcherListener;
        }
    }
}
