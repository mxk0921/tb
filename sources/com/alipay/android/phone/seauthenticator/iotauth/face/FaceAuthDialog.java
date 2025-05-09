package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FaceAuthDialog extends IBiometricValidateNewDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static FaceAnimationManager.ActionCallback mActionCallback;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3774a;
    public TextView b;
    public FaceView c;
    public ImageView d;
    public TextView e;
    public IBiometricValidateNewDialog.IDialogActionListener f;
    public FaceAnimationManager mFaceAnimationManager;

    public FaceAuthDialog(Activity activity, FaceAnimationManager faceAnimationManager) {
        super(activity, R.style.bio_TransparentTheme);
        this.f3774a = activity;
        this.mFaceAnimationManager = faceAnimationManager;
    }

    public static /* synthetic */ Activity access$002(FaceAuthDialog faceAuthDialog, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("7335acce", new Object[]{faceAuthDialog, activity});
        }
        faceAuthDialog.f3774a = activity;
        return activity;
    }

    public static /* synthetic */ IBiometricValidateNewDialog.IDialogActionListener access$100(FaceAuthDialog faceAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateNewDialog.IDialogActionListener) ipChange.ipc$dispatch("2a57b92e", new Object[]{faceAuthDialog});
        }
        return faceAuthDialog.f;
    }

    public static /* synthetic */ TextView access$200(FaceAuthDialog faceAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c01b28bc", new Object[]{faceAuthDialog});
        }
        return faceAuthDialog.b;
    }

    public static /* synthetic */ Object ipc$super(FaceAuthDialog faceAuthDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/phone/seauthenticator/iotauth/face/FaceAuthDialog");
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (isShowing()) {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FaceAuthDialog.this.dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthFail(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d30b5c", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_FAILURE);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_fail);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthNoMatch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369f93e4", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_NOT_MATCH);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_not_match);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthNoMatchTooMuch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9979293d", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_OVER_COUNT);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_over_count);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthSuccess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7ea4c5", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SUCCESS);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_success);
        }
        updateMsg(clientText, 0, -16777216);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initView();
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onProcessAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdefd2c9", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_PROCESSING);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_processing);
        }
        updateMsg(clientText, 200, -16777216);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public Dialog showDialog(int i, String str, int i2, IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("fe889eae", new Object[]{this, new Integer(i), str, new Integer(i2), iDialogActionListener});
        }
        if (isShowing()) {
            dismiss();
        }
        super.show();
        FaceAnimationManager.ActionCallback actionCallback = mActionCallback;
        if (actionCallback != null) {
            actionCallback.onAction(0);
        }
        this.f = iDialogActionListener;
        if (!CommonUtils.isBlank(str) && (textView = this.b) != null) {
            textView.setText(str);
        }
        return this;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b != null && !TextUtils.isEmpty(str)) {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAuthDialog.access$200(FaceAuthDialog.this).setText(str);
                    FaceAuthDialog.access$200(FaceAuthDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    public final void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f3774a).inflate(R.layout.face_auth_dialog_layout, (ViewGroup) null);
        linearLayout.requestFocus();
        linearLayout.requestFocusFromTouch();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        setCancelable(false);
        setContentView(linearLayout, layoutParams);
        this.b = (TextView) linearLayout.findViewById(R.id.face_auth_title);
        this.d = (ImageView) linearLayout.findViewById(R.id.face_auth_cancel);
        this.e = (TextView) linearLayout.findViewById(R.id.face_auth_btn_switch);
        this.c = (FaceView) linearLayout.findViewById(R.id.faceview);
        linearLayout.setBackground(null);
        FaceAnimationManager faceAnimationManager = this.mFaceAnimationManager;
        if (faceAnimationManager != null) {
            faceAnimationManager.init(this.f3774a, linearLayout, this.c, this.d, this.e, this.b);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    return;
                }
                FaceAuthDialog.this.mFaceAnimationManager.reset();
                FaceAuthDialog.access$002(FaceAuthDialog.this, null);
            }
        });
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
        if (!TextUtils.isEmpty(clientText)) {
            this.e.setText(clientText);
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (FaceAuthDialog.access$100(FaceAuthDialog.this) != null) {
                    FaceAuthDialog.access$100(FaceAuthDialog.this).onAction(1);
                }
                FaceAuthDialog.this.dismiss();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (FaceAuthDialog.access$100(FaceAuthDialog.this) != null) {
                    FaceAuthDialog.access$100(FaceAuthDialog.this).onAction(4);
                }
                FaceAuthDialog.this.dismiss();
            }
        });
    }
}
