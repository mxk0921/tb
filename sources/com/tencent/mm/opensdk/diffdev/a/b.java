package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    private String f14194a;
    private String b;
    private String c;
    private String d;
    private String e;
    private OAuthListener f;
    private c g;

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f14194a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.g;
        if (cVar == null) {
            return cancel(true);
        }
        return cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=" + this.f14194a + "&noncestr=" + this.c + "&timestamp=" + this.d + "&scope=" + this.b + "&signature=" + this.e;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a2 = com.tencent.mm.opensdk.channel.a.a.a(str, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        return a.a(a2);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f14195a;
        if (oAuthErrCode == OAuthErrCode.WechatAuth_Err_OK) {
            Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.e.length);
            this.f.onAuthGotQrcode(aVar2.d, aVar2.e);
            c cVar = new c(aVar2.b, this.f);
            this.g = cVar;
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        Log.e("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode fail, OAuthErrCode = " + oAuthErrCode);
        this.f.onAuthFinish(aVar2.f14195a, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public OAuthErrCode f14195a;
        public String b;
        public String c;
        public String d;
        public byte[] e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                } catch (Exception e) {
                    message = e.getMessage();
                    sb = new StringBuilder("parse fail, build String fail, ex = ");
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                    int i = jSONObject.getInt(AmnetMonitorLoggerListener.LogModel.ERR_CODE);
                    if (i != 0) {
                        Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                        aVar.f14195a = OAuthErrCode.WechatAuth_Err_NormalErr;
                        jSONObject.optString("errmsg");
                        return aVar;
                    }
                    String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                    if (!(string == null || string.length() == 0)) {
                        byte[] decode = Base64.decode(string, 0);
                        if (!(decode == null || decode.length == 0)) {
                            aVar.f14195a = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.e = decode;
                            aVar.b = jSONObject.getString("uuid");
                            String string2 = jSONObject.getString("appname");
                            aVar.c = string2;
                            Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.b, string2, Integer.valueOf(aVar.e.length)));
                            return aVar;
                        }
                        Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        aVar.f14195a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    }
                    Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                    aVar.f14195a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                    return aVar;
                } catch (Exception e2) {
                    message = e2.getMessage();
                    sb = new StringBuilder("parse json fail, ex = ");
                    sb.append(message);
                    Log.e("MicroMsg.SDK.GetQRCodeResult", sb.toString());
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f14195a = oAuthErrCode;
                    return aVar;
                }
            }
            aVar.f14195a = oAuthErrCode;
            return aVar;
        }
    }
}
