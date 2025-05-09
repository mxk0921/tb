package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vrz implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = -406646278;
    public static final vrz INSTANCE = new vrz();

    static {
        t2o.a(598737360);
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
        if (hhzVarArr.length != 1) {
            z = false;
        }
        if (z) {
            return hhz.Companion.j(hhzVarArr[0].e());
        }
        throw new IllegalStateException("ToBoolean params size must be 1");
    }
}
