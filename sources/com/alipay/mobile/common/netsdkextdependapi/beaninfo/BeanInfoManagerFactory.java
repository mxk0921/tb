package com.alipay.mobile.common.netsdkextdependapi.beaninfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BeanInfoManagerFactory extends AbstraceExtBeanFactory<BeanInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static BeanInfoManagerFactory f4010a;

    public static final BeanInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BeanInfoManagerFactory) ipChange.ipc$dispatch("f5587b0e", new Object[0]);
        }
        BeanInfoManagerFactory beanInfoManagerFactory = f4010a;
        if (beanInfoManagerFactory != null) {
            return beanInfoManagerFactory;
        }
        synchronized (BeanInfoManagerFactory.class) {
            try {
                BeanInfoManagerFactory beanInfoManagerFactory2 = f4010a;
                if (beanInfoManagerFactory2 != null) {
                    return beanInfoManagerFactory2;
                }
                BeanInfoManagerFactory beanInfoManagerFactory3 = new BeanInfoManagerFactory();
                f4010a = beanInfoManagerFactory3;
                return beanInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(BeanInfoManagerFactory beanInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/beaninfo/BeanInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public BeanInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BeanInfoManager) ipChange.ipc$dispatch("1a401bf7", new Object[]{this}) : new BeanInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public BeanInfoManager newDefaultBean() {
        return (BeanInfoManager) Class.forName("com.alipay.mobile.common.netsdkextdepend.beaninfo.DefaultBeanInfoManager").newInstance();
    }
}
