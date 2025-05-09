package tb;

import com.alibaba.ability.middleware.ProfileExtractorMiddleware;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gr implements quc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.quc
    public List<pdb> get(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2a1e1eb6", new Object[]{this, str, str2});
        }
        ckf.g(str, "abilityName");
        ckf.g(str2, "namespace");
        if (ckf.b(str2, MspGlobalDefine.TINY_APP) && tsq.x("mtop", str, true)) {
            return yz3.l(new qhu(), new ProfileExtractorMiddleware());
        }
        if (ckf.b("windvane", str2)) {
            return yz3.l(new ProfileExtractorMiddleware(), new mpa());
        }
        return xz3.e(new ProfileExtractorMiddleware());
    }
}
