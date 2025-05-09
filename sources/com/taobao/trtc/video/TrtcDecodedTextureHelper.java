package com.taobao.trtc.video;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcDecodedTextureHelper implements VideoSink {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TrtcDecodedTextureHelper";
    private static EglBase eglBase;
    private boolean hasBufferToRender;
    private final Object newFrameLock = new Object();
    private VideoFrame.Buffer pendingBuffer;
    private VideoFrame.Buffer renderedBuffer;
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;

    static {
        t2o.a(395313658);
        t2o.a(395313851);
    }

    public TrtcDecodedTextureHelper(int i, int i2) {
        SurfaceTextureHelper create = SurfaceTextureHelper.create("DecodeSTH", eglBase.getEglBaseContext());
        this.surfaceTextureHelper = create;
        if (create != null) {
            create.setTextureSize(i, i2);
            create.startListening(this);
            this.surface = new Surface(create.getSurfaceTexture());
            TrtcLog.j(TAG, "CTOR");
        }
    }

    public static TrtcDecodedTextureHelper create(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDecodedTextureHelper) ipChange.ipc$dispatch("b98ea63f", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new TrtcDecodedTextureHelper(i, i2);
    }

    public static void disposeEglContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e3304b", new Object[0]);
            return;
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
            eglBase = null;
        }
        TrtcLog.j(TAG, "disposeEglContext");
    }

    public static void setEglBase(EglBase.Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b55b40", new Object[]{context});
            return;
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
        }
        eglBase = EglBase.StaticMethod.create(context);
        TrtcLog.j(TAG, "setEglBase");
    }

    public VideoFrame.Buffer dequeueTextureBuffer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.Buffer) ipChange.ipc$dispatch("ab9e3f79", new Object[]{this, new Integer(i)});
        }
        synchronized (this.newFrameLock) {
            if (this.renderedBuffer == null && i > 0) {
                try {
                    this.newFrameLock.wait(i);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            VideoFrame.Buffer buffer = this.renderedBuffer;
            if (buffer == null) {
                return null;
            }
            this.pendingBuffer = buffer;
            this.renderedBuffer = null;
            return buffer;
        }
    }

    public Surface getSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
        }
        TrtcLog.j(TAG, "getSurface");
        return this.surface;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
            return;
        }
        synchronized (this.newFrameLock) {
            try {
                if (this.renderedBuffer != null) {
                    TrtcLog.i(TAG, "already have renderBuffer, drop the old");
                    this.renderedBuffer.release();
                }
                this.renderedBuffer = videoFrame.getBuffer();
                this.newFrameLock.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        TrtcLog.j(TAG, "release");
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
        }
        synchronized (this.newFrameLock) {
            try {
                VideoFrame.Buffer buffer = this.renderedBuffer;
                if (buffer != null) {
                    buffer.release();
                    this.renderedBuffer = null;
                }
                this.hasBufferToRender = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.dispose();
        }
    }
}
