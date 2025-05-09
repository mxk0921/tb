package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.utils.IFlowOutHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sgt implements IFlowOutHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772124);
        t2o.a(662700078);
    }

    @Override // com.ut.share.utils.IFlowOutHelper
    public void startActivity(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861f90ed", new Object[]{this, context, intent});
        } else {
            jq9.p("share", context, intent);
        }
    }

    @Override // com.ut.share.utils.IFlowOutHelper
    public void startActivityForResult(Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad0b6b2", new Object[]{this, fragment, intent, new Integer(i)});
        } else {
            jq9.s("share", fragment, intent, i);
        }
    }

    @Override // com.ut.share.utils.IFlowOutHelper
    public void startActivityForResult(Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59168a98", new Object[]{this, activity, intent, new Integer(i)});
        } else {
            jq9.r("share", activity, intent, i);
        }
    }
}
