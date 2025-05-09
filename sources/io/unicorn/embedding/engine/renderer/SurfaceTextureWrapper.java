package io.unicorn.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SurfaceTextureWrapper {
    private boolean attached;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;

    static {
        t2o.a(945815719);
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    public void attachToGLContext(int i) {
        synchronized (this) {
            try {
                if (!this.released) {
                    if (this.attached) {
                        this.surfaceTexture.detachFromGLContext();
                    }
                    this.surfaceTexture.attachToGLContext(i);
                    this.attached = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void detachFromGLContext() {
        synchronized (this) {
            try {
                if (this.attached && !this.released) {
                    this.surfaceTexture.detachFromGLContext();
                    this.attached = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        this.surfaceTexture.getTransformMatrix(fArr);
    }

    public void release() {
        synchronized (this) {
            try {
                if (!this.released) {
                    this.surfaceTexture.release();
                    this.released = true;
                    this.attached = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        synchronized (this) {
            try {
                if (!this.released) {
                    this.surfaceTexture.updateTexImage();
                    Runnable runnable = this.onFrameConsumed;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture, Runnable runnable) {
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = runnable;
    }
}
