package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002188);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e186b8c", new Object[]{str});
        }
        return "";
    }

    public static boolean b(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7dfc984", new Object[]{ykoVar})).booleanValue();
        }
        if (!ykoVar.g().isDebug()) {
            return false;
        }
        return ykoVar.e().a();
    }
}
