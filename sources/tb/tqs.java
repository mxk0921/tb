package tb;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabIconSourceType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28891a;
    public Drawable b;
    public Drawable c;
    public String d;
    public int e;
    public int f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tqs f28892a = new tqs();

        public tqs a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tqs) ipChange.ipc$dispatch("d0b26bad", new Object[]{this});
            }
            if (tqs.h(this.f28892a)) {
                return this.f28892a;
            }
            TLog.loge("TabIconCacheInfo", "build failed. checkValid failed.");
            return null;
        }

        public b b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f4d06812", new Object[]{this, new Integer(i)});
            }
            tqs.f(this.f28892a, i);
            return this;
        }

        public b c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f0ec5c92", new Object[]{this, new Integer(i)});
            }
            tqs.e(this.f28892a, i);
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5432c160", new Object[]{this, str});
            }
            tqs.d(this.f28892a, str);
            return this;
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f11ad3a9", new Object[]{this, new Integer(i)});
            }
            tqs.g(this.f28892a, i);
            return this;
        }

        public b f(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5c3173e6", new Object[]{this, drawable});
            }
            tqs.b(this.f28892a, drawable);
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4ff41728", new Object[]{this, str});
            }
            tqs.a(this.f28892a, str);
            return this;
        }

        public b h(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fb65436d", new Object[]{this, drawable});
            }
            tqs.c(this.f28892a, drawable);
            return this;
        }
    }

    public static /* synthetic */ String a(tqs tqsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d54f0b70", new Object[]{tqsVar, str});
        }
        tqsVar.f28891a = str;
        return str;
    }

    public static /* synthetic */ Drawable b(tqs tqsVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("22542e4f", new Object[]{tqsVar, drawable});
        }
        tqsVar.b = drawable;
        return drawable;
    }

    public static /* synthetic */ Drawable c(tqs tqsVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("10e6ba2e", new Object[]{tqsVar, drawable});
        }
        tqsVar.c = drawable;
        return drawable;
    }

    public static /* synthetic */ String d(tqs tqsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2c2b98d", new Object[]{tqsVar, str});
        }
        tqsVar.d = str;
        return str;
    }

    public static /* synthetic */ int e(tqs tqsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bb2794c", new Object[]{tqsVar, new Integer(i)})).intValue();
        }
        tqsVar.e = i;
        return i;
    }

    public static /* synthetic */ int f(tqs tqsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a89f906b", new Object[]{tqsVar, new Integer(i)})).intValue();
        }
        tqsVar.f = i;
        return i;
    }

    public static /* synthetic */ int g(tqs tqsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("358ca78a", new Object[]{tqsVar, new Integer(i)})).intValue();
        }
        tqsVar.g = i;
        return i;
    }

    public static /* synthetic */ boolean h(tqs tqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f7c476f", new Object[]{tqsVar})).booleanValue();
        }
        return tqsVar.i();
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (this.f28891a == null || this.b == null || this.c == null || this.d == null) {
            return false;
        }
        return true;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdb0b8ad", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4beb20d", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.d;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2aa0f04", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public Pair<Object, Object> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6e471975", new Object[]{this});
        }
        return new Pair<>(this.c, this.b);
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.f28891a;
    }

    public tqs() {
        IpChange ipChange = NavigationTabIconSourceType.$ipChange;
        this.e = 1;
        this.f = 1;
        this.g = 6;
    }
}
