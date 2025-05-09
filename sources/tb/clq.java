package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class clq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static lgd a(cgd cgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgd) ipChange.ipc$dispatch("5932a47b", new Object[]{cgdVar});
        }
        if (cgdVar.a("key_new_status_manager_enabled", true)) {
            return new nbn();
        }
        return new mbn();
    }
}
