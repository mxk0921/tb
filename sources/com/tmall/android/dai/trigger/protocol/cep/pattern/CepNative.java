package com.tmall.android.dai.trigger.protocol.cep.pattern;

import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.hh3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CepNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String failedReason;
    public String identifier;
    private a matchSuccessCallback;
    private final long nativeHandle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(1034944736);
    }

    public CepNative(String str, String str2) {
        this.identifier = str;
        Pair<Long, String> nativeCreate = nativeCreate(str, str2, this);
        Object obj = nativeCreate.first;
        if (obj == null || ((Long) obj).longValue() == 0) {
            this.failedReason = (String) nativeCreate.second;
            this.nativeHandle = 0L;
            return;
        }
        this.failedReason = null;
        this.nativeHandle = ((Long) nativeCreate.first).longValue();
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        long j = this.nativeHandle;
        if (j != 0) {
            nativeFinalize(j);
        }
        try {
            super.finalize();
        } catch (Exception e) {
            Log.e("CepNative", "finalize failed", e);
        }
    }

    public boolean isFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a308af12", new Object[]{this})).booleanValue();
        }
        if (this.failedReason != null) {
            return true;
        }
        return false;
    }

    public native Pair<Long, String> nativeCreate(String str, String str2, CepNative cepNative);

    public native void nativeFinalize(long j);

    public native int nativeOnUserEvent(long j, Map<String, String> map);

    public void onMatched(List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d265d93d", new Object[]{this, list});
            return;
        }
        a aVar = this.matchSuccessCallback;
        if (aVar != null) {
            ((hh3.a) aVar).a(list);
        }
    }

    public int onUserEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f4de7a1", new Object[]{this, map})).intValue();
        }
        long j = this.nativeHandle;
        if (j != 0) {
            return nativeOnUserEvent(j, map);
        }
        return -1;
    }

    public void setMatchSuccessCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a8c0eb", new Object[]{this, aVar});
        } else {
            this.matchSuccessCallback = aVar;
        }
    }
}
