package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecureEditText extends EditText {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SecureEditText(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(SecureEditText secureEditText, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/SecureEditText");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f78048", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b73e49", new Object[]{this, accessibilityEvent});
        }
    }

    public SecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
