package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m2z implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = -609017932;
    public static final m2z INSTANCE = new m2z();

    static {
        t2o.a(598737355);
        t2o.a(598737323);
    }

    @Override // tb.xgz
    public hhz a(bhz bhzVar, hhz[] hhzVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("6f741aa4", new Object[]{this, bhzVar, hhzVarArr});
        }
        ckf.g(bhzVar, Constants.Name.SCOPE);
        ckf.g(hhzVarArr, "params");
        StringBuilder sb = new StringBuilder();
        for (hhz hhzVar : hhzVarArr) {
            sb.append(hhzVar.h());
        }
        hhz.c cVar = hhz.Companion;
        String sb2 = sb.toString();
        ckf.f(sb2, "sb.toString()");
        return cVar.g(sb2);
    }
}
