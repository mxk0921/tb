package com.taobao.tao.sku.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.acq;
import tb.dfu;
import tb.eql;
import tb.iy3;
import tb.t2o;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MainSkuActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eql f12784a;
    public String b;
    public Map<String, String> c;
    public Map<String, String> d;
    public String e;
    public String f;
    public String g;

    static {
        t2o.a(694157318);
    }

    public static /* synthetic */ Object ipc$super(MainSkuActivity mainSkuActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sku/view/MainSkuActivity");
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

    public void l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d535775c", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("detailSKU");
        intent.putExtra("result", "cancel");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    public final void m3(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d39dbe", new Object[]{this, new Integer(i), intent});
            return;
        }
        setResult(i, intent);
        finish();
        if (i == 7) {
            l3();
        }
    }

    public final String n3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("755927e4", new Object[]{this, str});
        }
        if ("bottombar_style_confirm".equals(str)) {
            return "CONFIRM";
        }
        if (!"bottombar_style_confirm_addcart".equals(str)) {
            if ("bottombar_style_confirm_buy".equals(str) || "bottombar_style_buyonly".equals(str)) {
                return "BUYNOW";
            }
            if (!"bottombar_style_addcartonly".equals(str)) {
                return "ADDCART_AND_BUYNOW";
            }
        }
        return "ADDCART";
    }

    public final String o3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ab0386a", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (!"bottombar_style_confirm".equals(str)) {
            if ("bottombar_style_confirm_addcart".equals(str)) {
                jSONObject.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.tao.sku.view.MainSkuActivity.1
                    {
                        put("addCartText", "确认");
                    }
                });
            } else if ("bottombar_style_confirm_buy".equals(str)) {
                jSONObject.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.tao.sku.view.MainSkuActivity.2
                    {
                        put("buyNowText", "确认");
                    }
                });
            } else if (!"bottombar_style_buyonly".equals(str)) {
                "bottombar_style_addcartonly".equals(str);
            }
        }
        return "&extInput=" + jSONObject.toJSONString();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 10086) {
            StringBuilder sb = new StringBuilder("onActivityResult: resultCode/ ");
            sb.append(i);
            sb.append(" intent/ ");
            if (intent == null) {
                str = "null";
            } else {
                str = intent.toString();
            }
            sb.append(str);
            Log.e("MainSkuActivity", sb.toString());
            m3(i2, intent);
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
        iy3.a("com.taobao.tao.sku.view.MainSkuActivity");
        try {
            this.f12784a = eql.f(getIntent());
        } catch (Exception e) {
            Log.e("MainSkuActivity", "ParameterModel.newInstance(intent) failed.", e);
        }
        eql eqlVar = this.f12784a;
        if (eqlVar == null) {
            m3(9, null);
            return;
        }
        this.e = eqlVar.a();
        this.c = this.f12784a.c();
        HashMap<String, String> d = this.f12784a.d();
        this.d = d;
        if (d == null) {
            this.d = new HashMap();
        }
        this.f = this.f12784a.e();
        this.g = this.f12784a.c;
        Map<String, String> map = this.c;
        if (map != null) {
            String str = map.get("bottom_bar_style");
            this.b = str;
            if (TextUtils.isEmpty(str)) {
                this.b = "bottombar_style_buyaddcart";
            }
        }
        setTheme(R.style.XSkuOld_Dialog_Activity);
        setContentView(R.layout.taosku_activity_main_place_holder);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) this.e);
        p3(this.e, this.f, n3(this.b), jSONObject.toJSONString(), o3(this.b), this.c, dfu.c(this.d), dfu.b(dfu.a(this.d)), this.f12784a.e, this.g);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0) {
            finish();
        }
        return onTouchEvent;
    }

    public final boolean p3(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7, String str8, String str9) {
        String str10;
        String str11;
        String str12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4b0c85e", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7, str8, str9})).booleanValue();
        }
        if (!TextUtils.isEmpty(str9)) {
            String jSONString = new JSONObject(str9) { // from class: com.taobao.tao.sku.view.MainSkuActivity.3
                public final /* synthetic */ String val$bizName;

                {
                    this.val$bizName = str9;
                    put("bizName", (Object) str9);
                }
            }.toJSONString();
            str11 = "&skuUT=" + URLEncoder.encode(jSONString);
            str10 = "&skuInnerBizName=" + str9;
        } else {
            str10 = "";
            str11 = str10;
        }
        StringBuilder sb = new StringBuilder("https://sku.taobao.com/index.htm?itemId=");
        sb.append(str);
        sb.append("&skuId=");
        sb.append(str2);
        sb.append("&bottomMode=");
        sb.append(str3);
        sb.append("&ignore_toast=true&downgradeStr=");
        sb.append(URLEncoder.encode(str4));
        if (!TextUtils.isEmpty(str8)) {
            str12 = "&urlSolid=" + URLEncoder.encode(str8);
        } else {
            str12 = "";
        }
        sb.append(str12);
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        sb.append(str6);
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        }
        sb.append(str7);
        sb.append(str10);
        sb.append(str11);
        sb.append(str5);
        String sb2 = sb.toString();
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str13 : map.keySet()) {
                bundle.putString(str13, map.get(str13));
            }
        }
        xq0.c().a(this).d(bundle).b(10086).c(sb2);
        return true;
    }
}
