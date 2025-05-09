package tb;

import android.content.Context;
import android.view.Surface;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.IArtcExternalVideoCapturer;
import com.taobao.trtc.utils.TrtcLog;
import java.nio.ByteBuffer;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class olu implements VideoCapturer, IArtcExternalVideoCapturer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TrtcExternalVideoCapturer";
    public SurfaceTextureHelper c;
    public SurfaceTextureHelper d;
    public IArtcExternalVideoCapturer.Observer i;
    public IArtcExternalVideoCapturer.Observer j;
    public n k;
    public m p;
    public m q;
    public k r;
    public k s;

    /* renamed from: a  reason: collision with root package name */
    public final Object f25470a = new Object();
    public final Object b = new Object();
    public l g = null;
    public l h = null;
    public CameraVideoCapturer.CameraEventsHandler l = null;
    public CameraVideoCapturer.CameraEventsHandler m = null;
    public CameraVideoCapturer.CameraStatistics n = null;
    public CameraVideoCapturer.CameraStatistics o = null;
    public nlu t = null;
    public Surface e = null;
    public Surface f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.olu.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b6aa5a7", new Object[]{this});
                return;
            }
            TrtcLog.j(olu.TAG, "onSubStatisticsStart");
            if (olu.e(olu.this) == null) {
                olu.f(olu.this, new CameraVideoCapturer.CameraStatistics(olu.c(olu.this), olu.g(olu.this)));
            }
            if (olu.h(olu.this) != null) {
                olu.h(olu.this).e(olu.e(olu.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25472a;
        public final /* synthetic */ int b;
        public final /* synthetic */ IArtcExternalVideoCapturer.CapturerType c;
        public final /* synthetic */ SurfaceTextureHelper d;

        public b(int i, int i2, IArtcExternalVideoCapturer.CapturerType capturerType, SurfaceTextureHelper surfaceTextureHelper) {
            this.f25472a = i;
            this.b = i2;
            this.c = capturerType;
            this.d = surfaceTextureHelper;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcLog.j(olu.TAG, "update VideoSize, " + this.f25472a + "x" + this.b + ", type: " + this.c);
            this.d.stopListening();
            if (olu.a(olu.this) != null) {
                olu.a(olu.this).a(this.c, this.f25472a, this.b);
            }
            this.d.setTextureSize(this.f25472a, this.b);
            IArtcExternalVideoCapturer.CapturerType capturerType = this.c;
            if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
                this.d.startListening(olu.b(olu.this));
            } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.SUB) {
                this.d.startListening(olu.h(olu.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IArtcExternalVideoCapturer.FrameInfo f25473a;

        public c(IArtcExternalVideoCapturer.FrameInfo frameInfo) {
            this.f25473a = frameInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (olu.i(olu.this)) {
                try {
                    if (!(olu.j(olu.this) == null || this.f25473a == null)) {
                        olu.j(olu.this).addBeautyFrame();
                        olu.j(olu.this).addBeautyCostTime(this.f25473a.preCostMs);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements CameraVideoCapturer.CameraEventsHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("128938f7", new Object[]{this});
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14a23346", new Object[]{this});
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e259615", new Object[]{this, str});
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226fce65", new Object[]{this, str});
            }
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
            } else {
                TrtcLog.i(olu.TAG, "pri capture onFirstFrameAvailable");
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraFreezed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c3133fa", new Object[]{this, str});
                return;
            }
            tmu.f(olu.TAG, "Pri external capture freezed");
            if (cmu.b("enableCaptureFreezedUpdate", true)) {
                olu.l(olu.this).q1(str, "pri");
            }
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
    public class e implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.olu.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b6aa5a7", new Object[]{this});
                return;
            }
            TrtcLog.j(olu.TAG, "onPriStatisticsStart");
            if (olu.j(olu.this) == null) {
                olu.k(olu.this, new CameraVideoCapturer.CameraStatistics(olu.m(olu.this), olu.n(olu.this)));
            }
            if (olu.b(olu.this) != null) {
                olu.b(olu.this).e(olu.j(olu.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            olu.m(olu.this).startListening(olu.b(olu.this));
            if (olu.o(olu.this) != null) {
                olu.m(olu.this).setTextureSize(olu.o(olu.this).f25482a, olu.o(olu.this).b);
            } else {
                TrtcLog.i(olu.TAG, "start PRI capture error for video size invalid");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                olu.m(olu.this).stopListening();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25478a;
        public final /* synthetic */ int b;

        public h(int i, int i2) {
            this.f25478a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            olu.c(olu.this).startListening(olu.h(olu.this));
            if (olu.d(olu.this) != null) {
                TrtcLog.j(olu.TAG, "subSurface setTextureSize: " + olu.d(olu.this).f25482a + "x" + olu.d(olu.this).b);
                olu.c(olu.this).setTextureSize(olu.d(olu.this).f25482a, olu.d(olu.this).b);
                return;
            }
            olu.c(olu.this).setTextureSize(this.f25478a, this.b);
            TrtcLog.j(olu.TAG, "SUB start capture error for video size invalid, use size from video layout");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                olu.c(olu.this).stopListening();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements CameraVideoCapturer.CameraEventsHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("128938f7", new Object[]{this});
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14a23346", new Object[]{this});
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e259615", new Object[]{this, str});
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226fce65", new Object[]{this, str});
            }
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
            } else {
                TrtcLog.i(olu.TAG, "pri capture onFirstFrameAvailable");
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraFreezed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c3133fa", new Object[]{this, str});
                return;
            }
            tmu.f(olu.TAG, "Sub external capture freezed");
            if (cmu.b("enableCaptureFreezedUpdate", true)) {
                olu.l(olu.this).q1(str, pg1.ATOM_EXT_sub);
            }
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
    public interface k {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l implements VideoSink {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f25481a;
        public final Object b = new Object();
        public CameraVideoCapturer.CameraStatistics c;
        public CapturerObserver d;
        public final k e;
        public final IArtcExternalVideoCapturer.CapturerType f;

        static {
            t2o.a(395313675);
            t2o.a(395313851);
        }

        public l(CapturerObserver capturerObserver, k kVar, IArtcExternalVideoCapturer.CapturerType capturerType) {
            Object obj = new Object();
            this.f25481a = obj;
            TrtcLog.j(olu.TAG, "TrtcVideoSink ctor capturerType:" + capturerType);
            synchronized (obj) {
                this.d = capturerObserver;
            }
            this.e = kVar;
            this.f = capturerType;
        }

        public static /* synthetic */ CapturerObserver a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CapturerObserver) ipChange.ipc$dispatch("11e48751", new Object[]{lVar});
            }
            return lVar.d;
        }

        public static /* synthetic */ CapturerObserver b(l lVar, CapturerObserver capturerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CapturerObserver) ipChange.ipc$dispatch("31045c49", new Object[]{lVar, capturerObserver});
            }
            lVar.d = capturerObserver;
            return capturerObserver;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a186f4c", new Object[]{this});
                return;
            }
            TrtcLog.j(olu.TAG, "resetObserver");
            synchronized (this.f25481a) {
                TrtcLog.j(olu.TAG, "capturerObserver = null");
                this.d = null;
            }
        }

        public void d(CapturerObserver capturerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("696f9209", new Object[]{this, capturerObserver});
                return;
            }
            synchronized (this.f25481a) {
                this.d = capturerObserver;
            }
        }

        public void e(CameraVideoCapturer.CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cd70474", new Object[]{this, cameraStatistics});
                return;
            }
            synchronized (this.b) {
                TrtcLog.j(olu.TAG, "setStatistics, statistics: " + cameraStatistics);
                this.c = cameraStatistics;
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2148292c", new Object[]{this});
                return;
            }
            TrtcLog.j(olu.TAG, "startStatistics, type: " + this.f);
            k kVar = this.e;
            if (kVar != null) {
                kVar.a();
            }
        }

        public void g(CapturerObserver capturerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0a4f582", new Object[]{this, capturerObserver});
                return;
            }
            synchronized (this.f25481a) {
                if (capturerObserver != null) {
                    try {
                        if (capturerObserver != this.d) {
                            TrtcLog.j(olu.TAG, "updateObserver, " + this.d + " -> " + capturerObserver);
                            this.d = capturerObserver;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
                return;
            }
            synchronized (this.f25481a) {
                try {
                    if (this.d != null) {
                        if (this.c != null) {
                            videoFrame.setTimestampNs(videoFrame.getTimestampNs() - (CameraVideoCapturer.CameraStatistics.preProcessCostTime * 1000000));
                        }
                        this.d.onFrameCaptured(videoFrame);
                    }
                } finally {
                }
            }
            synchronized (this.b) {
                try {
                    CameraVideoCapturer.CameraStatistics cameraStatistics = this.c;
                    if (cameraStatistics != null) {
                        cameraStatistics.addFrame();
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public int f25482a;
        public int b;

        static {
            t2o.a(395313676);
        }

        public m(int i, int i2) {
            this.f25482a = i;
            this.b = i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface n {
        void a(IArtcExternalVideoCapturer.CapturerType capturerType, int i, int i2);
    }

    static {
        t2o.a(395313663);
        t2o.a(395313839);
        t2o.a(395313195);
    }

    public static /* synthetic */ n a(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("fc9f0ff5", new Object[]{oluVar});
        }
        return oluVar.k;
    }

    public static /* synthetic */ l b(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("522339c5", new Object[]{oluVar});
        }
        return oluVar.g;
    }

    public static /* synthetic */ SurfaceTextureHelper c(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("151010cd", new Object[]{oluVar});
        }
        return oluVar.d;
    }

    public static /* synthetic */ m d(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("8e5e49bb", new Object[]{oluVar});
        }
        return oluVar.q;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics e(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("d6fb12fd", new Object[]{oluVar});
        }
        return oluVar.o;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics f(olu oluVar, CameraVideoCapturer.CameraStatistics cameraStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("82cfafe5", new Object[]{oluVar, cameraStatistics});
        }
        oluVar.o = cameraStatistics;
        return cameraStatistics;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraEventsHandler g(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraEventsHandler) ipChange.ipc$dispatch("ff8d0b86", new Object[]{oluVar});
        }
        return oluVar.m;
    }

    public static /* synthetic */ l h(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("9b3a4064", new Object[]{oluVar});
        }
        return oluVar.h;
    }

    public static /* synthetic */ Object i(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79481b7", new Object[]{oluVar});
        }
        return oluVar.f25470a;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics j(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("4536580a", new Object[]{oluVar});
        }
        return oluVar.n;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics k(olu oluVar, CameraVideoCapturer.CameraStatistics cameraStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("1d587a78", new Object[]{oluVar, cameraStatistics});
        }
        oluVar.n = cameraStatistics;
        return cameraStatistics;
    }

    public static /* synthetic */ nlu l(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nlu) ipChange.ipc$dispatch("1edaa9", new Object[]{oluVar});
        }
        return oluVar.t;
    }

    public static /* synthetic */ SurfaceTextureHelper m(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("aff56b56", new Object[]{oluVar});
        }
        return oluVar.c;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraEventsHandler n(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraEventsHandler) ipChange.ipc$dispatch("432b5cdb", new Object[]{oluVar});
        }
        return oluVar.l;
    }

    public static /* synthetic */ m o(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("489b7742", new Object[]{oluVar});
        }
        return oluVar.p;
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03670f", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            TrtcLog.j(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableBeautyProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92077f9d", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableShapeProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1558f91c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public Surface getSurface(IArtcExternalVideoCapturer.CapturerType capturerType) {
        Surface surface;
        Surface surface2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("8bc907c5", new Object[]{this, capturerType});
        }
        if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            synchronized (this.f25470a) {
                try {
                    if (this.c != null && this.e == null) {
                        TrtcLog.j(TAG, "new priSurface");
                        this.e = new Surface(this.c.getSurfaceTexture());
                    }
                    TrtcLog.j(TAG, "get pri surface:" + this.e + ", priSurfaceTextureHelper:" + this.c);
                    surface2 = this.e;
                } finally {
                }
            }
            return surface2;
        }
        synchronized (this.b) {
            try {
                if (this.d != null && this.f == null) {
                    TrtcLog.j(TAG, "new subSurface");
                    this.f = new Surface(this.d.getSurfaceTexture());
                }
                TrtcLog.j(TAG, "get sub surface:" + this.f + ", subSurfaceTextureHelper:" + this.d);
                surface = this.f;
            } finally {
            }
        }
        return surface;
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2bf1fa", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db66480", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void onVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e83fa40", new Object[]{this, videoFrame});
        }
    }

    public void p(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0993c31", new Object[]{this, surfaceTextureHelper});
            return;
        }
        synchronized (this.b) {
            try {
                TrtcLog.j(TAG, "initSubCapture:" + surfaceTextureHelper);
                this.d = surfaceTextureHelper;
                if (this.j != null) {
                    TrtcLog.i(TAG, "initSubCapture onExternalVideoCaptureInitialized");
                    this.j.onExternalVideoCaptureInitialized();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(nlu nluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4381e1d6", new Object[]{this, nluVar});
        } else {
            this.t = nluVar;
        }
    }

    public void r(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfeb94d0", new Object[]{this, nVar});
            return;
        }
        this.k = nVar;
        TrtcLog.j(TAG, "set video size observer: " + nVar);
    }

    @Override // org.webrtc.VideoCapturer
    public void resetCapturerObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df0458", new Object[]{this});
            return;
        }
        synchronized (this.f25470a) {
            try {
                if (this.g != null) {
                    TrtcLog.j(TAG, "resetCapturerObserver");
                    this.g.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBeautyParam(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c267736", new Object[]{this, new Float(f2), new Float(f3)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBlack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee5c90", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setDummyRender(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ed1b87", new Object[]{this, ljuVar});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setFaceParam(float f2, float f3, float f4, float f5, float f6, float f7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd578fb5", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7)});
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public void setObserver(IArtcExternalVideoCapturer.CapturerType capturerType, IArtcExternalVideoCapturer.Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca1efef", new Object[]{this, capturerType, observer});
            return;
        }
        if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            synchronized (this.f25470a) {
                this.i = observer;
            }
        } else {
            synchronized (this.b) {
                this.j = observer;
            }
        }
        TrtcLog.j(TAG, "setObserver:" + observer + " type:" + capturerType);
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubCapturerObserver(CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad1ce1", new Object[]{this, capturerObserver});
            return;
        }
        synchronized (this.b) {
            if (capturerObserver != null) {
                try {
                    TrtcLog.j(TAG, "setSubCapturerObserver:" + capturerObserver);
                    if (this.m == null) {
                        this.m = new j();
                    }
                    this.s = new a();
                    l lVar = this.h;
                    if (lVar == null) {
                        TrtcLog.j(TAG, "new subVideoSink");
                        this.h = new l(capturerObserver, this.s, IArtcExternalVideoCapturer.CapturerType.SUB);
                    } else if (l.a(lVar) == null) {
                        TrtcLog.j(TAG, "subVideoSink setObserver");
                        this.h.d(capturerObserver);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (capturerObserver == null && this.h != null) {
                TrtcLog.j(TAG, "resetSubCapturerObserver");
                this.h.c();
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubDummyRender(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ceb6eb", new Object[]{this, ljuVar});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setVideoContentMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3c05ae", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public void setVideoSize(IArtcExternalVideoCapturer.CapturerType capturerType, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29759da", new Object[]{this, capturerType, new Integer(i2), new Integer(i3)});
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            TrtcLog.j(TAG, "PRI setVideoSize, " + i2 + "x" + i3);
            m mVar = this.p;
            if (mVar == null || (mVar.f25482a == i2 && mVar.b == i3)) {
                this.p = new m(i2, i3);
                return;
            }
            mVar.f25482a = i2;
            mVar.b = i3;
            v(capturerType, this.c, i2, i3);
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.SUB) {
            TrtcLog.j(TAG, "SUB setVideoSize, " + i2 + "x" + i3);
            m mVar2 = this.q;
            if (mVar2 == null) {
                this.q = new m(i2, i3);
            } else if (mVar2.f25482a != i2 || mVar2.b != i3) {
                mVar2.f25482a = i2;
                mVar2.b = i3;
                v(capturerType, this.d, i2, i3);
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        TrtcLog.j(TAG, "stopCapture");
        SurfaceTextureHelper surfaceTextureHelper = this.c;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.getHandler().post(new g());
        }
        synchronized (this.f25470a) {
            try {
                l lVar = this.g;
                if (lVar != null) {
                    lVar.e(null);
                    if (l.a(this.g) != null) {
                        l.a(this.g).onCapturerStopped();
                    }
                }
                IArtcExternalVideoCapturer.Observer observer = this.i;
                if (observer != null) {
                    observer.onExternalVideoCaptureStopped();
                }
                CameraVideoCapturer.CameraStatistics cameraStatistics = this.n;
                if (cameraStatistics != null) {
                    cameraStatistics.release();
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498630f", new Object[]{this});
            return;
        }
        TrtcLog.j(TAG, "stopSubCapture");
        SurfaceTextureHelper surfaceTextureHelper = this.d;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.getHandler().post(new i());
        }
        synchronized (this.b) {
            try {
                l lVar = this.h;
                if (!(lVar == null || l.a(lVar) == null)) {
                    l.a(this.h).onCapturerStopped();
                    l.b(this.h, null);
                }
                IArtcExternalVideoCapturer.Observer observer = this.j;
                if (observer != null) {
                    observer.onExternalVideoCaptureStopped();
                }
                CameraVideoCapturer.CameraStatistics cameraStatistics = this.o;
                if (cameraStatistics != null) {
                    cameraStatistics.release();
                    this.o = null;
                }
                TrtcLog.j(TAG, "subVideoSink = null subSurface = null");
                this.h = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public void updateFrameInfo(IArtcExternalVideoCapturer.CapturerType capturerType, IArtcExternalVideoCapturer.FrameInfo frameInfo) {
        SurfaceTextureHelper surfaceTextureHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec841d36", new Object[]{this, capturerType, frameInfo});
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI && this.n != null && (surfaceTextureHelper = this.c) != null) {
            surfaceTextureHelper.getHandler().post(new c(frameInfo));
        }
    }

    public final void v(IArtcExternalVideoCapturer.CapturerType capturerType, SurfaceTextureHelper surfaceTextureHelper, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7945cd", new Object[]{this, capturerType, surfaceTextureHelper, new Integer(i2), new Integer(i3)});
        } else if (surfaceTextureHelper != null) {
            surfaceTextureHelper.getHandler().post(new b(i2, i3, capturerType, surfaceTextureHelper));
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a2077", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
            return;
        }
        synchronized (this.f25470a) {
            try {
                TrtcLog.j(TAG, "Initialize, surfaceTextureHelper:" + surfaceTextureHelper + ", capture observer:" + capturerObserver);
                this.c = surfaceTextureHelper;
                if (this.l == null) {
                    this.l = new d();
                }
                this.r = new e();
                if (this.g == null && capturerObserver != null) {
                    this.g = new l(capturerObserver, this.r, IArtcExternalVideoCapturer.CapturerType.PRI);
                }
                if (this.i != null) {
                    TrtcLog.i(TAG, "startPriCapture onExternalVideoCaptureInitialized");
                    this.i.onExternalVideoCaptureInitialized();
                }
                this.g.g(capturerObserver);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2a380f", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        synchronized (this.b) {
            try {
                TrtcLog.j(TAG, "startSubCapture width:" + i2 + " height:" + i3);
                l lVar = this.h;
                if (!(lVar == null || l.a(lVar) == null)) {
                    l.a(this.h).onCapturerStarted(true);
                }
                SurfaceTextureHelper surfaceTextureHelper = this.d;
                if (!(surfaceTextureHelper == null || surfaceTextureHelper.getHandler() == null)) {
                    this.d.getHandler().post(new h(i2, i3));
                }
                if (this.j != null) {
                    TrtcLog.i(TAG, "startSubCapture onExternalVideoCaptureStarted");
                    this.j.onExternalVideoCaptureStarted();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95964b", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        synchronized (this.f25470a) {
            try {
                TrtcLog.j(TAG, "startCapture, " + i2 + "x" + i3 + "@" + i4 + "fps, format:" + i5);
                l lVar = this.g;
                if (!(lVar == null || l.a(lVar) == null)) {
                    l.a(this.g).onCapturerStarted(true);
                }
                SurfaceTextureHelper surfaceTextureHelper = this.c;
                if (!(surfaceTextureHelper == null || surfaceTextureHelper.getHandler() == null)) {
                    this.c.getHandler().post(new f());
                }
                if (this.i != null) {
                    TrtcLog.i(TAG, "startPriCapture onExternalVideoCaptureStarted");
                    this.i.onExternalVideoCaptureStarted();
                    l lVar2 = this.g;
                    if (lVar2 != null) {
                        lVar2.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(int i2) {
        IArtcExternalVideoCapturer.MixMode mixMode;
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d115c06", new Object[]{this, new Integer(i2)});
            return;
        }
        TrtcLog.j(TAG, "updateMixMode: " + i2);
        if (i2 == 1) {
            mixMode = IArtcExternalVideoCapturer.MixMode.NEED_MIX_SCALE;
        } else if (i2 != 3) {
            mixMode = IArtcExternalVideoCapturer.MixMode.NONE;
        } else {
            mixMode = IArtcExternalVideoCapturer.MixMode.NEED_SCALE;
        }
        IArtcExternalVideoCapturer.Observer observer = this.i;
        if (observer != null) {
            observer.onExternalVideoCaptureMixMode(mixMode);
            if ((mixMode == IArtcExternalVideoCapturer.MixMode.NEED_MIX_SCALE || mixMode == IArtcExternalVideoCapturer.MixMode.NEED_SCALE) && (lVar = this.h) != null) {
                lVar.f();
            }
        }
    }
}
