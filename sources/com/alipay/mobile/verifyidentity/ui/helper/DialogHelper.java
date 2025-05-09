package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.APNoticePopDialog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DialogHelper";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4473a;
    public Dialog b;

    public DialogHelper(Activity activity) {
        this.f4473a = activity;
    }

    public static /* synthetic */ Activity access$000(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("bd2118fc", new Object[]{dialogHelper});
        }
        return dialogHelper.f4473a;
    }

    public static /* synthetic */ Dialog access$100(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("d591eba4", new Object[]{dialogHelper});
        }
        return dialogHelper.b;
    }

    public static /* synthetic */ Dialog access$102(DialogHelper dialogHelper, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("52d8d0cd", new Object[]{dialogHelper, dialog});
        }
        dialogHelper.b = dialog;
        return dialog;
    }

    public static Toast makeToast(Context context, int i, CharSequence charSequence, int i2) {
        View view;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toast) ipChange.ipc$dispatch("20c563c5", new Object[]{context, new Integer(i), charSequence, new Integer(i2)});
        }
        Toast makeText = Toast.makeText(context, charSequence, i2);
        if (i != 0) {
            view = LayoutInflater.from(context).inflate(R.layout.optimized_toast, (ViewGroup) null);
            textView = (TextView) view.findViewById(R.id.message);
            ((ImageView) view.findViewById(R.id.iv_symbol)).setBackgroundResource(i);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.simple_toast, (ViewGroup) null);
            textView = (TextView) view.findViewById(R.id.tip_content);
        }
        textView.setText(charSequence);
        makeText.setView(view);
        makeText.setGravity(17, 0, 0);
        return makeText;
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else {
            alert(str, str2, str3, onClickListener, str4, onClickListener2, Boolean.FALSE, bundle);
        }
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else {
            this.f4473a.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DialogHelper.access$100(DialogHelper.this) != null && DialogHelper.access$100(DialogHelper.this).isShowing() && !DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                        try {
                            DialogHelper.access$100(DialogHelper.this).dismiss();
                        } catch (Throwable th) {
                            try {
                                VerifyLogCat.w("DialogHelper", "DialogHelper.dismissProgressDialog(): exception=" + th);
                            } finally {
                                DialogHelper.access$102(DialogHelper.this, null);
                            }
                        }
                    }
                }
            });
        }
    }

    public Dialog getDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f928d0aa", new Object[]{this});
        }
        return this.b;
    }

    public boolean isDialogShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe93935e", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.b;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    public void showProgressDialog(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f8c145", new Object[]{this, new Boolean(z), str});
        } else {
            showProgressDialog(str, true, null, z);
        }
    }

    public void toast(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.f4473a.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DialogHelper.access$000(DialogHelper.this) != null) {
                        try {
                            DialogHelper.makeToast(DialogHelper.access$000(DialogHelper.this), 0, str, i).show();
                        } catch (Exception e) {
                            VerifyLogCat.w("DialogHelper", "DialogHelper.toast(): exception=" + e);
                        }
                    }
                }
            });
        }
    }

    public void updateAlertLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e1f124", new Object[]{this});
            return;
        }
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.b;
            if (dialog2 instanceof APNoticePopDialog) {
                ((APNoticePopDialog) dialog2).updateLayout();
            }
        }
    }

    public void alert(final String str, final String str2, final String str3, final DialogInterface.OnClickListener onClickListener, final String str4, final DialogInterface.OnClickListener onClickListener2, final Boolean bool, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575ffe7e", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool, bundle});
            return;
        }
        dismissProgressDialog();
        this.f4473a.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) != null && !DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                    DialogHelper.access$102(DialogHelper.this, new APNoticePopDialog(DialogHelper.access$000(DialogHelper.this), str, str2, str3, str4, bundle));
                    ((APNoticePopDialog) DialogHelper.access$100(DialogHelper.this)).setNegativeListener(new APNoticePopDialog.OnClickNegativeListener() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.ui.APNoticePopDialog.OnClickNegativeListener
                        public void onClick() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("88f782f0", new Object[]{this});
                                return;
                            }
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                            if (onClickListener3 != null) {
                                onClickListener3.onClick(DialogHelper.access$100(DialogHelper.this), -2);
                            }
                        }
                    });
                    ((APNoticePopDialog) DialogHelper.access$100(DialogHelper.this)).setPositiveListener(new APNoticePopDialog.OnClickPositiveListener() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.ui.APNoticePopDialog.OnClickPositiveListener
                        public void onClick() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("88f782f0", new Object[]{this});
                                return;
                            }
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            DialogInterface.OnClickListener onClickListener3 = onClickListener;
                            if (onClickListener3 != null) {
                                onClickListener3.onClick(DialogHelper.access$100(DialogHelper.this), -1);
                            }
                        }
                    });
                    try {
                        DialogHelper.access$100(DialogHelper.this).show();
                        DialogHelper.access$100(DialogHelper.this).setCanceledOnTouchOutside(bool.booleanValue());
                        DialogHelper.access$100(DialogHelper.this).setCancelable(false);
                    } catch (Exception e) {
                        VerifyLogCat.w("DialogHelper", "DialogHelper.alert(): exception=" + e);
                        DialogHelper.access$102(DialogHelper.this, null);
                    }
                }
            }
        });
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            showProgressDialog(str, true, null, true);
        }
    }

    public void toast(final String str, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f4473a.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DialogHelper.access$000(DialogHelper.this) != null) {
                        try {
                            DialogHelper.makeToast(DialogHelper.access$000(DialogHelper.this), i, str, i2).show();
                        } catch (Exception e) {
                            VerifyLogCat.w("DialogHelper", "DialogHelper.toast(): exception=" + e);
                        }
                    }
                }
            });
        }
    }

    public void showProgressDialog(final String str, final boolean z, final DialogInterface.OnCancelListener onCancelListener, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        dismissProgressDialog();
        this.f4473a.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) != null && !DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                    DialogHelper.access$102(DialogHelper.this, new APGenericProgressDialog(DialogHelper.access$000(DialogHelper.this)));
                    ((APGenericProgressDialog) DialogHelper.access$100(DialogHelper.this)).setMessage(str);
                    ((APGenericProgressDialog) DialogHelper.access$100(DialogHelper.this)).setProgressVisiable(z2);
                    DialogHelper.access$100(DialogHelper.this).setCancelable(z);
                    DialogHelper.access$100(DialogHelper.this).setOnCancelListener(onCancelListener);
                    DialogHelper.access$100(DialogHelper.this).setCanceledOnTouchOutside(false);
                    try {
                        DialogHelper.access$100(DialogHelper.this).show();
                    } catch (Exception e) {
                        VerifyLogCat.e("DialogHelper", e);
                        DialogHelper.access$102(DialogHelper.this, null);
                    }
                }
            }
        });
    }
}
