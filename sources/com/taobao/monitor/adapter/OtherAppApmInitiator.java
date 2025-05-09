package com.taobao.monitor.adapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import tb.uj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OtherAppApmInitiator extends AbsAPMInitiator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(OtherAppApmInitiator otherAppApmInitiator, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.init((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/OtherAppApmInitiator");
    }

    @Override // com.taobao.monitor.adapter.AbsAPMInitiator
    public /* bridge */ /* synthetic */ void init(Application application, HashMap hashMap) {
        super.init(application, hashMap);
    }

    @Override // com.taobao.monitor.adapter.AbsAPMInitiator
    public void initPage(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41f20d9", new Object[]{this, application});
        }
    }

    public void yourFuncation(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ba7d3a", new Object[]{this, application});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", "xxxxx");
        hashMap.put(OConstant.LAUNCH_ONLINEAPPKEY, "xxxxx");
        hashMap.put("appVersion", "x.x.x");
        hashMap.put(uj4.KEY_APP_BUILD, "x.x.x");
        hashMap.put("process", "com.xxx.xxx");
        hashMap.put("ttid", "xxxxx");
        hashMap.put("channel", "xxxxx");
        hashMap.put("appPatch", "xxxxx");
        new OtherAppApmInitiator().init(application, hashMap);
    }
}
