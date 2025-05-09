package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static vk0 c;

    /* renamed from: a  reason: collision with root package name */
    public hl7 f30058a;
    public Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bfb f30059a;

        public a(vk0 vk0Var, bfb bfbVar) {
            this.f30059a = bfbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            this.f30059a.onPositive();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bfb f30060a;

        public b(vk0 vk0Var, bfb bfbVar) {
            this.f30060a = bfbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            this.f30060a.onPositive();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bfb f30061a;

        public c(vk0 vk0Var, bfb bfbVar) {
            this.f30061a = bfbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            this.f30061a.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements bfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dfb f30062a;

        public d(vk0 vk0Var, dfb dfbVar) {
            this.f30062a = dfbVar;
        }

        @Override // tb.bfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cc3f9bb", new Object[]{this});
            }
        }

        @Override // tb.bfb
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
                return;
            }
            dfb dfbVar = this.f30062a;
            if (dfbVar != null) {
                dfbVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements bfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dfb f30063a;

        public e(vk0 vk0Var, dfb dfbVar) {
            this.f30063a = dfbVar;
        }

        @Override // tb.bfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cc3f9bb", new Object[]{this});
                return;
            }
            dfb dfbVar = this.f30063a;
            if (dfbVar != null) {
                dfbVar.b(false);
            }
        }

        @Override // tb.bfb
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
                return;
            }
            dfb dfbVar = this.f30063a;
            if (dfbVar != null) {
                dfbVar.b(true);
            }
        }
    }

    static {
        t2o.a(245366822);
    }

    public static vk0 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vk0) ipChange.ipc$dispatch("e1e82ee4", new Object[0]);
        }
        if (c == null) {
            synchronized (vk0.class) {
                try {
                    if (c == null) {
                        c = new vk0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(String str, String str2, String str3, String str4, bfb bfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe10f0", new Object[]{this, str, str2, str3, str4, bfbVar});
            return;
        }
        hl7 hl7Var = this.f30058a;
        if (hl7Var != null) {
            hl7Var.g();
            if (StringUtil.isNullorEmpty(str4)) {
                this.f30058a.d(str, str2, str3, new a(this, bfbVar), null, null);
            } else {
                this.f30058a.d(str, str2, str3, new b(this, bfbVar), str4, new c(this, bfbVar));
            }
        }
    }

    public void b(dfb dfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58efdd3b", new Object[]{this, dfbVar});
            return;
        }
        Context context = this.b;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            e().a(applicationContext.getString(R.string.network_error_title), applicationContext.getString(R.string.network_error_msg), applicationContext.getString(R.string.network_error_retry), applicationContext.getString(R.string.network_error_exit), new e(this, dfbVar));
        }
    }

    public void c(dfb dfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32645422", new Object[]{this, dfbVar});
            return;
        }
        Context context = this.b;
        if (context != null) {
            a(context.getApplicationContext().getString(R.string.system_error_title), this.b.getApplicationContext().getString(R.string.system_error_msg), this.b.getApplicationContext().getString(R.string.system_error_got_it), null, new d(this, dfbVar));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.f30058a;
        if (hl7Var != null) {
            hl7Var.g();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.f30058a;
        if (hl7Var != null) {
            hl7Var.j();
            this.f30058a = null;
        }
        c = null;
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        this.b = context;
        hl7 hl7Var = this.f30058a;
        if (hl7Var == null) {
            this.f30058a = new hl7((Activity) context);
        } else {
            hl7Var.k((Activity) context);
        }
    }

    public void h(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        hl7 hl7Var = this.f30058a;
        if (hl7Var != null) {
            hl7Var.l(str, z, onCancelListener, z2);
        }
    }
}
