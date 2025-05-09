package com.alipay.mobile.common.netsdkextdependapi.deviceinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfoManagerFactory extends AbstraceExtBeanFactory<DeviceInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static DeviceInfoManagerFactory f4012a;

    public static final DeviceInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfoManagerFactory) ipChange.ipc$dispatch("78ac6f8e", new Object[0]);
        }
        DeviceInfoManagerFactory deviceInfoManagerFactory = f4012a;
        if (deviceInfoManagerFactory != null) {
            return deviceInfoManagerFactory;
        }
        synchronized (DeviceInfoManagerFactory.class) {
            try {
                DeviceInfoManagerFactory deviceInfoManagerFactory2 = f4012a;
                if (deviceInfoManagerFactory2 != null) {
                    return deviceInfoManagerFactory2;
                }
                DeviceInfoManagerFactory deviceInfoManagerFactory3 = new DeviceInfoManagerFactory();
                f4012a = deviceInfoManagerFactory3;
                return deviceInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(DeviceInfoManagerFactory deviceInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/deviceinfo/DeviceInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public DeviceInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceInfoManager) ipChange.ipc$dispatch("4802c2f7", new Object[]{this}) : new DeviceInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public DeviceInfoManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfoManager) ipChange.ipc$dispatch("f1619bd8", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "DeviceInfoManagerFactory newDefaultBean");
        return (DeviceInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.deviceInfoManagerServiceName, DeviceInfoManager.class);
    }
}
