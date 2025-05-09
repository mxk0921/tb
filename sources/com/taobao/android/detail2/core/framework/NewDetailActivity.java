package com.taobao.android.detail2.core.framework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import com.taobao.falco.m;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.weex.common.WXModule;
import java.util.List;
import tb.a6r;
import tb.acq;
import tb.aqz;
import tb.bqz;
import tb.bxj;
import tb.byj;
import tb.c21;
import tb.cvh;
import tb.cw6;
import tb.cyj;
import tb.d7r;
import tb.dh7;
import tb.ec7;
import tb.fvh;
import tb.gmh;
import tb.gvh;
import tb.gxq;
import tb.i0d;
import tb.j0d;
import tb.jtv;
import tb.kxj;
import tb.liz;
import tb.miz;
import tb.mqj;
import tb.nyj;
import tb.o2r;
import tb.oxj;
import tb.q0j;
import tb.qp0;
import tb.qyj;
import tb.r19;
import tb.sut;
import tb.syj;
import tb.t2o;
import tb.tsd;
import tb.txj;
import tb.tz8;
import tb.uxj;
import tb.xfb;
import tb.xmo;
import tb.xpz;
import tb.ypz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailActivity extends AppCompatActivity implements bxj, tsd, a6r, i0d, j0d, xfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public xpz I0;

    /* renamed from: a  reason: collision with root package name */
    public oxj f7084a;
    public SystemBarDecorator b;
    public boolean d;
    public boolean e;
    public Runnable g;
    public long h;
    public boolean i;
    public String j;
    public boolean k;
    public gmh l;
    public cyj m;
    public final uxj c = new uxj();
    public boolean f = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends r19.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f7085a;
        public final /* synthetic */ Intent b;

        public a(long j, Intent intent) {
            this.f7085a = j;
            this.b = intent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailActivity$1");
        }

        @Override // tb.r19.d, tb.hlb
        public Intent a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("2585938d", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "doRenderPrepare";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (NewDetailActivity.l3(NewDetailActivity.this) != null) {
                if (NewDetailActivity.this.O1()) {
                    txj.e(txj.TAG_TIP, "doRenderPrepare abort. 当前页面已销毁。");
                    return;
                }
                NewDetailActivity newDetailActivity = NewDetailActivity.this;
                NewDetailActivity.n3(newDetailActivity, this.f7085a, newDetailActivity.getIntent());
                NewDetailActivity.p3(NewDetailActivity.this).A(NewDetailActivity.o3(NewDetailActivity.this));
                NewDetailActivity.m3(NewDetailActivity.this, null);
                if (NewDetailActivity.q3(NewDetailActivity.this)) {
                    int Z0 = byj.Z0();
                    if (Z0 >= 0) {
                        NewDetailActivity.b(NewDetailActivity.this, Z0);
                    } else {
                        NewDetailActivity.c(NewDetailActivity.this);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NewDetailActivity.p3(NewDetailActivity.this) != null && NewDetailActivity.q3(NewDetailActivity.this)) {
                NewDetailActivity.a(NewDetailActivity.this, false);
                txj.e(txj.TAG_TIP, "NdLifeEvent:OnResume:StartRun:Delay:downgradeForceCallResume:" + this.b);
                NewDetailActivity.p3(NewDetailActivity.this).B(NewDetailActivity.p3(NewDetailActivity.this).n());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NewDetailActivity.p3(NewDetailActivity.this) != null && NewDetailActivity.q3(NewDetailActivity.this)) {
                NewDetailActivity.a(NewDetailActivity.this, false);
                txj.e(txj.TAG_TIP, "NdLifeEvent:OnResume:StartRun:Delay:NdOnResume:callNdResumeDelayTime:" + this.b);
                NewDetailActivity.p3(NewDetailActivity.this).H(NewDetailActivity.p3(NewDetailActivity.this).n(), true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            txj.e(txj.TAG_RENDER, "onLoadActionSpan");
            if (mVar == null) {
                txj.e(txj.TAG_RENDER, "onLoadActionSpan null");
                return;
            }
            Intent intent = NewDetailActivity.this.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null) {
                    mVar.N("2.0");
                    txj.e(txj.TAG_RENDER, "uri null pageLevel: 2.0");
                } else if (gxq.EXP_ITEM_ARTICLE.equals(data.getQueryParameter(xmo.SP_KEY_ENTRY_EXP))) {
                    mVar.N("2.0");
                    txj.e(txj.TAG_RENDER, "pageLevel: 2.0");
                } else {
                    mVar.N("1.0");
                    txj.e(txj.TAG_RENDER, "pageLevel: 1.0");
                }
            } else {
                mVar.N("2.0");
                txj.e(txj.TAG_RENDER, "intent null pageLevel: 2.0");
            }
        }
    }

    static {
        t2o.a(352321582);
        t2o.a(352321587);
        t2o.a(336592972);
        t2o.a(775946324);
        t2o.a(352321580);
        t2o.a(352321581);
        t2o.a(352322008);
    }

    public static /* synthetic */ boolean a(NewDetailActivity newDetailActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6bcdb74", new Object[]{newDetailActivity, new Boolean(z)})).booleanValue();
        }
        newDetailActivity.i = z;
        return z;
    }

    public static /* synthetic */ void b(NewDetailActivity newDetailActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b339e", new Object[]{newDetailActivity, new Integer(i)});
        } else {
            newDetailActivity.n(i);
        }
    }

    public static /* synthetic */ void c(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b3c64", new Object[]{newDetailActivity});
        } else {
            newDetailActivity.z3();
        }
    }

    public static /* synthetic */ Object ipc$super(NewDetailActivity newDetailActivity, String str, Object... objArr) {
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
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1770587104:
                super.setContentView(((Number) objArr[0]).intValue());
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailActivity");
        }
    }

    public static /* synthetic */ Runnable l3(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("c3433f2a", new Object[]{newDetailActivity});
        }
        return newDetailActivity.g;
    }

    public static /* synthetic */ Runnable m3(NewDetailActivity newDetailActivity, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6d1836ee", new Object[]{newDetailActivity, runnable});
        }
        newDetailActivity.g = runnable;
        return runnable;
    }

    public static /* synthetic */ void n3(NewDetailActivity newDetailActivity, long j, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d0e018", new Object[]{newDetailActivity, new Long(j), intent});
        } else {
            newDetailActivity.v3(j, intent);
        }
    }

    public static /* synthetic */ String o3(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b58d6b8", new Object[]{newDetailActivity});
        }
        return newDetailActivity.j;
    }

    public static /* synthetic */ oxj p3(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oxj) ipChange.ipc$dispatch("ae78b332", new Object[]{newDetailActivity});
        }
        return newDetailActivity.f7084a;
    }

    public static /* synthetic */ boolean q3(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6af43aa", new Object[]{newDetailActivity})).booleanValue();
        }
        return newDetailActivity.i;
    }

    public final boolean A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59906a85", new Object[]{this})).booleanValue();
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar == null) {
            return false;
        }
        if (!oxjVar.l()) {
            txj.e(txj.TAG_RENDER, "enableWeexV2KeepLiveWithActivity 开关关闭");
            return false;
        } else if (this.f7084a.k() || this.f7084a.v()) {
            txj.e(txj.TAG_RENDER, "NewDetailActivity下weex实例预加载开启");
            return true;
        } else {
            txj.e(txj.TAG_RENDER, "isKeepLiveWeexOpen 和 isForceOpenPreloadWeex 开关关闭");
            return false;
        }
    }

    public final void B3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b53780", new Object[]{this, intent});
            return;
        }
        try {
            t3(intent);
            u3(intent);
        } catch (IllegalArgumentException e) {
            txj.e("new_detail异常", "即将二次读取 initParamsFromIntent");
            t3(intent);
            u3(intent);
            qyj.a("initParamsFromIntentError", "errorMsg:" + e);
            txj.e("new_detail异常", Log.getStackTraceString(e));
        }
    }

    @Override // tb.tsd
    public void G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
        } else if (P3("onPopStateChanged", str, jSONObject)) {
            try {
                this.f7084a.x(str, I3(jSONObject));
            } catch (Exception e) {
                txj.f(txj.TAG_VIDEO_ZOOM, "onPopStateChanged数据解析错误", e);
            }
        }
    }

    public void G3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61912d8f", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            txj.e(txj.TAG_TIP, "skipSuperOnStop");
        } else {
            super.onStop();
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar != null) {
            oxjVar.E(oxjVar.n());
        }
    }

    public final void H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f778395", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_RENDER, "processFalco");
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            txj.e(txj.TAG_RENDER, "null FalcoTracer");
        } else {
            tz8Var.j(new d());
        }
    }

    @Override // tb.a6r
    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d44aa950", new Object[]{this})).booleanValue();
        }
        if (r19.S0("fast_key_no_default_action_bar_style")) {
            return false;
        }
        return true;
    }

    public final void J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88419984", new Object[]{this});
            return;
        }
        cyj cyjVar = new cyj(this.j);
        this.m = cyjVar;
        c21.e(cyjVar);
    }

    @Override // tb.j0d
    public List<DetailWeexContainer> K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd65fec2", new Object[]{this});
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar == null) {
            return null;
        }
        return oxjVar.m();
    }

    public void K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0ffb0f", new Object[]{this});
            return;
        }
        try {
            w3();
        } catch (Exception e) {
            qyj.a("setContentAnimViewError", "exception:" + e);
            setContentView(R.layout.detail_activity_layout_for_mask_frame_layout);
        }
    }

    public void L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf7bc9e", new Object[]{this});
            return;
        }
        try {
            x3();
        } catch (Exception e) {
            qyj.a("setContentViewError", "exception:" + e);
            setContentView(R.layout.detail_activity_layout);
        }
    }

    @Override // tb.xfb
    public void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ea209e", new Object[]{this});
        } else {
            finish();
        }
    }

    public final void M3(Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04fae23", new Object[]{this, intent});
        } else if (intent != null && (extras = intent.getExtras()) != null) {
            try {
                fvh a2 = gvh.a();
                String string = extras.getString(jtv.S_ARGS_IS_CLIENT_CACHE);
                q0j.a(this, "HPisClientCache", string);
                if (string != null) {
                    a2.m(jtv.S_ARGS_IS_CLIENT_CACHE, string);
                }
                String string2 = extras.getString("targetType");
                q0j.a(this, "HPTargetType", string2);
                a2.m("targetType", string2);
                String string3 = extras.getString("requestNewDetailFlag");
                q0j.a(this, "HPRequestND", string3);
                a2.m("requestNewDetailFlag", string3);
                String string4 = extras.getString("requestNewDetailTime");
                if (!TextUtils.isEmpty(string4)) {
                    long parseLong = Long.parseLong(string4);
                    q0j.y(this, q0j.SECTION_OPEN_IMMED_HP_TO_REAL_REQUEST, sut.a(parseLong), "");
                    a2.m("preRequestStartTs", Long.valueOf(parseLong));
                }
                nyj.z().L(String.valueOf(this.h), a2);
            } catch (Exception e) {
                txj.f("new_detail异常", "traceHPStatus出错", e);
            }
        }
    }

    public final void N3(Intent intent, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42f3bc", new Object[]{this, intent, new Long(j), new Long(j2)});
        } else {
            y3(intent, j, j2, sut.a(j));
        }
    }

    @Override // tb.i0d
    public boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db1a0052", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            return this.e;
        }
        return this.d;
    }

    public final void O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e396334b", new Object[]{this});
            return;
        }
        cyj cyjVar = this.m;
        if (cyjVar != null) {
            c21.m(cyjVar);
        }
    }

    @Override // tb.tsd
    public void S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee651ff0", new Object[]{this, jSONObject});
        } else if (P3("onPopPositionChanged", "", jSONObject)) {
            try {
                this.f7084a.w(I3(jSONObject));
            } catch (Exception e) {
                txj.f(txj.TAG_VIDEO_ZOOM, "onPopPositionChanged数据解析错误", e);
            }
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

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (!r19.s0()) {
            this.c.o();
        }
        super.finish();
    }

    @Override // tb.bxj
    public void finishNewDetailContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704d3e6a", new Object[]{this});
            return;
        }
        xpz xpzVar = this.I0;
        if (xpzVar == null || !xpzVar.onFinishContainer()) {
            finish();
        }
    }

    @Override // tb.xfb
    public void frameAnimSetContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1910d5f1", new Object[]{this, view});
        } else if (view != null) {
            setContentView(view);
        }
    }

    @Override // tb.bxj
    public int getNewDetailContainerStatusBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5300567c", new Object[]{this})).intValue();
        }
        return this.b.getConfig().getStatusBarHeight();
    }

    @Override // tb.bxj
    public Activity getNewDetailContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("26c4bd2d", new Object[]{this});
        }
        return this;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ff6353", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.root);
        Intent intent = getIntent();
        aqz b2 = bqz.b("NewDetailPage", frameLayout, intent, intent.getExtras());
        if (b2.a()) {
            b2.g(this);
            b2.j(R.id.rootParentFrameLayout);
            b2.i(R.id.rootAnimFrameLayout);
            b2.f(this);
            b2.e(new miz());
            xpz e = ypz.e(b2);
            setContentView(e.a());
            this.I0 = e;
            return;
        }
        p();
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0f7f46", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            txj.e(txj.TAG_TIP, "NdLifeDetail:delayCallNdResumeEvent:NdOnResume:callNdResumeDelayTime:" + i);
            if (i != 0) {
                r19.d0().postDelayed(new c(i), i);
            } else if (this.f7084a != null && this.i) {
                this.i = false;
                txj.e(txj.TAG_TIP, "NdLifeEvent:OnResume:StartRun:Immediate:NdOnResume:callNdResumeDelayTime:" + i);
                oxj oxjVar = this.f7084a;
                oxjVar.H(oxjVar.n(), true);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar != null) {
            if (!oxjVar.g()) {
                this.f7084a.z();
                xpz xpzVar = this.I0;
                if (xpzVar == null || !xpzVar.onBackPressed()) {
                    finish();
                }
            }
        } else if (r19.t0()) {
            xpz xpzVar2 = this.I0;
            if (xpzVar2 == null || !xpzVar2.onBackPressed()) {
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        nyj.z().I(this.j, "onPause");
        D3(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            G3(false);
        }
    }

    public final void p() {
        gmh gmhVar;
        FrameLayout d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9100e4", new Object[]{this});
        } else if (!this.k || (gmhVar = this.l) == null || (d2 = gmhVar.d(true)) == null) {
            setContentView(R.layout.detail_activity_layout_for_mask_frame_layout);
        } else {
            this.l.j(this);
            setContentView(d2);
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b190c9", new Object[]{this});
        } else if (!this.k) {
            txj.e(txj.TAG_TIP, "TBAutoSizeStart02.");
            d7r.a(this);
        } else if (r19.k()) {
            txj.e(txj.TAG_TIP, "TBAutoSizeSkip.");
        } else {
            txj.e(txj.TAG_TIP, "TBAutoSizeStart01.");
            d7r.a(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
        } else {
            super.setContentView(i);
        }
    }

    public final void t3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f559347b", new Object[]{this, intent});
        } else if (intent != null) {
            long longExtra = intent.getLongExtra(kxj.KEY_NAV_LONG_TOKEN, -1L);
            this.h = longExtra;
            this.j = String.valueOf(longExtra);
        }
    }

    public final void u3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424fa62b", new Object[]{this, intent});
        } else if (intent != null) {
            intent.getBooleanExtra(kxj.KEY_NAV_HIT_TOP_SPEED_FIRST_PIC, false);
            this.k = intent.getBooleanExtra("lowBatteryNdQuickJump", false);
        }
    }

    @Override // tb.bxj
    public void updateBatteryBarDarkMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa527865", new Object[]{this, new Boolean(z)});
        } else {
            this.b.enableImmersiveStatusBar(z);
        }
    }

    public void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5850444", new Object[]{this});
        } else if (!cw6.b() || !liz.a("nd_back_anim_test")) {
            p();
        } else {
            m();
        }
    }

    public void x3() {
        gmh gmhVar;
        FrameLayout d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a63a853", new Object[]{this});
        } else if (!this.k || (gmhVar = this.l) == null || (d2 = gmhVar.d(false)) == null) {
            setContentView(R.layout.detail_activity_layout);
        } else {
            this.l.j(this);
            setContentView(d2);
        }
    }

    public final void y3(Intent intent, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d757cf3", new Object[]{this, intent, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        q0j.a(this, "ndDeviceScore", Float.valueOf(qp0.c()));
        M3(intent);
        q0j.y(this, q0j.SECTION_NAV, j3, "");
        if (this.c.m()) {
            q0j.y(this, q0j.SECTION_FAST_ANIM_VISIBLE, j3, "");
        }
        q0j.y(this, q0j.SECTION_VISIBLE, j3, "");
        q0j.y(this, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, j3, "");
        q0j.y(this, q0j.SECTION_FIRST_NATIVE_PIC_VISIBLE, j3, "");
        q0j.y(this, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE, j3, "");
        q0j.y(this, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_WEEX_VISIBLE, j3, "");
        q0j.y(this, q0j.SECTION_NAV_BAR_WEEX_VISIBLE, j3, "");
        q0j.y(this, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, j3, "");
        q0j.y(this, q0j.SECTION_FIRST_VIDEO_READY, j3, "");
        q0j.w(this, q0j.SECTION_NAV, j2, "");
        q0j.y(this, q0j.SECTION_CONTAINER_INIT, j2, "");
        q0j.z(this, q0j.SECTION_SECOND_WEEX_VISIBLE, "");
        q0j.z(this, q0j.SECTION_SECOND_NATIVE_PIC_VISIBLE, "");
    }

    public final void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c5b1fe", new Object[]{this});
            return;
        }
        int E0 = byj.E0();
        if (E0 >= 0) {
            txj.e(txj.TAG_TIP, "NdLifeDetail:DowngradeForceCallResume 强制初尝 resume 事件。downgradeForceCallResume:" + E0);
            if (E0 != 0) {
                r19.d0().postDelayed(new b(E0), E0);
            } else if (this.f7084a != null && this.i) {
                this.i = false;
                txj.e(txj.TAG_TIP, "NdLifeEvent:OnResume:StartRun:Immediate:downgradeForceCallResume:" + E0);
                oxj oxjVar = this.f7084a;
                oxjVar.B(oxjVar.n());
            }
        }
    }

    public void D3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bc4079", new Object[]{this, new Boolean(z)});
            return;
        }
        o2r.a("NewDetailActivity_onPause");
        boolean z2 = this.i;
        this.i = false;
        if (this.f7084a != null) {
            txj.e(txj.TAG_TIP, "NdLifeEvent:onPause:StartRun:Direct:oldPendingResume:" + z2);
            oxj oxjVar = this.f7084a;
            oxjVar.y(oxjVar.n(), false);
        }
        if (z) {
            txj.e(txj.TAG_TIP, "skipSuperOnPause");
        } else {
            super.onPause();
        }
        o2r.b();
    }

    public void F3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84cb718d", new Object[]{this, new Boolean(z)});
            return;
        }
        String e = nyj.z().e(this.j, "onStartInternal");
        if (z) {
            txj.e(txj.TAG_TIP, "skipSuperOnStart");
        } else {
            super.onStart();
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar != null) {
            oxjVar.D(oxjVar.n());
        }
        nyj.z().u(this.j, e, "onStartInternal", true);
    }

    public final void v3(long j, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1fb5d4", new Object[]{this, new Long(j), intent});
            return;
        }
        String e = nyj.z().e(this.j, "runDoRenderPrepare");
        o2r.a("doRenderPrepare");
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.root);
        if (!this.c.m() || this.c.l() == null) {
            o2r.a("new_NewDetailInstance");
            this.f7084a = new oxj(this, frameLayout, intent, null, this.c.k(), this.j);
            o2r.b();
        } else {
            o2r.a("new_NewDetailInstance_MaskFrameAnim");
            this.f7084a = new oxj(this, frameLayout, intent, this.c.l().getNewDetailMaskFrameLayoutContext(), null, this.j);
            o2r.b();
        }
        this.f7084a.C(j);
        o2r.b();
        nyj.z().u(this.j, e, "runDoRenderPrepare", true);
    }

    public void E3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88ed704", new Object[]{this, new Boolean(z)});
            return;
        }
        String e = nyj.z().e(this.j, "onResumeInternal");
        if (z) {
            txj.e(txj.TAG_TIP, "skipSuperOnResume");
        } else {
            super.onResume();
        }
        H3();
        if (this.f7084a != null) {
            this.i = false;
            txj.e(txj.TAG_TIP, "NdLifeEvent:OnResume:StartRun:Direct");
            oxj oxjVar = this.f7084a;
            oxjVar.H(oxjVar.n(), false);
            oxj oxjVar2 = this.f7084a;
            oxjVar2.B(oxjVar2.n());
        } else {
            this.i = true;
        }
        nyj.z().u(this.j, e, "onResumeInternal", true);
    }

    public final dh7.j I3(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7.j) ipChange.ipc$dispatch("8741b5fa", new Object[]{this, jSONObject});
        }
        dh7.j jVar = new dh7.j();
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return jVar;
        }
        jVar.c = ec7.a(this, jSONObject2.getInteger("x").intValue());
        jVar.d = ec7.a(this, jSONObject2.getInteger("y").intValue());
        jVar.e = ec7.a(this, jSONObject2.getInteger("h").intValue());
        jVar.f = ec7.a(this, jSONObject2.getInteger("w").intValue());
        JSONObject jSONObject3 = jSONObject2.getJSONObject("animations");
        if (!(jSONObject3 == null || (jSONArray = jSONObject3.getJSONArray("translationY")) == null)) {
            jVar.f17820a = ec7.a(this, jSONArray.getFloat(0).floatValue());
            jVar.b = ec7.a(this, jSONArray.getFloat(1).floatValue());
        }
        return jVar;
    }

    public final boolean P3(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56313f4d", new Object[]{this, str, str2, jSONObject})).booleanValue();
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "scene: " + str + ", state: " + str2 + ", mNewDetailInstance为空，不响应浮层回调");
            return false;
        } else if (oxjVar.j()) {
            return true;
        } else {
            txj.e(txj.TAG_VIDEO_ZOOM, "scene: " + str + ", state: " + str2 + ", 开关关闭，不响应浮层回调");
            return false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        long g = cvh.g();
        B3(getIntent());
        nyj.z().r(this.j, "biz_nav_after", true, g);
        nyj.z().M(this.j, "pageOnCreateTs", Long.valueOf(g));
        nyj.z().b(this.j, "page_on_create");
        C3(bundle, false);
        J3();
        nyj.z().q(this.j, "page_on_create", true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        nyj.z().I(this.j, "onDestroy");
        this.d = true;
        if (!r19.s0()) {
            this.c.n();
        }
        oxj oxjVar = this.f7084a;
        if (oxjVar != null) {
            oxjVar.h();
        }
        super.onDestroy();
        Context context = TBMainHost.b().getContext();
        if (r19.G0()) {
            txj.e("NewDetailLaunchIdleTask", "onDestroy Task , Run , preloadWeexV2FromCache 01");
            syj.i("onDestroy");
        } else if (A3() && (context instanceof Activity)) {
            qyj.a("weex_sync_delete_code", "onDestroy preloadDetailCardMainPicWeex Error:" + r19.Y());
        }
        r19.U0(this.g);
        if (r19.p0()) {
            mqj.i();
        }
        O3();
        String valueOf = String.valueOf(this.h);
        nyj.z().P(valueOf, nyj.KEY_END_TYPE, "onDestroy");
        nyj.z().D(valueOf, false);
        nyj.z().l(valueOf);
        this.e = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        nyj.z().b(this.j, "page_on_appear");
        E3(false);
        nyj.z().q(this.j, "page_on_appear", true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        nyj.z().b(this.j, "page_on_start");
        o2r.a("NewDetailActivity_onStart");
        F3(false);
        o2r.b();
        nyj.z().q(this.j, "page_on_start", true);
    }

    public void C3(Bundle bundle, boolean z) {
        String str;
        long j;
        int c0;
        boolean z2;
        String str2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a2531f", new Object[]{this, bundle, new Boolean(z)});
            return;
        }
        String e = nyj.z().e(this.j, "onCreateInternal");
        nyj.z().d(e, "pageSettingPrepare", e);
        o2r.a("NewDetailActivity_onCreate");
        this.l = gmh.c(this.h);
        this.f = byj.G0();
        if (bundle != null) {
            try {
                bundle.remove("android:support:fragments");
            } catch (Throwable th2) {
                txj.f("new_detail异常", "未知异常。savedInstanceState remove.", th2);
            }
        }
        Intent intent = getIntent();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (intent != null) {
            str = txj.TAG_FAST_ANIM;
            try {
                j = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
            } catch (IllegalArgumentException e2) {
                txj.e("new_detail异常", "即将二次读取 NAV_TO_URL_START_TIME");
                j = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
                qyj.a("ndReadNavStartTimeError", "优化列表SwitchList::sjs:" + r19.Y() + " tpp:" + r19.a0() + " errorMsg:" + e2.getMessage());
                txj.e("new_detail异常", Log.getStackTraceString(e2));
            }
        } else {
            str = txj.TAG_FAST_ANIM;
            j = -1;
        }
        nyj.z().t(this.j, "pageSettingPrepare", true, e);
        nyj.z().d(this.j, "pageAnimPrepare", e);
        o2r.a("onCreate1");
        this.c.q(this, intent);
        o2r.b();
        nyj.z().t(this.j, "pageAnimPrepare", true, e);
        nyj.z().d(this.j, "ndSuperOnCreate", e);
        o2r.a("super_onCreate");
        if (z) {
            txj.e(txj.TAG_TIP, "skipSuperOnCreate");
        } else {
            super.onCreate(bundle);
        }
        o2r.b();
        nyj.z().t(this.j, "ndSuperOnCreate", true, e);
        nyj.z().d(this.j, "screenAdapterAndNdTrace", e);
        o2r.a("onCreate2");
        s3();
        this.b = new SystemBarDecorator(this);
        N3(intent, j, uptimeMillis);
        o2r.b();
        nyj.z().t(this.j, "screenAdapterAndNdTrace", true, e);
        nyj.z().d(this.j, "firstSetRootView", e);
        o2r.a("setContentView");
        if (r19.s0()) {
            L3();
        } else if (this.c.m()) {
            try {
                K3();
                this.c.p(this, this);
                if (!this.c.m()) {
                    L3();
                    str2 = str;
                    try {
                        txj.e(str2, "setContentViewForMaskFrameLayout 检测到不符合无极缩放条件。");
                    } catch (Throwable th3) {
                        th = th3;
                        this.c.j();
                        txj.f(str2, "未知异常。setContentViewForMaskFrameLayout 出错。", th);
                        L3();
                        o2r.b();
                        nyj.z().t(this.j, "firstSetRootView", true, e);
                        nyj.z().d(this.j, "callDoRenderPrepare", e);
                        c0 = r19.c0("delay_render_prepare", 200);
                        if (c0 != -1) {
                        }
                        qyj.a("weex_sync_delete_code", "doRenderPrepare delayRenderPrepareTime:" + c0 + " sjs:" + r19.Y());
                        v3(j, intent);
                        z2 = true;
                        this.b.enableImmersiveStatusBar(true);
                        this.f7084a.A(this.j);
                        o2r.b();
                        nyj.z().t(this.j, "callDoRenderPrepare", z2, e);
                        nyj.z().u(this.j, e, "onCreateInternal", z2);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                str2 = str;
            }
        } else {
            L3();
        }
        o2r.b();
        nyj.z().t(this.j, "firstSetRootView", true, e);
        nyj.z().d(this.j, "callDoRenderPrepare", e);
        c0 = r19.c0("delay_render_prepare", 200);
        if (c0 != -1 || !r19.t0() || r19.n()) {
            qyj.a("weex_sync_delete_code", "doRenderPrepare delayRenderPrepareTime:" + c0 + " sjs:" + r19.Y());
            v3(j, intent);
            z2 = true;
            this.b.enableImmersiveStatusBar(true);
            this.f7084a.A(this.j);
        } else {
            o2r.a("onCreate3");
            this.b.enableImmersiveStatusBar(true);
            this.g = new a(j, intent);
            o2r.a("post_BizRenderPrepareRunnable_" + c0);
            o2r.b();
            r19.d1(this.g);
            r19.d0().postDelayed(this.g, c0);
            o2r.b();
            z2 = true;
        }
        o2r.b();
        nyj.z().t(this.j, "callDoRenderPrepare", z2, e);
        nyj.z().u(this.j, e, "onCreateInternal", z2);
    }
}
