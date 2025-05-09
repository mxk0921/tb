package tb;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.cache.WVFileCache;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weaver.prefetch.a;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class opw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static opw c;

    /* renamed from: a  reason: collision with root package name */
    public volatile WVFileCache f25564a;
    public volatile WVFileCache b;

    static {
        t2o.a(989855762);
    }

    public static synchronized opw e() {
        synchronized (opw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (opw) ipChange.ipc$dispatch("7f5dd558", new Object[0]);
            }
            if (c == null) {
                c = new opw();
            }
            return c;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b985d0f", new Object[]{this})).booleanValue();
        }
        if (c() == null || d() == null) {
            return true;
        }
        return false;
    }

    public String b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2830a974", new Object[]{this, new Boolean(z)});
        }
        if (a()) {
            return null;
        }
        if (z) {
            return d().h();
        }
        return c().h();
    }

    public File f(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("275a4823", new Object[]{this, new Boolean(z)});
        }
        if (a()) {
            return null;
        }
        if (z) {
            str = d().h() + File.separator + "temp";
        } else {
            str = c().h() + File.separator + "temp";
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("930757e", new Object[]{this, str})).booleanValue();
        }
        if (!str.contains("_wvcrc=")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null || !parse.isHierarchical() || !TextUtils.isEmpty(parse.getQueryParameter("_wvcrc=")) || !"0".equals(parse.getQueryParameter("_wvcrc="))) {
            return true;
        }
        return false;
    }

    public boolean i(oqw oqwVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("837eb7dd", new Object[]{this, oqwVar, bArr})).booleanValue();
        }
        if (a()) {
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (x74.k(oqwVar.d)) {
            return d().l(oqwVar, wrap);
        }
        String d = ql7.d(bArr);
        if (d == null) {
            return false;
        }
        oqwVar.e = d;
        return c().l(oqwVar, wrap);
    }

    public final WVFileCache c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVFileCache) ipChange.ipc$dispatch("89cf62f2", new Object[]{this});
        }
        if (this.f25564a == null) {
            synchronized (this) {
                try {
                    if (this.f25564a == null) {
                        this.f25564a = nqw.b().a(null, "wvcache", 250, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f25564a;
    }

    public final WVFileCache d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVFileCache) ipChange.ipc$dispatch("69f08de3", new Object[]{this});
        }
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = nqw.b().a(null, "wvimage", 300, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public synchronized void g(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7aacc8", new Object[]{this, context, str, new Integer(i)});
        } else if (context != null) {
            v7t.a("WVCacheManager", "start init.");
            long currentTimeMillis = System.currentTimeMillis();
            a.d().g(new gsw());
            if (this.f25564a == null) {
                this.f25564a = nqw.b().a(str, "wvcache", 250, true);
                this.b = nqw.b().a(str, "wvimage", 300, true);
            }
            if (v7t.h()) {
                v7t.a("WVCacheManager", "init finish.  cost time: " + (System.currentTimeMillis() - currentTimeMillis));
            }
        } else {
            throw new NullPointerException("CacheManager init error, context is null");
        }
    }
}
