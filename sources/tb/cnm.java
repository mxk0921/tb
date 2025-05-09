package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.o6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean r = false;
    public static boolean s = false;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f17179a;
    public Context b;
    public boolean e;
    public boolean g;
    public final int i;
    public com.taobao.android.fluid.framework.data.datamodel.a k;
    public int l;
    public String m;
    public String n;
    public anm o;
    public Runnable p;
    public final Set<String> c = new HashSet();
    public final List<String> d = new ArrayList(3);
    public int f = 0;
    public final int h = 5000;
    public final float j = 0.8f;
    public final Handler q = new b(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/util/PreLoadManagerNew$1");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            ir9.b("PreLoadManagerNew", "[cachevideo]page is stopped, try  preDownloadUnexposeContent");
            cnm.a(cnm.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements h9e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f17182a;

            public a(b bVar, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
                this.f17182a = aVar;
            }

            @Override // tb.h9e
            public void onCancel(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
                    return;
                }
                com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f17182a;
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                aVar.i = str;
            }

            @Override // tb.h9e
            public void onError(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                    return;
                }
                com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f17182a;
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                aVar.h = str;
            }

            @Override // tb.h9e
            public void onFinish(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                    return;
                }
                this.f17182a.f = System.currentTimeMillis();
                this.f17182a.g = i;
            }

            @Override // tb.h9e
            public void onProgress(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.h9e
            public void onStart(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                } else {
                    this.f17182a.e = System.currentTimeMillis();
                }
            }
        }

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/util/PreLoadManagerNew$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (cnm.b(cnm.this) || (cnm.m(cnm.this) != null && cnm.m(cnm.this).d())) {
                StringBuilder sb = new StringBuilder("handleMessage isStopped ");
                sb.append(cnm.b(cnm.this));
                sb.append(" isPoor: ");
                if (cnm.m(cnm.this) == null || !cnm.m(cnm.this).d()) {
                    z = false;
                }
                sb.append(z);
                ir9.b("PreLoadManagerNew", sb.toString());
            } else {
                com.taobao.android.fluid.framework.data.datamodel.a n = cnm.n(cnm.this);
                if (n == null || n.e() == null || !cnm.o(cnm.this)) {
                    cnm.a(cnm.this);
                } else {
                    cnm.q(cnm.this, n, (int) (cnm.p(cnm.this) * 1024.0f * 1024.0f), new a(this, n));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements h9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f17183a;
        public final /* synthetic */ DetailCacheData b;

        public c(cnm cnmVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, DetailCacheData detailCacheData) {
            this.f17183a = aVar;
            this.b = detailCacheData;
        }

        @Override // tb.h9e
        public void onCancel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
                return;
            }
            ir9.b("PreLoadManagerNew", " predownload unexpose content cancel:" + str);
            com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f17183a;
            if (aVar != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                aVar.i = str;
            }
        }

        @Override // tb.h9e
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.b("PreLoadManagerNew", "preloadUnexposeContentInThread finish : " + this.b.getContentId());
            com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f17183a;
            if (aVar != null) {
                aVar.f = System.currentTimeMillis();
                this.f17183a.g = i;
            }
        }

        @Override // tb.h9e
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.h9e
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f17183a;
            if (aVar != null) {
                aVar.e = System.currentTimeMillis();
            }
        }

        @Override // tb.h9e
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            ir9.b("PreLoadManagerNew", " predownload unexpose content error:" + str);
            if (aps.s()) {
                this.b.hasDownLoadError = true;
            }
            com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f17183a;
            if (aVar != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                aVar.h = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DetailCacheData f17184a;
        public final /* synthetic */ int b;
        public final /* synthetic */ HashMap c;
        public final /* synthetic */ h9e d;

        public d(DetailCacheData detailCacheData, int i, HashMap hashMap, h9e h9eVar) {
            this.f17184a = detailCacheData;
            this.b = i;
            this.c = hashMap;
            this.d = h9eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cnm.r(cnm.this, this.f17184a.getContentId(), this.f17184a.getVideoResourceJsonObject(), this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f17185a;
        public final /* synthetic */ int b;
        public final /* synthetic */ HashMap c;
        public final /* synthetic */ h9e d;

        public e(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, HashMap hashMap, h9e h9eVar) {
            this.f17185a = aVar;
            this.b = i;
            this.c = hashMap;
            this.d = h9eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cnm.s(cnm.this, this.f17185a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17186a;

        public f(String str) {
            this.f17186a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.b("PreLoadManagerNew", "预下载超时了。取消当前视频，下载下-个");
            if (TextUtils.equals(cnm.t(cnm.this), this.f17186a)) {
                cnm cnmVar = cnm.this;
                cnm.d(cnmVar, cnm.c(cnmVar));
                cnm.u(cnm.this, null);
                cnm.e(cnm.this, null);
                if (cnm.f(cnm.this).isEmpty() || !TextUtils.equals((CharSequence) cnm.f(cnm.this).get(0), this.f17186a)) {
                    cnm.f(cnm.this).add(this.f17186a);
                } else {
                    cnm.g(cnm.this).add(this.f17186a);
                    cnm.f(cnm.this).clear();
                }
            }
            cnm.h(cnm.this, 500L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements h9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17187a;
        public final /* synthetic */ h9e b;

        public g(String str, h9e h9eVar) {
            this.f17187a = str;
            this.b = h9eVar;
        }

        @Override // tb.h9e
        public void onCancel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
                return;
            }
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onCancel(str);
            }
        }

        @Override // tb.h9e
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onError(str);
            }
        }

        @Override // tb.h9e
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.b("PreLoadManagerNew", "[cachevideo]preDownloadCurrent =====>contentId=" + this.f17187a + " onfinish size=" + i);
            if (!cnm.i()) {
                ggs.e("TAB2_VIDEO_PRELOAD_STAGE", "cachedVideo");
                cnm.j(true);
            }
            if (cnm.k(cnm.this) != null) {
                cnm.l(cnm.this).removeCallbacks(cnm.k(cnm.this));
            }
            if (i > 0 && this.f17187a != null) {
                cnm.g(cnm.this).add(this.f17187a);
            }
            if (TextUtils.equals(cnm.t(cnm.this), this.f17187a)) {
                cnm.u(cnm.this, null);
                cnm.e(cnm.this, null);
            }
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onFinish(i);
            }
            cnm.h(cnm.this, 500L);
        }

        @Override // tb.h9e
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.a("PreLoadManagerNew", "preDownloadCurrent ------" + this.f17187a + " onProgress。 i = " + i);
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onProgress(i);
            }
        }

        @Override // tb.h9e
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            ir9.b("PreLoadManagerNew", "[cachevideo]preDownloadCurrent onStart, contentId=" + this.f17187a + " url=" + str);
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onStart(str);
            }
        }
    }

    static {
        t2o.a(468714715);
    }

    public cnm(FluidContext fluidContext) {
        int i = 3;
        this.f17179a = fluidContext;
        this.i = p91.l() ? aps.L() : i;
        s = aps.q();
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new a());
    }

    public static boolean A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed12c908", new Object[]{jSONObject})).booleanValue();
        }
        ir9.b("PreLoadManagerNew", "check isVideoCached videoResourceStr=" + jSONObject);
        if (jSONObject == null) {
            return false;
        }
        if (aps.c()) {
            return qmm.e(Globals.getApplication(), jSONObject);
        }
        return qmm.d(Globals.getApplication(), jSONObject);
    }

    public static /* synthetic */ void a(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcdebec", new Object[]{cnmVar});
        } else {
            cnmVar.E();
        }
    }

    public static /* synthetic */ boolean b(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a3ee50f", new Object[]{cnmVar})).booleanValue();
        }
        return cnmVar.g;
    }

    public static /* synthetic */ Context c(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("514b8c55", new Object[]{cnmVar});
        }
        return cnmVar.b;
    }

    public static /* synthetic */ void d(cnm cnmVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580f41cc", new Object[]{cnmVar, context});
        } else {
            cnmVar.v(context);
        }
    }

    public static /* synthetic */ String e(cnm cnmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ad2611d", new Object[]{cnmVar, str});
        }
        cnmVar.m = str;
        return str;
    }

    public static /* synthetic */ List f(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("55bd074d", new Object[]{cnmVar});
        }
        return cnmVar.d;
    }

    public static /* synthetic */ Set g(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c83b0508", new Object[]{cnmVar});
        }
        return cnmVar.c;
    }

    public static /* synthetic */ void h(cnm cnmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ea3cc", new Object[]{cnmVar, new Long(j)});
        } else {
            cnmVar.J(j);
        }
    }

    public static /* synthetic */ boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83505830", new Object[0])).booleanValue();
        }
        return r;
    }

    public static /* synthetic */ boolean j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea25116a", new Object[]{new Boolean(z)})).booleanValue();
        }
        r = z;
        return z;
    }

    public static /* synthetic */ Runnable k(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("df9599e", new Object[]{cnmVar});
        }
        return cnmVar.p;
    }

    public static /* synthetic */ Handler l(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e15bf51", new Object[]{cnmVar});
        }
        return cnmVar.q;
    }

    public static /* synthetic */ anm m(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anm) ipChange.ipc$dispatch("4cadc629", new Object[]{cnmVar});
        }
        return cnmVar.o;
    }

    public static /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a n(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("7634dc48", new Object[]{cnmVar});
        }
        return cnmVar.w();
    }

    public static /* synthetic */ boolean o(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6991d06c", new Object[]{cnmVar})).booleanValue();
        }
        return cnmVar.y();
    }

    public static /* synthetic */ float p(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8402c977", new Object[]{cnmVar})).floatValue();
        }
        return cnmVar.j;
    }

    public static /* synthetic */ void q(cnm cnmVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, h9e h9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeb88d2", new Object[]{cnmVar, aVar, new Integer(i), h9eVar});
        } else {
            cnmVar.D(aVar, i, h9eVar);
        }
    }

    public static /* synthetic */ void r(cnm cnmVar, String str, JSONObject jSONObject, int i, HashMap hashMap, h9e h9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae28b5", new Object[]{cnmVar, str, jSONObject, new Integer(i), hashMap, h9eVar});
        } else {
            cnmVar.B(str, jSONObject, i, hashMap, h9eVar);
        }
    }

    public static /* synthetic */ void s(cnm cnmVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, HashMap hashMap, h9e h9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cef5c5", new Object[]{cnmVar, aVar, new Integer(i), hashMap, h9eVar});
        } else {
            cnmVar.C(aVar, i, hashMap, h9eVar);
        }
    }

    public static /* synthetic */ String t(cnm cnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("559aacfd", new Object[]{cnmVar});
        }
        return cnmVar.n;
    }

    public static /* synthetic */ String u(cnm cnmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e34660b5", new Object[]{cnmVar, str});
        }
        cnmVar.n = str;
        return str;
    }

    public static String x(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("368676be", new Object[]{aVar});
        }
        if (aVar == null || aVar.e() == null) {
            return "";
        }
        return aVar.e().f();
    }

    public static boolean z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87104848", new Object[]{str})).booleanValue();
        }
        ir9.b("PreLoadManagerNew", "check isVideoCached videoResourceStr=" + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            boolean A = A(new JSONObject(str));
            ir9.b("PreLoadManagerNew", "check isVideoCached=" + A);
            return A;
        } catch (JSONException e2) {
            ir9.b("PreLoadManagerNew", "isVideoCached error:" + e2);
            e2.printStackTrace();
            return false;
        }
    }

    public final void C(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, HashMap<String, String> hashMap, h9e h9eVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69aa42c9", new Object[]{this, aVar, new Integer(i), hashMap, h9eVar});
        } else if (aVar != null && aVar.e() != null && !aVar.e().z()) {
            a.d e2 = aVar.e();
            a.e K = e2.K();
            if (K != null) {
                String f2 = e2.f();
                try {
                    jSONObject = new JSONObject(K.m());
                } catch (Exception e3) {
                    ir9.c("PreLoadManagerNew", "parse video resource error", e3);
                    jSONObject = null;
                }
                B(f2, jSONObject, i, hashMap, h9eVar);
            } else if (h9eVar != null) {
                h9eVar.onError("ShortVideoDetail invalid");
            }
        } else if (h9eVar != null) {
            h9eVar.onError("mediaSetData invalid");
        }
    }

    public final void D(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, h9e h9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb0babb", new Object[]{this, aVar, new Integer(i), h9eVar});
        } else {
            H(new e(aVar, i, vrl.c(this.f17179a), h9eVar));
        }
    }

    public final void E() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278ae909", new Object[]{this});
        } else if (usm.g()) {
            DetailCacheData d2 = qe7.d();
            StringBuilder sb = new StringBuilder("preloadUnexposeContentInThread detailCacheData = ");
            if (d2 != null) {
                str = d2.getContentId();
            } else {
                str = "null";
            }
            sb.append(str);
            ir9.b("PreLoadManagerNew", sb.toString());
            if (d2 != null) {
                H(new d(d2, (int) hrm.a().b().b, vrl.c(this.f17179a), new c(this, d2.getMediaSetData(), d2)));
            }
        }
    }

    public void H(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86f0e0f", new Object[]{this, runnable});
        } else {
            uyr.b(runnable, 0);
        }
    }

    public final void J(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60051709", new Object[]{this, new Long(j)});
        } else if (this.g) {
            ir9.b("PreLoadManagerNew", "toLoadNext isStopped, not proceed！");
        } else {
            String str = this.m;
            if (str != null && str.length() > 0) {
                ir9.b("PreLoadManagerNew", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.m);
            } else if (!this.e || !G()) {
                ir9.a("PreLoadManagerNew", "toLoadNext preloadstatus ---> healthy --> delayMillis=" + j);
                this.q.removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = 100;
                this.q.sendMessageDelayed(obtain, j);
            }
        }
    }

    public final void v(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ba552", new Object[]{this, context});
            return;
        }
        this.q.removeMessages(100);
        Runnable runnable = this.p;
        if (runnable != null) {
            this.q.removeCallbacks(runnable);
        }
        if (!(context == null || (str = this.m) == null || str.length() <= 0)) {
            ir9.b("PreLoadManagerNew", "cancelPreload ---- mCurrentPreloadUrl = " + this.m);
            qmm.a(context, this.m);
        }
        this.n = null;
        this.m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.android.fluid.framework.data.datamodel.a w() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.cnm.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "7573dd52"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            com.taobao.android.fluid.framework.data.datamodel.a r0 = (com.taobao.android.fluid.framework.data.datamodel.a) r0
            return r0
        L_0x0015:
            com.taobao.android.fluid.core.FluidContext r2 = r8.f17179a
            java.lang.Class<com.taobao.android.fluid.framework.data.IDataService> r3 = com.taobao.android.fluid.framework.data.IDataService.class
            com.taobao.android.fluid.core.FluidService r2 = r2.getService(r3)
            com.taobao.android.fluid.framework.data.IDataService r2 = (com.taobao.android.fluid.framework.data.IDataService) r2
            java.util.List r2 = r2.getUnmodifiableMediaSetList()
            r3 = 0
            if (r2 != 0) goto L_0x0027
            return r3
        L_0x0027:
            int r4 = r8.l
        L_0x0029:
            int r4 = r4 + r1
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x0092
            boolean r5 = tb.cnm.s
            if (r5 == 0) goto L_0x0039
            int r5 = r8.i
            if (r0 >= r5) goto L_0x0092
            goto L_0x0041
        L_0x0039:
            int r5 = r8.l
            int r5 = r4 - r5
            int r6 = r8.i
            if (r5 > r6) goto L_0x0092
        L_0x0041:
            java.lang.Object r5 = r2.get(r4)     // Catch: Exception -> 0x0079
            com.taobao.android.fluid.framework.data.datamodel.a r5 = (com.taobao.android.fluid.framework.data.datamodel.a) r5     // Catch: Exception -> 0x0079
            if (r5 == 0) goto L_0x0029
            com.taobao.android.fluid.framework.data.datamodel.a$d r6 = r5.e()     // Catch: Exception -> 0x0079
            if (r6 == 0) goto L_0x0029
            com.taobao.android.fluid.framework.data.datamodel.a$d r6 = r5.e()     // Catch: Exception -> 0x0079
            boolean r6 = r6.z()     // Catch: Exception -> 0x0079
            if (r6 != 0) goto L_0x0029
            com.taobao.android.fluid.framework.data.datamodel.a$d r6 = r5.e()     // Catch: Exception -> 0x0079
            boolean r6 = r6.C()     // Catch: Exception -> 0x0079
            if (r6 == 0) goto L_0x0029
            com.taobao.android.fluid.framework.data.datamodel.a$d r6 = r5.e()     // Catch: Exception -> 0x0079
            java.lang.String r6 = r6.f()     // Catch: Exception -> 0x0079
            if (r6 == 0) goto L_0x0029
            int r0 = r0 + r1
            java.util.Set<java.lang.String> r7 = r8.c     // Catch: Exception -> 0x0079
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch: Exception -> 0x0079
            boolean r6 = r7.contains(r6)     // Catch: Exception -> 0x0079
            if (r6 != 0) goto L_0x0029
            return r5
        L_0x0079:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "findNextMedia error:"
            r6.<init>(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "PreLoadManagerNew"
            tb.ir9.b(r6, r5)
            goto L_0x0029
        L_0x0092:
            r8.e = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cnm.w():com.taobao.android.fluid.framework.data.datamodel.a");
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3988df1", new Object[]{this})).booleanValue();
        }
        if (((ILifecycleService) this.f17179a.getService(ILifecycleService.class)).getPageState() == 2) {
            return true;
        }
        return false;
    }

    public final void B(String str, JSONObject jSONObject, int i, HashMap<String, String> hashMap, h9e h9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29df3449", new Object[]{this, str, jSONObject, new Integer(i), hashMap, h9eVar});
            return;
        }
        ir9.b("PreLoadManagerNew", "preDownloadInternalWithLoop：" + str);
        if (TextUtils.isEmpty(str) || (!TextUtils.equals(str, this.n) && !((HashSet) this.c).contains(str))) {
            if (!((ArrayList) this.d).isEmpty() && !TextUtils.equals((String) ((ArrayList) this.d).get(0), str)) {
                ((ArrayList) this.d).clear();
            }
            this.p = new f(str);
            this.m = lv7.d(this.b, str, jSONObject, i, hashMap, new g(str, h9eVar));
            this.n = str;
            ir9.b("PreLoadManagerNew", "preDownloadCurrent start contentId=" + str + "；downloadSize=" + i + "；url=" + this.m);
            String str2 = this.m;
            if (str2 == null || str2.isEmpty()) {
                ir9.b("PreLoadManagerNew", str + "的 url为空，创建下载失败了，直接取消，下载下一个 ");
                if (h9eVar != null) {
                    h9eVar.onError("url is empty,down load fail");
                }
                this.q.post(this.p);
                return;
            }
            this.q.postDelayed(this.p, this.h);
            return;
        }
        ir9.b("PreLoadManagerNew", "cancel preDownloadCurrent for already downloaded, contentId:" + str);
        if (h9eVar != null) {
            h9eVar.onCancel("already downloaded");
        }
    }

    public void F(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6070263", new Object[]{this, aVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (aVar != null) {
            if (this.k != aVar) {
                this.k = aVar;
                this.e = false;
                this.b = this.f17179a.getContext();
                if (TextUtils.equals(this.n, x(aVar))) {
                    v(this.b);
                }
                List unmodifiableMediaSetList = ((IDataService) this.f17179a.getService(IDataService.class)).getUnmodifiableMediaSetList();
                if (unmodifiableMediaSetList != null) {
                    int indexOf = unmodifiableMediaSetList.indexOf(this.k);
                    this.l = indexOf;
                    if (indexOf < 0) {
                        ir9.b("PreLoadManagerNew", "progressPreDownload mPlayingIndex=-1. return");
                        return;
                    } else if (aVar.e() != null) {
                        String f2 = aVar.e().f();
                        ir9.b("PreLoadManagerNew", "preloadstatus playing mPlayingIndex=" + this.l + " ; contentid=" + f2);
                    }
                } else {
                    return;
                }
            }
            if (this.o == null) {
                this.o = new anm();
            }
            this.o.e(aVar.e().f(), i, i2, i3);
            if (this.o.c()) {
                J(0L);
            } else if (this.o.d()) {
                v(this.b);
            }
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        ir9.b("PreLoadManagerNew", "stop ---- ");
        this.g = true;
        v(this.b);
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb8fee8", new Object[]{this})).booleanValue();
        }
        List unmodifiableMediaSetList = ((IDataService) this.f17179a.getService(IDataService.class)).getUnmodifiableMediaSetList();
        if (unmodifiableMediaSetList == null || unmodifiableMediaSetList.size() == this.f) {
            return true;
        }
        ir9.b("PreLoadManagerNew", "reCheckDepthFull， 列表变化，");
        this.f = unmodifiableMediaSetList.size();
        this.e = false;
        return false;
    }
}
