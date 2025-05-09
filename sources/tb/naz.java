package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class naz implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = 1587582933;
    public static final naz INSTANCE = new naz();

    static {
        t2o.a(598737359);
        t2o.a(598737323);
    }

    @Override // tb.xgz
    public hhz a(bhz bhzVar, hhz[] hhzVarArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("6f741aa4", new Object[]{this, bhzVar, hhzVarArr});
        }
        ckf.g(bhzVar, Constants.Name.SCOPE);
        ckf.g(hhzVarArr, "params");
        if (hhzVarArr.length == 1) {
            hhz hhzVar = hhzVarArr[0];
            if (hhzVar instanceof hhz.j) {
                return new hhz.b(((hhz.j) hhzVar).M().isEmpty());
            }
            if (hhzVar instanceof hhz.h) {
                return new hhz.b(((hhz.h) hhzVar).M().isEmpty());
            }
            if (hhzVar instanceof hhz.m) {
                if (((hhz.m) hhzVar).J().length() != 0) {
                    z = false;
                }
                return new hhz.b(z);
            }
            throw new IllegalArgumentException(ckf.p("IsEmpty params type error arg0 ", hhzVar.getClass().getName()));
        }
        throw new IllegalStateException("IsEmpty params size must be 1");
    }
}
