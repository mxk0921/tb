package tb;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(488636510);
    }

    public static boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c97c8b18", new Object[]{iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e647969", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "coldStart");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d3215f5", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, Constant.KEY_PAGEBACK);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e966ae1", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "pullRefresh");
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbf3c7ae", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "scrollNextPage");
    }
}
