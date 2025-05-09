package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wqa implements n55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HttpURLConnection f30858a;

    @Override // tb.n55
    public void a(URL url, m55 m55Var) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85f09dc", new Object[]{this, url, m55Var});
            return;
        }
        if (url.getProtocol().equals("http") && !m55Var.e()) {
            url = new URL(f(url.toString(), m55Var.b()));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        this.f30858a = httpURLConnection;
        httpURLConnection.setConnectTimeout(m55Var.c());
        this.f30858a.setReadTimeout(m55Var.d());
        this.f30858a.setInstanceFollowRedirects(true);
    }

    @Override // tb.n55
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327aa1be", new Object[]{this, str, str2});
        } else {
            this.f30858a.addRequestProperty(str, str2);
        }
    }

    @Override // tb.n55
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d10dd8ff", new Object[]{this})).longValue();
        }
        String headerField = this.f30858a.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField) || !TextUtils.isDigitsOnly(headerField)) {
            return 0L;
        }
        return Long.valueOf(headerField).longValue();
    }

    @Override // tb.n55
    public void connect() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else {
            this.f30858a.connect();
        }
    }

    @Override // tb.n55
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        if (this.f30858a == null) {
            return "HttpResponse is empty!";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30858a.getResponseCode());
            sb.append("\n");
            sb.append(this.f30858a.getResponseMessage());
            sb.append("\n");
            Map<String, List<String>> headerFields = this.f30858a.getHeaderFields();
            for (String str : headerFields.keySet()) {
                sb.append((Object) str);
                sb.append(":");
                sb.append(headerFields.get(str));
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            fs7.d("hucCon", "getErrorMsg", th, new Object[0]);
            return "";
        }
    }

    @Override // tb.n55
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d46d703", new Object[]{this});
        } else {
            this.f30858a.disconnect();
        }
    }

    public final String f(String str, int i) {
        String str2;
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56fdcbe7", new Object[]{this, str, new Integer(i)});
        }
        if (xh4.i == null) {
            return str;
        }
        try {
            URL url = new URL(str);
            String host = url.getHost();
            int port = url.getPort();
            if (port == -1) {
                str2 = host;
            } else {
                str2 = host + ":" + port;
            }
            a2 = ((is7) xh4.i).a(host);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (a2.isEmpty()) {
            return str;
        }
        String str3 = a2.get(i % a2.size());
        if (!TextUtils.isEmpty(str3)) {
            return str.replaceFirst(str2, str3);
        }
        return str;
    }

    @Override // tb.n55
    public o55 getInputStream() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o55) ipChange.ipc$dispatch("6129a401", new Object[]{this});
        }
        return new xqa(this.f30858a.getInputStream());
    }

    @Override // tb.n55
    public int getStatusCode() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        return this.f30858a.getResponseCode();
    }
}
