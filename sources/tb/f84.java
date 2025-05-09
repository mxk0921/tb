package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Thread a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("54a87913", new Object[0]);
        }
        return VExecutors.currentThread();
    }
}
