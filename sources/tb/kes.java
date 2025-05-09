package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.z2w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kes {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kes INSTANCE = new kes();

    static {
        t2o.a(849346604);
    }

    @JvmStatic
    public static final int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{str, str2})).intValue();
        }
        ckf.g(str, "version1");
        ckf.g(str2, "version2");
        z2w.a aVar = z2w.Companion;
        return aVar.a(str).compareTo(aVar.a(str2));
    }
}
