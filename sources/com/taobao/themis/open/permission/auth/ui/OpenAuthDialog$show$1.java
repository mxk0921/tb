package com.taobao.themis.open.permission.auth.ui;

import android.app.AlertDialog;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.permission.auth.model.AuthAgreementModel;
import com.taobao.themis.open.permission.auth.model.AuthTextModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xcs;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class OpenAuthDialog$show$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ OpenAuthDialog this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f13667a;
        public final /* synthetic */ RelativeLayout b;

        public a(LinearLayout linearLayout, RelativeLayout relativeLayout) {
            this.f13667a = linearLayout;
            this.b = relativeLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f13667a.setVisibility(0);
            this.b.setVisibility(8);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OpenAuthDialog f13668a;

        public b(OpenAuthDialog openAuthDialog) {
            this.f13668a = openAuthDialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            List<AuthAgreementModel> a2 = OpenAuthDialog.d(this.f13668a).a();
            if (a2 != null && !a2.isEmpty()) {
                OpenAuthDialog openAuthDialog = this.f13668a;
                OpenAuthDialog.h(openAuthDialog, OpenAuthDialog.a(openAuthDialog), OpenAuthDialog.d(this.f13668a).a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OpenAuthDialog f13669a;

        public c(OpenAuthDialog openAuthDialog) {
            this.f13669a = openAuthDialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            AlertDialog b = OpenAuthDialog.b(this.f13669a);
            if (b != null) {
                b.dismiss();
            }
            OpenAuthDialog.c(this.f13669a).a(OpenAuthDialog.f(this.f13669a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OpenAuthDialog f13670a;

        public d(OpenAuthDialog openAuthDialog) {
            this.f13670a = openAuthDialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            AlertDialog b = OpenAuthDialog.b(this.f13670a);
            if (b != null) {
                b.dismiss();
            }
            OpenAuthDialog.c(this.f13670a).b(OpenAuthDialog.f(this.f13670a));
            if (TMSInstanceExtKt.v(OpenAuthDialog.e(this.f13670a))) {
                OpenAuthDialog.i(this.f13670a);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f13671a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ TUrlImageView c;
        public final /* synthetic */ OpenAuthDialog d;
        public final /* synthetic */ TextView e;

        public e(LinearLayout linearLayout, TextView textView, TUrlImageView tUrlImageView, OpenAuthDialog openAuthDialog, TextView textView2) {
            this.f13671a = linearLayout;
            this.b = textView;
            this.c = tUrlImageView;
            this.d = openAuthDialog;
            this.e = textView2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int measuredWidth = this.f13671a.getMeasuredWidth();
            int measuredWidth2 = this.b.getMeasuredWidth();
            if (measuredWidth2 == 0) {
                this.b.measure(-2, -2);
                measuredWidth2 = this.b.getMeasuredWidth();
            }
            this.e.setMaxWidth(((measuredWidth - this.c.getMeasuredWidth()) - measuredWidth2) - xcs.a(OpenAuthDialog.a(this.d), 45.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAuthDialog$show$1(OpenAuthDialog openAuthDialog) {
        super(0);
        this.this$0 = openAuthDialog;
    }

    public static /* synthetic */ Object ipc$super(OpenAuthDialog$show$1 openAuthDialog$show$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/OpenAuthDialog$show$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!OpenAuthDialog.a(this.this$0).isFinishing()) {
            View inflate = View.inflate(OpenAuthDialog.a(this.this$0), R.layout.tms_dialog_auth, null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_auth_list);
            List<AuthTextModel> e2 = OpenAuthDialog.d(this.this$0).e();
            if (e2 == null) {
                e2 = yz3.i();
            }
            recyclerView.setAdapter(new SingleAuthAdapter(e2));
            recyclerView.setLayoutManager(new LinearLayoutManager(OpenAuthDialog.a(this.this$0)));
            View findViewById = inflate.findViewById(R.id.layout_auth_positive);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_use_protocol);
            ((ImageView) inflate.findViewById(R.id.iv_detail_back)).setOnClickListener(new a((LinearLayout) inflate.findViewById(R.id.layout_auth), (RelativeLayout) inflate.findViewById(R.id.layout_auth_detail)));
            SpannableString spannableString = new SpannableString("同意《用户授权协议》");
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#131415")), 2, 10, 18);
            textView.setText(spannableString);
            textView.setOnClickListener(new b(this.this$0));
            ViewProxy.setOnClickListener(findViewById, new c(this.this$0));
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.open_auth_btn_grant_cancel), new d(this.this$0));
            OpenAuthDialog.g(this.this$0, new AlertDialog.Builder(OpenAuthDialog.a(this.this$0), R.style.tms_wopc_dialog_new).create());
            View findViewById2 = inflate.findViewById(R.id.open_auth_app_icon);
            ckf.f(findViewById2, "view.findViewById(R.id.open_auth_app_icon)");
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById2;
            tUrlImageView.addFeature(new RoundFeature());
            tUrlImageView.setImageUrl(OpenAuthDialog.d(this.this$0).c());
            View findViewById3 = inflate.findViewById(R.id.open_auth_grant_title);
            ckf.f(findViewById3, "view.findViewById(R.id.open_auth_grant_title)");
            TextView textView2 = (TextView) findViewById3;
            String b2 = OpenAuthDialog.d(this.this$0).b();
            if (b2 == null) {
                b2 = OpenAuthDialog.d(this.this$0).d();
            }
            textView2.setText(b2);
            textView2.post(new e((LinearLayout) inflate.findViewById(R.id.grant_layout), (TextView) inflate.findViewById(R.id.tv_text_hint), tUrlImageView, this.this$0, textView2));
            AlertDialog b3 = OpenAuthDialog.b(this.this$0);
            ckf.d(b3);
            b3.setCancelable(false);
            AlertDialog b4 = OpenAuthDialog.b(this.this$0);
            ckf.d(b4);
            if (!b4.isShowing()) {
                AlertDialog b5 = OpenAuthDialog.b(this.this$0);
                ckf.d(b5);
                b5.show();
                AlertDialog b6 = OpenAuthDialog.b(this.this$0);
                ckf.d(b6);
                Window window = b6.getWindow();
                if (window != null) {
                    window.setContentView(inflate);
                }
                AlertDialog b7 = OpenAuthDialog.b(this.this$0);
                ckf.d(b7);
                Window window2 = b7.getWindow();
                if (window2 != null) {
                    window2.setGravity(80);
                }
                AlertDialog b8 = OpenAuthDialog.b(this.this$0);
                ckf.d(b8);
                Window window3 = b8.getWindow();
                if (window3 != null) {
                    window3.setWindowAnimations(R.style.tms_wopc_dialog_anim);
                }
                AlertDialog b9 = OpenAuthDialog.b(this.this$0);
                ckf.d(b9);
                Window window4 = b9.getWindow();
                if (window4 != null) {
                    window4.setLayout(-1, -2);
                }
            }
        }
    }
}
