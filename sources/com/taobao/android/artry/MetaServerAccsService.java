package com.taobao.android.artry;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONException;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.android.nav.Nav;
import com.taobao.aranger.exception.IPCException;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dxv;
import tb.t2o;
import tb.upx;
import tb.w4f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaServerAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6353a = false;
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static String c = "";
    public static String d = "http://d.m.taobao.com/goAlipay.htm?simplepay=1&signStr=";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6354a;

        public a(String str) {
            this.f6354a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = w4f.c;
            if (context != null) {
                try {
                    Toast.makeText(context, this.f6354a, 0).show();
                } catch (Throwable th) {
                    Log.e("MetaServerAccsService", "run: e " + th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (dxv.f() != 0) {
                MetaServerAccsService.c("http://d.wapa.taobao.com/goAlipay.htm?simplepay=1&signStr=");
            }
            MetaServerAccsService.d();
            MetaServerAccsService.e(MetaServerAccsService.d());
        }
    }

    static {
        t2o.a(396361733);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e926a803", new Object[]{str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("payType");
            if ("avpAgreementPay".equals(string)) {
                String encode = URLEncoder.encode(jSONObject.getString("signStr"), "UTF-8");
                j(d + encode);
            } else if ("orderPay".equals(string)) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("orderPayInfo"));
                k(w4f.c, jSONObject2.getString("orderId"), jSONObject2.getString("code"), jSONObject2.getString("appName"), jSONObject2.getString("isNeedWua"));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9787332c", new Object[0]);
        } else if (!TextUtils.isEmpty(c)) {
            b.post(new b());
        }
    }

    public static /* synthetic */ String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        d = str;
        return str;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415b7b83", new Object[]{str});
        } else {
            a(str);
        }
    }

    public static /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bc884", new Object[]{str});
        } else {
            l(str);
        }
    }

    public static /* synthetic */ String g(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1263b93", new Object[]{str, str2, str3, str4, str5});
        }
        return i(str, str2, str3, str4, str5);
    }

    public static /* synthetic */ void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdec6286", new Object[]{str});
        } else {
            j(str);
        }
    }

    public static String i(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b038027", new Object[]{str, str2, str3, str4, str5});
        }
        StringBuilder sb = new StringBuilder("http://d.m.taobao.com/goAlipay.htm?");
        try {
            sb.append("backURL=");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("&simplepay=");
            sb.append(str5);
            sb.append("&singleTop=true");
            sb.append("&orderids=");
            sb.append(str2);
            sb.append("&signStr=");
            sb.append(URLEncoder.encode(str3, "UTF-8"));
            sb.append("&alipayURL=");
            sb.append(URLEncoder.encode(str4, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            new StringBuilder("generateOrderPayURL: e ").append(e);
        }
        new StringBuilder("generateOrderPayURL: val is ").append(sb.toString());
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(MetaServerAccsService metaServerAccsService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/MetaServerAccsService");
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f9efe0", new Object[]{str});
            return;
        }
        Context context = w4f.c;
        if (context != null) {
            try {
                Nav.from(context).toUri(str);
            } catch (Throwable th) {
                TLog.loge("MetaServerAccsService", "navToDestUrl", th);
            }
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4c6eb7", new Object[]{str});
        } else {
            b.post(new a(str));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            return;
        }
        StringBuilder sb = new StringBuilder("onBind: s ");
        sb.append(str);
        sb.append(" i ");
        sb.append(i);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        int f = dxv.f();
        new StringBuilder("onData: string val is ").append(f);
        if (f != 0) {
            d = "http://d.wapa.taobao.com/goAlipay.htm?simplepay=1&signStr=";
        }
        String str4 = new String(bArr);
        "onData: received val is ".concat(str4);
        if (!f6353a) {
            c = str4;
        } else {
            a(str4);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            return;
        }
        StringBuilder sb = new StringBuilder("onResponse: s ");
        sb.append(str);
        sb.append(" s1 ");
        sb.append(str2);
        sb.append(" i ");
        sb.append(i);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            return;
        }
        StringBuilder sb = new StringBuilder("onUnbind: s ");
        sb.append(str);
        sb.append(" i ");
        sb.append(i);
    }

    public static void k(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3994be6f", new Object[]{context, str, str2, str3, str4});
        } else if (w4f.c != null) {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.order.dopay");
            mtopRequest.setVersion("4.0");
            mtopRequest.setNeedEcode(true);
            mtopRequest.setNeedSession(true);
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            try {
                jSONObject.put("appName", (Object) str3);
                jSONObject.put("code", (Object) str2);
                String str5 = APSecuritySdk.getInstance(w4f.c).getTokenResult().apdidToken;
                jSONObject.put(upx.APDIDTOKEN, (Object) str5);
                jSONObject.put("orderId", (Object) str);
                String locale = w4f.c.getResources().getConfiguration().locale.toString();
                jSONObject.put("websiteLanguage", (Object) locale);
                StringBuilder sb = new StringBuilder("onData:  apdidToken ");
                sb.append(str5);
                sb.append(" websiteLanguage ");
                sb.append(locale);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mtopRequest.setData(jSONObject.toString());
            MtopBusiness reqMethod = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), mtopRequest).reqMethod(MethodEnum.POST);
            if ("true".equals(str4)) {
                reqMethod.useWua();
            }
            reqMethod.setConnectionTimeoutMilliSecond(3000);
            reqMethod.setSocketTimeoutMilliSecond(5000);
            reqMethod.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.artry.MetaServerAccsService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    String str6;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    MetaServerAccsService.f("网络请求异常，请稍后重试");
                    StringBuilder sb2 = new StringBuilder("onError: i ");
                    sb2.append(i);
                    if (mtopResponse != null) {
                        str6 = mtopResponse.toString();
                    } else {
                        str6 = "";
                    }
                    sb2.append(str6);
                    sb2.append(" o ");
                    sb2.append(obj);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    String str6;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    MetaServerAccsService.f("网络请求异常，请稍后重试");
                    StringBuilder sb2 = new StringBuilder("onSystemError: ");
                    sb2.append(i);
                    sb2.append(" mtopResponse val is  ");
                    if (mtopResponse != null) {
                        str6 = mtopResponse.toString();
                    } else {
                        str6 = "";
                    }
                    sb2.append(str6);
                    sb2.append(" o ");
                    sb2.append(obj);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || mtopResponse.getDataJsonObject() == null) {
                        MetaServerAccsService.f("网络请求异常，请稍后重试");
                        Log.e("MetaServerAccsService", "onSuccess: params error");
                    } else {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        try {
                            Objects.toString(dataJsonObject);
                            String string = dataJsonObject.getString("backUrl");
                            if ("false".equals(dataJsonObject.getString("canPay"))) {
                                MetaServerAccsService.f("订单状态异常，请稍后重试");
                                return;
                            }
                            JSONArray jSONArray = dataJsonObject.getJSONArray("orderIds");
                            if (jSONArray.length() > 0) {
                                MetaServerAccsService.h(MetaServerAccsService.g(string, jSONArray.getString(0), dataJsonObject.getString("signStr"), dataJsonObject.getString("alipayUrl"), dataJsonObject.getString("simplePay")));
                            }
                        } catch (org.json.JSONException e2) {
                            Log.e("MetaServerAccsService", "JSONException e is : " + e2);
                        }
                    }
                }
            });
            reqMethod.startRequest();
        }
    }
}
