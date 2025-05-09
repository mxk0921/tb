package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ihq extends dtj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final HttpURLConnection b;

    static {
        t2o.a(996147282);
    }

    public ihq(cuj cujVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cujVar.e()).openConnection();
        this.b = httpURLConnection;
        if (cujVar.c() > 0) {
            httpURLConnection.setConnectTimeout(cujVar.c() * 1000);
        }
        httpURLConnection.setInstanceFollowRedirects(true);
        try {
            httpURLConnection.setRequestMethod("GET");
        } catch (ProtocolException unused) {
        }
        if (cujVar.b() != null) {
            for (Map.Entry<String, String> entry : cujVar.b().entrySet()) {
                this.b.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ihq ihqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/network/StandardNetwork");
    }

    @Override // tb.dtj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.b.disconnect();
        }
    }

    @Override // tb.dtj
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0a48918", new Object[]{this, str});
        }
        return this.b.getHeaderField(str);
    }

    @Override // tb.dtj
    public InputStream d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this});
        }
        try {
            InputStream inputStream = this.b.getInputStream();
            if (!TextUtils.equals("gzip", b(HttpConstant.CONTENT_ENCODING))) {
                return inputStream;
            }
            try {
                return new GZIPInputStream(inputStream);
            } catch (IOException e) {
                g(-6, e);
                return null;
            }
        } catch (IOException e2) {
            g(-5, e2);
            return null;
        }
    }

    @Override // tb.dtj
    public Map<String, List<String>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("683d75de", new Object[]{this});
        }
        return this.b.getHeaderFields();
    }

    @Override // tb.dtj
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        try {
            return this.b.getResponseCode();
        } catch (IOException e) {
            g(-4, e);
            return 0;
        }
    }
}
