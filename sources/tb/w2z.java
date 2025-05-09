package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class w2z implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = -1381471221;
    public static final w2z INSTANCE = new w2z();

    static {
        t2o.a(598737356);
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
        if (hhzVarArr.length < 2) {
            return hhz.Companion.j(false);
        }
        hhz hhzVar = hhzVarArr[0];
        hhz hhzVar2 = hhzVarArr[1];
        if ((hhzVar instanceof hhz.m) && (hhzVar2 instanceof hhz.m)) {
            return hhz.Companion.j(wsq.O(((hhz.m) hhzVar).J(), ((hhz.m) hhzVar2).J(), false, 2, null));
        }
        if ((hhzVar instanceof hhz.j) && (hhzVar2 instanceof hhz.m)) {
            return hhz.Companion.j(((hhz.j) hhzVar).M().containsKey(((hhz.m) hhzVar2).J()));
        }
        if (hhzVar instanceof hhz.h) {
            return hhz.Companion.j(((hhz.h) hhzVar).M().contains(ehz.INSTANCE.b(hhzVar2)));
        }
        return hhz.Companion.m();
    }
}
