package com.taobao.android.order.bundle.base;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.TBOrderListActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.a;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import java.util.HashMap;
import tb.c2v;
import tb.cav;
import tb.ced;
import tb.d7r;
import tb.div;
import tb.eel;
import tb.f9v;
import tb.fxp;
import tb.gav;
import tb.hav;
import tb.hdl;
import tb.i2e;
import tb.idl;
import tb.jn0;
import tb.jql;
import tb.lor;
import tb.pqb;
import tb.rhx;
import tb.scv;
import tb.t2o;
import tb.tq1;
import tb.u60;
import tb.vav;
import tb.vel;
import tb.wqb;
import tb.ykl;
import tb.z9v;
import tb.zel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseActivity extends AppCompatActivity implements pqb, ITBPublicMenu, i2e, ced {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ParallelBizValueHelper.PageType b;
    public OnScreenChangedListener c;
    public String d;
    public vel f;

    /* renamed from: a  reason: collision with root package name */
    public a f9104a = null;
    public final zel e = new zel();

    static {
        t2o.a(713031733);
        t2o.a(297795600);
        t2o.a(927989771);
        t2o.a(297795644);
        t2o.a(297795643);
    }

    public BaseActivity() {
        hdl.a();
    }

    public static /* synthetic */ Object ipc$super(BaseActivity baseActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/base/BaseActivity");
        }
    }

    public static /* synthetic */ void l3(BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16bdca05", new Object[]{baseActivity});
        } else {
            baseActivity.x3();
        }
    }

    public static /* synthetic */ void m3(BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aae124", new Object[]{baseActivity});
        } else {
            baseActivity.u3();
        }
    }

    @Override // tb.ced
    public wqb e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqb) ipChange.ipc$dispatch("ac386ccf", new Object[]{this});
        }
        a aVar = this.f9104a;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public final String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return ParallelBizValueHelper.a(this.b);
    }

    public abstract a n3();

    public final String o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f203d369", new Object[]{this});
        }
        return ParallelBizValueHelper.b(this.b);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            TBAutoSizeConfig.x().h0(this.c);
        }
        a aVar = this.f9104a;
        if (!(aVar == null || aVar.d() == null)) {
            this.f9104a.d().b();
            this.f9104a.b();
        }
        z9v.u(this).k(this);
        vav.i("tborder");
        String o3 = o3();
        vav.i(o3);
        f9v.l(o3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        a aVar = this.f9104a;
        if (aVar != null && aVar.d() != null) {
            this.f9104a.d().c();
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
        a aVar = this.f9104a;
        if (aVar != null && aVar.d() != null) {
            this.f9104a.d().d();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        a aVar = this.f9104a;
        if (aVar != null && aVar.d() != null) {
            this.f9104a.d().a();
        }
    }

    public ParallelBizValueHelper.PageType p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParallelBizValueHelper.PageType) ipChange.ipc$dispatch("c6ec3c20", new Object[]{this});
        }
        return this.b;
    }

    public a q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("21cedb3e", new Object[]{this});
        }
        return this.f9104a;
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a72a71", new Object[]{this});
        } else if (this instanceof TBOrderListActivity) {
            this.b = ParallelBizValueHelper.PageType.order_list;
        } else if (!(this instanceof TBOrderDetailActivity)) {
        } else {
            if ("true".equals(jql.l(getIntent(), CoreConstants.IN_PARAMS_VIEW_LOGISTICS))) {
                this.b = ParallelBizValueHelper.PageType.logistics_detail;
            } else {
                this.b = ParallelBizValueHelper.PageType.order_detail;
            }
        }
    }

    public abstract void s3(Bundle bundle);

    @Override // tb.i2e
    public String t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        return ParallelBizValueHelper.c(this.b);
    }

    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6362b5b5", new Object[]{this});
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
        } else {
            q3().c().c(127);
        }
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        hav.d("DeviceAdapter", "OnScreenChangedListener register");
        this.c = new tq1(this);
        TBAutoSizeConfig.x().d0(this.c);
    }

    public abstract void w3();

    public final void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee0781", new Object[]{this});
            return;
        }
        int c = DXWidgetNode.DXMeasureSpec.c(rhx.a(this).width(), 1073741824);
        wqb c2 = this.f9104a.c();
        if (c2 instanceof gav) {
            ((gav) c2).getInstance().G().h1(c);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        super.onCreate(bundle);
        r3();
        String o3 = o3();
        f9v.v(o3);
        vav.h("tborder", this.e);
        vav.h(o3, this.e);
        y3(o3, bundle);
        z9v.u(this).D("apmClientBeforeNetworkLogicProcess", null);
        d7r.a(this);
        div.a().c(this);
        s3(bundle);
        this.f.f().put("order_core_engine_init_start", Long.valueOf(System.currentTimeMillis()));
        a n3 = n3();
        this.f9104a = n3;
        if (n3 != null) {
            n3.e();
            w3();
            lor.c(BaseBioNavigatorActivity.g, "onCreate", new String[0]);
        }
        this.f.f().put("order_core_engine_init_end", Long.valueOf(System.currentTimeMillis()));
        if (ykl.a()) {
            x3();
            v3();
        }
        t3();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        a aVar = this.f9104a;
        if (!(aVar == null || aVar.d() == null)) {
            this.f9104a.d().e();
        }
        try {
            z = u60.a(this);
        } catch (Throwable unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("voiceIsOpen", String.valueOf(z));
        c2v.getInstance().updatePageProperties(hashMap);
    }

    public final void y3(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560c24c8", new Object[]{this, str, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            this.f = new vel("error", this);
            return;
        }
        String stringExtra = intent.getStringExtra(eel.ORDER_TYPE);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = str;
        }
        this.f = new vel(stringExtra, this);
        long currentTimeMillis = System.currentTimeMillis();
        z9v u = z9v.u(this);
        u.x(this, str, getBizName());
        cav cavVar = new cav(idl.sPid, idl.a(str));
        cavVar.d(scv.b() ? 1.0f : 0.05f);
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra2 = intent.getLongExtra(Nav.NAV_TO_URL_START_UPTIME, 0L);
        long longExtra3 = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        String l = jql.l(intent, CoreConstants.IN_PARAMS_DETAILCLICK);
        this.d = l;
        boolean isEmpty = TextUtils.isEmpty(l);
        boolean z = !isEmpty;
        long parseLong = !isEmpty ? Long.parseLong(this.d) : 0L;
        long j = parseLong <= 0 ? longExtra : parseLong;
        if (j <= 0 || currentTimeMillis - j <= 0) {
            hav.d("OrderPerformanceTrack", "start time invalid");
            this.f.e(true, false, null);
            return;
        }
        u.o(stringExtra, j);
        u.g(cavVar);
        u.q(fxp.EXTRA_KEY_DEATH_RECOVERY, Boolean.valueOf(bundle != null));
        this.f.f().put(jn0.STAGE_KEY_CLICK_START, Long.valueOf(j));
        this.f.f().put("up_nav_start_time", Long.valueOf(longExtra2));
        this.f.f().put("on_create_time", Long.valueOf(currentTimeMillis));
        u.C("apmClientFullStageProcess", longExtra, null);
        z9v.u(this).p(1, "d2", String.valueOf(z));
        if (longExtra > 0 && longExtra3 > 0) {
            u.C("apmClientLayoutComplete", longExtra, null);
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("navStage");
            ultronPerformanceStageModel.setStartMills(longExtra);
            ultronPerformanceStageModel.setEndMills(currentTimeMillis);
            u.h(ultronPerformanceStageModel, null, false);
        }
    }
}
