package com.alipay.android.msp.framework.hardwarepay.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.VerifyEnum;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpFullViewDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Dialog f3609a;
    public TextView b;
    public IDialogActionListener c;
    public Rect d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public TextView j;
    public final VerifyEnum k;

    public FpFullViewDialog() {
        this.k = null;
    }

    public static boolean a() {
        String lowerCase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        try {
            lowerCase = Build.MANUFACTURER.toLowerCase();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (!TextUtils.equals(lowerCase, "oppo")) {
            return TextUtils.equals(lowerCase, DeviceProperty.ALIAS_ONEPLUS);
        }
        return true;
    }

    public static /* synthetic */ boolean access$000(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6c956e2", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.h;
    }

    public static /* synthetic */ boolean access$002(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("474429f8", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.h = z;
        return z;
    }

    public static /* synthetic */ IDialogActionListener access$100(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogActionListener) ipChange.ipc$dispatch("70d167d7", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.c;
    }

    public static /* synthetic */ boolean access$200(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e25ac64", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.f;
    }

    public static /* synthetic */ boolean access$300(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61d3d725", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.g;
    }

    public static /* synthetic */ boolean access$302(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d89b215", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.g = z;
        return z;
    }

    public static /* synthetic */ TextView access$400(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("cb7ba456", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.b;
    }

    public static /* synthetic */ boolean access$500(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9302ca7", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.e;
    }

    public static /* synthetic */ void access$600(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eed47f0", new Object[]{fpFullViewDialog, new Boolean(z)});
        } else {
            fpFullViewDialog.d(z);
        }
    }

    public static /* synthetic */ Dialog access$700(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("3245884a", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.f3609a;
    }

    public static /* synthetic */ boolean access$800(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("643aacea", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.i;
    }

    public final void d(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.f3609a;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            View decorView = window.getDecorView();
            if (!z) {
                decorView.setSystemUiVisibility(4098);
            } else {
                decorView.setSystemUiVisibility(0);
            }
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        Dialog dialog = this.f3609a;
        if (dialog != null && dialog.isShowing()) {
            this.i = true;
            if (i > 0) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (FpFullViewDialog.access$500(FpFullViewDialog.this)) {
                                FpFullViewDialog.access$600(FpFullViewDialog.this, true);
                            }
                            FpFullViewDialog.access$700(FpFullViewDialog.this).dismiss();
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                }, i);
                return;
            }
            try {
                this.f3609a.dismiss();
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
        Dialog dialog = this.f3609a;
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
        return this.f;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        c(activity);
        b(activity, str, iDialogActionListener);
        this.f3609a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                } else if (!FpFullViewDialog.access$000(FpFullViewDialog.this)) {
                    if (FpFullViewDialog.access$100(FpFullViewDialog.this) != null && FpFullViewDialog.access$200(FpFullViewDialog.this)) {
                        FpFullViewDialog.access$100(FpFullViewDialog.this).onDialogAction(100);
                    } else if (FpFullViewDialog.access$100(FpFullViewDialog.this) != null && !FpFullViewDialog.access$300(FpFullViewDialog.this)) {
                        FpFullViewDialog.access$100(FpFullViewDialog.this).onDialogAction(1);
                    }
                }
            }
        });
        this.f3609a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                } else if (!FpFullViewDialog.access$000(FpFullViewDialog.this)) {
                    if (FpFullViewDialog.access$100(FpFullViewDialog.this) != null && FpFullViewDialog.access$200(FpFullViewDialog.this)) {
                        FpFullViewDialog.access$100(FpFullViewDialog.this).onDialogAction(100);
                    } else if (FpFullViewDialog.access$100(FpFullViewDialog.this) != null && !FpFullViewDialog.access$300(FpFullViewDialog.this)) {
                        FpFullViewDialog.access$100(FpFullViewDialog.this).onDialogAction(1);
                    }
                }
            }
        });
        this.f3609a.show();
        return this.f3609a;
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
        } else if (this.b != null && !TextUtils.isEmpty(str)) {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpFullViewDialog.access$400(FpFullViewDialog.this).setText(str);
                    FpFullViewDialog.access$400(FpFullViewDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    public final void c(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        Throwable th;
        JSONObject optJSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            optJSONObject = new JSONObject(PhoneCashierMspEngine.getMspViSec().getFpInfo(context)).optJSONObject("fullView");
            i4 = optJSONObject.optInt("startX", 0);
            try {
                i3 = optJSONObject.optInt("startY", 0);
                try {
                    i2 = optJSONObject.optInt("width", 0);
                } catch (Throwable th2) {
                    th = th2;
                    i2 = 0;
                    i = 0;
                    LogUtil.printExceptionStackTrace(th);
                    this.d = new Rect(i4, i3, i2 + i4, i + i3);
                    this.e = z;
                }
            } catch (Throwable th3) {
                th = th3;
                i3 = 0;
                i2 = 0;
                i = 0;
                LogUtil.printExceptionStackTrace(th);
                this.d = new Rect(i4, i3, i2 + i4, i + i3);
                this.e = z;
            }
        } catch (Throwable th4) {
            th = th4;
            i4 = 0;
        }
        try {
            i = optJSONObject.optInt("height", 0);
            try {
                z = optJSONObject.optBoolean("navConflict", false);
            } catch (Throwable th5) {
                th = th5;
                LogUtil.printExceptionStackTrace(th);
                this.d = new Rect(i4, i3, i2 + i4, i + i3);
                this.e = z;
            }
        } catch (Throwable th6) {
            th = th6;
            i = 0;
            LogUtil.printExceptionStackTrace(th);
            this.d = new Rect(i4, i3, i2 + i4, i + i3);
            this.e = z;
        }
        this.d = new Rect(i4, i3, i2 + i4, i + i3);
        this.e = z;
    }

    public FpFullViewDialog(VerifyEnum verifyEnum) {
        this.k = verifyEnum;
    }

    public final void b(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2a4784", new Object[]{this, activity, str, iDialogActionListener});
            return;
        }
        this.c = iDialogActionListener;
        Dialog dialog = new Dialog(activity);
        this.f3609a = dialog;
        dialog.requestWindowFeature(1);
        if (this.f3609a.getWindow() != null) {
            this.f3609a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.flybird_fullview_dialog_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            this.b = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_tips);
            if (TextUtils.isEmpty(str)) {
                this.b.setText(LanguageHelper.localizedStringForKey("flybird_fp_tips", activity.getString(R.string.flybird_fp_tips), new Object[0]));
            } else {
                this.b.setText(str);
            }
            this.h = false;
            ((ImageView) linearLayout.findViewById(R.id.fp_fullview_dialog_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.access$100(FpFullViewDialog.this) != null) {
                        FpFullViewDialog.access$100(FpFullViewDialog.this).onDialogAction(0);
                    }
                    FpFullViewDialog.access$002(FpFullViewDialog.this, true);
                    FpFullViewDialog.access$700(FpFullViewDialog.this).dismiss();
                }
            });
            this.g = false;
            TextView textView = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_pwd);
            this.j = textView;
            textView.setText(LanguageHelper.localizedStringForKey("mini_input_pwd", activity.getString(R.string.mini_input_pwd), new Object[0]));
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.access$100(FpFullViewDialog.this) != null && !FpFullViewDialog.access$800(FpFullViewDialog.this)) {
                        FpFullViewDialog.access$100(FpFullViewDialog.this).onDialogAction(2);
                    }
                    FpFullViewDialog.access$302(FpFullViewDialog.this, true);
                    FpFullViewDialog.access$700(FpFullViewDialog.this).dismiss();
                }
            });
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            float f = displayMetrics.density;
            int i2 = (int) (130.0f * f);
            int statusBarHeight = UIUtil.getStatusBarHeight(activity);
            WindowManager.LayoutParams attributes = this.f3609a.getWindow().getAttributes();
            attributes.width = i;
            Rect rect = this.d;
            attributes.height = ((rect.bottom + i2) - rect.top) + ((int) (f * 30.0f));
            attributes.x = 0;
            if (a()) {
                int i3 = (this.d.top - i2) - statusBarHeight;
                if (i3 <= 0) {
                    i3 = 0;
                }
                attributes.y = i3;
            } else {
                int i4 = this.d.top - i2;
                if (i4 <= 0) {
                    i4 = 0;
                }
                attributes.y = i4;
            }
            attributes.gravity = 48;
            this.f3609a.getWindow().setAttributes(attributes);
            if (this.e) {
                d(false);
            }
            this.f3609a.setContentView(linearLayout);
            this.f3609a.setCancelable(false);
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, th.getClass().getName(), th);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        } else if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    c(activity);
                    b(activity, str, iDialogActionListener);
                    VerifyEnum verifyEnum = this.k;
                    if (verifyEnum == null || verifyEnum != VerifyEnum.OPEN) {
                        this.j.setVisibility(0);
                    } else {
                        this.j.setVisibility(8);
                    }
                    this.f3609a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                            }
                        }
                    });
                    this.f3609a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                            }
                        }
                    });
                    this.f3609a.show();
                }
            } catch (Exception unused) {
            }
        }
    }
}
