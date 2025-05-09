package com.alipay.android.msp.framework.hardwarepay.neo.dialog;

import android.app.Activity;
import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.VerifyEnum;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_CANCEL = 0;
    public static final int ACTION_TO_PWD = 2;

    /* renamed from: a  reason: collision with root package name */
    public final IHardwarePayDialog f3611a;

    public FingerprintDialog(Context context, VerifyEnum verifyEnum) {
        if (a(context)) {
            this.f3611a = new FpFullViewDialog(verifyEnum);
        } else {
            this.f3611a = new FpDefaultDialog(verifyEnum);
        }
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintDialog");
    }

    public static /* synthetic */ IHardwarePayDialog access$000(FingerprintDialog fingerprintDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHardwarePayDialog) ipChange.ipc$dispatch("263c1600", new Object[]{fingerprintDialog});
        }
        return fingerprintDialog.f3611a;
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            this.f3611a.dismiss(0);
        }
    }

    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        return this.f3611a.isShown();
    }

    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else {
            this.f3611a.setAllButtonsGone();
        }
    }

    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        } else {
            this.f3611a.showAnimation();
        }
    }

    public void showDialog(final Activity activity, final String str, final IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FingerprintDialog.access$000(FingerprintDialog.this).showDialog(activity, str, iDialogActionListener);
                    }
                }
            });
        }
    }

    public void updateMsg(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f3611a.updateMsg(str, i, i2);
        }
    }

    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else {
            this.f3611a.dismiss(i);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        int i = -1;
        try {
            i = new JSONObject(PhoneCashierMspEngine.getMspViSec().getFpInfo(context)).optInt("type", -1);
        } catch (Throwable unused) {
        }
        return i == 0;
    }
}
