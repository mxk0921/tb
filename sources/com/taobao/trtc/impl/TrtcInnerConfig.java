package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcInnerConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TRTC_ENGINE_CONFIG_EXTERNAL_CAPTURER_BIT = 1;
    public static final int TRTC_ENGINE_CONFIG_EXTERNAL_RENDERER_BIT = 2;
    public static final int TRTC_ENGINE_CONFIG_LOAD_TAOAUDIO = 8;
    public static final int TRTC_ENGINE_CONFIG_USE_MUSIC_MODE = 4;
    public TrtcConfig config;
    public String networkType = "4G";
    public String model = "";
    public String carriers = "";
    public String platform = "android";
    public String os = "android";
    public String osVersion = "";
    public String chipset = "";
    public String board = "";
    public String orangeConfigs = "";
    public boolean isEnvOnline = true;
    public boolean hwH264DecodeEnable = false;
    public String hwH264DecoderName = "";
    public String hwH264DecodeLowLatencyConfigStr = "";
    public boolean hwH265DecodeEnable = false;
    public String hwH265DecoderName = "";
    public String hwH265DecodeLowLatencyConfigStr = "";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface EngineConfigFlagBits {
    }

    static {
        t2o.a(395313540);
    }

    public String ToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a47ed", new Object[]{this});
        }
        return "inner config:{ " + this.config.ToString() + "network type: " + this.networkType + ", model: " + this.model + ", carriers: " + this.carriers + ", os: " + this.os + ", chipset: " + this.chipset + ", board: " + this.board + " }";
    }

    public int getEngineConfigFlags() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da08207", new Object[]{this})).intValue();
        }
        boolean isUseExternalVideoCapture = this.config.isUseExternalVideoCapture();
        if (this.config.isUseExternalVideoRender()) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = isUseExternalVideoCapture | i;
        if (this.config.isUseMusicMode()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i5 = i4 | i2;
        if (this.config.isUseTaoAudio()) {
            i3 = 8;
        }
        return i3 | i5;
    }

    public int getWorkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23d65144", new Object[]{this})).intValue();
        }
        return this.config.getWorkMode().ordinal();
    }
}
