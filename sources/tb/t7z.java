package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t7z implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = -1977742053;
    public static final t7z INSTANCE = new t7z();

    static {
        t2o.a(598737358);
        t2o.a(598737323);
    }

    @Override // tb.xgz
    public hhz a(bhz bhzVar, hhz[] hhzVarArr) {
        Object obj;
        hhz f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("6f741aa4", new Object[]{this, bhzVar, hhzVarArr});
        }
        ckf.g(bhzVar, Constants.Name.SCOPE);
        ckf.g(hhzVarArr, "params");
        if (hhzVarArr.length == 3) {
            hhz hhzVar = hhzVarArr[0];
            hhz hhzVar2 = hhzVarArr[1];
            hhz hhzVar3 = hhzVarArr[2];
            return (!(hhzVar instanceof hhz.j) || !(hhzVar2 instanceof hhz.m) || (obj = ((hhz.j) hhzVar).M().get(((hhz.m) hhzVar2).J())) == null || (f = hhz.Companion.f(obj)) == null) ? hhzVar3 : f;
        }
        throw new IllegalStateException("GetOrDefault params size must be 3");
    }
}
