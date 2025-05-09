package com.taobao.android.shop.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.shop.common.ShopUrlFilter;
import com.ut.mini.UTAnalytics;
import tb.acq;
import tb.ppp;
import tb.t2o;
import tb.wnp;
import tb.z22;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopUrlRouterActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764411946);
    }

    public static /* synthetic */ Object ipc$super(ShopUrlRouterActivity shopUrlRouterActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/shop/activity/ShopUrlRouterActivity");
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

    public final void l3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd6a0ad", new Object[]{this, uri});
        } else {
            ppp.a(z22.a(z22.a("ruleInit", "true", "="), z22.a("url", uri.toString(), "="), ","));
        }
    }

    public final boolean m3(Intent intent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f23bc9f", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        int flags = intent.getFlags();
        if ((flags & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if ((flags & 1) != 1 && !z) {
            return false;
        }
        return true;
    }

    public final void n3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecef8b43", new Object[]{this, uri});
        } else if (uri != null) {
            try {
                if ("client_direct".equals(getIntent().getStringExtra("share_trace_method"))) {
                    TBS.Ext.commitEvent(5004, uri.toString());
                }
                if (!new ShopUrlFilter().b(uri.toString(), this)) {
                    TLog.loge("ShopUrlRouterActivity", "degrade to browser to open the shop url " + uri.toString() + ",rule init? true");
                    l3(uri);
                    Nav.from(this).withCategory("com.taobao.intent.category.HYBRID_UI").toUri(uri);
                }
            } catch (Exception e) {
                TLog.loge("ShopUrlRouterActivity", "process uri exception: ", e);
            }
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        wnp.b();
        super.onCreate(bundle);
        System.currentTimeMillis();
        Intent intent = getIntent();
        if (intent != null) {
            n3(intent.getData());
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        NotifyApm.b().c(this);
        disableFinishAnimationOnce();
        if (intent != null && !m3(intent)) {
            intent.putExtra("skipPvFromRouterAc", "true");
            setResult(2001, intent);
            Log.e("ShopUrlRouterActivity", "skipPvFromRouterAc-true");
        }
        Log.e("ShopUrlRouterActivity", "finish");
        finish();
    }
}
