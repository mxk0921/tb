package com.taobao.tao.rate.ui.commit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.acq;
import tb.cin;
import tb.iuu;
import tb.jzn;
import tb.kj9;
import tb.knv;
import tb.lff;
import tb.rbl;
import tb.ryv;
import tb.t2o;
import tb.wtv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AppendRateActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f12636a;
    public String b;
    public String c;
    public long d;
    public kj9 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements jzn.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.jzn.b
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            String a2 = rbl.a();
            if (!TextUtils.isEmpty(a2)) {
                Nav.from(AppendRateActivity.this).toUri(knv.d(a2, ryv.x(AppendRateActivity.this.getIntent().getData())));
                AppendRateActivity.this.finish();
                return;
            }
            cin.a(AppendRateActivity.this.getApplicationContext(), AppendRateActivity.this.getResources().getString(R.string.rate_invalid_request));
            AppendRateActivity.this.finish();
        }

        @Override // tb.jzn.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            AppendRateActivity.l3(AppendRateActivity.this);
            AppendRateActivity.this.finish();
        }
    }

    static {
        t2o.a(758120534);
    }

    public AppendRateActivity() {
        ApplicationInvoker.getInstance("com.taobao.trade.rate").invoke("com.taobao.tao.rate.RateApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(AppendRateActivity appendRateActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/rate/ui/commit/AppendRateActivity");
        }
    }

    public static /* synthetic */ void l3(AppendRateActivity appendRateActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed67cb1", new Object[]{appendRateActivity});
        } else {
            appendRateActivity.m3();
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

    public final void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8626fda0", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "mtop.taobao.rate.append.render");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("orderId", (Object) this.f12636a);
        jSONObject2.put("pageType", (Object) "publishAppendRate");
        jSONObject2.put(CoreConstants.IN_PARAM_ARCHIVE, (Object) Boolean.valueOf("1".equals(this.b)));
        jSONObject2.put("platformType", (Object) "wireless");
        if (!TextUtils.isEmpty(this.c)) {
            jSONObject2.put("channel", (Object) this.c);
        }
        jSONObject.put("params", (Object) jSONObject2.toJSONString());
        jSONObject.put("version", (Object) "2.0");
        String concat = "http://h5.m.taobao.com/ocean/publish.htm?page=Page_AppendRate&api=".concat(Uri.encode(jSONObject.toJSONString())).concat("&notify=").concat("taobao.rate.newAppend").concat("&clickStartTime=").concat(String.valueOf(this.d)).concat("&firstFrameTrackerId=").concat(this.e.i());
        Nav.setTransition(17432576, 17432577);
        Nav.from(this).forResult(10001).toUri(concat);
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
        super.onCreate(bundle);
        this.d = lff.a(getIntent());
        kj9 h = kj9.h();
        this.e = h;
        h.d(this.d);
        setContentView(R.layout.rate_activity_commit);
        iuu.a();
        if (!n3(getIntent())) {
            cin.a(this, getResources().getString(R.string.rate_invalid_request));
            finish();
            return;
        }
        jzn.h(new a());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        kj9 kj9Var = this.e;
        if (kj9Var != null) {
            kj9.k(kj9Var.i());
        }
    }

    public boolean n3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("554f48e1", new Object[]{this, intent})).booleanValue();
        }
        this.f12636a = lff.c(intent, "parentBizOrderId", null);
        this.c = lff.c(intent, "channel", null);
        this.b = lff.c(intent, "isArchive", null);
        if (!TextUtils.isEmpty(this.f12636a)) {
            return !TextUtils.isEmpty(this.f12636a);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMessages", "order id is empty");
        wtv.c("Page_AppendRate", "Report-Error", hashMap);
        return false;
    }
}
