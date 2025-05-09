package com.alipay.mobile.verifyidentity.module.dynamic.helper;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaskHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Dialog f4312a;
    public Activity mActivity;

    public MaskHelper(Activity activity) {
        this.mActivity = activity;
    }

    public static /* synthetic */ Dialog access$000(MaskHelper maskHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("a45b980f", new Object[]{maskHelper});
        }
        return maskHelper.f4312a;
    }

    public static /* synthetic */ Dialog access$002(MaskHelper maskHelper, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("d7bbbf38", new Object[]{maskHelper, dialog});
        }
        maskHelper.f4312a = dialog;
        return dialog;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "MaskHelper";
    }

    public static boolean isSpecialDevice() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7cbd70", new Object[0])).booleanValue();
        }
        String str2 = Build.MANUFACTURER;
        if (!(str2 == null || (str = Build.MODEL) == null)) {
            String lowerCase = str2.toLowerCase();
            String lowerCase2 = str.toLowerCase();
            if (lowerCase.contains("lenovo") && lowerCase2.contains("a820t")) {
                return true;
            }
            if (lowerCase.contains("meizu") && lowerCase2.contains("m040")) {
                return true;
            }
            if (lowerCase.contains("vivo") && lowerCase2.contains("y11")) {
                return true;
            }
        }
        return false;
    }

    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
        } else {
            this.mActivity.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.helper.MaskHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (MaskHelper.access$000(MaskHelper.this) == null) {
                        MaskHelper.access$002(MaskHelper.this, new Dialog(MaskHelper.this.mActivity, R.style.VITransparentDialog));
                        if (MaskHelper.isSpecialDevice()) {
                            MaskHelper.access$000(MaskHelper.this).getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        }
                    }
                    try {
                        MaskHelper.access$000(MaskHelper.this).show();
                        MaskHelper.access$000(MaskHelper.this).setCanceledOnTouchOutside(false);
                        MaskHelper.access$000(MaskHelper.this).setCancelable(false);
                    } catch (Exception e) {
                        VerifyLogCat.w(MaskHelper.access$100(), "addMaskView FAILED! \n", e);
                    }
                }
            });
        }
    }

    public void removeMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee44a5c", new Object[]{this});
        } else {
            this.mActivity.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.helper.MaskHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MaskHelper.access$000(MaskHelper.this) != null) {
                        try {
                            MaskHelper.access$000(MaskHelper.this).dismiss();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}
