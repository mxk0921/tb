package com.taobao.android.fcanvas.integration.bridge;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.now;
import tb.ope;
import tb.ryp;
import tb.spk;
import tb.t2o;
import tb.u33;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FCanvasJNIBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FCanvas";
    private static ExternalAdapterImageProvider sExternalAdapterImageProvider;
    private static volatile boolean sIsImageProviderInstalled;
    private now mVsyncScheduler;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativePlatformViewId;
    private static final Map<String, OnCanvasTypeChangedListener> sOnCanvasTypeChangedListenerMap = new HashMap(4);
    private static final Map<String, spk> sOnCanvasFirstFrameListenerMap = new HashMap(4);
    private static final Map<String, WeakReference<Handler>> sCardJSHandlers = new HashMap(8);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ExternalTexture {
        public Surface surface;
        public SurfaceTextureWrapper surfaceTexture;

        static {
            t2o.a(945815590);
        }

        public ExternalTexture(SurfaceTextureWrapper surfaceTextureWrapper) {
            this.surfaceTexture = surfaceTextureWrapper;
            this.surface = new Surface(this.surfaceTexture.surfaceTexture());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface OnCanvasTypeChangedListener {
        void onCanvasTypeChanged(String str, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SurfaceTextureWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean released = false;
        private final SurfaceTexture surfaceTexture;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements SurfaceTexture.OnFrameAvailableListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SurfaceTexture.OnFrameAvailableListener f7655a;

            public a(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
                this.f7655a = onFrameAvailableListener;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture});
                } else if (!SurfaceTextureWrapper.access$000(SurfaceTextureWrapper.this)) {
                    this.f7655a.onFrameAvailable(surfaceTexture);
                }
            }
        }

        static {
            t2o.a(945815592);
        }

        public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
            this.surfaceTexture = surfaceTexture;
        }

        public static /* synthetic */ boolean access$000(SurfaceTextureWrapper surfaceTextureWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b2aea732", new Object[]{surfaceTextureWrapper})).booleanValue();
            }
            return surfaceTextureWrapper.released;
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
                        this.surfaceTexture.attachToGLContext(i);
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
            } else {
                this.surfaceTexture.detachFromGLContext();
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
                        this.surfaceTexture.setOnFrameAvailableListener(null);
                        this.surfaceTexture.release();
                        this.released = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdaa6c86", new Object[]{this, onFrameAvailableListener});
            } else {
                this.surfaceTexture.setOnFrameAvailableListener(new a(onFrameAvailableListener), new Handler(Looper.getMainLooper()));
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
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7656a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.f7656a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FCanvasJNIBridge.nPerformTaskOnJsThread(this.f7656a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements SurfaceTexture.OnFrameAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7657a;

        public b(String str) {
            this.f7657a = str;
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture});
            } else {
                FCanvasJNIBridge.access$100(this.f7657a);
            }
        }
    }

    static {
        t2o.a(945815587);
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            notifyExternalTextureFrameAvailable(str);
        }
    }

    public static ExternalTexture createExternalTexture(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExternalTexture) ipChange.ipc$dispatch("b9ba88dd", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        surfaceTexture.setDefaultBufferSize(i, i2);
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture);
        surfaceTextureWrapper.setOnFrameAvailableListener(new b(str));
        return new ExternalTexture(surfaceTextureWrapper);
    }

    public static native String dumpProfileInfo();

    private void ensureRunningOnMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84845aa", new Object[]{this});
        } else if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    public static ExternalAdapterImageProvider getExternalAdapterImageProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExternalAdapterImageProvider) ipChange.ipc$dispatch("f7a9ebdb", new Object[0]);
        }
        return sExternalAdapterImageProvider;
    }

    public static String imageBitmapToBase64(String str, boolean z, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a703459", new Object[]{str, new Boolean(z), str2, new Float(f)});
        }
        return ope.c(str, str2, f);
    }

    public static String imagePixelsToBase64(byte[] bArr, int i, int i2, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc5464a", new Object[]{bArr, new Integer(i), new Integer(i2), str, new Float(f)});
        }
        return ope.d(bArr, i, i2, i, i2, str, f);
    }

    public static void installExternalAdapterImageProvider(ExternalAdapterImageProvider externalAdapterImageProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee68f49c", new Object[]{externalAdapterImageProvider});
        } else if (externalAdapterImageProvider != null) {
            sExternalAdapterImageProvider = externalAdapterImageProvider;
            if (!sIsImageProviderInstalled) {
                notifyExternalAdapterImageProviderInstalled();
                sIsImageProviderInstalled = true;
            }
        }
    }

    public static native void nCreateNativeFCanvas(String str, int i, int i2, int i3, boolean z);

    private native Bitmap nMakeSnapshot(String str);

    public static native void nNotifyOnOnlineConfigChanged(String str);

    private native void nPause(long j);

    public static native void nPerformTaskOnJsThread(String str, long j);

    public static native void nRegisterCanvasNativeAPI(long j, String str);

    public static native void nResizeFCanvas(String str, int i, int i2, int i3, int i4);

    private native void nResume(long j);

    public static native void nUnRegisterCanvasNativeAPI(long j, String str);

    private native long nativeAttach(FCanvasJNIBridge fCanvasJNIBridge, String str);

    private native void nativeDestroy(long j, String str);

    public static native void nativeInitializeCanvasRuntime(float f, boolean z, int i, String str);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2);

    private native void nativeSurfaceChanged(long j, int i, int i2, String str, boolean z);

    private native void nativeSurfaceCreated(long j, Surface surface, String str, boolean z);

    private native void nativeSurfaceDestroyed(long j, String str, boolean z);

    private static native void notifyExternalAdapterImageProviderInstalled();

    private static native void notifyExternalTextureFrameAvailable(String str);

    public static void notifyOnCanvasTypeChanged(String str, boolean z) {
        Map<String, OnCanvasTypeChangedListener> map;
        OnCanvasTypeChangedListener onCanvasTypeChangedListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5fa1a9", new Object[]{str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && (onCanvasTypeChangedListener = (map = sOnCanvasTypeChangedListenerMap).get(str)) != null) {
            onCanvasTypeChangedListener.onCanvasTypeChanged(str, z);
            map.remove(str);
        }
    }

    public static void notifyOnFirstFrameFinish(String str) {
        Map<String, spk> map;
        spk spkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3814eb49", new Object[]{str});
        } else if (!TextUtils.isEmpty(str) && (spkVar = (map = sOnCanvasFirstFrameListenerMap).get(str)) != null) {
            spkVar.a();
            map.remove(str);
        }
    }

    public static void postTaskToJsThreadForMWidget(String str, long j) {
        WeakReference<Handler> weakReference;
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8476e718", new Object[]{str, new Long(j)});
        } else if (!TextUtils.isEmpty(str) && (weakReference = sCardJSHandlers.get(str)) != null && (handler = weakReference.get()) != null) {
            handler.post(new a(str, j));
        }
    }

    public static void registerCanvasNativeAPI(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0c5bbf", new Object[]{new Long(j), str});
        } else if (!TextUtils.isEmpty(str)) {
            nRegisterCanvasNativeAPI(j, str);
        }
    }

    public static void setJSHandlerForMWidget(String str, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb348b88", new Object[]{str, handler});
        } else if (!TextUtils.isEmpty(str) && handler != null) {
            sCardJSHandlers.put(str, new WeakReference<>(handler));
        }
    }

    public static void setOnCanvasFirstFrameListener(String str, spk spkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b603460c", new Object[]{str, spkVar});
        } else if (!TextUtils.isEmpty(str) && spkVar != null) {
            sOnCanvasFirstFrameListenerMap.put(str, spkVar);
        }
    }

    public static void setOnCanvasTypeChangedListener(String str, OnCanvasTypeChangedListener onCanvasTypeChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8601cb", new Object[]{str, onCanvasTypeChangedListener});
        } else if (!TextUtils.isEmpty(str) && onCanvasTypeChangedListener != null) {
            sOnCanvasTypeChangedListenerMap.put(str, onCanvasTypeChangedListener);
        }
    }

    public static void unRegisterCanvasNativeAPI(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433312b8", new Object[]{new Long(j), str});
        } else if (!TextUtils.isEmpty(str)) {
            nUnRegisterCanvasNativeAPI(j, str);
            sCardJSHandlers.remove(str);
        }
    }

    public void attachToNative(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaa2f28", new Object[]{this, str});
            return;
        }
        ensureRunningOnMainThread();
        if (this.nativePlatformViewId == null) {
            this.nativePlatformViewId = Long.valueOf(nativeAttach(this, str));
        }
    }

    public void bindVsyncScheduler(now nowVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83cc0d6a", new Object[]{this, nowVar});
        } else {
            this.mVsyncScheduler = nowVar;
        }
    }

    public void clearCallbacks(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbc2cd2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            sOnCanvasTypeChangedListenerMap.remove(str);
            sOnCanvasFirstFrameListenerMap.remove(str);
        }
    }

    public void detachFromNativeAndReleaseResources(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bf44b2", new Object[]{this, str});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            long longValue = l.longValue();
            if (TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                str2 = str;
            }
            nativeDestroy(longValue, str2);
        }
        this.nativePlatformViewId = null;
        u33.a().d(str);
    }

    public void dispatchVsync(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8245c6", new Object[]{this, new Long(j)});
            return;
        }
        Long l = this.nativePlatformViewId;
        if (l != null) {
            nativeOnVsync(l.longValue(), j);
        }
    }

    public boolean isAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue();
        }
        if (this.nativePlatformViewId != null) {
            return true;
        }
        return false;
    }

    public Bitmap makeSnapshot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("76fd38c1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !isAttached()) {
            return null;
        }
        return nMakeSnapshot(str);
    }

    public native void nativeOnVsync(long j, long j2);

    public native void notifyMemoryPressure(long j, String str);

    public void notifyMemoryPressure(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7ccb60", new Object[]{this, str});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            notifyMemoryPressure(l.longValue(), str);
        }
    }

    public void onSurfaceChanged(int i, int i2, String str, FCanvasInstance.RenderType renderType) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545809ea", new Object[]{this, new Integer(i), new Integer(i2), str, renderType});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            long longValue = l.longValue();
            if (renderType == FCanvasInstance.RenderType.webGL) {
                z = true;
            } else {
                z = false;
            }
            nativeSurfaceChanged(longValue, i, i2, str, z);
        }
    }

    public void onSurfaceCreated(Surface surface, String str, FCanvasInstance.RenderType renderType) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cfbdca", new Object[]{this, surface, str, renderType});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            long longValue = l.longValue();
            if (renderType == FCanvasInstance.RenderType.webGL) {
                z = true;
            } else {
                z = false;
            }
            nativeSurfaceCreated(longValue, surface, str, z);
        }
    }

    public void onSurfaceDestroyed(String str, FCanvasInstance.RenderType renderType) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894be3c5", new Object[]{this, str, renderType});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            long longValue = l.longValue();
            if (renderType != FCanvasInstance.RenderType.webGL) {
                z = false;
            }
            nativeSurfaceDestroyed(longValue, str, z);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        Long l = this.nativePlatformViewId;
        if (l != null) {
            nPause(l.longValue());
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        Long l = this.nativePlatformViewId;
        if (l != null) {
            nResume(l.longValue());
        }
    }

    public native void setProfileEnabled(String str, boolean z, boolean z2);

    public void setViewportMetrics(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9735d5e", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            nativeSetViewportMetrics(l.longValue(), f, i, i2);
        }
    }

    public void stopVsyncIfExists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce82af", new Object[]{this});
            return;
        }
        now nowVar = this.mVsyncScheduler;
        if (nowVar != null) {
            nowVar.c();
        }
    }

    public static String imagePixelsToTempPath(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str2, float f, boolean z2) {
        String str3 = "png";
        if (!str3.equalsIgnoreCase(str2)) {
            str3 = ryp.FILE_TYPE_IMAGE_JPG;
        }
        String e = ope.e(str, z, i, i2, i3, i4, i5, i6, str3, f, z2);
        String str4 = "";
        if (TextUtils.isEmpty(e)) {
            return str4;
        }
        try {
            Method declaredMethod = Class.forName("com.alibaba.triver.kit.api.utils.FileUtils").getDeclaredMethod("filePathToApUrl", String.class, String.class);
            declaredMethod.setAccessible(true);
            str4 = (String) declaredMethod.invoke(null, e, "image");
        } catch (Throwable th) {
            Log.e("FCanvas", "error when call toTempFilePath:", th);
        }
        return e + "^" + str4;
    }
}
