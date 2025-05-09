package com.taobao.android.weex_framework.common;

import android.graphics.SurfaceTexture;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SurfaceTextureWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean attached;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;

    static {
        t2o.a(982516071);
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    public void attachToGLContext(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113d5032", new Object[]{this, new Integer(i)});
            return;
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2ee5d4", new Object[]{this});
            return;
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab63d569", new Object[]{this, fArr});
        } else {
            this.surfaceTexture.getTransformMatrix(fArr);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTexture) ipChange.ipc$dispatch("78c76774", new Object[]{this});
        }
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6464b64", new Object[]{this});
            return;
        }
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
