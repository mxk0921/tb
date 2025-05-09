package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class Camera1Enumerator implements CameraEnumerator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;

    static {
        t2o.a(395313692);
        t2o.a(395313722);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1324b0d6", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4fd668d0", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b8f203c3", new Object[]{new Integer(i)});
        }
        Logging.d(TAG, "Get supported formats for camera index " + i + ".");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            try {
                Logging.d(TAG, "Opening camera with index " + i);
                camera = Camera.open(i);
                Camera.Parameters parameters = camera.getParameters();
                camera.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i3 = iArr[0];
                        i2 = iArr[1];
                    } else {
                        i2 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i3, i2));
                    }
                } catch (Exception e) {
                    Logging.e(TAG, "getSupportedFormats() failed on camera index " + i, e);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Logging.d(TAG, "Get supported formats for camera index " + i + " done. Time spent: " + (elapsedRealtime2 - elapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException e2) {
                Logging.e(TAG, "Open camera failed on camera index " + i, e2);
                ArrayList arrayList2 = new ArrayList();
                if (camera != null) {
                    camera.release();
                }
                return arrayList2;
            }
        } catch (Throwable th) {
            if (camera != null) {
                camera.release();
            }
            throw th;
        }
    }

    public static int getCameraIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("363122bb", new Object[]{str})).intValue();
        }
        Logging.d(TAG, "getCameraIndex: " + str);
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        Logging.e(TAG, "No such camera: " + str);
        return -1;
    }

    private static Camera.CameraInfo getCameraInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera.CameraInfo) ipChange.ipc$dispatch("d91569e7", new Object[]{new Integer(i)});
        }
        if (i == -1) {
            Logging.e(TAG, "getCameraInfo index is invalid:" + i);
            return null;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            Logging.e(TAG, "getCameraInfo failed on index " + i, e);
            return null;
        }
    }

    public static String getDeviceName(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cad5f7b", new Object[]{new Integer(i)});
        }
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        return "Camera " + i + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer) ipChange.ipc$dispatch("6dc37c1b", new Object[]{this, context, str, cameraEventsHandler});
        }
        return new Camera1Capturer(context, str, cameraEventsHandler);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f852ccf2", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.d(TAG, "Index: " + i + ". " + deviceName);
            } else {
                Logging.e(TAG, "Index: " + i + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f242abd2", new Object[]{this, str}) : getSupportedFormats(getCameraIndex(str));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2f57cc0", new Object[]{this, str})).booleanValue();
        }
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 0) {
            return false;
        }
        return true;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f2f15ae", new Object[]{this, str})).booleanValue();
        }
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 1) {
            return false;
        }
        return true;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i) {
        synchronized (Camera1Enumerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d39097af", new Object[]{new Integer(i)});
            } else if (i == -1) {
                return new ArrayList();
            } else {
                if (cachedSupportedFormats == null) {
                    cachedSupportedFormats = new ArrayList();
                    for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                        cachedSupportedFormats.add(enumerateFormats(i2));
                    }
                }
                return cachedSupportedFormats.get(i);
            }
        }
    }
}
