package com.taobao.tbliveweexvideo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tblive.weex.TBLiveWeexComponent;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.component.WXComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveWeexService extends Service implements IExternalComponentGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBLiveWeexService tBLiveWeexService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveweexvideo/TBLiveWeexService");
    }

    @Override // com.taobao.weex.ui.IExternalComponentGetter
    public Class<? extends WXComponent> getExternalComponentClass(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("464bab4e", new Object[]{this, str, wXSDKInstance});
        }
        if ("video".equals(str)) {
            return TBLiveWeexVideoComponent.class;
        }
        if ("tbliveMiniRoom".equals(str)) {
            return TBLiveWeexComponent.class;
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
