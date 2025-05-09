package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABEnvironment;
import com.alibaba.ut.abtest.pipeline.Response;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class p3m implements o3m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xeq f25858a;

    static {
        t2o.a(961544413);
        t2o.a(961544412);
    }

    @Override // tb.o3m
    public Response a(c3o c3oVar) {
        Response response;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("2a93a3b1", new Object[]{this, c3oVar});
        }
        try {
            response = d(c3oVar);
            try {
                ogh.e("PipelineServiceImpl", "executeRequest complete, response=" + response);
                return response;
            } catch (Throwable th2) {
                th = th2;
                ogh.h("PipelineServiceImpl", "executeRequest failure." + th.getMessage(), th);
                if (response != null) {
                    return response;
                }
                Response response2 = new Response();
                response2.setSuccess(false);
                response2.setCode(40000);
                response2.setMessage(th.getMessage());
                return response2;
            }
        } catch (Throwable th3) {
            th = th3;
            response = null;
        }
    }

    public String b(HttpURLConnection httpURLConnection, c3o c3oVar) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5284dc62", new Object[]{this, httpURLConnection, c3oVar});
        }
        if (!(c3oVar.i() == null || c3oVar.i().c() == null)) {
            Object c = c3oVar.i().c();
            if (c instanceof Map) {
                str = uwf.f((Map) c3oVar.i().c());
            } else if (c instanceof List) {
                str = uwf.e((List) c3oVar.i().c());
            }
            Charset charset = m.DEFAULT_CHARSET;
            String g = tp1.g(n9n.b(str.getBytes(charset)), 2);
            httpURLConnection.setRequestProperty("ab-sign", rya.d("51734f6a783d4d4e6152405f413f68684552807b888d8163927b5280838d648d", g));
            httpURLConnection.setRequestProperty("ab-client-version", "2.16.37");
            httpURLConnection.setRequestProperty("app-key", wu3.c().a());
            httpURLConnection.setRequestProperty("app-version", d3r.c().a());
            return URLEncoder.encode(g, charset.name());
        }
        str = "";
        Charset charset2 = m.DEFAULT_CHARSET;
        String g2 = tp1.g(n9n.b(str.getBytes(charset2)), 2);
        httpURLConnection.setRequestProperty("ab-sign", rya.d("51734f6a783d4d4e6152405f413f68684552807b888d8163927b5280838d648d", g2));
        httpURLConnection.setRequestProperty("ab-client-version", "2.16.37");
        httpURLConnection.setRequestProperty("app-key", wu3.c().a());
        httpURLConnection.setRequestProperty("app-version", d3r.c().a());
        return URLEncoder.encode(g2, charset2.name());
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        UTABEnvironment f = n.j().f();
        if (f == null || f == UTABEnvironment.Product) {
            return "https://abtest.alibaba.com";
        }
        if (f == UTABEnvironment.Prepare) {
            return "http://preabtest.alibaba-inc.com";
        }
        if (f == UTABEnvironment.Daily) {
            return "http://abtest-daily.tmall.net";
        }
        return "https://abtest.alibaba.com";
    }

    public final Response d(c3o c3oVar) throws Exception {
        Throwable th;
        Closeable closeable;
        DataOutputStream dataOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("cb0c6fbe", new Object[]{this, c3oVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Response response = new Response();
        DataOutputStream dataOutputStream2 = null;
        try {
            URL url = new URL(c() + c3oVar.m());
            ogh.e("PipelineServiceImpl", "sendRequest. request=" + c3oVar + ", requestUrl=" + url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if (httpURLConnection instanceof HttpsURLConnection) {
                if (this.f25858a == null && !TextUtils.isEmpty(url.getHost())) {
                    this.f25858a = new xeq(url.getHost());
                }
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f25858a);
            }
            httpURLConnection.setRequestProperty("Charset", m.DEFAULT_CHARSET.name());
            httpURLConnection.setRequestProperty("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            if (c3oVar.g() != null) {
                for (Map.Entry<String, String> entry : c3oVar.g().entrySet()) {
                    if (entry.getValue() == null) {
                        httpURLConnection.setRequestProperty(entry.getKey(), "");
                    } else {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            String b = b(httpURLConnection, c3oVar);
            if (b == null || b.length() <= 0) {
                dataOutputStream = null;
            } else {
                String str = "requestBody=" + b;
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream.writeBytes(str);
                    dataOutputStream.flush();
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    dataOutputStream2 = dataOutputStream;
                    d2d.a(dataOutputStream2);
                    d2d.a(closeable);
                    throw th;
                }
            }
            response.setHttpResponseCode(httpURLConnection.getResponseCode());
            if (response.getHttpResponseCode() != 200) {
                ogh.g("PipelineServiceImpl", "request returned http code " + response.getHttpResponseCode());
                d2d.a(dataOutputStream);
                d2d.a(null);
                return null;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            response.setByteData(d2d.c(inputStream));
            String str2 = new String(response.getByteData(), "UTF-8");
            if (ogh.c()) {
                ogh.e("PipelineServiceImpl", "responseString=" + str2 + ", request=" + c3oVar);
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (TextUtils.equals("sm", jSONObject.optString("rgv587_flag"))) {
                response.setSuccess(false);
                response.setCode(20001);
                response.setMessage("rgv587_flag");
            } else {
                response.setSuccess(jSONObject.optBoolean("success"));
                response.setCode(jSONObject.optInt("code"));
                response.setMessage(jSONObject.optString("info"));
                response.setDataJsonObject(jSONObject.optJSONObject("data"));
                if (response.getDataJsonObject() != null) {
                    if (c3oVar.k() != null) {
                        response.setData(uwf.a(response.getDataJsonObject().toString(), c3oVar.k()));
                    } else if (c3oVar.l() != null) {
                        response.setData(uwf.b(response.getDataJsonObject().toString(), c3oVar.l()));
                    }
                }
            }
            d2d.a(dataOutputStream);
            d2d.a(inputStream);
            if (ogh.c()) {
                ogh.e("PipelineServiceImpl", "The request ended and it took " + (System.currentTimeMillis() - currentTimeMillis) + " milliseconds. request=" + c3oVar);
            } else {
                ogh.e("PipelineServiceImpl", "The request ended and it took " + (System.currentTimeMillis() - currentTimeMillis) + " milliseconds.");
            }
            return response;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }
}
