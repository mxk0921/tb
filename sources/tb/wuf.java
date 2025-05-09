package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.themis.external.embed.TMSEmbed;
import java.net.URLEncoder;
import tb.ce0;
import tb.xb3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wuf implements wad {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public yb3 f30930a;
    public ce0 b;
    public boolean c;
    public long d;
    public final Activity e;
    public final com.taobao.android.opencart.a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final wuf a(Activity activity, com.taobao.android.opencart.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wuf) ipChange.ipc$dispatch("c18c504d", new Object[]{this, activity, aVar});
            }
            ckf.g(activity, "activity");
            ckf.g(aVar, "mtopContext");
            return new wuf(activity, aVar, null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends xb3.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yb3 f30931a;

        public b(wuf wufVar, yb3 yb3Var) {
            this.f30931a = yb3Var;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/weex/JoinGroupWeexInstance$show$$inlined$apply$lambda$1");
        }

        @Override // tb.xb3.a
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd74a62f", new Object[]{this, view});
                return;
            }
            ckf.g(view, "containerView");
            View e = this.f30931a.e();
            if (e != null) {
                e.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(yb3 yb3Var) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1799497502) {
                super.c((String) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == -302283915) {
                super.n();
                return null;
            } else if (hashCode == 2123836685) {
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/opencart/weex/JoinGroupWeexInstance$show$$inlined$apply$lambda$2");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public boolean b(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            wuf.d(wuf.this);
            return true;
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.c(str, str2);
            wuf.e(wuf.this);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.l(str, str2);
            wuf.e(wuf.this);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            wuf.f(wuf.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements ce0.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ce0.h
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue();
            }
            return wuf.c(wuf.this);
        }

        @Override // tb.ce0.h
        public void onAnimationEnd() {
            View e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
                return;
            }
            hav.d("JoinGroupWeexInstance", "onAnimationEnd isWeexLoadSuccess=" + a());
            if (!wuf.c(wuf.this)) {
                nuv.d("OpenCart_Addbag_VLView_DoNotLoadSuccessAfterAnimation", new String[0]);
                StringBuilder sb = new StringBuilder("vlview do not load success in ");
                ce0 a2 = wuf.a(wuf.this);
                sb.append(a2 != null ? Long.valueOf(a2.g()) : null);
                sb.append(" second");
                hav.d("JoinGroupWeexInstance", sb.toString());
                wuf.this.dismiss();
                return;
            }
            yb3 b = wuf.b(wuf.this);
            if (b != null && (e = b.e()) != null) {
                e.setAlpha(1.0f);
            }
        }
    }

    public wuf(Activity activity, com.taobao.android.opencart.a aVar) {
        this.e = activity;
        this.f = aVar;
        l();
    }

    public static final /* synthetic */ ce0 a(wuf wufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ce0) ipChange.ipc$dispatch("3180cea", new Object[]{wufVar});
        }
        return wufVar.b;
    }

    public static final /* synthetic */ yb3 b(wuf wufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yb3) ipChange.ipc$dispatch("5d5c2eac", new Object[]{wufVar});
        }
        return wufVar.f30930a;
    }

    public static final /* synthetic */ boolean c(wuf wufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e83540a9", new Object[]{wufVar})).booleanValue();
        }
        return wufVar.c;
    }

    public static final /* synthetic */ void d(wuf wufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858466bd", new Object[]{wufVar});
        } else {
            wufVar.i();
        }
    }

    public static final /* synthetic */ void e(wuf wufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f64f68a", new Object[]{wufVar});
        } else {
            wufVar.j();
        }
    }

    public static final /* synthetic */ void f(wuf wufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9dbfa45", new Object[]{wufVar});
        } else {
            wufVar.k();
        }
    }

    @Override // tb.wad
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        yb3 yb3Var = this.f30930a;
        if (yb3Var != null) {
            yb3Var.dismiss();
        }
    }

    public final String g() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject d2 = this.f.d();
        Uri.Builder buildUpon = Uri.parse(vb3.INSTANCE.a()).buildUpon();
        String str = null;
        if (d2 != null) {
            try {
                string = d2.getString("cartId");
            } catch (Exception unused) {
            }
        } else {
            string = null;
        }
        buildUpon.appendQueryParameter("cartId", string);
        if (d2 != null) {
            str = d2.getString("addToGroupExParams");
        }
        if (str != null) {
            buildUpon.appendQueryParameter("exParams", URLEncoder.encode(str, "UTF-8"));
        }
        AddBagModel c2 = this.f.c();
        ckf.f(c2, "mtopContext.addBagModel");
        AddBagModel.c endRect = c2.getEndRect();
        ckf.f(endRect, "endRect");
        buildUpon.appendQueryParameter("x", String.valueOf(endRect.h() + (endRect.g() / 2)));
        buildUpon.appendQueryParameter("y", String.valueOf(endRect.i() + endRect.f()));
        String uri = buildUpon.build().toString();
        ckf.f(uri, "uriBuilder.build().toString()");
        return uri;
    }

    @Override // tb.wad
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.e;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.f30930a != null) {
            return true;
        }
        return false;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
        } else if (t8l.b() && this.f.g()) {
            this.f30930a = new yb3(this.e);
            this.b = new ce0(this.e);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        yb3 yb3Var = this.f30930a;
        if (yb3Var == null) {
            return false;
        }
        this.d = System.currentTimeMillis();
        nuv.d("OpenCart_Addbag_VLView_Loading", new String[0]);
        xb3 xb3Var = new xb3(g(), 0L);
        xb3Var.e(new b(this, yb3Var));
        xb3Var.f(new c(yb3Var));
        xhv xhvVar = xhv.INSTANCE;
        yb3Var.h(xb3Var);
        ce0 ce0Var = this.b;
        if (ce0Var != null) {
            ce0Var.l(this.f.c(), new d());
        }
        return true;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfe6788", new Object[]{this});
        } else if (!this.f.b()) {
            String e = this.f.e();
            Activity activity = this.e;
            if (TextUtils.isEmpty(e)) {
                e = AddBagRequester.ADD_CART_SUCCESS;
            }
            m3q.a(activity, 2, e);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877656dd", new Object[]{this});
            return;
        }
        dismiss();
        if (this.f.f()) {
            n();
        }
        nuv.d("OpenCart_Addbag_VLView_LoadDowngrade", new String[0]);
        hav.d("JoinGroupWeexInstance", "vlview load onDowngrade, show toast");
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f00b2a", new Object[]{this});
            return;
        }
        dismiss();
        nuv.d("OpenCart_Addbag_VLView_LoadError", new String[0]);
        hav.d("JoinGroupWeexInstance", "vlview load error");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6b5265", new Object[]{this});
            return;
        }
        this.c = true;
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        hav.d("JoinGroupWeexInstance", "weex load finish " + currentTimeMillis + "ms");
    }

    public /* synthetic */ wuf(Activity activity, com.taobao.android.opencart.a aVar, a07 a07Var) {
        this(activity, aVar);
    }
}
