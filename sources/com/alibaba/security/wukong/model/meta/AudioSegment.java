package com.alibaba.security.wukong.model.meta;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AudioSegment extends BaseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public int length;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum AudioEncodingConfig {
        ENCODING_PCM_16BIT(16, "16bit"),
        ENCODING_PCM_8BIT(8, "8bit");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public int value;

        AudioEncodingConfig(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AudioEncodingConfig getByName(String str) {
            AudioEncodingConfig[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioEncodingConfig) ipChange.ipc$dispatch("74964178", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return ENCODING_PCM_16BIT;
            }
            for (AudioEncodingConfig audioEncodingConfig : values()) {
                if (str.equals(audioEncodingConfig.name)) {
                    return audioEncodingConfig;
                }
            }
            return ENCODING_PCM_16BIT;
        }

        public static AudioEncodingConfig getByValue(int i) {
            AudioEncodingConfig[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioEncodingConfig) ipChange.ipc$dispatch("867de627", new Object[]{new Integer(i)});
            }
            for (AudioEncodingConfig audioEncodingConfig : values()) {
                if (i == audioEncodingConfig.value) {
                    return audioEncodingConfig;
                }
            }
            return ENCODING_PCM_16BIT;
        }

        public static /* synthetic */ Object ipc$super(AudioEncodingConfig audioEncodingConfig, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/meta/AudioSegment$AudioEncodingConfig");
        }

        public static AudioEncodingConfig valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioEncodingConfig) ipChange.ipc$dispatch("b50a5628", new Object[]{str});
            }
            return (AudioEncodingConfig) Enum.valueOf(AudioEncodingConfig.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum AudioFormat {
        mp3(1, "mp3"),
        pcm(2, "pcm"),
        wav(3, "wav"),
        aac(4, "aac");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public int value;

        AudioFormat(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AudioFormat getByName(String str) {
            AudioFormat[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioFormat) ipChange.ipc$dispatch("7d9d3e36", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return pcm;
            }
            for (AudioFormat audioFormat : values()) {
                if (str.equals(audioFormat.name)) {
                    return audioFormat;
                }
            }
            return pcm;
        }

        public static /* synthetic */ Object ipc$super(AudioFormat audioFormat, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/meta/AudioSegment$AudioFormat");
        }

        public static AudioFormat valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioFormat) ipChange.ipc$dispatch("50902e6", new Object[]{str});
            }
            return (AudioFormat) Enum.valueOf(AudioFormat.class, str);
        }
    }

    public AudioSegment(byte[] bArr, int i) {
        super(System.currentTimeMillis());
        this.data = bArr;
        this.length = i;
    }

    public static /* synthetic */ Object ipc$super(AudioSegment audioSegment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/meta/AudioSegment");
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this});
        }
        return this.data;
    }

    public int getLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33609456", new Object[]{this})).intValue();
        }
        return this.length;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getRawMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49177706", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.length;
    }

    public void setData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.data = bArr;
        }
    }

    public void setLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf17de74", new Object[]{this, new Integer(i)});
        } else {
            this.length = i;
        }
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "audio";
    }

    public AudioSegment(byte[] bArr, int i, long j) {
        super(j);
        this.data = bArr;
        this.length = i;
    }
}
