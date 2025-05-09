package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9684ba8c", new Object[0])).booleanValue();
        }
        return Mtop.XIAOMI_WIDGET_PROCESS_NAME.equals(sd7.d().e());
    }
}
