package com.alibaba.idst.nls.nlsclientsdk;

import com.alibaba.idst.nls.nlsclientsdk.util.OpusCodec;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class VoiceCodecs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WAVE_FRAM_SIZE = 320;
    private OpusCodec mOupsCodec;
    private static String TAG = "AliSpeechWSClient-VoiceCodecs";
    private static VoiceCodecs instance = null;

    static {
        t2o.a(199229443);
    }

    private VoiceCodecs() {
        this.mOupsCodec = null;
        this.mOupsCodec = new OpusCodec();
    }

    public static VoiceCodecs getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VoiceCodecs) ipChange.ipc$dispatch("454a8c3d", new Object[0]);
        }
        if (instance == null) {
            instance = new VoiceCodecs();
        }
        return instance;
    }

    public int bufferFrame(short[] sArr, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be57bc66", new Object[]{this, sArr, bArr})).intValue();
        }
        return this.mOupsCodec.encodec(sArr, 0, 320, bArr);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.mOupsCodec.close();
        }
    }

    public boolean open(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5955f727", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.mOupsCodec.open(z);
    }
}
