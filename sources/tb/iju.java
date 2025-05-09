package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcInputStreamImpl;
import com.taobao.trtc.impl.e;
import com.taobao.trtc.utils.TrtcLog;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iju implements CapturerObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTextureHelper f21354a;
    public final e b;
    public VideoCapturer c;
    public SurfaceViewRenderer d;
    public final String g;
    public final TrtcStreamConfig i;
    public TrtcInputStreamImpl j;
    public final boolean k;
    public TrtcInputStreamImpl l;
    public lju m;
    public final Object e = new Object();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final String h = "LocalVideoSub";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements CameraVideoCapturer.CameraEventsHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("128938f7", new Object[]{this});
                return;
            }
            TrtcLog.j("CameraInputStream", "camera closed");
            iju.a(iju.this).i().n1();
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14a23346", new Object[]{this});
                return;
            }
            TrtcLog.j("CameraInputStream", "camera disconnect");
            iju.a(iju.this).i().o1();
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e259615", new Object[]{this, str});
                return;
            }
            tmu.f("CameraInputStream", "open camera error: " + str);
            iju.a(iju.this).i().r1(str);
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraFreezed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c3133fa", new Object[]{this, str});
                return;
            }
            tmu.f("CameraInputStream", "camera freeze: " + str);
            iju.a(iju.this).i().q1(str, "pri");
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226fce65", new Object[]{this, str});
                return;
            }
            TrtcLog.j("CameraInputStream", "Camera: " + str + " opening");
            iju.a(iju.this).i().s1(str);
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public int onCameraPreview(int i, int i2, int i3, float[] fArr, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd25e54", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), fArr, new Long(j)})).intValue();
            }
            return 0;
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onFirstFrameAvailable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf76454", new Object[]{this});
                return;
            }
            TrtcLog.j("CameraInputStream", "camera first frame available");
            iju.a(iju.this).i().p1();
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public int onCameraPreview(ByteBuffer byteBuffer, AConstants.ColorSpace colorSpace, int i, int i2, int i3, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cc3a2aa7", new Object[]{this, byteBuffer, colorSpace, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)})).intValue();
            }
            return 0;
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
                TrtcLog.j("CameraInputStream", "PRI onCapturerStarted");
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("844419e9", new Object[]{this});
            } else {
                TrtcLog.j("CameraInputStream", "PRI onCapturerStopped");
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
                return;
            }
            synchronized (iju.b(iju.this)) {
                try {
                    if (iju.c(iju.this) != null) {
                        iju.c(iju.this).onFrame(videoFrame);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iju.d(iju.this) != null) {
                iju.d(iju.this).m(videoFrame);
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
            iju.e(iju.this).dispose();
            iju.f(iju.this, null);
        }
    }

    static {
        t2o.a(395313495);
        t2o.a(395313734);
    }

    public iju(String str, e eVar, TrtcStreamConfig trtcStreamConfig, TrtcInputStreamImpl trtcInputStreamImpl) {
        this.g = str;
        this.i = trtcStreamConfig;
        this.b = eVar;
        if (trtcInputStreamImpl != null) {
            this.j = trtcInputStreamImpl;
            this.k = false;
            return;
        }
        this.j = new TrtcInputStreamImpl(eVar, str, trtcStreamConfig);
        this.k = true;
    }

    public static /* synthetic */ e a(iju ijuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ac75573", new Object[]{ijuVar});
        }
        return ijuVar.b;
    }

    public static /* synthetic */ Object b(iju ijuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8e9a8743", new Object[]{ijuVar});
        }
        return ijuVar.e;
    }

    public static /* synthetic */ SurfaceViewRenderer c(iju ijuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceViewRenderer) ipChange.ipc$dispatch("7eee7277", new Object[]{ijuVar});
        }
        return ijuVar.d;
    }

    public static /* synthetic */ TrtcInputStreamImpl d(iju ijuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("b721e1f7", new Object[]{ijuVar});
        }
        return ijuVar.j;
    }

    public static /* synthetic */ SurfaceTextureHelper e(iju ijuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("80ac64f0", new Object[]{ijuVar});
        }
        return ijuVar.f21354a;
    }

    public static /* synthetic */ SurfaceTextureHelper f(iju ijuVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("b45ea578", new Object[]{ijuVar, surfaceTextureHelper});
        }
        ijuVar.f21354a = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public final TrtcInputStreamImpl g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("309bcb51", new Object[]{this, str});
        }
        if (this.l == null) {
            this.l = new TrtcInputStreamImpl(this.b, str, new TrtcStreamConfig.a().f(360, 640, 20).d(true).a());
        }
        return this.l;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        try {
            TrtcInputStreamImpl trtcInputStreamImpl = this.l;
            if (trtcInputStreamImpl != null) {
                trtcInputStreamImpl.k();
                this.l = null;
            }
            TrtcInputStreamImpl trtcInputStreamImpl2 = this.j;
            if (trtcInputStreamImpl2 != null && this.k) {
                trtcInputStreamImpl2.k();
                this.j = null;
            }
            VideoCapturer videoCapturer = this.c;
            if (videoCapturer != null) {
                videoCapturer.resetCapturerObserver();
                this.c.stopCapture();
                this.c.dispose();
                this.c = null;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.f21354a;
            if (surfaceTextureHelper != null && surfaceTextureHelper.getHandler() != null) {
                this.f21354a.getHandler().post(new c());
            }
        } catch (InterruptedException e) {
            tmu.f("CameraInputStream", "release video capture error: " + e.getMessage());
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20499eae", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoCapturer videoCapturer = this.c;
        if (videoCapturer != null) {
            videoCapturer.enableBeautyProcess(z);
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12f08f4", new Object[]{this, new Boolean(z)});
        } else if (this.c != null) {
            TrtcLog.j("CameraInputStream", "enable mix: " + z);
            ((CameraVideoCapturer) this.c).setNeedMix(z);
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoCapturer videoCapturer = this.c;
        if (videoCapturer != null) {
            videoCapturer.enableTorch(z);
        }
    }

    public ITrtcInputStream l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("df298ad", new Object[]{this});
        }
        return this.j;
    }

    public CameraVideoCapturer m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer) ipChange.ipc$dispatch("e62087bd", new Object[]{this});
        }
        if (this.f.get()) {
            return (CameraVideoCapturer) this.c;
        }
        return null;
    }

    public ITrtcInputStream n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("fba739c6", new Object[]{this});
        }
        return g(this.h);
    }

    public void o(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543e2ce2", new Object[]{this, str, bArr, new Integer(i)});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.j;
        if (trtcInputStreamImpl == null || !trtcInputStreamImpl.f13926a.equals(str)) {
            TrtcInputStreamImpl trtcInputStreamImpl2 = this.l;
            if (trtcInputStreamImpl2 != null && trtcInputStreamImpl2.f13926a.equals(str)) {
                this.l.l(bArr, i);
                return;
            }
            return;
        }
        this.j.l(bArr, i);
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStarted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
        } else {
            TrtcLog.j("CameraInputStream", "SUB onCapturerStarted");
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844419e9", new Object[]{this});
        } else {
            TrtcLog.j("CameraInputStream", "SUB onCapturerStarted");
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.l;
        if (trtcInputStreamImpl != null) {
            trtcInputStreamImpl.m(videoFrame);
            videoFrame.release();
        }
    }

    public void p(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2422be", new Object[]{this, iVar});
        } else if (this.j == null || !iVar.f13883a.equals("TrtcLocalStream")) {
            TrtcInputStreamImpl trtcInputStreamImpl = this.j;
            if (trtcInputStreamImpl == null || !trtcInputStreamImpl.f13926a.equals(iVar.f13883a)) {
                TrtcInputStreamImpl trtcInputStreamImpl2 = this.l;
                if (trtcInputStreamImpl2 != null && trtcInputStreamImpl2.f13926a.equals(iVar.f13883a)) {
                    this.l.n(iVar);
                    return;
                }
                return;
            }
            this.j.n(iVar);
        } else {
            this.j.n(iVar);
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f877d6ba", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("CameraInputStream", "mute local video to black, enable: " + z);
        if (this.f.get()) {
            this.c.setBlack(z);
        }
    }

    public boolean s() {
        VideoCapturer videoCapturer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc3bf773", new Object[]{this})).booleanValue();
        }
        g(this.h);
        if (this.f.get() && (videoCapturer = this.c) != null) {
            videoCapturer.setSubCapturerObserver(this);
        }
        return true;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94986313", new Object[]{this})).booleanValue();
        }
        VideoCapturer videoCapturer = this.c;
        if (videoCapturer != null) {
            videoCapturer.setSubCapturerObserver(null);
        }
        return true;
    }

    public void v(SurfaceViewRenderer surfaceViewRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f5b77", new Object[]{this, surfaceViewRenderer});
            return;
        }
        synchronized (this.e) {
            this.d = surfaceViewRenderer;
            TrtcLog.j("CameraInputStream", "update render for input stream, render: " + surfaceViewRenderer);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        try {
            VideoCapturer videoCapturer = this.c;
            if (videoCapturer != null) {
                videoCapturer.stopCapture();
                this.f.set(false);
                this.c = null;
            }
            lju ljuVar = this.m;
            if (ljuVar != null) {
                ljuVar.j();
                this.m = null;
            }
            TrtcLog.j("CameraInputStream", "camera capture stop done");
        } catch (Exception e) {
            tmu.f("CameraInputStream", "stop camera input stream errof: " + e.getMessage());
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        jju.b("CameraInputStream start error for ref is null", this.g, this.b);
        try {
            if (this.f21354a == null) {
                this.f21354a = SurfaceTextureHelper.create("STH-" + this.g, this.b.l());
            }
        } catch (Exception e) {
            tmu.f("CameraInputStream", "start camera input stream, create camera capture error: " + e.getMessage());
        }
        if (this.c == null) {
            this.c = umu.a(rlu.f27461a, new a(), this.b.h().config.isPreferFrontCamera());
            TrtcLog.j("CameraInputStream", "create camera video capture done");
            this.c.initialize(this.f21354a, rlu.f27461a, (CapturerObserver) new b());
            TrtcLog.j("CameraInputStream", "init camera capture done");
        }
        this.c.startCapture(this.i.getVideoHeight(), this.i.getVideoWidth(), this.i.getVideoFps(), 2);
        this.f.set(true);
        lju ljuVar = new lju();
        this.m = ljuVar;
        ljuVar.i(this.b.l());
        this.c.setDummyRender(this.m);
        TrtcLog.j("CameraInputStream", "camera capture start done");
    }
}
