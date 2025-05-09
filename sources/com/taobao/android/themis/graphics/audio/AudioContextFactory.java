package com.taobao.android.themis.graphics.audio;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import tb.lcn;
import tb.rhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AudioContextFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a sProvider;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        rhb a(String str);
    }

    public AudioContextFactory(a aVar) {
        this.sProvider = aVar;
    }

    public rhb create(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhb) ipChange.ipc$dispatch("eebf485d", new Object[]{this, str});
        }
        a aVar = this.sProvider;
        if (aVar != null) {
            return aVar.a(str);
        }
        RVLLevel rVLLevel = RVLLevel.Error;
        lcn.f(rVLLevel, RPCDataItems.SWITCH_TAG_LOG, "AudioContextFactory create audioContext with id:" + str + "failed because sProvider is null");
        return null;
    }

    public AudioContextProxy createAudioContextProxy(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioContextProxy) ipChange.ipc$dispatch("db359189", new Object[]{this, new Long(j), str});
        }
        a aVar = this.sProvider;
        if (aVar != null) {
            return new AudioContextProxy(aVar.a(str), j);
        }
        RVLLevel rVLLevel = RVLLevel.Error;
        lcn.f(rVLLevel, RPCDataItems.SWITCH_TAG_LOG, "AudioContextFactory create AudioContextProxy with id:" + str + "failed because sProvider is null");
        return null;
    }
}
