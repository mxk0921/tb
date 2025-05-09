package com.taobao.android.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.a8r;
import tb.aar;
import tb.acq;
import tb.bbb;
import tb.ck;
import tb.cqv;
import tb.f8r;
import tb.h8r;
import tb.j8r;
import tb.jud;
import tb.lud;
import tb.mud;
import tb.o9r;
import tb.t2o;
import tb.x9r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBPurchaseActivity extends AppCompatActivity implements mud, jud, lud, bbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public j8r f9219a;
    public TBBuyBroadcastReceiver b;

    static {
        t2o.a(708837427);
        t2o.a(708837431);
        t2o.a(708837428);
        t2o.a(708837430);
        t2o.a(81788949);
    }

    public static /* synthetic */ Object ipc$super(TBPurchaseActivity tBPurchaseActivity, String str, Object... objArr) {
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
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/TBPurchaseActivity");
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
        return l3().b();
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else {
            l3().l(this, z);
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
        } else {
            super.finish();
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else {
            l3().a(this, jSONObject);
        }
    }

    @Override // tb.lud
    public String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return l3().c(this);
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
            return (j8r) ipChange.ipc$dispatch("f871c1f2", new Object[]{this});
        }
        j8r j8rVar = this.f9219a;
        if (j8rVar != null) {
            return j8rVar;
        }
        j8r j8rVar2 = new j8r(o9r.c(), R.layout.activity_purchase_v2, R.id.purchase_container, true);
        this.f9219a = j8rVar2;
        return j8rVar2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        l3().e(this, i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            l3().f(this);
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
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = this.b;
        if (tBBuyBroadcastReceiver != null) {
            tBBuyBroadcastReceiver.d();
        }
        l3().i(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        l3().j(this);
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
        l3().k(this);
        aar.a(aar.f15632a);
        cqv.l("Page_ConfirmOrder", null, this, new String[0]);
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            l3().d(str, jSONObject);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ck.g().e("onCreate");
        h8r.a(this);
        j8r l3 = l3();
        l3.g(this, null);
        super.onCreate(bundle);
        AliBuyPerfSwitcher.updatePerfSwitch("enableAnimPerf", true);
        getIntent().putExtra("NEW_BUY_ON_CREATE_TIME", System.currentTimeMillis());
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        a8r.a(this);
        l3.m(this);
        l3.h(this, findViewById(16908290));
        x9r.c(this);
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = new TBBuyBroadcastReceiver(this, I2());
        this.b = tBBuyBroadcastReceiver;
        tBBuyBroadcastReceiver.a();
    }
}
