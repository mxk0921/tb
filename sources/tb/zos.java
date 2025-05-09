package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngine;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.monitor.procedure.IPage;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zos extends anl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32913a;
    public final sll b;
    public final FrameLayout c;
    public final ViewGroup d;
    public boolean e;
    public final IPage f;
    public final Activity g = new Activity();
    public final TurboEngine h;

    static {
        t2o.a(502268061);
    }

    public zos(Context context, sll sllVar, String str, Bundle bundle) {
        this.f32913a = context;
        this.b = sllVar;
        this.url = str;
        bcq.a().f(context, kpu.BUNDLE_TURBOFLOW_BIZ_REMOTE);
        TurboEngine b = b(context, str);
        this.h = b;
        b.onPageCreate();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup view = b.getView();
        this.d = view;
        this.c = frameLayout;
        this.f = uml.c().a(view, true);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ Object ipc$super(zos zosVar, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/Tab2PageImpl");
        }
    }

    public final Intent a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("13d6f7fd", new Object[]{this, new Boolean(z)});
        }
        Intent intent = new Intent("TBBootImageForbiddenModeBroadcast");
        if (z) {
            str = "startForbidden";
        } else {
            str = "stopForbidden";
        }
        intent.putExtra(v4s.PARAM_UPLOAD_STAGE, str);
        intent.putExtra("bizId", "tab2");
        intent.putExtra("scene", "tab2_coldlaunch");
        if (z) {
            intent.putExtra("timeout", 5);
        }
        return intent;
    }

    public final TurboEngine b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("7df16822", new Object[]{this, context, str});
        }
        TurboEngineConfig.a a2 = TurboEngineConfig.a();
        a2.d(context);
        a2.i(str);
        a2.g(kpu.d(true));
        a2.f(kpu.c());
        a2.e(this);
        a2.h(this.g);
        return spu.h(a2.a());
    }

    /* renamed from: c */
    public ViewGroup getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this});
        }
        return this.d;
    }

    /* renamed from: d */
    public ViewGroup getDecorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5298363a", new Object[]{this});
        }
        return this.c;
    }

    public TurboEngine e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("19ad622a", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.anl
    public void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else {
            getPageContainer().x(this, z);
        }
    }

    @Override // tb.anl
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return (Activity) this.f32913a;
    }

    @Override // tb.anl
    public sll getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sll) ipChange.ipc$dispatch("16ff9556", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.anl
    public Object getUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbe25f7", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.anl
    public void hideActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
        }
    }

    @Override // tb.anl
    public boolean isFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd16a70", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    @Override // tb.hpj.b
    public void onBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc8977", new Object[]{this, str});
        }
    }

    @Override // tb.anl
    public void onBackButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767cf6b7", new Object[]{this});
        }
    }

    @Override // tb.anl
    public boolean onBackPressed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d542d5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return ((f6d) this.h.getInvoker(f6d.class)).a(true);
    }

    @Override // tb.anl
    public void onBeforeStartTransition(qol qolVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bd77ae", new Object[]{this, qolVar, new Boolean(z)});
        }
    }

    @Override // tb.anl
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        tfs.e("Tab2PageImpl", "onCreate");
        this.f.e().a(f21.f(this.url), this.url, null);
        f();
    }

    @Override // tb.anl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        tfs.e("Tab2PageImpl", "onDestroy");
        this.h.onPageDestroy();
        c2v.getInstance().pageDestroyed(this.g);
        p0v.b(getUTObject());
        this.f.e().onPageDestroy();
        g();
    }

    @Override // tb.hpj.b
    public void onFinish(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e7fbd", new Object[]{this, str, new Float(f)});
        }
    }

    @Override // tb.hpj.b
    public void onMove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb54e1", new Object[]{this, str});
        }
    }

    @Override // tb.anl
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        tfs.e("Tab2PageImpl", "onPause");
        this.h.onPagePause();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getUTObject());
        this.f.e().onPageDisappear();
    }

    @Override // tb.anl
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        tfs.e("Tab2PageImpl", "onStart");
        this.h.onPageStart();
    }

    @Override // tb.anl
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        tfs.e("Tab2PageImpl", "onStop");
        this.h.onPageStop();
    }

    @Override // tb.anl
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.anl
    public void postponedEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef076e6", new Object[]{this});
        } else {
            this.c.setVisibility(4);
        }
    }

    @Override // tb.anl
    public void setIsFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b09d5aa", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    @Override // tb.anl
    public void setNavigationBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e885d6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.anl
    public void setStatusBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14207b8", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.anl
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        }
    }

    @Override // tb.anl
    public void showActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f6807", new Object[]{this});
        }
    }

    @Override // tb.anl
    public void startPostponedEnterTransition(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977076a", new Object[]{this, view});
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6194b9", new Object[]{this});
        } else if (e0o.d() && akt.p2("disableBootImage", false)) {
            LocalBroadcastManager.getInstance(this.f32913a).sendBroadcast(a(false));
            tfs.e("Tab2PageImpl", "stopForbiddenBootImage");
        }
    }

    @Override // tb.anl
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        tfs.e("Tab2PageImpl", "onResume");
        this.h.onPageResume();
        this.f.e().onPageAppear();
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(getUTObject());
        p0v.c(getUTObject(), true);
        UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(getUTObject(), Uri.parse(this.url));
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badac919", new Object[]{this});
        } else if (e0o.d() && akt.p2("disableBootImage", false)) {
            LocalBroadcastManager.getInstance(this.f32913a).sendBroadcast(a(true));
            tfs.e("Tab2PageImpl", "startForbiddenBootImage");
        }
    }
}
