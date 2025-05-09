package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpFullViewCompatDialog extends IBiometricValidateNewDialog implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect mAppRect;
    private TextView mBtn;
    private View mClose;
    private Context mContext;
    private Rect mFingerprintRect;
    private View mFpIcon;
    private View mFpRect;
    private boolean mIsDismissed;
    private ViewGroup mLayout;
    private IBiometricValidateNewDialog.IDialogActionListener mListener;
    private ViewGroup mScreen;
    private final Specs mSpecs;
    private TextView mTips;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Callback() {
        }

        public abstract void onLaidOut(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Specs {
        public final int alignCenterThreshold;
        public final int backupFpMarginTop;
        public final int backupTextMarginBottom;
        public final int backupTextMarginFp;
        public final int dialogHeader;
        public final int dialogMarginLeftRight;
        public final int fpMarginBottom;
        public final int fpMarginTop;
        public final float layoutThreshold;
        public final int textMarginEdge;
        public final int textMarginEdgeInDialog;
        public final int textMarginFp;

        public Specs(Context context) {
            this.layoutThreshold = 0.38f;
            float f = context.getResources().getDisplayMetrics().density;
            this.textMarginFp = (int) (34.0f * f);
            this.textMarginEdge = (int) (60.0f * f);
            this.textMarginEdgeInDialog = (int) (13.0f * f);
            int i = (int) (55.0f * f);
            this.fpMarginTop = i;
            this.fpMarginBottom = (int) (65.0f * f);
            this.dialogHeader = i;
            this.dialogMarginLeftRight = (int) (f * 47.5d);
            this.backupFpMarginTop = (int) (10.0f * f);
            int i2 = (int) (20.0f * f);
            this.backupTextMarginFp = i2;
            this.backupTextMarginBottom = (int) (f * 40.0f);
            this.alignCenterThreshold = i2;
        }
    }

    public FpFullViewCompatDialog(Context context) {
        super(context, R.style.bio_TransparentTheme);
        this.mSpecs = new Specs(context);
        this.mContext = context;
    }

    public static /* synthetic */ TextView access$1000(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("bd2104bd", new Object[]{fpFullViewCompatDialog});
        }
        return fpFullViewCompatDialog.mTips;
    }

    public static /* synthetic */ Rect access$200(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("b029c49f", new Object[]{fpFullViewCompatDialog});
        }
        return fpFullViewCompatDialog.getFingerprintRect();
    }

    public static /* synthetic */ void access$300(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d716a735", new Object[]{fpFullViewCompatDialog});
        } else {
            fpFullViewCompatDialog.backupLayout();
        }
    }

    public static /* synthetic */ Rect access$400(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("277c20dd", new Object[]{fpFullViewCompatDialog});
        }
        return fpFullViewCompatDialog.getAppRect();
    }

    public static /* synthetic */ void access$500(FpFullViewCompatDialog fpFullViewCompatDialog, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857b7893", new Object[]{fpFullViewCompatDialog, rect, rect2});
        } else {
            fpFullViewCompatDialog.debugLayout(rect, rect2);
        }
    }

    public static /* synthetic */ Specs access$600(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Specs) ipChange.ipc$dispatch("b0e739d", new Object[]{fpFullViewCompatDialog});
        }
        return fpFullViewCompatDialog.mSpecs;
    }

    public static /* synthetic */ void access$700(FpFullViewCompatDialog fpFullViewCompatDialog, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c7ad1", new Object[]{fpFullViewCompatDialog, rect, rect2});
        } else {
            fpFullViewCompatDialog.regularLayout(rect, rect2);
        }
    }

    public static /* synthetic */ IBiometricValidateNewDialog.IDialogActionListener access$800(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateNewDialog.IDialogActionListener) ipChange.ipc$dispatch("fecf4fc5", new Object[]{fpFullViewCompatDialog});
        }
        return fpFullViewCompatDialog.mListener;
    }

    public static /* synthetic */ boolean access$900(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1fe0373", new Object[]{fpFullViewCompatDialog})).booleanValue();
        }
        return fpFullViewCompatDialog.mIsDismissed;
    }

    private void backupLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2de6213", new Object[]{this});
            return;
        }
        int height = this.mTips.getHeight();
        this.mFpIcon.setVisibility(0);
        this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8);
        int i = this.mSpecs.dialogMarginLeftRight;
        updateLayoutLp(17, -1, -2, i, i, 0);
        Specs specs = this.mSpecs;
        updateTipsLp(specs.dialogHeader + specs.backupFpMarginTop + this.mFpIcon.getHeight() + this.mSpecs.backupTextMarginFp);
        Specs specs2 = this.mSpecs;
        updateFpIconLp(specs2.dialogHeader + specs2.backupFpMarginTop, specs2.backupTextMarginBottom + height + specs2.backupTextMarginFp);
    }

    private void debugLayout(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef31644", new Object[]{this, rect, rect2});
        } else if (this.mFpRect.getVisibility() == 0) {
            updateFpLp(rect2.top - rect.top, rect2.left - rect.left, rect2.width(), rect2.height());
        }
    }

    private Rect getAppRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8ef9353f", new Object[]{this});
        }
        if (this.mAppRect == null) {
            this.mAppRect = new Rect();
        }
        int[] iArr = new int[2];
        this.mScreen.getLocationOnScreen(iArr);
        Rect rect = this.mAppRect;
        int i = iArr[0];
        rect.set(i, iArr[1], this.mScreen.getWidth() + i, iArr[1] + this.mScreen.getHeight());
        return this.mAppRect;
    }

    private Rect getFingerprintRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1c75c2c2", new Object[]{this});
        }
        if (this.mFingerprintRect == null) {
            try {
                JSONObject jSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(getContext())).getJSONObject("fullView");
                int i = jSONObject.getInt("startX");
                int i2 = jSONObject.getInt("startY");
                this.mFingerprintRect = new Rect(i, i2, jSONObject.getInt("width") + i, jSONObject.getInt("height") + i2);
            } catch (Throwable unused) {
            }
        }
        return this.mFingerprintRect;
    }

    public static /* synthetic */ Object ipc$super(FpFullViewCompatDialog fpFullViewCompatDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/seauthenticator/iotauth/fingerprint/FpFullViewCompatDialog");
        }
    }

    private void regularLayout(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430c308d", new Object[]{this, rect, rect2});
            return;
        }
        this.mFpIcon.setVisibility(8);
        int height = this.mTips.getHeight();
        int height2 = (rect.height() + rect.top) - rect2.bottom;
        Specs specs = this.mSpecs;
        if (height2 < specs.textMarginEdge + height + specs.textMarginFp) {
            this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8_top);
            int width = rect.width();
            Specs specs2 = this.mSpecs;
            updateLayoutLp(81, width, (((((height + specs2.textMarginEdge) + specs2.textMarginFp) + specs2.dialogHeader) + rect.height()) + rect.top) - rect2.top, 0, 0, 0);
            Specs specs3 = this.mSpecs;
            updateTipsLp(specs3.textMarginEdge + specs3.dialogHeader);
            return;
        }
        Objects.requireNonNull(specs);
        int i = rect2.top;
        Specs specs4 = this.mSpecs;
        if ((rect.height() + rect.top) * 0.38f > (i - specs4.fpMarginTop) - specs4.dialogHeader) {
            this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8);
            int width2 = rect.width();
            Specs specs5 = this.mSpecs;
            int i2 = width2 - (specs5.dialogMarginLeftRight * 2);
            int height3 = specs5.fpMarginBottom + rect2.height();
            Specs specs6 = this.mSpecs;
            int i3 = specs6.textMarginFp;
            int i4 = specs6.textMarginEdgeInDialog;
            int i5 = specs6.dialogHeader;
            int i6 = specs6.dialogMarginLeftRight;
            updateLayoutLp(49, i2, height3 + i3 + height + i4 + i5, i6, i6, ((((rect2.top - rect.top) - i3) - height) - i4) - i5);
            Specs specs7 = this.mSpecs;
            updateTipsLp(specs7.textMarginEdgeInDialog + specs7.dialogHeader);
            return;
        }
        this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8_top);
        int width3 = rect.width();
        Specs specs8 = this.mSpecs;
        updateLayoutLp(81, width3, (((specs8.dialogHeader + specs8.fpMarginTop) + rect.height()) + rect.top) - rect2.top, 0, 0, 0);
        Specs specs9 = this.mSpecs;
        updateTipsLp(specs9.dialogHeader + specs9.fpMarginTop + rect2.height() + this.mSpecs.textMarginFp);
    }

    private void resetLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e5bd60", new Object[]{this});
        } else {
            waitForLaidOut(this.mScreen, new Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/seauthenticator/iotauth/fingerprint/FpFullViewCompatDialog$1");
                }

                @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.Callback
                public void onLaidOut(boolean z) {
                    Rect access$200;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3ffaa18e", new Object[]{this, new Boolean(z)});
                    } else if (!z || (access$200 = FpFullViewCompatDialog.access$200(FpFullViewCompatDialog.this)) == null) {
                        FpFullViewCompatDialog.access$300(FpFullViewCompatDialog.this);
                    } else {
                        Rect access$400 = FpFullViewCompatDialog.access$400(FpFullViewCompatDialog.this);
                        FpFullViewCompatDialog.access$500(FpFullViewCompatDialog.this, access$400, access$200);
                        if (!access$400.contains(access$200) || Math.abs(access$400.centerX() - access$200.centerX()) >= FpFullViewCompatDialog.access$600(FpFullViewCompatDialog.this).alignCenterThreshold) {
                            FpFullViewCompatDialog.access$300(FpFullViewCompatDialog.this);
                        } else {
                            FpFullViewCompatDialog.access$700(FpFullViewCompatDialog.this, access$400, access$200);
                        }
                    }
                }
            });
        }
    }

    private void updateFpIconLp(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3dc457", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mFpIcon.getLayoutParams();
        if (layoutParams.topMargin != i || layoutParams.bottomMargin != i2) {
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i2;
            this.mFpIcon.setLayoutParams(layoutParams);
        }
    }

    private void updateFpLp(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd3f71e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mFpRect.getLayoutParams();
        if (layoutParams.topMargin != i || layoutParams.leftMargin != i2 || layoutParams.width != i3 || layoutParams.height != i4) {
            layoutParams.topMargin = i;
            layoutParams.leftMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            this.mFpRect.setLayoutParams(layoutParams);
        }
    }

    private void updateLayoutLp(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8deaa9de", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mLayout.getLayoutParams();
        if (layoutParams.gravity != i || layoutParams.width != i2 || layoutParams.height != i3 || layoutParams.leftMargin != i4 || layoutParams.rightMargin != i5 || layoutParams.topMargin != i6) {
            layoutParams.gravity = i;
            layoutParams.width = i2;
            layoutParams.height = i3;
            layoutParams.leftMargin = i4;
            layoutParams.rightMargin = i5;
            layoutParams.topMargin = i6;
            this.mLayout.setLayoutParams(layoutParams);
        }
    }

    private void updateTipsLp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fd4177", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTips.getLayoutParams();
        if (layoutParams.topMargin != i) {
            layoutParams.topMargin = i;
            this.mTips.setLayoutParams(layoutParams);
        }
    }

    private void waitForLaidOut(final View view, final Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4876fd9", new Object[]{this, view, callback});
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(50);
        view.post(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (atomicInteger.decrementAndGet() < 0) {
                    callback.onLaidOut(false);
                } else if (ViewCompat.isLaidOut(view)) {
                    callback.onLaidOut(true);
                } else {
                    view.post(this);
                }
            }
        });
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (isShowing()) {
            this.mIsDismissed = true;
            this.mTips.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FpFullViewCompatDialog.this.dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(R.layout.fp_auth_compat_dialog_layout);
            window.setLayout(-1, -1);
            if (Build.VERSION.SDK_INT >= 29) {
                window.getDecorView().setForceDarkAllowed(false);
            }
            this.mScreen = (ViewGroup) findViewById(R.id.screen);
            this.mLayout = (ViewGroup) findViewById(R.id.layout);
            this.mClose = findViewById(R.id.close);
            this.mFpRect = findViewById(R.id.fp_rect);
            this.mBtn = (TextView) findViewById(R.id.btn);
            this.mTips = (TextView) findViewById(R.id.tips);
            this.mFpIcon = findViewById(R.id.fp_icon);
            this.mFpRect.setVisibility(8);
            this.mLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.mLayout.requestFocus();
            this.mLayout.requestFocusFromTouch();
            setCancelable(false);
            resetLayout();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
        } else {
            resetLayout();
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.mTips != null && !TextUtils.isEmpty(str)) {
            this.mTips.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpFullViewCompatDialog.access$1000(FpFullViewCompatDialog.this).setText(str);
                    FpFullViewCompatDialog.access$1000(FpFullViewCompatDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public Dialog showDialog(int i, String str, final int i2, IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("fe889eae", new Object[]{this, new Integer(i), str, new Integer(i2), iDialogActionListener});
        }
        if (isShowing()) {
            dismiss();
        }
        super.show();
        this.mListener = iDialogActionListener;
        try {
            if (CommonUtils.isBlank(str)) {
                this.mTips.setText(this.mContext.getString(R.string.fp_auth_start_title));
            } else {
                this.mTips.setText(str);
            }
            this.mClose.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null) {
                        FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this).onAction(1);
                    }
                    FpFullViewCompatDialog.this.dismiss();
                }
            });
            String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
            if (!TextUtils.isEmpty(clientText)) {
                this.mTips.setText(clientText);
            }
            String clientText2 = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
            if (!TextUtils.isEmpty(clientText2)) {
                this.mBtn.setText(clientText2);
                i2 = 1;
            } else if (i2 == 1) {
                this.mBtn.setText(this.mContext.getResources().getText(R.string.fp_auth_switch_other));
            } else if (i2 == 3) {
                this.mBtn.setText(this.mContext.getResources().getText(R.string.fp_auth_input_pwd));
            }
            this.mBtn.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    int i3 = i2;
                    if (i3 == 1) {
                        if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null && !FpFullViewCompatDialog.access$900(FpFullViewCompatDialog.this)) {
                            FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this).onAction(4);
                        }
                    } else if (i3 == 3) {
                        if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null && !FpFullViewCompatDialog.access$900(FpFullViewCompatDialog.this)) {
                            FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this).onAction(3);
                        }
                    } else if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null && !FpFullViewCompatDialog.access$900(FpFullViewCompatDialog.this)) {
                        FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this).onAction(1);
                    }
                    FpFullViewCompatDialog.this.dismiss();
                }
            });
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
        show();
        return this;
    }
}
