package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoCapturer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class umu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313688);
    }

    public static VideoCapturer a(Context context, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer) ipChange.ipc$dispatch("be93e0f1", new Object[]{context, cameraEventsHandler, new Boolean(z)});
        }
        Camera1Enumerator camera1Enumerator = new Camera1Enumerator();
        String[] deviceNames = camera1Enumerator.getDeviceNames();
        TrtcLog.j("TrtcVideoCapturer", "Looking for preferred camera, frontCamera:" + z);
        for (String str : deviceNames) {
            if ((z && camera1Enumerator.isFrontFacing(str)) || (!z && !camera1Enumerator.isFrontFacing(str))) {
                TrtcLog.j("TrtcVideoCapturer", "Creating camera capture, prefer front:" + z + ", name:" + str);
                CameraVideoCapturer createCapturer = camera1Enumerator.createCapturer(context, str, cameraEventsHandler);
                if (createCapturer != null) {
                    return createCapturer;
                }
            }
        }
        TrtcLog.j("TrtcVideoCapturer", "Looking for other cameras.");
        for (String str2 : deviceNames) {
            if (!camera1Enumerator.isFrontFacing(str2)) {
                TrtcLog.j("TrtcVideoCapturer", "Creating other camera capture.");
                CameraVideoCapturer createCapturer2 = camera1Enumerator.createCapturer(context, str2, cameraEventsHandler);
                if (createCapturer2 != null) {
                    return createCapturer2;
                }
            }
        }
        return null;
    }

    public static VideoCapturer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer) ipChange.ipc$dispatch("e4d332be", new Object[0]);
        }
        TrtcLog.j("TrtcVideoCapturer", "create ExternalVideoCapturer");
        return new olu();
    }
}
