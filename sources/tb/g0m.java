package tb;

import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055379);
    }

    public static final h11 a(bbs bbsVar) {
        PermissionModel permissionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h11) ipChange.ipc$dispatch("a4b5d688", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        h11 h11Var = (h11) bbsVar.g(h11.class);
        if (h11Var != null) {
            return h11Var;
        }
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null) {
            permissionModel = null;
        } else {
            permissionModel = U.w();
        }
        if (permissionModel == null) {
            return null;
        }
        h11 a2 = e0m.INSTANCE.a(permissionModel);
        bbsVar.k(h11.class, a2);
        return a2;
    }
}
