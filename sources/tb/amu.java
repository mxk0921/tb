package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.c;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.video_remoteso.VideoRemoteSo;
import com.taobao.video_remoteso.api.LoadCallback;
import com.taobao.video_remoteso.api.LoadResult;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.NativeLibrary;
import org.webrtc.NativeLibraryLoader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class amu implements NativeLibraryLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static amu f15860a;
    public static List<d3e> e;
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static final AtomicBoolean h = new AtomicBoolean(false);
    public static final AtomicBoolean i = new AtomicBoolean(false);

    static {
        t2o.a(395313335);
        t2o.a(395313791);
    }

    public static synchronized void g(boolean z) {
        synchronized (amu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc2293a3", new Object[]{new Boolean(z)});
            } else {
                f.set(z);
            }
        }
    }

    public static synchronized amu h() {
        synchronized (amu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (amu) ipChange.ipc$dispatch("66852fad", new Object[0]);
            }
            if (f15860a == null) {
                cmu.g();
                e = new LinkedList();
                amu amuVar = new amu();
                f15860a = amuVar;
                amuVar.load("artc_engine");
            }
            return f15860a;
        }
    }

    public static /* synthetic */ void i(LoadResult loadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784f9a32", new Object[]{loadResult});
            return;
        }
        h.set(true);
        g.set(false);
        if (loadResult.isLoadSuccess()) {
            TrtcLog.j("TrtcNativeLoader", "RemoteSo load success(avcodec), " + loadResult.toString());
            i.set(true);
            return;
        }
        TrtcLog.j("TrtcNativeLoader", "RemoteSo load fail(avcodec), " + loadResult.toString());
    }

    public static /* synthetic */ void j(l6h l6hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae99db3f", new Object[]{l6hVar});
            return;
        }
        h.set(true);
        g.set(false);
        if (l6hVar.i()) {
            TrtcLog.j("TrtcNativeLoader", "RemoteSo load success(avcodec), " + l6hVar.toString());
            i.set(true);
            return;
        }
        TrtcLog.j("TrtcNativeLoader", "RemoteSo load fail(avcodec), " + l6hVar.toString());
    }

    public static synchronized void o(int i2, String str) {
        synchronized (amu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a90c9aa0", new Object[]{new Integer(i2), str});
                return;
            }
            for (d3e d3eVar : e) {
                if (i2 == 0) {
                    d3eVar.onReady();
                } else {
                    d3eVar.onError(i2, str);
                }
            }
        }
    }

    public synchronized void e(d3e d3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72f2047", new Object[]{this, d3eVar});
            return;
        }
        if (d3eVar != null) {
            if (d.get()) {
                d3eVar.onReady();
            }
            ((LinkedList) e).add(d3eVar);
            f15860a.load("artc_engine");
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29d6e84a", new Object[]{this})).booleanValue();
        }
        if (!h.get()) {
            AtomicBoolean atomicBoolean = g;
            if (!atomicBoolean.get()) {
                atomicBoolean.compareAndSet(false, true);
                if (cmu.b(rlu.TRTC_ORANGE_DEF_BOOL_ENABLE_VIDEO_REMOTE_SO, true)) {
                    VideoRemoteSo.loadAsync("avcodec", new LoadCallback() { // from class: tb.ylu
                        @Override // com.taobao.video_remoteso.api.LoadCallback
                        public final void onLoadFinished(LoadResult loadResult) {
                            amu.i(loadResult);
                        }
                    });
                } else {
                    bzn.d().a("avcodec", new u5h() { // from class: tb.zlu
                        @Override // tb.u5h
                        public final void onLoadFinished(l6h l6hVar) {
                            amu.j(l6hVar);
                        }
                    });
                }
                return i.get();
            }
        }
        return i.get();
    }

    @Override // org.webrtc.NativeLibraryLoader
    public synchronized boolean load(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6772aefb", new Object[]{this, str})).booleanValue();
        } else if (c.get()) {
            StringBuilder sb = new StringBuilder("artc so load over, result: ");
            AtomicBoolean atomicBoolean = d;
            sb.append(atomicBoolean.get());
            TrtcLog.j("TrtcNativeLoader", sb.toString());
            return atomicBoolean.get();
        } else {
            AtomicBoolean atomicBoolean2 = b;
            if (atomicBoolean2.get()) {
                StringBuilder sb2 = new StringBuilder("artc so loadding, result: ");
                AtomicBoolean atomicBoolean3 = d;
                sb2.append(atomicBoolean3.get());
                TrtcLog.j("TrtcNativeLoader", sb2.toString());
                return atomicBoolean3.get();
            } else if (!f.get() || f()) {
                atomicBoolean2.compareAndSet(false, true);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (cmu.b(rlu.TRTC_ORANGE_DEF_BOOL_ENABLE_VIDEO_REMOTE_SO, true)) {
                    VideoRemoteSo.loadAsync(str, new LoadCallback() { // from class: tb.wlu
                        @Override // com.taobao.video_remoteso.api.LoadCallback
                        public final void onLoadFinished(LoadResult loadResult) {
                            amu.this.k(elapsedRealtime, str, loadResult);
                        }
                    });
                } else {
                    bzn.d().a(str, new u5h() { // from class: tb.xlu
                        @Override // tb.u5h
                        public final void onLoadFinished(l6h l6hVar) {
                            amu.this.l(elapsedRealtime, str, l6hVar);
                        }
                    });
                }
                return d.get();
            } else {
                TrtcLog.j("TrtcNativeLoader", "avcodec so load fail or loadding");
                return false;
            }
        }
    }

    public final boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd5653f0", new Object[]{this, str})).booleanValue();
        }
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable th) {
            TrtcLog.i("TrtcNativeLoader", "Failed to load native library: " + str + ", error: " + th.getMessage());
            return false;
        }
    }

    public synchronized boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50840248", new Object[]{this})).booleanValue();
        }
        f15860a.load("artc_engine");
        return d.get();
    }

    public final void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ff70ff", new Object[]{this, new Long(j)});
            return;
        }
        c.f13894a = (int) (SystemClock.elapsedRealtime() - j);
        TrtcLog.j("TrtcNativeLoader", "ARTC load success, elpased: " + c.f13894a);
        d.set(true);
        o(0, "");
        NativeLibrary.onLoadResult(true);
    }

    public final /* synthetic */ void k(long j, String str, LoadResult loadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f2ed39", new Object[]{this, new Long(j), str, loadResult});
            return;
        }
        c.set(true);
        b.set(false);
        if (loadResult.isLoadSuccess()) {
            TrtcLog.j("TrtcNativeLoader", "VideoRemoteSo load success, " + loadResult.toString());
            p(j);
            return;
        }
        TrtcLog.j("TrtcNativeLoader", "VideoRemoteSo load fail, " + loadResult.toString());
        if (m(str)) {
            p(j);
        } else if (loadResult.getException() != null) {
            o(loadResult.getException().getErrorCode(), loadResult.getException().getErrorMsg());
        } else {
            o(-1, "unkown");
        }
    }

    public final /* synthetic */ void l(long j, String str, l6h l6hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7dd7fa", new Object[]{this, new Long(j), str, l6hVar});
            return;
        }
        c.set(true);
        b.set(false);
        if (l6hVar.i()) {
            TrtcLog.j("TrtcNativeLoader", "RemoteSo load success, " + l6hVar.toString());
            p(j);
            return;
        }
        TrtcLog.j("TrtcNativeLoader", "RemoteSo load fail, " + l6hVar.toString());
        if (m(str)) {
            p(j);
        } else if (l6hVar.c() != null) {
            o(l6hVar.c().getErrorCode(), l6hVar.c().getErrorMsg());
        } else {
            o(-1, "unkown");
        }
    }
}
