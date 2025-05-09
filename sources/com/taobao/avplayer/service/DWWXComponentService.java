package com.taobao.avplayer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.component.weex.WXInteractiveComponent;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.IExternalModuleGetter;
import com.taobao.weex.ui.component.WXComponent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWWXComponentService extends Service implements IExternalComponentGetter, IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936410);
        t2o.a(985661649);
        t2o.a(985661650);
    }

    public static /* synthetic */ Object ipc$super(DWWXComponentService dWWXComponentService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/service/DWWXComponentService");
    }

    @Override // com.taobao.weex.ui.IExternalComponentGetter
    public Class<? extends WXComponent> getExternalComponentClass(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("464bab4e", new Object[]{this, str, wXSDKInstance});
        }
        if ("videoplus".equals(str)) {
            return WXInteractiveComponent.class;
        }
        return null;
    }

    @Override // com.taobao.weex.ui.IExternalModuleGetter
    public Class<? extends WXModule> getExternalModuleClass(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f9116d39", new Object[]{this, str, context});
        }
        if ("SplayerModule".equals(str)) {
            return WXSplayerModule.class;
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
