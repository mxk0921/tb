package com.alibaba.secutiry.mnn.pykit;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPythonJavaToPythonCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MNNAudioData implements AliNNPythonJavaToPythonCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MNNAudioData";

    /* renamed from: a  reason: collision with root package name */
    public byte[] f2926a;
    public int b;

    public static native long nativeConvertToPythonObj(byte[] bArr, int i);

    @Override // com.taobao.android.alinnpython.AliNNPythonJavaToPythonCallback
    public long javaToPython() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2470f74", new Object[]{this})).longValue();
        }
        return nativeConvertToPythonObj(this.f2926a, this.b);
    }
}
