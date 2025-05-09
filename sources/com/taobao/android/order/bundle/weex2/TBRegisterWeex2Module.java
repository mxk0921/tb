package com.taobao.android.order.bundle.weex2;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import tb.f3x;
import tb.kpw;
import tb.t2o;
import tb.tx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBRegisterWeex2Module extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031967);
    }

    public static /* synthetic */ Object ipc$super(TBRegisterWeex2Module tBRegisterWeex2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/weex2/TBRegisterWeex2Module");
    }

    private void registerWeexPlatformViews(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482ec965", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Class<?> a2 = f3x.a(str);
        if (a2 != null) {
            MUSEngine.registerPlatformView(str, a2);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        }
    }

    private void registerWeex2Module(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95887be", new Object[]{this, wVCallBackContext});
        } else if (!f3x.f18987a) {
            MUSEngine.registerModule("order_module", TBOrderWeex2Module.class);
            f3x.f18987a = true;
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("register".equals(str)) {
            registerWeex2Module(wVCallBackContext);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (!"registerView".equals(str)) {
            return false;
        } else {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    registerWeexPlatformViews(JSON.parseObject(str2).getString(tx9.KEY_TAG_NAME), wVCallBackContext);
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }
}
