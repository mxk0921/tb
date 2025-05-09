package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ContextDialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int DialogDismissAmount;
    public static int DialogShowAmount;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4471a = new Handler(Looper.getMainLooper());
    public final Context b;

    public ContextDialogHelper(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Context access$000(ContextDialogHelper contextDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("47ee37c1", new Object[]{contextDialogHelper});
        }
        return contextDialogHelper.b;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "ContextDialogHelper";
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VerifyLogCat.d("ContextDialogHelper", "doDismissProgressDialog");
        this.f4471a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VerifyLogCat.d(ContextDialogHelper.access$100(), "doDismissProgressDialog post");
                WeakReference<Activity> dialogActivity = DialogActivityHelper.getInstance().getDialogActivity();
                if (dialogActivity != null && dialogActivity.get() != null) {
                    VerifyLogCat.d(ContextDialogHelper.access$100(), "doDismissProgressDialog need finsh");
                    try {
                        dialogActivity.get().finish();
                        dialogActivity.get().overridePendingTransition(17432576, 17432577);
                    } catch (Throwable th) {
                        String access$100 = ContextDialogHelper.access$100();
                        VerifyLogCat.w(access$100, "ContextDialogHelper.dismissProgressDialog(): exception=" + th);
                        DialogActivityHelper.getInstance().updateDialogActivity(null);
                    }
                }
            }
        });
    }

    public void alert(final String str, final String str2, final String str3, final DialogInterface.OnClickListener onClickListener, final String str4, final DialogInterface.OnClickListener onClickListener2, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else {
            this.f4471a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ContextDialogHelper.access$000(ContextDialogHelper.this) != null) {
                        VerifyLogCat.d(ContextDialogHelper.access$100(), "show ALERT post");
                        NoticeActivity.setAlertInfo(str, str2, str3, onClickListener, str4, onClickListener2, bundle);
                        Intent intent = new Intent(ContextDialogHelper.access$000(ContextDialogHelper.this), NoticeActivity.class);
                        intent.addFlags(65536);
                        MicroModuleContext.getInstance().startActivityByContext(intent);
                    }
                }
            });
        }
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
            return;
        }
        VerifyLogCat.d("ContextDialogHelper", "dismissProgressDialog by context");
        if (DialogShowAmount > 0) {
            DialogDismissAmount++;
        }
        DialogActivity.setViDismissDialogTime(System.currentTimeMillis());
        a();
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            b(str, false, null);
        }
    }

    public void toast(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.f4471a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ContextDialogHelper.access$000(ContextDialogHelper.this) != null) {
                        Context access$000 = ContextDialogHelper.access$000(ContextDialogHelper.this);
                        Toast toast = new Toast(access$000);
                        try {
                            View inflate = LayoutInflater.from(access$000).inflate(R.layout.simple_toast, (ViewGroup) null);
                            ((TextView) inflate.findViewById(R.id.tip_content)).setText(str);
                            toast.setView(inflate);
                            toast.setDuration(i);
                        } catch (Throwable th) {
                            VerifyLogCat.w(ContextDialogHelper.access$100(), "LayoutInflater: exception=", th);
                            try {
                                toast = Toast.makeText(access$000, str, i);
                            } catch (Throwable th2) {
                                VerifyLogCat.w(ContextDialogHelper.access$100(), "DialogHelper.toast(): exception=", th2);
                                return;
                            }
                        }
                        toast.setGravity(17, 0, 0);
                        try {
                            toast.show();
                        } catch (Exception e) {
                            String access$100 = ContextDialogHelper.access$100();
                            VerifyLogCat.w(access$100, "DialogHelper.toast(): exception=" + e);
                        }
                    }
                }
            });
        }
    }

    public final void b(final String str, final boolean z, final DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611be05b", new Object[]{this, str, new Boolean(z), onCancelListener});
            return;
        }
        VerifyLogCat.d("ContextDialogHelper", "showProgressDialog by context");
        DialogShowAmount++;
        DialogActivity.setViShowDialogTime(System.currentTimeMillis());
        a();
        this.f4471a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ContextDialogHelper.access$000(ContextDialogHelper.this) != null) {
                    VerifyLogCat.d(ContextDialogHelper.access$100(), "showProgressDialog post");
                    Intent intent = new Intent(ContextDialogHelper.access$000(ContextDialogHelper.this), DialogActivity.class);
                    intent.putExtra(DialogActivity.KEY_VI_DIALOG_MSG, str);
                    intent.putExtra(DialogActivity.KEY_VI_DIALOG_CANCELABLE, z);
                    intent.putExtra(DialogActivity.KEY_VI_DIALOG_SHOW_PROGRESSBAR, r4);
                    intent.addFlags(65536);
                    DialogActivity.onBizCancelListener = onCancelListener;
                    if (DialogActivity.needOrCanShow()) {
                        MicroModuleContext.getInstance().startActivityByContext(intent);
                    }
                }
            }
        });
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else {
            b(str, z, onCancelListener);
        }
    }

    public void showProgressProDialog(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e11fd7c", new Object[]{this, str});
            return;
        }
        VerifyLogCat.d("ContextDialogHelper", "showProgressDialog by context");
        DialogShowAmount++;
        DialogActivity.setViShowDialogTime(System.currentTimeMillis());
        a();
        this.f4471a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ContextDialogHelper.access$000(ContextDialogHelper.this) != null) {
                    VerifyLogCat.d(ContextDialogHelper.access$100(), "showProgressDialog post");
                    Intent intent = new Intent(ContextDialogHelper.access$000(ContextDialogHelper.this), DialogActivity.class);
                    intent.putExtra(DialogActivity.KEY_VI_DIALOG_MSG, str);
                    intent.putExtra(DialogActivity.KEY_VI_DIALOG_CANCELABLE, r3);
                    intent.putExtra(DialogActivity.KEY_VI_DIALOG_SHOW_PROGRESSBAR, r4);
                    intent.addFlags(65536);
                    DialogActivity.onBizCancelListener = r5;
                    if (DialogActivity.needOrCanShow()) {
                        MicroModuleContext.getInstance().startProdActivityByContext(intent);
                    }
                }
            }
        });
    }

    public void toast(final String str, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f4471a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ContextDialogHelper.access$000(ContextDialogHelper.this) != null) {
                        Context access$000 = ContextDialogHelper.access$000(ContextDialogHelper.this);
                        Toast toast = new Toast(access$000);
                        View inflate = LayoutInflater.from(access$000).inflate(R.layout.optimized_toast, (ViewGroup) null);
                        ((ImageView) inflate.findViewById(R.id.iv_symbol)).setBackgroundResource(i);
                        ((TextView) inflate.findViewById(R.id.message)).setText(str);
                        toast.setView(inflate);
                        toast.setDuration(i2);
                        toast.setGravity(17, 0, 0);
                        try {
                            toast.show();
                        } catch (Exception e) {
                            String access$100 = ContextDialogHelper.access$100();
                            VerifyLogCat.w(access$100, "DialogHelper.toast(): exception=" + e);
                        }
                    }
                }
            });
        }
    }
}
