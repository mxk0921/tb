package com.taobao.android.remoteso.component;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import tb.acq;
import tb.adw;
import tb.bxn;
import tb.cxn;
import tb.fk4;
import tb.rbn;
import tb.t6h;
import tb.uos;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoActivity extends AppCompatActivity implements adw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9236a = "";
    public long b = -1;
    public final Runnable c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.remoteso.component.RemoActivity$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0475a implements fk4<com.taobao.android.remoteso.component.c> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0475a(a aVar) {
            }

            /* renamed from: b */
            public void a(com.taobao.android.remoteso.component.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
                    return;
                }
                cVar.y(cxn.h("timeout " + cVar));
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RemoActivity.l3(RemoActivity.this, "remo, RemoActivity,timeoutTask", new C0475a(this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements fk4<com.taobao.android.remoteso.component.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: b */
        public void a(com.taobao.android.remoteso.component.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
                return;
            }
            RemoActivity.m3(RemoActivity.this, cVar);
            RemoActivity.o3(RemoActivity.this, cVar.i());
            t6h.e(RemoActivity.n3(RemoActivity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements fk4<com.taobao.android.remoteso.component.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: b */
        public void a(com.taobao.android.remoteso.component.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
            } else {
                RemoActivity.m3(RemoActivity.this, cVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements fk4<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public BaseRemoLoadingView f9240a;
        public final /* synthetic */ com.taobao.android.remoteso.component.c b;

        public d(com.taobao.android.remoteso.component.c cVar) {
            this.b = cVar;
        }

        /* renamed from: b */
        public void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e36eeb14", new Object[]{this, num});
                return;
            }
            bxn.a(RemoActivity.p3(RemoActivity.this));
            bxn.d(RemoActivity.p3(RemoActivity.this), RemoActivity.p3(RemoActivity.this), 10000L);
            RSoLog.d("remo, RemoActivity - ProgressObserver = " + num + ", loadingView=" + this.f9240a);
            if (this.f9240a == null) {
                BaseRemoLoadingView create = this.b.l().create(RemoActivity.this.getContext());
                this.f9240a = create;
                RemoActivity.this.setContentView(create);
            }
            this.f9240a.onProgressChanged(num.intValue());
            RSoLog.d("remo, RemoActivity - ProgressObserver, setContentView updated = " + this.f9240a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements fk4<cxn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.remoteso.component.c f9241a;

        public e(com.taobao.android.remoteso.component.c cVar) {
            this.f9241a = cVar;
        }

        /* renamed from: b */
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe34fd14", new Object[]{this, cxnVar});
                return;
            }
            bxn.a(RemoActivity.p3(RemoActivity.this));
            if (cxnVar.a()) {
                RSoLog.d("remo, RemoActivity - ResultObserver, all success");
                t6h.b(RemoActivity.n3(RemoActivity.this), uos.b() - RemoActivity.q3(RemoActivity.this));
                if (this.f9241a.u()) {
                    RemoActivity.r3(RemoActivity.this, "onRemoSuccess", this.f9241a.r());
                }
            } else if (this.f9241a.v()) {
                RSoLog.d("remo, RemoActivity - ResultObserver, ignore remo error view");
                RemoActivity.r3(RemoActivity.this, "onIgnoreRemoError", this.f9241a.r());
            } else {
                RSoLog.d("remo, RemoActivity - ResultObserver, failed  result=" + cxnVar);
                String n3 = RemoActivity.n3(RemoActivity.this);
                t6h.a(n3, cxnVar.d() + " : " + cxnVar.e());
                View a2 = this.f9241a.k().a(RemoActivity.this);
                RemoActivity.this.setContentView(a2);
                RSoLog.d("remo, RemoActivity - ResultObserver, setContentView updated = " + a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements fk4<com.taobao.android.remoteso.component.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        /* renamed from: b */
        public void a(com.taobao.android.remoteso.component.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
            } else {
                RemoActivity.r3(RemoActivity.this, "onStart", cVar.r());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements fk4<com.taobao.android.remoteso.component.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        /* renamed from: b */
        public void a(com.taobao.android.remoteso.component.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
            } else {
                RemoActivity.r3(RemoActivity.this, "onStop", cVar.r());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements fk4<com.taobao.android.remoteso.component.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(RemoActivity remoActivity) {
        }

        /* renamed from: b */
        public void a(com.taobao.android.remoteso.component.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
            } else {
                cVar.y(cxn.b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements fk4<com.taobao.android.remoteso.component.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(RemoActivity remoActivity) {
        }

        /* renamed from: b */
        public void a(com.taobao.android.remoteso.component.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ab30cd4", new Object[]{this, cVar});
            } else {
                Remo.e(cVar.p());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(RemoActivity remoActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/component/RemoActivity");
        }
    }

    public static /* synthetic */ void l3(RemoActivity remoActivity, String str, fk4 fk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dcb30d", new Object[]{remoActivity, str, fk4Var});
        } else {
            remoActivity.t3(str, fk4Var);
        }
    }

    public static /* synthetic */ void m3(RemoActivity remoActivity, com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19106b80", new Object[]{remoActivity, cVar});
        } else {
            remoActivity.s3(cVar);
        }
    }

    public static /* synthetic */ String n3(RemoActivity remoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e92d0488", new Object[]{remoActivity});
        }
        return remoActivity.f9236a;
    }

    public static /* synthetic */ String o3(RemoActivity remoActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("870b5cbc", new Object[]{remoActivity, str});
        }
        remoActivity.f9236a = str;
        return str;
    }

    public static /* synthetic */ Runnable p3(RemoActivity remoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("72d2ad1b", new Object[]{remoActivity});
        }
        return remoActivity.c;
    }

    public static /* synthetic */ long q3(RemoActivity remoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3dc1c8e", new Object[]{remoActivity})).longValue();
        }
        return remoActivity.b;
    }

    public static /* synthetic */ void r3(RemoActivity remoActivity, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90536d0f", new Object[]{remoActivity, str, new Boolean(z)});
        } else {
            remoActivity.u3(str, z);
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

    @Override // tb.adw
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        RSoLog.d("remo, RemoActivity - onBackPressed");
        t6h.c(this.f9236a);
        t3("remo, RemoActivity,performBack", new h(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        RSoLog.d("remo, RemoActivity - onConfigurationChanged = " + configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        RSoLog.d("remo, RemoActivity - onCreate initialized" + this.f9236a);
        if (bundle != null) {
            RSoLog.d("remo, RemoActivity - savedInstanceState != null, finish");
            finish();
            return;
        }
        this.b = uos.b();
        v3();
        t3("remo, RemoActivity,onCreate", new b());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        RSoLog.d("remo, RemoActivity - onDestroy = " + this.f9236a);
        bxn.a(this.c);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        RSoLog.d("remo, RemoActivity - onNewIntent = " + intent + this.f9236a);
        t3("remo, RemoActivity,onNewIntent", new c());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        RSoLog.d("remo, RemoActivity - onStart = " + this.f9236a);
        t3("remo, RemoActivity,onStart", new f());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        RSoLog.d("remo, RemoActivity - onStop = " + this.f9236a);
        t3("remo, RemoActivity,onStop", new g());
    }

    public final void s3(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f271dd", new Object[]{this, cVar});
            return;
        }
        RSoLog.d("remo, RemoActivity - bindConsumer, enter " + cVar);
        cVar.o().a(new d(cVar));
        cVar.q().a(new e(cVar));
    }

    @Override // tb.adw
    public void t0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c039c6", new Object[]{this, str});
            return;
        }
        str.hashCode();
        if (str.equals("back")) {
            finish();
        } else if (str.equals("retry")) {
            t6h.d(this.f9236a);
            t3("remo, RemoActivity,retry", new i(this));
        }
    }

    public final void t3(String str, fk4<com.taobao.android.remoteso.component.c> fk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1021baeb", new Object[]{this, str, fk4Var});
            return;
        }
        com.taobao.android.remoteso.component.c d2 = Remo.d();
        if (d2 == null) {
            rbn.e(str + " error:", this.f9236a);
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        fk4Var.a(d2);
        RSoLog.d(str + " -> doWithReq done");
    }

    public final void u3(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c57acd2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        RSoLog.d("remo, RemoActivity - ensureFinish - " + str + " , loadingComplete = " + z + " , isFinishing() =  " + isFinishing());
        if (z && !isFinishing()) {
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        RSoLog.d("remo, RemoActivity - onOptionsItemSelected home clicked");
        onBackPressed();
        return true;
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43a14d4", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setTitle("淘宝");
        }
    }
}
