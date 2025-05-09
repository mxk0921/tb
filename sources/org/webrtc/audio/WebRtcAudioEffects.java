package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import org.webrtc.Logging;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcAudioEffects {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private AcousticEchoCanceler aec = null;
    private NoiseSuppressor ns = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static AudioEffect.Descriptor[] cachedEffects = null;

    static {
        t2o.a(395313871);
    }

    public WebRtcAudioEffects() {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7553d914", new Object[]{this, uuid})).booleanValue();
        }
        if (!WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher()) {
            return false;
        }
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        if (!AudioEffect.EFFECT_TYPE_NS.equals(uuid) || !isNoiseSuppressorSupported()) {
            return false;
        }
        return true;
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioEffect.Descriptor[]) ipChange.ipc$dispatch("6a14310c", new Object[0]);
        }
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a309f820", new Object[0])).booleanValue();
        }
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b14547", new Object[]{uuid, uuid2})).booleanValue();
        }
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55264791", new Object[0])).booleanValue();
        }
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        String str3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80053b9", new Object[]{this, new Integer(i)});
            return;
        }
        Logging.d(TAG, "enable(audioSession=" + i + f7l.BRACKET_END_STR);
        if (this.aec == null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.ns == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        String str4 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (!this.shouldEnableAec || !isAcousticEchoCancelerSupported()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.aec.setEnabled(z3) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb = new StringBuilder("AcousticEchoCanceler: was ");
                if (enabled) {
                    str2 = "enabled";
                } else {
                    str2 = str4;
                }
                sb.append(str2);
                sb.append(", enable: ");
                sb.append(z3);
                sb.append(", is now: ");
                if (this.aec.getEnabled()) {
                    str3 = "enabled";
                } else {
                    str3 = str4;
                }
                sb.append(str3);
                Logging.d(TAG, sb.toString());
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (!this.shouldEnableNs || !isNoiseSuppressorSupported()) {
                    z4 = false;
                }
                if (this.ns.setEnabled(z4) != 0) {
                    Logging.e(TAG, "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb2 = new StringBuilder("NoiseSuppressor: was ");
                if (enabled2) {
                    str = "enabled";
                } else {
                    str = str4;
                }
                sb2.append(str);
                sb2.append(", enable: ");
                sb2.append(z4);
                sb2.append(", is now: ");
                if (this.ns.getEnabled()) {
                    str4 = "enabled";
                }
                sb2.append(str4);
                Logging.d(TAG, sb2.toString());
                return;
            }
            Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89e30854", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "setAEC(" + z + f7l.BRACKET_END_STR);
        if (!isAcousticEchoCancelerSupported()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            Logging.e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc69f9ea", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "setNS(" + z + f7l.BRACKET_END_STR);
        if (!isNoiseSuppressorSupported()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            Logging.e(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
    }
}
