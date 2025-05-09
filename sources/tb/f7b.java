package tb;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f7b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f19066a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(f7b f7bVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "http_cache_client_thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f19067a;
        private final String b;
        private final int c;

        static {
            t2o.a(774897866);
        }

        public b(String str, String str2, int i) {
            this.f19067a = str;
            this.b = str2;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                f7b.a(f7b.this, this.f19067a, this.b, this.c);
            } catch (ProxyCacheException unused) {
            }
        }
    }

    static {
        t2o.a(774897864);
    }

    public f7b() {
        a aVar = new a(this);
        synchronized (this) {
            try {
                if (f19066a == null) {
                    f19066a = dq.c(12, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(f7b f7bVar, String str, String str2, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563a0feb", new Object[]{f7bVar, str, str2, new Integer(i)});
        } else {
            f7bVar.c(str, str2, i);
        }
    }

    public void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e5d982", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        try {
            f19066a.submit(new b(str, str2, i));
        } catch (OutOfMemoryError e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "addHttpRequest fail " + str + ", " + e.toString());
        }
    }

    public final void c(String str, String str2, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5a0b41", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        Uri.parse(str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            if (i <= 0) {
                httpURLConnection.setRequestProperty(HttpConstant.RANGE, "bytes=0-");
            } else {
                httpURLConnection.setRequestProperty(HttpConstant.RANGE, "bytes=0-" + (i - 1));
            }
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, str2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200 && responseCode != 206) {
                AVSDKLog.e("HttpCacheClients", " httpRequest error, code =" + responseCode);
            }
        } catch (Exception e) {
            throw new ProxyCacheException("Error opening connection for " + str + " error message:" + e.getMessage(), e);
        }
    }
}
