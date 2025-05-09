package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.IpChange;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class EglBase10 implements EglBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
    private final EGL10 egl = (EGL10) EGLContext.getEGL();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class Context implements EglBase.Context {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EGLContext eglContext;

        static {
            t2o.a(395313741);
            t2o.a(395313737);
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }

        public static /* synthetic */ EGLContext access$000(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EGLContext) ipChange.ipc$dispatch("110e56cc", new Object[]{context});
            }
            return context.eglContext;
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b1f44ad", new Object[]{this})).longValue();
            }
            return 0L;
        }
    }

    static {
        t2o.a(395313739);
        t2o.a(395313736);
    }

    public EglBase10(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    private void checkIsNotReleased() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b84f05", new Object[]{this});
        } else if (this.eglDisplay == EGL10.EGL_NO_DISPLAY || this.eglContext == EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    private EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eglCreateContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLContext) ipChange.ipc$dispatch("43c6bdf7", new Object[]{this, context, eGLDisplay, eGLConfig});
        }
        if (context == null || Context.access$000(context) != EGL10.EGL_NO_CONTEXT) {
            int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
            if (context == null) {
                eGLContext = EGL10.EGL_NO_CONTEXT;
            } else {
                eGLContext = Context.access$000(context);
            }
            synchronized (EglBase.lock) {
                eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            }
            if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            throw new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(this.egl.eglGetError()));
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    private void createSurfaceInternal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb545411", new Object[]{this, obj});
        } else if ((obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            EGLSurface eGLSurface = this.eglSurface;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface == eGLSurface2) {
                EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == eGLSurface2) {
                    throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        } else {
            throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLConfig) ipChange.ipc$dispatch("fe1a28ef", new Object[]{this, eGLDisplay, iArr});
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    private EGLDisplay getEglDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLDisplay) ipChange.ipc$dispatch("40fb53b6", new Object[]{this});
        }
        EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL10 display: 0x" + Integer.toHexString(this.egl.eglGetError()));
        } else if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        } else {
            throw new RuntimeException("Unable to initialize EGL10: 0x" + Integer.toHexString(this.egl.eglGetError()));
        }
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543ee10", new Object[]{this});
        } else {
            createPbufferSurface(1, 1);
        }
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f4a260", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == eGLSurface2) {
                throw new RuntimeException("Failed to create pixel buffer surface with size " + i + "x" + i2 + ": 0x" + Integer.toHexString(this.egl.eglGetError()));
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2836a7e4", new Object[]{this, surface});
        } else {
            createSurfaceInternal(new SurfaceHolder(surface) { // from class: org.webrtc.EglBase10.1FakeSurfaceHolder
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final Surface surface;

                static {
                    t2o.a(395313740);
                }

                {
                    this.surface = surface;
                }

                @Override // android.view.SurfaceHolder
                public void addCallback(SurfaceHolder.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efe9cc7a", new Object[]{this, callback});
                    }
                }

                @Override // android.view.SurfaceHolder
                public Surface getSurface() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Surface) ipChange2.ipc$dispatch("91c7c0e4", new Object[]{this});
                    }
                    return this.surface;
                }

                @Override // android.view.SurfaceHolder
                public Rect getSurfaceFrame() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Rect) ipChange2.ipc$dispatch("e77f3246", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.view.SurfaceHolder
                public boolean isCreating() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("2efde10e", new Object[]{this})).booleanValue();
                    }
                    return false;
                }

                @Override // android.view.SurfaceHolder
                public Canvas lockCanvas() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Canvas) ipChange2.ipc$dispatch("682e273f", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.view.SurfaceHolder
                public void removeCallback(SurfaceHolder.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9987af7", new Object[]{this, callback});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setFixedSize(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("414e683a", new Object[]{this, new Integer(i), new Integer(i2)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setFormat(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c456a403", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setKeepScreenOn(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("590d82db", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setSizeFromLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4052bc5e", new Object[]{this});
                    }
                }

                @Override // android.view.SurfaceHolder
                @Deprecated
                public void setType(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void unlockCanvasAndPost(Canvas canvas) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f7596e3", new Object[]{this, canvas});
                    }
                }

                @Override // android.view.SurfaceHolder
                public Canvas lockCanvas(Rect rect) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Canvas) ipChange2.ipc$dispatch("6b5af8c4", new Object[]{this, rect});
                    }
                    return null;
                }
            });
        }
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16103ed", new Object[]{this});
            return;
        }
        synchronized (EglBase.lock) {
            try {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.EglBase
    public EglBase.Context getEglBaseContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase.Context) ipChange.ipc$dispatch("be063245", new Object[]{this});
        }
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a645a3be", new Object[]{this})).booleanValue();
        }
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187d1eb2", new Object[]{this});
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                try {
                    EGL10 egl10 = this.egl;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    @Override // org.webrtc.EglBase
    public void recoverLastContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2519c3c", new Object[]{this});
            return;
        }
        throw new RuntimeException("unsupported recoverLastContext");
    }

    @Override // org.webrtc.EglBase
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
            return;
        }
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d34beae", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56ce8513", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405213a7", new Object[]{this});
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf02d37", new Object[]{this, surfaceTexture});
        } else {
            createSurfaceInternal(surfaceTexture);
        }
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f0d7fd", new Object[]{this, new Long(j)});
        } else {
            swapBuffers();
        }
    }
}
