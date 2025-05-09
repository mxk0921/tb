package com.alipay.mobile.intelligentdecision.manager;

import android.text.TextUtils;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcRequest;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcResponse;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogReportManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile LogReportManager f4254a;

    public static LogReportManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogReportManager) ipChange.ipc$dispatch("40eb4274", new Object[0]);
        }
        if (f4254a == null) {
            synchronized (LogReportManager.class) {
                try {
                    if (f4254a == null) {
                        f4254a = new LogReportManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4254a;
    }

    public final synchronized void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.manager.LogReportManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (str != null) {
                        IDRpcServiceBiz iDRpcServiceBiz = new IDRpcServiceBiz();
                        IDRpcRequest iDRpcRequest = new IDRpcRequest();
                        iDRpcRequest.type = "behavior";
                        iDRpcRequest.content = str;
                        DecisionLogcat.b("LogReportManager", "start reportMemoryData");
                        try {
                            iDRpcServiceBiz.report(iDRpcRequest);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }, "reportMemoryData");
        }
    }

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
    }

    public final synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        DecisionLogcat.b("LogReportManager", "start reportCollect");
        IDRpcServiceBiz iDRpcServiceBiz = new IDRpcServiceBiz();
        IDRpcRequest iDRpcRequest = new IDRpcRequest();
        iDRpcRequest.type = str2;
        iDRpcRequest.content = str;
        DecisionLogcat.b("LogReportManager", "start reportCollect1");
        IDRpcResponse report = iDRpcServiceBiz.report(iDRpcRequest);
        DecisionLogcat.b("LogReportManager", "start reportCollect2");
        if (report != null) {
            DecisionLogcat.b("LogReportManager", "report result:" + report.success);
            return;
        }
        DecisionLogcat.b("LogReportManager", "report result null");
    }
}
