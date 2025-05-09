package com.taobao.taolive.room;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.history.RecentlyOftenWatchService;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import java.util.Map;
import tb.acq;
import tb.d1j;
import tb.hw0;
import tb.jyd;
import tb.kmr;
import tb.muk;
import tb.p6f;
import tb.pvs;
import tb.q6f;
import tb.sbt;
import tb.t2o;
import tb.u90;
import tb.voj;
import tb.wvs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveSeamlessActivity extends SwipeBackActivity implements ShareContentCallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_KILL_SELF = "com.taobao.taolive.room.TaoLiveVideoActivity.killself";
    public jyd b;
    public d1j c;
    public long e;
    public ViewGroup g;
    public BroadcastReceiver d = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveSeamlessActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if ("com.taobao.taolive.room.TaoLiveVideoActivity.killself".equals(intent.getAction())) {
                TaoLiveSeamlessActivity.this.finish();
            }
        }
    };
    public final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveSeamlessActivity$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                String action = intent.getAction();
                if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
                    TaoLiveSeamlessActivity.m3(TaoLiveSeamlessActivity.this);
                } else if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_CANCEL.name())) {
                    TaoLiveSeamlessActivity.this.finish();
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements muk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TaoLiveSeamlessActivity taoLiveSeamlessActivity) {
        }

        @Override // tb.muk
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af77910", new Object[]{this, map});
            }
        }

        @Override // tb.muk
        public void f(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fad69777", new Object[]{this, map});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TaoLiveSeamlessActivity.n3(TaoLiveSeamlessActivity.this).r();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TaoLiveSeamlessActivity.this.getPublicMenu() != null) {
                TaoLiveSeamlessActivity.this.getPublicMenu().show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements ISmallWindowStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(TaoLiveSeamlessActivity taoLiveSeamlessActivity) {
        }

        @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
        public void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
                return;
            }
            if (!TextUtils.isEmpty(str) && pvs.D1()) {
                str = str.replace(kmr.TAOLIVE_ONLINE_LIVE_ID, "id=" + pvs.A2());
            }
            if (TextUtils.isEmpty(str)) {
                str = u90.e(str2);
            }
            voj.b(view.getContext(), str.replace(q6f.PATH_TAOLIVE, "/taolive/seamless.html").replace("forceRefresh=true", "forceRefresh=false"), null, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, false);
        }
    }

    static {
        t2o.a(779092751);
        t2o.a(927989801);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveSeamlessActivity taoLiveSeamlessActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
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
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveSeamlessActivity");
        }
    }

    public static /* synthetic */ void m3(TaoLiveSeamlessActivity taoLiveSeamlessActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf2bbd6", new Object[]{taoLiveSeamlessActivity});
        } else {
            taoLiveSeamlessActivity.p3();
        }
    }

    public static /* synthetic */ jyd n3(TaoLiveSeamlessActivity taoLiveSeamlessActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyd) ipChange.ipc$dispatch("e1028f96", new Object[]{taoLiveSeamlessActivity});
        }
        return taoLiveSeamlessActivity.b;
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

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        return this.c.b();
    }

    public final void o3() {
        jyd jydVar;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee1221d", new Object[]{this});
        } else if (sbt.b() && (jydVar = this.b) != null && ((wvs) jydVar).isDestroyed() && (viewGroup = this.g) != null) {
            viewGroup.removeAllViews();
            this.g.setId(View.generateViewId());
            q3();
            this.g.addView(((wvs) this.b).getView());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        jyd jydVar = this.b;
        if (jydVar == null) {
            return;
        }
        if (i == 20000) {
            ((wvs) jydVar).J();
        } else if (i == 20001) {
            ((wvs) jydVar).u();
        } else if (i != 10000) {
        } else {
            if (i2 == 8) {
                ((wvs) jydVar).j(false);
            } else if (i2 == 1) {
                ((wvs) jydVar).j(true);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        jyd jydVar = this.b;
        if (jydVar != null) {
            ((wvs) jydVar).onConfigurationChanged(configuration);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        this.c.c(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.g = null;
        this.c.a();
        RecentlyOftenWatchService.d().k();
        jyd jydVar = this.b;
        if (jydVar != null) {
            ((wvs) jydVar).onDestroy();
        }
        t3(this);
        if (this.d != null) {
            LocalBroadcastManager.getInstance(getBaseContext()).unregisterReceiver(this.d);
            this.d = null;
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        jyd jydVar = this.b;
        if (jydVar == null || !((wvs) jydVar).onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        jyd jydVar = this.b;
        if (jydVar != null) {
            ((wvs) jydVar).onLowMemory();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            Uri data = intent.getData();
            if (data != null) {
                z = data.getBooleanQueryParameter("forceRefresh", false);
            }
        }
        if (this.b != null) {
            o3();
            ((wvs) this.b).y(intent, z);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (this.c.d(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        jyd jydVar = this.b;
        if (jydVar != null) {
            ((wvs) jydVar).onPause();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        this.c.e(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.b != null) {
            o3();
            ((wvs) this.b).onResume();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        jyd jydVar = this.b;
        if (jydVar != null) {
            ((wvs) jydVar).x();
            ((wvs) this.b).onStop();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        jyd jydVar = this.b;
        if (jydVar != null) {
            ((wvs) jydVar).onTrimMemory(i);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            s3();
        }
    }

    public final void p3() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        getIntent().putExtra("firstTime", this.e);
        if (!(getIntent() == null || (data = getIntent().getData()) == null)) {
            data.getQueryParameter("newRoomType");
        }
        q3();
        ViewGroup view = ((wvs) this.b).getView();
        setContentView(view);
        if (this.g == null) {
            this.g = view;
        }
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1acf53", new Object[]{this});
            return;
        }
        wvs wvsVar = new wvs(this, getIntent());
        this.b = wvsVar;
        wvsVar.z(new a(this));
        ((wvs) this.b).v(new b());
        ((wvs) this.b).e(new c());
        ((wvs) this.b).setSmallWindowClickListener(new d(this));
    }

    public final void r3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a203df5", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(activity, this.f);
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9478bcce", new Object[]{this});
        } else {
            getWindow().getDecorView().setSystemUiVisibility(5380);
        }
    }

    public final void t3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5293fc", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(activity, this.f);
        }
    }

    @Override // com.taobao.taolive.room.SwipeBackActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        s3();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        this.e = System.currentTimeMillis();
        p6f.a(null, null);
        this.c = new d1j(this);
        RecentlyOftenWatchService.d().g();
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(this.d, new IntentFilter("com.taobao.taolive.room.TaoLiveVideoActivity.killself"));
        getWindow().addFlags(128);
        if (!hw0.m()) {
            Toast.makeText(this, "亲,你的机型暂不支持直播T.T", 1).show();
            finish();
        } else if (!Login.checkSessionValid()) {
            r3(this);
            Login.login(true);
        } else {
            p3();
        }
    }
}
