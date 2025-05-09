package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.IArtcExternalVideoCapturer;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoFrame;
import tb.olu;
import tb.plu;
import tb.rlu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d implements olu.n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e f13939a;
    public olu b;
    public plu c;
    public TrtcInputStreamImpl d;
    public TrtcInputStreamImpl e;
    public SurfaceTextureHelper f;
    public SurfaceTextureHelper g;
    public SurfaceViewRenderer j;
    public volatile boolean h = false;
    public final Object i = new Object();
    public int k = 0;
    public long l = 0;
    public boolean m = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements CapturerObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStarted(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("844419e9", new Object[]{this});
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
            } else if (d.b(d.this)) {
                synchronized (d.c(d.this)) {
                    try {
                        if (d.d(d.this) != null) {
                            d.d(d.this).onFrame(videoFrame);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (d.e(d.this) != null && !d.g(d.this)) {
                    d.e(d.this).m(videoFrame);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d.h(d.this).stopListening();
            d.h(d.this).dispose();
            d.i(d.this, null);
            if (d.e(d.this) != null) {
                d.e(d.this).k();
                d.f(d.this, null);
            }
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
            d.j(d.this).stopListening();
            d.j(d.this).dispose();
            d.k(d.this, null);
            if (d.l(d.this) != null) {
                d.l(d.this).k();
                d.m(d.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.trtc.impl.d$d  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0786d implements CapturerObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13943a;

        public C0786d(String str) {
            this.f13943a = str;
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStarted(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onCapturerStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("844419e9", new Object[]{this});
            }
        }

        @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
            } else if (d.b(d.this) && d.l(d.this) != null && !d.g(d.this)) {
                d.l(d.this).m(videoFrame);
                d.p(d.this);
                if (d.q(d.this) == 0 || System.currentTimeMillis() - d.q(d.this) >= 5000) {
                    d.r(d.this, System.currentTimeMillis());
                    TrtcLog.j("ExternalStream", "onFrameCaptured sub streamID: " + this.f13943a + " onFrame | fps:" + (d.n(d.this) / 5));
                    d.o(d.this, 0);
                }
            }
        }
    }

    static {
        t2o.a(395313534);
        t2o.a(395313677);
    }

    public static /* synthetic */ boolean b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcc7a2b6", new Object[]{dVar})).booleanValue();
        }
        return dVar.h;
    }

    public static /* synthetic */ Object c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2cd666c1", new Object[]{dVar});
        }
        return dVar.i;
    }

    public static /* synthetic */ SurfaceViewRenderer d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceViewRenderer) ipChange.ipc$dispatch("4dedd597", new Object[]{dVar});
        }
        return dVar.j;
    }

    public static /* synthetic */ TrtcInputStreamImpl e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("af912b9", new Object[]{dVar});
        }
        return dVar.d;
    }

    public static /* synthetic */ TrtcInputStreamImpl f(d dVar, TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("3d24f69", new Object[]{dVar, trtcInputStreamImpl});
        }
        dVar.d = trtcInputStreamImpl;
        return trtcInputStreamImpl;
    }

    public static /* synthetic */ boolean g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3f22a32", new Object[]{dVar})).booleanValue();
        }
        return dVar.m;
    }

    public static /* synthetic */ SurfaceTextureHelper h(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("dc7be3eb", new Object[]{dVar});
        }
        return dVar.g;
    }

    public static /* synthetic */ SurfaceTextureHelper i(d dVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("5991221", new Object[]{dVar, surfaceTextureHelper});
        }
        dVar.g = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ SurfaceTextureHelper j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("ba6f49ca", new Object[]{dVar});
        }
        return dVar.f;
    }

    public static /* synthetic */ SurfaceTextureHelper k(d dVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("b9122422", new Object[]{dVar, surfaceTextureHelper});
        }
        dVar.f = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ TrtcInputStreamImpl l(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("af1826bd", new Object[]{dVar});
        }
        return dVar.e;
    }

    public static /* synthetic */ TrtcInputStreamImpl m(d dVar, TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("c2de1e6d", new Object[]{dVar, trtcInputStreamImpl});
        }
        dVar.e = trtcInputStreamImpl;
        return trtcInputStreamImpl;
    }

    public static /* synthetic */ int n(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b1cb19d", new Object[]{dVar})).intValue();
        }
        return dVar.k;
    }

    public static /* synthetic */ int o(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c36e430e", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.k = i;
        return i;
    }

    public static /* synthetic */ int p(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d91e95", new Object[]{dVar})).intValue();
        }
        int i = dVar.k;
        dVar.k = 1 + i;
        return i;
    }

    public static /* synthetic */ long q(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4e7537d", new Object[]{dVar})).longValue();
        }
        return dVar.l;
    }

    public static /* synthetic */ long r(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2f7e0d1", new Object[]{dVar, new Long(j)})).longValue();
        }
        dVar.l = j;
        return j;
    }

    public void A() {
        olu oluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        TrtcLog.j("ExternalStream", "stopCapture pri");
        if (this.h && (oluVar = this.b) != null) {
            try {
                oluVar.stopCapture();
                this.b.dispose();
            } catch (Exception e) {
                TrtcLog.i("ExternalStream", "stop capture exception: " + e.getMessage());
            }
        }
    }

    public void B() {
        olu oluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498630f", new Object[]{this});
            return;
        }
        TrtcLog.j("ExternalStream", "stopCapture sub");
        if (this.h && (oluVar = this.b) != null) {
            try {
                oluVar.t();
            } catch (Exception e) {
                TrtcLog.i("ExternalStream", "stop sub capture exception: " + e.getMessage());
            }
            TrtcInputStreamImpl trtcInputStreamImpl = this.e;
            if (trtcInputStreamImpl != null) {
                trtcInputStreamImpl.k();
                TrtcLog.j("ExternalStream", "inputStreamSub = null");
                this.e = null;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.g;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
                TrtcLog.j("ExternalStream", "surfaceTextureHelperSub = null");
                this.g = null;
            }
        }
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d115c06", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.j("ExternalStream", "updateMixMode: " + i);
        if (this.h) {
            this.b.u(i);
        }
    }

    public void D(SurfaceViewRenderer surfaceViewRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f5b77", new Object[]{this, surfaceViewRenderer});
            return;
        }
        synchronized (this.i) {
            this.j = surfaceViewRenderer;
        }
    }

    @Override // tb.olu.n
    public void a(IArtcExternalVideoCapturer.CapturerType capturerType, int i, int i2) {
        TrtcInputStreamImpl trtcInputStreamImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f289a36", new Object[]{this, capturerType, new Integer(i), new Integer(i2)});
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            TrtcInputStreamImpl trtcInputStreamImpl2 = this.d;
            if (trtcInputStreamImpl2 != null) {
                trtcInputStreamImpl2.b.updateVideoSize(i, i2);
            }
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.SUB && (trtcInputStreamImpl = this.e) != null) {
            trtcInputStreamImpl.b.updateVideoSize(i, i2);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff784138", new Object[]{this});
            return;
        }
        this.h = false;
        B();
        A();
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (!(surfaceTextureHelper == null || surfaceTextureHelper.getHandler() == null)) {
            this.g.getHandler().post(new b());
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.f;
        if (!(surfaceTextureHelper2 == null || surfaceTextureHelper2.getHandler() == null)) {
            this.f.getHandler().post(new c());
        }
        this.f13939a = null;
        this.b = null;
        this.c = null;
        TrtcLog.j("ExternalStream", "deinit");
    }

    public void t(e eVar, olu oluVar, plu pluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555ba038", new Object[]{this, eVar, oluVar, pluVar});
            return;
        }
        this.f13939a = eVar;
        this.b = oluVar;
        this.c = pluVar;
        this.h = true;
        oluVar.q(eVar.i());
        if (this.f == null) {
            this.f = SurfaceTextureHelper.create("STH-PRI", eVar.l());
        }
        oluVar.r(this);
        oluVar.initialize(this.f, rlu.f27461a, (CapturerObserver) new a());
        TrtcLog.j("ExternalStream", "init");
    }

    public void u(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316eb8eb", new Object[]{this, iVar});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.d;
        if (trtcInputStreamImpl != null) {
            trtcInputStreamImpl.n(iVar);
        }
    }

    public void v(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37b7b36", new Object[]{this, str, videoFrame});
            return;
        }
        plu pluVar = this.c;
        if (pluVar != null) {
            pluVar.c(str, videoFrame);
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a45f00", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void x(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        olu oluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786e782e", new Object[]{this, trtcVideoLayoutParams});
        } else if (trtcVideoLayoutParams != null && (oluVar = this.b) != null) {
            oluVar.setVideoSize(IArtcExternalVideoCapturer.CapturerType.SUB, trtcVideoLayoutParams.subWidth, trtcVideoLayoutParams.subHeight);
        }
    }

    public ITrtcInputStream z(TrtcStreamConfig trtcStreamConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("7ef298b8", new Object[]{this, trtcStreamConfig, str});
        }
        if (!this.h || this.d == null) {
            TrtcLog.i("ExternalStream", "start sub capture error");
            return null;
        }
        TrtcLog.j("ExternalStream", "startSubCapture, stream id:" + str);
        if (this.e == null) {
            TrtcLog.j("ExternalStream", "new inputStreamSub");
            this.e = new TrtcInputStreamImpl(this.f13939a, str, trtcStreamConfig);
        }
        this.e.r(trtcStreamConfig);
        if (this.g == null) {
            TrtcLog.j("ExternalStream", "new surfaceTextureHelperSub");
            this.g = SurfaceTextureHelper.create("STH-SUB", this.f13939a.l());
        }
        this.b.p(this.g);
        this.b.setSubCapturerObserver(new C0786d(str));
        this.b.s(trtcStreamConfig.getVideoWidth(), trtcStreamConfig.getVideoHeight());
        return this.e;
    }

    public ITrtcInputStream y(TrtcStreamConfig trtcStreamConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("5a8cfa9c", new Object[]{this, trtcStreamConfig, str});
        }
        if (!this.h) {
            TrtcLog.i("ExternalStream", "start capture, need init first");
            return null;
        }
        TrtcLog.j("ExternalStream", "startCapture, stream id:" + str);
        if (this.d == null) {
            this.d = new TrtcInputStreamImpl(this.f13939a, str, trtcStreamConfig);
        }
        this.b.startCapture(trtcStreamConfig.getVideoWidth(), trtcStreamConfig.getVideoHeight(), trtcStreamConfig.getVideoFps(), 2);
        return this.d;
    }
}
