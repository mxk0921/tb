package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.VideoCapturer;
import tb.lju;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private VideoCapturer.CapturerObserver capturerObserver;
    private int height;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;
    private long numCapturedFrames = 0;
    private boolean isDisposed = false;

    static {
        t2o.a(395313805);
        t2o.a(395313839);
        t2o.a(395313851);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    public static /* synthetic */ SurfaceTextureHelper access$000(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("eb703484", new Object[]{screenCapturerAndroid});
        }
        return screenCapturerAndroid.surfaceTextureHelper;
    }

    public static /* synthetic */ VideoCapturer.CapturerObserver access$100(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer.CapturerObserver) ipChange.ipc$dispatch("e39148e2", new Object[]{screenCapturerAndroid});
        }
        return screenCapturerAndroid.capturerObserver;
    }

    public static /* synthetic */ VirtualDisplay access$200(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VirtualDisplay) ipChange.ipc$dispatch("58ebb18e", new Object[]{screenCapturerAndroid});
        }
        return screenCapturerAndroid.virtualDisplay;
    }

    public static /* synthetic */ VirtualDisplay access$202(ScreenCapturerAndroid screenCapturerAndroid, VirtualDisplay virtualDisplay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VirtualDisplay) ipChange.ipc$dispatch("a00f5f32", new Object[]{screenCapturerAndroid, virtualDisplay});
        }
        screenCapturerAndroid.virtualDisplay = virtualDisplay;
        return virtualDisplay;
    }

    public static /* synthetic */ MediaProjection access$300(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaProjection) ipChange.ipc$dispatch("c5786b1e", new Object[]{screenCapturerAndroid});
        }
        return screenCapturerAndroid.mediaProjection;
    }

    public static /* synthetic */ MediaProjection access$302(ScreenCapturerAndroid screenCapturerAndroid, MediaProjection mediaProjection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaProjection) ipChange.ipc$dispatch("703348ab", new Object[]{screenCapturerAndroid, mediaProjection});
        }
        screenCapturerAndroid.mediaProjection = mediaProjection;
        return mediaProjection;
    }

    public static /* synthetic */ MediaProjection.Callback access$400(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaProjection.Callback) ipChange.ipc$dispatch("41369e10", new Object[]{screenCapturerAndroid});
        }
        return screenCapturerAndroid.mediaProjectionCallback;
    }

    public static /* synthetic */ void access$500(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b297ab", new Object[]{screenCapturerAndroid});
        } else {
            screenCapturerAndroid.createVirtualDisplay();
        }
    }

    private void checkNotDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3530477", new Object[]{this});
        } else if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7f465a", new Object[]{this});
            return;
        }
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("TRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03670f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ScreenCapturerAndroid.access$200(ScreenCapturerAndroid.this).release();
                    ScreenCapturerAndroid.access$500(ScreenCapturerAndroid.this);
                }
            });
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.isDisposed = true;
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

    public long getNumCapturedFrames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("587dab0f", new Object[]{this})).longValue();
        }
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2bf1fa", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
            return;
        }
        checkNotDisposed();
        if (capturerObserver != null) {
            this.capturerObserver = capturerObserver;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
                return;
            }
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        throw new RuntimeException("capturerObserver not set.");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db66480", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
            return;
        }
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // org.webrtc.VideoCapturer
    public void onVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e83fa40", new Object[]{this, videoFrame});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void resetCapturerObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df0458", new Object[]{this});
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
    public void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd578fb5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubCapturerObserver(CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad1ce1", new Object[]{this, capturerObserver});
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

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        SurfaceTextureHelper surfaceTextureHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95964b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        MediaProjectionManager mediaProjectionManager = this.mediaProjectionManager;
        if (mediaProjectionManager != null) {
            MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
            this.mediaProjection = mediaProjection;
            if (!(mediaProjection == null || this.capturerObserver == null || (surfaceTextureHelper = this.surfaceTextureHelper) == null)) {
                mediaProjection.registerCallback(this.mediaProjectionCallback, surfaceTextureHelper.getHandler());
                createVirtualDisplay();
                this.capturerObserver.onCapturerStarted(true);
                this.surfaceTextureHelper.startListening(this);
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ScreenCapturerAndroid.access$000(ScreenCapturerAndroid.this).stopListening();
                ScreenCapturerAndroid.access$100(ScreenCapturerAndroid.this).onCapturerStopped();
                if (ScreenCapturerAndroid.access$200(ScreenCapturerAndroid.this) != null) {
                    ScreenCapturerAndroid.access$200(ScreenCapturerAndroid.this).release();
                    ScreenCapturerAndroid.access$202(ScreenCapturerAndroid.this, null);
                }
                if (ScreenCapturerAndroid.access$300(ScreenCapturerAndroid.this) != null) {
                    ScreenCapturerAndroid.access$300(ScreenCapturerAndroid.this).unregisterCallback(ScreenCapturerAndroid.access$400(ScreenCapturerAndroid.this));
                    ScreenCapturerAndroid.access$300(ScreenCapturerAndroid.this).stop();
                    ScreenCapturerAndroid.access$302(ScreenCapturerAndroid.this, null);
                }
            }
        });
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a2077", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        } else {
            initialize(surfaceTextureHelper, context, (VideoCapturer.CapturerObserver) capturerObserver);
        }
    }
}
