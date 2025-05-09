package com.taobao.homepage.page;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.statusbar.IStatusBarService;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import tb.acq;
import tb.bqa;
import tb.c4b;
import tb.f4b;
import tb.hqk;
import tb.imn;
import tb.m7r;
import tb.q1x;
import tb.t2o;
import tb.z4a;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MagicWindowActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = TBOrderListFragment.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public q1x f10593a;
    public hqk b;
    public FrameLayout c;
    public PageState d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum PageState {
        ORDER,
        ACTIVITY,
        DEFAULT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PageState pageState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/page/MagicWindowActivity$PageState");
        }

        public static PageState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageState) ipChange.ipc$dispatch("e7c7a9f4", new Object[]{str});
            }
            return (PageState) Enum.valueOf(PageState.class, str);
        }
    }

    static {
        t2o.a(729809096);
    }

    public static /* synthetic */ Object ipc$super(MagicWindowActivity magicWindowActivity, String str, Object... objArr) {
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
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/page/MagicWindowActivity");
        }
    }

    public static /* synthetic */ String l3(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60114474", new Object[]{magicWindowActivity});
        }
        return magicWindowActivity.u3();
    }

    public static /* synthetic */ PageState m3(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageState) ipChange.ipc$dispatch("b13e5800", new Object[]{magicWindowActivity});
        }
        return magicWindowActivity.d;
    }

    public static /* synthetic */ String n3(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1d205b2", new Object[]{magicWindowActivity});
        }
        return magicWindowActivity.e;
    }

    public static /* synthetic */ void o3(MagicWindowActivity magicWindowActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05aee39", new Object[]{magicWindowActivity, str});
        } else {
            magicWindowActivity.x3(str);
        }
    }

    public static /* synthetic */ void p3(MagicWindowActivity magicWindowActivity, String str, TMSEmbedSolutionType tMSEmbedSolutionType, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12152fc3", new Object[]{magicWindowActivity, str, tMSEmbedSolutionType, new Boolean(z)});
        } else {
            magicWindowActivity.z3(str, tMSEmbedSolutionType, z);
        }
    }

    public static /* synthetic */ boolean q3(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5f3b535", new Object[]{magicWindowActivity})).booleanValue();
        }
        return magicWindowActivity.t3();
    }

    public static /* synthetic */ void r3(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632e66b2", new Object[]{magicWindowActivity});
        } else {
            magicWindowActivity.y3();
        }
    }

    public static String s3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5bd7fec", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("hide_back", "true").appendQueryParameter("status_bar_transparent", "true").build().toString();
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0742764", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        hqk hqkVar = this.b;
        if (hqkVar != null && iHomeDataService != null) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_magic_window);
        IStatusBarService iStatusBarService = (IStatusBarService) c4b.i().h(IStatusBarService.class);
        if (iStatusBarService != null) {
            iStatusBarService.updateStatusBar(this);
        }
        this.c = (FrameLayout) findViewById(R.id.container);
        String u3 = u3();
        if (!TextUtils.isEmpty(u3)) {
            z3(u3, TMSEmbedSolutionType.WEB_SINGLE_PAGE, false);
        } else if (t3()) {
            y3();
        } else {
            z3(v3(), TMSEmbedSolutionType.WEEX, true);
        }
        w3();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        A3();
        q1x q1xVar = this.f10593a;
        if (q1xVar != null) {
            q1xVar.f();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        q1x q1xVar = this.f10593a;
        if (q1xVar != null) {
            q1xVar.t();
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
        q1x q1xVar = this.f10593a;
        if (q1xVar != null) {
            q1xVar.s();
        }
    }

    public final boolean t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64470dc8", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableEasyGoShowOrderListFragment", true);
    }

    public final String u3() {
        JSONObject A;
        JSONObject jSONObject;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70feca8f", new Object[]{this});
        }
        imn d = zza.d(z4a.NEW_FACE_PARENT.b());
        if (d == null || (A = d.A()) == null || (jSONObject = A.getJSONObject("parallelWindow")) == null) {
            return null;
        }
        try {
            j = jSONObject.getLongValue("activityEndTime");
        } catch (Exception unused) {
            bqa.d("MagicWindowActivity", "parse activity end time error");
            j = 0;
        }
        String string = jSONObject.getString("targetUrl");
        if (TextUtils.isEmpty(string) || System.currentTimeMillis() > j) {
            return null;
        }
        String s3 = s3(string);
        bqa.d("MagicWindowActivity", "activity url: " + s3);
        return s3;
    }

    public final String v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fb9f644", new Object[]{this});
        }
        return Uri.parse("https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true").buildUpon().appendQueryParameter(m7r.WEEX_REFERER_ORIGIN, "https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true").build().toString();
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81fc91d", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new a(this);
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService != null) {
            iHomeDataService.addDataProcessListener(this.b);
        }
    }

    public final void x3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4183936a", new Object[]{this, str});
            return;
        }
        q1x q1xVar = this.f10593a;
        if (q1xVar != null) {
            q1xVar.p(str);
            this.e = str;
            bqa.d("MagicWindowActivity", "reload page, url: " + str);
        }
    }

    public final void z3(String str, TMSEmbedSolutionType tMSEmbedSolutionType, boolean z) {
        PageState pageState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580c2b1f", new Object[]{this, str, tMSEmbedSolutionType, new Boolean(z)});
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(f);
            if (findFragmentByTag != null) {
                supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            this.c.removeAllViews();
            q1x q1xVar = this.f10593a;
            if (q1xVar != null) {
                q1xVar.f();
            }
            q1x q1xVar2 = new q1x(g4.b.j, this);
            this.f10593a = q1xVar2;
            this.c.addView(q1xVar2.e(this, tMSEmbedSolutionType, str), new FrameLayout.LayoutParams(-1, -1));
            if (!z) {
                this.e = str;
            } else {
                this.e = null;
            }
            if (z) {
                pageState = PageState.DEFAULT;
            } else {
                pageState = PageState.ACTIVITY;
            }
            this.d = pageState;
            bqa.d("MagicWindowActivity", "switch to web page, url: " + str);
        }
    }

    public final void y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5d08c6", new Object[]{this});
            return;
        }
        q1x q1xVar = this.f10593a;
        if (q1xVar != null) {
            q1xVar.f();
            this.f10593a = null;
        }
        this.c.removeAllViews();
        this.e = null;
        Bundle bundle = new Bundle();
        bundle.putBoolean(TBOrderListFragment.KEY_NEED_HIDE_BACK_BTN, true);
        Fragment instantiate = Fragment.instantiate(this, TBOrderListFragment.class.getName(), bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            supportFragmentManager.beginTransaction().replace(R.id.container, instantiate, f).commitAllowingStateLoss();
            this.d = PageState.ORDER;
            bqa.d("MagicWindowActivity", "switch to order");
        }
    }
}
