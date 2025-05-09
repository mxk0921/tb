package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.IArtcExternalVideoRender;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.VideoFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class plu implements IArtcExternalVideoRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IArtcExternalVideoRender.Observer f26165a;
    public VideoFrame e;
    public Handler g;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public String f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                plu.a(plu.this);
            }
        }
    }

    static {
        t2o.a(395313678);
        t2o.a(395313200);
    }

    public static /* synthetic */ void a(plu pluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dab66d4", new Object[]{pluVar});
        } else {
            pluVar.e();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        TrtcLog.i("TrtcExternalVideoRender", "init");
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    HandlerThread handlerThread = new HandlerThread("ExternalVideoRenderer");
                    handlerThread.start();
                    this.g = new Handler(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e755f879", new Object[]{this, str, videoFrame});
            return;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    TrtcLog.i("TrtcExternalVideoRender", "Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.d) {
                    VideoFrame videoFrame2 = this.e;
                    if (videoFrame2 != null) {
                        videoFrame2.release();
                    }
                    this.f = str;
                    this.e = videoFrame;
                    videoFrame.retain();
                    this.g.post(new a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        TrtcLog.i("TrtcExternalVideoRender", "release");
        synchronized (this.c) {
            try {
                Handler handler = this.g;
                if (handler != null) {
                    handler.getLooper().quit();
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28bbd9d", new Object[]{this});
            return;
        }
        synchronized (this.d) {
            try {
                VideoFrame videoFrame = this.e;
                if (videoFrame != null) {
                    this.e = null;
                    String str = this.f;
                    synchronized (this.b) {
                        try {
                            if (this.f26165a != null) {
                                IArtcExternalVideoRender.Frame frame = new IArtcExternalVideoRender.Frame();
                                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                                frame.dataY = i420.getDataY();
                                frame.dataU = i420.getDataU();
                                frame.dataV = i420.getDataV();
                                frame.strideY = i420.getStrideY();
                                frame.strideU = i420.getStrideU();
                                frame.strideV = i420.getStrideV();
                                frame.width = i420.getWidth();
                                frame.height = i420.getHeight();
                                frame.rotation = videoFrame.getRotation();
                                frame.timestampNs = videoFrame.getTimestampNs();
                                if (str == null) {
                                    this.f26165a.onFrame(frame);
                                } else {
                                    this.f26165a.onFrame(str, frame);
                                }
                                i420.release();
                                videoFrame.release();
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoRender
    public void setObserver(IArtcExternalVideoRender.Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6affd6", new Object[]{this, observer});
            return;
        }
        synchronized (this.b) {
            this.f26165a = observer;
        }
        TrtcLog.j("TrtcExternalVideoRender", "setObserver:" + observer);
    }
}
