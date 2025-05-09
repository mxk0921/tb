package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jq7 extends tx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782292);
    }

    public jq7(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(jq7 jq7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/cachereqbizparamsservice/impl/mode/DiskNotErasedModeHandler");
    }

    @Override // tb.tx
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16a7de0c", new Object[]{this});
        }
        return "infoFlowBizParams_";
    }
}
