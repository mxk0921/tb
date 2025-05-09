package com.alipay.android.app.smartpays.widget.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
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
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener;
import com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpFullViewDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IResourceLoader f3505a;
    public final VerifyEnum b;
    public Dialog c;
    public TextView d;
    public TextView e;
    public IDialogActionListener f;
    public Rect g;
    public boolean h;
    public boolean i;

    public FpFullViewDialog(VerifyEnum verifyEnum) {
        this.b = verifyEnum;
    }

    public static /* synthetic */ void access$000(FpFullViewDialog fpFullViewDialog, Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee44879", new Object[]{fpFullViewDialog, activity, str, iDialogActionListener});
        } else {
            fpFullViewDialog.d(activity, str, iDialogActionListener);
        }
    }

    public static /* synthetic */ boolean access$100(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84125792", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.i;
    }

    public static /* synthetic */ boolean access$102(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8267a7c8", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.i = z;
        return z;
    }

    public static /* synthetic */ IDialogActionListener access$200(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogActionListener) ipChange.ipc$dispatch("3804f6b7", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.f;
    }

    public static /* synthetic */ Dialog access$300(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("c8620fff", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.c;
    }

    public static /* synthetic */ TextView access$400(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ef329885", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.d;
    }

    public static /* synthetic */ boolean access$500(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("874c5196", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.h;
    }

    public static /* synthetic */ void access$600(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3fe521", new Object[]{fpFullViewDialog, new Boolean(z)});
        } else {
            fpFullViewDialog.e(z);
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c566ed7", new Object[]{this, context});
            return;
        }
        this.i = true;
        if (this.c != null) {
            try {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (!((Activity) context).isFinishing()) {
                                FpFullViewDialog.access$300(FpFullViewDialog.this).dismiss();
                            }
                        } catch (Exception e) {
                            LogUtils.printExceptionStackTrace(e);
                        }
                    }
                });
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
    }

    public final void e(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748f9590", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.c;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            View decorView = window.getDecorView();
            if (!z) {
                decorView.setSystemUiVisibility(4098);
            } else {
                decorView.setSystemUiVisibility(0);
            }
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.c;
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setResourceLoader(IResourceLoader iResourceLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13b031e", new Object[]{this, iResourceLoader});
        } else {
            this.f3505a = iResourceLoader;
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void showDialog(final Activity activity, final String str, final IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61f5d8", new Object[]{this, activity, str, iDialogActionListener});
            return;
        }
        try {
            c(activity);
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FpFullViewDialog.access$000(FpFullViewDialog.this, activity, str, iDialogActionListener);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("action", "FpFullViewDialog");
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
        } else if (this.d != null && !TextUtils.isEmpty(str)) {
            this.d.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.6
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

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94dffa77", new Object[]{this})).booleanValue();
        }
        try {
            return TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo");
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return false;
        }
    }

    public final int b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9070b1e", new Object[]{this, activity})).intValue();
        }
        Resources resources = activity.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        LogUtils.record(2, "FpFullViewDialog", "Status height:" + dimensionPixelSize);
        return dimensionPixelSize;
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
            ipChange.ipc$dispatch("832e37b7", new Object[]{this, context});
            return;
        }
        try {
            optJSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(context)).optJSONObject("fullView");
            i4 = optJSONObject.optInt("startX", 0);
            try {
                i3 = optJSONObject.optInt("startY", 0);
            } catch (Throwable th2) {
                th = th2;
                i3 = 0;
                i2 = 0;
                i = 0;
                LogUtils.printExceptionStackTrace(th);
                this.g = new Rect(i4, i3, i2 + i4, i + i3);
                this.h = z;
            }
        } catch (Throwable th3) {
            th = th3;
            i4 = 0;
        }
        try {
            i2 = optJSONObject.optInt("width", 0);
            try {
                i = optJSONObject.optInt("height", 0);
                try {
                    z = optJSONObject.optBoolean("navConflict", false);
                } catch (Throwable th4) {
                    th = th4;
                    LogUtils.printExceptionStackTrace(th);
                    this.g = new Rect(i4, i3, i2 + i4, i + i3);
                    this.h = z;
                }
            } catch (Throwable th5) {
                th = th5;
                i = 0;
                LogUtils.printExceptionStackTrace(th);
                this.g = new Rect(i4, i3, i2 + i4, i + i3);
                this.h = z;
            }
        } catch (Throwable th6) {
            th = th6;
            i2 = 0;
            i = 0;
            LogUtils.printExceptionStackTrace(th);
            this.g = new Rect(i4, i3, i2 + i4, i + i3);
            this.h = z;
        }
        this.g = new Rect(i4, i3, i2 + i4, i + i3);
        this.h = z;
    }

    public final void d(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e248198", new Object[]{this, activity, str, iDialogActionListener});
        } else if (activity != null) {
            this.f = iDialogActionListener;
            Dialog dialog = new Dialog(activity);
            this.c = dialog;
            dialog.requestWindowFeature(1);
            this.c.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            try {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(this.f3505a.getLayoutId("safepay_fpfullview_dialog_layout"), (ViewGroup) null);
                linearLayout.requestFocus();
                linearLayout.requestFocusFromTouch();
                this.d = (TextView) linearLayout.findViewById(this.f3505a.getId("safepay_fpfullview_dialog_tips"));
                if (TextUtils.isEmpty(str)) {
                    this.d.setText(this.f3505a.getId("safepay_fp_open"));
                } else {
                    this.d.setText(str);
                }
                this.i = false;
                ((ImageView) linearLayout.findViewById(this.f3505a.getId("safepay_fpfullview_dialog_cancel"))).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (!FpFullViewDialog.access$100(FpFullViewDialog.this)) {
                            if (FpFullViewDialog.access$200(FpFullViewDialog.this) != null) {
                                FpFullViewDialog.access$200(FpFullViewDialog.this).onAction(0);
                            }
                            FpFullViewDialog.access$102(FpFullViewDialog.this, true);
                            FpFullViewDialog.access$300(FpFullViewDialog.this).dismiss();
                        }
                    }
                });
                TextView textView = (TextView) linearLayout.findViewById(this.f3505a.getId("safepay_fpfullview_dialog_pwd"));
                this.e = textView;
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (!FpFullViewDialog.access$100(FpFullViewDialog.this)) {
                            if (FpFullViewDialog.access$200(FpFullViewDialog.this) != null) {
                                FpFullViewDialog.access$200(FpFullViewDialog.this).onAction(2);
                            }
                            FpFullViewDialog.access$300(FpFullViewDialog.this).dismiss();
                        }
                    }
                });
                if (this.b == VerifyEnum.OPEN) {
                    this.e.setVisibility(8);
                } else {
                    this.e.setVisibility(0);
                }
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                float f = displayMetrics.density;
                int i2 = (int) (130.0f * f);
                int b = b(activity);
                WindowManager.LayoutParams attributes = this.c.getWindow().getAttributes();
                attributes.width = i;
                Rect rect = this.g;
                attributes.height = ((rect.bottom + i2) - rect.top) + ((int) (f * 30.0f));
                attributes.x = 0;
                if (a()) {
                    int i3 = (this.g.top - i2) - b;
                    if (i3 <= 0) {
                        i3 = 0;
                    }
                    attributes.y = i3;
                } else {
                    int i4 = this.g.top - i2;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    attributes.y = i4;
                }
                attributes.gravity = 48;
                this.c.getWindow().setAttributes(attributes);
                if (this.h) {
                    e(false);
                }
                this.c.setContentView(linearLayout);
                this.c.setCancelable(false);
                this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.5
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
                        this.c.getWindow().getDecorView().setForceDarkAllowed(false);
                    }
                } catch (Throwable unused) {
                }
                this.c.show();
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", "ShowFpFullViewDialogEx", th);
            }
            LogUtils.record(2, "FpFullViewDialog::showDialog", "FpFullViewDialog msg:" + str);
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = true;
        if (this.c != null) {
            this.d.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.8
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
                        FpFullViewDialog.access$300(FpFullViewDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtils.printExceptionStackTrace(e);
                    }
                }
            }, i);
        }
    }
}
