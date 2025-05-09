package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.taobao.R;
import org.json.JSONObject;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NewFpFullViewDialog extends IBiometricValidateNewDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String JSON_FULL_VIEW = "fullView";
    private static final String JSON_HEIGHT = "height";
    private static final String JSON_NAV_CONFLICT = "navConflict";
    private static final String JSON_START_X = "startX";
    private static final String JSON_START_Y = "startY";
    private static final String JSON_WIDTH = "width";
    private BroadcastReceiver broadcastReceiver = null;
    private ImageView mClose;
    private Context mContext;
    private boolean mIsDismissed;
    private boolean mIsNavConflict;
    private IBiometricValidateNewDialog.IDialogActionListener mListener;
    private Rect mRect;
    private TextView mTips;
    private TextView rightBtn;

    public NewFpFullViewDialog(Context context) {
        super(context, R.style.bio_TransparentTheme);
        this.mContext = context;
    }

    public static /* synthetic */ Context access$002(NewFpFullViewDialog newFpFullViewDialog, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ec5f9b4", new Object[]{newFpFullViewDialog, context});
        }
        newFpFullViewDialog.mContext = context;
        return context;
    }

    public static /* synthetic */ IBiometricValidateNewDialog.IDialogActionListener access$100(NewFpFullViewDialog newFpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateNewDialog.IDialogActionListener) ipChange.ipc$dispatch("9414fd6a", new Object[]{newFpFullViewDialog});
        }
        return newFpFullViewDialog.mListener;
    }

    public static /* synthetic */ boolean access$200(NewFpFullViewDialog newFpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cada9a10", new Object[]{newFpFullViewDialog})).booleanValue();
        }
        return newFpFullViewDialog.mIsDismissed;
    }

    public static /* synthetic */ TextView access$300(NewFpFullViewDialog newFpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("89f1f081", new Object[]{newFpFullViewDialog});
        }
        return newFpFullViewDialog.mTips;
    }

    public static /* synthetic */ boolean access$400(NewFpFullViewDialog newFpFullViewDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cea2412", new Object[]{newFpFullViewDialog})).booleanValue();
        }
        return newFpFullViewDialog.mIsNavConflict;
    }

    public static /* synthetic */ void access$500(NewFpFullViewDialog newFpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384beba5", new Object[]{newFpFullViewDialog, new Boolean(z)});
        } else {
            newFpFullViewDialog.updateNavigation(z);
        }
    }

    private Display getDisplay(Context context) {
        WindowManager windowManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Display) ipChange.ipc$dispatch("41dea138", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        }
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    private int getScreenRealHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f59d750d", new Object[]{this, context})).intValue();
        }
        Display display = getDisplay(context);
        if (display == null) {
            return 0;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point.y;
    }

    private void initView() {
        FrameLayout.LayoutParams layoutParams;
        NewFpFullViewDialog newFpFullViewDialog;
        int screenRealHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setContentView(R.layout.new_fp_auth_dialog_layout);
        Window window = getWindow();
        if (window != null) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(R.id.fp_fullview_dialog_layout);
            viewGroup.requestFocus();
            viewGroup.requestFocusFromTouch();
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.setForceDarkAllowed(false);
            }
            setCancelable(false);
            initFullViewParams(this.mContext);
            this.mTips = (TextView) viewGroup.findViewById(R.id.fp_fullview_dialog_tips);
            this.mClose = (ImageView) viewGroup.findViewById(R.id.fp_fullview_dialog_close);
            this.rightBtn = (TextView) viewGroup.findViewById(R.id.fp_fullview_dialog_cancel);
            DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f = displayMetrics.density;
            int statusBarHeight = getStatusBarHeight(this.mContext);
            if (statusBarHeight <= 10 && (screenRealHeight = getScreenRealHeight(this.mContext)) > i2) {
                statusBarHeight = screenRealHeight - i2;
            }
            int screenRealHeight2 = getScreenRealHeight(this.mContext);
            if (statusBarHeight != screenRealHeight2 - i2) {
                i2 = screenRealHeight2 - statusBarHeight;
            }
            int i3 = (int) (18.0f * f);
            int i4 = (int) (34.0f * f);
            int i5 = (int) (60.0f * f);
            int i6 = (int) (13.0f * f);
            int i7 = (int) (55.0f * f);
            int i8 = (int) (65.0f * f);
            int i9 = (int) (f * 47.5d);
            View findViewById = viewGroup.findViewById(R.id.fp_rect);
            findViewById.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.width = this.mRect.width();
            layoutParams2.height = this.mRect.height();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mTips.getLayoutParams();
            int i10 = i2 + statusBarHeight;
            Rect rect = this.mRect;
            int i11 = i3 + i5 + i4;
            if (i10 - rect.bottom < i11) {
                attributes.width = i;
                int i12 = rect.top;
                attributes.height = (((i11 + i7) + i2) + statusBarHeight) - i12;
                attributes.x = 0;
                layoutParams = layoutParams3;
                attributes.y = ((((i12 - statusBarHeight) - i3) - i5) - i4) - i7;
                viewGroup.setBackgroundResource(R.drawable.fp_radius_corner_8_top);
                int i13 = i5 + i7;
                layoutParams.topMargin = i13;
                layoutParams2.topMargin = i13 + i3 + i4;
                newFpFullViewDialog = this;
            } else {
                layoutParams = layoutParams3;
                int i14 = rect.top;
                if (i10 * 0.38f > (i14 - i7) - i7) {
                    attributes.width = i - (i9 * 2);
                    attributes.height = i8 + rect.height() + i4 + i3 + i6 + i7;
                    attributes.x = i9;
                    newFpFullViewDialog = this;
                    attributes.y = ((((newFpFullViewDialog.mRect.top - statusBarHeight) - i4) - i3) - i6) - i7;
                    viewGroup.setBackgroundResource(R.drawable.fp_radius_corner_8);
                    int i15 = i6 + i7;
                    layoutParams.topMargin = i15;
                    layoutParams2.topMargin = i15 + i3 + i4;
                } else {
                    newFpFullViewDialog = this;
                    attributes.width = i;
                    int i16 = i7 + i7;
                    attributes.height = ((i2 + i16) + statusBarHeight) - i14;
                    attributes.x = 0;
                    attributes.y = ((i14 - statusBarHeight) - i7) - i7;
                    viewGroup.setBackgroundResource(R.drawable.fp_radius_corner_8_top);
                    layoutParams.topMargin = newFpFullViewDialog.mRect.height() + i16 + i4;
                    layoutParams2.topMargin = i16;
                }
            }
            findViewById.setLayoutParams(layoutParams2);
            newFpFullViewDialog.mTips.setLayoutParams(layoutParams);
            attributes.gravity = BadgeDrawable.TOP_START;
            if (newFpFullViewDialog.mIsNavConflict) {
                newFpFullViewDialog.updateNavigation(false);
            }
            getWindow().setAttributes(attributes);
            newFpFullViewDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    } else {
                        NewFpFullViewDialog.access$002(NewFpFullViewDialog.this, null);
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(NewFpFullViewDialog newFpFullViewDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/phone/seauthenticator/iotauth/fingerprint/NewFpFullViewDialog");
        }
    }

    private void updateNavigation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748f9590", new Object[]{this, new Boolean(z)});
            return;
        }
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (!z) {
                decorView.setSystemUiVisibility(4098);
            } else {
                decorView.setSystemUiVisibility(0);
            }
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        if (isShowing()) {
            this.mIsDismissed = true;
            this.mTips.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (NewFpFullViewDialog.access$400(NewFpFullViewDialog.this)) {
                            NewFpFullViewDialog.access$500(NewFpFullViewDialog.this, true);
                        }
                        NewFpFullViewDialog.this.dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
        Context context = this.mContext;
        if (context != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.broadcastReceiver);
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
        initView();
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.mTips != null && !TextUtils.isEmpty(str)) {
            this.mTips.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NewFpFullViewDialog.access$300(NewFpFullViewDialog.this).setText(str);
                    NewFpFullViewDialog.access$300(NewFpFullViewDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    private int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
        }
        Resources resources = context.getResources();
        try {
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void initFullViewParams(Context context) {
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
            JSONObject optJSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(context)).optJSONObject(JSON_FULL_VIEW);
            i4 = optJSONObject.optInt(JSON_START_X, 0);
            try {
                i3 = optJSONObject.optInt(JSON_START_Y, 0);
            } catch (Exception e2) {
                e = e2;
                i3 = 0;
                i2 = 0;
                i = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.mRect = new Rect(i4, i3, i2 + i4, i + i3);
                this.mIsNavConflict = z;
            }
            try {
                i2 = optJSONObject.optInt("width", 0);
            } catch (Exception e3) {
                e = e3;
                i2 = 0;
                i = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.mRect = new Rect(i4, i3, i2 + i4, i + i3);
                this.mIsNavConflict = z;
            }
            try {
                i = optJSONObject.optInt("height", 0);
            } catch (Exception e4) {
                e = e4;
                i = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.mRect = new Rect(i4, i3, i2 + i4, i + i3);
                this.mIsNavConflict = z;
            }
            try {
                z = optJSONObject.optBoolean(JSON_NAV_CONFLICT, false);
            } catch (Exception e5) {
                e = e5;
                AuthenticatorLOG.fpInfo(e.toString());
                this.mRect = new Rect(i4, i3, i2 + i4, i + i3);
                this.mIsNavConflict = z;
            }
        } catch (Exception e6) {
            e = e6;
            i4 = 0;
        }
        this.mRect = new Rect(i4, i3, i2 + i4, i + i3);
        this.mIsNavConflict = z;
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
            this.mClose.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (NewFpFullViewDialog.access$100(NewFpFullViewDialog.this) != null) {
                        NewFpFullViewDialog.access$100(NewFpFullViewDialog.this).onAction(1);
                    }
                    NewFpFullViewDialog.this.dismiss();
                }
            });
            String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
            if (!TextUtils.isEmpty(clientText)) {
                this.mTips.setText(clientText);
            }
            String clientText2 = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
            if (!TextUtils.isEmpty(clientText2)) {
                this.rightBtn.setText(clientText2);
                i2 = 1;
            } else if (i2 == 1) {
                this.rightBtn.setText(this.mContext.getResources().getText(R.string.fp_auth_switch_other));
            } else if (i2 == 3) {
                this.rightBtn.setText(this.mContext.getResources().getText(R.string.fp_auth_input_pwd));
            }
            this.rightBtn.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog.3
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
                        if (NewFpFullViewDialog.access$100(NewFpFullViewDialog.this) != null && !NewFpFullViewDialog.access$200(NewFpFullViewDialog.this)) {
                            NewFpFullViewDialog.access$100(NewFpFullViewDialog.this).onAction(4);
                        }
                    } else if (i3 == 3) {
                        if (NewFpFullViewDialog.access$100(NewFpFullViewDialog.this) != null && !NewFpFullViewDialog.access$200(NewFpFullViewDialog.this)) {
                            NewFpFullViewDialog.access$100(NewFpFullViewDialog.this).onAction(3);
                        }
                    } else if (NewFpFullViewDialog.access$100(NewFpFullViewDialog.this) != null && !NewFpFullViewDialog.access$200(NewFpFullViewDialog.this)) {
                        NewFpFullViewDialog.access$100(NewFpFullViewDialog.this).onAction(1);
                    }
                    NewFpFullViewDialog.this.dismiss();
                }
            });
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
        show();
        return this;
    }
}
