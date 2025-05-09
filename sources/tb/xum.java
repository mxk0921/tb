package tb;

import android.taobao.windvane.export.prerender.PrerenderType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class xum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31614a;
    public final int b;
    public final zcd c;
    public final long d;
    public final long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f31615a = -1;
        public String b = "";
        public int c;
        public List<String> d;
        public List<String> e;

        static {
            t2o.a(989855906);
        }

        public final a b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8b4fe32d", new Object[]{this, new Long(j)});
            }
            this.f31615a = j;
            return this;
        }

        public final a c(@PrerenderType int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ffb807c", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public final a d(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3b55eea4", new Object[]{this, list});
            }
            ckf.g(list, "queryIgnores");
            this.d = list;
            return this;
        }

        public final a e(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1bc709ff", new Object[]{this, list});
            }
            this.e = list;
            return this;
        }

        public final a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("965493af", new Object[]{this, str});
            }
            ckf.g(str, "url");
            this.b = str;
            return this;
        }

        public final xum a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xum) ipChange.ipc$dispatch("e86ae1d", new Object[]{this});
            }
            return new xum(this.b, this.c, new s47(this.c, this.e, this.d), this.f31615a, this.c != 1 ? 60000L : 10800000L);
        }
    }

    static {
        t2o.a(989855905);
    }

    public xum(String str, @PrerenderType int i, zcd zcdVar, long j, long j2) {
        ckf.g(str, "url");
        ckf.g(zcdVar, "prerenderChecker");
        this.f31614a = str;
        this.b = i;
        this.c = zcdVar;
        this.d = j;
        this.e = j2;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d645d48", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b15dc337", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final zcd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zcd) ipChange.ipc$dispatch("4815057f", new Object[]{this});
        }
        return this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("219ac31", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f31614a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof xum) {
                xum xumVar = (xum) obj;
                if (!(ckf.b(this.f31614a, xumVar.f31614a) && this.b == xumVar.b && ckf.b(this.c, xumVar.c) && this.d == xumVar.d && this.e == xumVar.e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f31614a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.b) * 31;
        zcd zcdVar = this.c;
        if (zcdVar != null) {
            i2 = zcdVar.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return ((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PrerenderRequestParams(url=" + this.f31614a + ", preRenderType=" + this.b + ", prerenderChecker=" + this.c + ", delayNextTime=" + this.d + ", ttl=" + this.e + f7l.BRACKET_END_STR;
    }
}
