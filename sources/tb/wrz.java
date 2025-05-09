package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wrz implements xgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_ID = 1324334576;
    public static final wrz INSTANCE = new wrz();

    static {
        t2o.a(598737361);
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
            return hhz.Companion.g(hhzVarArr[0].h());
        }
        throw new IllegalStateException("ToString params size must be 1");
    }
}
