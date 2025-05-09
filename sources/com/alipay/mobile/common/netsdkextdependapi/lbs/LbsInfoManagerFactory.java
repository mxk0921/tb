package com.alipay.mobile.common.netsdkextdependapi.lbs;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LbsInfoManagerFactory extends AbstraceExtBeanFactory<LbsInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LbsInfoManagerFactory f4016a;

    public static final LbsInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LbsInfoManagerFactory) ipChange.ipc$dispatch("5e1b0aa4", new Object[0]);
        }
        LbsInfoManagerFactory lbsInfoManagerFactory = f4016a;
        if (lbsInfoManagerFactory != null) {
            return lbsInfoManagerFactory;
        }
        synchronized (LbsInfoManagerFactory.class) {
            try {
                LbsInfoManagerFactory lbsInfoManagerFactory2 = f4016a;
                if (lbsInfoManagerFactory2 != null) {
                    return lbsInfoManagerFactory2;
                }
                LbsInfoManagerFactory lbsInfoManagerFactory3 = new LbsInfoManagerFactory();
                f4016a = lbsInfoManagerFactory3;
                return lbsInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(LbsInfoManagerFactory lbsInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/lbs/LbsInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public LbsInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LbsInfoManager) ipChange.ipc$dispatch("19442fe1", new Object[]{this}) : new LbsInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public LbsInfoManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LbsInfoManager) ipChange.ipc$dispatch("56f17e02", new Object[]{this}) : (LbsInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.lbsInfoManagerServiceName, LbsInfoManager.class);
    }
}
