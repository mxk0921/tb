package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile File f30831a;

    static {
        t2o.a(374341662);
    }

    public static File a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ba2e9899", new Object[]{context});
        }
        if (f30831a != null) {
            return f30831a;
        }
        f30831a = new File(context.getFilesDir(), "AVFSCache");
        return f30831a;
    }
}
