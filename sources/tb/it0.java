package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class it0 implements zp7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21558a;
    public final String b;
    public fdb c;
    public volatile int d;

    public it0(int i, String str) {
        fpm.b(!TextUtils.isEmpty(str), "name cannot be empty when constructing AlivfsDiskCache");
        this.f21558a = i;
        this.b = "phximgs_" + str;
    }

    @Override // tb.zp7
    public boolean a(String str, int i, byte[] bArr, int i2, int i3) {
        ByteArrayInputStream byteArrayInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f618c8e", new Object[]{this, str, new Integer(i), bArr, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (bArr == null || i3 <= 0) {
            byteArrayInputStream = null;
        } else {
            byteArrayInputStream = new ByteArrayInputStream(bArr, i2, i3);
        }
        return h(str, i, byteArrayInputStream);
    }

    @Override // tb.zp7
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f931b", new Object[]{this, context})).booleanValue();
        }
        return g();
    }

    @Override // tb.zp7
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f0c2f7", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // tb.zp7
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c1d36ea", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.zp7
    public long e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a05552a", new Object[]{this, str, new Integer(i)})).longValue();
        }
        try {
            if (!g()) {
                return -1L;
            }
            long e0 = (int) this.c.e0(str, String.valueOf(i));
            if (e0 > 0) {
                return e0;
            }
            return -1L;
        } catch (Throwable unused) {
            fiv.c("DiskCache", "getLength error", new Object[0]);
            return -1L;
        }
    }

    @Override // tb.zp7
    public int[] f(String str) {
        List<String> K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("99f2983", new Object[]{this, str});
        }
        try {
            if (g() && (K = this.c.K(str)) != null && K.size() > 0) {
                int[] iArr = new int[K.size()];
                for (int i = 0; i < K.size(); i++) {
                    try {
                        iArr[i] = Integer.parseInt(K.get(i));
                    } catch (NumberFormatException unused) {
                    }
                }
                return iArr;
            }
        } catch (Throwable unused2) {
            fiv.c("DiskCache", "getCatalogs error", new Object[0]);
        }
        return new int[0];
    }

    public final synchronized boolean g() {
        np cacheForModule;
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a6070c", new Object[]{this})).booleanValue();
            }
            if (this.c == null && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.b)) != null) {
                op opVar = new op();
                opVar.f25538a = Long.valueOf(this.d);
                cacheForModule.L(opVar);
                this.c = cacheForModule.w();
            }
            if (this.c != null) {
                z = true;
            }
            return z;
        }
    }

    @Override // tb.zp7
    public t9o get(String str, int i) {
        int e0;
        InputStream j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9o) ipChange.ipc$dispatch("b353f2c2", new Object[]{this, str, new Integer(i)});
        }
        try {
            if (!g() || (e0 = (int) this.c.e0(str, String.valueOf(i))) <= 0 || (j0 = this.c.j0(str, String.valueOf(i))) == null) {
                return null;
            }
            return new t9o(j0, e0);
        } catch (Throwable unused) {
            fiv.c("DiskCache", "get error", new Object[0]);
            return null;
        }
    }

    @Override // tb.zp7
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.f21558a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AlivfsDiskCache(" + Integer.toHexString(hashCode()) + ", name@" + this.b + f7l.BRACKET_END_STR;
    }

    @Override // tb.zp7
    public synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        AVFSCacheManager.getInstance().removeCacheForModule(this.b);
        fiv.f("DiskCache", "remove alivfs cache module(%s)", this.b);
        this.c = null;
    }

    public boolean h(String str, int i, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c487d4", new Object[]{this, str, new Integer(i), inputStream})).booleanValue();
        }
        try {
            if (g() && inputStream != null) {
                if (this.c.T(str, String.valueOf(i), inputStream)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            fiv.c("DiskCache", "put error", new Object[0]);
            return false;
        }
    }
}
