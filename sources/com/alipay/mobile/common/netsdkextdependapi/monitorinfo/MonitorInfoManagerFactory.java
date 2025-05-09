package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonitorInfoManagerFactory extends AbstraceExtBeanFactory<MonitorInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MonitorInfoManagerFactory f4019a;

    public static final MonitorInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorInfoManagerFactory) ipChange.ipc$dispatch("72177e3c", new Object[0]);
        }
        MonitorInfoManagerFactory monitorInfoManagerFactory = f4019a;
        if (monitorInfoManagerFactory != null) {
            return monitorInfoManagerFactory;
        }
        synchronized (MonitorInfoManagerFactory.class) {
            try {
                MonitorInfoManagerFactory monitorInfoManagerFactory2 = f4019a;
                if (monitorInfoManagerFactory2 != null) {
                    return monitorInfoManagerFactory2;
                }
                MonitorInfoManagerFactory monitorInfoManagerFactory3 = new MonitorInfoManagerFactory();
                f4019a = monitorInfoManagerFactory3;
                return monitorInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MonitorInfoManagerFactory monitorInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/monitorinfo/MonitorInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public MonitorInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MonitorInfoManager) ipChange.ipc$dispatch("65459c9", new Object[]{this}) : new MonitorInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public MonitorInfoManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorInfoManager) ipChange.ipc$dispatch("d3607e6a", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "MonitorInfoManagerFactory newDefaultBean");
        return (MonitorInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.monitorInfoManagerServiceName, MonitorInfoManager.class);
    }
}
