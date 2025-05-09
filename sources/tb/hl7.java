package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x5a;
import zoloz.ap.com.toolkit.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hl7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DialogHelper";

    /* renamed from: a  reason: collision with root package name */
    public Activity f20720a;
    public AlertDialog b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20721a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DialogInterface.OnClickListener d;
        public final /* synthetic */ String e;
        public final /* synthetic */ DialogInterface.OnClickListener f;

        public a(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
            this.f20721a = str;
            this.b = str2;
            this.c = str3;
            this.d = onClickListener;
            this.e = str4;
            this.f = onClickListener2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hl7.a(hl7.this) != null && !hl7.a(hl7.this).isFinishing()) {
                x5a.e eVar = new x5a.e(hl7.a(hl7.this));
                String str = this.f20721a;
                if (str != null) {
                    eVar.d(str);
                }
                String str2 = this.b;
                if (str2 != null) {
                    eVar.a(str2);
                }
                String str3 = this.c;
                if (str3 != null) {
                    eVar.c(str3, this.d);
                }
                String str4 = this.e;
                if (str4 != null) {
                    eVar.b(str4, this.f);
                }
                eVar.e(false);
                eVar.g(false);
                eVar.h(false);
                x5a f = eVar.f();
                hl7.c(hl7.this, f);
                f.setCancelable(false);
                f.setCanceledOnTouchOutside(false);
                f.getWindow().setGravity(17);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20722a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ DialogInterface.OnCancelListener d;

        public b(String str, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
            this.f20722a = str;
            this.b = z;
            this.c = z2;
            this.d = onCancelListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hl7.a(hl7.this) != null && !hl7.a(hl7.this).isFinishing()) {
                hl7 hl7Var = hl7.this;
                hl7 hl7Var2 = hl7.this;
                hl7.c(hl7Var, new f(hl7Var2, hl7.a(hl7Var2)));
                hl7.b(hl7.this).setMessage(this.f20722a);
                ((f) hl7.b(hl7.this)).c(this.b);
                hl7.b(hl7.this).setCancelable(this.c);
                hl7.b(hl7.this).setOnCancelListener(this.d);
                hl7.b(hl7.this).setCanceledOnTouchOutside(false);
                hl7.b(hl7.this).getWindow().setGravity(17);
                hl7.b(hl7.this).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hl7.b(hl7.this) != null && hl7.b(hl7.this).isShowing() && !hl7.a(hl7.this).isFinishing()) {
                try {
                    hl7.b(hl7.this).dismiss();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hl7.b(hl7.this) != null && hl7.b(hl7.this).isShowing()) {
                try {
                    hl7.b(hl7.this).dismiss();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f20725a;
        public final /* synthetic */ DialogInterface.OnCancelListener b;

        public e(boolean z, DialogInterface.OnCancelListener onCancelListener) {
            this.f20725a = z;
            this.b = onCancelListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hl7.a(hl7.this) != null && !hl7.a(hl7.this).isFinishing()) {
                hl7 hl7Var = hl7.this;
                hl7 hl7Var2 = hl7.this;
                hl7.c(hl7Var, new g(hl7Var2, hl7.a(hl7Var2)));
                hl7.b(hl7.this).setCancelable(this.f20725a);
                hl7.b(hl7.this).setOnCancelListener(this.b);
                hl7.b(hl7.this).setCanceledOnTouchOutside(false);
                hl7.b(hl7.this).getWindow().setGravity(17);
                hl7.b(hl7.this).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f extends AlertDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ProgressBar f20726a;
        public TextView b;
        public CharSequence c;
        public boolean d;
        public boolean e;

        static {
            t2o.a(245367012);
        }

        public f(hl7 hl7Var, Context context) {
            super(context, R.style.process_style);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in zoloz/ap/com/toolkit/ui/DialogHelper$ZolozProgressDialog");
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
                return;
            }
            ProgressBar progressBar = this.f20726a;
            if (progressBar != null) {
                progressBar.setIndeterminate(z);
            } else {
                this.d = z;
            }
        }

        public final void b() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72030d1e", new Object[]{this});
                return;
            }
            this.b.setText(this.c);
            CharSequence charSequence = this.c;
            if (charSequence == null || "".equals(charSequence)) {
                this.b.setVisibility(8);
            }
            ProgressBar progressBar = this.f20726a;
            if (!this.e) {
                i = 8;
            }
            progressBar.setVisibility(i);
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5a59b7b", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            setContentView(R.layout.layout_progress_dialog);
            this.f20726a = (ProgressBar) findViewById(16908301);
            this.b = (TextView) findViewById(R.id.message);
            b();
            a(this.d);
        }

        @Override // android.app.AlertDialog
        public void setMessage(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
            } else {
                this.c = charSequence;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class g extends AlertDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(245367013);
        }

        public g(hl7 hl7Var, Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in zoloz/ap/com/toolkit/ui/DialogHelper$ZolozSuccessDialog");
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            setContentView(R.layout.layout_upload_success);
        }
    }

    static {
        t2o.a(245367006);
    }

    public hl7(Activity activity) {
        this.f20720a = activity;
    }

    public static /* synthetic */ Activity a(hl7 hl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("6140ee01", new Object[]{hl7Var});
        }
        return hl7Var.f20720a;
    }

    public static /* synthetic */ AlertDialog b(hl7 hl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("d5e6b63", new Object[]{hl7Var});
        }
        return hl7Var.b;
    }

    public static /* synthetic */ AlertDialog c(hl7 hl7Var, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("1539b8fc", new Object[]{hl7Var, alertDialog});
        }
        hl7Var.b = alertDialog;
        return alertDialog;
    }

    public void d(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            e(str, str2, str3, onClickListener, str4, onClickListener2, Boolean.FALSE);
        }
    }

    public void e(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82bc296", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
            return;
        }
        Boolean bool2 = Boolean.FALSE;
        f(str, str2, str3, onClickListener, str4, onClickListener2, bool2, bool2);
    }

    public void f(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65c68f7", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool, bool2});
            return;
        }
        g();
        AlertDialog alertDialog = this.b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.f20720a.runOnUiThread(new a(str, str2, str3, onClickListener, str4, onClickListener2));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
        } else {
            this.f20720a.runOnUiThread(new c());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1689904e", new Object[]{this});
        } else {
            this.f20720a.runOnUiThread(new d());
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        AlertDialog alertDialog = this.b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        return true;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.f20720a = null;
        this.b = null;
    }

    public void k(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
        } else {
            this.f20720a = activity;
        }
    }

    public void l(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        g();
        this.f20720a.runOnUiThread(new b(str, z2, z, onCancelListener));
    }

    public void m(boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8fbaf8", new Object[]{this, new Boolean(z), onCancelListener});
            return;
        }
        g();
        this.f20720a.runOnUiThread(new e(z, onCancelListener));
    }
}
