package com.taobao.android.purchase.aura;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.a8r;
import tb.aar;
import tb.acq;
import tb.al;
import tb.bbb;
import tb.ck;
import tb.cqv;
import tb.f8r;
import tb.h8r;
import tb.hh;
import tb.j8r;
import tb.jud;
import tb.l8r;
import tb.lbj;
import tb.lud;
import tb.mud;
import tb.o9r;
import tb.rbb;
import tb.rm0;
import tb.sy;
import tb.t2o;
import tb.v9r;
import tb.vm0;
import tb.x9r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyActivity extends AppCompatActivity implements mud, jud, lud, bbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, sy> f9220a = new HashMap();
    public sy b;
    public TBBuyBroadcastReceiver c;

    static {
        t2o.a(708837433);
        t2o.a(708837431);
        t2o.a(708837428);
        t2o.a(708837430);
        t2o.a(81788949);
    }

    public static /* synthetic */ Object ipc$super(TBBuyActivity tBBuyActivity, String str, Object... objArr) {
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
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
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
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/TBBuyActivity");
        }
    }

    @Override // tb.bbb
    public Intent A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("dd388005", new Object[]{this});
        }
        return getIntent();
    }

    @Override // tb.mud
    public String I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
        }
        sy syVar = this.b;
        if (syVar == null) {
            return TBBuyPageMode.fullPageMode;
        }
        return syVar.b();
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
            return;
        }
        sy syVar = this.b;
        if (syVar != null) {
            syVar.l(this, z);
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

    @Override // tb.bbb
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!al.n("purchase", "onBack")) {
            finish();
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        sy syVar = this.b;
        if (syVar != null) {
            syVar.a(this, jSONObject);
        }
    }

    @Override // tb.lud
    public String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        sy syVar = this.b;
        if (syVar == null) {
            return "native";
        }
        return syVar.c(this);
    }

    public final String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        if (!f8r.f(getIntent()) || rm0.b()) {
            return TBBuyPageMode.fullPageMode;
        }
        return TBBuyPageMode.halfPageMode;
    }

    @Override // tb.mud
    public Map<String, String> l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8e8b1035", new Object[]{this});
        }
        return f8r.b(getIntent());
    }

    public final j8r l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8r) ipChange.ipc$dispatch("ffeabfcd", new Object[]{this});
        }
        return new j8r(o9r.c(), R.layout.activity_purchase_v2, R.id.purchase_container);
    }

    public final void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dfe38b", new Object[]{this});
            return;
        }
        ((HashMap) this.f9220a).clear();
        ((HashMap) this.f9220a).put(TBBuyPageMode.halfPageMode, new l8r(o9r.c()));
        ((HashMap) this.f9220a).put(TBBuyPageMode.fullPageMode, l3());
    }

    public final boolean n3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d992112", new Object[]{this, bundle})).booleanValue();
        }
        if (bundle == null || bundle.getString("__fragment__") == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        sy syVar = this.b;
        if (syVar != null) {
            syVar.e(this, i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        sy syVar = this.b;
        if (syVar != null) {
            syVar.f(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = this.c;
        if (tBBuyBroadcastReceiver != null) {
            tBBuyBroadcastReceiver.d();
        }
        sy syVar = this.b;
        if (syVar != null) {
            syVar.i(this);
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
        sy syVar = this.b;
        if (syVar != null) {
            syVar.j(this);
        }
        x9r.b(this);
        cqv.m("Page_ConfirmOrder", null, this, new String[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        sy syVar = this.b;
        if (syVar != null) {
            syVar.k(this);
        }
        aar.a(aar.f15632a);
        cqv.l("Page_ConfirmOrder", null, this, new String[0]);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        try {
            rbb g = ck.g();
            g.f("TBBuyActivity onSaveInstanceState. InstanceId = " + hashCode(), ck.b.b().i("LightBuy/common").a());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.findFragmentByTag("fragment_general_purchase_container") != null) {
                bundle.putString("__fragment__", "half-native");
            }
            if (supportFragmentManager.findFragmentByTag("fragment_light_buy_container") != null) {
                bundle.putString("__fragment__", "half-weex");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        sy syVar = this.b;
        if (syVar != null) {
            syVar.d(str, jSONObject);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        v9r.a("onCreate stage 1");
        ck.g().e("onCreate");
        h8r.a(this);
        m3();
        this.b = (sy) ((HashMap) this.f9220a).get(getContainerType());
        if (f8r.e(this)) {
            str = TBBuyPageMode.fullPageMode;
        } else {
            str = TBBuyPageMode.halfPageMode;
        }
        o9r.c().k(str);
        this.b.g(this, str);
        v9r.g();
        v9r.a("onCreate");
        super.onCreate(bundle);
        v9r.g();
        v9r.a("onCreate stage 2");
        hh.f20632a = true;
        if (n3(bundle)) {
            ck.g().f("捕捉到死亡恢复的场景，直接关闭TBBuyActivity", ck.b.b().i("LightBuy/common").a());
            vm0.e("ActivityDeadRecovery", "TBBuyActivity死亡恢复场景");
            finish();
            return;
        }
        v9r.a("onCreate ut");
        getIntent().putExtra("NEW_BUY_ON_CREATE_TIME", System.currentTimeMillis());
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        v9r.g();
        v9r.a("onCreate orientation");
        a8r.a(this);
        v9r.g();
        v9r.a("onCreate onCreateView");
        this.b.m(this);
        this.b.h(this, findViewById(16908290));
        x9r.c(this);
        v9r.g();
        v9r.a("onCreate broadcastReceiver");
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = new TBBuyBroadcastReceiver(this, I2());
        this.c = tBBuyBroadcastReceiver;
        tBBuyBroadcastReceiver.c("purchase").a();
        v9r.g();
        v9r.a("onCreate i18");
        boolean o = Localization.o();
        rbb g = ck.g();
        g.d("Localization.isI18nEdition() = " + o);
        if (o) {
            lbj.a((TextView) findViewById(R.id.title), (ImageView) findViewById(R.id.btn_back));
            lbj.b(this);
            ck.g().d("当前环境进入多语言，执行下单页Title改动和黑名单操作");
        }
        v9r.g();
        v9r.g();
    }
}
