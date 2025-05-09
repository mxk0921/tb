package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class YuvConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
    private boolean released = false;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        static {
            t2o.a(395313856);
            t2o.a(395313766);
        }

        private ShaderCallbacks() {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a180a53", new Object[]{this, glShader});
                return;
            }
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a0e7897", new Object[]{this, glShader, fArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }

        public void setPlaneU() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51c19782", new Object[]{this});
                return;
            }
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51cfaf03", new Object[]{this});
                return;
            }
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51f9f586", new Object[]{this});
                return;
            }
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }
    }

    static {
        t2o.a(395313854);
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        threadChecker.detachThread();
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.I420Buffer) ipChange.ipc$dispatch("d91d93fa", new Object[]{this, textureBuffer});
        }
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            int width = textureBuffer.getWidth();
            int height = textureBuffer.getHeight();
            int i = ((width + 7) / 8) * 8;
            int i2 = (height + 1) / 2;
            int i3 = height + i2;
            final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i * i3);
            int i4 = i / 4;
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            this.i420TextureFrameBuffer.setSize(i4, i3);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i4, height);
            this.shaderCallbacks.setPlaneU();
            int i5 = i4 / 2;
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i5, i2);
            this.shaderCallbacks.setPlaneV();
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i5, height, i5, i2);
            GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
            GlUtil.checkNoGLES2Error("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
            int i6 = i * height;
            int i7 = i / 2;
            int i8 = i6 + i7;
            nativeAllocateByteBuffer.position(0);
            nativeAllocateByteBuffer.limit(i6);
            ByteBuffer slice = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i6);
            int i9 = ((i2 - 1) * i) + i7;
            nativeAllocateByteBuffer.limit(i6 + i9);
            ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i8);
            nativeAllocateByteBuffer.limit(i8 + i9);
            return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, new Runnable() { // from class: org.webrtc.YuvConverter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                    }
                }
            });
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
    }
}
