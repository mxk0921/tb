package com.taobao.themis.container.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import tb.a07;
import tb.acq;
import tb.baj;
import tb.bbs;
import tb.cbs;
import tb.ckf;
import tb.ies;
import tb.jpu;
import tb.mqb;
import tb.o9s;
import tb.ozp;
import tb.q8s;
import tb.q9s;
import tb.rds;
import tb.t2o;
import tb.xhv;
import tb.ycs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/container/app/TMSBaseActivity;", "Landroidx/fragment/app/FragmentActivity;", "Ltb/cbs;", "<init>", "()V", "Companion", "a", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSBaseActivity extends FragmentActivity implements cbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public q8s f13484a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715083);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715082);
        t2o.a(839909408);
    }

    public static /* synthetic */ Object ipc$super(TMSBaseActivity tMSBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/TMSBaseActivity");
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

    public q8s l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q8s) ipChange.ipc$dispatch("2c44cb1a", new Object[]{this});
        }
        return this.f13484a;
    }

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

    public String m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4866ffc1", new Object[]{this});
        }
        return getIntent().getDataString();
    }

    public void n3(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6243713", new Object[]{this, bbsVar});
        } else {
            ckf.g(bbsVar, "instance");
        }
    }

    public void o3(q8s q8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ece700", new Object[]{this, q8sVar});
        } else {
            this.f13484a = q8sVar;
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
        q8s l3 = l3();
        if (l3 != null) {
            l3.j(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        q8s l3 = l3();
        if (l3 != null) {
            l3.x(configuration);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            q8s l3 = l3();
            if (l3 == null) {
                xhvVar = null;
            } else {
                l3.k();
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        q8s l3 = l3();
        if (l3 != null && l3.y(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (q9s.M1()) {
            q8s l3 = l3();
            if (l3 != null) {
                l3.z();
            }
            super.onPause();
        } else {
            super.onPause();
            q8s l32 = l3();
            if (l32 != null) {
                l32.z();
            }
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
        q8s l3 = l3();
        if (l3 != null) {
            l3.A();
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
        q8s l3 = l3();
        if (l3 != null) {
            l3.B();
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
        q8s l3 = l3();
        if (l3 != null) {
            l3.C();
        }
    }

    public final void p3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecae4936", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        q8s q8sVar;
        q8s l3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanExtra = getIntent().getBooleanExtra("recycledActivity", false);
        IpChange ipChange2 = rds.$ipChange;
        super.onCreate(bundle);
        if (bundle == null || bundle.containsKey("shouldRelaunch")) {
            if (TMSSolutionType.getType(ies.g(m3())) == TMSSolutionType.WEB_SINGLE_PAGE) {
                q8sVar = new ozp(this);
            } else {
                setContentView(R.layout.tms_activity_main);
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tms_splash_container);
                ckf.f(viewGroup, "splashViewContainer");
                q8sVar = new baj(this, viewGroup);
            }
            o3(q8sVar);
            String a2 = ycs.a(m3());
            q8s l32 = l3();
            if (l32 != null) {
                ckf.d(a2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "containerOnCreate", (String) Long.valueOf(currentTimeMillis));
                jSONObject.put((JSONObject) "recycledActivity", (String) Boolean.valueOf(booleanExtra));
                jSONObject.put((JSONObject) "tms_instance_id", getIntent().getStringExtra("tms_instance_id"));
                xhv xhvVar = xhv.INSTANCE;
                bbs b = l32.b(a2, jSONObject);
                if (b != null) {
                    n3(b);
                }
            }
            q8s l33 = l3();
            if (l33 != null) {
                l33.o(kotlin.collections.a.j(jpu.a("containerOnCreate", String.valueOf(currentTimeMillis)), jpu.a("recycledActivity", String.valueOf(booleanExtra))));
            }
            if ((!this.b || !q9s.T()) && (l3 = l3()) != null) {
                mqb.a.b(l3, null, null, 3, null);
                return;
            }
            return;
        }
        TMSLogger.b("TMSBaseActivity", "activity recycle by system , reload page");
        Intent intent = (Intent) getIntent().clone();
        intent.setClass(this, getClass());
        intent.putExtra("recycledActivity", true);
        startActivity(intent);
        finish();
    }
}
