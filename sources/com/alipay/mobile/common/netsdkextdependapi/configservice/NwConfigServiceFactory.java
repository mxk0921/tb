package com.alipay.mobile.common.netsdkextdependapi.configservice;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.alipay.mobile.common.netsdkextdependapi.beaninfo.BeanInfoManagerFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NwConfigServiceFactory extends AbstraceExtBeanFactory<NwConfigService> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static NwConfigServiceFactory f4011a;

    public static final NwConfigServiceFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NwConfigServiceFactory) ipChange.ipc$dispatch("200eabc0", new Object[0]);
        }
        NwConfigServiceFactory nwConfigServiceFactory = f4011a;
        if (nwConfigServiceFactory != null) {
            return nwConfigServiceFactory;
        }
        synchronized (BeanInfoManagerFactory.class) {
            try {
                NwConfigServiceFactory nwConfigServiceFactory2 = f4011a;
                if (nwConfigServiceFactory2 != null) {
                    return nwConfigServiceFactory2;
                }
                NwConfigServiceFactory nwConfigServiceFactory3 = new NwConfigServiceFactory();
                f4011a = nwConfigServiceFactory3;
                return nwConfigServiceFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(NwConfigServiceFactory nwConfigServiceFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/configservice/NwConfigServiceFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public NwConfigService newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwConfigService) ipChange.ipc$dispatch("a72307f3", new Object[]{this}) : new NwConfigServiceAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public NwConfigService newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwConfigService) ipChange.ipc$dispatch("299f4b32", new Object[]{this}) : (NwConfigService) InnerMiscUtil.newDefaultBean(BeanServiceConstants.nwConfigServiceName, NwConfigService.class);
    }
}
