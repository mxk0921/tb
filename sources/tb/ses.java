package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.WebStartParams;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ses {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ses INSTANCE = new ses();

    static {
        t2o.a(850395176);
    }

    @JvmStatic
    public static final WebStartParams a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebStartParams) ipChange.ipc$dispatch("17f5eff7", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "instance");
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null || !(startParams instanceof WebStartParams)) {
            startParams = null;
        }
        return (WebStartParams) startParams;
    }
}
