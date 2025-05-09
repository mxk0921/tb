package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f1g<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public f1g(String str, String str2, String str3, tpb<T> tpbVar) {
        b();
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e4c19b", new Object[]{this, str});
        } else {
            OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, "UMUniformErrorReport", str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea188dd", new Object[]{this});
        } else {
            a("taobao.buy,buy");
        }
    }
}
