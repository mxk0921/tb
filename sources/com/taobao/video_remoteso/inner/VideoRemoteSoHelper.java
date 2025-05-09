package com.taobao.video_remoteso.inner;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.video_remoteso.api.FetchCallback;
import com.taobao.video_remoteso.api.FetchResult;
import com.taobao.video_remoteso.api.LoadCallback;
import com.taobao.video_remoteso.api.LoadResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b79;
import tb.bzn;
import tb.jcq;
import tb.qqt;
import tb.t2o;
import tb.y69;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoRemoteSoHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile VideoRemoteSoHelper h;
    public static ExecutorService i = null;
    public Handler e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, CopyOnWriteArrayList<FetchCallback>> f14099a = new ConcurrentHashMap();
    public final Map<String, CopyOnWriteArrayList<LoadCallback>> b = new ConcurrentHashMap();
    public final Set<String> c = Collections.synchronizedSet(new HashSet());
    public final Map<String, g> d = new ConcurrentHashMap();
    public volatile AtomicBoolean f = new AtomicBoolean(false);
    public final Object g = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "remoteSo_thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(VideoRemoteSoHelper videoRemoteSoHelper) {
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else {
                VideoRemoteSoHelper.b(VideoRemoteSoHelper.a(), b79Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(VideoRemoteSoHelper videoRemoteSoHelper) {
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else {
                VideoRemoteSoHelper.b(VideoRemoteSoHelper.a(), b79Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(VideoRemoteSoHelper videoRemoteSoHelper) {
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else {
                VideoRemoteSoHelper.b(VideoRemoteSoHelper.a(), b79Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(VideoRemoteSoHelper videoRemoteSoHelper) {
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else {
                VideoRemoteSoHelper.b(VideoRemoteSoHelper.a(), b79Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f14100a;
        public String b;
        public String c;
        public String d;

        static {
            t2o.a(968884238);
        }

        public f(String str, String str2, String str3, String str4) {
            this.f14100a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(968884240);
        }

        public h(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/video_remoteso/inner/VideoRemoteSoHelper$NofifyFetchCallbackRunnable");
        }

        @Override // com.taobao.video_remoteso.inner.VideoRemoteSoHelper.f, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VideoRemoteSoHelper.d(VideoRemoteSoHelper.this, this.f14100a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(968884241);
        }

        public i(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/video_remoteso/inner/VideoRemoteSoHelper$NofifyLoadCallbackRunnable");
        }

        @Override // com.taobao.video_remoteso.inner.VideoRemoteSoHelper.f, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VideoRemoteSoHelper.c(VideoRemoteSoHelper.this, this.f14100a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(968884232);
    }

    public static /* synthetic */ VideoRemoteSoHelper a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoRemoteSoHelper) ipChange.ipc$dispatch("d1aa790d", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ void b(VideoRemoteSoHelper videoRemoteSoHelper, b79 b79Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8219015", new Object[]{videoRemoteSoHelper, b79Var});
        } else {
            videoRemoteSoHelper.q(b79Var);
        }
    }

    public static /* synthetic */ void c(VideoRemoteSoHelper videoRemoteSoHelper, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c6d93", new Object[]{videoRemoteSoHelper, str, str2, str3, str4});
        } else {
            videoRemoteSoHelper.v(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void d(VideoRemoteSoHelper videoRemoteSoHelper, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37f1f2", new Object[]{videoRemoteSoHelper, str, str2, str3, str4});
        } else {
            videoRemoteSoHelper.s(str, str2, str3, str4);
        }
    }

    public static ExecutorService e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("3f7b53ee", new Object[0]);
        }
        ExecutorService o = o(new a());
        i = o;
        return o;
    }

    public static VideoRemoteSoHelper h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoRemoteSoHelper) ipChange.ipc$dispatch("c8b9f667", new Object[0]);
        }
        if (h == null) {
            synchronized (VideoRemoteSoHelper.class) {
                try {
                    if (h == null) {
                        h = new VideoRemoteSoHelper();
                        h.i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    private static native boolean loadFFmpegDecoder(String str);

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
            return;
        }
        AdapterForTLog.loge("AVSDK-remote", str2);
        Log.e("AVSDK-remote", str2);
    }

    public static ExecutorService o(qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("4cd513a1", new Object[]{qqtVar});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.newSingleThreadExecutor(qqtVar);
        threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public void f(String str, FetchCallback fetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700f211a", new Object[]{this, str, fetchCallback});
            return;
        }
        boolean contains = this.c.contains(str);
        n("AVSDK-remote", "fetchAsync " + contains + ", " + str + ", " + fetchCallback);
        if (contains) {
            g gVar = (g) ((ConcurrentHashMap) this.d).get(str);
            if (gVar.c) {
                fetchCallback.onFetchFinished(new FetchResult(str, gVar.b));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.f14099a).get(str);
            copyOnWriteArrayList.add(fetchCallback);
            ((ConcurrentHashMap) this.f14099a).put(str, copyOnWriteArrayList);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208b843d", new Object[]{this});
            return;
        }
        bzn.b().b("avcodec", new b(this));
        bzn.b().b("artc_engine", new c(this));
        bzn.b().b("s266dec", new d(this));
        bzn.b().b("VPM", new e(this));
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        n("AVSDK-remote", this + " fetchSo init");
        j();
        g();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cafc0fe", new Object[]{this});
            return;
        }
        this.c.add("artc_engine");
        this.c.add("avcodec");
        this.c.add("s266dec");
        this.c.add("VPM");
        for (String str : this.c) {
            ((ConcurrentHashMap) this.f14099a).put(str, new CopyOnWriteArrayList());
            ((ConcurrentHashMap) this.b).put(str, new CopyOnWriteArrayList());
            g gVar = new g(this, null);
            gVar.f14101a = str;
            gVar.b = "lib" + str + jcq.SO_EXTENSION;
            ((ConcurrentHashMap) this.d).put(str, gVar);
        }
        this.e = new Handler(Looper.getMainLooper());
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public void l(String str, LoadCallback loadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa7fa00", new Object[]{this, str, loadCallback});
            return;
        }
        boolean contains = this.c.contains(str);
        n("AVSDK-remote", "loadAsync " + contains + ", " + str + ", " + loadCallback);
        if (!contains) {
            return;
        }
        if (((g) ((ConcurrentHashMap) this.d).get(str)).c) {
            loadCallback.onLoadFinished(new LoadResult(str));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.b).get(str);
        copyOnWriteArrayList.add(loadCallback);
        ((ConcurrentHashMap) this.b).put(str, copyOnWriteArrayList);
    }

    public final void p(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b41a5d", new Object[]{this, gVar});
            return;
        }
        String str = gVar.f14101a;
        String str2 = gVar.b;
        String str3 = gVar.d;
        String str4 = gVar.e;
        if (r(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRunInThreadRemote2", "true"))) {
            n("AVSDK-remote", "EnableRunInThreadRemote2 is true ");
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                u(new i(str, str2, str3, str4));
            } else {
                v(str, str2, str3, str4);
            }
        } else {
            t(new i(str, str2, str3, str4));
            t(new h(str, str2, str3, str4));
        }
    }

    public final void q(b79 b79Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            return;
        }
        n("AVSDK-remote", this + " fetchSo onFetchFinished " + b79Var);
        if (b79Var.i() && ((ConcurrentHashMap) this.d).containsKey(b79Var.e())) {
            String e2 = b79Var.e();
            String d2 = b79Var.d();
            g gVar = (g) ((ConcurrentHashMap) this.d).get(e2);
            gVar.c = false;
            gVar.e = b79Var.g();
            gVar.d = b79Var.f();
            gVar.b = d2;
            ((ConcurrentHashMap) this.d).put(e2, gVar);
            p(gVar);
        }
    }

    public final void s(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb4a803", new Object[]{this, str, str2, str3, str4});
            return;
        }
        synchronized (this.g) {
            try {
                if (!((g) ((ConcurrentHashMap) this.d).get(str)).c) {
                    n("AVSDK-remote", "runFetchCallback fail " + str + ", " + str2);
                    return;
                }
                FetchResult fetchResult = new FetchResult(str, str2);
                fetchResult.setVersion(str3, str4);
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.f14099a).get(str);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((FetchCallback) it.next()).onFetchFinished(fetchResult);
                    }
                    copyOnWriteArrayList.clear();
                    ((ConcurrentHashMap) this.f14099a).put(str, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{this, runnable});
        } else if (k()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    public final void u(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bea81f", new Object[]{this, runnable});
            return;
        }
        if (i == null) {
            i = e();
        }
        i.execute(runnable);
    }

    public final void v(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4c4e8", new Object[]{this, str, str2, str3, str4});
            return;
        }
        synchronized (this.g) {
            try {
                n("AVSDK-remote", "NofifyLoadCallbackRunnable run " + str + ", " + str2 + ", size=" + ((ConcurrentHashMap) this.b).size());
                if (str.equals("artc_engine")) {
                    System.load(str2);
                } else if (str.equals("avcodec")) {
                    if (!m()) {
                        n("AVSDK-remote", "NofifyLoadCallbackRunnable load avcodec_jni error");
                    } else if (!loadFFmpegDecoder(str2)) {
                        n("AVSDK-remote", "NofifyLoadCallbackRunnable load avcodec error");
                    }
                    return;
                } else if (!str.equals("s266dec")) {
                    if (str.equals("VPM")) {
                        System.load(str2);
                    }
                    return;
                }
                g gVar = (g) ((ConcurrentHashMap) this.d).get(str);
                gVar.c = true;
                ((ConcurrentHashMap) this.d).put(str, gVar);
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.b).get(str);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    LoadResult loadResult = new LoadResult(str);
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((LoadCallback) it.next()).onLoadFinished(loadResult);
                    }
                    copyOnWriteArrayList.clear();
                    ((ConcurrentHashMap) this.b).put(str, copyOnWriteArrayList);
                }
                if (r(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRunInThreadRemote2", "true"))) {
                    if (!((g) ((ConcurrentHashMap) this.d).get(str)).c) {
                        n("AVSDK-remote", "runFetchCallback fail " + str + ", " + str2);
                        return;
                    }
                    FetchResult fetchResult = new FetchResult(str, str2);
                    fetchResult.setVersion(str3, str4);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.f14099a).get(str);
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator it2 = copyOnWriteArrayList2.iterator();
                        while (it2.hasNext()) {
                            ((FetchCallback) it2.next()).onFetchFinished(fetchResult);
                        }
                        copyOnWriteArrayList2.clear();
                        ((ConcurrentHashMap) this.f14099a).put(str, copyOnWriteArrayList2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a880bff", new Object[]{this})).booleanValue();
        }
        if (!this.f.get()) {
            try {
                System.loadLibrary("avcodec_jni");
                this.f.set(true);
            } catch (Throwable th) {
                n("AVSDK-remote", "loadLibrariesOnce loadLibrary fail ---" + th.getMessage() + " " + th.getStackTrace());
                return false;
            }
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public String f14101a;
        public String b;
        public boolean c;
        public String d;
        public String e;

        static {
            t2o.a(968884239);
        }

        public g(VideoRemoteSoHelper videoRemoteSoHelper) {
            this.f14101a = "";
            this.b = "";
            this.c = false;
            this.d = "";
            this.e = "";
        }

        public /* synthetic */ g(VideoRemoteSoHelper videoRemoteSoHelper, a aVar) {
            this(videoRemoteSoHelper);
        }
    }
}
