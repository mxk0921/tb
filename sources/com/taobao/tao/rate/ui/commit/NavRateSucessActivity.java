package com.taobao.tao.rate.ui.commit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.NavUrls;
import tb.acq;
import tb.d1v;
import tb.jql;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NavRateSucessActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(867172357);
    }

    public NavRateSucessActivity() {
        ApplicationInvoker.getInstance("com.taobao.trade.rate").invoke("com.taobao.tao.rate.RateApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(NavRateSucessActivity navRateSucessActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/rate/ui/commit/NavRateSucessActivity");
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        d1v.a(getClass().getName());
        Bundle bundle2 = new Bundle();
        bundle2.putString(jql.IN_PARAM_ORDER_LIST_TYPE, "WAIT_TO_EVALUATE");
        Nav.from(this).withExtras(bundle2).withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).toUri(NavUrls.NAV_URL_ORDER_LIST[0]);
        finish();
    }
}
