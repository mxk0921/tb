package com.taobao.trtc.impl;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcException;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.TrtcVideoDevice;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.video.TrtcDecodedTextureHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoFrame;
import tb.emu;
import tb.iju;
import tb.mmu;
import tb.nlu;
import tb.olu;
import tb.plu;
import tb.t2o;
import tb.tmu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e implements TrtcVideoDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TrtcEngineImpl f13944a;
    public EglBase b;
    public EglBase.Context c;
    public long d;
    public SurfaceViewRenderer e;
    public iju j;
    public mmu k;
    public final nlu n;
    public d o;
    public b p;
    public final Map<String, SurfaceViewRenderer> f = new HashMap();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public boolean h = false;
    public boolean i = false;
    public final Map<String, TrtcInputStreamImpl> l = new HashMap();
    public final Map<String, emu> m = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements CameraVideoCapturer.CameraSwitchHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
                return;
            }
            TrtcLog.j("TrtcVideoDeivce", "camera switch done");
            e.a(e.this).t1(z);
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("297c5941", new Object[]{this, str});
                return;
            }
            tmu.f("TrtcVideoDeivce", "camera switch error: " + str);
            e.a(e.this).u1(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements RendererCommon.RendererEvents {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f13947a;

        static {
            t2o.a(395313591);
            t2o.a(395313802);
        }

        public c(e eVar, String str) {
            this.f13947a = str;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6440b8", new Object[]{this});
                return;
            }
            tmu.f("TrtcVideoDeivce", "[renderEvent] first frame rendered, id: " + this.f13947a);
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c569a442", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            tmu.f("TrtcVideoDeivce", "[renderEvent] frame resoution change: " + i + "x" + i2 + ", rotation: " + i3);
        }
    }

    static {
        t2o.a(395313588);
        t2o.a(395313452);
    }

    public e(TrtcEngineImpl trtcEngineImpl, nlu nluVar) {
        this.f13944a = trtcEngineImpl;
        this.n = nluVar;
    }

    public static /* synthetic */ nlu a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nlu) ipChange.ipc$dispatch("e9265cf4", new Object[]{eVar});
        }
        return eVar.n;
    }

    public void b(olu oluVar, plu pluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8244204", new Object[]{this, oluVar, pluVar});
        } else if (oluVar != null || pluVar != null) {
            d dVar = new d();
            this.o = dVar;
            dVar.t(this, oluVar, pluVar);
        }
    }

    public TrtcInputStreamImpl c(String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("9565f284", new Object[]{this, str, trtcStreamConfig, aVar});
        }
        TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) ((HashMap) this.l).get(str);
        if (trtcInputStreamImpl != null) {
            TrtcLog.j("TrtcVideoDeivce", "stream id:" + str + ", input stream exist");
            trtcInputStreamImpl.q(aVar);
            return (TrtcInputStreamImpl) ((HashMap) this.l).get(str);
        }
        TrtcInputStreamImpl trtcInputStreamImpl2 = new TrtcInputStreamImpl(this, str, trtcStreamConfig, aVar);
        trtcInputStreamImpl2.q(aVar);
        ((HashMap) this.l).put(str, trtcInputStreamImpl2);
        return trtcInputStreamImpl2;
    }

    public emu d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emu) ipChange.ipc$dispatch("62146411", new Object[]{this, str});
        }
        if (((emu) ((HashMap) this.m).get(str)) != null) {
            TrtcLog.j("TrtcVideoDeivce", "stream id: " + str + ", output stream exist");
            return (emu) ((HashMap) this.m).get(str);
        }
        emu emuVar = new emu(this.f13944a, str);
        ((HashMap) this.m).put(str, emuVar);
        return emuVar;
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff784138", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcVideoDeivce", "deInit start");
        this.g.set(false);
        d dVar = this.o;
        if (dVar != null) {
            dVar.s();
            this.o = null;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.e;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
            this.e = null;
        }
        for (SurfaceViewRenderer surfaceViewRenderer2 : ((HashMap) this.f).values()) {
            if (surfaceViewRenderer2 != null) {
                surfaceViewRenderer2.release();
            }
        }
        ((HashMap) this.f).clear();
        iju ijuVar = this.j;
        if (ijuVar != null) {
            ijuVar.h();
            this.j = null;
        }
        mmu mmuVar = this.k;
        if (mmuVar != null) {
            mmuVar.h();
            this.k = null;
        }
        for (String str : ((HashMap) this.l).keySet()) {
            t(str);
        }
        for (String str2 : ((HashMap) this.m).keySet()) {
            u(str2);
        }
        ((HashMap) this.l).clear();
        ((HashMap) this.m).clear();
        TrtcDecodedTextureHelper.disposeEglContext();
        EglBase eglBase = this.b;
        if (eglBase != null) {
            this.c = null;
            eglBase.release();
            this.b = null;
        }
        this.f13944a = null;
        TrtcLog.j("TrtcVideoDeivce", "deInit done");
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void enableBeauty(boolean z) {
        iju ijuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20499eae", new Object[]{this, new Boolean(z)});
        } else if (this.f13944a.k0("enableBeauty") && (ijuVar = this.j) != null) {
            ijuVar.i(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        iju ijuVar = this.j;
        if (ijuVar != null) {
            ijuVar.k(z);
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1e90a7", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.o;
        if (dVar != null) {
            dVar.w(z);
        }
    }

    public TrtcEngineImpl g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcEngineImpl) ipChange.ipc$dispatch("e412e0b", new Object[]{this});
        }
        if (this.g.get()) {
            return this.f13944a;
        }
        return null;
    }

    public TrtcInnerConfig h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerConfig) ipChange.ipc$dispatch("5aa578f", new Object[]{this});
        }
        return this.f13944a.r0();
    }

    public nlu i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nlu) ipChange.ipc$dispatch("28401181", new Object[]{this});
        }
        return this.n;
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public boolean isFrontFacing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bb723e4", new Object[]{this})).booleanValue();
        }
        iju ijuVar = this.j;
        if (ijuVar == null || ijuVar.m() == null) {
            return false;
        }
        return this.j.m().isFrontFacing();
    }

    public d j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("824169e1", new Object[]{this});
        }
        return this.o;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14abafe9", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public EglBase.Context l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase.Context) ipChange.ipc$dispatch("d936ce52", new Object[]{this});
        }
        if (!this.g.get()) {
            m();
        }
        return this.c;
    }

    public synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.g.get()) {
            EglBase create = EglBase.StaticMethod.create();
            this.b = create;
            EglBase.Context eglBaseContext = create.getEglBaseContext();
            this.c = eglBaseContext;
            this.d = eglBaseContext.getNativeEglContext();
            TrtcDecodedTextureHelper.setEglBase(this.c);
            this.g.set(true);
            TrtcLog.j("TrtcVideoDeivce", "init done");
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void muteLocalVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0fc204", new Object[]{this, new Boolean(z)});
            return;
        }
        iju ijuVar = this.j;
        if (ijuVar != null) {
            ijuVar.q(z);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94418e2", new Object[]{this, str});
            return;
        }
        emu emuVar = (emu) ((HashMap) this.m).get(str);
        if (emuVar != null) {
            emuVar.p();
        }
    }

    public void o(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543e2ce2", new Object[]{this, str, bArr, new Integer(i)});
        } else if (bArr.length > 0) {
            TrtcLog.j("TrtcVideoDeivce", "onData - stream id: " + str + ", type: " + i);
            if (this.j != null) {
                TrtcLog.j("TrtcVideoDeivce", "onData - camear stream id: " + str);
                this.j.o(str, bArr, i);
            }
            TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) ((HashMap) this.l).get(str);
            if (trtcInputStreamImpl != null) {
                TrtcLog.j("TrtcVideoDeivce", "onData - input stream id: " + str);
                trtcInputStreamImpl.l(bArr, i);
                return;
            }
            emu emuVar = (emu) ((HashMap) this.m).get(str);
            if (emuVar != null) {
                TrtcLog.j("TrtcVideoDeivce", "onData - output stream id: " + str);
                emuVar.q(bArr, i);
            }
        }
    }

    public synchronized void p(TrtcDefines.i iVar, TrtcDefines.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9847c168", new Object[]{this, iVar, oVar});
            return;
        }
        iju ijuVar = this.j;
        if (ijuVar != null) {
            ijuVar.p(iVar);
        }
        d j = ((e) this.f13944a.h()).j();
        if (j == null || !"TrtcLiveStream".equals(iVar.f13883a)) {
            for (String str : ((HashMap) this.l).keySet()) {
                if (str.equals(iVar.f13883a)) {
                    ((TrtcInputStreamImpl) ((HashMap) this.l).get(str)).n(iVar);
                }
            }
            for (String str2 : ((HashMap) this.m).keySet()) {
                if (str2.equals(oVar.f13889a)) {
                    ((emu) ((HashMap) this.m).get(str2)).s(oVar);
                }
            }
            return;
        }
        j.u(iVar);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void pauseScreenCapture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331f6c9", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcVideoDeivce", "API - pauseScreenCapture - " + z);
        mmu mmuVar = this.k;
        if (mmuVar != null) {
            mmuVar.j(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void preferredFront(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a4e05", new Object[]{this, new Boolean(z)});
        } else {
            h().config.setPreferFrontCamera(z);
        }
    }

    public void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa76013", new Object[]{this, str, str2});
        } else if (!str2.isEmpty()) {
            this.n.H1(str2);
            for (emu emuVar : ((HashMap) this.m).values()) {
                if (emuVar != null) {
                    emuVar.r(str2);
                }
            }
        }
    }

    public void s(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37b7b36", new Object[]{this, str, videoFrame});
        } else if (videoFrame != null && str != null) {
            if (this.o != null) {
                if (!this.f13944a.w0()) {
                    this.o.v(null, videoFrame);
                } else {
                    this.o.v(str, videoFrame);
                }
            }
            SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) ((HashMap) this.f).get(str);
            if (surfaceViewRenderer != null) {
                surfaceViewRenderer.onFrame(videoFrame);
                return;
            }
            for (SurfaceViewRenderer surfaceViewRenderer2 : ((HashMap) this.f).values()) {
                surfaceViewRenderer2.onFrame(videoFrame);
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void setEventObserver(ITrtcObserver.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c979bb0a", new Object[]{this, fVar});
            return;
        }
        tmu.f("TrtcVideoDeivce", "API - setVideoEventObserver: " + fVar);
        this.n.J1(fVar);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setSubCaptureParams(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb9666e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.p == null) {
            this.p = new b(this, null);
        }
        b.b(this.p, i3);
        b bVar = this.p;
        bVar.b = i2;
        bVar.f13946a = i;
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized ITrtcInputStream startCapture(TrtcStreamConfig trtcStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("390a1a66", new Object[]{this, trtcStreamConfig});
        }
        tmu.f("TrtcVideoDeivce", "API - startCapture, " + trtcStreamConfig.ToString());
        if (!this.f13944a.k0("startCapture")) {
            return null;
        }
        if (!this.f13944a.r0().config.isUseExternalVideoCapture() || this.o == null) {
            TrtcLog.j("TrtcVideoDeivce", "start capture for camera stream");
            if (this.j == null) {
                this.j = new iju(this.f13944a.x0(), this, trtcStreamConfig, (TrtcInputStreamImpl) ((HashMap) this.l).get(this.f13944a.x0()));
            }
            SurfaceViewRenderer surfaceViewRenderer = this.e;
            if (surfaceViewRenderer != null) {
                this.j.v(surfaceViewRenderer);
            }
            this.j.r();
            setVideoMirror(this.h, this.i);
            return this.j.l();
        }
        TrtcLog.j("TrtcVideoDeivce", "start capture for external stream");
        SurfaceViewRenderer surfaceViewRenderer2 = this.e;
        if (surfaceViewRenderer2 != null) {
            this.o.D(surfaceViewRenderer2);
        }
        return this.o.y(trtcStreamConfig, h().config.getUserId());
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public ITrtcInputStream startScreenCapture(TrtcStreamConfig trtcStreamConfig, Intent intent) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("1392ffd5", new Object[]{this, trtcStreamConfig, intent});
        }
        tmu.f("TrtcVideoDeivce", "API - startScreenCapture, " + trtcStreamConfig.ToString());
        if (!this.f13944a.k0("startScreenCapture") || intent == null) {
            return null;
        }
        TrtcLog.j("TrtcVideoDeivce", "start capture for screen stream: " + trtcStreamConfig.ToString());
        if (this.k == null) {
            this.k = new mmu(this.f13944a.x0(), this, trtcStreamConfig, (TrtcInputStreamImpl) ((HashMap) this.l).get(this.f13944a.x0()));
        }
        this.k.k(intent);
        return this.k.i();
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void stopCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        tmu.f("TrtcVideoDeivce", "API - stopCapture");
        if (this.f13944a.k0("stopCapture")) {
            iju ijuVar = this.j;
            if (ijuVar != null) {
                ijuVar.t();
            }
            d dVar = this.o;
            if (dVar != null) {
                dVar.A();
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void stopScreenCapture() throws TrtcException {
        mmu mmuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284e0df", new Object[]{this});
            return;
        }
        tmu.f("TrtcVideoDeivce", "API - stopScreenCapture");
        if (this.f13944a.k0("stopScreenCapture") && (mmuVar = this.k) != null) {
            mmuVar.l();
            this.k.h();
            this.k = null;
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public boolean switchCamera() {
        iju ijuVar;
        CameraVideoCapturer m;
        SurfaceViewRenderer surfaceViewRenderer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46484f84", new Object[]{this})).booleanValue();
        }
        if (!this.f13944a.k0("enableBeauty") || (ijuVar = this.j) == null || (m = ijuVar.m()) == null) {
            return false;
        }
        if (!m.isFrontFacing() || (surfaceViewRenderer = this.e) == null) {
            setVideoMirror(this.h, this.i);
        } else {
            surfaceViewRenderer.setMirror(false);
            m.setVideoContentMirror(false);
        }
        m.switchCamera(new a());
        return true;
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabed7b4", new Object[]{this, str});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) ((HashMap) this.l).get(str);
        if (trtcInputStreamImpl != null) {
            trtcInputStreamImpl.k();
        }
        ((HashMap) this.l).remove(str);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public Bitmap takeRemoteSnapshot(String str) {
        SurfaceViewRenderer surfaceViewRenderer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("28c76540", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (surfaceViewRenderer = (SurfaceViewRenderer) ((HashMap) this.f).get(str)) != null) {
            return surfaceViewRenderer.takeSnapshot();
        }
        return null;
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c45e19", new Object[]{this, str});
            return;
        }
        emu emuVar = (emu) ((HashMap) this.m).get(str);
        if (emuVar != null) {
            emuVar.o();
            ((HashMap) this.m).remove(str);
        }
    }

    public void v(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786e782e", new Object[]{this, trtcVideoLayoutParams});
            return;
        }
        TrtcLog.j("TrtcVideoDeivce", "setVideoLayout");
        d dVar = this.o;
        if (dVar != null) {
            dVar.x(trtcVideoLayoutParams);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setLocalView(SurfaceViewRenderer surfaceViewRenderer) {
        EglBase eglBase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415f16a6", new Object[]{this, surfaceViewRenderer});
        } else if (this.f13944a.k0("setLocalView")) {
            tmu.f("TrtcVideoDeivce", "API - setLocalView, view: " + surfaceViewRenderer);
            if (this.f13944a.r0().config.isUseExternalVideoRender()) {
                TrtcLog.i("TrtcVideoDeivce", "external video render is set, can not do this");
                return;
            }
            SurfaceViewRenderer surfaceViewRenderer2 = this.e;
            if (surfaceViewRenderer2 != null) {
                if (surfaceViewRenderer == null) {
                    TrtcLog.j("TrtcVideoDeivce", "setLocalView release old local by null,  view: " + this.e);
                    this.e.release();
                    this.e = null;
                } else if (surfaceViewRenderer2.equals(surfaceViewRenderer)) {
                    tmu.f("TrtcVideoDeivce", "setLocalView, is the same render, ignore it");
                    return;
                } else {
                    TrtcLog.j("TrtcVideoDeivce", "setLocalView release old local by new render view: " + this.e);
                    this.e.release();
                    this.e = null;
                }
            }
            if (!(surfaceViewRenderer == null || (eglBase = this.b) == null)) {
                try {
                    surfaceViewRenderer.init(eglBase.getEglBaseContext(), new c(this, g().x0()));
                } catch (Exception unused) {
                }
                surfaceViewRenderer.setIsRemote(false);
                TrtcLog.j("TrtcVideoDeivce", "setLocalView, init view: " + surfaceViewRenderer);
            }
            this.e = surfaceViewRenderer;
            iju ijuVar = this.j;
            if (ijuVar != null) {
                ijuVar.v(surfaceViewRenderer);
            }
            setVideoMirror(this.h, this.i);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized ITrtcInputStream startSubCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("bf168a5e", new Object[]{this});
        } else if (!this.f13944a.k0("startSubCapture")) {
            return null;
        } else {
            if (!this.f13944a.r0().config.isUseExternalVideoCapture() || this.o == null) {
                TrtcLog.j("TrtcVideoDeivce", "start sub capture for camera stream");
                iju ijuVar = this.j;
                if (ijuVar == null) {
                    return null;
                }
                ijuVar.s();
                return this.j.n();
            }
            TrtcLog.j("TrtcVideoDeivce", "start sub capture for external stream");
            TrtcStreamConfig.a d = new TrtcStreamConfig.a().d(true);
            b bVar = this.p;
            return this.o.z(d.f(bVar.f13946a, bVar.b, b.a(bVar)).a(), h().config.getUserId());
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void stopSubCapture() throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498630f", new Object[]{this});
        } else if (this.f13944a.k0("stopSubCapture")) {
            if (this.f13944a.r0().config.isUseExternalVideoCapture() && this.o != null) {
                TrtcLog.j("TrtcVideoDeivce", "stop sub capture for external stream");
                this.o.B();
                this.o.C(0);
            }
            if (this.j != null) {
                TrtcLog.j("TrtcVideoDeivce", "stop sub capture for camera stream");
                this.j.u();
                this.j.j(false);
            }
        }
    }

    public void q(TrtcDefines.TrtcMixMode trtcMixMode) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c35fdc", new Object[]{this, trtcMixMode});
            return;
        }
        TrtcLog.j("TrtcVideoDeivce", "onMixModeUpdate: " + trtcMixMode);
        iju ijuVar = this.j;
        if (ijuVar != null) {
            if (trtcMixMode == TrtcDefines.TrtcMixMode.MIX_LOCAL) {
                z = true;
            }
            ijuVar.j(z);
        }
        int ordinal = trtcMixMode.ordinal();
        if (this.o != null) {
            if (this.f13944a.w0()) {
                ordinal = TrtcDefines.TrtcMixMode.MiX_SERVER.ordinal() + 1;
            }
            this.o.C(ordinal);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setRemoteVideoView(SurfaceViewRenderer surfaceViewRenderer, String str) {
        EglBase eglBase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3a8c5a", new Object[]{this, surfaceViewRenderer, str});
        } else if (this.f13944a.k0("setRemoteVideoView")) {
            tmu.f("TrtcVideoDeivce", "API - setRemoteVideoView, userId:" + str + ", view: " + surfaceViewRenderer);
            SurfaceViewRenderer surfaceViewRenderer2 = (SurfaceViewRenderer) ((HashMap) this.f).get(str);
            if (surfaceViewRenderer2 != null) {
                if (surfaceViewRenderer == null) {
                    surfaceViewRenderer2.release();
                    ((HashMap) this.f).remove(str);
                    TrtcLog.j("TrtcVideoDeivce", "release remote view by null for id: " + str);
                    return;
                } else if (surfaceViewRenderer2.equals(surfaceViewRenderer)) {
                    tmu.f("TrtcVideoDeivce", "setRemoteVideoView, is the same render, ignore it");
                    return;
                } else {
                    surfaceViewRenderer2.release();
                    ((HashMap) this.f).remove(str);
                    TrtcLog.j("TrtcVideoDeivce", "release remote view by new render, for id: " + str);
                }
            }
            if (!(surfaceViewRenderer == null || (eglBase = this.b) == null)) {
                try {
                    surfaceViewRenderer.init(eglBase.getEglBaseContext(), new c(this, str));
                } catch (Exception unused) {
                }
                surfaceViewRenderer.setIsRemote(true);
                surfaceViewRenderer.setMirror(false);
                surfaceViewRenderer.setEnableHardwareScaler(true);
                ((HashMap) this.f).put(str, surfaceViewRenderer);
                iju ijuVar = this.j;
                if (!(ijuVar == null || ijuVar.m() == null)) {
                    surfaceViewRenderer.setVideoCapturer(this.j.m());
                }
                TrtcLog.j("TrtcVideoDeivce", "add remote view, for id: " + str);
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setVideoMirror(boolean z, boolean z2) {
        CameraVideoCapturer m;
        boolean z3 = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e60559f", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            tmu.f("TrtcVideoDeivce", "setVideoMirror, pushMirror:" + z + " previewMirror:" + z2);
            if (this.f13944a.k0("setVideoMirror")) {
                this.h = z;
                this.i = z2;
                if (z2 == z) {
                    z3 = false;
                }
                SurfaceViewRenderer surfaceViewRenderer = this.e;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.setMirror(z3);
                }
                iju ijuVar = this.j;
                if (!(ijuVar == null || (m = ijuVar.m()) == null)) {
                    m.setVideoContentMirror(z);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13946a;
        public int b;
        public int c;

        static {
            t2o.a(395313590);
        }

        public b(e eVar) {
            this.f13946a = 360;
            this.b = 640;
            this.c = 20;
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e941d830", new Object[]{bVar})).intValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ int b(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("da78925b", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.c = i;
            return i;
        }

        public /* synthetic */ b(e eVar, a aVar) {
            this(eVar);
        }
    }
}
