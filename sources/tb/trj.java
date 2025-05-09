package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class trj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NetDaemon";

    /* renamed from: a  reason: collision with root package name */
    public static volatile trj f28912a;

    public static trj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (trj) ipChange.ipc$dispatch("b9e26663", new Object[0]);
        }
        if (f28912a == null) {
            synchronized (trj.class) {
                f28912a = new trj();
            }
        }
        return f28912a;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25599981", new Object[]{this, str})).booleanValue();
        }
        new StringBuilder("[allowExecute] who: ").append(str);
        return true;
    }
}
