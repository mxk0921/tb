package com.alibaba.android.bindingx.plugin.weex;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalModuleGetter;
import tb.k21;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WXBindingXModuleService extends Service implements IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WXBindingXModuleService wXBindingXModuleService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/plugin/weex/WXBindingXModuleService");
    }

    @Override // com.taobao.weex.ui.IExternalModuleGetter
    public Class<? extends WXModule> getExternalModuleClass(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f9116d39", new Object[]{this, str, context});
        }
        if (k21.APM_POINT.equals(str) || "binding".equals(str)) {
            return WXBindingXModule.class;
        }
        if ("expressionBinding".equals(str)) {
            return WXExpressionBindingModule.class;
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
