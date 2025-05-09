package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.data.QrCodeData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class btm<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16619a;
    public final String b;
    public final String c;
    public final String d;
    public final T e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public String k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16620a;
        public String b;
        public String c;
        public T d;
        public String e;

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("24b52504", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("52e7b05", new Object[]{bVar});
            }
            return bVar.f16620a;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e5a7d106", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c6212707", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Object e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("b3d79f9a", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ long f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b071fe6b", new Object[]{bVar})).longValue();
            }
            bVar.getClass();
            return 0L;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("678d290a", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("48067f0b", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("287fd50c", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ String j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8f92b0d", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public btm<T> k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (btm) ipChange.ipc$dispatch("5ee2418f", new Object[]{this});
            }
            return new btm<>(this);
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ef629725", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3ccd6cf1", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8771d510", new Object[]{this, str});
            }
            this.f16620a = str;
            return this;
        }

        public b o(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c0b5c115", new Object[]{this, t});
            }
            this.d = t;
            return this;
        }

        public b p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6ec9cbd9", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTaskCacheData{bizName='" + this.f16619a + "', cacheType='" + this.b + "', cacheHit='" + this.c + "', cacheKey='" + this.d + "', cacheValue=" + this.e + ", cacheExpire=" + this.f + ", protocolVersion='" + this.g + "', mainPicUrl='" + this.h + "', fromSource='" + this.i + "', industryFailReason='" + this.j + "'}";
    }

    public btm(b<T> bVar) {
        this.f16619a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
        this.e = (T) b.e(bVar);
        this.f = b.f(bVar) == 0 ? System.currentTimeMillis() : b.f(bVar);
        this.g = TextUtils.isEmpty(b.g(bVar)) ? "" : b.g(bVar);
        this.h = b.h(bVar);
        this.i = b.i(bVar);
        this.j = b.j(bVar);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("965e6198", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.b)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return "preload".equals(this.b) ? currentTimeMillis - this.f > 14400000 : "refresh".equals(this.b) && currentTimeMillis - this.f > QrCodeData.QR_CODE_VALID_PERIOD;
    }
}
