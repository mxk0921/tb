package tb;

import com.alibaba.marvel.java.OnPrepareListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v6w implements OnPrepareListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public v6w(u6w u6wVar) {
    }

    public void onPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
        }
    }
}
