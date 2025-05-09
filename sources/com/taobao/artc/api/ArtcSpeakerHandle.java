package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ArtcSpeakerHandle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313189);
    }

    public void onActiveSpeakers(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5fb7df", new Object[]{this, strArr});
        }
    }
}
