package com.taobao.themis.open.permission.auth.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.open.permission.auth.model.AuthAgreementModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import tb.bbs;
import tb.bu;
import tb.ckf;
import tb.qj1;
import tb.rwd;
import tb.sj1;
import tb.t2o;
import tb.t8s;
import tb.why;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class OpenAuthDialog extends bu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Activity c;
    public final bbs d;
    public final qj1 e;
    public final List<String> f;
    public final sj1 g;
    public AlertDialog h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f13662a;
        public final /* synthetic */ List<AuthAgreementModel> b;

        public a(WebView webView, List<AuthAgreementModel> list) {
            this.f13662a = webView;
            this.b = list;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            List<AuthAgreementModel> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            if (i != 4) {
                return false;
            }
            if (this.f13662a.getVisibility() == 0 && (list = this.b) != null && list.size() > 1) {
                this.f13662a.setVisibility(8);
            } else if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AlertDialog f13663a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ List<AuthAgreementModel> c;

        public b(AlertDialog alertDialog, WebView webView, List<AuthAgreementModel> list) {
            this.f13663a = alertDialog;
            this.b = webView;
            this.c = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List<AuthAgreementModel> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!this.f13663a.isShowing()) {
            } else {
                if (this.b.getVisibility() != 0 || (list = this.c) == null || list.size() <= 1) {
                    this.f13663a.dismiss();
                } else {
                    this.b.setVisibility(8);
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f13664a;

        public c(d dVar) {
            this.f13664a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d dVar = this.f13664a;
            try {
                if (dVar.isShowing()) {
                    dVar.dismiss();
                }
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OpenAuthDialog f13666a;

            public a(OpenAuthDialog openAuthDialog) {
                this.f13666a = openAuthDialog;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                rwd V = OpenAuthDialog.e(this.f13666a).V();
                ckf.f(V, "instance.pageFactory");
                String b = t8s.b();
                ckf.f(b, "getAuthUrl()");
                OpenAuthDialog.e(this.f13666a).W().a(rwd.a.a(V, b, new Window(null, null, null, null, Integer.valueOf(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR)), Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, 131023, null), null, null, 8, null));
            }
        }

        public d(Activity activity, int i) {
            super(activity, i);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/OpenAuthDialog$showSettingTipsDialog$settingTipDialog$1");
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            setContentView(R.layout.tms_auth_cancel_tip_setting);
            android.view.Window window = getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.setFlags(32, 32);
            }
            ViewProxy.setOnClickListener(findViewById(R.id.layout_auth_go_setting), new a(OpenAuthDialog.this));
        }
    }

    static {
        t2o.a(843055354);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAuthDialog(Activity activity, bbs bbsVar, qj1 qj1Var, List<String> list, sj1 sj1Var) {
        super(bbsVar, qj1Var, list, sj1Var);
        ckf.g(activity, "activity");
        ckf.g(bbsVar, "instance");
        ckf.g(qj1Var, "contentModel");
        ckf.g(list, "scopeNicks");
        ckf.g(sj1Var, "callback");
        this.c = activity;
        this.d = bbsVar;
        this.e = qj1Var;
        this.f = list;
        this.g = sj1Var;
    }

    public static final /* synthetic */ Activity a(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("50d5c8e0", new Object[]{openAuthDialog});
        }
        return openAuthDialog.c;
    }

    public static final /* synthetic */ AlertDialog b(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("37e8a624", new Object[]{openAuthDialog});
        }
        return openAuthDialog.h;
    }

    public static final /* synthetic */ sj1 c(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sj1) ipChange.ipc$dispatch("7436906d", new Object[]{openAuthDialog});
        }
        return openAuthDialog.g;
    }

    public static final /* synthetic */ qj1 d(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qj1) ipChange.ipc$dispatch("4e6cb403", new Object[]{openAuthDialog});
        }
        return openAuthDialog.e;
    }

    public static final /* synthetic */ bbs e(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("c26c3664", new Object[]{openAuthDialog});
        }
        return openAuthDialog.d;
    }

    public static final /* synthetic */ List f(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b0b87f2", new Object[]{openAuthDialog});
        }
        return openAuthDialog.f;
    }

    public static final /* synthetic */ void g(OpenAuthDialog openAuthDialog, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1e4e36", new Object[]{openAuthDialog, alertDialog});
        } else {
            openAuthDialog.h = alertDialog;
        }
    }

    public static final /* synthetic */ void h(OpenAuthDialog openAuthDialog, Context context, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b9c084", new Object[]{openAuthDialog, context, list});
        } else {
            openAuthDialog.k(context, list);
        }
    }

    public static final /* synthetic */ void i(OpenAuthDialog openAuthDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d93f6ca", new Object[]{openAuthDialog});
        } else {
            openAuthDialog.l();
        }
    }

    public static /* synthetic */ Object ipc$super(OpenAuthDialog openAuthDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/OpenAuthDialog");
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            CommonExtKt.o(new OpenAuthDialog$show$1(this));
        }
    }

    public final void k(Context context, List<AuthAgreementModel> list) {
        String str;
        AuthAgreementModel authAgreementModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d090174", new Object[]{this, context, list});
            return;
        }
        View inflate = View.inflate(context, R.layout.tms_auth_pop_window, null);
        TextView textView = (TextView) inflate.findViewById(R.id.open_auth_desc_cancel_btn);
        WebView webView = (WebView) inflate.findViewById(R.id.open_auth_webview);
        webView.setWebViewClient(new WebViewClient() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$showAuthDescDialog$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(OpenAuthDialog$showAuthDescDialog$1 openAuthDialog$showAuthDescDialog$1, String str2, Object... objArr) {
                if (str2.hashCode() == 1172797237) {
                    return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
                }
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/OpenAuthDialog$showAuthDescDialog$1");
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("45e77735", new Object[]{this, webView2, webResourceRequest})).booleanValue();
                }
                ckf.g(webView2, "view");
                ckf.g(webResourceRequest, "request");
                return super.shouldOverrideUrlLoading(webView2, webResourceRequest);
            }
        });
        if (list == null || (authAgreementModel = list.get(0)) == null || (str = authAgreementModel.getLink()) == null) {
            str = "http://www.taobao.com/market/photo/topsq.php";
        }
        webView.loadUrl(str);
        AlertDialog create = new AlertDialog.Builder(context, R.style.tms_wopc_dialog).create();
        ckf.d(create);
        create.setOnKeyListener(new a(webView, list));
        create.setCancelable(false);
        create.show();
        android.view.Window window = create.getWindow();
        ckf.d(window);
        window.setContentView(inflate);
        android.view.Window window2 = create.getWindow();
        ckf.d(window2);
        window2.setLayout(-1, -1);
        textView.setOnClickListener(new b(create, webView, list));
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08ada9a", new Object[]{this});
            return;
        }
        d dVar = new d(this.c, R.style.tms_wopc_dialog_bg_transparent);
        dVar.show();
        CommonExtKt.p(new c(dVar), 3000L);
    }
}
