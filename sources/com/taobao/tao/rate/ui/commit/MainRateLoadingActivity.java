package com.taobao.tao.rate.ui.commit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.taobao.ugc.fragment.request.GetOrderRateInfoResponse;
import com.taobao.ugc.fragment.request.OrderRateInfoData;
import com.taobao.ugc.fragment.request.OrderRequest;
import com.taobao.uikit.extend.component.TBCircularProgress;
import com.ut.share.utils.Constants;
import java.util.Arrays;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.acq;
import tb.cin;
import tb.dx1;
import tb.iuu;
import tb.jzn;
import tb.kj9;
import tb.knv;
import tb.krq;
import tb.lff;
import tb.nhn;
import tb.nj7;
import tb.rbl;
import tb.ryv;
import tb.t2o;
import tb.wtv;
import tb.xel;
import tb.xov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MainRateLoadingActivity extends FragmentActivity implements xel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLICK_START_TIME = "clickStartTime";
    public static final String SUFFIX_FLOAT_PAGE = "/ocean/publish_float.htm";

    /* renamed from: a  reason: collision with root package name */
    public TBCircularProgress f12638a;
    public wtv b;
    public kj9 c;
    public String d;
    public String e;
    public JSONObject f;
    public long g;

    static {
        t2o.a(758120536);
        t2o.a(758120557);
    }

    public MainRateLoadingActivity() {
        ApplicationInvoker.getInstance("com.taobao.trade.rate").invoke("com.taobao.tao.rate.RateApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(MainRateLoadingActivity mainRateLoadingActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/rate/ui/commit/MainRateLoadingActivity");
        }
    }

    public static /* synthetic */ Uri l3(MainRateLoadingActivity mainRateLoadingActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("fe36305", new Object[]{mainRateLoadingActivity, str});
        }
        return mainRateLoadingActivity.n3(str);
    }

    public static /* synthetic */ void m3(MainRateLoadingActivity mainRateLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4441f4a3", new Object[]{mainRateLoadingActivity});
        } else {
            mainRateLoadingActivity.o3();
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
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    public final Uri n3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("307a60ea", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (!TextUtils.isEmpty(this.e)) {
            buildUpon.appendQueryParameter("channel", this.e);
        }
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            buildUpon.appendQueryParameter("extraParams", jSONObject.toJSONString());
        }
        buildUpon.appendQueryParameter(KEY_CLICK_START_TIME, String.valueOf(this.g));
        kj9 kj9Var = this.c;
        if (kj9Var != null) {
            buildUpon.appendQueryParameter("firstFrameTrackerId", kj9Var.i());
        }
        if (ryv.r(getApplicationContext())) {
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
        }
        if (xov.a(parse, "floatMode", false)) {
            buildUpon.path(SUFFIX_FLOAT_PAGE);
        }
        return buildUpon.build();
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea8684d", new Object[]{this});
            return;
        }
        String a2 = rbl.a();
        if (!TextUtils.isEmpty(a2)) {
            Nav.from(this).toUri(knv.d(a2, ryv.x(getIntent().getData())));
        } else {
            cin.a(getApplicationContext(), getResources().getString(R.string.rate_invalid_request));
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i != -1) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.g = lff.a(getIntent());
        kj9 h = kj9.h();
        this.c = h;
        h.d(this.g);
        setContentView(R.layout.rate_ugc_activity_loading);
        iuu.a();
        TBCircularProgress tBCircularProgress = (TBCircularProgress) findViewById(R.id.rate_progress);
        this.f12638a = tBCircularProgress;
        tBCircularProgress.setVisibility(0);
        this.b = new wtv();
        if (!s3(getIntent())) {
            cin.a(this, getResources().getString(R.string.rate_invalid_request));
            finish();
            return;
        }
        new OrderRequest().a(this.d, this.e, this.f, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.b = null;
        kj9 kj9Var = this.c;
        if (kj9Var != null) {
            kj9.k(kj9Var.i());
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
        this.b.b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.b.a(this, "Page_MainRateLoading");
        if (this.f12638a.getVisibility() != 0) {
            this.f12638a.setVisibility(0);
        }
    }

    public final void p3(String str, OrderRateInfoData orderRateInfoData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181efb63", new Object[]{this, str, orderRateInfoData});
        } else {
            jzn.h(new a(orderRateInfoData, str));
        }
    }

    public void q3(MtopResponse mtopResponse, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12f6dc9", new Object[]{this, mtopResponse, str, str2});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            cin.a(getApplicationContext(), str2);
        } else {
            cin.a(getApplicationContext(), dx1.b(R.string.rate_data_retrieval_failed_retry));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMessages", str2);
        hashMap.put("orderId", this.d);
        wtv.c("Page_MainRateLoading", "Report-Error", hashMap);
        wtv.c("Page_Rate", "Entry-Report-Error", hashMap);
        finish();
    }

    public void r3(GetOrderRateInfoResponse getOrderRateInfoResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cafa45", new Object[]{this, getOrderRateInfoResponse});
        } else if (getOrderRateInfoResponse == null || getOrderRateInfoResponse.getData() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMessages", "response or data = null");
            wtv.c("Page_MainRateLoading", "Report-Error", hashMap);
            wtv.c("Page_Rate", "Entry-Report-Error", hashMap);
            finish();
        } else {
            OrderRateInfoData data = getOrderRateInfoResponse.getData();
            String redirectUrl = data.getRedirectUrl();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Constants.WEIBO_REDIRECTURL_KEY, !TextUtils.isEmpty(redirectUrl) ? redirectUrl : "");
            wtv.c("Page_Rate", "Entry-Redirect-Request", hashMap2);
            this.c.c("process_rate_publish_order_request");
            if (!TextUtils.isEmpty(redirectUrl)) {
                this.f12638a.setVisibility(8);
                p3(redirectUrl, data);
                return;
            }
            cin.a(this, getResources().getString(R.string.rate_invalid_request));
            finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements jzn.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OrderRateInfoData f12639a;
        public final /* synthetic */ String b;

        public a(OrderRateInfoData orderRateInfoData, String str) {
            this.f12639a = orderRateInfoData;
            this.b = str;
        }

        @Override // tb.jzn.b
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                MainRateLoadingActivity.m3(MainRateLoadingActivity.this);
            }
        }

        @Override // tb.jzn.b
        public void onSuccess() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            if (krq.b(this.f12639a.getDirectRender(), false) && nhn.a()) {
                z = true;
            }
            JSONObject ultronPageOutput = this.f12639a.getUltronPageOutput();
            Bundle bundle = new Bundle();
            if (z && ultronPageOutput != null) {
                bundle.putString(nhn.KEY_RAW_RENDER_DATA, ultronPageOutput.toJSONString());
            }
            Nav.setTransition(17432576, 17432577);
            Nav.from(MainRateLoadingActivity.this).forResult(10001).withExtras(bundle).toUri(MainRateLoadingActivity.l3(MainRateLoadingActivity.this, this.b));
            MainRateLoadingActivity.this.finish();
        }
    }

    public boolean s3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("554f48e1", new Object[]{this, intent})).booleanValue();
        }
        this.d = lff.d(intent, Arrays.asList(CoreConstants.IN_PARAM_ORDERID_1, "orderId"), null);
        this.e = lff.c(intent, "channel", null);
        this.f = lff.b(intent, "extraParams", null);
        if (TextUtils.isEmpty(this.d)) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMessages", "order id is empty");
            wtv.c("Page_MainRateLoading", "Report-Error", hashMap);
        }
        return !TextUtils.isEmpty(this.d);
    }
}
