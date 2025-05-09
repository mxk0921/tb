package org.webrtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcVideoLayout;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.artc.video.AliMediaFrameProcess;
import com.taobao.trtc.api.TrtcVideoLayout;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoFrame;
import tb.lju;
import tb.t2o;
import tb.tlu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class CameraCapturer implements CameraVideoCapturer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float[] IDENTITY;
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private VideoFrame beautyPendingFrame;
    private final CameraEnumerator cameraEnumerator;
    private int cameraFacing;
    private String cameraName;
    private CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;
    private CameraSession currentSession;
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private tlu.d imageListener;
    private Context mCtx;
    public Matrix mtx;
    public int oesTextureId;
    private int openAttemptsRemaining;
    private VideoFrame pendingFrame;
    private boolean sessionOpening;
    public Bitmap snapshot;
    private CapturerObserver subCapturerObserver;
    private tlu.d subImageListener;
    private SurfaceTextureHelper surfaceHelper;
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    public TextureBufferImpl tBuf;
    private final Handler uiThreadHandler;
    private int videoHeight;
    private ArtcVideoLayout videoLayout;
    private AliMediaFrameProcess videoProcess;
    private int videoWidth;
    private int width;
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5a137dd", new Object[]{this, cameraSession});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            Logging.d(CameraCapturer.TAG, "Create session done. Switch state: " + CameraCapturer.access$100(CameraCapturer.this));
            CameraCapturer.access$300(CameraCapturer.this).removeCallbacks(CameraCapturer.access$200(CameraCapturer.this));
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (CameraCapturer.access$500(CameraCapturer.this) != null) {
                        CameraCapturer.access$500(CameraCapturer.this).onCapturerStarted(true);
                    }
                    CameraCapturer.access$602(CameraCapturer.this, false);
                    CameraCapturer.access$702(CameraCapturer.this, cameraSession);
                    CameraCapturer.access$802(CameraCapturer.this, new CameraVideoCapturer.CameraStatistics(CameraCapturer.access$900(CameraCapturer.this), CameraCapturer.access$1000(CameraCapturer.this)));
                    CameraCapturer.access$1102(CameraCapturer.this, false);
                    CameraCapturer.access$400(CameraCapturer.this).notifyAll();
                    if (CameraCapturer.access$100(CameraCapturer.this) == SwitchState.IN_PROGRESS) {
                        CameraCapturer.access$102(CameraCapturer.this, SwitchState.IDLE);
                        if (CameraCapturer.access$1200(CameraCapturer.this) != null) {
                            CameraCapturer.access$1200(CameraCapturer.this).onCameraSwitchDone(CameraCapturer.access$1400(CameraCapturer.this).isFrontFacing(CameraCapturer.access$1300(CameraCapturer.this)));
                            CameraCapturer.access$1202(CameraCapturer.this, null);
                        }
                    } else if (CameraCapturer.access$100(CameraCapturer.this) == SwitchState.PENDING) {
                        CameraCapturer.access$102(CameraCapturer.this, SwitchState.IDLE);
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        CameraCapturer.access$1500(cameraCapturer, CameraCapturer.access$1200(cameraCapturer));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41c1c171", new Object[]{this, failureType, str});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            CameraCapturer.access$300(CameraCapturer.this).removeCallbacks(CameraCapturer.access$200(CameraCapturer.this));
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (CameraCapturer.access$500(CameraCapturer.this) != null) {
                        CameraCapturer.access$500(CameraCapturer.this).onCapturerStarted(false);
                    }
                    CameraCapturer.access$1610(CameraCapturer.this);
                    if (CameraCapturer.access$1600(CameraCapturer.this) <= 0) {
                        Logging.w(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                        CameraCapturer.access$602(CameraCapturer.this, false);
                        CameraCapturer.access$400(CameraCapturer.this).notifyAll();
                        SwitchState access$100 = CameraCapturer.access$100(CameraCapturer.this);
                        SwitchState switchState = SwitchState.IDLE;
                        if (access$100 != switchState) {
                            if (CameraCapturer.access$1200(CameraCapturer.this) != null) {
                                CameraCapturer.access$1200(CameraCapturer.this).onCameraSwitchError(str);
                                CameraCapturer.access$1202(CameraCapturer.this, null);
                            }
                            CameraCapturer.access$102(CameraCapturer.this, switchState);
                        }
                        if (failureType == CameraSession.FailureType.DISCONNECTED) {
                            CameraCapturer.access$1000(CameraCapturer.this).onCameraDisconnected();
                        } else {
                            CameraCapturer.access$1000(CameraCapturer.this).onCameraError(str);
                        }
                    } else {
                        Logging.w(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                        CameraCapturer.access$1700(CameraCapturer.this, 500);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: org.webrtc.CameraCapturer.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f77a5a0c", new Object[]{this, cameraSession});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (cameraSession == CameraCapturer.access$700(CameraCapturer.this) || CameraCapturer.access$700(CameraCapturer.this) == null) {
                        CameraCapturer.access$1000(CameraCapturer.this).onCameraClosed();
                    } else {
                        Logging.d(CameraCapturer.TAG, "onCameraClosed from another session.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5f2ff9b", new Object[]{this, cameraSession});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (cameraSession != CameraCapturer.access$700(CameraCapturer.this)) {
                        Logging.w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                        return;
                    }
                    CameraCapturer.access$1000(CameraCapturer.this).onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d69a0aea", new Object[]{this, cameraSession, str});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (cameraSession != CameraCapturer.access$700(CameraCapturer.this)) {
                        Logging.w(CameraCapturer.TAG, "onCameraError from another session: " + str);
                        return;
                    }
                    CameraCapturer.access$1000(CameraCapturer.this).onCameraError(str);
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2039255b", new Object[]{this});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (CameraCapturer.access$700(CameraCapturer.this) != null) {
                        Logging.w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.access$1000(CameraCapturer.this).onCameraOpening(CameraCapturer.access$1300(CameraCapturer.this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e433dd0", new Object[]{this, cameraSession, videoFrame});
                return;
            }
            CameraCapturer.access$000(CameraCapturer.this);
            synchronized (CameraCapturer.access$400(CameraCapturer.this)) {
                try {
                    if (cameraSession != CameraCapturer.access$700(CameraCapturer.this)) {
                        Logging.w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.access$1100(CameraCapturer.this)) {
                        CameraCapturer.access$1000(CameraCapturer.this).onFirstFrameAvailable();
                        CameraCapturer.access$1102(CameraCapturer.this, true);
                    }
                    if (!(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                        NV21Buffer nV21Buffer = (NV21Buffer) videoFrame.getBuffer();
                        if (CameraCapturer.access$1800(CameraCapturer.this) && CameraCapturer.access$1900(CameraCapturer.this) != null) {
                            CameraCapturer.access$1900(CameraCapturer.this).h(nV21Buffer.getData(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), CameraCapturer.access$2000(CameraCapturer.this), CameraCapturer.access$2100(CameraCapturer.this));
                        }
                        if (CameraCapturer.access$1000(CameraCapturer.this).onCameraPreview(ByteBuffer.wrap(nV21Buffer.getData()), AConstants.ColorSpace.C_NV12, nV21Buffer.getWidth(), nV21Buffer.getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs()) < 0) {
                        }
                    } else {
                        if (CameraCapturer.access$1800(CameraCapturer.this)) {
                            CameraCapturer.access$2200(CameraCapturer.this, videoFrame);
                            CameraCapturer.access$800(CameraCapturer.this).addBeautyFrame();
                        } else {
                            CameraCapturer.access$2300(CameraCapturer.this, videoFrame);
                        }
                        CameraCapturer.access$800(CameraCapturer.this).addFrame();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: org.webrtc.CameraCapturer.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CameraCapturer.access$1000(CameraCapturer.this).onCameraError("Camera failed to start within timeout.");
            }
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;
    private final Object snapshotLock = new Object();
    private boolean takeSnapshot = false;
    private boolean enableBeautyProcess = false;
    private boolean enableShapeProcess = false;
    private lju dummyRender = null;
    private lju subDummyRender = null;
    private boolean priTextureFrameNeedConvertToYuv = false;
    private boolean subTextureFrameNeedConvertToYuv = false;
    private boolean videoMirror = false;
    private int stored_rotation = 0;
    private long stored_timestamp_ns = 0;
    private int outputFormat = 2;
    private AtomicBoolean hasMixedFrame = new AtomicBoolean(false);
    private int subWidth = 360;
    private int subHeight = 640;
    private boolean updateVideoLayout = false;
    private boolean videoLayoutIsSet = false;
    private final Object beautyFrameLock = new Object();
    private int beautyCostPerFrame = 0;
    private int logCount = 0;
    private final Object remoteFrameLock = new Object();
    private boolean needMix = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SwitchState switchState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/CameraCapturer$SwitchState");
        }

        public static SwitchState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SwitchState) ipChange.ipc$dispatch("a53346a9", new Object[]{str});
            }
            return (SwitchState) Enum.valueOf(SwitchState.class, str);
        }
    }

    static {
        t2o.a(395313700);
        t2o.a(395313728);
        float[] fArr = new float[16];
        IDENTITY = fArr;
        android.opengl.Matrix.setIdentityM(fArr, 0);
    }

    public CameraCapturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.mCtx = null;
        this.imageListener = null;
        this.subImageListener = null;
        this.mCtx = context;
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
            public void onCameraError(String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e259615", new Object[]{this, str2});
                }
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8c3133fa", new Object[]{this, str2});
                }
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("226fce65", new Object[]{this, str2});
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
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.cameraFacing = cameraEnumerator.isFrontFacing(str) ? 1 : 0;
        Logging.d(TAG, "CameraCapturer: name:" + str + ", facing:" + this.cameraFacing);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        } else if (Arrays.asList(deviceNames).contains(this.cameraName)) {
            this.imageListener = new tlu.d() { // from class: org.webrtc.CameraCapturer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tlu.d
                public void onImageArrive() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b88257ba", new Object[]{this});
                    }
                }

                @Override // tb.tlu.d
                public void onRawData(byte[] bArr, int i, int i2, int i3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9dde94a2", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else if (i3 == 1 || i3 == 2) {
                        RGBABuffer rGBABuffer = new RGBABuffer(i, i2, i, bArr, new Runnable() { // from class: org.webrtc.CameraCapturer.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                }
                            }
                        });
                        if (!CameraCapturer.access$2400(CameraCapturer.this).get()) {
                            VideoFrame videoFrame = new VideoFrame(rGBABuffer, CameraCapturer.access$2500(CameraCapturer.this), CameraCapturer.access$2600(CameraCapturer.this));
                            CameraCapturer.this.checkNeedTakeSnapshot(videoFrame);
                            if (CameraCapturer.access$500(CameraCapturer.this) != null) {
                                CameraCapturer.access$500(CameraCapturer.this).onFrameCaptured(videoFrame);
                            }
                            videoFrame.release();
                        } else if (CameraCapturer.access$1900(CameraCapturer.this) != null) {
                            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(CameraCapturer.access$2700(CameraCapturer.this), CameraCapturer.access$2800(CameraCapturer.this), VideoFrame.TextureBuffer.Type.RGB, CameraCapturer.access$1900(CameraCapturer.this).d(AliMediaFrameProcess.TextureType.SCALE_TEXTURE), new Matrix(), null, null, null);
                            VideoFrame videoFrame2 = new VideoFrame(rGBABuffer, textureBufferImpl, CameraCapturer.access$2500(CameraCapturer.this), CameraCapturer.access$2600(CameraCapturer.this));
                            if (CameraCapturer.access$500(CameraCapturer.this) != null) {
                                CameraCapturer.access$500(CameraCapturer.this).onFrameCaptured(videoFrame2);
                            }
                            videoFrame2.release();
                            textureBufferImpl.release();
                        }
                    }
                }
            };
            this.subImageListener = new tlu.d() { // from class: org.webrtc.CameraCapturer.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tlu.d
                public void onImageArrive() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b88257ba", new Object[]{this});
                    }
                }

                @Override // tb.tlu.d
                public void onRawData(byte[] bArr, int i, int i2, int i3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9dde94a2", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else if (i3 == 1 || i3 == 2) {
                        VideoFrame videoFrame = new VideoFrame(new RGBABuffer(i, i2, i, bArr, new Runnable() { // from class: org.webrtc.CameraCapturer.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                }
                            }
                        }), CameraCapturer.access$2500(CameraCapturer.this), CameraCapturer.access$2600(CameraCapturer.this));
                        if (CameraCapturer.access$2900(CameraCapturer.this) != null) {
                            CameraCapturer.this.checkNeedTakeSnapshot(videoFrame);
                            CameraCapturer.access$2900(CameraCapturer.this).onFrameCaptured(videoFrame);
                            videoFrame.release();
                        }
                    }
                }
            };
        } else {
            throw new IllegalArgumentException("Camera name " + this.cameraName + " does not match any known camera device.");
        }
    }

    public static /* synthetic */ void access$000(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59db482", new Object[]{cameraCapturer});
        } else {
            cameraCapturer.checkIsOnCameraThread();
        }
    }

    public static /* synthetic */ SwitchState access$100(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchState) ipChange.ipc$dispatch("8b75e191", new Object[]{cameraCapturer});
        }
        return cameraCapturer.switchState;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraEventsHandler access$1000(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraEventsHandler) ipChange.ipc$dispatch("c6791fbf", new Object[]{cameraCapturer});
        }
        return cameraCapturer.eventsHandler;
    }

    public static /* synthetic */ SwitchState access$102(CameraCapturer cameraCapturer, SwitchState switchState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchState) ipChange.ipc$dispatch("999db2f1", new Object[]{cameraCapturer, switchState});
        }
        cameraCapturer.switchState = switchState;
        return switchState;
    }

    public static /* synthetic */ boolean access$1100(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("475cc616", new Object[]{cameraCapturer})).booleanValue();
        }
        return cameraCapturer.firstFrameObserved;
    }

    public static /* synthetic */ boolean access$1102(CameraCapturer cameraCapturer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fec2708", new Object[]{cameraCapturer, new Boolean(z)})).booleanValue();
        }
        cameraCapturer.firstFrameObserved = z;
        return z;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraSwitchHandler access$1200(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraSwitchHandler) ipChange.ipc$dispatch("834785dc", new Object[]{cameraCapturer});
        }
        return cameraCapturer.switchEventsHandler;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraSwitchHandler access$1202(CameraCapturer cameraCapturer, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraSwitchHandler) ipChange.ipc$dispatch("72647727", new Object[]{cameraCapturer, cameraSwitchHandler});
        }
        cameraCapturer.switchEventsHandler = cameraSwitchHandler;
        return cameraSwitchHandler;
    }

    public static /* synthetic */ String access$1300(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("539a1050", new Object[]{cameraCapturer});
        }
        return cameraCapturer.cameraName;
    }

    public static /* synthetic */ CameraEnumerator access$1400(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraEnumerator) ipChange.ipc$dispatch("988bdb20", new Object[]{cameraCapturer});
        }
        return cameraCapturer.cameraEnumerator;
    }

    public static /* synthetic */ void access$1500(CameraCapturer cameraCapturer, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5d7de5", new Object[]{cameraCapturer, cameraSwitchHandler});
        } else {
            cameraCapturer.switchCameraInternal(cameraSwitchHandler);
        }
    }

    public static /* synthetic */ int access$1600(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78fb9aa0", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.openAttemptsRemaining;
    }

    public static /* synthetic */ int access$1610(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6d356a1", new Object[]{cameraCapturer})).intValue();
        }
        int i = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i - 1;
        return i;
    }

    public static /* synthetic */ void access$1700(CameraCapturer cameraCapturer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50edb7", new Object[]{cameraCapturer, new Integer(i)});
        } else {
            cameraCapturer.createSessionInternal(i);
        }
    }

    public static /* synthetic */ boolean access$1800(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f33b22ef", new Object[]{cameraCapturer})).booleanValue();
        }
        return cameraCapturer.enableBeautyProcess;
    }

    public static /* synthetic */ AliMediaFrameProcess access$1900(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliMediaFrameProcess) ipChange.ipc$dispatch("1bc82243", new Object[]{cameraCapturer});
        }
        return cameraCapturer.videoProcess;
    }

    public static /* synthetic */ AliMediaFrameProcess access$1902(CameraCapturer cameraCapturer, AliMediaFrameProcess aliMediaFrameProcess) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliMediaFrameProcess) ipChange.ipc$dispatch("5711182e", new Object[]{cameraCapturer, aliMediaFrameProcess});
        }
        cameraCapturer.videoProcess = aliMediaFrameProcess;
        return aliMediaFrameProcess;
    }

    public static /* synthetic */ Runnable access$200(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e304b0d4", new Object[]{cameraCapturer});
        }
        return cameraCapturer.openCameraTimeoutRunnable;
    }

    public static /* synthetic */ int access$2000(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7115c1a7", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.cameraFacing;
    }

    public static /* synthetic */ boolean access$2100(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae3585d7", new Object[]{cameraCapturer})).booleanValue();
        }
        return cameraCapturer.videoMirror;
    }

    public static /* synthetic */ void access$2200(CameraCapturer cameraCapturer, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2041f406", new Object[]{cameraCapturer, videoFrame});
        } else {
            cameraCapturer.beautyFrame(videoFrame);
        }
    }

    public static /* synthetic */ void access$2300(CameraCapturer cameraCapturer, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d5fd07", new Object[]{cameraCapturer, videoFrame});
        } else {
            cameraCapturer.checkNeedMirrorFrameAndDeliver(videoFrame);
        }
    }

    public static /* synthetic */ AtomicBoolean access$2400(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("e3ea8b70", new Object[]{cameraCapturer});
        }
        return cameraCapturer.hasMixedFrame;
    }

    public static /* synthetic */ int access$2500(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2b49642", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.stored_rotation;
    }

    public static /* synthetic */ long access$2600(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfd45a62", new Object[]{cameraCapturer})).longValue();
        }
        return cameraCapturer.stored_timestamp_ns;
    }

    public static /* synthetic */ int access$2700(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cf41e80", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.subWidth;
    }

    public static /* synthetic */ int access$2800(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a13e29f", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.subHeight;
    }

    public static /* synthetic */ CapturerObserver access$2900(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CapturerObserver) ipChange.ipc$dispatch("cd78f083", new Object[]{cameraCapturer});
        }
        return cameraCapturer.subCapturerObserver;
    }

    public static /* synthetic */ Handler access$300(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("8ab06b87", new Object[]{cameraCapturer});
        }
        return cameraCapturer.uiThreadHandler;
    }

    public static /* synthetic */ CameraSession.CreateSessionCallback access$3000(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraSession.CreateSessionCallback) ipChange.ipc$dispatch("67811b", new Object[]{cameraCapturer});
        }
        return cameraCapturer.createSessionCallback;
    }

    public static /* synthetic */ CameraSession.Events access$3100(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraSession.Events) ipChange.ipc$dispatch("119892e2", new Object[]{cameraCapturer});
        }
        return cameraCapturer.cameraSessionEventsHandler;
    }

    public static /* synthetic */ Context access$3200(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("28b53fab", new Object[]{cameraCapturer});
        }
        return cameraCapturer.applicationContext;
    }

    public static /* synthetic */ int access$3300(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f4dcdc5", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.width;
    }

    public static /* synthetic */ int access$3400(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc6d91e4", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.height;
    }

    public static /* synthetic */ int access$3500(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98d5603", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.framerate;
    }

    public static /* synthetic */ int access$3600(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46ad1a22", new Object[]{cameraCapturer})).intValue();
        }
        return cameraCapturer.outputFormat;
    }

    public static /* synthetic */ Object access$400(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31b92df4", new Object[]{cameraCapturer});
        }
        return cameraCapturer.stateLock;
    }

    public static /* synthetic */ CapturerObserver access$500(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CapturerObserver) ipChange.ipc$dispatch("34d203d5", new Object[]{cameraCapturer});
        }
        return cameraCapturer.capturerObserver;
    }

    public static /* synthetic */ boolean access$602(CameraCapturer cameraCapturer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32dd851e", new Object[]{cameraCapturer, new Boolean(z)})).booleanValue();
        }
        cameraCapturer.sessionOpening = z;
        return z;
    }

    public static /* synthetic */ CameraSession access$700(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraSession) ipChange.ipc$dispatch("860ad170", new Object[]{cameraCapturer});
        }
        return cameraCapturer.currentSession;
    }

    public static /* synthetic */ CameraSession access$702(CameraCapturer cameraCapturer, CameraSession cameraSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraSession) ipChange.ipc$dispatch("4a122a7d", new Object[]{cameraCapturer, cameraSession});
        }
        cameraCapturer.currentSession = cameraSession;
        return cameraSession;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics access$800(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("465993ca", new Object[]{cameraCapturer});
        }
        return cameraCapturer.cameraStatistics;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics access$802(CameraCapturer cameraCapturer, CameraVideoCapturer.CameraStatistics cameraStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("bc600438", new Object[]{cameraCapturer, cameraStatistics});
        }
        cameraCapturer.cameraStatistics = cameraStatistics;
        return cameraStatistics;
    }

    public static /* synthetic */ SurfaceTextureHelper access$900(CameraCapturer cameraCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("26018177", new Object[]{cameraCapturer});
        }
        return cameraCapturer.surfaceHelper;
    }

    private void beautyFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc3a0e0", new Object[]{this, videoFrame});
            return;
        }
        this.videoWidth = videoFrame.getBuffer().getWidth();
        this.videoHeight = videoFrame.getBuffer().getHeight();
        checkNeedCreateMediaProcess();
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.getBuffer();
        this.tBuf = textureBufferImpl;
        this.oesTextureId = textureBufferImpl.getTextureId();
        Matrix transformMatrix = this.tBuf.getTransformMatrix();
        this.mtx = transformMatrix;
        if (this.videoMirror) {
            transformMatrix.preTranslate(0.5f, 0.5f);
            this.mtx.preScale(-1.0f, 1.0f);
            this.mtx.preTranslate(-0.5f, -0.5f);
        }
        boolean z = this.needMix;
        checkNeedMixVideoFrame(z);
        CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
        if (cameraStatistics != null) {
            cameraStatistics.addBeautyCostTime(this.beautyCostPerFrame);
        }
        if (this.priTextureFrameNeedConvertToYuv) {
            textureConvertToYuv(z);
            this.stored_rotation = videoFrame.getRotation();
            this.stored_timestamp_ns = videoFrame.getTimestampNs();
            return;
        }
        packageBeautyFrameAndDeliver(z, videoFrame);
    }

    private void checkIsOnCameraThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338bbe87", new Object[]{this});
        } else if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            Logging.e(TAG, "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    private void checkNeedCreateMediaProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da296c", new Object[]{this});
            return;
        }
        AliMediaFrameProcess aliMediaFrameProcess = this.videoProcess;
        if (!(aliMediaFrameProcess == null || (aliMediaFrameProcess.c() == this.videoWidth && this.videoProcess.b() == this.videoHeight))) {
            this.videoProcess.f();
            this.videoProcess = null;
            Logging.e(TAG, "video preview size change, recreate AliMediaFrameProcess");
        }
        if (this.videoProcess == null) {
            this.videoProcess = new AliMediaFrameProcess(this.mCtx, this.videoWidth, this.videoHeight);
            Logging.e(TAG, "create AliMediaFrameProcess");
        }
    }

    private void checkNeedMirrorFrameAndDeliver(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fdd753", new Object[]{this, videoFrame});
        } else if (this.videoMirror) {
            Matrix transformMatrix = ((TextureBufferImpl) videoFrame.getBuffer()).getTransformMatrix();
            transformMatrix.preTranslate(0.5f, 0.5f);
            transformMatrix.preScale(-1.0f, 1.0f);
            transformMatrix.preTranslate(-0.5f, -0.5f);
            checkNeedTakeSnapshot(videoFrame);
            CapturerObserver capturerObserver = this.capturerObserver;
            if (capturerObserver != null) {
                capturerObserver.onFrameCaptured(videoFrame);
            }
        } else {
            checkNeedTakeSnapshot(videoFrame);
            CapturerObserver capturerObserver2 = this.capturerObserver;
            if (capturerObserver2 != null) {
                capturerObserver2.onFrameCaptured(videoFrame);
            }
        }
    }

    private void checkNeedMixVideoFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246bf91d", new Object[]{this, new Boolean(z)});
            return;
        }
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.mtx);
        if (z) {
            synchronized (this.remoteFrameLock) {
                try {
                    if (this.videoLayoutIsSet) {
                        if (this.updateVideoLayout) {
                            this.videoProcess.g(this.videoLayout, this.videoWidth, this.videoHeight);
                            this.updateVideoLayout = false;
                        }
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame == null) {
                            this.beautyCostPerFrame = this.videoProcess.e(this.videoWidth, this.videoHeight, this.oesTextureId, convertMatrixFromAndroidGraphicsMatrix, null, null, 0, 0, true);
                            this.hasMixedFrame.set(false);
                        } else {
                            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                            this.beautyCostPerFrame = this.videoProcess.e(this.videoWidth, this.videoHeight, this.oesTextureId, convertMatrixFromAndroidGraphicsMatrix, new ByteBuffer[]{i420.getDataY(), i420.getDataU(), i420.getDataV()}, new int[]{i420.getStrideY(), i420.getStrideU(), i420.getStrideV()}, i420.getWidth(), i420.getHeight(), true);
                            i420.release();
                            this.hasMixedFrame.set(true);
                        }
                    } else {
                        if (this.logCount % 400 == 0) {
                            ArtcLog.e(TAG, "video layout param is not set", new Object[0]);
                            this.logCount = 0;
                        }
                        this.logCount++;
                        this.beautyCostPerFrame = this.videoProcess.e(this.videoWidth, this.videoHeight, this.oesTextureId, convertMatrixFromAndroidGraphicsMatrix, null, null, 0, 0, false);
                        this.hasMixedFrame.set(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        this.beautyCostPerFrame = this.videoProcess.e(this.videoWidth, this.videoHeight, this.oesTextureId, convertMatrixFromAndroidGraphicsMatrix, null, null, 0, 0, false);
        this.hasMixedFrame.set(false);
    }

    private void createSessionInternal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45df6e5", new Object[]{this, new Integer(i)});
            return;
        }
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + 10000);
        this.cameraThreadHandler.postDelayed(new Runnable() { // from class: org.webrtc.CameraCapturer.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(CameraCapturer.access$3000(cameraCapturer), CameraCapturer.access$3100(CameraCapturer.this), CameraCapturer.access$3200(CameraCapturer.this), CameraCapturer.access$900(CameraCapturer.this), CameraCapturer.access$1300(CameraCapturer.this), CameraCapturer.access$3300(CameraCapturer.this), CameraCapturer.access$3400(CameraCapturer.this), CameraCapturer.access$3500(CameraCapturer.this), CameraCapturer.access$3600(CameraCapturer.this));
            }
        }, i);
    }

    private void packageBeautyFrameAndDeliver(boolean z, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a26d8c4", new Object[]{this, new Boolean(z), videoFrame});
            return;
        }
        Matrix matrix = new Matrix();
        if (!this.hasMixedFrame.get()) {
            int d = this.videoProcess.d(AliMediaFrameProcess.TextureType.ORI_TEXTURE);
            if (d == -1) {
                checkNeedTakeSnapshot(videoFrame);
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onFrameCaptured(videoFrame);
                }
            } else {
                VideoFrame videoFrame2 = new VideoFrame(this.tBuf.createBufferWithNewTexture(matrix, VideoFrame.TextureBuffer.Type.RGB, d), videoFrame.getRotation(), videoFrame.getTimestampNs());
                checkNeedTakeSnapshot(videoFrame2);
                CapturerObserver capturerObserver2 = this.capturerObserver;
                if (capturerObserver2 != null) {
                    capturerObserver2.onFrameCaptured(videoFrame2);
                }
                videoFrame2.release();
            }
            if (z) {
                TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.subWidth, this.subHeight, VideoFrame.TextureBuffer.Type.RGB, this.videoProcess.d(AliMediaFrameProcess.TextureType.SCALE_TEXTURE), matrix, null, null, null);
                VideoFrame videoFrame3 = new VideoFrame(textureBufferImpl, videoFrame.getRotation(), videoFrame.getTimestampNs());
                if (this.subCapturerObserver != null) {
                    checkNeedTakeSnapshot(videoFrame3);
                    this.subCapturerObserver.onFrameCaptured(videoFrame3);
                }
                videoFrame3.release();
                textureBufferImpl.release();
                return;
            }
            return;
        }
        int d2 = this.videoProcess.d(AliMediaFrameProcess.TextureType.MIX_TEXTURE);
        int d3 = this.videoProcess.d(AliMediaFrameProcess.TextureType.SCALE_TEXTURE);
        TextureBufferImpl textureBufferImpl2 = this.tBuf;
        VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.RGB;
        TextureBufferImpl createBufferWithNewTexture = textureBufferImpl2.createBufferWithNewTexture(matrix, type, d2);
        TextureBufferImpl textureBufferImpl3 = new TextureBufferImpl(this.subWidth, this.subHeight, type, d3, matrix, null, null, null);
        VideoFrame videoFrame4 = new VideoFrame(createBufferWithNewTexture, textureBufferImpl3, videoFrame.getRotation(), videoFrame.getTimestampNs());
        VideoFrame videoFrame5 = new VideoFrame(textureBufferImpl3, videoFrame.getRotation(), videoFrame.getTimestampNs());
        CapturerObserver capturerObserver3 = this.capturerObserver;
        if (capturerObserver3 != null) {
            capturerObserver3.onFrameCaptured(videoFrame4);
        }
        if (this.subCapturerObserver != null) {
            checkNeedTakeSnapshot(videoFrame5);
            this.subCapturerObserver.onFrameCaptured(videoFrame5);
        }
        videoFrame4.release();
        videoFrame5.release();
        textureBufferImpl3.release();
    }

    private void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf010a3", new Object[]{this, str, cameraSwitchHandler});
            return;
        }
        Logging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    private void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758228b4", new Object[]{this, cameraSwitchHandler});
            return;
        }
        Logging.d(TAG, "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length >= 2) {
            synchronized (this.stateLock) {
                try {
                    if (this.switchState != SwitchState.IDLE) {
                        reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                        return;
                    }
                    boolean z = this.sessionOpening;
                    if (z || this.currentSession != null) {
                        this.switchEventsHandler = cameraSwitchHandler;
                        if (z) {
                            this.switchState = SwitchState.PENDING;
                            return;
                        }
                        this.switchState = SwitchState.IN_PROGRESS;
                        Logging.d(TAG, "switchCamera: Stopping session");
                        this.cameraStatistics.release();
                        this.cameraStatistics = null;
                        final CameraSession cameraSession = this.currentSession;
                        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.12
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    cameraSession.stop();
                                }
                            }
                        });
                        this.currentSession = null;
                        String str = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
                        this.cameraName = str;
                        this.cameraFacing = this.cameraEnumerator.isFrontFacing(str) ? 1 : 0;
                        Logging.d(TAG, "switchCamera: name:" + this.cameraName + ", facing:" + this.cameraFacing);
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 1;
                        createSessionInternal(0);
                        Logging.d(TAG, "switchCamera done");
                        return;
                    }
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
        }
    }

    private void textureConvertToYuv(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648d4466", new Object[]{this, new Boolean(z)});
        } else if (!this.hasMixedFrame.get()) {
            int d = this.videoProcess.d(AliMediaFrameProcess.TextureType.ORI_TEXTURE);
            lju ljuVar = this.dummyRender;
            int i = this.videoWidth;
            int i2 = this.videoHeight;
            float[] fArr = IDENTITY;
            ljuVar.g(i, i2, d, false, fArr, this.imageListener);
            if (z && this.subTextureFrameNeedConvertToYuv && this.subCapturerObserver != null) {
                this.subDummyRender.g(this.videoWidth, this.videoHeight, this.videoProcess.d(AliMediaFrameProcess.TextureType.SCALE_TEXTURE), false, fArr, this.subImageListener);
            }
        } else {
            int d2 = this.videoProcess.d(AliMediaFrameProcess.TextureType.MIX_TEXTURE);
            lju ljuVar2 = this.dummyRender;
            int i3 = this.videoWidth;
            int i4 = this.videoHeight;
            float[] fArr2 = IDENTITY;
            ljuVar2.g(i3, i4, d2, false, fArr2, this.imageListener);
            if (this.subTextureFrameNeedConvertToYuv && this.subCapturerObserver != null) {
                this.subDummyRender.g(this.videoWidth, this.videoHeight, this.videoProcess.d(AliMediaFrameProcess.TextureType.SCALE_TEXTURE), false, fArr2, this.subImageListener);
            }
        }
    }

    private ArtcVideoLayout trtc2ArtcVideoLayout(TrtcVideoLayout trtcVideoLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArtcVideoLayout) ipChange.ipc$dispatch("f0e8e423", new Object[]{this, trtcVideoLayout});
        }
        new ArtcVideoLayout();
        trtcVideoLayout.getClass();
        throw null;
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03670f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Logging.d(TAG, "changeCaptureFormat: " + i + "x" + i2 + "@" + i3);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3, this.outputFormat);
        }
    }

    public final void checkNeedTakeSnapshot(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7fe8", new Object[]{this, videoFrame});
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3, int i4);

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Logging.d(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        stopCapture();
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (CameraCapturer.access$1900(CameraCapturer.this) != null) {
                        CameraCapturer.access$1900(CameraCapturer.this).f();
                        CameraCapturer.access$1902(CameraCapturer.this, null);
                    }
                }
            });
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableBeautyProcess(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92077f9d", new Object[]{this, new Boolean(z)});
            return;
        }
        Logging.d(TAG, "enable beauty process, " + z);
        if (this.videoProcess != null) {
            this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        CameraCapturer.access$1900(CameraCapturer.this).a(z);
                    }
                }
            });
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableShapeProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1558f91c", new Object[]{this, new Boolean(z)});
            return;
        }
        Logging.d(TAG, "enable shape process, " + z);
    }

    @Override // org.webrtc.VideoCapturer
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.enableTorch(z);
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public int getBrightness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ceed41", new Object[]{this})).intValue();
        }
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            return cameraSession.getBrightness();
        }
        return -1;
    }

    public String getCameraName() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5844773", new Object[]{this});
        }
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a2077", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
            return;
        }
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            handler = null;
        } else {
            handler = surfaceTextureHelper.getHandler();
        }
        this.cameraThreadHandler = handler;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public boolean isFrontFacing() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bb723e4", new Object[]{this})).booleanValue();
        }
        synchronized (this.stateLock) {
            if (this.cameraFacing == 1) {
                z = true;
            }
        }
        return z;
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
            return;
        }
        synchronized (this.remoteFrameLock) {
            try {
                VideoFrame videoFrame2 = this.pendingFrame;
                if (videoFrame2 != null) {
                    videoFrame2.release();
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void printStackTrace() {
        Thread thread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78ccdb1", new Object[]{this});
            return;
        }
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            thread = handler.getLooper().getThread();
        } else {
            thread = null;
        }
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void resetCapturerObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df0458", new Object[]{this});
            return;
        }
        synchronized (this.stateLock) {
            Logging.d(TAG, "resetCapturerObserver");
            this.capturerObserver = null;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBeautyParam(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c267736", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBlack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee5c90", new Object[]{this, new Boolean(z)});
            return;
        }
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.setBlack(z);
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setBrightness(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be5c8e9", new Object[]{this, new Integer(i)});
            return;
        }
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.setBrightness(i);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setDummyRender(lju ljuVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ed1b87", new Object[]{this, ljuVar});
            return;
        }
        this.dummyRender = ljuVar;
        if (ljuVar == null) {
            z = false;
        }
        this.priTextureFrameNeedConvertToYuv = z;
    }

    @Override // org.webrtc.VideoCapturer
    public void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd578fb5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setNeedMix(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00a3689", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.e(TAG, "setNeedMix:" + z, new Object[0]);
        this.needMix = z;
        if (!z) {
            synchronized (this.remoteFrameLock) {
                try {
                    VideoFrame videoFrame = this.pendingFrame;
                    if (videoFrame != null) {
                        videoFrame.release();
                        this.pendingFrame = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubCapturerObserver(CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad1ce1", new Object[]{this, capturerObserver});
        } else {
            this.subCapturerObserver = capturerObserver;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubDummyRender(lju ljuVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ceb6eb", new Object[]{this, ljuVar});
            return;
        }
        this.subDummyRender = ljuVar;
        if (ljuVar == null) {
            z = false;
        }
        this.subTextureFrameNeedConvertToYuv = z;
    }

    @Override // org.webrtc.VideoCapturer
    public void setVideoContentMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3c05ae", new Object[]{this, new Boolean(z)});
        } else {
            this.videoMirror = z;
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setVideoLayout(ArtcVideoLayout artcVideoLayout) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a606e43", new Object[]{this, artcVideoLayout});
            return;
        }
        ArtcLog.e(TAG, "setVideoLayout artc subW: " + artcVideoLayout.sub_width + " subH: " + artcVideoLayout.sub_height + " desc size: " + artcVideoLayout.desc.size(), new Object[0]);
        this.videoLayout = artcVideoLayout;
        int i2 = artcVideoLayout.sub_width;
        if (!(i2 == 0 || (i = artcVideoLayout.sub_height) == 0)) {
            this.subWidth = i2;
            this.subHeight = i;
        }
        this.videoLayoutIsSet = true;
        this.updateVideoLayout = true;
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95964b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Logging.d(TAG, "startCapture: " + i + "x" + i2 + "@" + i3 + "@" + i4);
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                try {
                    if (!this.sessionOpening && this.currentSession == null) {
                        this.width = i;
                        this.height = i2;
                        this.framerate = i3;
                        this.outputFormat = i4;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 3;
                        createSessionInternal(0);
                        return;
                    }
                    Logging.w(TAG, "Session already open");
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        Logging.d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            cameraSession.stop();
                        }
                    }
                });
                this.currentSession = null;
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerStopped();
                }
            } else {
                Logging.d(TAG, "Stop capture: No session open");
            }
        }
        Logging.d(TAG, "Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be79c1d7", new Object[]{this, cameraSwitchHandler});
            return;
        }
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    CameraCapturer.access$1500(CameraCapturer.this, cameraSwitchHandler);
                }
            }
        });
    }

    @Override // org.webrtc.CameraVideoCapturer
    public Bitmap takeSnapshot() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ef386750", new Object[]{this});
        }
        synchronized (this.snapshotLock) {
            try {
                this.takeSnapshot = true;
                try {
                    this.snapshotLock.wait();
                    Logging.e(TAG, "takeSnapshot done");
                    bitmap = this.snapshot;
                } catch (InterruptedException unused) {
                    Logging.w(TAG, "takeBitmapSnapshot interrupted while waiting for snapshot done");
                    Thread.currentThread().interrupt();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmap;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setVideoLayout(TrtcVideoLayout trtcVideoLayout) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23874e3", new Object[]{this, trtcVideoLayout});
            return;
        }
        ArtcLog.e(TAG, "setVideoLayout trtc subW: " + trtcVideoLayout.subWidth + " subH: " + trtcVideoLayout.subHeight + " desc size: " + trtcVideoLayout.videoLayout.size(), new Object[0]);
        this.videoLayout = trtc2ArtcVideoLayout(trtcVideoLayout);
        int i2 = trtcVideoLayout.subWidth;
        if (!(i2 == 0 || (i = trtcVideoLayout.subHeight) == 0)) {
            this.subWidth = i2;
            this.subHeight = i;
        }
        this.videoLayoutIsSet = true;
        this.updateVideoLayout = true;
    }
}
