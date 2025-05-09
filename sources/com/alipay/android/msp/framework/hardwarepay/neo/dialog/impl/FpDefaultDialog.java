package com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpDefaultDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f3612a;
    public IDialogActionListener b;
    public Dialog c;
    public ImageView d;
    public Button e;
    public Button f;
    public View g;
    public View h;
    public boolean i;
    public final VerifyEnum j;

    public FpDefaultDialog() {
        this.i = false;
        this.j = VerifyEnum.OPEN;
    }

    public static /* synthetic */ boolean access$000(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dea27986", new Object[]{fpDefaultDialog})).booleanValue();
        }
        return fpDefaultDialog.i;
    }

    public static /* synthetic */ IDialogActionListener access$100(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogActionListener) ipChange.ipc$dispatch("40b2093b", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.b;
    }

    public static /* synthetic */ TextView access$200(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("88afb0f8", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.f3612a;
    }

    public static /* synthetic */ Button access$300(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("822c6db9", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.e;
    }

    public static /* synthetic */ Button access$400(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("c257547a", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.f;
    }

    public static /* synthetic */ View access$500(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2c5aa189", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.g;
    }

    public static /* synthetic */ View access$600(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fc110ca", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.h;
    }

    public static /* synthetic */ Dialog access$700(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("c7855fe6", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.c;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = true;
        Dialog dialog = this.c;
        if (dialog != null && dialog.isShowing()) {
            if (i > 0) {
                this.f3612a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (FpDefaultDialog.access$700(FpDefaultDialog.this) != null && FpDefaultDialog.access$700(FpDefaultDialog.this).isShowing()) {
                                FpDefaultDialog.access$700(FpDefaultDialog.this).dismiss();
                            }
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                }, i);
            } else {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (FpDefaultDialog.access$700(FpDefaultDialog.this) != null && FpDefaultDialog.access$700(FpDefaultDialog.this).isShowing()) {
                                FpDefaultDialog.access$700(FpDefaultDialog.this).dismiss();
                            }
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                });
            }
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.c;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isValidateOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8f28e7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else if (this.c != null && (button = this.e) != null && this.f != null && this.g != null && this.h != null) {
            button.post(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.access$300(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$400(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$500(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$600(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$700(FpDefaultDialog.this).setCancelable(false);
                }
            });
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -0.5f, 1, 0.5f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(60L);
        translateAnimation.setRepeatCount(2);
        translateAnimation.setRepeatMode(2);
        animationSet.addAnimation(translateAnimation);
        this.d.startAnimation(animationSet);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        return null;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showLoadingSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.f3612a != null && !TextUtils.isEmpty(str)) {
            this.f3612a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.access$200(FpDefaultDialog.this).setText(str);
                    FpDefaultDialog.access$200(FpDefaultDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        } else if (activity != null) {
            this.b = iDialogActionListener;
            this.i = false;
            this.c = new Dialog(activity);
            try {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.flybird_hdpay_dialog_layout, (ViewGroup) null);
                linearLayout.requestFocus();
                linearLayout.requestFocusFromTouch();
                this.f3612a = (TextView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_tips);
                this.d = (ImageView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_icon);
                this.g = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_spliter);
                this.h = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_divider);
                Button button = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_cancel);
                this.e = button;
                button.setText(LanguageHelper.localizedStringForKey("mini_cancel", activity.getString(R.string.mini_cancel), new Object[0]));
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (!FpDefaultDialog.access$000(FpDefaultDialog.this)) {
                            if (FpDefaultDialog.access$100(FpDefaultDialog.this) != null) {
                                FpDefaultDialog.access$100(FpDefaultDialog.this).onDialogAction(0);
                            }
                            FpDefaultDialog.this.dismiss(0);
                        }
                    }
                });
                Button button2 = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_pwd);
                this.f = button2;
                button2.setText(LanguageHelper.localizedStringForKey("mini_input_pwd", activity.getString(R.string.mini_input_pwd), new Object[0]));
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (!FpDefaultDialog.access$000(FpDefaultDialog.this)) {
                            if (FpDefaultDialog.access$100(FpDefaultDialog.this) != null) {
                                FpDefaultDialog.access$100(FpDefaultDialog.this).onDialogAction(2);
                            }
                            FpDefaultDialog.this.dismiss(0);
                        }
                    }
                });
                this.d.setBackgroundResource(R.drawable.alipay_msp_mini_finger);
                if (this.j == VerifyEnum.OPEN) {
                    this.f.setVisibility(8);
                    this.h.setVisibility(8);
                } else {
                    this.f.setVisibility(0);
                    this.h.setVisibility(0);
                }
                if (TextUtils.isEmpty(str)) {
                    this.f3612a.setText(LanguageHelper.localizedStringForKey("flybird_fp_open", activity.getString(R.string.flybird_fp_open), new Object[0]));
                } else {
                    this.f3612a.setText(str);
                }
                this.c.requestWindowFeature(1);
                this.c.setContentView(linearLayout);
                this.c.setCancelable(false);
                this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.c.show();
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public FpDefaultDialog(VerifyEnum verifyEnum) {
        this.i = false;
        this.j = verifyEnum;
        EventLogUtil.logPayEvent("104851", "content_type", "FpDefaultDialog");
    }
}
