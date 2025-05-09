package com.nlspeech.nlscodec;

import com.alibaba.idst.nls.internal.common.Config;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NlsCodec2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static NlsCodec2 f5976a;

    public NlsCodec2() {
        f5976a = this;
    }

    public static NlsCodec2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsCodec2) ipChange.ipc$dispatch("6cb2af3f", new Object[0]);
        }
        if (f5976a == null) {
            f5976a = new NlsCodec2();
        }
        return f5976a;
    }

    public native long createDecoder();

    public native long createEncoder();

    public native int decode(long j, byte[] bArr, int i, short[] sArr);

    public native void destroyDecoder(long j);

    public native void destroyEncoder(long j);

    public native int encode(long j, short[] sArr, int i, byte[] bArr);

    static {
        t2o.a(199229495);
        if (Config.AUTO_LOAD_LIBS) {
            try {
                System.loadLibrary("ztcodec2");
            } catch (Throwable unused) {
            }
        }
        f5976a = null;
    }
}
