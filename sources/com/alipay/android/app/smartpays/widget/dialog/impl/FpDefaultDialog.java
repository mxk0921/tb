package com.alipay.android.app.smartpays.widget.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
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
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.widget.dialog.DismissCatchDialog;
import com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener;
import com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpDefaultDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IResourceLoader f3504a;
    public TextView b;
    public IDialogActionListener c;
    public DismissCatchDialog d;
    public ImageView e;
    public Button f;
    public Button g;
    public View h;
    public View i;
    public boolean j;
    public final VerifyEnum k;

    public FpDefaultDialog() {
        this.j = false;
        this.k = VerifyEnum.OPEN;
    }

    public static /* synthetic */ Dialog access$000(FpDefaultDialog fpDefaultDialog, Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("4d25a185", new Object[]{fpDefaultDialog, activity, str, iDialogActionListener});
        }
        return fpDefaultDialog.a(activity, str, iDialogActionListener);
    }

    public static /* synthetic */ boolean access$100(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("989d1081", new Object[]{fpDefaultDialog})).booleanValue();
        }
        return fpDefaultDialog.j;
    }

    public static /* synthetic */ IDialogActionListener access$200(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogActionListener) ipChange.ipc$dispatch("789f4f0a", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.c;
    }

    public static /* synthetic */ TextView access$300(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c24d2af", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.b;
    }

    public static /* synthetic */ DismissCatchDialog access$400(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DismissCatchDialog) ipChange.ipc$dispatch("cc470df6", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.d;
    }

    public static /* synthetic */ Button access$500(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("4f5042ad", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.f;
    }

    public static /* synthetic */ Button access$600(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("167f8ecc", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.g;
    }

    public static /* synthetic */ View access$700(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("24aa9939", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.h;
    }

    public static /* synthetic */ View access$800(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f46accd8", new Object[]{fpDefaultDialog});
        }
        return fpDefaultDialog.i;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c566ed7", new Object[]{this, context});
            return;
        }
        this.j = true;
        if (this.d != null) {
            try {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FpDefaultDialog.access$400(FpDefaultDialog.this).dismiss();
                        } catch (Throwable th) {
                            LogUtils.printExceptionStackTrace(th);
                        }
                    }
                });
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        DismissCatchDialog dismissCatchDialog = this.d;
        if (dismissCatchDialog != null) {
            return dismissCatchDialog.isShowing();
        }
        return false;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else if (this.d != null && (button = this.f) != null && this.g != null && this.h != null && this.i != null) {
            button.post(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.access$500(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$600(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$700(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$800(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.access$400(FpDefaultDialog.this).setCancelable(false);
                }
            });
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setResourceLoader(IResourceLoader iResourceLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13b031e", new Object[]{this, iResourceLoader});
        } else {
            this.f3504a = iResourceLoader;
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
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
        this.e.startAnimation(animationSet);
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void showDialog(final Activity activity, final String str, final IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61f5d8", new Object[]{this, activity, str, iDialogActionListener});
            return;
        }
        try {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FpDefaultDialog.access$000(FpDefaultDialog.this, activity, str, iDialogActionListener);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("action", "FpDefaultDialog");
            SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b != null && !TextUtils.isEmpty(str)) {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.access$300(FpDefaultDialog.this).setText(str);
                    FpDefaultDialog.access$300(FpDefaultDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    public FpDefaultDialog(VerifyEnum verifyEnum) {
        this.j = false;
        this.k = verifyEnum;
    }

    public final Dialog a(final Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("d98a75f7", new Object[]{this, activity, str, iDialogActionListener});
        }
        if (activity == null) {
            return null;
        }
        this.c = iDialogActionListener;
        this.j = false;
        this.d = new DismissCatchDialog(activity);
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(this.f3504a.getLayoutId("safepay_fp_dialog_layout"), (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            this.b = (TextView) linearLayout.findViewById(this.f3504a.getId("safepay_fp_dialog_tips"));
            this.e = (ImageView) linearLayout.findViewById(this.f3504a.getId("safepay_fp_dialog_icon"));
            this.h = linearLayout.findViewById(this.f3504a.getId("safepay_fp_dialog_spliter"));
            this.i = linearLayout.findViewById(this.f3504a.getId("safepay_fp_dialog_divider"));
            Button button = (Button) linearLayout.findViewById(this.f3504a.getId("safepay_fp_dialog_cancel"));
            this.f = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!FpDefaultDialog.access$100(FpDefaultDialog.this)) {
                        if (FpDefaultDialog.access$200(FpDefaultDialog.this) != null) {
                            FpDefaultDialog.access$200(FpDefaultDialog.this).onAction(0);
                        }
                        FpDefaultDialog.this.dismiss(activity);
                    }
                }
            });
            Button button2 = (Button) linearLayout.findViewById(this.f3504a.getId("safepay_fp_dialog_pwd"));
            this.g = button2;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!FpDefaultDialog.access$100(FpDefaultDialog.this)) {
                        if (FpDefaultDialog.access$200(FpDefaultDialog.this) != null) {
                            FpDefaultDialog.access$200(FpDefaultDialog.this).onAction(2);
                        }
                        FpDefaultDialog.this.dismiss(activity);
                    }
                }
            });
            if (this.k == VerifyEnum.OPEN) {
                this.g.setVisibility(8);
                this.i.setVisibility(8);
            } else {
                this.g.setVisibility(0);
                this.i.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                this.b.setText(this.f3504a.getStringId("safepay_fp_open"));
            } else {
                this.b.setText(str);
            }
            this.d.requestWindowFeature(1);
            this.d.setContentView(linearLayout);
            this.d.setCancelable(false);
            this.d.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    }
                }
            });
            this.d.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    }
                }
            });
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    this.d.getWindow().getDecorView().setForceDarkAllowed(false);
                }
            } catch (Throwable unused) {
            }
            this.d.show();
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.DEFAULT_SHOW_FP_DIALOG_EX, e);
        }
        LogUtils.record(2, "HardwarePayValidateDialog::showDialog", "HardwarePayValidateDialog msg:" + str);
        return this.d;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = true;
        if (this.d != null) {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FpDefaultDialog.access$400(FpDefaultDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtils.printExceptionStackTrace(e);
                    }
                }
            }, i);
        }
    }
}
