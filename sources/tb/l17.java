package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;
import tb.n7b;
import tb.ntj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l17 implements n7b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f23049a = 15000;
    public int b = 10000;

    static {
        t2o.a(620757114);
        t2o.a(620757116);
    }

    @Override // tb.n7b
    public Future<?> a(String str, Map<String, String> map, n7b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("57378a83", new Object[]{this, str, map, aVar});
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(str);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(this.f23049a);
            httpURLConnection.setReadTimeout(this.b);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                ((ntj.a) aVar).b(new t9o(httpURLConnection.getInputStream(), httpURLConnection.getContentLength()));
                return null;
            }
            ((ntj.a) aVar).a(new HttpCodeResponseException(responseCode));
            return null;
        } catch (Exception e) {
            ((ntj.a) aVar).a(e);
            return null;
        }
    }

    @Override // tb.n7b
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a24a5", new Object[]{this, new Integer(i)});
        } else {
            this.f23049a = i;
        }
    }

    @Override // tb.n7b
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1836351", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }
}
