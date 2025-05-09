package com.alipay.android.msp.framework.hardwarepay.old.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ValidateDialogProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IHardwarePayDialog f3617a;

    public ValidateDialogProxy(int i, Context context) {
        if (i != 1) {
            this.f3617a = new HardwarePayValidateDialog();
        } else if (a(context)) {
            this.f3617a = new FpFullViewDialog();
        } else {
            this.f3617a = new HardwarePayValidateDialog();
        }
    }

    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else {
            this.f3617a.dismiss(i);
        }
    }

    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        return this.f3617a.isShown();
    }

    public boolean isValidateOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8f28e7", new Object[]{this})).booleanValue();
        }
        return this.f3617a.isValidateOk();
    }

    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else {
            this.f3617a.setAllButtonsGone();
        }
    }

    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        } else {
            this.f3617a.setValidateResult(z);
        }
    }

    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        } else {
            this.f3617a.showAnimation();
        }
    }

    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        return this.f3617a.showDialog(activity, i, str, iDialogActionListener);
    }

    public void showLoadingSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        } else {
            this.f3617a.showLoadingSuccess();
        }
    }

    public void updateMsg(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f3617a.updateMsg(str, i, i2);
        }
    }

    public static boolean a(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            i = JSON.parseObject(PhoneCashierMspEngine.getMspViSec().getFpInfo(context)).getIntValue("type");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            i = -1;
        }
        return i == 0;
    }
}
