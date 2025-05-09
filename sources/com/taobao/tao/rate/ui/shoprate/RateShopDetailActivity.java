package com.taobao.tao.rate.ui.shoprate;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import tb.acq;
import tb.cin;
import tb.d1v;
import tb.dx1;
import tb.t2o;
import tb.zcu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RateShopDetailActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(867172362);
    }

    public RateShopDetailActivity() {
        ApplicationInvoker.getInstance("com.taobao.trade.rate").invoke("com.taobao.tao.rate.RateApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(RateShopDetailActivity rateShopDetailActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/rate/ui/shoprate/RateShopDetailActivity");
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        d1v.a(getClass().getName());
        if (getIntent() == null || getIntent().getData() == null || TextUtils.isEmpty(getIntent().getData().getQueryParameter("rateId"))) {
            cin.a(this, dx1.b(R.string.rate_request_parameters_error));
        } else {
            Nav from = Nav.from(this);
            from.toUri(zcu.RATE_DETAIL_V2_PAGE_URL + getIntent().getData().getQueryParameter("rateId"));
        }
        finish();
    }
}
