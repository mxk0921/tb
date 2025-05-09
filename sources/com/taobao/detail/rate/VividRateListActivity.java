package com.taobao.detail.rate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import tb.acq;
import tb.dx1;
import tb.egn;
import tb.hdv;
import tb.n0u;
import tb.n9l;
import tb.qrf;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VividRateListActivity extends CustomBaseActivity implements RateFeedsFragment.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10340a;
    public String b;
    public RateInfo c;
    public boolean d;
    public JSONObject e;

    public VividRateListActivity() {
        ApplicationInvoker.getInstance("com.taobao.detail.rate").invoke("com.taobao.detail.rate.RateDisplayApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(VividRateListActivity vividRateListActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/detail/rate/VividRateListActivity");
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

    public final boolean l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4215e069", new Object[]{this})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(getIntent().getSerializableExtra("exParams")));
        if (parseObject != null) {
            return qrf.b(parseObject, "enableDataModelOpt", false);
        }
        return false;
    }

    public final RateInfo n3(Intent intent) {
        String str;
        String str2;
        ArrayList arrayList;
        String str3 = "::";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateInfo) ipChange.ipc$dispatch("9b65ad68", new Object[]{this, intent});
        }
        RateInfo.a aVar = new RateInfo.a();
        String stringExtra = intent.getStringExtra("itemId");
        String stringExtra2 = intent.getStringExtra("invokeSource");
        String stringExtra3 = intent.getStringExtra("feedId");
        String str4 = "rateTitle";
        String stringExtra4 = intent.getStringExtra(str4);
        String stringExtra5 = intent.getStringExtra("foldFlag");
        String stringExtra6 = intent.getStringExtra(DXTraceUtil.TYPE_EXPRESSION_STRING);
        String stringExtra7 = intent.getStringExtra("sellId");
        String stringExtra8 = intent.getStringExtra("shopId");
        String stringExtra9 = intent.getStringExtra("skuVids");
        String stringExtra10 = intent.getStringExtra("selectTag");
        Uri data = intent.getData();
        if (data != null) {
            Set<String> n = zhn.n(data);
            if (!n.isEmpty()) {
                for (String str5 : n) {
                    if (TextUtils.isEmpty(str5)) {
                        str4 = str4;
                    } else if (TextUtils.isEmpty(stringExtra) && str5.equalsIgnoreCase("itemId")) {
                        str4 = str4;
                        stringExtra = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra2) && str5.equalsIgnoreCase("invokeSource")) {
                        str4 = str4;
                        stringExtra2 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra3) && str5.equalsIgnoreCase("feedId")) {
                        str4 = str4;
                        stringExtra3 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra4) && str4.equals(str5)) {
                        str4 = str4;
                        stringExtra4 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra5) && "foldFlag".equals(str5)) {
                        str4 = str4;
                        stringExtra5 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra6) && str5.equalsIgnoreCase(DXTraceUtil.TYPE_EXPRESSION_STRING)) {
                        str4 = str4;
                        stringExtra6 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra7) && str5.equalsIgnoreCase("sellId")) {
                        str4 = str4;
                        stringExtra7 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra8) && str5.equalsIgnoreCase("shopId")) {
                        str4 = str4;
                        stringExtra8 = data.getQueryParameter(str5);
                    } else if (TextUtils.isEmpty(stringExtra9) && str5.equalsIgnoreCase("skuVids")) {
                        str4 = str4;
                        stringExtra9 = data.getQueryParameter(str5);
                    } else if (!TextUtils.isEmpty(stringExtra10) || !str5.equalsIgnoreCase("selectTag")) {
                        str4 = str4;
                        if ("pageName".equals(str5)) {
                            String queryParameter = data.getQueryParameter(str5);
                            this.f10340a = queryParameter;
                            if (!TextUtils.isEmpty(queryParameter)) {
                                setUTPageName(this.f10340a);
                            }
                        }
                    } else {
                        str4 = str4;
                        stringExtra10 = data.getQueryParameter(str5);
                    }
                    str3 = str3;
                }
            }
        }
        this.b = stringExtra4;
        aVar.L(stringExtra);
        if (zhn.G(stringExtra2, -1) != -1) {
            aVar.K(zhn.G(stringExtra2, -1));
        }
        if (zhn.H(stringExtra3, -1L) != -1) {
            aVar.H(zhn.H(stringExtra3, -1L));
        }
        if (zhn.G(stringExtra5, 0) == 1) {
            aVar.I(zhn.G(stringExtra5, 0));
        }
        aVar.G(stringExtra6);
        aVar.W(stringExtra7);
        aVar.Y(stringExtra8);
        aVar.a0(stringExtra9);
        aVar.V(stringExtra10);
        try {
            aVar.T(JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("rateExtParams"))));
            str2 = "askInfo";
            str = str3;
        } catch (Throwable th) {
            UMLinkLogInterface a2 = hdv.a();
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            str = str3;
            sb.append(str);
            sb.append(intent.getSerializableExtra("rateExtParams"));
            a2.commitFailure("rateList", "setQuestionData", "1.0", "rateList", "", null, "setQuestionData", sb.toString());
            str2 = "askInfo";
        }
        try {
            aVar.P(JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra(str2))));
        } catch (Throwable th2) {
            UMLinkLogInterface a3 = hdv.a();
            a3.commitFailure("rateList", "setQuestionData", "1.0", "rateList", "", null, "setQuestionData", th2.toString() + str + intent.getSerializableExtra(str2));
        }
        try {
            aVar.F(JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("exParams"))));
        } catch (Throwable th3) {
            UMLinkLogInterface a4 = hdv.a();
            a4.commitFailure("rateList", "exParams", "1.0", "rateList", "", null, "exParams", th3.toString() + str + intent.getSerializableExtra("exParams"));
        }
        try {
            aVar.M(JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("itemInfo"))));
        } catch (Throwable th4) {
            UMLinkLogInterface a5 = hdv.a();
            a5.commitFailure("rateList", "itemInfo", "1.0", "rateList", "", null, "itemInfo", th4.toString() + str + intent.getSerializableExtra("itemInfo"));
        }
        try {
            aVar.Z(JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("skuInfo"))));
        } catch (Throwable th5) {
            UMLinkLogInterface a6 = hdv.a();
            a6.commitFailure("rateList", "setSkuInfo", "1.0", "rateList", "", null, "setSkuInfo", th5.toString() + str + intent.getSerializableExtra("skuInfo"));
        }
        try {
            Serializable serializableExtra = intent.getSerializableExtra("rateKeywordList");
            if (!(serializableExtra == null || (arrayList = (ArrayList) JSON.parseArray(JSON.toJSONString(serializableExtra), RateKeyword.class)) == null)) {
                aVar.U(arrayList);
            }
        } catch (Throwable th6) {
            hdv.a().commitFailure("rateList", "setRateKeywords", "1.0", "rateList", "", null, "setRateKeywords", th6.toString());
        }
        if (!TextUtils.isEmpty(aVar.B())) {
            return aVar.z();
        }
        return null;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (!n9l.INSTANCE.a() || !l3()) {
            z = false;
        }
        this.d = z;
        if (z) {
            this.e = m3(getIntent());
        } else {
            RateInfo n3 = n3(getIntent());
            this.c = n3;
            if (n3 == null) {
                n0u.d(dx1.b(R.string.rate_data_read_fail_retry));
                finish();
                return;
            }
        }
        if (TextUtils.isEmpty(this.b)) {
            setTitle(dx1.b(R.string.rate_rate));
        } else {
            setTitle(this.b);
        }
        setContentView(R.layout.rate_list_layout);
        egn egnVar = new egn();
        if (this.d) {
            egnVar.h(this.e);
        } else {
            egnVar.i(this.c);
        }
        egnVar.g(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.add(R.id.rate_list_container, egnVar.a(), RateFeedsFragment.TAG);
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        try {
            supportFragmentManager.executePendingTransactions();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        n0u.a();
        super.onDestroy();
    }

    @Override // com.taobao.detail.rate.RateFeedsFragment.b
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // com.taobao.detail.rate.RateFeedsFragment.b
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        }
    }

    public final JSONObject m3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c717cdb0", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        this.b = intent.getStringExtra("rateTitle");
        String stringExtra = intent.getStringExtra("itemId");
        String stringExtra2 = intent.getStringExtra("invokeSource");
        String stringExtra3 = intent.getStringExtra("foldFlag");
        String stringExtra4 = intent.getStringExtra("sellId");
        String stringExtra5 = intent.getStringExtra("shopId");
        int intExtra = intent.getIntExtra("commentCount", 0);
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("itemInfo")));
        JSONObject parseObject2 = JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("keyword")));
        JSONObject parseObject3 = JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("detailRate")));
        JSONArray parseArray = JSON.parseArray(JSON.toJSONString(intent.getSerializableExtra("rateKeywordList")));
        JSONObject parseObject4 = JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("askInfo")));
        JSONObject parseObject5 = JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("skuInfo")));
        JSONObject parseObject6 = JSON.parseObject(JSON.toJSONString(intent.getSerializableExtra("exParams")));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) stringExtra);
        jSONObject.put("invokeSource", (Object) stringExtra2);
        jSONObject.put("foldFlag", (Object) stringExtra3);
        jSONObject.put("sellId", (Object) stringExtra4);
        jSONObject.put("shopId", (Object) stringExtra5);
        jSONObject.put("commentCount", (Object) Integer.valueOf(intExtra));
        jSONObject.put("itemInfo", (Object) parseObject);
        jSONObject.put("keyword", (Object) parseObject2);
        jSONObject.put("detailRate", (Object) parseObject3);
        jSONObject.put("rateKeywordList", (Object) parseArray);
        jSONObject.put("askInfo", (Object) parseObject4);
        jSONObject.put("skuInfo", (Object) parseObject5);
        jSONObject.put("exParams", (Object) parseObject6);
        return jSONObject;
    }
}
