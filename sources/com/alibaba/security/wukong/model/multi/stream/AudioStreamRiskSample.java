package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Eb;
import com.alibaba.security.wukong.model.config.AudioSampleConfig;
import com.alibaba.security.wukong.model.meta.AudioSegment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AudioStreamRiskSample extends StreamRiskSample<AudioSegment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int oneDetectAudioTime = 10;
    public AudioSampleConfig audioSampleConfig = new AudioSampleConfig();
    public Eb audioStreamRiskSamplePre = new Eb();

    public AudioStreamRiskSample(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(AudioStreamRiskSample audioStreamRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/multi/stream/AudioStreamRiskSample");
    }

    public AudioSampleConfig getAudioSampleConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioSampleConfig) ipChange.ipc$dispatch("7792f311", new Object[]{this});
        }
        return this.audioSampleConfig;
    }

    public int getOneDetectAudioTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d98d78a", new Object[]{this})).intValue();
        }
        return this.oneDetectAudioTime;
    }

    public void setAudioSampleConfig(AudioSampleConfig audioSampleConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc07575", new Object[]{this, audioSampleConfig});
        } else {
            this.audioSampleConfig = audioSampleConfig;
        }
    }

    public void setOneDetectAudioTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb273c0", new Object[]{this, new Integer(i)});
        } else {
            this.oneDetectAudioTime = i;
        }
    }

    @Override // com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "audioStream";
    }

    public void detect(CcrcService ccrcService, AudioSegment audioSegment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23781bcb", new Object[]{this, ccrcService, audioSegment, new Boolean(z)});
            return;
        }
        this.audioStreamRiskSamplePre.a(z);
        this.audioStreamRiskSamplePre.a(ccrcService, this, audioSegment);
    }
}
