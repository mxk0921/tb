package tb;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcInputStreamImpl;
import com.taobao.trtc.impl.e;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.CapturerObserver;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTextureHelper f24153a;
    public final e b;
    public ScreenCapturerAndroid c;
    public final String d;
    public final TrtcStreamConfig e;
    public TrtcInputStreamImpl f;
    public final int h;
    public final boolean i;
    public long g = 0;
    public boolean j = false;
    public final MediaProjection.Callback k = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends MediaProjection.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(mmu mmuVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcScreenInputStream$1");
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else {
                super.onStop();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements CapturerObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStarted(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
            } else {
                TrtcLog.j("TrtcScreenInputStream", "onCapturerStarted");
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("844419e9", new Object[]{this});
            } else {
                TrtcLog.j("TrtcScreenInputStream", "onCapturerStopped");
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mmu.a(mmu.this) == 0) {
                mmu.b(mmu.this, elapsedRealtime);
            } else if (!mmu.c(mmu.this) && elapsedRealtime - mmu.a(mmu.this) >= mmu.d(mmu.this)) {
                mmu.b(mmu.this, elapsedRealtime);
                mmu.e(mmu.this).m(videoFrame);
            }
            videoFrame.release();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mmu.f(mmu.this).dispose();
            mmu.g(mmu.this, null);
        }
    }

    static {
        t2o.a(395313575);
    }

    public mmu(String str, e eVar, TrtcStreamConfig trtcStreamConfig, TrtcInputStreamImpl trtcInputStreamImpl) {
        int i;
        this.h = 0;
        this.i = false;
        this.d = str;
        this.b = eVar;
        this.e = trtcStreamConfig;
        if (trtcStreamConfig.getVideoFps() > 0) {
            i = 1000 / trtcStreamConfig.getVideoFps();
        } else {
            i = 50;
        }
        this.h = i;
        if (trtcInputStreamImpl != null) {
            this.f = trtcInputStreamImpl;
            return;
        }
        this.i = true;
        this.f = new TrtcInputStreamImpl(eVar, str, trtcStreamConfig);
    }

    public static /* synthetic */ long a(mmu mmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb25df09", new Object[]{mmuVar})).longValue();
        }
        return mmuVar.g;
    }

    public static /* synthetic */ long b(mmu mmuVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ce9c681", new Object[]{mmuVar, new Long(j)})).longValue();
        }
        mmuVar.g = j;
        return j;
    }

    public static /* synthetic */ boolean c(mmu mmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eb0fcda", new Object[]{mmuVar})).booleanValue();
        }
        return mmuVar.j;
    }

    public static /* synthetic */ int d(mmu mmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("823c1a8a", new Object[]{mmuVar})).intValue();
        }
        return mmuVar.h;
    }

    public static /* synthetic */ TrtcInputStreamImpl e(mmu mmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("e54e40d0", new Object[]{mmuVar});
        }
        return mmuVar.f;
    }

    public static /* synthetic */ SurfaceTextureHelper f(mmu mmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("a5863df7", new Object[]{mmuVar});
        }
        return mmuVar.f24153a;
    }

    public static /* synthetic */ SurfaceTextureHelper g(mmu mmuVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("e7c24951", new Object[]{mmuVar, surfaceTextureHelper});
        }
        mmuVar.f24153a = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.f;
        if (trtcInputStreamImpl != null) {
            if (this.i) {
                trtcInputStreamImpl.k();
            }
            this.f = null;
        }
        ScreenCapturerAndroid screenCapturerAndroid = this.c;
        if (screenCapturerAndroid != null) {
            screenCapturerAndroid.resetCapturerObserver();
            this.c.stopCapture();
            this.c.dispose();
            this.c = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.f24153a;
        if (!(surfaceTextureHelper == null || surfaceTextureHelper.getHandler() == null)) {
            this.f24153a.getHandler().post(new c());
        }
        TrtcLog.j("TrtcScreenInputStream", "screen capture dispose done");
    }

    public ITrtcInputStream i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("6f3d0c12", new Object[]{this});
        }
        return this.f;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ae2f7", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        ScreenCapturerAndroid screenCapturerAndroid = this.c;
        if (screenCapturerAndroid != null) {
            screenCapturerAndroid.stopCapture();
            this.c = null;
        }
        TrtcLog.j("TrtcScreenInputStream", "screen capture stop done");
    }

    public void k(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcfe4a6", new Object[]{this, intent});
            return;
        }
        jju.b("ScreenInputStream start error for ref is null", this.d, this.b);
        this.g = 0L;
        try {
            if (this.f24153a == null) {
                this.f24153a = SurfaceTextureHelper.create("STH-SCREEN-" + this.d, this.b.l());
            }
        } catch (Exception e) {
            tmu.f("TrtcScreenInputStream", "start screen input stream, error: " + e.getMessage());
        }
        if (intent != null && this.c == null) {
            ScreenCapturerAndroid screenCapturerAndroid = new ScreenCapturerAndroid(intent, this.k);
            this.c = screenCapturerAndroid;
            screenCapturerAndroid.initialize(this.f24153a, rlu.f27461a, (CapturerObserver) new b());
        }
        this.c.startCapture(this.e.getVideoWidth(), this.e.getVideoHeight(), this.e.getVideoFps(), 2);
    }
}
