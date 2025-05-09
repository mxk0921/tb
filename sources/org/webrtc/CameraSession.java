package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.VideoFrame;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface CameraSession {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FailureType failureType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/CameraSession$FailureType");
        }

        public static FailureType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FailureType) ipChange.ipc$dispatch("dab0e932", new Object[]{str});
            }
            return (FailureType) Enum.valueOf(FailureType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class StaticMethod {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313727);
        }

        public static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBufferImpl textureBufferImpl, boolean z, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoFrame.TextureBuffer) ipChange.ipc$dispatch("1182d811", new Object[]{textureBufferImpl, new Boolean(z), new Integer(i)});
            }
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            if (z) {
                matrix.preScale(-1.0f, 1.0f);
            }
            matrix.preRotate(i);
            matrix.preTranslate(-0.5f, -0.5f);
            int width = textureBufferImpl.getWidth();
            int height = textureBufferImpl.getHeight();
            if (i == 90 || i == 270) {
                height = width;
                width = height;
            }
            return textureBufferImpl.applyTransformMatrix(matrix, width, height);
        }

        public static int getDeviceOrientation(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b684e2b0", new Object[]{context})).intValue();
            }
            int rotation = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRotation();
            if (rotation == 1) {
                return 90;
            }
            if (rotation == 2) {
                return 180;
            }
            if (rotation != 3) {
                return 0;
            }
            return 270;
        }
    }

    void enableTorch(boolean z);

    int getBrightness();

    void setBlack(boolean z);

    void setBrightness(int i);

    void stop();
}
