package com.taobao.android.fluid.framework.activityresult;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ActivityResultDelegateFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FluidContext f7754a;

    static {
        t2o.a(468713794);
    }

    public static /* synthetic */ Object ipc$super(ActivityResultDelegateFragment activityResultDelegateFragment, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/activityresult/ActivityResultDelegateFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        FluidContext fluidContext = this.f7754a;
        if (fluidContext == null) {
            ir9.b("ActivityResultDelegateFragment", "FluidSDK 视频流上下文为空");
            return;
        }
        IActivityResultService iActivityResultService = (IActivityResultService) fluidContext.getService(IActivityResultService.class);
        if (iActivityResultService == null) {
            ir9.b("ActivityResultDelegateFragment", "FluidSDK 视频流 IActivityResultService 服务为空");
        } else {
            iActivityResultService.onActivityResult(i, i2, intent);
        }
    }

    public void p2(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766c48b9", new Object[]{this, fluidContext});
        } else {
            this.f7754a = fluidContext;
        }
    }
}
