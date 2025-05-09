package com.taobao.trtc.impl;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.adapter.TrtcAdapter;
import com.taobao.trtc.api.ITrtcDataStream;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import tb.nf;
import tb.t2o;
import tb.tmu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcInputStreamImpl implements ITrtcInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f13926a;
    public TrtcStreamConfig b;
    public final boolean c;
    public final e d;
    public SurfaceTextureHelper e;
    public Surface f;
    public final Runnable g;
    public final AtomicBoolean h;
    public int i;
    public long j;
    public final Object k;
    public ITrtcInputStream.a l;
    public ITrtcDataStream.a m;
    public ITrtcInputStream.b n;
    public final AtomicBoolean o;
    public TrtcDefines.TrtcFrameType p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITrtcInputStream.a f13927a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.trtc.impl.TrtcInputStreamImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0783a implements VideoSink {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0783a() {
            }

            @Override // org.webrtc.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
                } else {
                    TrtcInputStreamImpl.this.m(videoFrame);
                }
            }
        }

        public a(ITrtcInputStream.a aVar, String str) {
            this.f13927a = aVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcInputStreamImpl.a(TrtcInputStreamImpl.this) != null) {
                TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).startListening(new C0783a());
                TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).setTextureSize(TrtcInputStreamImpl.this.b.getVideoWidth(), TrtcInputStreamImpl.this.b.getVideoHeight());
                TrtcInputStreamImpl.d(TrtcInputStreamImpl.this, new Surface(TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).getSurfaceTexture()));
                synchronized (TrtcInputStreamImpl.e(TrtcInputStreamImpl.this)) {
                    try {
                        TrtcInputStreamImpl.g(TrtcInputStreamImpl.this, this.f13927a);
                        if (TrtcInputStreamImpl.f(TrtcInputStreamImpl.this) != null) {
                            TrtcLog.j("InputStream", "notify event: onVideoInputInitialized, and start input");
                            TrtcInputStreamImpl.f(TrtcInputStreamImpl.this).c(TrtcInputStreamImpl.c(TrtcInputStreamImpl.this));
                            TrtcInputStreamImpl.f(TrtcInputStreamImpl.this).b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                TrtcInputStreamImpl.h(TrtcInputStreamImpl.this).set(true);
                TrtcLog.j("InputStream", "external input stream initialize done, stream id: " + this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13929a;
        public final /* synthetic */ boolean b;

        public b(String str, boolean z) {
            this.f13929a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcLog.j("InputStream", "send sei, stream_id:" + TrtcInputStreamImpl.this.f13926a + ", len: " + this.f13929a.length() + ", withKeyFrame:" + this.b);
            TrtcInputStreamImpl trtcInputStreamImpl = TrtcInputStreamImpl.this;
            TrtcInputStreamImpl.j(trtcInputStreamImpl, TrtcInputStreamImpl.i(trtcInputStreamImpl).ordinal(), TrtcInputStreamImpl.this.f13926a, this.f13929a, this.b, false);
            TrtcLog.j("InputStream", "send sei done");
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
            TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).stopListening();
            TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).dispose();
            TrtcInputStreamImpl.b(TrtcInputStreamImpl.this, null);
        }
    }

    static {
        t2o.a(395313564);
        t2o.a(395313386);
    }

    public TrtcInputStreamImpl(e eVar, String str, TrtcStreamConfig trtcStreamConfig) {
        this.c = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        this.i = 0;
        this.j = 0L;
        this.k = new Object();
        this.o = new AtomicBoolean(false);
        this.f13926a = str;
        this.b = trtcStreamConfig;
        this.d = eVar;
        this.c = true;
        this.e = null;
        atomicBoolean.set(true);
        this.p = trtcStreamConfig.getIsSub() ? TrtcDefines.TrtcFrameType.E_FRAME_SUB : TrtcDefines.TrtcFrameType.E_FRAME_PRI;
        tmu.f("InputStream", "new inputstream for camera input, id:" + str + ", type:" + this.p + " ,config:" + trtcStreamConfig.ToString());
    }

    public static /* synthetic */ SurfaceTextureHelper a(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("ddae8ce7", new Object[]{trtcInputStreamImpl});
        }
        return trtcInputStreamImpl.e;
    }

    public static /* synthetic */ SurfaceTextureHelper b(TrtcInputStreamImpl trtcInputStreamImpl, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("f4e98fe1", new Object[]{trtcInputStreamImpl, surfaceTextureHelper});
        }
        trtcInputStreamImpl.e = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ Surface c(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("a2f48ad8", new Object[]{trtcInputStreamImpl});
        }
        return trtcInputStreamImpl.f;
    }

    public static /* synthetic */ Surface d(TrtcInputStreamImpl trtcInputStreamImpl, Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("1bbf064a", new Object[]{trtcInputStreamImpl, surface});
        }
        trtcInputStreamImpl.f = surface;
        return surface;
    }

    public static /* synthetic */ Object e(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a97b5587", new Object[]{trtcInputStreamImpl});
        }
        return trtcInputStreamImpl.k;
    }

    public static /* synthetic */ ITrtcInputStream.a f(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream.a) ipChange.ipc$dispatch("3365ae7b", new Object[]{trtcInputStreamImpl});
        }
        return trtcInputStreamImpl.l;
    }

    public static /* synthetic */ ITrtcInputStream.a g(TrtcInputStreamImpl trtcInputStreamImpl, ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream.a) ipChange.ipc$dispatch("a75fe4a0", new Object[]{trtcInputStreamImpl, aVar});
        }
        trtcInputStreamImpl.l = aVar;
        return aVar;
    }

    public static /* synthetic */ AtomicBoolean h(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("3352a20d", new Object[]{trtcInputStreamImpl});
        }
        return trtcInputStreamImpl.h;
    }

    public static /* synthetic */ TrtcDefines.TrtcFrameType i(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcFrameType) ipChange.ipc$dispatch("d44f5522", new Object[]{trtcInputStreamImpl});
        }
        return trtcInputStreamImpl.p;
    }

    public static /* synthetic */ void j(TrtcInputStreamImpl trtcInputStreamImpl, int i, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359baf68", new Object[]{trtcInputStreamImpl, new Integer(i), str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            trtcInputStreamImpl.nativeSendSei(i, str, str2, z, z2);
        }
    }

    private native void nativeFrameCaptured(int i, int i2, int i3, long j, VideoFrame.Buffer buffer, int i4, String str);

    private native void nativeSendSei(int i, String str, String str2, boolean z, boolean z2);

    public static void o(ITrtcInputStream iTrtcInputStream, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a213d1", new Object[]{iTrtcInputStream, new Boolean(z)});
        } else if (iTrtcInputStream != null) {
            TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) iTrtcInputStream;
            trtcInputStreamImpl.o.set(z);
            TrtcLog.j("InputStream", "set input stream: " + trtcInputStreamImpl.f13926a + ", enable:" + z + ", type: " + trtcInputStreamImpl.p);
            synchronized (trtcInputStreamImpl.k) {
                try {
                    if (trtcInputStreamImpl.m != null) {
                        if (z) {
                            TrtcLog.j("InputStream", "data channel available");
                            trtcInputStreamImpl.m.a();
                        } else {
                            TrtcLog.j("InputStream", "data channel unavailable");
                            trtcInputStreamImpl.m.c();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void p(ITrtcInputStream iTrtcInputStream, boolean z, TrtcDefines.TrtcFrameType trtcFrameType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb85ba5a", new Object[]{iTrtcInputStream, new Boolean(z), trtcFrameType});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) iTrtcInputStream;
        if (trtcInputStreamImpl != null) {
            trtcInputStreamImpl.p = trtcFrameType;
            o(trtcInputStreamImpl, z);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public void inputSei(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a988796", new Object[]{this, str, new Boolean(z)});
        } else {
            nf.g(new b(str, z), 0L);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (this.h.get()) {
            this.o.set(false);
            synchronized (this.k) {
                try {
                    ITrtcInputStream.a aVar = this.l;
                    if (aVar != null) {
                        aVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            SurfaceTextureHelper surfaceTextureHelper = this.e;
            if (surfaceTextureHelper != null) {
                if (!(this.g == null || surfaceTextureHelper.getHandler() == null)) {
                    this.e.getHandler().removeCallbacks(this.g);
                }
                if (this.e.getHandler() != null) {
                    this.e.getHandler().post(new c());
                }
            }
            this.f = null;
            this.h.set(false);
            this.i = 0;
            this.j = 0L;
        }
    }

    public void l(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce76ec", new Object[]{this, bArr, new Integer(i)});
        } else if (this.m != null) {
            TrtcLog.j("InputStream", "notify data frame, len: " + bArr.length);
            TrtcDefines.f fVar = new TrtcDefines.f();
            fVar.f13880a = (byte[]) bArr.clone();
            fVar.b = i;
            this.m.b(fVar);
        } else {
            TrtcLog.i("InputStream", "notify data frame, but no observer");
        }
    }

    public void n(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2422be", new Object[]{this, iVar});
            return;
        }
        synchronized (this.k) {
            ITrtcInputStream.b bVar = this.n;
            if (bVar != null) {
                ((TrtcAdapter) bVar).t(iVar);
            }
        }
    }

    public void q(ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de1b9fa", new Object[]{this, aVar});
            return;
        }
        synchronized (this.k) {
            this.l = aVar;
        }
    }

    public void r(TrtcStreamConfig trtcStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8b368e", new Object[]{this, trtcStreamConfig});
        } else {
            this.b = trtcStreamConfig;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void sendDataFrame(TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef58ec86", new Object[]{this, fVar});
            return;
        }
        e eVar = this.d;
        if (eVar != null && eVar.g() != null) {
            this.d.g().m1(this.f13926a, fVar);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void setDataStreamObserver(ITrtcDataStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be69cfa", new Object[]{this, aVar});
            return;
        }
        synchronized (this.k) {
            this.m = aVar;
        }
        TrtcLog.j("InputStream", "set data observer: " + aVar);
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public void setStatsObserver(ITrtcInputStream.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540cfc80", new Object[]{this, bVar});
            return;
        }
        synchronized (this.k) {
            this.n = bVar;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public TrtcStreamConfig streamConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcStreamConfig) ipChange.ipc$dispatch("351ffaa9", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public String streamId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd16091e", new Object[]{this});
        }
        return this.f13926a;
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public void update(boolean z, boolean z2, boolean z3) {
        TrtcEngineImpl g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c0584", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        e eVar = this.d;
        if (eVar != null && (g = eVar.g()) != null) {
            this.b.update(z, z2, z3);
            g.C1(this);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public Surface videoInputSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("2da5f59d", new Object[]{this});
        }
        if (this.c) {
            TrtcLog.i("InputStream", "can not input video by surface");
            return null;
        } else if (this.h.get()) {
            return this.f;
        } else {
            TrtcLog.i("InputStream", "input stream not initialized");
            return null;
        }
    }

    public void m(VideoFrame videoFrame) {
        boolean z;
        VideoFrame videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
            return;
        }
        int videoWidth = this.b.getVideoWidth();
        int videoHeight = this.b.getVideoHeight();
        if (videoWidth == videoFrame.getBuffer().getWidth() && videoHeight == videoFrame.getBuffer().getHeight()) {
            videoFrame2 = null;
            z = false;
        } else {
            videoFrame2 = new VideoFrame(videoFrame.getBuffer().cropAndScale(0, 0, videoWidth, videoHeight, videoWidth, videoHeight), 0, videoFrame.getTimestampNs());
            z = true;
        }
        if (videoFrame2 != null) {
            nativeFrameCaptured(videoFrame2.getBuffer().getWidth(), videoFrame2.getBuffer().getHeight(), videoFrame2.getRotation(), videoFrame2.getTimestampNs(), videoFrame2.getBuffer(), this.p.ordinal(), this.f13926a);
            videoFrame2.release();
        } else {
            nativeFrameCaptured(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer(), this.p.ordinal(), this.f13926a);
        }
        this.i++;
        if (this.j == 0 || System.currentTimeMillis() - this.j >= 3000) {
            this.j = System.currentTimeMillis();
            TrtcLog.j("InputStream", "stream id: " + this.f13926a + " onFrame | fps:" + (this.i / 3));
            this.i = 0;
            if (z) {
                TrtcLog.j("InputStream", "video crop, " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " -> " + videoWidth + "x" + videoHeight);
            }
        }
    }

    public TrtcInputStreamImpl(e eVar, String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar) {
        this.c = false;
        this.h = new AtomicBoolean(false);
        this.i = 0;
        this.j = 0L;
        this.k = new Object();
        this.o = new AtomicBoolean(false);
        this.f13926a = str;
        this.b = trtcStreamConfig;
        this.d = eVar;
        this.c = false;
        this.p = trtcStreamConfig.getIsSub() ? TrtcDefines.TrtcFrameType.E_FRAME_SUB : TrtcDefines.TrtcFrameType.E_FRAME_PRI;
        if (trtcStreamConfig.isVideoEnable()) {
            this.e = SurfaceTextureHelper.create("STH-" + str, eVar.l());
            tmu.f("InputStream", "new inputstream for external video, id:" + str + " ,config:" + trtcStreamConfig.ToString());
            a aVar2 = new a(aVar, str);
            this.g = aVar2;
            if (this.e.getHandler() == null) {
                TrtcLog.i("InputStream", "create inputstream error for surfaceTextureHelper create error");
            } else {
                this.e.getHandler().post(aVar2);
            }
        } else {
            tmu.f("InputStream", "new inputstream for no video, id:" + str + " ,config:" + trtcStreamConfig.ToString());
        }
    }
}
