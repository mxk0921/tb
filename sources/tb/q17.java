package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.alibaba.android.split.ui.DefaultProgress;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q17 implements vfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Dialog e = null;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f26439a;
    public final DialogInterface.OnCancelListener b;
    public final DialogInterface.OnShowListener c;
    public final DialogInterface.OnDismissListener d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vfc f26440a;

        public a(vfc vfcVar) {
            this.f26440a = vfcVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else if (this.f26440a.d() != null) {
                this.f26440a.d().onDismiss(dialogInterface);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vfc f26441a;

        public b(vfc vfcVar) {
            this.f26441a = vfcVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            } else if (this.f26441a.b() != null) {
                this.f26441a.b().onCancel(dialogInterface);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements DialogInterface.OnShowListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vfc f26442a;

        public c(vfc vfcVar) {
            this.f26442a = vfcVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
            } else if (this.f26442a.c() != null) {
                this.f26442a.c().onShow(dialogInterface);
            }
        }
    }

    static {
        t2o.a(676331682);
        t2o.a(676331691);
    }

    public q17(Activity activity) {
        this(activity, null, null, null);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[0]);
            return;
        }
        Dialog dialog = e;
        if (dialog != null && !dialog.getOwnerActivity().isFinishing()) {
            try {
                if (e.isShowing()) {
                    e.dismiss();
                    e = null;
                }
            } catch (Throwable unused) {
                e = null;
            }
        }
    }

    public static void f(vfc vfcVar) {
        Activity ownerActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56c6988", new Object[]{vfcVar});
        } else if (!f && vfcVar != null) {
            Dialog a2 = vfcVar.a();
            e = a2;
            if (a2 != null && (ownerActivity = a2.getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
                e.setOnDismissListener(new a(vfcVar));
                e.setOnCancelListener(new b(vfcVar));
                e.setOnShowListener(new c(vfcVar));
                if (e != null && !ownerActivity.isFinishing() && !e.isShowing()) {
                    try {
                        e.show();
                        f = true;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    @Override // tb.vfc
    public Dialog a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("9ba1a8c4", new Object[]{this});
        }
        if (this.f26439a.isFinishing()) {
            return null;
        }
        Dialog dialog = new Dialog(this.f26439a, R.style.feature_default_dialog);
        dialog.setOwnerActivity(this.f26439a);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        DefaultProgress defaultProgress = new DefaultProgress(this.f26439a);
        int i = (int) (this.f26439a.getResources().getDisplayMetrics().density * 96.0f);
        dialog.setContentView(defaultProgress, new ViewGroup.LayoutParams(i, i));
        return dialog;
    }

    @Override // tb.vfc
    public DialogInterface.OnCancelListener b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnCancelListener) ipChange.ipc$dispatch("d1f18445", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.vfc
    public DialogInterface.OnShowListener c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnShowListener) ipChange.ipc$dispatch("aceed57f", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.vfc
    public DialogInterface.OnDismissListener d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnDismissListener) ipChange.ipc$dispatch("1daee1cb", new Object[]{this});
        }
        return this.d;
    }

    public q17(Activity activity, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener) {
        this.f26439a = activity;
        this.b = onCancelListener;
        this.d = onDismissListener;
        this.c = onShowListener;
    }
}
