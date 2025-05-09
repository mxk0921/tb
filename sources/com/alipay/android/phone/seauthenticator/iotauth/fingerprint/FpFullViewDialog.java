package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
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
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpFullViewDialog extends IBiometricValidateDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Dialog f3777a;
    public TextView b;
    public TextView c;
    public IBiometricValidateDialog.IDialogActionListener d;
    public Rect e;
    public boolean f;
    public boolean g;

    public static /* synthetic */ IBiometricValidateDialog.IDialogActionListener access$000(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateDialog.IDialogActionListener) ipChange.ipc$dispatch("8ed82e3d", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.d;
    }

    public static /* synthetic */ boolean access$102(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d93a061", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.getClass();
        return z;
    }

    public static /* synthetic */ Dialog access$200(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("b38c1057", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.f3777a;
    }

    public static /* synthetic */ boolean access$300(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4885db", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.g;
    }

    public static /* synthetic */ boolean access$402(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b928d424", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.getClass();
        return z;
    }

    public static /* synthetic */ TextView access$500(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("6cd90489", new Object[]{fpFullViewDialog});
        }
        return fpFullViewDialog.b;
    }

    public static /* synthetic */ boolean access$600(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf2c4db8", new Object[]{fpFullViewDialog})).booleanValue();
        }
        return fpFullViewDialog.f;
    }

    public static /* synthetic */ void access$700(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e52ce1", new Object[]{fpFullViewDialog, new Boolean(z)});
        } else {
            fpFullViewDialog.d(z);
        }
    }

    public static /* synthetic */ Object ipc$super(FpFullViewDialog fpFullViewDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/seauthenticator/iotauth/fingerprint/FpFullViewDialog");
    }

    public final int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.f3777a;
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    public final void d(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748f9590", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.f3777a;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            View decorView = window.getDecorView();
            if (!z) {
                decorView.setSystemUiVisibility(4098);
            } else {
                decorView.setSystemUiVisibility(0);
            }
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (c()) {
            this.g = true;
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FpFullViewDialog.access$600(FpFullViewDialog.this)) {
                            FpFullViewDialog.access$700(FpFullViewDialog.this, true);
                        }
                        FpFullViewDialog.access$200(FpFullViewDialog.this).dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b != null && !TextUtils.isEmpty(str)) {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpFullViewDialog.access$500(FpFullViewDialog.this).setText(str);
                    FpFullViewDialog.access$500(FpFullViewDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    public final void b(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        Exception e;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832e37b7", new Object[]{this, context});
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(context)).optJSONObject("fullView");
            i4 = optJSONObject.optInt("startX", 0);
            try {
                i3 = optJSONObject.optInt("startY", 0);
            } catch (Exception e2) {
                e = e2;
                i3 = 0;
                i2 = 0;
                i = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.e = new Rect(i4, i3, i2 + i4, i + i3);
                this.f = z;
            }
            try {
                i2 = optJSONObject.optInt("width", 0);
            } catch (Exception e3) {
                e = e3;
                i2 = 0;
                i = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.e = new Rect(i4, i3, i2 + i4, i + i3);
                this.f = z;
            }
            try {
                i = optJSONObject.optInt("height", 0);
            } catch (Exception e4) {
                e = e4;
                i = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.e = new Rect(i4, i3, i2 + i4, i + i3);
                this.f = z;
            }
            try {
                z = optJSONObject.optBoolean("navConflict", false);
            } catch (Exception e5) {
                e = e5;
                AuthenticatorLOG.fpInfo(e.toString());
                this.e = new Rect(i4, i3, i2 + i4, i + i3);
                this.f = z;
            }
        } catch (Exception e6) {
            e = e6;
            i4 = 0;
        }
        this.e = new Rect(i4, i3, i2 + i4, i + i3);
        this.f = z;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public Dialog showDialog(Context context, int i, String str, IBiometricValidateDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("ceb66dcd", new Object[]{this, context, new Integer(i), str, iDialogActionListener});
        }
        if (context == null) {
            return null;
        }
        b(context);
        this.d = iDialogActionListener;
        Dialog dialog = new Dialog(context);
        this.f3777a = dialog;
        dialog.requestWindowFeature(1);
        this.f3777a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.fp_fullview_dialog_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            if (Build.VERSION.SDK_INT >= 29) {
                linearLayout.setForceDarkAllowed(false);
            }
            this.b = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_tips);
            if (CommonUtils.isBlank(str)) {
                this.b.setText(context.getString(R.string.fp_auth_start_title));
            } else {
                this.b.setText(str);
            }
            ((ImageView) linearLayout.findViewById(R.id.fp_fullview_dialog_close)).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.access$000(FpFullViewDialog.this) != null) {
                        FpFullViewDialog.access$000(FpFullViewDialog.this).onAction(1);
                    }
                    FpFullViewDialog.access$102(FpFullViewDialog.this, true);
                    FpFullViewDialog.access$200(FpFullViewDialog.this).dismiss();
                }
            });
            this.c = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_cancel);
            final String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
            if (!TextUtils.isEmpty(clientText)) {
                this.c.setText(clientText);
            }
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.access$000(FpFullViewDialog.this) != null && !FpFullViewDialog.access$300(FpFullViewDialog.this)) {
                        if (TextUtils.isEmpty(clientText)) {
                            FpFullViewDialog.access$000(FpFullViewDialog.this).onAction(1);
                        } else {
                            FpFullViewDialog.access$000(FpFullViewDialog.this).onAction(3);
                        }
                    }
                    FpFullViewDialog.access$402(FpFullViewDialog.this, true);
                    FpFullViewDialog.access$200(FpFullViewDialog.this).dismiss();
                }
            });
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i2 = displayMetrics.widthPixels;
            float f = displayMetrics.density;
            int i3 = (int) (130.0f * f);
            int a2 = a(context);
            WindowManager.LayoutParams attributes = this.f3777a.getWindow().getAttributes();
            attributes.width = i2;
            Rect rect = this.e;
            int i4 = rect.top;
            attributes.height = ((rect.bottom + i3) - i4) + ((int) (f * 30.0f));
            attributes.x = 0;
            int i5 = (i4 - i3) - a2;
            if (i5 <= 0) {
                i5 = 0;
            }
            attributes.y = i5;
            attributes.gravity = 48;
            this.f3777a.getWindow().setAttributes(attributes);
            if (this.f) {
                d(false);
            }
            this.f3777a.setContentView(linearLayout);
            this.f3777a.setCancelable(false);
            this.f3777a.show();
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
        return this.f3777a;
    }
}
