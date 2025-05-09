package com.alipay.mobile.common.amnet.service;

import android.app.Service;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetServiceWrapper extends AmnetService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Service c;

    public AmnetServiceWrapper(Service service) {
        this.c = service;
        this.shadowMode = true;
    }

    public static /* synthetic */ Object ipc$super(AmnetServiceWrapper amnetServiceWrapper, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/service/AmnetServiceWrapper");
    }

    @Override // com.alipay.mobile.common.amnet.service.AmnetService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        innerAttach();
        super.onCreate();
    }

    public void innerAttach() {
        Method[] declaredMethods;
        Service service = this.c;
        attachBaseContext(service.getBaseContext());
        Method method = null;
        for (Method method2 : getClass().getDeclaredMethods()) {
            if (TextUtils.equals(method2.getName(), Constants.Event.SLOT_LIFECYCLE.ATTACH)) {
                method = method2;
            }
        }
        if (method == null) {
            LogCatUtil.error("AmnetServiceWrapper", "[innerAttach] attachMethod is null, a serious mistake occurred.");
            return;
        }
        method.setAccessible(true);
        Class<?> cls = service.getClass();
        try {
            Field declaredField = cls.getDeclaredField("mThread");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mClassName");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mToken");
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("mApplication");
            declaredField4.setAccessible(true);
            Field declaredField5 = cls.getDeclaredField("mActivityManager");
            declaredField5.setAccessible(true);
            Field declaredField6 = cls.getDeclaredField("mStartCompatibility");
            declaredField6.setAccessible(true);
            method.invoke(this, getBaseContext(), declaredField.get(service), declaredField2.get(service), declaredField3.get(service), declaredField4.get(service), declaredField5.get(service), declaredField6.get(service));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetServiceWrapper", "[innerAttach] Exception: " + th.toString(), th);
        }
    }
}
