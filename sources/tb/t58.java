package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t58 extends nvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public t58(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(t58 t58Var, String str, Object... objArr) {
        if (str.hashCode() == 287307264) {
            return super.getUpdatePageName();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dynamictab/config/DynamicUtInvokerImpl");
    }

    @Override // tb.nvv, tb.e8e
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        String updatePageName = super.getUpdatePageName();
        if (TextUtils.isEmpty(updatePageName)) {
            return "Page_TMGDynamic";
        }
        return updatePageName;
    }
}
