package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909565);
    }

    public static final boolean a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff1d1d2c", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        yjy yjyVar = (yjy) bbsVar.getExtension(yjy.class);
        if (yjyVar == null) {
            return false;
        }
        return yjyVar.a();
    }
}
