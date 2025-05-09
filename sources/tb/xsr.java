package tb;

import android.app.Activity;
import android.app.ActivityGroup;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xsr extends PopLayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626331);
    }

    public xsr() {
        super(new dcr(), new jar("android_poplayer"), new arr(), lig.g());
    }

    public static /* synthetic */ Object ipc$super(xsr xsrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1605354164) {
            super.onPageClean((Activity) objArr[0]);
            return null;
        } else if (hashCode == 1648504632) {
            super.onSwitchedNewPage((String) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/TBPopLayer");
        }
    }

    @Override // com.alibaba.poplayer.PopLayer
    public boolean isValidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b37f77e", new Object[]{this, activity})).booleanValue();
        }
        if (activity != null) {
            String name = activity.getClass().getName();
            for (String str : a9l.w().j()) {
                if (str.equals(name)) {
                    return false;
                }
            }
        }
        return !(activity instanceof ActivityGroup);
    }

    @Override // com.alibaba.poplayer.PopLayer
    public boolean isValidConfigBeforeMonitor(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb0152c", new Object[]{this, baseConfigItem})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.poplayer.PopLayer
    public Pair<Boolean, String> isValidConfigWithReason(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1bd0ced2", new Object[]{this, aVar});
        }
        return th4.a(aVar);
    }

    @Override // com.alibaba.poplayer.PopLayer
    public void onPageClean(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fafc2b4", new Object[]{this, activity});
            return;
        }
        super.onPageClean(activity);
        bbm.c().a(InternalTriggerController.getActivityKeyCode(activity));
    }

    @Override // com.alibaba.poplayer.PopLayer
    public void onSwitchedNewPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62422f38", new Object[]{this, str, str2});
            return;
        }
        super.onSwitchedNewPage(str, str2);
        if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
            MtopGroupPreCheckManager.i().e(str);
        }
    }
}
