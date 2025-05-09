package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kqh implements jqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jqh
    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38db21ee", new Object[]{this, map});
        } else if (map != null && map.containsKey("name")) {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(Thread.currentThread().getName(), map.get("name") + "");
        }
    }

    @Override // tb.jqh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cdb142", new Object[]{this});
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(Thread.currentThread().getName(), "ok");
        }
    }
}
