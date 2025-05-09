package com.alipay.mobile.common.netsdkextdependapi.security;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecurityManagerFactory extends AbstraceExtBeanFactory<SecurityManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SecurityManagerFactory f4024a;

    public static final SecurityManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityManagerFactory) ipChange.ipc$dispatch("6df5ccee", new Object[0]);
        }
        SecurityManagerFactory securityManagerFactory = f4024a;
        if (securityManagerFactory != null) {
            return securityManagerFactory;
        }
        synchronized (SecurityManagerFactory.class) {
            try {
                SecurityManagerFactory securityManagerFactory2 = f4024a;
                if (securityManagerFactory2 != null) {
                    return securityManagerFactory2;
                }
                SecurityManagerFactory securityManagerFactory3 = new SecurityManagerFactory();
                f4024a = securityManagerFactory3;
                return securityManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(SecurityManagerFactory securityManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/security/SecurityManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public SecurityManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SecurityManager) ipChange.ipc$dispatch("b9692617", new Object[]{this}) : new SecurityManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public SecurityManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityManager) ipChange.ipc$dispatch("39119778", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "SecurityManagerFactory newDefaultBean");
        return (SecurityManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.securityManagerServiceName, SecurityManager.class);
    }
}
