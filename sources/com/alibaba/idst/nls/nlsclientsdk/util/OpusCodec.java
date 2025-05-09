package com.alibaba.idst.nls.nlsclientsdk.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.nlspeech.nlscodec.NlsCodec2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OpusCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NlsCodec2 codec = NlsCodec2.a();
    private long enc = 0;
    private long dec = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class Define {
        public static final int SPEEX_FRAM_SIZE = 70;
        public static final int WAVE_FRAM_SIZE = 320;

        static {
            t2o.a(199229487);
        }

        public Define() {
        }
    }

    static {
        t2o.a(199229486);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        long j = this.enc;
        if (j != 0) {
            this.codec.destroyEncoder(j);
            this.enc = 0L;
        }
    }

    public int encodec(short[] sArr, int i, int i2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbc101c6", new Object[]{this, sArr, new Integer(i), new Integer(i2), bArr})).intValue();
        }
        if (!isOpen() || bArr == null) {
            return 0;
        }
        byte[] bArr2 = new byte[bArr.length];
        int encode = this.codec.encode(this.enc, sArr, 0, bArr2);
        bArr[0] = (byte) encode;
        if (encode > 0) {
            try {
                System.arraycopy(bArr2, 0, bArr, 1, encode);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return encode + 1;
    }

    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        if (this.enc != 0) {
            return true;
        }
        return false;
    }

    public boolean open(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5955f727", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        long createEncoder = this.codec.createEncoder();
        this.enc = createEncoder;
        if (createEncoder != 0) {
            return true;
        }
        return false;
    }
}
