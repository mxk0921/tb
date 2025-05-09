package com.etao.feimagesearch.capture.perf;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.t2o;
import tb.u63;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CapturePerfRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Boolean hasAlbumPermission;
    private static volatile Boolean hasDowngrade;
    private static volatile Boolean isNewCapture;
    public static final CapturePerfRecord INSTANCE = new CapturePerfRecord();
    private static volatile long captureInitStart = -1;
    private static volatile long captureInitEnd = -1;
    private static volatile long cameraFirstFrameCall = -1;
    private static volatile long cameraFirstFrameCallWithSystemTime = -1;
    private static volatile long albumLoadEnd = -1;
    private static volatile long albumLoadEndWithSystemTime = -1;
    private static volatile long muiseLoadEnd = -1;
    private static volatile long muiseLoadEndWithSystemTime = -1;
    private static volatile long uiLoadEnd = -1;
    private static volatile long uiLoadEndWithSystemTime = -1;

    static {
        t2o.a(481296687);
    }

    private CapturePerfRecord() {
    }

    @JvmStatic
    public static final void markAlbumLoadEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d711afa", new Object[]{new Boolean(z)});
            return;
        }
        albumLoadEnd = SystemClock.elapsedRealtime();
        albumLoadEndWithSystemTime = System.currentTimeMillis();
        hasAlbumPermission = Boolean.valueOf(z);
        report(false);
    }

    @JvmStatic
    public static final void markCameraFirstFrameCall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41badf94", new Object[0]);
            return;
        }
        cameraFirstFrameCall = SystemClock.elapsedRealtime();
        cameraFirstFrameCallWithSystemTime = System.currentTimeMillis();
        report(false);
    }

    @JvmStatic
    public static final void markCaptureInitEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efbcb39", new Object[0]);
        } else {
            captureInitEnd = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void markCaptureInitStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c27180", new Object[0]);
        } else {
            captureInitStart = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void markMuiseLoadEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e796936", new Object[0]);
            return;
        }
        muiseLoadEnd = SystemClock.elapsedRealtime();
        muiseLoadEndWithSystemTime = System.currentTimeMillis();
    }

    @JvmStatic
    public static final void markUiLoadEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0daf719", new Object[]{new Boolean(z)});
            return;
        }
        uiLoadEnd = SystemClock.elapsedRealtime();
        uiLoadEndWithSystemTime = System.currentTimeMillis();
        hasDowngrade = Boolean.valueOf(z);
        report(false);
    }

    @JvmStatic
    public static final void report(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee788a79", new Object[]{new Boolean(z)});
        } else if (captureInitStart <= 0) {
            INSTANCE.reset();
        } else {
            if (z) {
                if (albumLoadEnd < 0) {
                    return;
                }
            } else if (uiLoadEnd <= 0 || cameraFirstFrameCall <= 0 || albumLoadEnd <= 0) {
                return;
            }
            CapturePerfRecord capturePerfRecord = INSTANCE;
            u63.d(capturePerfRecord);
            capturePerfRecord.reset();
        }
    }

    private final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        hasDowngrade = null;
        hasAlbumPermission = null;
        isNewCapture = null;
        captureInitStart = -1L;
        captureInitEnd = -1L;
        cameraFirstFrameCall = -1L;
        cameraFirstFrameCallWithSystemTime = -1L;
        albumLoadEnd = -1L;
        albumLoadEndWithSystemTime = -1L;
        muiseLoadEnd = -1L;
        muiseLoadEndWithSystemTime = -1L;
        uiLoadEnd = -1L;
        uiLoadEndWithSystemTime = -1L;
    }

    @JvmStatic
    public static final void updateCaptureState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd8359", new Object[]{new Boolean(z)});
        } else {
            isNewCapture = Boolean.valueOf(z);
        }
    }

    public final long getAlbumLoadEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad155197", new Object[]{this})).longValue();
        }
        return albumLoadEnd;
    }

    public final long getAlbumLoadEndWithSystemTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92a7f2b9", new Object[]{this})).longValue();
        }
        return albumLoadEndWithSystemTime;
    }

    public final long getCameraFirstFrameCall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e4a9d11", new Object[]{this})).longValue();
        }
        return cameraFirstFrameCall;
    }

    public final long getCameraFirstFrameCallWithSystemTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddcea0b3", new Object[]{this})).longValue();
        }
        return cameraFirstFrameCallWithSystemTime;
    }

    public final long getCaptureInitEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db66a376", new Object[]{this})).longValue();
        }
        return captureInitEnd;
    }

    public final long getCaptureInitStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d85b7d", new Object[]{this})).longValue();
        }
        return captureInitStart;
    }

    public final Boolean getHasAlbumPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d772745e", new Object[]{this});
        }
        return hasAlbumPermission;
    }

    public final Boolean getHasDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e13ea4f5", new Object[]{this});
        }
        return hasDowngrade;
    }

    public final long getMuiseLoadEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b1fbfb3", new Object[]{this})).longValue();
        }
        return muiseLoadEnd;
    }

    public final long getMuiseLoadEndWithSystemTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22d97fd5", new Object[]{this})).longValue();
        }
        return muiseLoadEndWithSystemTime;
    }

    public final long getUiLoadEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc18fd26", new Object[]{this})).longValue();
        }
        return uiLoadEnd;
    }

    public final long getUiLoadEndWithSystemTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f4b808", new Object[]{this})).longValue();
        }
        return uiLoadEndWithSystemTime;
    }

    public final Boolean isNewCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c8d22494", new Object[]{this});
        }
        return isNewCapture;
    }

    public final void setAlbumLoadEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12b65f5", new Object[]{this, new Long(j)});
        } else {
            albumLoadEnd = j;
        }
    }

    public final void setAlbumLoadEndWithSystemTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd40e13", new Object[]{this, new Long(j)});
        } else {
            albumLoadEndWithSystemTime = j;
        }
    }

    public final void setCameraFirstFrameCall(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d5d5bb", new Object[]{this, new Long(j)});
        } else {
            cameraFirstFrameCall = j;
        }
    }

    public final void setCameraFirstFrameCallWithSystemTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c46b59", new Object[]{this, new Long(j)});
        } else {
            cameraFirstFrameCallWithSystemTime = j;
        }
    }

    public final void setCaptureInitEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb302f6", new Object[]{this, new Long(j)});
        } else {
            captureInitEnd = j;
        }
    }

    public final void setCaptureInitStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea463ecf", new Object[]{this, new Long(j)});
        } else {
            captureInitStart = j;
        }
    }

    public final void setHasAlbumPermission(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e087b900", new Object[]{this, bool});
        } else {
            hasAlbumPermission = bool;
        }
    }

    public final void setHasDowngrade(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0c0249", new Object[]{this, bool});
        } else {
            hasDowngrade = bool;
        }
    }

    public final void setMuiseLoadEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46ebb59", new Object[]{this, new Long(j)});
        } else {
            muiseLoadEnd = j;
        }
    }

    public final void setMuiseLoadEndWithSystemTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d42477", new Object[]{this, new Long(j)});
        } else {
            muiseLoadEndWithSystemTime = j;
        }
    }

    public final void setNewCapture(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22c36de", new Object[]{this, bool});
        } else {
            isNewCapture = bool;
        }
    }

    public final void setUiLoadEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efd87de", new Object[]{this, new Long(j)});
        } else {
            uiLoadEnd = j;
        }
    }

    public final void setUiLoadEndWithSystemTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78c243c", new Object[]{this, new Long(j)});
        } else {
            uiLoadEndWithSystemTime = j;
        }
    }
}
