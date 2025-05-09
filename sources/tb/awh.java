package tb;

import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.util.WeexAppMonitor$Avail$Point;
import com.taobao.android.weex.util.WeexAppMonitor$Performance$Point;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.amo;
import tb.gpc;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class awh implements gpc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "[Request]";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final bxh f16044a;
        public final dxh b;
        public final gpc.a c;
        public ByteArrayOutputStream d = new ByteArrayOutputStream();
        public final String e;
        public Map<String, List<String>> f;
        public final vuj g;

        static {
            t2o.a(982515714);
            t2o.a(607125966);
            t2o.a(607125968);
            t2o.a(607125969);
        }

        public a(bxh bxhVar, dxh dxhVar, gpc.a aVar, String str, vuj vujVar) {
            this.f16044a = bxhVar;
            this.b = dxhVar;
            this.c = aVar;
            this.e = str;
            this.g = vujVar;
        }

        public final void a(NetworkEvent.FinishEvent finishEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dee5e3", new Object[]{this, finishEvent});
                return;
            }
            this.b.f18133a = String.valueOf(finishEvent.getHttpCode());
            if (finishEvent.getHttpCode() == 200) {
                byte[] byteArray = this.d.toByteArray();
                if (dwh.r()) {
                    dwh.p(awh.TAG, "Http request finished succ, length: " + byteArray.length + ", url: " + this.e);
                }
                this.b.b = byteArray;
            } else if (finishEvent.getHttpCode() == 304) {
                if (dwh.r()) {
                    dwh.p(awh.TAG, "Http request finished 304, url: " + this.e);
                }
            } else if (finishEvent.getHttpCode() == 404) {
                dwh.f(awh.TAG, "Http request finished error code: 404, url: " + this.e);
                this.b.c = String.valueOf(finishEvent.getHttpCode());
                this.b.d = "404 NOT FOUND!";
            } else {
                dwh.f(awh.TAG, "Http request finished error code: " + finishEvent.getHttpCode() + ", url: " + this.e);
                this.b.c = String.valueOf(finishEvent.getHttpCode());
                dxh dxhVar = this.b;
                dxhVar.d = "net_err: " + finishEvent.getDesc() + "|code: " + finishEvent.getHttpCode();
            }
            awh.b(awh.this, this.f16044a, this.b);
            awh.this.g(this.c, this.b);
            vuj vujVar = this.g;
            if (vujVar != null) {
                vujVar.c();
            }
            ByteArrayOutputStream byteArrayOutputStream = this.d;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                    this.d = null;
                } catch (IOException e) {
                    if (dwh.r()) {
                        dwh.h(awh.TAG, e);
                    }
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent != null) {
                this.d.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
                this.c.onHttpResponseProgress(this.d.size());
                vuj vujVar = this.g;
                if (vujVar != null) {
                    vujVar.a(progressEvent.getBytedata());
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else {
                a(finishEvent);
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            if (map == null) {
                map = new HashMap<>();
            }
            this.f = map;
            this.b.f = new HashMap(map);
            this.c.onHeadersReceived(i, map);
            vuj vujVar = this.g;
            if (vujVar != null) {
                vujVar.e(i, false, map);
            }
            return true;
        }
    }

    static {
        t2o.a(982515713);
        t2o.a(982516041);
    }

    public static /* synthetic */ void b(awh awhVar, bxh bxhVar, dxh dxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6622537d", new Object[]{awhVar, bxhVar, dxhVar});
        } else {
            awhVar.d(bxhVar, dxhVar);
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    @Override // tb.gpc
    public void a(bxh bxhVar, gpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78829f5a", new Object[]{this, bxhVar, aVar});
        } else if (aVar != null && bxhVar != null) {
            vuj vujVar = new vuj();
            aVar.onHttpStart();
            vujVar.g(bxhVar);
            bxhVar.h = SystemClock.uptimeMillis();
            dxh dxhVar = new dxh();
            if (dxhVar.e == null) {
                dxhVar.e = new HashMap();
            }
            if (TextUtils.isEmpty(bxhVar.c)) {
                dxhVar.f18133a = String.valueOf(16);
                dxhVar.d = "request url is empty!";
                vujVar.d(dxhVar);
                aVar.a(dxhVar);
                return;
            }
            bxhVar.i = SystemClock.uptimeMillis();
            j(bxhVar, dxhVar, aVar, vujVar);
        }
    }

    public final Request c(bxh bxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("4b454b33", new Object[]{this, bxhVar});
        }
        RequestImpl requestImpl = new RequestImpl(bxhVar.c);
        requestImpl.setBizId(4102);
        Map<String, String> map = bxhVar.b;
        if (map != null) {
            for (String str : ((ConcurrentHashMap) map).keySet()) {
                requestImpl.addHeader(str, (String) ((ConcurrentHashMap) bxhVar.b).get(str));
            }
        }
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, e());
        String str2 = bxhVar.d;
        if (TextUtils.isEmpty(str2)) {
            str2 = "GET";
        }
        requestImpl.setMethod(str2);
        requestImpl.setCharset("UTF-8");
        requestImpl.setRetryTime(2);
        requestImpl.setConnectTimeout(bxhVar.f);
        if (!TextUtils.isEmpty(bxhVar.e)) {
            requestImpl.setBodyEntry(new ByteArrayEntry(bxhVar.e.getBytes()));
        }
        return requestImpl;
    }

    public final void d(bxh bxhVar, dxh dxhVar) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07a4909", new Object[]{this, bxhVar, dxhVar});
            return;
        }
        double uptimeMillis = SystemClock.uptimeMillis();
        try {
            String uri = Uri.parse(bxhVar.c).buildUpon().clearQuery().build().toString();
            Map<String, Object> map = dxhVar.e;
            String str = "http";
            if (map != null && "ZCache".equals(((HashMap) map).get("connectionType"))) {
                str = "zcache";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) uri);
            jSONObject.put("cacheType", (Object) str);
            jSONObject.put("code", (Object) dxhVar.f18133a);
            jSONObject.put("deviceLevel", (Object) String.valueOf(f5x.b()));
            String str2 = dxhVar.c;
            if (str2 != null) {
                WeexAppMonitor$Avail$Point.HTTP_DOWNLOAD.commitFailAsync(jSONObject, str2, dxhVar.d);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("zcacheCheckTime", Double.valueOf(bxhVar.i - bxhVar.h));
            hashMap.put(amo.c.POINT_NAME, Double.valueOf(uptimeMillis - bxhVar.i));
            hashMap.put("resourceSize", Double.valueOf(dxhVar.b != null ? bArr.length : vu3.b.GEO_NOT_SUPPORT));
            WeexAppMonitor$Avail$Point.HTTP_DOWNLOAD.commitSuccessAsync(jSONObject);
            WeexAppMonitor$Performance$Point.HTTP_DOWNLOAD.commitAsync(jSONObject, hashMap);
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    public void g(gpc.a aVar, dxh dxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f7582b", new Object[]{this, aVar, dxhVar});
        } else {
            aVar.a(dxhVar);
        }
    }

    public final void h(Request request, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13037c13", new Object[]{this, request, str});
        } else if (request != null) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("wx_request_timeout");
                if (!TextUtils.isEmpty(queryParameter)) {
                    int parseFloat = (int) (Float.parseFloat(queryParameter) * 1000.0f);
                    if (parseFloat <= 0) {
                        parseFloat = 10000;
                    }
                    request.setConnectTimeout(parseFloat);
                    request.setReadTimeout(parseFloat);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void j(bxh bxhVar, dxh dxhVar, gpc.a aVar, vuj vujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678d3c55", new Object[]{this, bxhVar, dxhVar, aVar, vujVar});
            return;
        }
        try {
            dwh.p(TAG, "Http request start, url: " + bxhVar.c);
            dxhVar.f18133a = String.valueOf(16);
            dxhVar.d = "default err";
            bxhVar.f = 10000;
            Request c = c(bxhVar);
            h(c, bxhVar.c);
            new DegradableNetwork(f5x.a()).asyncSend(c, null, null, new a(bxhVar, dxhVar, aVar, bxhVar.c, vujVar));
        } catch (Exception e) {
            dwh.h(TAG, e);
            dxhVar.f18133a = String.valueOf(16);
            dxhVar.c = String.valueOf(16);
            dxhVar.d = e.getMessage();
            if (vujVar != null) {
                vujVar.d(dxhVar);
            }
            aVar.a(dxhVar);
        }
    }

    public final String e() {
        Locale locale;
        LocaleList localeList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f55639da", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                localeList = LocaleList.getDefault();
                locale = localeList.get(0);
            } else {
                locale = Locale.getDefault();
            }
            String str = locale.getLanguage() + "-" + locale.getCountry();
            if (locale.getLanguage().equals("zh")) {
                return str + ",zh;q=0.8,en-US;q=0.5,en;q=0.3";
            }
            return str + "," + locale.getLanguage() + ";q=0.8,en-US;q=0.5,en;q=0.3";
        } catch (Throwable unused) {
            return "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3";
        }
    }

    public static boolean f(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdd194d", new Object[]{uri})).booleanValue();
        }
        if (uri != null) {
            return (uri.getHost().startsWith("mo.m.taobao.com") || uri.getHost().startsWith("pre-mo.m.taobao.com")) && "true".equals(uri.getQueryParameter("wh_muise"));
        }
        return false;
    }
}
