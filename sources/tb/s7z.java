package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.hhz;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class s7z implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = -699000012;
    public static final s7z INSTANCE = new s7z();

    static {
        t2o.a(598737357);
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
        if (hhzVarArr.length == 2) {
            hhz hhzVar = hhzVarArr[0];
            hhz hhzVar2 = hhzVarArr[1];
            if ((hhzVar instanceof hhz.j) && (hhzVar2 instanceof hhz.m)) {
                return hhz.Companion.f(((hhz.j) hhzVar).M().get(((hhz.m) hhzVar2).J()));
            }
            if ((hhzVar instanceof hhz.h) && (hhzVar2 instanceof hhz.g)) {
                return hhz.Companion.f(((hhz.h) hhzVar).M().get(((hhz.g) hhzVar2).J()));
            }
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.j("get func params type error arg0 " + ((Object) hhzVar.getClass().getName()) + " arg1 " + ((Object) hhzVar2.getClass().getName()));
            }
            return hhz.Companion.m();
        }
        throw new IllegalStateException("get func params size must be 2");
    }
}
