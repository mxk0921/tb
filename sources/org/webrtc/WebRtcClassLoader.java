package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313852);
    }

    public static Object getClassLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4366ca36", new Object[0]);
        }
        return WebRtcClassLoader.class.getClassLoader();
    }
}
