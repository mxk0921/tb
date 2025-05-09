package com.taobao.artc.api;

import android.content.Context;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.internal.IArtcExternalVideoProcessCallback;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.artc.video.AliMediaFrameProcess;
import java.nio.ByteBuffer;
import org.webrtc.GlUtil;
import org.webrtc.NV21Buffer;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import tb.o03;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcExternalVideoProcess implements o03.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ROLE_MIX = 3;
    public static final int ROLE_READ = 1;
    public static final int ROLE_WRITE = 2;
    private static final String TAG = "ArtcExternalVideoProcess";
    private Context mCtx;
    private VideoCapturer.CapturerObserver capturerObserver = null;
    private IArtcExternalVideoProcessCallback callback = null;
    private boolean running = false;
    private Object face_resource_lock = new Object();
    private o03 cameraProxy = null;
    private boolean enableBeautyProcess = false;
    private boolean enableShapeProcess = false;
    private boolean forceNoShapeProcess = false;
    private int preProcessTextureId = -1;
    private AliMediaFrameProcess videoProcess = null;
    private SurfaceTextureHelper st_helper = null;
    private int captureRole = 1;
    private float[] normalMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class VideoFrame {
        public ByteBuffer buffer;
        public AConstants.ColorSpace colorspace;
        public int height;
        public int rotationDegree;
        public int textureId;
        public long timestamp_ns;
        public int width;

        static {
            t2o.a(395313184);
        }
    }

    static {
        t2o.a(395313182);
        t2o.a(395313319);
    }

    public ArtcExternalVideoProcess(Context context) {
        this.mCtx = context;
    }

    private void translate4x4to3x3(float[] fArr, float[] fArr2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac9fa0e", new Object[]{this, fArr, fArr2});
            return;
        }
        int i2 = 0;
        while (i < 15) {
            if (i == 3 || i == 7 || i == 11) {
                i++;
            }
            fArr2[i2] = fArr[i];
            i2++;
            i++;
        }
    }

    public void _enableFaceBeauty(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411b7e92", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.w(TAG, "_enableFaceBeauty, ", Boolean.valueOf(z));
        this.enableBeautyProcess = z;
    }

    public void _enableFaceShape(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e210d9ab", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.w(TAG, "_enableFaceShape, ", Boolean.valueOf(z));
        if (this.enableShapeProcess && !z) {
            this.forceNoShapeProcess = true;
        }
        this.enableShapeProcess = z;
    }

    public synchronized void _onCaptureStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e2080", new Object[]{this});
            return;
        }
        ArtcLog.w(TAG, "_onCaptureStarted", new Object[0]);
        this.running = true;
        VideoCapturer.CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(true);
        }
    }

    public synchronized void _onCaptureStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e900ebcc", new Object[]{this});
            return;
        }
        ArtcLog.w(TAG, "_onCaptureStopped", new Object[0]);
        this.running = false;
        VideoCapturer.CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
    }

    public void _prepare(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f8d5bf", new Object[]{this, surfaceTextureHelper});
            return;
        }
        ArtcLog.w(TAG, "_prepare", new Object[0]);
        o03 o03Var = new o03();
        this.cameraProxy = o03Var;
        this.st_helper = surfaceTextureHelper;
        o03Var.b(surfaceTextureHelper);
        this.cameraProxy.e(this);
    }

    public void _prepareFaceShape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37031ee3", new Object[]{this});
        } else {
            ArtcLog.w(TAG, "_prepareFaceShape", new Object[0]);
        }
    }

    public void _setCaptureObserver(VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd91ad2b", new Object[]{this, capturerObserver});
        } else {
            this.capturerObserver = capturerObserver;
        }
    }

    public void _unprepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3348fd6", new Object[]{this});
            return;
        }
        ArtcLog.w(TAG, "_unprepare", new Object[0]);
        o03 o03Var = this.cameraProxy;
        if (o03Var != null) {
            o03Var.f();
            this.cameraProxy = null;
        }
        this.st_helper = null;
    }

    public int captureRole() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72d35f56", new Object[]{this})).intValue();
        }
        return this.captureRole;
    }

    public void onInputVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6942ec97", new Object[]{this, videoFrame});
        } else if (this.captureRole != 1 && this.capturerObserver != null && videoFrame.colorspace != AConstants.ColorSpace.C_TEXTURE) {
            if (this.enableBeautyProcess) {
                o03 o03Var = this.cameraProxy;
                if (o03Var != null) {
                    if (!o03Var.d()) {
                        this.cameraProxy.a(videoFrame.width, videoFrame.height, 17);
                    }
                    this.cameraProxy.c(videoFrame.buffer.array(), videoFrame.width, videoFrame.height, videoFrame.rotationDegree, videoFrame.timestamp_ns);
                }
            } else if (!videoFrame.buffer.isDirect()) {
                org.webrtc.VideoFrame videoFrame2 = new org.webrtc.VideoFrame(new NV21Buffer(videoFrame.buffer.array(), videoFrame.width, videoFrame.height, new Runnable() { // from class: com.taobao.artc.api.ArtcExternalVideoProcess.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        }
                    }
                }), videoFrame.rotationDegree, videoFrame.timestamp_ns);
                this.capturerObserver.onFrameCaptured(videoFrame2);
                videoFrame2.release();
            }
        }
    }

    public int onOutputVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e40b3055", new Object[]{this, videoFrame})).intValue();
        }
        IArtcExternalVideoProcessCallback iArtcExternalVideoProcessCallback = this.callback;
        if (iArtcExternalVideoProcessCallback != null) {
            return iArtcExternalVideoProcessCallback.onOutputVideoFrame(videoFrame);
        }
        return -1;
    }

    @Override // tb.o03.a
    public void onTextureReady(int i, int i2, int i3, int i4, float[] fArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea8260b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fArr, new Long(j)});
        } else if (this.enableBeautyProcess) {
            if (this.videoProcess == null) {
                this.videoProcess = new AliMediaFrameProcess(this.mCtx, i2, i3);
                ArtcLog.w(TAG, "create AliMediaFrameProcess", new Object[0]);
                if (this.preProcessTextureId == -1) {
                    this.preProcessTextureId = GlUtil.generateTexture(3553);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.preProcessTextureId);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glBindTexture(3553, 0);
                    ArtcLog.w(TAG, "create pre process texture, ", Integer.valueOf(this.preProcessTextureId));
                }
            }
            this.capturerObserver.onFrameCaptured(new org.webrtc.VideoFrame(this.st_helper.createTextureBuffer(this.preProcessTextureId, false, i2, i3, new Matrix()), i4, j));
        } else {
            Matrix matrix = new Matrix();
            float[] fArr2 = new float[9];
            translate4x4to3x3(fArr, fArr2);
            matrix.setValues(fArr2);
            this.capturerObserver.onFrameCaptured(new org.webrtc.VideoFrame(this.st_helper.createTextureBuffer(i, true, i2, i3, matrix), i4, j));
        }
    }

    @Deprecated
    public void setOutputCallback(IArtcExternalVideoProcessCallback iArtcExternalVideoProcessCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b9567", new Object[]{this, iArtcExternalVideoProcessCallback});
        } else {
            this.callback = iArtcExternalVideoProcessCallback;
        }
    }

    public void setRole(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf30a64", new Object[]{this, new Integer(i)});
        } else {
            this.captureRole = i;
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        ArtcLog.w(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, new Object[0]);
        if (this.videoProcess != null) {
            int i = this.preProcessTextureId;
            if (i != -1) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.preProcessTextureId = -1;
            }
            this.videoProcess.f();
            this.videoProcess = null;
        }
        if (this.mCtx != null) {
            this.mCtx = null;
            ArtcLog.w(TAG, "release ctx", new Object[0]);
        }
    }
}
