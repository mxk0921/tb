package com.taobao.search.searchdoor.shop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.common.SearchBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import tb.acq;
import tb.fbq;
import tb.o4p;
import tb.oqp;
import tb.sse;
import tb.t2o;
import tb.ude;
import tb.vfw;
import tb.yak;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShopSearchDoorActivity extends SearchBaseActivity implements ude {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oqp f11674a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                ShopSearchDoorActivity.this.setContentView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(815793289);
        t2o.a(993002008);
    }

    public static /* synthetic */ Object ipc$super(ShopSearchDoorActivity shopSearchDoorActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/ShopSearchDoorActivity");
        }
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

    @Override // tb.ude
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return yak.f31939a;
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243249fb", new Object[]{this});
        } else {
            this.f11674a = new oqp(this, this, null, new a());
        }
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285b9689", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Search");
        setUTPageName("Page_Shop_Search");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && 136 == i && intent != null && this.f11674a != null) {
            String stringExtra = intent.getStringExtra("q");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f11674a.postEvent(fbq.a(stringExtra, ""));
            }
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        SearchSdk.init();
        ScreenType.b(this);
        TLogTracker.s("InShopSearchDoor");
        super.onCreate(bundle);
        TLogTracker.t(o4p.i2());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        sse.INSTANCE.b(getIntent());
        n3();
        o3();
        p3();
        SearchDoorContext B2 = this.f11674a.B2();
        if (B2 != null) {
            TLogTracker.m(B2.z());
        } else {
            TLogTracker.m(null);
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        oqp oqpVar = this.f11674a;
        if (oqpVar != null) {
            oqpVar.onCtxDestroyInternal();
        }
        TLogTracker.o();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        setIntent(intent);
        super.onNewIntent(intent);
        sse.INSTANCE.b(intent);
        this.f11674a.E2(intent);
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        oqp oqpVar = this.f11674a;
        if (oqpVar != null) {
            oqpVar.onCtxPauseInternal();
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s("InShopSearchDoor");
        super.onResume();
        o3();
        p3();
        oqp oqpVar = this.f11674a;
        if (oqpVar != null) {
            oqpVar.onCtxResumeInternal();
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
        TLogTracker.p();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TLogTracker.q();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        oqp oqpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (z && (oqpVar = this.f11674a) != null) {
            oqpVar.F2();
        }
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8210a55", new Object[]{this});
            return;
        }
        oqp oqpVar = this.f11674a;
        if (oqpVar != null) {
            oqpVar.G2();
        }
    }
}
