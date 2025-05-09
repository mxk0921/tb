package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView;
import com.taobao.android.detail.sdk.model.node.ContractNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ds0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(703594497);
    }

    public static void a(Activity activity, gr4 gr4Var, ContractNode contractNode, String str, String str2, ContractSelectedRet contractSelectedRet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce661d92", new Object[]{activity, gr4Var, contractNode, str, str2, contractSelectedRet});
            return;
        }
        PhoneNumSalePlanView phoneNumSalePlanView = new PhoneNumSalePlanView(true, activity, gr4Var, contractNode, str, str2, contractSelectedRet);
        phoneNumSalePlanView.setCanceledOnTouchOutside(false);
        phoneNumSalePlanView.show();
    }

    public static void b(Activity activity, gr4 gr4Var, ContractNode contractNode, String str, String str2, ContractSelectedRet contractSelectedRet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37113e2", new Object[]{activity, gr4Var, contractNode, str, str2, contractSelectedRet});
            return;
        }
        PhoneNumSalePlanView phoneNumSalePlanView = new PhoneNumSalePlanView(false, activity, gr4Var, contractNode, str, str2, contractSelectedRet);
        phoneNumSalePlanView.setCanceledOnTouchOutside(false);
        phoneNumSalePlanView.show();
    }
}
