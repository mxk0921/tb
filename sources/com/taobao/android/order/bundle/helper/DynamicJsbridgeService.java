package com.taobao.android.order.bundle.helper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.weex2.TBRegisterWeex2Module;
import tb.ihc;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DynamicJsbridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031795);
        t2o.a(989856204);
    }

    public static /* synthetic */ Object ipc$super(DynamicJsbridgeService dynamicJsbridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/DynamicJsbridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (CoreConstants.ORDER_WV_KEY.equals(str)) {
            return TBRefreshOrder.class;
        }
        if (CoreConstants.ORDER_WV_KEY_WEEX2_MODULE.equals(str)) {
            return TBRegisterWeex2Module.class;
        }
        if (CoreConstants.ORDER_WV_TB_ODER.equals(str)) {
            return WvOrderPlugin.class;
        }
        if (CoreConstants.ORDER_LIST_FILTER.equals(str)) {
            return OrderRequestJSPlugin.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
