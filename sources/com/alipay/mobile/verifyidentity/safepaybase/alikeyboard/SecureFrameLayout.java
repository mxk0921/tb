package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecureFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SendAccessiBilityEventListener mSabEventListener = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface SendAccessiBilityEventListener {
        boolean handleAccessiBilityEvent(SecureFrameLayout secureFrameLayout, int i);
    }

    public SecureFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(SecureFrameLayout secureFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1246282167) {
            super.sendAccessibilityEventUnchecked((AccessibilityEvent) objArr[0]);
            return null;
        } else if (hashCode == 2046263368) {
            super.sendAccessibilityEvent(((Number) objArr[0]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/safepaybase/alikeyboard/SecureFrameLayout");
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f78048", new Object[]{this, new Integer(i)});
            return;
        }
        SendAccessiBilityEventListener sendAccessiBilityEventListener = this.mSabEventListener;
        if (sendAccessiBilityEventListener != null) {
            z = sendAccessiBilityEventListener.handleAccessiBilityEvent(this, i);
        }
        if (!z) {
            super.sendAccessibilityEvent(i);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b73e49", new Object[]{this, accessibilityEvent});
            return;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 65536 || eventType == 32768) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setSendAccessiBilityEventListener(SendAccessiBilityEventListener sendAccessiBilityEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6e7a95", new Object[]{this, sendAccessiBilityEventListener});
        } else {
            this.mSabEventListener = sendAccessiBilityEventListener;
        }
    }

    public SecureFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
