package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class v7b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_HTTPS_ERROR_EXPIRED = "EXPIRED";
    public static final String DEFAULT_HTTPS_ERROR_INVALID = "INVALID";
    public static final String DEFAULT_HTTPS_ERROR_NONE = "NONE";
    public static final int DEFAULT_MAX_LENGTH = 5242880;
    public static final int DEFAULT_MAX_LENGTH1 = 104857600;
    public static final int DEFAULT_MAX_REDIRECT_TIMES = 5;

    /* renamed from: a  reason: collision with root package name */
    public Uri f29835a;
    public Map<String, String> b = null;
    public int c = 5000;

    static {
        t2o.a(989855808);
    }

    public v7b(String str) {
        if (str != null) {
            this.f29835a = Uri.parse(str);
            return;
        }
        throw new NullPointerException("HttpRequest init error, url is null.");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5824f407", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return "GET";
    }

    public byte[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5fb04f56", new Object[]{this});
        }
        return null;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
        }
        return 5000;
    }

    public Uri g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
        }
        return this.f29835a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3a20b1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabec0e3", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public void k(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc764036", new Object[]{this, uri});
        } else if (uri != null) {
            this.f29835a = uri;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue();
        }
        return 1;
    }
}
