package com.taobao.android.tracker.wvplugin;

import android.os.Bundle;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.wvplugin.data.DTData;
import tb.fgh;
import tb.kpw;
import tb.p58;
import tb.t2o;
import tb.x22;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DynamicTrackerPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(455082047);
    }

    public static /* synthetic */ Object ipc$super(DynamicTrackerPlugin dynamicTrackerPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/wvplugin/DynamicTrackerPlugin");
    }

    public static void updateConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{str});
            return;
        }
        DTData dTData = (DTData) x22.g(str, DTData.class);
        if (dTData != null) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putString(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID, dTData.getPageId());
            bundle.putString("page_config", dTData.getConf());
            obtain.setData(bundle);
            p58.m().h("weex_update_page_config", obtain);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        fgh.a("updateConfig  start");
        if (!TextUtils.isEmpty(str) && "updateConfig".equalsIgnoreCase(str)) {
            updateConfig(str2);
        }
        fgh.a("updateConfig  end");
        return false;
    }
}
