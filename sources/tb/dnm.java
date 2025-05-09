package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dnm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_PREDOWNLOAD_SIZE = 1.0f;
    public static final HashMap<dh7, dnm> u = new HashMap<>();
    public boolean d;
    public boolean f;
    public final dh7 n;
    public String o;
    public String p;
    public Runnable s;
    public final Set<String> b = new HashSet();
    public final List<String> c = new ArrayList(3);
    public int e = 0;
    public boolean g = false;
    public final int h = 5000;
    public int i = 3;
    public float j = -1.0f;
    public final Handler t = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/media/preload/PreLoadManagerNew$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (dnm.a(dnm.this)) {
                txj.e("PreLoadManagerNew", "handleMessage isStopped, not preload！");
            } else if (dnm.b(dnm.this) == null || !dnm.b(dnm.this).d()) {
                txj.a("PreLoadManagerNew", "handleMessage---");
                g9e e = dnm.e(dnm.this);
                if (e != null && e.isDataValid()) {
                    dnm dnmVar = dnm.this;
                    dnmVar.t(dnm.f(dnmVar), e);
                }
            } else {
                txj.e("PreLoadManagerNew", "handleMessage isPoor not preload！");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17970a;
        public final /* synthetic */ Context b;

        public b(String str, Context context) {
            this.f17970a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            txj.e("PreLoadManagerNew", "预下载超时了。取消当前视频，下载下一个");
            if (TextUtils.equals(dnm.g(dnm.this), this.f17970a)) {
                dnm.i(dnm.this, this.b);
                dnm.h(dnm.this, null);
                dnm.j(dnm.this, null);
                if (dnm.k(dnm.this) != null) {
                    if (dnm.k(dnm.this).size() <= 0 || !TextUtils.equals((CharSequence) dnm.k(dnm.this).get(0), this.f17970a)) {
                        dnm.k(dnm.this).add(this.f17970a);
                    } else {
                        dnm.l(dnm.this).add(this.f17970a);
                        dnm.k(dnm.this).clear();
                    }
                }
            }
            dnm.m(dnm.this, 500L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17971a;

        public c(String str) {
            this.f17971a = str;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            txj.e("PreLoadManagerNew", "preDownloadCurrent =====>" + this.f17971a + " onfinish size=" + i);
            dnm.d(dnm.this).removeCallbacks(dnm.c(dnm.this));
            if (i > 0) {
                dnm.l(dnm.this).add(this.f17971a);
            }
            if (TextUtils.equals(dnm.g(dnm.this), this.f17971a)) {
                dnm.h(dnm.this, null);
                dnm.j(dnm.this, null);
            }
            dnm.m(dnm.this, 500L);
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            txj.a("PreLoadManagerNew", "preDownloadCurrent ------" + this.f17971a + " onProgress。 i = " + i);
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            }
        }
    }

    static {
        t2o.a(352321671);
    }

    public dnm(dh7 dh7Var) {
        this.n = dh7Var;
        r();
    }

    public static /* synthetic */ boolean a(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("685f7b7d", new Object[]{dnmVar})).booleanValue();
        }
        return dnmVar.f;
    }

    public static /* synthetic */ bnm b(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnm) ipChange.ipc$dispatch("cf703648", new Object[]{dnmVar});
        }
        dnmVar.getClass();
        return null;
    }

    public static /* synthetic */ Runnable c(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5b7ce1ec", new Object[]{dnmVar});
        }
        return dnmVar.s;
    }

    public static /* synthetic */ Handler d(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e35aa83d", new Object[]{dnmVar});
        }
        return dnmVar.t;
    }

    public static /* synthetic */ g9e e(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g9e) ipChange.ipc$dispatch("5f727ddb", new Object[]{dnmVar});
        }
        return dnmVar.o();
    }

    public static /* synthetic */ Context f(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f7f61a34", new Object[]{dnmVar});
        }
        dnmVar.getClass();
        return null;
    }

    public static /* synthetic */ String g(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70f19dc3", new Object[]{dnmVar});
        }
        return dnmVar.p;
    }

    public static /* synthetic */ String h(dnm dnmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2112d437", new Object[]{dnmVar, str});
        }
        dnmVar.p = str;
        return str;
    }

    public static /* synthetic */ void i(dnm dnmVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84148bca", new Object[]{dnmVar, context});
        } else {
            dnmVar.n(context);
        }
    }

    public static /* synthetic */ String j(dnm dnmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6dc1275", new Object[]{dnmVar, str});
        }
        dnmVar.o = str;
        return str;
    }

    public static /* synthetic */ List k(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5c65d607", new Object[]{dnmVar});
        }
        return dnmVar.c;
    }

    public static /* synthetic */ Set l(dnm dnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f8f0abb0", new Object[]{dnmVar});
        }
        return dnmVar.b;
    }

    public static /* synthetic */ void m(dnm dnmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c43842", new Object[]{dnmVar, new Long(j)});
        } else {
            dnmVar.x(j);
        }
    }

    public static dnm p(dh7 dh7Var) {
        dnm dnmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnm) ipChange.ipc$dispatch("2d4f96eb", new Object[]{dh7Var});
        }
        HashMap<dh7, dnm> hashMap = u;
        dnm dnmVar2 = hashMap.get(dh7Var);
        if (dnmVar2 != null) {
            return dnmVar2;
        }
        synchronized (dnm.class) {
            try {
                dnmVar = hashMap.get(dh7Var);
                if (dnmVar == null) {
                    dnmVar = new dnm(dh7Var);
                    hashMap.put(dh7Var, dnmVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dnmVar;
    }

    public final void n(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ba552", new Object[]{this, context});
            return;
        }
        this.t.removeMessages(100);
        this.t.removeCallbacks(this.s);
        if (!(context == null || (str = this.o) == null || str.length() <= 0)) {
            txj.e("PreLoadManagerNew", "cancelPreload ---- mCurrentPreloadUrl = " + this.o);
            qmm.a(context, this.o);
        }
        this.p = null;
        this.o = null;
    }

    public final void x(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60051709", new Object[]{this, new Long(j)});
        } else if (this.f) {
            txj.e("PreLoadManagerNew", "toLoadNext isStopped, not proceed！");
        } else {
            String str = this.o;
            if (str != null && str.length() > 0) {
                txj.e("PreLoadManagerNew", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.o);
            } else if (!this.d || !v()) {
                txj.a("PreLoadManagerNew", "toLoadNext preloadstatus ---> healthy --> delayMillis=" + j);
                this.t.removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = 100;
                this.t.sendMessageDelayed(obtain, j);
            }
        }
    }

    public final g9e o() {
        List<x3w> K;
        g9e A0;
        String h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g9e) ipChange.ipc$dispatch("412c705f", new Object[]{this});
        }
        dh7 dh7Var = this.n;
        if (dh7Var == null || (K = dh7Var.K()) == null) {
            return null;
        }
        int i = 1;
        while (i <= this.i && i < K.size()) {
            if (K.get(i) instanceof ue7) {
                ue7 ue7Var = (ue7) K.get(i);
                if (ue7Var == null || (A0 = ue7Var.A0()) == null || !"video".equals(A0.getType()) || (h = A0.h()) == null || ((HashSet) this.b).contains(h)) {
                    i++;
                } else {
                    txj.a("PreLoadManagerNew", "-----> findNextMedia preloadstatus mPlayingIndex=0 index=" + i + " contentId=" + h + " mHasDownloadSet=" + this.b);
                    return A0;
                }
            }
        }
        this.d = true;
        return null;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c251871e", new Object[]{this});
            return;
        }
        this.g = true;
        this.i = 3;
        this.j = 0.8f;
        bnm.e = 6.0f;
        bnm.f = 3.0f;
        txj.e(mer.TAG, "PreLoadManagerNew abparams isABNewEnable=" + this.g + " queueDepth=" + this.i + " preDownloadSize=" + this.j + " healthBufferLevel=" + bnm.e + " poorBufferLevel=" + bnm.f);
        if (this.j <= 0.0f) {
            this.j = 1.0f;
        }
    }

    public void t(Context context, g9e g9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22bc41d", new Object[]{this, context, g9eVar});
        } else if (g9eVar != null && g9eVar.isDataValid()) {
            String h = g9eVar.h();
            JSONObject g = g9eVar.g();
            if (g != null || this.j >= 0.0f) {
                List<String> list = this.c;
                if (list != null && ((ArrayList) list).size() > 0 && !TextUtils.equals((String) ((ArrayList) this.c).get(0), h)) {
                    ((ArrayList) this.c).clear();
                }
                this.s = new b(h, context);
                int i = (int) (this.j * 1024.0f * 1024.0f);
                HashMap hashMap = new HashMap();
                hashMap.put("from", g9eVar.a());
                hashMap.put(a7m.VIDEO_PLAY_SCENES, g9eVar.i());
                String k = qmm.k(context, g, i, new c(h), hashMap);
                this.o = k;
                this.p = h;
                txj.e("PreLoadManagerNew", "preDownloadCurrent start " + h + "downloadSize=" + i + "url=" + k);
                if (k == null || k.length() <= 0) {
                    txj.e("PreLoadManagerNew", h + "url为空，创建下载失败了，直接取消，下载下一个 ");
                    ((b) this.s).run();
                    return;
                }
                this.t.postDelayed(this.s, this.h);
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        txj.e("PreLoadManagerNew", "stop ---- ");
        this.f = true;
        n(null);
        u.remove(this.n);
    }

    public final boolean v() {
        List<x3w> K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb8fee8", new Object[]{this})).booleanValue();
        }
        dh7 dh7Var = this.n;
        if (dh7Var == null || (K = dh7Var.K()) == null || K.size() == this.e) {
            return true;
        }
        txj.e("PreLoadManagerNew", "reCheckDepthFull， 列表变化，");
        this.e = K.size();
        this.d = false;
        return false;
    }
}
