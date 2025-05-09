package org.webrtc;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SurfaceTextureHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private Object listener;
    private final int oesTextureId;
    private Object pendingListener;
    public final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    private final YuvConverter yuvConverter;

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface OnTextureFrameAvailableListener {
        void onTextureFrameAvailable(int i, float[] fArr, long j);
    }

    static {
        t2o.a(395313811);
    }

    public static /* synthetic */ Object access$100(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1902797c", new Object[]{surfaceTextureHelper});
        }
        return surfaceTextureHelper.pendingListener;
    }

    public static /* synthetic */ boolean access$1000(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d19c4c", new Object[]{surfaceTextureHelper})).booleanValue();
        }
        return surfaceTextureHelper.isQuitting;
    }

    public static /* synthetic */ boolean access$1002(SurfaceTextureHelper surfaceTextureHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b648e12", new Object[]{surfaceTextureHelper, new Boolean(z)})).booleanValue();
        }
        surfaceTextureHelper.isQuitting = z;
        return z;
    }

    public static /* synthetic */ Object access$102(SurfaceTextureHelper surfaceTextureHelper, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f9c4ca2", new Object[]{surfaceTextureHelper, obj});
        }
        surfaceTextureHelper.pendingListener = obj;
        return obj;
    }

    public static /* synthetic */ void access$1100(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ef8d27", new Object[]{surfaceTextureHelper});
        } else {
            surfaceTextureHelper.release();
        }
    }

    public static /* synthetic */ Object access$202(SurfaceTextureHelper surfaceTextureHelper, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d34a7763", new Object[]{surfaceTextureHelper, obj});
        }
        surfaceTextureHelper.listener = obj;
        return obj;
    }

    public static /* synthetic */ boolean access$300(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db59ba38", new Object[]{surfaceTextureHelper})).booleanValue();
        }
        return surfaceTextureHelper.hasPendingTexture;
    }

    public static /* synthetic */ boolean access$302(SurfaceTextureHelper surfaceTextureHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e02da6", new Object[]{surfaceTextureHelper, new Boolean(z)})).booleanValue();
        }
        surfaceTextureHelper.hasPendingTexture = z;
        return z;
    }

    public static /* synthetic */ void access$400(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3277ab13", new Object[]{surfaceTextureHelper});
        } else {
            surfaceTextureHelper.updateTexImage();
        }
    }

    public static /* synthetic */ void access$500(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89959bf2", new Object[]{surfaceTextureHelper});
        } else {
            surfaceTextureHelper.tryDeliverTextureFrame();
        }
    }

    public static /* synthetic */ int access$602(SurfaceTextureHelper surfaceTextureHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7c06ec7", new Object[]{surfaceTextureHelper, new Integer(i)})).intValue();
        }
        surfaceTextureHelper.textureWidth = i;
        return i;
    }

    public static /* synthetic */ int access$702(SurfaceTextureHelper surfaceTextureHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("546099c8", new Object[]{surfaceTextureHelper, new Integer(i)})).intValue();
        }
        surfaceTextureHelper.textureHeight = i;
        return i;
    }

    public static /* synthetic */ int access$802(SurfaceTextureHelper surfaceTextureHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e100c4c9", new Object[]{surfaceTextureHelper, new Integer(i)})).intValue();
        }
        surfaceTextureHelper.frameRotation = i;
        return i;
    }

    public static /* synthetic */ boolean access$900(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e60d5f72", new Object[]{surfaceTextureHelper})).booleanValue();
        }
        return surfaceTextureHelper.isTextureInUse;
    }

    public static /* synthetic */ boolean access$902(SurfaceTextureHelper surfaceTextureHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6da12fac", new Object[]{surfaceTextureHelper, new Boolean(z)})).booleanValue();
        }
        surfaceTextureHelper.isTextureInUse = z;
        return z;
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("6441aceb", new Object[]{str, context});
        }
        HandlerThread handlerThread = new HandlerThread(str, 10);
        try {
            handlerThread.start();
            final Handler handler = new Handler(handlerThread.getLooper());
            return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: org.webrtc.SurfaceTextureHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public SurfaceTextureHelper call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (SurfaceTextureHelper) ipChange2.ipc$dispatch("da5d57c3", new Object[]{this});
                    }
                    try {
                        return new SurfaceTextureHelper(EglBase.Context.this, handler);
                    } catch (RuntimeException e) {
                        Logging.e(SurfaceTextureHelper.TAG, str + " create failure", e);
                        return null;
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static TextureBufferImpl createSolidColorTexture2D(final Handler handler, byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureBufferImpl) ipChange.ipc$dispatch("7718a02a", new Object[]{handler, bArr, new Integer(i), new Integer(i2)});
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        final int i3 = iArr[0];
        GLES20.glBindTexture(3553, i3);
        GLES20.glPixelStorei(3317, 4);
        GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, ByteBuffer.wrap(bArr));
        return new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.RGB, i3, new Matrix(), handler, null, new Runnable() { // from class: tb.vyq
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.lambda$createSolidColorTexture2D$1(handler, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSolidColorTexture2D$0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cff4", new Object[]{new Integer(i)});
        } else {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSolidColorTexture2D$1(Handler handler, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6767b763", new Object[]{handler, new Integer(i)});
        } else {
            handler.post(new Runnable() { // from class: tb.uyq
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.lambda$createSolidColorTexture2D$0(i);
                }
            });
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
        }
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb63fd5", new Object[]{surfaceTexture, onFrameAvailableListener, handler});
        } else {
            surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
        }
    }

    private void startListeningInternal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73002879", new Object[]{this, obj});
            return;
        }
        if (!(this.listener == null && this.pendingListener == null)) {
            Logging.e(TAG, "SurfaceTextureHelper listener has already been set.");
            stopListening();
        }
        this.pendingListener = obj;
        this.handler.post(this.setListenerRunnable);
    }

    private void tryDeliverTextureFrame() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ef3fa3", new Object[]{this});
        } else if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            try {
                updateTexImage();
                float[] fArr = new float[16];
                this.surfaceTexture.getTransformMatrix(fArr);
                long rtcTimeNanos = TimestampAligner.getRtcTimeNanos();
                Object obj = this.listener;
                if (obj instanceof OnTextureFrameAvailableListener) {
                    ((OnTextureFrameAvailableListener) obj).onTextureFrameAvailable(this.oesTextureId, fArr, rtcTimeNanos);
                } else if (obj instanceof VideoSink) {
                    int i2 = this.textureWidth;
                    if (i2 == 0 || (i = this.textureHeight) == 0) {
                        throw new RuntimeException("Texture size has not been set.");
                    }
                    VideoFrame videoFrame = new VideoFrame(createTextureBuffer(i2, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr)), this.frameRotation, rtcTimeNanos);
                    ((VideoSink) this.listener).onFrame(videoFrame);
                    videoFrame.release();
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateTexImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6464b64", new Object[]{this});
        } else {
            this.surfaceTexture.updateTexImage();
        }
    }

    @Deprecated
    public TextureBufferImpl createTextureBuffer(int i, int i2, Matrix matrix) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextureBufferImpl) ipChange.ipc$dispatch("7d54190b", new Object[]{this, new Integer(i), new Integer(i2), matrix}) : new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SurfaceTextureHelper.this.returnTextureFrame();
                }
            }
        });
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Logging.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SurfaceTextureHelper.access$1002(SurfaceTextureHelper.this, true);
                if (!SurfaceTextureHelper.access$900(SurfaceTextureHelper.this)) {
                    SurfaceTextureHelper.access$1100(SurfaceTextureHelper.this);
                }
            }
        });
    }

    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTexture) ipChange.ipc$dispatch("c7ae716a", new Object[]{this});
        }
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be822c1c", new Object[]{this})).booleanValue();
        }
        return this.isTextureInUse;
    }

    @Deprecated
    public void returnTextureFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb0a9e9", new Object[]{this});
        } else {
            this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SurfaceTextureHelper.access$902(SurfaceTextureHelper.this, false);
                    if (SurfaceTextureHelper.access$1000(SurfaceTextureHelper.this)) {
                        SurfaceTextureHelper.access$1100(SurfaceTextureHelper.this);
                    } else {
                        SurfaceTextureHelper.access$500(SurfaceTextureHelper.this);
                    }
                }
            });
        }
    }

    public void setFrameRotation(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb745233", new Object[]{this, new Integer(i)});
        } else {
            this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SurfaceTextureHelper.access$802(SurfaceTextureHelper.this, i);
                    }
                }
            });
        }
    }

    public void setTextureSize(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bbd9a1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0) {
            throw new IllegalArgumentException("Texture width must be positive, but was " + i);
        } else if (i2 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SurfaceTextureHelper.access$602(SurfaceTextureHelper.this, i);
                    SurfaceTextureHelper.access$702(SurfaceTextureHelper.this, i2);
                }
            });
        } else {
            throw new IllegalArgumentException("Texture height must be positive, but was " + i2);
        }
    }

    @Deprecated
    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ead366", new Object[]{this, onTextureFrameAvailableListener});
        } else {
            startListeningInternal(onTextureFrameAvailableListener);
        }
    }

    public void stopListening() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fe4ae0", new Object[]{this});
            return;
        }
        Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SurfaceTextureHelper.access$202(SurfaceTextureHelper.this, null);
                SurfaceTextureHelper.access$102(SurfaceTextureHelper.this, null);
            }
        });
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.I420Buffer) ipChange.ipc$dispatch("27bd290b", new Object[]{this, textureBuffer});
        }
        return textureBuffer.toI420();
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler) {
        this.yuvConverter = new YuvConverter();
        this.hasPendingTexture = false;
        this.isTextureInUse = false;
        this.isQuitting = false;
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Logging.d(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.access$100(SurfaceTextureHelper.this));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                SurfaceTextureHelper.access$202(surfaceTextureHelper, SurfaceTextureHelper.access$100(surfaceTextureHelper));
                SurfaceTextureHelper.access$102(SurfaceTextureHelper.this, null);
                if (SurfaceTextureHelper.access$300(SurfaceTextureHelper.this)) {
                    try {
                        SurfaceTextureHelper.access$400(SurfaceTextureHelper.this);
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                    SurfaceTextureHelper.access$302(SurfaceTextureHelper.this, false);
                }
            }
        };
        Logging.e(TAG, "SurfaceTextureHelper ctor, sharedContext:" + context);
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler;
            EglBase create = EglBase.StaticMethod.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.SurfaceTextureHelper.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture2});
                            return;
                        }
                        SurfaceTextureHelper.access$302(SurfaceTextureHelper.this, true);
                        SurfaceTextureHelper.access$500(SurfaceTextureHelper.this);
                    }
                }, handler);
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
    }

    public TextureBufferImpl createTextureBuffer(int i, boolean z, int i2, int i3, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureBufferImpl) ipChange.ipc$dispatch("7106e0bc", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), matrix});
        }
        return new TextureBufferImpl(i2, i3, z ? VideoFrame.TextureBuffer.Type.OES : VideoFrame.TextureBuffer.Type.RGB, i, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SurfaceTextureHelper.this.returnTextureFrame();
                }
            }
        });
    }

    public void startListening(VideoSink videoSink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae304638", new Object[]{this, videoSink});
            return;
        }
        Logging.d(TAG, "startListening");
        startListeningInternal(videoSink);
    }
}
