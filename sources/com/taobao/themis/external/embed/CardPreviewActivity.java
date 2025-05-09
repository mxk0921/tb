package com.taobao.themis.external.embed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.acq;
import tb.ckf;
import tb.d1a;
import tb.ies;
import tb.lqb;
import tb.sxl;
import tb.t2o;
import tb.wsq;
import tb.xcs;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/external/embed/CardPreviewActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Companion", "a", "themis_interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class CardPreviewActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "CardPreviewActivity";

    /* renamed from: a  reason: collision with root package name */
    public TMSEmbed f13508a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(838860803);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements lqb.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CardPreviewActivity f13510a;

            public a(CardPreviewActivity cardPreviewActivity) {
                this.f13510a = cardPreviewActivity;
            }

            @Override // tb.lqb.a
            public void onClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e155e360", new Object[]{this});
                } else {
                    this.f13510a.finish();
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.taobao.themis.external.embed.CardPreviewActivity$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class RunnableC0768b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CardPreviewActivity f13511a;

            public RunnableC0768b(CardPreviewActivity cardPreviewActivity) {
                this.f13511a = cardPreviewActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(this.f13511a, "onPop", 0).show();
                }
            }
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -936190188:
                    super.m();
                    return null;
                case -799572052:
                    super.d();
                    return null;
                case -302283915:
                    super.n();
                    return null;
                case 1131744663:
                    super.e();
                    return null;
                case 2123836685:
                    super.l((String) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/CardPreviewActivity$onCreate$1");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            TMSLogger.b(CardPreviewActivity.TAG, sxl.LAUNCHER_FINISH_TIME);
            TMSEmbed l3 = CardPreviewActivity.l3(CardPreviewActivity.this);
            String str = null;
            if (l3 != null) {
                lqb lqbVar = (lqb) l3.g(lqb.class);
                if (lqbVar != null) {
                    lqbVar.n1(new a(CardPreviewActivity.this));
                }
                if (lqbVar != null) {
                    str = lqbVar.getBusinessId();
                }
                TMSLogger.b(CardPreviewActivity.TAG, ckf.p("businessId: ", str));
                return;
            }
            ckf.y("card");
            throw null;
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            super.e();
            TMSLogger.b(CardPreviewActivity.TAG, sxl.LAUNCHER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3809a779", new Object[]{this});
                return;
            }
            CardPreviewActivity cardPreviewActivity = CardPreviewActivity.this;
            cardPreviewActivity.runOnUiThread(new RunnableC0768b(cardPreviewActivity));
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
            TMSLogger.b(CardPreviewActivity.TAG, "onRenderFailed errorCode:" + str + " errorMsg:" + str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            super.m();
            TMSLogger.b(CardPreviewActivity.TAG, sxl.RENDER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            TMSLogger.b(CardPreviewActivity.TAG, sxl.RENDER_SUCCESS_TIME);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TMSEmbed l3 = CardPreviewActivity.l3(CardPreviewActivity.this);
            if (l3 != null) {
                StartParams startParams = new StartParams();
                startParams.setUrl(this.b);
                TMSEmbed.t(l3, startParams, null, 2, null);
                return;
            }
            ckf.y("card");
            throw null;
        }
    }

    static {
        t2o.a(838860802);
    }

    public static /* synthetic */ Object ipc$super(CardPreviewActivity cardPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/CardPreviewActivity");
        }
    }

    public static final /* synthetic */ TMSEmbed l3(CardPreviewActivity cardPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("d6e6ac93", new Object[]{cardPreviewActivity});
        }
        return cardPreviewActivity.f13508a;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            tMSEmbed.l(i, i2, intent);
        } else {
            ckf.y("card");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TMSEmbedSolutionType tMSEmbedSolutionType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        final FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);
        final String stringExtra = getIntent().getStringExtra("oriUrl");
        String c2 = ies.c(stringExtra, "tms_solution");
        try {
            ckf.f(c2, "solution");
            String upperCase = c2.toUpperCase();
            ckf.f(upperCase, "this as java.lang.String).toUpperCase()");
            tMSEmbedSolutionType = Result.m1108constructorimpl(TMSEmbedSolutionType.valueOf(upperCase));
        } catch (Throwable th) {
            tMSEmbedSolutionType = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        TMSEmbedSolutionType tMSEmbedSolutionType2 = TMSEmbedSolutionType.WEB_SINGLE_PAGE;
        if (Result.m1114isFailureimpl(tMSEmbedSolutionType)) {
            tMSEmbedSolutionType = tMSEmbedSolutionType2;
        }
        TMSEmbedSolutionType tMSEmbedSolutionType3 = (TMSEmbedSolutionType) tMSEmbedSolutionType;
        boolean b2 = ckf.b(ies.c(stringExtra, "enable_async_create"), "true");
        final boolean b3 = ckf.b(ies.c(stringExtra, "forbid_render"), "true");
        String c3 = ies.c(stringExtra, "tms_reload_url");
        final String decode = c3 == null ? null : URLDecoder.decode(c3, "UTF-8");
        TMSEmbed tMSEmbed = new TMSEmbed(this, tMSEmbedSolutionType3);
        this.f13508a = tMSEmbed;
        tMSEmbed.r(new b());
        final int c4 = xcs.c(this);
        final int b4 = xcs.b(this);
        if (b2) {
            new Thread(new Runnable() { // from class: com.taobao.themis.external.embed.CardPreviewActivity$onCreate$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                /* renamed from: com.taobao.themis.external.embed.CardPreviewActivity$onCreate$2$2  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ String $reloadUrl;
                    public final /* synthetic */ FrameLayout $root;
                    public final /* synthetic */ CardPreviewActivity this$0;

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.themis.external.embed.CardPreviewActivity$onCreate$2$2$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                    public static final class a implements View.OnClickListener {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ CardPreviewActivity f13514a;
                        public final /* synthetic */ String b;

                        public a(CardPreviewActivity cardPreviewActivity, String str) {
                            this.f13514a = cardPreviewActivity;
                            this.b = str;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            TMSEmbed l3 = CardPreviewActivity.l3(this.f13514a);
                            if (l3 != null) {
                                StartParams startParams = new StartParams();
                                startParams.setUrl(this.b);
                                TMSEmbed.t(l3, startParams, null, 2, null);
                                return;
                            }
                            ckf.y("card");
                            throw null;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(CardPreviewActivity cardPreviewActivity, FrameLayout frameLayout, String str) {
                        super(0);
                        this.this$0 = cardPreviewActivity;
                        this.$root = frameLayout;
                        this.$reloadUrl = str;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/CardPreviewActivity$onCreate$2$2");
                    }

                    @Override // tb.d1a
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                            return;
                        }
                        TMSEmbed l3 = CardPreviewActivity.l3(this.this$0);
                        if (l3 != null) {
                            l3.u();
                            FrameLayout frameLayout = this.$root;
                            TMSEmbed l32 = CardPreviewActivity.l3(this.this$0);
                            if (l32 != null) {
                                frameLayout.addView(l32.h());
                                String str = this.$reloadUrl;
                                if (str != null && !wsq.a0(str)) {
                                    FrameLayout frameLayout2 = this.$root;
                                    Button button = new Button(this.this$0);
                                    CardPreviewActivity cardPreviewActivity = this.this$0;
                                    String str2 = this.$reloadUrl;
                                    button.setText("reload");
                                    button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                                    button.setOnClickListener(new a(cardPreviewActivity, str2));
                                    frameLayout2.addView(button);
                                    return;
                                }
                                return;
                            }
                            ckf.y("card");
                            throw null;
                        }
                        ckf.y("card");
                        throw null;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TMSEmbed l3 = CardPreviewActivity.l3(CardPreviewActivity.this);
                    if (l3 != null) {
                        Weex2StartParams weex2StartParams = new Weex2StartParams();
                        String str = stringExtra;
                        int i = c4;
                        int i2 = b4;
                        weex2StartParams.setUrl(str);
                        weex2StartParams.setAsyncCreate(true);
                        weex2StartParams.setPreRender(true);
                        weex2StartParams.setWidth(Integer.valueOf(i));
                        weex2StartParams.setHeight(Integer.valueOf(i2));
                        l3.i(weex2StartParams);
                        if (!b3) {
                            CommonExtKt.o(new AnonymousClass2(CardPreviewActivity.this, frameLayout, decode));
                            return;
                        }
                        return;
                    }
                    ckf.y("card");
                    throw null;
                }
            }).start();
            return;
        }
        TMSEmbed tMSEmbed2 = this.f13508a;
        if (tMSEmbed2 != null) {
            StartParams startParams = new StartParams();
            startParams.setUrl(stringExtra);
            tMSEmbed2.i(startParams);
            TMSEmbed tMSEmbed3 = this.f13508a;
            if (tMSEmbed3 != null) {
                tMSEmbed3.u();
                TMSEmbed tMSEmbed4 = this.f13508a;
                if (tMSEmbed4 != null) {
                    frameLayout.addView(tMSEmbed4.h());
                    if (decode != null && !wsq.a0(decode)) {
                        Button button = new Button(this);
                        button.setText("reload");
                        button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        button.setOnClickListener(new c(decode));
                        frameLayout.addView(button);
                        return;
                    }
                    return;
                }
                ckf.y("card");
                throw null;
            }
            ckf.y("card");
            throw null;
        }
        ckf.y("card");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        } else {
            ckf.y("card");
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            lqb lqbVar = (lqb) tMSEmbed.g(lqb.class);
            if (lqbVar == null) {
                return super.onKeyDown(i, keyEvent);
            }
            if (!lqbVar.c1()) {
                return super.onKeyDown(i, keyEvent);
            }
            lqbVar.O();
            return true;
        }
        ckf.y("card");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        } else {
            ckf.y("card");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        } else {
            ckf.y("card");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            tMSEmbed.n();
        } else {
            ckf.y("card");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TMSEmbed tMSEmbed = this.f13508a;
        if (tMSEmbed != null) {
            tMSEmbed.o();
        } else {
            ckf.y("card");
            throw null;
        }
    }
}
