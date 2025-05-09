package tb;

import android.view.SurfaceHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface alb {
    void a(aj7 aj7Var);

    void b(zkb zkbVar);

    int getCameraViewRotation();

    int getColorHeight();

    int getColorWidth();

    int getPreviewHeight();

    int getPreviewWidth();

    void releaseCamera();

    void startCamera();

    void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2);

    void stopCamera();
}
