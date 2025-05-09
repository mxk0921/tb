package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import tb.nwo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class opt extends ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ukj b;
    public com.taobao.share.ui.engine.render.b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements nwo.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ma4 f25561a;

        public a(ma4 ma4Var) {
            this.f25561a = ma4Var;
        }

        @Override // tb.nwo.e
        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a211a4c6", new Object[]{this, context});
            } else {
                opt.e(opt.this, context);
            }
        }

        @Override // tb.nwo.e
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("680a80b1", new Object[]{this, context});
            } else {
                opt.e(opt.this, context);
            }
        }

        @Override // tb.nwo.e
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e65661d7", new Object[]{this, str});
                return;
            }
            Thread.currentThread().getName();
            bwr.h().e().imgPath = str;
            opt.d(opt.this, this.f25561a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (opt.f(opt.this) != null) {
                opt.f(opt.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ma4 f25563a;

        public c(ma4 ma4Var) {
            this.f25563a = ma4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (opt.f(opt.this) == null) {
            } else {
                if ((!TextUtils.equals(ShareTargetType.Share2Copy.getValue(), this.f25563a.b()) || !ogs.b) && !ogs.c) {
                    gj8.a(this.f25563a.b(), null);
                    opt.f(opt.this).c();
                    return;
                }
                gj8.a(this.f25563a.b(), "code");
            }
        }
    }

    static {
        t2o.a(666894445);
    }

    public opt(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ void d(opt optVar, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c69684", new Object[]{optVar, ma4Var});
        } else {
            optVar.h(ma4Var);
        }
    }

    public static /* synthetic */ void e(opt optVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debcc123", new Object[]{optVar, context});
        } else {
            optVar.g(context);
        }
    }

    public static /* synthetic */ com.taobao.share.ui.engine.render.b f(opt optVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.ui.engine.render.b) ipChange.ipc$dispatch("5891f298", new Object[]{optVar});
        }
        return optVar.c;
    }

    public static /* synthetic */ Object ipc$super(opt optVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/interceptor/ThirdAppHandlerInterceptor");
    }

    @Override // tb.ksa
    public void b(Context context, ma4 ma4Var, int i, com.taobao.share.ui.engine.render.b bVar) {
        ComponentType c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0736b2", new Object[]{this, context, ma4Var, new Integer(i), bVar});
            return;
        }
        this.c = bVar;
        com.taobao.share.ui.engine.render.a aVar = bVar.b;
        if (aVar instanceof ukj) {
            this.b = (ukj) aVar;
        }
        if (ma4Var == null) {
            c2 = ComponentType.CONTACT_ITEM;
        } else {
            c2 = ma4Var.c();
        }
        String str = c2.desc;
        if (ma4Var != null && TextUtils.equals(str, ComponentType.CHANNEL_ITEM.desc)) {
            if (tn1.m(bwr.h().e().businessId)) {
                Thread.currentThread().getName();
                this.f22885a.h(ma4Var.b(), false, new a(ma4Var));
                return;
            }
            h(ma4Var);
        }
    }

    @Override // tb.ksa
    public boolean c(Context context, ma4 ma4Var, int i, com.taobao.share.ui.engine.render.b bVar) {
        ComponentType c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18e050", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        if (ma4Var == null) {
            c2 = ComponentType.CONTACT_ITEM;
        } else {
            c2 = ma4Var.c();
        }
        String str = c2.desc;
        if (ma4Var == null || !TextUtils.equals(str, ComponentType.CHANNEL_ITEM.desc)) {
            return false;
        }
        return true;
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9c03f8", new Object[]{this, context});
        } else if (context != null) {
            Toast makeText = Toast.makeText(context, Localization.q(R.string.taobao_app_1010_1_17885), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    public final void h(ma4 ma4Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d04c68b", new Object[]{this, ma4Var});
            return;
        }
        kjp.c(ma4Var.b(), null);
        AnalyticsUtil.traceViewClickOthers(ma4Var, bwr.h().e().url);
        if (this.b == null) {
            new Handler().postDelayed(new c(ma4Var), 500L);
        } else if (TextUtils.equals(ShareTargetType.Share2Copy.getValue(), ma4Var.b())) {
            this.b.h().t();
            this.b.h().p();
            new Handler().postDelayed(new b(), 500L);
        } else {
            ukj ukjVar = this.b;
            if (TextUtils.equals(ShareTargetType.Share2QRCode.getValue(), ma4Var.b()) || TextUtils.equals(ShareTargetType.Share2ScanCode.getValue(), ma4Var.b())) {
                z = false;
            }
            ukjVar.j = z;
            com.taobao.share.ui.engine.render.b bVar = this.c;
            if (bVar != null) {
                bVar.c();
            }
        }
    }
}
