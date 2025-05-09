package com.alipay.android.msp.framework.hardwarepay.old.dialog.impl;

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
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.widget.CustomProgressWheel;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HardwarePayValidateDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f3618a;
    public IDialogActionListener b;
    public Dialog c;
    public boolean d;
    public boolean e;
    public ImageView f;
    public CustomProgressWheel g;
    public Button h;
    public Button i;
    public View j;
    public View k;
    public boolean l = false;
    public boolean m = false;

    public static /* synthetic */ IDialogActionListener access$000(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogActionListener) ipChange.ipc$dispatch("53b209ec", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.b;
    }

    public static /* synthetic */ boolean access$100(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43bb70f9", new Object[]{hardwarePayValidateDialog})).booleanValue();
        }
        return hardwarePayValidateDialog.l;
    }

    public static /* synthetic */ View access$1000(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e698e65", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.j;
    }

    public static /* synthetic */ boolean access$102(HardwarePayValidateDialog hardwarePayValidateDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d333c7c1", new Object[]{hardwarePayValidateDialog, new Boolean(z)})).booleanValue();
        }
        hardwarePayValidateDialog.l = z;
        return z;
    }

    public static /* synthetic */ View access$1100(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c1e2a066", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.k;
    }

    public static /* synthetic */ Dialog access$200(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("28cb3599", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.c;
    }

    public static /* synthetic */ boolean access$300(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9447f17b", new Object[]{hardwarePayValidateDialog})).booleanValue();
        }
        return hardwarePayValidateDialog.m;
    }

    public static /* synthetic */ boolean access$400(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc8e31bc", new Object[]{hardwarePayValidateDialog})).booleanValue();
        }
        return hardwarePayValidateDialog.e;
    }

    public static /* synthetic */ boolean access$402(HardwarePayValidateDialog hardwarePayValidateDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74b91f5e", new Object[]{hardwarePayValidateDialog, new Boolean(z)})).booleanValue();
        }
        hardwarePayValidateDialog.e = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4d471fd", new Object[]{hardwarePayValidateDialog})).booleanValue();
        }
        return hardwarePayValidateDialog.d;
    }

    public static /* synthetic */ TextView access$600(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a09eccae", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.f3618a;
    }

    public static /* synthetic */ CustomProgressWheel access$700(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomProgressWheel) ipChange.ipc$dispatch("7f3df579", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.g;
    }

    public static /* synthetic */ Button access$800(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("cac6b30", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.h;
    }

    public static /* synthetic */ Button access$900(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("595a94b1", new Object[]{hardwarePayValidateDialog});
        }
        return hardwarePayValidateDialog.i;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        Dialog dialog = this.c;
        if (dialog != null && dialog.isShowing()) {
            this.m = true;
            if (i > 0) {
                this.f3618a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (HardwarePayValidateDialog.access$200(HardwarePayValidateDialog.this) != null && HardwarePayValidateDialog.access$200(HardwarePayValidateDialog.this).isShowing()) {
                                HardwarePayValidateDialog.access$200(HardwarePayValidateDialog.this).dismiss();
                            }
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                }, i);
                return;
            }
            try {
                this.c.dismiss();
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
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
        return this.d;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else if (this.c != null && this.h != null && this.i != null && this.j != null && this.k != null) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HardwarePayValidateDialog.access$800(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.access$900(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.access$1000(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.access$1100(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.access$200(HardwarePayValidateDialog.this).setCancelable(false);
                }
            });
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
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
        this.f.startAnimation(animationSet);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showLoadingSuccess() {
        CustomProgressWheel customProgressWheel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        } else if (this.c != null && (customProgressWheel = this.g) != null) {
            customProgressWheel.post(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (HardwarePayValidateDialog.access$700(HardwarePayValidateDialog.this).isSpinning()) {
                        HardwarePayValidateDialog.access$700(HardwarePayValidateDialog.this).stopSpinning();
                        HardwarePayValidateDialog.access$700(HardwarePayValidateDialog.this).beginDrawTick();
                        HardwarePayValidateDialog.access$700(HardwarePayValidateDialog.this).start();
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.f3618a != null && !TextUtils.isEmpty(str)) {
            this.f3618a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HardwarePayValidateDialog.access$600(HardwarePayValidateDialog.this).setText(str);
                    HardwarePayValidateDialog.access$600(HardwarePayValidateDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        if (activity == null) {
            return null;
        }
        this.b = iDialogActionListener;
        this.l = false;
        this.c = new Dialog(activity);
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.flybird_hdpay_dialog_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            this.f3618a = (TextView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_tips);
            this.f = (ImageView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_icon);
            this.j = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_spliter);
            this.k = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_divider);
            this.g = (CustomProgressWheel) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_loading);
            Button button = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_cancel);
            this.h = button;
            button.setText(LanguageHelper.localizedStringForKey("mini_cancel", activity.getString(R.string.mini_cancel), new Object[0]));
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this) != null) {
                        HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this).onDialogAction(0);
                    }
                    HardwarePayValidateDialog.access$102(HardwarePayValidateDialog.this, true);
                    HardwarePayValidateDialog.access$200(HardwarePayValidateDialog.this).dismiss();
                }
            });
            this.e = false;
            Button button2 = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_pwd);
            this.i = button2;
            button2.setText(LanguageHelper.localizedStringForKey("mini_input_pwd", activity.getString(R.string.mini_input_pwd), new Object[0]));
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this) != null && !HardwarePayValidateDialog.access$300(HardwarePayValidateDialog.this)) {
                        HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this).onDialogAction(2);
                    }
                    HardwarePayValidateDialog.access$402(HardwarePayValidateDialog.this, true);
                    HardwarePayValidateDialog.access$200(HardwarePayValidateDialog.this).dismiss();
                }
            });
            if (i == 1) {
                this.f.setBackgroundResource(R.drawable.alipay_msp_mini_finger);
                if (TextUtils.isEmpty(str)) {
                    this.f3618a.setText(LanguageHelper.localizedStringForKey("flybird_fp_tips", activity.getString(R.string.flybird_fp_tips), new Object[0]));
                } else {
                    this.f3618a.setText(str);
                }
            } else if (i == 2) {
                EventLogUtil.SpecificEvent.wearableUsage("vaDialogCase");
                this.f.setBackgroundResource(R.drawable.mini_bracelet);
                this.f.setVisibility(8);
                this.g.setVisibility(0);
                this.g.spin();
                this.g.start();
                if (TextUtils.isEmpty(str)) {
                    this.f3618a.setText(LanguageHelper.localizedStringForKey("flybird_bl_tips", activity.getString(R.string.flybird_bl_tips), new Object[0]));
                } else {
                    this.f3618a.setText(str);
                }
            } else if (i == 100) {
                this.f.setBackgroundResource(R.drawable.alipay_msp_mini_finger);
                this.i.setVisibility(8);
                this.k.setVisibility(8);
                if (TextUtils.isEmpty(str)) {
                    this.f3618a.setText(LanguageHelper.localizedStringForKey("flybird_fp_open", activity.getString(R.string.flybird_fp_open), new Object[0]));
                } else {
                    this.f3618a.setText(str);
                }
            }
            this.c.requestWindowFeature(1);
            this.c.setContentView(linearLayout);
            this.c.setCancelable(false);
            this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    } else if (!HardwarePayValidateDialog.access$100(HardwarePayValidateDialog.this)) {
                        if (HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this) != null && HardwarePayValidateDialog.access$500(HardwarePayValidateDialog.this)) {
                            HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this).onDialogAction(100);
                        } else if (HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this) != null && !HardwarePayValidateDialog.access$400(HardwarePayValidateDialog.this)) {
                            HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this).onDialogAction(1);
                        }
                    }
                }
            });
            this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else if (!HardwarePayValidateDialog.access$100(HardwarePayValidateDialog.this)) {
                        if (HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this) != null && HardwarePayValidateDialog.access$500(HardwarePayValidateDialog.this)) {
                            HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this).onDialogAction(100);
                        } else if (HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this) != null && !HardwarePayValidateDialog.access$400(HardwarePayValidateDialog.this)) {
                            HardwarePayValidateDialog.access$000(HardwarePayValidateDialog.this).onDialogAction(1);
                        }
                    }
                }
            });
            this.c.show();
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, e.getClass().getName(), e);
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "HardwarePayValidateDialog.showDialog", "HardwarePayValidateDialog hardwarePayType:" + i + " msg:" + str);
        return this.c;
    }
}
