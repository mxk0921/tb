package com.taobao.android.waitpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.waitpay.notification.TBWaitBroadcastReceiver;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.a8r;
import tb.acq;
import tb.f8r;
import tb.h8r;
import tb.j8r;
import tb.jud;
import tb.l8r;
import tb.lud;
import tb.mud;
import tb.sy;
import tb.t2o;
import tb.wzr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWaitPayActivity extends AppCompatActivity implements mud, jud, lud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, sy> f9905a = new HashMap();
    public sy b;
    public wzr c;
    public TBWaitBroadcastReceiver d;

    static {
        t2o.a(725614597);
        t2o.a(708837431);
        t2o.a(708837428);
        t2o.a(708837430);
    }

    public static /* synthetic */ Object ipc$super(TBWaitPayActivity tBWaitPayActivity, String str, Object... objArr) {
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/TBWaitPayActivity");
        }
    }

    @Override // tb.mud
    public String I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
        }
        return m3().b();
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else {
            m3().l(this, z);
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

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else {
            m3().a(this, jSONObject);
        }
    }

    @Override // tb.lud
    public String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return m3().c(this);
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
        return new j8r(this.c, R.layout.waitpay_layout, R.id.tb_wait_pay_detail_container);
    }

    public final sy m3() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy) ipChange.ipc$dispatch("72b899d0", new Object[]{this});
        }
        sy syVar = this.b;
        if (syVar != null) {
            return syVar;
        }
        if (f8r.f(getIntent())) {
            str = TBBuyPageMode.halfPageMode;
        } else {
            str = TBBuyPageMode.fullPageMode;
        }
        sy syVar2 = (sy) ((HashMap) this.f9905a).get(str);
        if (syVar2 == null) {
            syVar2 = l3();
        }
        this.b = syVar2;
        return syVar2;
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dfe38b", new Object[]{this});
            return;
        }
        ((HashMap) this.f9905a).clear();
        ((HashMap) this.f9905a).put(TBBuyPageMode.halfPageMode, new l8r(this.c));
        ((HashMap) this.f9905a).put(TBBuyPageMode.fullPageMode, l3());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        m3().e(this, i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            m3().f(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        h8r.a(this);
        this.c = new wzr();
        n3();
        sy m3 = m3();
        m3.g(this, null);
        super.onCreate(bundle);
        a8r.a(this);
        m3.m(this);
        m3.h(this, findViewById(16908290));
        TBWaitBroadcastReceiver tBWaitBroadcastReceiver = new TBWaitBroadcastReceiver(this, I2());
        this.d = tBWaitBroadcastReceiver;
        tBWaitBroadcastReceiver.c("tbWaitPayDetail").a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBWaitBroadcastReceiver tBWaitBroadcastReceiver = this.d;
        if (tBWaitBroadcastReceiver != null) {
            tBWaitBroadcastReceiver.d();
        }
        m3().i(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        m3().j(this);
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        m3().k(this);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_WaitpayDetail");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, new HashMap<String, String>() { // from class: com.taobao.android.waitpay.TBWaitPayActivity.1
            {
                put("type", "waitPayDetail");
            }
        });
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            m3().d(str, jSONObject);
        }
    }
}
