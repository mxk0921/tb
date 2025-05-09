package com.taobao.android.shop.weex;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalModuleGetter;
import tb.opp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopWeexRegisterService extends Service implements IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412035);
        t2o.a(985661650);
    }

    public static /* synthetic */ Object ipc$super(ShopWeexRegisterService shopWeexRegisterService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/weex/ShopWeexRegisterService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // com.taobao.weex.ui.IExternalModuleGetter
    public Class<? extends WXModule> getExternalModuleClass(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f9116d39", new Object[]{this, str, context});
        }
        opp.e("main-cost", "ShopWeexRegisterService " + str);
        if ("com.taobao.android.shop.weex.ShopReportModule".equals(str) || "shopReport".equals(str)) {
            return ShopReportModule.class;
        }
        if ("com.taobao.android.shop.weex.ShopDataModule".equals(str) || "shopData".equals(str)) {
            return ShopDataModule.class;
        }
        return null;
    }
}
