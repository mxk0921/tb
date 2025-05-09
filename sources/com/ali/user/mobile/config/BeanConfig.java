package com.ali.user.mobile.config;

import com.ali.user.mobile.service.ServiceConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BeanConfig extends AbstractBeanConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157475);
    }

    public static /* synthetic */ Object ipc$super(BeanConfig beanConfig, String str, Object... objArr) {
        if (str.hashCode() == 267248023) {
            super.init();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/config/BeanConfig");
    }

    @Override // com.ali.user.mobile.config.AbstractBeanConfig
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        this.beanMap.put(ServiceConstants.ServiceInterface.RPC_SERVICE, "com.ali.user.mobile.impl.MtopRpcServiceImpl");
        this.beanMap.put(ServiceConstants.ServiceInterface.NAV_SERVICE, "com.ali.user.mobile.navigation.NavigatorServiceImpl");
        this.beanMap.put(ServiceConstants.ServiceInterface.UI_SERVICE, "com.ali.user.mobile.ui.UIServiceImpl");
        this.beanMap.put(ServiceConstants.ServiceInterface.FACE_SERVICE, "com.taobao.android.identity.face.FaceComponent");
        this.beanMap.put(ServiceConstants.ServiceInterface.SNS_SERVICE, "com.ali.user.mobile.sns.SNSServiceImpl");
        this.beanMap.put(ServiceConstants.ServiceInterface.FINGER_PRINT_SERVICE, "com.taobao.android.identity.fingerprint.FingerPrintComponent");
        this.beanMap.put(ServiceConstants.ServiceInterface.USER_TRACE_SERVICE, "com.ali.user.mobile.UserTraceImpl");
        this.beanMap.put(ServiceConstants.ServiceInterface.NUM_AUTH_SERVICE, "com.ali.user.number.auth.NumAuthComponent");
        this.beanMap.put(ServiceConstants.ServiceInterface.LOGIN_SERVICE, "com.ali.user.mobile.login.LoginServiceImpl");
    }
}
