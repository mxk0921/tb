package com.ut.share.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FlowOutFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFlowOutHelper coreInstance = new IFlowOutHelper() { // from class: com.ut.share.utils.FlowOutFacade.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ut.share.utils.IFlowOutHelper
        public void startActivity(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("861f90ed", new Object[]{this, context, intent});
            } else {
                context.startActivity(intent);
            }
        }

        @Override // com.ut.share.utils.IFlowOutHelper
        public void startActivityForResult(Fragment fragment, Intent intent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad0b6b2", new Object[]{this, fragment, intent, new Integer(i)});
            } else {
                fragment.startActivityForResult(intent, i);
            }
        }

        @Override // com.ut.share.utils.IFlowOutHelper
        public void startActivityForResult(Activity activity, Intent intent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59168a98", new Object[]{this, activity, intent, new Integer(i)});
            } else {
                activity.startActivityForResult(intent, i);
            }
        }
    };

    static {
        t2o.a(662700076);
    }

    public static IFlowOutHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFlowOutHelper) ipChange.ipc$dispatch("969149ee", new Object[0]);
        }
        return coreInstance;
    }

    public static void injectIFlowOutHelper(IFlowOutHelper iFlowOutHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7689af", new Object[]{iFlowOutHelper});
        } else {
            coreInstance = iFlowOutHelper;
        }
    }
}
