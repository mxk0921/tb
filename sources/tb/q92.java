package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.tao.homepage.revision.Revision;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q92 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_COMPLEX_TEXTURE = "isComplexTexture";

    static {
        t2o.a(729810160);
    }

    public static boolean a() {
        ThemeData e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d266be1", new Object[0])).booleanValue();
        }
        if (b() && (e = cpt.c().e("homepage")) != null) {
            return Boolean.parseBoolean(e.isComplexTexture);
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dfd360a", new Object[0])).booleanValue();
        }
        if (!cpt.a() || !Revision.b().g()) {
            return false;
        }
        return true;
    }
}
