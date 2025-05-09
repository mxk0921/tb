package com.taobao.informationflowdataservice.dataservice.utils.environment;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import tb.hhg;
import tb.rj7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AppAdapter implements IAppAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587998);
        t2o.a(487587955);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return Globals.getVersionName();
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return rj7.a();
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        return SystemBarDecorator.getStatusBarHeight(rj7.a());
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
        }
        String str = (String) hhg.a("ttid", null);
        return TextUtils.isEmpty(str) ? TaoHelper.getTTID() : str;
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public String getUTDID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[]{this});
        }
        String str = (String) hhg.a("deviceId", null);
        if (TextUtils.isEmpty(str)) {
            return UTDevice.getUtdid(getApplication().getApplicationContext());
        }
        return str;
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        return rj7.b();
    }
}
