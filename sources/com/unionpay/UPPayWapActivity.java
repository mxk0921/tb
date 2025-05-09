package com.unionpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import org.json.JSONObject;
import tb.acq;
import tb.acy;
import tb.bay;
import tb.bby;
import tb.cay;
import tb.e6y;
import tb.e8y;
import tb.ecy;
import tb.f9y;
import tb.fby;
import tb.jdy;
import tb.lay;
import tb.mby;
import tb.ody;
import tb.q9y;
import tb.rby;
import tb.vcy;
import tb.xay;
import tb.xby;
import tb.ycy;
import tb.zux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UPPayWapActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public WebView f14527a;
    public WebViewJavascriptBridge b;
    public AlertDialog c;
    public boolean d = false;
    public String e = "";
    public String f;
    public View g;
    public zux h;

    public static /* synthetic */ void f(UPPayWapActivity uPPayWapActivity, boolean z) {
        int i;
        View view = uPPayWapActivity.g;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static String i(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String j(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ void l(UPPayWapActivity uPPayWapActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(uPPayWapActivity);
        uPPayWapActivity.c = builder.create();
        builder.setMessage(cay.a().f16953a);
        builder.setTitle(cay.a().d);
        builder.setPositiveButton(cay.a().b, new rby(uPPayWapActivity));
        builder.setNegativeButton(cay.a().c, new xby(uPPayWapActivity));
        builder.create().show();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public final void g(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String str2 = "";
                    if (extras.containsKey(MspGlobalDefine.SCHEME_PAY_RESULT)) {
                        str = extras.getString(MspGlobalDefine.SCHEME_PAY_RESULT);
                    } else {
                        str = extras.containsKey("code") ? extras.getString("code") : str2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = str2;
                    }
                    String string = extras.containsKey("data") ? extras.getString("data") : str2;
                    if (!TextUtils.isEmpty(string)) {
                        str2 = string;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", str);
                    jSONObject.put("data", str2);
                    zux zuxVar = this.h;
                    if (zuxVar != null) {
                        zuxVar.a(j("0", null, jSONObject));
                    }
                } else {
                    zux zuxVar2 = this.h;
                    if (zuxVar2 != null) {
                        zuxVar2.a(i("1", "No pay result", null));
                    }
                }
            } catch (Exception unused) {
                zux zuxVar3 = this.h;
                if (zuxVar3 != null) {
                    zuxVar3.a(i("1", "No pay result", null));
                }
            }
            this.h = null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(getIntent().getStringExtra("magic_data"))) {
                    finish();
                }
                this.d = "link".equals(getIntent().getStringExtra("actionType"));
                String stringExtra = getIntent().getStringExtra("ex_mode");
                this.e = stringExtra;
                if (TextUtils.isEmpty(stringExtra)) {
                    this.e = "00";
                }
                String str = "";
                getWindow().requestFeature(1);
                RelativeLayout relativeLayout = new RelativeLayout(this);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
                setContentView(relativeLayout);
                this.f14527a = new WebView(this);
                String stringExtra2 = getIntent().getStringExtra("actionType");
                this.f = stringExtra2;
                if ("link".equals(stringExtra2)) {
                    str = getIntent().getStringExtra("wapurl");
                } else {
                    String stringExtra3 = getIntent().getStringExtra("waptype");
                    String stringExtra4 = getIntent().getStringExtra("wapurl");
                    if ("new_page".equals(stringExtra3)) {
                        if (stringExtra4 != null) {
                            str = stringExtra4;
                        }
                        onClickListener = new f9y(this);
                    } else {
                        String stringExtra5 = getIntent().getStringExtra("paydata");
                        if (stringExtra5 != null) {
                            str = stringExtra4 + "?s=" + stringExtra5;
                        }
                        onClickListener = null;
                    }
                    ImageView imageView = new ImageView(this);
                    imageView.setBackgroundDrawable(e8y.a(2));
                    int a2 = e6y.a(this, 24.0f);
                    int a3 = e6y.a(this, 18.0f);
                    int a4 = e6y.a(this, 14.0f);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
                    layoutParams.addRule(9, -1);
                    layoutParams.addRule(10, -1);
                    layoutParams.setMargins(a3, a4, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    if (onClickListener == null) {
                        onClickListener = new mby(this);
                    }
                    imageView.setOnClickListener(onClickListener);
                    this.g = imageView;
                }
                this.f14527a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.f14527a);
                WebViewJavascriptBridge webViewJavascriptBridge = new WebViewJavascriptBridge(this, this.f14527a, null);
                this.b = webViewJavascriptBridge;
                webViewJavascriptBridge.setAllowScheme(true);
                WebView webView = this.f14527a;
                if (webView != null) {
                    webView.loadUrl(str);
                }
                WebViewJavascriptBridge webViewJavascriptBridge2 = this.b;
                if (webViewJavascriptBridge2 != null) {
                    webViewJavascriptBridge2.registerHandler(DeviceInfoJsBridge.ACTION, new acy(this));
                    this.b.registerHandler("saveData", new ecy(this));
                    this.b.registerHandler("getData", new vcy(this));
                    this.b.registerHandler("removeData", new ycy(this));
                    this.b.registerHandler("setPageBackEnable", new jdy(this));
                    this.b.registerHandler("payBySDK", new ody(this));
                    this.b.registerHandler("payResult", new q9y(this));
                    this.b.registerHandler("closePage", new bay(this));
                    this.b.registerHandler("openNewPage", new lay(this));
                    this.b.registerHandler("checkBankSchemes", new xay(this));
                    this.b.registerHandler("openBankApp", new bby(this));
                    this.b.registerHandler("openScheme", new fby(this));
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.d) {
            WebView webView = this.f14527a;
            if (webView == null || !webView.canGoBack()) {
                g("cancel", null);
            } else {
                this.f14527a.goBack();
                return true;
            }
        } else {
            onPause();
        }
        return true;
    }
}
