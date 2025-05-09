package io.unicorn.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import com.taobao.android.weex.WeexValue;
import io.unicorn.embedding.android.UnicornTextureView;
import io.unicorn.embedding.engine.a;
import io.unicorn.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.unicorn.embedding.engine.renderer.SurfaceTextureWrapper;
import io.unicorn.plugin.platform.PlatformViewsController;
import io.unicorn.view.AccessibilityBridge;
import io.unicorn.view.FlutterCallbackInformation;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.e5m;
import tb.f9x;
import tb.hdh;
import tb.hhq;
import tb.hpm;
import tb.js9;
import tb.khv;
import tb.oow;
import tb.t2o;
import tb.t5m;
import tb.u8x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate;
    private static String observatoryUri;
    private a accessibilityDelegate;
    private c mUpdateListener;
    private Long nativePlatformUniqueId;
    private Long nativeShellHolderId;
    private e5m platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private d shellSetupListener;
    private static float refreshRateFPS = 60.0f;
    private static boolean loadLibraryCalled = false;
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<js9> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface d {
        void onReady();
    }

    static {
        t2o.a(945815685);
    }

    private static void asyncWaitForVsync(long j) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar != null) {
            ((oow.a) bVar).a(j);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessageResponse(int i, byte[] bArr) {
        e5m e5mVar = this.platformMessageHandler;
        if (e5mVar != null) {
            ((khv) e5mVar).d(i, bArr);
        }
    }

    private native long nativeAttach(FlutterJNI flutterJNI, String[] strArr);

    private native void nativeCleanOrRestoreImages(long j, boolean z);

    private native void nativeClearEngineCache(long j);

    private native void nativeDestroy(long j, long j2);

    private native void nativeDestroyImageByteBuffer(long j);

    private native void nativeDetach(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native int nativeGetAverageFPS(long j);

    private native Bitmap nativeGetBitmap(long j, boolean z);

    private native ByteBuffer nativeGetImageByteBuffer(long j);

    private native String nativeGetScreenshotPixelCheckInfo(long j);

    private native long nativeGetUnicornFirstScreenTimeInterval(long j);

    private native long nativeGetUnicornFirstScreenTimeStamp(long j);

    public static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j);

    public static native void nativeInstallFlutterExternalAdapterImageProvider();

    public static native void nativeInstallFlutterExternalAdapterNetworkProvider();

    private native void nativeInvalidGlContext(long j);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    public static native void nativeOnVsync(long j, long j2, long j3);

    private native long nativePlatformUniqueId(long j);

    public static native void nativePrefetchDefaultFontManager(boolean z);

    private native long nativeReattach(long j, String[] strArr);

    private native void nativeRegisterPlatformView(String str, long j);

    private native void nativeRegisterTexture(long j, long j2, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRegsiterFonts(long j, HashMap<String, String> hashMap);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetAssetManager(long j, AssetManager assetManager);

    public static native void nativeSetDarkModeColorMap(Map<Integer, Integer> map);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private native FlutterJNI nativeSpawn(long j, String[] strArr);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, Surface surface, boolean z);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface, boolean z);

    public static native void nativeSwitchTraceState(boolean z);

    private native void nativeSyncForceBeginFrame(long j);

    private native void nativeUnregisterTexture(long j, long j2);

    private static native void nativeUpdateRefreshRate(float f);

    public static void onLoadedLibrary() {
        loadLibraryCalled = true;
    }

    private void onPreEngineRestart() {
        for (a.b bVar : this.engineLifecycleListeners) {
            bVar.b();
        }
    }

    public static void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public static void setRefreshRateFPS(float f) {
        if (refreshRateFPS != f) {
            refreshRateFPS = f;
            updateRefreshRate();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            ((AccessibilityBridge.a) aVar).f(byteBuffer, strArr);
        }
    }

    public static void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            ((AccessibilityBridge.a) aVar).g(byteBuffer, strArr, byteBufferArr);
        }
    }

    public WeexValue CallUINodeMethod(int i, String str, WeexValue[] weexValueArr) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.a(i, str, weexValueArr);
        }
        return null;
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(js9 js9Var) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(js9Var);
    }

    public void addShellSetupListener(d dVar) {
        ensureRunningOnMainThread();
        this.shellSetupListener = dVar;
    }

    public void attachToNative(String[] strArr) {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        Long valueOf = Long.valueOf(performNativeAttach(this, strArr));
        this.nativeShellHolderId = valueOf;
        this.nativePlatformUniqueId = Long.valueOf(nativePlatformUniqueId(valueOf.longValue()));
    }

    public void cleanOrRestoreImages(boolean z) {
        nativeCleanOrRestoreImages(this.nativeShellHolderId.longValue(), z);
    }

    public void clearEngineCache() {
        nativeClearEngineCache(this.nativeShellHolderId.longValue());
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.j();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public long createPlatformView(String str, int i, int i2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.l(str, i, i2, hashMap, hashMap2, hashSet);
        }
        return -1L;
    }

    public void destroyImageByteBuffer() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDestroyImageByteBuffer(this.nativeShellHolderId.longValue());
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.p();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDestroy(this.nativeShellHolderId.longValue(), this.nativePlatformUniqueId.longValue());
        this.nativeShellHolderId = null;
    }

    public void detachPlatformView(int i) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.t(i);
        }
    }

    public void detachToNative() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDetach(this.nativeShellHolderId.longValue());
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        hdh.f(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        hdh.f(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i, action, null);
    }

    public void disposePlatformView(int i, int i2) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.v(i, i2);
        }
    }

    public int getAverageFPS() {
        return nativeGetAverageFPS(this.nativeShellHolderId.longValue());
    }

    public Bitmap getBitmap(boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue(), z);
    }

    public ByteBuffer getImageByteBuffer() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetImageByteBuffer(this.nativeShellHolderId.longValue());
    }

    public String getScreenshotPixelCheckInfo() {
        return nativeGetScreenshotPixelCheckInfo(this.nativeShellHolderId.longValue());
    }

    public long getUnicornEngineId() {
        Long l = this.nativePlatformUniqueId;
        if (l == null || l.longValue() == 0) {
            return -1L;
        }
        return this.nativePlatformUniqueId.longValue();
    }

    public long getUnicornFirstScreenTimeInterval() {
        Long l = this.nativePlatformUniqueId;
        if (l == null || l.longValue() == 0) {
            return -1L;
        }
        return nativeGetUnicornFirstScreenTimeInterval(this.nativePlatformUniqueId.longValue());
    }

    public long getUnicornFirstScreenTimeStamp() {
        Long l = this.nativePlatformUniqueId;
        if (l == null || l.longValue() == 0) {
            return -1L;
        }
        return nativeGetUnicornFirstScreenTimeStamp(this.nativePlatformUniqueId.longValue());
    }

    public void handlePlatformMessage(String str, byte[] bArr, int i) {
        e5m e5mVar = this.platformMessageHandler;
        if (e5mVar != null) {
            ((khv) e5mVar).c(str, bArr, i);
        }
    }

    public void invalidGlContext() {
        nativeInvalidGlContext(this.nativeShellHolderId.longValue());
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            return;
        }
        hdh.f(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
            return;
        }
        hdh.f(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public native boolean nativeFlutterTextUtilsIsEmoji(int i);

    public native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    public native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    public native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    public native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void offsetPlatformView(int i, int i2, double d2, double d3) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.I(i, d2, d3);
        }
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.Q();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.S(i, i2, i3, i4, i5);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack, int i8) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.T(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack, i8);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.U();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (js9 js9Var : this.flutterUiDisplayListeners) {
            js9Var.b();
        }
    }

    public void onNewFrameAvailable() {
        c cVar = this.mUpdateListener;
        if (cVar != null) {
            ((UnicornTextureView.b) cVar).a();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (js9 js9Var : this.flutterUiDisplayListeners) {
            js9Var.a();
        }
    }

    public void onShellSetupReady() {
        ensureRunningOnMainThread();
        u8x.a("onShellSetupReady");
        d dVar = this.shellSetupListener;
        if (dVar != null) {
            dVar.onReady();
            this.shellSetupListener = null;
        }
        u8x.b("onShellSetupReady");
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        onSurfaceCreated(surface, false);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface, z);
    }

    public long performNativeAttach(FlutterJNI flutterJNI, String[] strArr) {
        return nativeAttach(flutterJNI, strArr);
    }

    public void reattachToNative(String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.nativePlatformUniqueId = Long.valueOf(nativeReattach(this.nativeShellHolderId.longValue(), strArr));
    }

    public void registerPlatformView(String str) {
        nativeRegisterPlatformView(str, this.nativePlatformUniqueId.longValue());
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void regsiterFonts(HashMap<String, String> hashMap) {
        nativeRegsiterFonts(this.nativeShellHolderId.longValue(), hashMap);
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(js9 js9Var) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(js9Var);
    }

    public int resizePlatformView(int i, int i2, double d2, double d3) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.d0(i, i2, d2, d3);
        }
        return 0;
    }

    public void sendTouchEvents(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2, int i8, int i9, int i10, int i11, long j, Object obj, Object obj2) {
        ensureRunningOnMainThread();
        t5m.a aVar = new t5m.a(i, Integer.valueOf(i2), Integer.valueOf(i3), i4, i5, obj, obj2, i6, i7, f, f2, i8, i9, i10, i11, j);
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.W(aVar);
        }
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAssetManager(AssetManager assetManager) {
        nativeSetAssetManager(this.nativeShellHolderId.longValue(), assetManager);
    }

    public void setOnFrameAvailableListener(c cVar) {
        this.mUpdateListener = cVar;
    }

    public void setPlatformMessageHandler(e5m e5mVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = e5mVar;
    }

    public void setPlatformViewsController(PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public FlutterJNI spawn(String[] strArr) {
        boolean z;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), strArr);
        Long l = nativeSpawn.nativeShellHolderId;
        if (l == null || l.longValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        hpm.a(z, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void syncForceBeginFrame() {
        nativeSyncForceBeginFrame(this.nativeShellHolderId.longValue());
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updatePlatformViewAttrs(int i, HashMap<String, String> hashMap, int i2) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.k0(i, hashMap, i2);
        }
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = hhq.INSTANCE.b(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, action.value, byteBuffer, i2);
    }

    public void onSurfaceCreated(Surface surface, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface, z);
    }

    public long createPlatformView(String str, int i, int i2, WeexValue weexValue, WeexValue weexValue2, HashSet<String> hashSet) {
        ensureRunningOnMainThread();
        if (this.platformViewsController == null) {
            return -1L;
        }
        return this.platformViewsController.l(str, i, i2, f9x.c(weexValue), f9x.c(weexValue2), hashSet);
    }

    public void updatePlatformViewAttrs(int i, WeexValue weexValue, int i2) {
        ensureRunningOnMainThread();
        if (this.platformViewsController != null) {
            this.platformViewsController.k0(i, f9x.c(weexValue), i2);
        }
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }
}
