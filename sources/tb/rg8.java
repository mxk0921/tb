package tb;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577786);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e290997", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73a3845", new Object[0])).booleanValue();
        }
        BluetoothAdapter adapter = ((BluetoothManager) bda.a().getSystemService("bluetooth")).getAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            return false;
        }
        return true;
    }
}
