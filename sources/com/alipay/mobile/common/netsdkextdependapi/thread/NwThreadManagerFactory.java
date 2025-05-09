package com.alipay.mobile.common.netsdkextdependapi.thread;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NwThreadManagerFactory extends AbstraceExtBeanFactory<NwThreadManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static NwThreadManagerFactory f4028a;

    public static final NwThreadManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NwThreadManagerFactory) ipChange.ipc$dispatch("81287f25", new Object[0]);
        }
        NwThreadManagerFactory nwThreadManagerFactory = f4028a;
        if (nwThreadManagerFactory != null) {
            return nwThreadManagerFactory;
        }
        synchronized (SecurityManagerFactory.class) {
            try {
                NwThreadManagerFactory nwThreadManagerFactory2 = f4028a;
                if (nwThreadManagerFactory2 != null) {
                    return nwThreadManagerFactory2;
                }
                NwThreadManagerFactory nwThreadManagerFactory3 = new NwThreadManagerFactory();
                f4028a = nwThreadManagerFactory3;
                return nwThreadManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(NwThreadManagerFactory nwThreadManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/thread/NwThreadManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public NwThreadManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwThreadManager) ipChange.ipc$dispatch("46e18600", new Object[]{this}) : new NwThreadManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public NwThreadManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwThreadManager) ipChange.ipc$dispatch("3308dba1", new Object[]{this}) : (NwThreadManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.nwThreadManagerServiceName, NwThreadManager.class);
    }
}
