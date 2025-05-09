package com.alipay.mobile.common.transportext.biz.shared;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.ipc.api.LocalCallRetryHandler;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.transport.ext.MainProcConfigListenService;
import com.alipay.mobile.common.transport.httpdns.ipc.MainProcReloadDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.httpdns.MainProcReloadDnsServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.AcceptDataListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.shared.config.MainProcConfigListenServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExtTransLocalCallRetryHandler implements LocalCallRetryHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.ipc.api.LocalCallRetryHandler
    public boolean retryLocalCall(IPCParameter iPCParameter, IPCResult iPCResult, ServiceBeanManager serviceBeanManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afdb0f4", new Object[]{this, iPCParameter, iPCResult, serviceBeanManager, new Integer(i)})).booleanValue();
        }
        if (iPCResult.resultCode != 100) {
            LogCatUtil.warn("IPC_ExtTransLocalCallRetryHandler", "Only support SERVICE_NOT_FOUND_CODE retry!");
            return false;
        } else if (TextUtils.isEmpty(iPCParameter.className)) {
            LogCatUtil.warn("IPC_ExtTransLocalCallRetryHandler", "className is null!");
            return false;
        } else if (serviceBeanManager.getServiceBean(iPCParameter.className) != null) {
            LogCatUtil.info("IPC_ExtTransLocalCallRetryHandler", "serviceBean is not null.  return true;");
            return true;
        } else if (MainProcDataListenService.class.getName().equals(iPCParameter.className)) {
            serviceBeanManager.register(MainProcDataListenService.class.getName(), AcceptDataListenServiceImpl.getInstance());
            LogCatUtil.info("IPC_ExtTransLocalCallRetryHandler", "register " + iPCParameter.className);
            return true;
        } else if (MainProcGeneralListenService.class.getName().equals(iPCParameter.className)) {
            serviceBeanManager.register(MainProcGeneralListenService.class.getName(), GeneralEventListenServiceImpl.getInstance());
            LogCatUtil.info("IPC_ExtTransLocalCallRetryHandler", "register " + iPCParameter.className);
            return true;
        } else if (MainProcConfigListenService.class.getName().equals(iPCParameter.className)) {
            serviceBeanManager.register(MainProcConfigListenService.class.getName(), MainProcConfigListenServiceImpl.getInstance());
            LogCatUtil.info("IPC_ExtTransLocalCallRetryHandler", "register " + iPCParameter.className);
            return true;
        } else if (!MainProcReloadDnsService.class.getName().equals(iPCParameter.className)) {
            return false;
        } else {
            serviceBeanManager.register(MainProcReloadDnsService.class.getName(), new MainProcReloadDnsServiceImpl());
            LogCatUtil.info("IPC_ExtTransLocalCallRetryHandler", "register " + iPCParameter.className);
            return true;
        }
    }
}
