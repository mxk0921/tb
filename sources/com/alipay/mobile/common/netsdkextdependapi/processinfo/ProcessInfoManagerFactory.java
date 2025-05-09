package com.alipay.mobile.common.netsdkextdependapi.processinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProcessInfoManagerFactory extends AbstraceExtBeanFactory<ProcessInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ProcessInfoManagerFactory f4023a;

    public static final ProcessInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessInfoManagerFactory) ipChange.ipc$dispatch("d008cf52", new Object[0]);
        }
        ProcessInfoManagerFactory processInfoManagerFactory = f4023a;
        if (processInfoManagerFactory != null) {
            return processInfoManagerFactory;
        }
        synchronized (ProcessInfoManagerFactory.class) {
            try {
                ProcessInfoManagerFactory processInfoManagerFactory2 = f4023a;
                if (processInfoManagerFactory2 != null) {
                    return processInfoManagerFactory2;
                }
                ProcessInfoManagerFactory processInfoManagerFactory3 = new ProcessInfoManagerFactory();
                f4023a = processInfoManagerFactory3;
                return processInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ProcessInfoManagerFactory processInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/processinfo/ProcessInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public ProcessInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessInfoManager) ipChange.ipc$dispatch("eb667573", new Object[]{this}) : new ProcessInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public ProcessInfoManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessInfoManager) ipChange.ipc$dispatch("b8729a14", new Object[]{this}) : (ProcessInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.processInfoManagerServiceName, ProcessInfoManager.class);
    }
}
