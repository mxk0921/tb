package com.taobao.themis.container.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.triver.bundle.nav.TriverNavProcessor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.nav.Nav;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.taobao.R;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.instance.KeepLiveExtension;
import com.taobao.themis.kernel.manager.TMSActivityKeepAliveManager;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import tb.a07;
import tb.acq;
import tb.bbs;
import tb.ckf;
import tb.d7r;
import tb.h8s;
import tb.i04;
import tb.ies;
import tb.jpu;
import tb.l47;
import tb.m2;
import tb.mop;
import tb.n4d;
import tb.njg;
import tb.o9s;
import tb.pcs;
import tb.pl4;
import tb.q8s;
import tb.q9s;
import tb.qgr;
import tb.qpz;
import tb.swd;
import tb.t2o;
import tb.t8s;
import tb.v0e;
import tb.vxm;
import tb.wbs;
import tb.wes;
import tb.wpg;
import tb.wqg;
import tb.wsq;
import tb.x9b;
import tb.yz3;
import tb.zjy;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/taobao/themis/container/app/TMSActivity;", "Lcom/taobao/themis/container/app/TMSBaseActivity;", "Ltb/cbs;", "Ltb/wqg;", "Lcom/taobao/uikit/actionbar/ITBPublicMenu;", "<init>", "()V", "Companion", "a", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSActivity extends TMSBaseActivity implements wqg, ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final njg D0 = kotlin.a.a(LazyThreadSafetyMode.NONE, TMSActivity$newTaskActivityNameList$2.INSTANCE);
    public boolean c;
    public x9b d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249410);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(847249409);
        t2o.a(839909408);
        t2o.a(927989771);
    }

    public static /* synthetic */ Object ipc$super(TMSActivity tMSActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -2116008609:
                super.startActivity((Intent) objArr[0], (Bundle) objArr[1]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -237085799:
                return new Boolean(tMSActivity.moveTaskToBack(((Boolean) objArr[0]).booleanValue()));
            case 103036691:
                super.n3((bbs) objArr[0]);
                return null;
            case 116272469:
                super.startActivity((Intent) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 885118356:
                super.finishAndRemoveTask();
                return null;
            case 902425770:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/TMSActivity");
        }
    }

    public final boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce61dc8a", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (intent.getFlags() & 268435456) == 0 || (intent.getFlags() & 524288) == 0 || (intent.getFlags() & 134217728) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finishAndRemoveTask() {
        bbs m1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1d594", new Object[]{this});
        } else if (!a(getIntent()) || (m1 = m1()) == null || !zjy.a(m1)) {
            super.finishAndRemoveTask();
        } else {
            moveTaskToBack(false);
        }
    }

    public final ArrayList<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4668d908", new Object[]{this});
        }
        return (ArrayList) this.D0.getValue();
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, tb.cbs
    public bbs m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("6141df52", new Object[]{this});
        }
        q8s l3 = l3();
        if (l3 == null) {
            return null;
        }
        return l3.i();
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity
    public String m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4866ffc1", new Object[]{this});
        }
        if (getIntent().getStringExtra("oriUrl") == null) {
            return getIntent().getDataString();
        }
        String stringExtra = getIntent().getStringExtra("oriUrl");
        if (stringExtra == null) {
            return null;
        }
        getIntent().setData(ies.g(stringExtra));
        return stringExtra;
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity
    public void n3(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6243713", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        super.n3(bbsVar);
        if (a(getIntent()) && bbsVar.d0() != null) {
            String d0 = bbsVar.d0();
            ckf.f(d0, "instance.uniAppId");
            TMSActivityKeepAliveManager.d(d0, this);
            bbsVar.k0(new KeepLiveExtension(bbsVar));
        }
        x9b x9bVar = this.d;
        if (x9bVar != null) {
            bbsVar.k0(x9bVar);
        }
        if (q9s.s1() && wbs.d(getIntent())) {
            bbsVar.k0(new l47());
        }
        if (q9s.o4()) {
            bbsVar.k0(new qpz());
        }
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bbs m1 = m1();
        String str = "";
        if (!(m1 == null || (d0 = m1.d0()) == null)) {
            str = d0;
        }
        TMSActivityKeepAliveManager.e(str);
        super.onDestroy();
    }

    @Override // tb.wqg
    public void onSetActivityTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e714bbe", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (this.c) {
            finish();
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }

    public final boolean q3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca5bd6e6", new Object[]{this, str})).booleanValue();
        }
        TMSSolutionType type = TMSSolutionType.getType(Uri.parse(str));
        if (q9s.y1() && TMSSolutionType.WEB_SINGLE_PAGE == type) {
            return true;
        }
        if (q9s.A1() && TMSSolutionType.WEEX == type) {
            return true;
        }
        if (!q9s.z1() || TMSSolutionType.UNIAPP != type) {
            return false;
        }
        return true;
    }

    public final void s3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fbe49c", new Object[]{this, str});
            return;
        }
        p3(true);
        this.c = true;
        Nav.from(this).toUri(str);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee2d55", new Object[]{this, intent});
            return;
        }
        if (intent != null && a(getIntent())) {
            ArrayList<String> g = g();
            ComponentName component = intent.getComponent();
            if (i04.R(g, component == null ? null : component.getClassName())) {
                intent.addFlags(268435456);
            }
        }
        super.startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c9ecaa", new Object[]{this, intent, new Integer(i)});
            return;
        }
        if (intent != null && a(getIntent())) {
            ArrayList<String> g = g();
            ComponentName component = intent.getComponent();
            if (component == null) {
                str = null;
            } else {
                str = component.getClassName();
            }
            if (i04.R(g, str)) {
                intent.addFlags(268435456);
            }
        }
        super.startActivityForResult(intent, i);
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (o9s.i(this) && q9s.u0()) {
            bundle.putBoolean("shouldRelaunch", true);
        }
    }

    public final void r3() {
        this.c = true;
        Method declaredMethod = TriverNavProcessor.class.getDeclaredMethod("jumpTriverAndCheckRemote", Context.class, Intent.class);
        ckf.f(declaredMethod, "clz.getDeclaredMethod(\n …ent::class.java\n        )");
        getIntent().putExtra("isAFCColdLaunch", true);
        declaredMethod.invoke(null, this, getIntent());
    }

    @Override // android.app.Activity
    public void finish() {
        bbs i;
        v0e v0eVar;
        bbs i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        bbs m1 = m1();
        boolean a2 = m1 == null ? false : zjy.a(m1);
        if (!a(getIntent()) || !a2) {
            if (!this.c) {
                q8s l3 = l3();
                n4d n4dVar = null;
                if (!(l3 == null || (i2 = l3.i()) == null)) {
                    n4dVar = (n4d) i2.getExtension(n4d.class);
                }
                if (n4dVar != null) {
                    TMSLogger.f("TMSActivity", ckf.p("极简链路，触发回退干预: ", n4dVar.getClass().getSimpleName()));
                    n4dVar.K();
                } else if (!TextUtils.isEmpty(m3())) {
                    wpg.d(Uri.parse(m3()), this);
                }
            }
            if (a(getIntent())) {
                finishAndRemoveTask();
            } else {
                super.finish();
            }
            q8s l32 = l3();
            if (l32 != null && (i = l32.i()) != null && (v0eVar = (v0e) i.getExtension(v0e.class)) != null && v0eVar.a0()) {
                overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        moveTaskToBack(true);
    }

    public final boolean t3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc4ed84b", new Object[]{this, str})).booleanValue();
        }
        if (!q9s.b2()) {
            return false;
        }
        try {
            String c = ies.c(str, pl4.KEY_PAGE_ID);
            String J3 = q9s.J3("themis_common_config", "white_skip_pages", "[landing_v2_860,landing_v2_859,landing_v2_1119,landing_v2_1120]");
            if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(J3)) {
                String substring = J3.substring(1, J3.length() - 1);
                ckf.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                for (String str2 : wsq.z0(substring, new String[]{","}, false, 0, 6, null)) {
                    if (TextUtils.equals(c, wsq.Q0(str2).toString())) {
                        TMSLogger.b("TMSActivity 极简链路", ckf.p("skip reload pageId, pageId is ", c));
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            TMSLogger.b("TMSActivity", ckf.p("skipHandleOnNewIntent error ", e.getMessage()));
        }
        return false;
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        qgr.a(getApplicationContext());
        long currentTimeMillis2 = System.currentTimeMillis();
        TMSLogger.f("TMSActivity", "TMSActivity onCreate");
        vxm.b.e().a("is_tms_link_opt", Boolean.valueOf(wbs.c(getIntent())));
        if (getIntent() != null && wbs.c(getIntent())) {
            Uri g = ies.g(m3());
            h8s.sTMSAfcMiniKernel.set(BootstrapMode.d(4));
            if (g == null) {
                NotifyApm.b().c(this);
                p3(true);
                super.onCreate(bundle);
                s3(null);
                return;
            }
            TMSLogger.b("TMSActivity 极简链路", ckf.p("onCreate targetUrl is: ", g));
            if (o9s.h(this)) {
                Toast.makeText(this, "外链拉端 - 极简链路", 1).show();
            }
            String b = wbs.INSTANCE.b(g);
            if (!TextUtils.isEmpty(b)) {
                p3(true);
                super.onCreate(bundle);
                s3(b);
                return;
            } else if (TMSSwitchUtils.isEnterTMS(this, g) || ((q9s.y1() && TMSSwitchUtils.enableEnterTMSH5AFC(this, g)) || TMSSwitchUtils.enableEnterTMSWeexAFC(this, g))) {
                this.d = new m2();
                setTheme(R.style.Theme_TMSActivity);
                TMSLogger.b("TMSActivity 极简链路", "命中 Themis");
                if (getIntent().getStringExtra("oriUrl") == null) {
                    getIntent().putExtra("oriUrl", g.toString());
                }
            } else {
                TMSLogger.b("TMSActivity 极简链路", "命中 Themis，但是不应该 TMS 处理，跳出 TMS");
                NotifyApm.b().c(this);
                p3(true);
                super.onCreate(bundle);
                s3(g.toString());
                return;
            }
        }
        if (bundle == null || !bundle.containsKey("shouldRelaunch")) {
            d7r.a(this);
        }
        super.onCreate(bundle);
        q8s l3 = l3();
        if (l3 != null) {
            l3.o(kotlin.collections.a.j(jpu.a("containerOnCreate", String.valueOf(currentTimeMillis)), jpu.a(mop.KEY_CONTAINER_START, String.valueOf(currentTimeMillis2))));
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e0455f", new Object[]{this, intent, bundle});
            return;
        }
        if (intent != null && a(getIntent())) {
            ArrayList<String> g = g();
            ComponentName component = intent.getComponent();
            if (i04.R(g, component == null ? null : component.getClassName())) {
                intent.addFlags(268435456);
            }
        }
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        bbs i;
        swd W;
        ITMSPage topPage;
        List list;
        bbs i2;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent != null && intent.getDataString() != null) {
            String dataString = intent.getDataString();
            bbs bbsVar = null;
            if (dataString == null) {
                NotifyApm.b().c(this);
                s3(null);
                return;
            }
            if (!TextUtils.isEmpty(dataString)) {
                TMSLogger.b("TMSActivity 极简链路", ckf.p("targetUrl is: ", dataString));
            } else {
                TMSLogger.b("TMSActivity 极简链路", "targetUrl is empty!");
            }
            if (q3(dataString)) {
                if (!TextUtils.isEmpty(dataString) && !t3(dataString)) {
                    q8s l3 = l3();
                    String e0 = (l3 == null || (i2 = l3.i()) == null) ? null : i2.e0();
                    if (!TextUtils.isEmpty(e0)) {
                        Uri parse = Uri.parse(e0);
                        Uri parse2 = Uri.parse(dataString);
                        if (t8s.i(this, parse2)) {
                            if (q9s.s()) {
                                list = yz3.l("forbidRefineType", "isNeedHome", "packageName", "bxsign", "surge_ssr", "afcflow", "_afc_link", "utparamcnt", "async", "tms_session_id");
                            } else {
                                list = yz3.l("isNeedHome", "_afc_link", "utparamcnt", "tms_session_id");
                            }
                            Iterator<String> it = parse2.getQueryParameterNames().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                String next = it.next();
                                if (!list.contains(next) && !TextUtils.equals(parse2.getQueryParameter(next), parse.getQueryParameter(next))) {
                                    break;
                                }
                            }
                        } else {
                            TMSLogger.b("TMSActivity 极简链路", "换链到 native 页面");
                            NotifyApm.b().c(this);
                            s3(dataString);
                            z = false;
                            z2 = true;
                        }
                    }
                    if (!q9s.A1() || TextUtils.isEmpty(e0) || TMSSolutionType.getType(Uri.parse(dataString)) == TMSSolutionType.getType(Uri.parse(e0))) {
                        if (z) {
                            vxm.b.e().a("tms_afc_redirect_time", Long.valueOf(o9s.c(System.currentTimeMillis())));
                        }
                        vxm.b.e().a("tms_afc_redirect", Boolean.valueOf(z));
                        if (z && !isFinishing()) {
                            if (q9s.E1() && TMSSolutionType.getType(Uri.parse(dataString)) == TMSSolutionType.WEEX) {
                                dataString = wes.a(dataString);
                            }
                            q8s l32 = l3();
                            if (!(l32 == null || (i = l32.i()) == null || (W = i.W()) == null || (topPage = W.getTopPage()) == null)) {
                                pcs pcsVar = new pcs();
                                pcsVar.f26018a = dataString;
                                q8s l33 = l3();
                                if (l33 != null) {
                                    bbsVar = l33.i();
                                }
                                if (bbsVar != null) {
                                    bbsVar.w0(dataString);
                                }
                                topPage.reload(pcsVar);
                            }
                        }
                        TMSLogger.b("TMSActivity 极简链路", "WEB_SINGLE_PAGE onNewIntent isFinishing=" + isFinishing() + " shouldReload=" + z + " navToNative=" + z2);
                        return;
                    }
                    TMSLogger.b("TMSActivity 极简链路", "换链到 other 页面");
                    NotifyApm.b().c(this);
                    s3(dataString);
                }
            } else if (!t8s.d(Uri.parse(dataString))) {
                TMSLogger.b("TMSActivity 极简链路", "换链");
                NotifyApm.b().c(this);
                s3(dataString);
            } else {
                Uri build = Uri.parse(dataString).buildUpon().appendQueryParameter("_afc_link", "1").build();
                ckf.f(build, "targetUri");
                if (!TMSSwitchUtils.isEnterTMS(this, build)) {
                    NotifyApm.b().c(this);
                    TMSLogger.b("TMSActivity 极简链路", "命中 Triver");
                    r3();
                }
            }
        }
    }
}
