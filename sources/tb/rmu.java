package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f27479a = new Matrix();
    public final GlTextureFrameBuffer b = new GlTextureFrameBuffer(6408);
    public final VideoFrameDrawer c = new VideoFrameDrawer();
    public final RendererCommon.GlDrawer d = new GlRectDrawer();

    static {
        t2o.a(395313687);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.d.release();
        this.c.release();
        this.b.release();
    }

    public Bitmap b(VideoFrame videoFrame, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("120579d8", new Object[]{this, videoFrame, new Float(f)});
        }
        this.f27479a.reset();
        this.f27479a.preTranslate(0.5f, 0.5f);
        this.f27479a.preScale(1.0f, -1.0f);
        this.f27479a.preTranslate(-0.5f, -0.5f);
        int rotatedWidth = (int) (videoFrame.getRotatedWidth() * f);
        int rotatedHeight = (int) (f * videoFrame.getRotatedHeight());
        if (rotatedWidth == 0 || rotatedHeight == 0) {
            return null;
        }
        this.b.setSize(rotatedWidth, rotatedHeight);
        GLES20.glBindFramebuffer(36160, this.b.getFrameBufferId());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.b.getTextureId(), 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.c.drawFrame(videoFrame, this.d, this.f27479a, 0, 0, rotatedWidth, rotatedHeight);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }
}
