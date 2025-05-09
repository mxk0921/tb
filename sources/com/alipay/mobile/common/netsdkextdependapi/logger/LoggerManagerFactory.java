package com.alipay.mobile.common.netsdkextdependapi.logger;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggerManagerFactory extends AbstraceExtBeanFactory<LoggerManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LoggerManagerFactory f4017a;

    public static final LoggerManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoggerManagerFactory) ipChange.ipc$dispatch("d9096eae", new Object[0]);
        }
        LoggerManagerFactory loggerManagerFactory = f4017a;
        if (loggerManagerFactory != null) {
            return loggerManagerFactory;
        }
        synchronized (LoggerManagerFactory.class) {
            try {
                LoggerManagerFactory loggerManagerFactory2 = f4017a;
                if (loggerManagerFactory2 != null) {
                    return loggerManagerFactory2;
                }
                LoggerManagerFactory loggerManagerFactory3 = new LoggerManagerFactory();
                f4017a = loggerManagerFactory3;
                return loggerManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(LoggerManagerFactory loggerManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/logger/LoggerManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public LoggerManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggerManager) ipChange.ipc$dispatch("6f4db0d7", new Object[]{this}) : new LoggerManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public LoggerManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggerManager) ipChange.ipc$dispatch("f6dffab8", new Object[]{this}) : (LoggerManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.loggerInfoManagerServiceName, LoggerManager.class);
    }
}
