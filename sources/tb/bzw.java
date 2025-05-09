package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16745a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final bzw f16746a;
        public final Map<String, String> b = new HashMap();

        static {
            t2o.a(468713615);
        }

        public a(bzw bzwVar) {
            this.f16746a = bzwVar;
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
            }
            return this.b;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1b2bd65", new Object[]{this});
            }
            ((HashMap) this.b).put("tabid", this.f16746a.f16745a);
            ((HashMap) this.b).put("sessionid", this.f16746a.b);
            ((HashMap) this.b).put(Constants.Weex.INSTANCEID, this.f16746a.c);
            ((HashMap) this.b).put("index", this.f16746a.d);
            ((HashMap) this.b).put("id", this.f16746a.e);
            ((HashMap) this.b).put("url", this.f16746a.f);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("51e05683", new Object[]{this, str});
            }
            ((HashMap) this.b).put("gamestate", str);
            return this;
        }

        public final long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a297a428", new Object[]{this})).longValue();
            }
            if (this.f16746a.q > 0) {
                return SystemClock.elapsedRealtime() - this.f16746a.q;
            }
            return 0L;
        }

        public final long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e0cabf2", new Object[]{this})).longValue();
            }
            if (this.f16746a.l > 0) {
                return SystemClock.elapsedRealtime() - this.f16746a.l;
            }
            return 0L;
        }

        public final long f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7c8a3585", new Object[]{this})).longValue();
            }
            if (this.f16746a.m > 0) {
                return SystemClock.elapsedRealtime() - this.f16746a.m;
            }
            return 0L;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9f2cf518", new Object[]{this, new Boolean(z)});
            }
            this.f16746a.getClass();
            if (z) {
                this.f16746a.i++;
            }
            ((HashMap) this.b).put("active", String.valueOf(z));
            ((HashMap) this.b).put("activenum", String.valueOf(this.f16746a.i));
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("97750b69", new Object[]{this, new Boolean(z)});
            }
            this.f16746a.getClass();
            if (z) {
                this.f16746a.h++;
            }
            ((HashMap) this.b).put("appear", String.valueOf(z));
            ((HashMap) this.b).put("appearnum", String.valueOf(this.f16746a.h));
            return this;
        }

        public a i(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e2d1b66", new Object[]{this, map});
            }
            if (!sz3.b(map)) {
                ((HashMap) this.b).putAll(map);
            }
            return this;
        }

        public a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ab6c82e1", new Object[]{this, str});
            }
            ((HashMap) this.b).put("webState", str);
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("88d035da", new Object[]{this, new Boolean(z)});
            }
            this.f16746a.getClass();
            if (z) {
                this.f16746a.j++;
            }
            ((HashMap) this.b).put("pageappear", String.valueOf(z));
            ((HashMap) this.b).put("pageappearnum", String.valueOf(this.f16746a.j));
            return this;
        }

        public a k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f4cc8e9c", new Object[]{this});
            }
            String str = this.f16746a.g;
            if (!TextUtils.isEmpty(str)) {
                str.hashCode();
                long j = 0;
                char c = 65535;
                switch (str.hashCode()) {
                    case -2113389068:
                        if (str.equals("pagedisappear")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1422950650:
                        if (str.equals("active")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1411068523:
                        if (str.equals("appear")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -947487158:
                        if (str.equals("webloadinit")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -189603564:
                        if (str.equals("disactive")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -177721437:
                        if (str.equals("disappear")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -99989769:
                        if (str.equals("webloadfailed")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3015911:
                        if (str.equals("back")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3443508:
                        if (str.equals("play")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 310351011:
                        if (str.equals("loadfailed")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 545472344:
                        if (str.equals("loadfinished")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 1344973996:
                        if (str.equals("webloadfinished")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1684195556:
                        if (str.equals("pageappear")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1789472487:
                        if (str.equals("databind")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        j(false);
                        break;
                    case 1:
                        g(true);
                        this.f16746a.q = SystemClock.elapsedRealtime();
                        ((HashMap) this.b).put("duration", String.valueOf(e()));
                        break;
                    case 2:
                        h(true);
                        this.f16746a.p = SystemClock.elapsedRealtime();
                        ((HashMap) this.b).put("duration", String.valueOf(e()));
                        break;
                    case 3:
                        this.f16746a.m = SystemClock.elapsedRealtime();
                        ((HashMap) this.b).put("duration", String.valueOf(e()));
                        break;
                    case 4:
                        ((HashMap) this.b).put("duration", String.valueOf(d()));
                        g(false);
                        break;
                    case 5:
                        if (this.f16746a.p > 0) {
                            j = SystemClock.elapsedRealtime() - this.f16746a.p;
                        }
                        ((HashMap) this.b).put("duration", String.valueOf(j));
                        h(false);
                        break;
                    case 6:
                    case '\t':
                    case '\n':
                    case 11:
                        ((HashMap) this.b).put("duration", String.valueOf(f()));
                        break;
                    case 7:
                        bzw bzwVar = this.f16746a;
                        bzwVar.o = bzwVar.n > 0 ? SystemClock.elapsedRealtime() - this.f16746a.n : 0L;
                        ((HashMap) this.b).put("duration", String.valueOf(this.f16746a.o));
                        this.f16746a.n = 0L;
                        break;
                    case '\b':
                        this.f16746a.n = SystemClock.elapsedRealtime();
                        bzw bzwVar2 = this.f16746a;
                        int i = bzwVar2.k + 1;
                        bzwVar2.k = i;
                        ((HashMap) this.b).put("playgamenum", String.valueOf(i));
                        ((HashMap) this.b).put("duration", String.valueOf(d()));
                        break;
                    case '\f':
                        j(true);
                        break;
                    case '\r':
                        this.f16746a.o = 0L;
                        break;
                }
                ((HashMap) this.b).put("name", str);
            }
            return this;
        }
    }

    static {
        t2o.a(468713614);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b782cfd9", new Object[]{this});
        }
        return new a(this);
    }
}
