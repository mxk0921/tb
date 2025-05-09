package com.taobao.android.hudong;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.hudong.TBHDActivity;
import com.taobao.android.hudong.bridge.LumosWVPlugin;
import com.taobao.android.nav.Nav;
import com.taobao.falco.m;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.acq;
import tb.ckf;
import tb.dxo;
import tb.fsw;
import tb.hzp;
import tb.i2c;
import tb.jpu;
import tb.l3c;
import tb.myu;
import tb.njg;
import tb.pbe;
import tb.pg1;
import tb.rcx;
import tb.s2d;
import tb.t2o;
import tb.uqx;
import tb.wk8;
import tb.woo;
import tb.wqg;
import tb.wsq;
import tb.xq;
import tb.yz3;
import tb.zq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/hudong/TBHDActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ltb/wqg;", "Ltb/l3c;", "<init>", "()V", "hudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TBHDActivity extends AppCompatActivity implements wqg, l3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public pbe b;
    public m c;
    public m d;
    public long h;
    public long i;
    public FrameLayout j;
    public TUrlImageView k;
    public TBActionView l;
    public ImageView m;
    public View n;
    public ImageView o;
    public TextView p;

    /* renamed from: a  reason: collision with root package name */
    public final String f7936a = "TBHDActivity";
    public final njg e = kotlin.a.b(new TBHDActivity$webUrl$2(this));
    public final njg f = kotlin.a.b(TBHDActivity$webStartParams$2.INSTANCE);
    public final njg g = kotlin.a.b(new TBHDActivity$tmsEmbedInstance$2(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends TypeReference<Map<String, ? extends String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            ckf.g(mVar, pg1.ATOM_EXT_span);
            TBHDActivity.u3(TBHDActivity.this, mVar);
            String r3 = TBHDActivity.r3(TBHDActivity.this);
            TLog.loge(r3, "spanCallback { parent=" + mVar + " }");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -936190188) {
                super.m();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/TBHDActivity$onCreate$1");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            super.m();
            TBHDActivity tBHDActivity = TBHDActivity.this;
            TBHDActivity.t3(tBHDActivity, (pbe) TBHDActivity.s3(tBHDActivity).g(pbe.class));
            if (!TBHDActivity.this.getIntent().getBooleanExtra(myu.HD_ALLOW_DUPLICATE_KEY, false)) {
                TBHDActivity tBHDActivity2 = TBHDActivity.this;
                TBHDActivity.q3(tBHDActivity2, TBHDActivity.p3(tBHDActivity2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            String r3 = TBHDActivity.r3(TBHDActivity.this);
            TLog.loge(r3, "onCallback { result=" + executeResult + " }");
        }
    }

    static {
        t2o.a(1031798786);
        t2o.a(1031798811);
    }

    public TBHDActivity() {
        new LinkedHashMap();
    }

    public static final void J3(TBHDActivity tBHDActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0a499e", new Object[]{tBHDActivity, view});
            return;
        }
        ckf.g(tBHDActivity, "this$0");
        tBHDActivity.finish();
    }

    public static final void K3(TBHDActivity tBHDActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786b4d7d", new Object[]{tBHDActivity, view});
            return;
        }
        ckf.g(tBHDActivity, "this$0");
        tBHDActivity.finish();
    }

    public static /* synthetic */ Object ipc$super(TBHDActivity tBHDActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/TBHDActivity");
        }
    }

    public static final /* synthetic */ pbe p3(TBHDActivity tBHDActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pbe) ipChange.ipc$dispatch("df40de2f", new Object[]{tBHDActivity});
        }
        return tBHDActivity.b;
    }

    public static final /* synthetic */ void q3(TBHDActivity tBHDActivity, pbe pbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2a36c5", new Object[]{tBHDActivity, pbeVar});
        } else {
            tBHDActivity.y3(pbeVar);
        }
    }

    public static final /* synthetic */ String r3(TBHDActivity tBHDActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7964995e", new Object[]{tBHDActivity});
        }
        return tBHDActivity.f7936a;
    }

    public static final /* synthetic */ TMSEmbed s3(TBHDActivity tBHDActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("8b19d78a", new Object[]{tBHDActivity});
        }
        return tBHDActivity.B3();
    }

    public static final /* synthetic */ void t3(TBHDActivity tBHDActivity, pbe pbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adaaaa7", new Object[]{tBHDActivity, pbeVar});
        } else {
            tBHDActivity.b = pbeVar;
        }
    }

    public static final /* synthetic */ void u3(TBHDActivity tBHDActivity, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc3c7e5", new Object[]{tBHDActivity, mVar});
        } else {
            tBHDActivity.c = mVar;
        }
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef91b691", new Object[]{this});
        } else {
            FalcoGlobalTracer.get().j(new b());
        }
    }

    public final TMSEmbed B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("10bac2ff", new Object[]{this});
        }
        return (TMSEmbed) this.g.getValue();
    }

    public final WebStartParams C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebStartParams) ipChange.ipc$dispatch("4874bb2a", new Object[]{this});
        }
        return (WebStartParams) this.f.getValue();
    }

    public final String D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aece1b28", new Object[]{this});
        }
        return (String) this.e.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        wk8.INSTANCE.b(yz3.l(wk8.EVENT_HIDE_BACK_ICON, wk8.EVENT_SHOW_BACK_ICON, wk8.EVENT_SET_NAV_BAR_STYLE), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        TLog.loge(this.f7936a, ckf.p("onNewIntent url=", intent.getData()));
        if (intent.getData() != null) {
            myu myuVar = myu.INSTANCE;
            Uri data = intent.getData();
            ckf.d(data);
            if (myuVar.d(data, intent)) {
                if (!ckf.b(C3().getUrl(), intent.getData().toString())) {
                    C3().setUrl(intent.getData().toString());
                    B3().s(C3(), null);
                    return;
                }
                return;
            }
        }
        Nav.from(this).toUri(intent.getData());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        x3();
        F3();
        super.onPause();
        B3().k();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        B3().m();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "TBHDActivity");
        A3();
    }

    @Override // tb.wqg
    public void onSetActivityTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e714bbe", new Object[]{this});
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        B3().n();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        B3().o();
    }

    public final String w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        String queryParameter = Uri.parse(D3()).getQueryParameter("uniapp_id");
        if (queryParameter == null) {
            queryParameter = getIntent().getStringExtra(myu.HD_APP_ID_KEY);
        }
        return queryParameter == null ? "" : queryParameter;
    }

    public final void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4200057", new Object[]{this});
            return;
        }
        m mVar = this.c;
        String str = this.f7936a;
        TLog.loge(str, "getChildSpan { parent=" + this.c + " }");
        if (mVar != null) {
            m e = FalcoGlobalTracer.get().d(m.MODULE, "tap").f(mVar).g(mVar.z()).e();
            this.d = e;
            if (e != null) {
                e.r0(mVar);
            }
        }
    }

    public final void y3(pbe pbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16de1c7a", new Object[]{this, pbeVar});
            return;
        }
        if (pbeVar == null) {
            pbeVar = null;
        } else {
            final WeakReference weakReference = new WeakReference(this);
            pbeVar.evaluateJavascript("(function(){var e=document.getElementsByName('unique-bizid')[0];return (e&&e.getAttribute('content'))||''})()", new ValueCallback() { // from class: tb.hdr
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    TBHDActivity.z3(weakReference, this, (String) obj);
                }
            });
        }
        if (pbeVar == null) {
            TLog.loge(this.f7936a, "IWebControllerExtension is null");
        }
    }

    @Override // tb.l3c
    public void onEvent(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5db5b9", new Object[]{this, str, map});
        } else if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -930123444) {
                if (hashCode != -553458161) {
                    if (hashCode == 1279759892 && str.equals(wk8.EVENT_HIDE_BACK_ICON)) {
                        TUrlImageView tUrlImageView = this.k;
                        if (tUrlImageView != null) {
                            tUrlImageView.setVisibility(8);
                        } else {
                            ckf.y("backIcon");
                            throw null;
                        }
                    }
                } else if (str.equals(wk8.EVENT_SHOW_BACK_ICON)) {
                    TUrlImageView tUrlImageView2 = this.k;
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setVisibility(0);
                    } else {
                        ckf.y("backIcon");
                        throw null;
                    }
                }
            } else if (str.equals(wk8.EVENT_SET_NAV_BAR_STYLE)) {
                Object obj = map == null ? null : map.get("title");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 == null) {
                    str2 = "";
                }
                TextView textView = this.p;
                if (textView != null) {
                    textView.setText(str2);
                    if (wsq.a0(str2)) {
                        FrameLayout frameLayout = this.j;
                        if (frameLayout != null) {
                            frameLayout.setBackgroundColor(0);
                        } else {
                            ckf.y("navBar");
                            throw null;
                        }
                    } else {
                        FrameLayout frameLayout2 = this.j;
                        if (frameLayout2 != null) {
                            frameLayout2.setBackgroundColor(Color.parseColor("#F7F7F7"));
                        } else {
                            ckf.y("navBar");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("titleText");
                    throw null;
                }
            }
        }
    }

    public final void v3(Bundle bundle, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3611a3fb", new Object[]{this, bundle, frameLayout});
        } else if (bundle != null) {
            Map map = (Map) JSON.parseObject(bundle.getString(pg1.ATOM_EXT_window), new a(), new Feature[0]);
            if (ckf.b((String) map.get("colorStyle"), "1")) {
                E3("light");
            } else {
                E3(ThemeUtils.COLOR_SCHEME_DARK);
            }
            TextView textView = this.p;
            if (textView != null) {
                textView.setText((CharSequence) map.get("title"));
                if (ckf.b(map.get("transparent"), "true")) {
                    frameLayout.setBackgroundColor(0);
                    return;
                }
                CharSequence charSequence = (CharSequence) map.get("navbarBgColor");
                if (charSequence != null && charSequence.length() != 0) {
                    frameLayout.setBackgroundColor(Color.parseColor((String) map.get("navbarBgColor")));
                    return;
                }
                return;
            }
            ckf.y("titleText");
            throw null;
        }
    }

    public static final void z3(WeakReference weakReference, TBHDActivity tBHDActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55f6584", new Object[]{weakReference, tBHDActivity, str});
            return;
        }
        ckf.g(weakReference, "$h5WeakReference");
        ckf.g(tBHDActivity, "this$0");
        ckf.f(str, "value");
        String R0 = wsq.R0(str, '\"');
        if (!wsq.a0(R0)) {
            hzp hzpVar = hzp.INSTANCE;
            hzpVar.b(R0, weakReference);
            hzpVar.a(R0, weakReference);
            AppMonitor.Alarm.commitSuccess(tBHDActivity.f7936a, uqx.ZIM_IDENTIFY_GET_META_INFO, ckf.p("unique-bizid=", R0));
            return;
        }
        AppMonitor.Alarm.commitFail(tBHDActivity.f7936a, uqx.ZIM_IDENTIFY_GET_META_INFO, "", ckf.p("unique-bizid=", R0));
    }

    public final void E3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78293330", new Object[]{this, str});
        } else if (ckf.b(str, ThemeUtils.COLOR_SCHEME_DARK)) {
            View view = this.n;
            if (view != null) {
                view.setAlpha(0.2f);
                ImageView imageView = this.o;
                if (imageView != null) {
                    imageView.setBackgroundResource(R.drawable.tms_pub_rectangle_bg_dark);
                    ImageView imageView2 = this.m;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.tms_pub_back_home_light);
                        TBActionView tBActionView = this.l;
                        if (tBActionView != null) {
                            tBActionView.setIconColor(-1);
                            TUrlImageView tUrlImageView = this.k;
                            if (tUrlImageView != null) {
                                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01P6gSa71i3YOxUkLZs_!!6000000004357-2-tps-90-90.png");
                                new SystemBarDecorator(this).enableImmersiveStatusBar(false);
                                return;
                            }
                            ckf.y("backIcon");
                            throw null;
                        }
                        ckf.y("moreIcon");
                        throw null;
                    }
                    ckf.y("finishIcon");
                    throw null;
                }
                ckf.y("moreAndCloseBg");
                throw null;
            }
            ckf.y("verticalLine");
            throw null;
        } else {
            View view2 = this.n;
            if (view2 != null) {
                view2.setAlpha(0.08f);
                ImageView imageView3 = this.o;
                if (imageView3 != null) {
                    imageView3.setBackgroundResource(R.drawable.tms_pub_rectangle_bg_white);
                    ImageView imageView4 = this.m;
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.tms_pub_back_home_dark);
                        TBActionView tBActionView2 = this.l;
                        if (tBActionView2 != null) {
                            tBActionView2.setIconColor(Color.parseColor("#333333"));
                            TUrlImageView tUrlImageView2 = this.k;
                            if (tUrlImageView2 != null) {
                                tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01xOOyIU22I1E953tud_!!6000000007096-2-tps-90-90.png");
                                new SystemBarDecorator(this).enableImmersiveStatusBar(true);
                                return;
                            }
                            ckf.y("backIcon");
                            throw null;
                        }
                        ckf.y("moreIcon");
                        throw null;
                    }
                    ckf.y("finishIcon");
                    throw null;
                }
                ckf.y("moreAndCloseBg");
                throw null;
            }
            ckf.y("verticalLine");
            throw null;
        }
    }

    public final void F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11d6553", new Object[]{this});
            return;
        }
        i2c i2cVar = (i2c) B3().g(i2c.class);
        if (i2cVar != null) {
            long j = this.i;
            if (j > 0) {
                long j2 = this.h;
                if (j2 > 0 && j > j2) {
                    i2cVar.M(kotlin.collections.a.j(jpu.a("routeStart", Long.valueOf(j2)), jpu.a("routeEnd", Long.valueOf(this.i))), TMSRumTarget.STANDARD);
                }
            }
            m mVar = this.d;
            if (mVar != null) {
                ckf.d(mVar);
                i2cVar.T(mVar);
                return;
            }
            return;
        }
        TLog.loge(this.f7936a, "IEmbedRumExtension is null");
    }

    public final void G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a396939", new Object[]{this});
            return;
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(R.id.menu_item_share).setTitle("ꄪ:分享").setName("SHARE").build();
        TBPublicMenuItem build2 = new TBPublicMenuItem.Builder().setId(R.id.menu_item_more_channel).setTitle("ꅚ:更多频道").build();
        TBPublicMenuItem build3 = new TBPublicMenuItem.Builder().setId(R.id.menu_item_addTo_desktop).setTitle("똊:添加到桌面").build();
        TBPublicMenuItem build4 = new TBPublicMenuItem.Builder().setId(R.id.menu_item_comment).setTitle("뀚:评分及评论").build();
        TBPublicMenu tBPublicMenu = new TBPublicMenu(this);
        TBActionView tBActionView = this.l;
        if (tBActionView != null) {
            tBPublicMenu.setCustomOverflow(tBActionView);
            tBPublicMenu.addCustomMenus(yz3.g(build, build2, build3, build4), new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: tb.gdr
                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    TBHDActivity.H3(TBHDActivity.this, tBPublicMenuItem);
                }
            });
            return;
        }
        ckf.y("moreIcon");
        throw null;
    }

    public final void I3(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c54aa1d", new Object[]{this, viewGroup, str});
            return;
        }
        View inflate = getLayoutInflater().inflate(R.layout.tbhd_nav_bar, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.j = frameLayout;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                dxo dxoVar = dxo.INSTANCE;
                layoutParams2.topMargin = dxoVar.a(dxoVar.b(this), this);
                frameLayout.setLayoutParams(layoutParams2);
                FrameLayout frameLayout2 = this.j;
                if (frameLayout2 != null) {
                    viewGroup.addView(frameLayout2);
                    View findViewById = viewGroup.findViewById(R.id.backIcon);
                    if (findViewById != null) {
                        this.k = (TUrlImageView) findViewById;
                        View findViewById2 = viewGroup.findViewById(R.id.tvTitle);
                        if (findViewById2 != null) {
                            this.p = (TextView) findViewById2;
                            View findViewById3 = viewGroup.findViewById(R.id.more_close_bg);
                            if (findViewById3 != null) {
                                this.o = (ImageView) findViewById3;
                                View findViewById4 = viewGroup.findViewById(R.id.more_btn);
                                if (findViewById4 != null) {
                                    this.l = (TBActionView) findViewById4;
                                    View findViewById5 = viewGroup.findViewById(R.id.vertical_bar_view);
                                    if (findViewById5 != null) {
                                        this.n = findViewById5;
                                        View findViewById6 = viewGroup.findViewById(R.id.back_home_btn);
                                        if (findViewById6 != null) {
                                            this.m = (ImageView) findViewById6;
                                            TextView textView = this.p;
                                            if (textView != null) {
                                                textView.setTypeface(Typeface.defaultFromStyle(1));
                                                TUrlImageView tUrlImageView = this.k;
                                                if (tUrlImageView != null) {
                                                    tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: tb.edr
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            TBHDActivity.J3(TBHDActivity.this, view);
                                                        }
                                                    });
                                                    ImageView imageView = this.m;
                                                    if (imageView != null) {
                                                        imageView.setOnClickListener(new View.OnClickListener() { // from class: tb.fdr
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                TBHDActivity.K3(TBHDActivity.this, view);
                                                            }
                                                        });
                                                        Bundle bundleExtra = getIntent().getBundleExtra(myu.HD_TINY_APP_CONFIG_KEY);
                                                        FrameLayout frameLayout3 = this.j;
                                                        if (frameLayout3 != null) {
                                                            v3(bundleExtra, frameLayout3);
                                                        } else {
                                                            ckf.y("navBar");
                                                            throw null;
                                                        }
                                                    } else {
                                                        ckf.y("finishIcon");
                                                        throw null;
                                                    }
                                                } else {
                                                    ckf.y("backIcon");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("titleText");
                                                throw null;
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.actionbar.TBActionView");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
                    }
                } else {
                    ckf.y("navBar");
                    throw null;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.i = System.currentTimeMillis();
        if (getIntent().getBundleExtra(myu.HD_TINY_APP_CONFIG_KEY) != null) {
            fsw.h("Triver", LumosWVPlugin.class);
        }
        wk8.INSTANCE.a(yz3.l(wk8.EVENT_HIDE_BACK_ICON, wk8.EVENT_SHOW_BACK_ICON, wk8.EVENT_SET_NAV_BAR_STYLE), this);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);
        C3().setUrl(D3());
        C3().setSafeArea(new woo(dxo.INSTANCE.b(this), 0, 0, 0));
        B3().r(new c());
        B3().i(C3());
        View h = B3().h();
        B3().u();
        frameLayout.addView(h);
        if (getIntent().getBundleExtra(myu.HD_TINY_APP_CONFIG_KEY) == null) {
            new SystemBarDecorator(this).enableImmersiveStatusBar(true);
        } else {
            I3(frameLayout, w3());
            G3();
        }
        this.h = getIntent().getLongExtra("hdRouteStart", this.i);
        if ((getApplicationInfo().flags & 2) != 0) {
            Toast.makeText(this, "Lumos", 1).show();
        }
    }

    public static final void H3(TBHDActivity tBHDActivity, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48d8dc3", new Object[]{tBHDActivity, tBPublicMenuItem});
            return;
        }
        ckf.g(tBHDActivity, "this$0");
        int id = tBPublicMenuItem.getId();
        if (id == R.id.menu_item_share) {
            zq zqVar = new zq(tBHDActivity.w3(), TMSCalendarBridge.namespace);
            zqVar.d(new WeakReference<>(tBHDActivity));
            xq xqVar = new xq(zqVar);
            xqVar.e(new LinkedHashMap());
            xqVar.o(tBHDActivity.w3());
            xqVar.b(null);
            new AbilityHubAdapter(zqVar).j("SharePannel", "open", xqVar, kotlin.collections.a.j(jpu.a("extendParams", null), jpu.a("imageURL", "https://gw.alicdn.com/tfs/TB1qK6gbNnaK1RjSZFtXXbC2VXa-580-362.png"), jpu.a(PopConst.BRIDGE_KEY_BUSINESS_ID, "NewMiniapp"), jpu.a("templateParams", kotlin.collections.a.j(jpu.a("shareInfo", kotlin.collections.a.j(jpu.a("appLogo", "https://ossgw.alicdn.com/taobao-miniapp/img/54fd355086e0eb28769a635cff59008f.png"), jpu.a("appName", "淘宝乐园"), jpu.a("imageUrl", ""), jpu.a("appDesc", "互动小游戏广场"), jpu.a("description", "我在手淘发现了【淘宝乐园】频道，我觉得特别符合你的style"), jpu.a("title", "淘宝乐园"))), jpu.a("headImg", "https://gw.alicdn.com/tfs/TB1qK6gbNnaK1RjSZFtXXbC2VXa-580-362.png"), jpu.a("userNick", "淘宝乐园"), jpu.a("price", "淘宝乐园"), jpu.a("weexURL", "https://market.m.taobao.com/app/crs-qn/light-app-task-center/pages/backflow?wh_weex=true"), jpu.a("weexUrl", "https://market.m.taobao.com/app/crs-qn/light-app-task-center/pages/backflow?wh_weex=true"), jpu.a("description", "我在手淘发现了【淘宝乐园】频道，我觉得特别符合你的style"), jpu.a("title", "我在手淘发现了【淘宝乐园】频道，我觉得特别符合你的style"))), jpu.a("title", "淘宝乐园"), jpu.a("url", "https://m.duanqu.com?miniappSourceChannel=iconAllChannelRecentlyVisit&_ariver_appid=3000000062695594&_mp_code=tb&hdkf_from=mini_ceiling&spm=a21bpk.21128592.0.0&home_buckets=304914_238484_353658_212151_859120_355632_355643_294430_41018_260535_207985_tsp48085_369908_792898_320999_217919_tsp24504_242684_tsp24841_238622&scm=1007.miniapp.3000000062695594.d&_ariver_ua=%E6%B7%98%E5%AE%9D%E4%B9%90%E5%9B%AD&x_object_type=miniapp&x_miniapp_id=3000000062695594"), jpu.a("desc", "我在手淘发现了【淘宝乐园】频道，我觉得特别符合你的style")), new d());
        } else if (id == R.id.menu_item_more_channel) {
            Nav.from(tBHDActivity).withOptions(null).withExtras(null).toUri("https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true");
        } else if (id == R.id.menu_item_addTo_desktop) {
            String w3 = tBHDActivity.w3();
            rcx.a(tBHDActivity, "{\"iconName\":\"淘宝乐园\",\"iconUrl\":\"https://ossgw.alicdn.com/taobao-miniapp/img/54fd355086e0eb28769a635cff59008f.png\",\"miniAppId\":\"" + w3 + "\",\"targetUrl\":\"https://m.duanqu.com/?miniappSourceChannel=iconAllChannelRecentlyVisit&_ariver_appid=3000000062695594&_mp_code=tb&hdkf_from=mini_ceiling&spm=a2141.miniapplist.zjsy.1&home_buckets=304914_238484_353658_212151_859120_355632_355643_294430_41018_260535_207985_tsp48085_369908_792898_320999_217919_tsp24504_242684_tsp24841_238622&scm=1007.miniapp.3000000062695594.d&sModuleName=themis&sLaunch=0&sKeep=1\"}");
        } else if (id == R.id.menu_item_comment) {
            Nav.from(tBHDActivity).withOptions(null).withExtras(null).toUri("https://m.duanqu.com?_ariver_appid=3000000002007701&enableKeepAlive=NO&page=pages/experience/experience&query=%3FappVersion%3D0.8.8%26subBizType%3D6%26bizType%3D1%26appName%3D%25E6%25B7%2598%25E5%25AE%259D%25E4%25B9%2590%25E5%259B%25AD%26appType%3Dtms%26appId%3D3000000062695594%26frameType%3DpubArea%26templateVersion%3D%26templateId%3D");
        }
    }
}
