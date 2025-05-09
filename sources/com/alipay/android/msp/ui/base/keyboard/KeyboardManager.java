package com.alipay.android.msp.ui.base.keyboard;

import android.app.Activity;
import android.content.Context;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class KeyboardManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static KeyboardManager f3726a;

    public static KeyboardManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyboardManager) ipChange.ipc$dispatch("c8a74e86", new Object[0]);
        }
        if (f3726a == null) {
            f3726a = new KeyboardManager();
        }
        return f3726a;
    }

    public void hideKeyboard(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a8da78", new Object[]{this, context});
            return;
        }
        LogUtil.record(1, "", "keyboard-lj", "MspAssistUtil-hideKeyboard-enter");
        try {
            AlipayKeyboard keyboard = com.alipay.android.app.safepaybase.alikeyboard.KeyboardManager.getKeyboard(((Activity) context).getWindow().getDecorView().hashCode());
            if (keyboard != null) {
                LogUtil.record(1, "", "keyboard-lj", "MspAssistUtil-hideKeyboard-hide");
                keyboard.hideKeyboard();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void onConfigurationChanged(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8c94e4", new Object[]{this, context});
            return;
        }
        LogUtil.record(1, "", "KeyboardManager::onConfigurationChanged", "");
        try {
            AlipayKeyboard keyboard = com.alipay.android.app.safepaybase.alikeyboard.KeyboardManager.getKeyboard(((Activity) context).getWindow().getDecorView().hashCode());
            if (keyboard != null) {
                boolean isShowKeyboard = keyboard.isShowKeyboard();
                keyboard.onConfigurationChangedPauseKeyboard();
                if (isShowKeyboard) {
                    keyboard.onConfigurationChangedResumeKeyboard();
                    return;
                }
                return;
            }
            LogUtil.record(2, "", "KeyboardManager::onConfigurationChanged", "keyboard null");
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
