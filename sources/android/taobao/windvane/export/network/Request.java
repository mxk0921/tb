package android.taobao.windvane.export.network;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ecd;
import tb.esd;
import tb.ikd;
import tb.r47;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger k = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final String f1762a;
    public final String b;
    public final List<Pair<String, Long>> c;
    public final Map<String, String> d;
    public volatile esd e;
    public Map<String, String> f;
    public final int g;
    public final boolean h;
    public final ecd i;
    public final ikd j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface METHOD {
        public static final String GET = "GET";
        public static final String POST = "POST";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ResourceType {
        public static final int DOCUMENT = 0;
        public static final int IMAGE = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface StageName {
        public static final String DOCUMENT_NETWORK_TTFB = "documentNetworkTTFB";
        public static final String DOCUMENT_PREFETCH_CONSUME = "documentPrefetchHitTime";
        public static final String DOCUMENT_REQUEST_END = "documentRequestEnd";
        public static final String DOCUMENT_REQUEST_HEADER_ADDED = "documentRequestHeaderAdded";
        public static final String DOCUMENT_REQUEST_SENT = "documentRequestSent";
        public static final String DOCUMENT_REQUEST_START = "documentRequestStart";
        public static final String DOCUMENT_REQUEST_THREAD_SWITCHED = "documentRequestThreadSwitched";
        public static final String DOCUMENT_REQUEST_ZCACHE_READ = "documentRequestZCacheRead";
        public static final String DOCUMENT_TTFB = "documentTTFB";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f1763a;
        public String b;
        public Map<String, String> c;
        public boolean d = false;
        public ecd e;
        public ikd f;

        static {
            t2o.a(989855879);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e767e08", new Object[]{bVar});
            }
            return bVar.f1763a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1c69e3e7", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4df53ecf", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ ecd d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ecd) ipChange.ipc$dispatch("c67d51a2", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ ikd e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ikd) ipChange.ipc$dispatch("79f5a00d", new Object[]{bVar});
            }
            return bVar.f;
        }

        public Request f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Request) ipChange.ipc$dispatch("525f1bd9", new Object[]{this});
            }
            if (this.f1763a != null) {
                if (TextUtils.isEmpty(this.b)) {
                    this.b = "GET";
                }
                if (this.c == null) {
                    this.c = new HashMap();
                }
                return new Request(this);
            }
            throw new IllegalStateException("url = null");
        }

        public b g(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ad0aa75d", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }

        public b h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("126d99d5", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("228024c3", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b j(ecd ecdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6ac9f4c0", new Object[]{this, ecdVar});
            }
            this.e = ecdVar;
            return this;
        }

        public b k(ikd ikdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d79af56c", new Object[]{this, ikdVar});
            }
            this.f = ikdVar;
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ebe83739", new Object[]{this, str});
            }
            this.f1763a = str;
            return this;
        }
    }

    static {
        t2o.a(989855877);
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("595db446", new Object[0])).intValue();
        }
        return k.getAndAdd(1);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb8617f", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            k();
            if (!this.f.containsKey(str)) {
                this.f.put(str, str2);
            }
        }
    }

    public boolean b(esd esdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae91a534", new Object[]{this, esdVar})).booleanValue();
        }
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.e = esdVar;
                        try {
                            Iterator it = ((ArrayList) this.c).iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                if (pair != null) {
                                    esdVar.recordStage((String) pair.first, ((Long) pair.second).longValue());
                                }
                            }
                            ((ArrayList) this.c).clear();
                            for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                                if (entry != null) {
                                    esdVar.recordProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            ((HashMap) this.d).clear();
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.f;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e92611aa", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.b;
    }

    public ecd g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ecd) ipChange.ipc$dispatch("b0373b53", new Object[]{this});
        }
        return this.i;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef4bfce", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public ikd i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ikd) ipChange.ipc$dispatch("a7bb8853", new Object[]{this});
        }
        return this.j;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f1762a;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5ec198", new Object[]{this});
        } else if (this.f == null) {
            this.f = new HashMap();
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21d799e", new Object[]{this, str});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                try {
                    esd esdVar = this.e;
                    if (esdVar == null) {
                        ((ArrayList) this.c).add(new Pair(str, Long.valueOf(uptimeMillis)));
                    } else {
                        esdVar.recordStage(str, uptimeMillis);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
    }

    public Request(b bVar) {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.f1762a = b.a(bVar);
        this.b = b.b(bVar);
        this.f = b.c(bVar);
        this.h = bVar.d;
        if (b.d(bVar) != null) {
            this.i = b.d(bVar);
        } else {
            this.i = new r47();
        }
        this.j = b.e(bVar);
    }

    public Request(Request request) {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.f1762a = request.f1762a;
        this.b = request.b;
        this.f = request.f;
        this.e = request.e;
        this.h = request.d();
        this.i = request.i;
        this.j = request.j;
        this.g = f();
    }
}
