package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import org.webrtc.Logging;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class WebRtcAudioUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WebRtcAudioUtilsExternal";

    static {
        t2o.a(395313877);
    }

    private static String deviceTypeToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6e8d100", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static String getThreadInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("846c71eb", new Object[0]);
        }
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static boolean hasMicrophone(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49c2b841", new Object[]{context})).booleanValue();
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices;
        int type;
        boolean isSource;
        String str2;
        int[] channelCounts;
        int[] encodings;
        int[] sampleRates;
        int id;
        int[] sampleRates2;
        int[] encodings2;
        int[] channelCounts2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3426a34", new Object[]{str, audioManager});
        } else if (runningOnMarshmallowOrHigher()) {
            devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                Logging.d(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder sb = new StringBuilder("  ");
                    type = audioDeviceInfo.getType();
                    sb.append(deviceTypeToString(type));
                    isSource = audioDeviceInfo.isSource();
                    if (isSource) {
                        str2 = "(in): ";
                    } else {
                        str2 = "(out): ";
                    }
                    sb.append(str2);
                    channelCounts = audioDeviceInfo.getChannelCounts();
                    if (channelCounts.length > 0) {
                        sb.append("channels=");
                        channelCounts2 = audioDeviceInfo.getChannelCounts();
                        sb.append(Arrays.toString(channelCounts2));
                        sb.append(", ");
                    }
                    encodings = audioDeviceInfo.getEncodings();
                    if (encodings.length > 0) {
                        sb.append("encodings=");
                        encodings2 = audioDeviceInfo.getEncodings();
                        sb.append(Arrays.toString(encodings2));
                        sb.append(", ");
                    }
                    sampleRates = audioDeviceInfo.getSampleRates();
                    if (sampleRates.length > 0) {
                        sb.append("sample rates=");
                        sampleRates2 = audioDeviceInfo.getSampleRates();
                        sb.append(Arrays.toString(sampleRates2));
                        sb.append(", ");
                    }
                    sb.append("id=");
                    id = audioDeviceInfo.getId();
                    sb.append(id);
                    Logging.d(str, sb.toString());
                }
            }
        }
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9cb7a5", new Object[]{str, context, audioManager});
            return;
        }
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eefb5", new Object[]{str, context, audioManager});
            return;
        }
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone(context) + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cc8f77", new Object[]{str, audioManager});
            return;
        }
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        if (runningOnLollipopOrHigher()) {
            z = audioManager.isVolumeFixed();
            Logging.d(str, "  fixed volume=" + z);
        } else {
            z = false;
        }
        if (!z) {
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                StringBuilder sb = new StringBuilder();
                sb.append("  " + streamTypeToString(i2) + ": ");
                sb.append("volume=");
                sb.append(audioManager.getStreamVolume(i2));
                sb.append(", max=");
                sb.append(audioManager.getStreamMaxVolume(i2));
                logIsStreamMute(str, audioManager, i2, sb);
                Logging.d(str, sb.toString());
            }
        }
    }

    public static void logDeviceInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08e3b19", new Object[]{str});
            return;
        }
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        boolean isStreamMute;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b36e56d", new Object[]{str, audioManager, new Integer(i), sb});
        } else if (runningOnMarshmallowOrHigher()) {
            sb.append(", muted=");
            isStreamMute = audioManager.isStreamMute(i);
            sb.append(isStreamMute);
        }
    }

    public static String modeToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d95e98b3", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "MODE_NORMAL";
        }
        if (i == 1) {
            return "MODE_RINGTONE";
        }
        if (i == 2) {
            return "MODE_IN_CALL";
        }
        if (i != 3) {
            return "MODE_INVALID";
        }
        return "MODE_IN_COMMUNICATION";
    }

    public static boolean runningOnEmulator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b74983e", new Object[0])).booleanValue();
        }
        if (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic_")) {
            return false;
        }
        return true;
    }

    public static boolean runningOnJellyBeanMR1OrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58aeaa19", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean runningOnJellyBeanMR2OrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4731b09a", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean runningOnLollipopOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6b23e6", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean runningOnMarshmallowOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487aadce", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static boolean runningOnNougatOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f071c61", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean runningOnOreoMR1OrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ea241e", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean runningOnOreoOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d217a3a8", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    private static String streamTypeToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("531637aa", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i == 1) {
            return "STREAM_SYSTEM";
        }
        if (i == 2) {
            return "STREAM_RING";
        }
        if (i == 3) {
            return "STREAM_MUSIC";
        }
        if (i == 4) {
            return "STREAM_ALARM";
        }
        if (i != 5) {
            return "STREAM_INVALID";
        }
        return "STREAM_NOTIFICATION";
    }
}
