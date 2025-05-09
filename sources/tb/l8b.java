package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l8b implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_HTTPS_HOST_PORT = "utanalytics_https_host";
    public static l8b b;

    /* renamed from: a  reason: collision with root package name */
    public String f23171a = "https://h-adashx.ut.taobao.com/upload";

    static {
        t2o.a(962592940);
        t2o.a(962592825);
    }

    public l8b() {
        try {
            Context g = o2w.k().g();
            if (g != null) {
                d(u51.i(g, TAG_HTTPS_HOST_PORT));
                d(iaq.a(g, TAG_HTTPS_HOST_PORT));
            }
            d(x2r.f().e(TAG_HTTPS_HOST_PORT));
            x2r.f().i(TAG_HTTPS_HOST_PORT, this);
        } catch (Throwable unused) {
        }
    }

    public static synchronized l8b c() {
        synchronized (l8b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l8b) ipChange.ipc$dispatch("71af51e1", new Object[0]);
            }
            if (b == null) {
                b = new l8b();
            }
            return b;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            d(str2);
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe52f0c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f23171a = h1p.HTTPS_PREFIX + str + "/upload";
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e81393f", new Object[]{this});
        }
        nhh.f("", "mHttpsUrl", this.f23171a);
        return this.f23171a;
    }
}
