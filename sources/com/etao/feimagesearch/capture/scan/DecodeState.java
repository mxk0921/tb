package com.etao.feimagesearch.capture.scan;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum DecodeState {
    IDLE(0),
    PREVIEW_DECODE(1),
    ALBUM_DECODE(2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int stateValue;

    DecodeState(int i) {
        this.stateValue = i;
    }

    public static /* synthetic */ Object ipc$super(DecodeState decodeState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/DecodeState");
    }

    public static DecodeState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeState) ipChange.ipc$dispatch("6fac3421", new Object[]{str});
        }
        return (DecodeState) Enum.valueOf(DecodeState.class, str);
    }

    public int getStateValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("853eb0d0", new Object[]{this})).intValue();
        }
        return this.stateValue;
    }
}
