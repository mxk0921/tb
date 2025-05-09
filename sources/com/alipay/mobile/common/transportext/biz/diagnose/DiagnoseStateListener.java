package com.alipay.mobile.common.transportext.biz.diagnose;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DiagnoseStateListener implements AmnetNetworkDiagnoseListener, NetTest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl;
    public List<String> logStrList = new ArrayList(5);
    public boolean firstReport = true;
    public long executTime = -1;
    public boolean oneceSuccess = false;

    public DiagnoseStateListener(NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl) {
        this.networkDiagnoseServiceImpl = networkDiagnoseServiceImpl;
    }

    public static /* synthetic */ void access$000(DiagnoseStateListener diagnoseStateListener, boolean z, boolean z2, String str, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8303a1bf", new Object[]{diagnoseStateListener, new Boolean(z), new Boolean(z2), str, new Boolean(z3)});
        } else {
            diagnoseStateListener.a(z, z2, str, z3);
        }
    }

    public final void a(boolean z, boolean z2, String str, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df763c62", new Object[]{this, new Boolean(z), new Boolean(z2), str, new Boolean(z3)});
            return;
        }
        try {
            LogCatUtil.info("NetTest", "fin=[" + z3 + "], ok=[" + z2 + "], done=[" + z + "], summary=[" + str + "]");
            if (z) {
                if (!TextUtils.isEmpty(str)) {
                    this.logStrList.add(str);
                }
                if ((this.oneceSuccess || z2) && !this.logStrList.isEmpty()) {
                    this.oneceSuccess = true;
                    if (this.networkDiagnoseServiceImpl.setProgressToStartLog()) {
                        this.networkDiagnoseServiceImpl.notifyUpdateProgress();
                    }
                } else if (this.networkDiagnoseServiceImpl.setProgressToFail()) {
                    this.networkDiagnoseServiceImpl.notifyUpdateProgress();
                }
            } else if (z3) {
                if (z3) {
                    if (this.networkDiagnoseServiceImpl.setProgressToStartTraceRouting()) {
                        this.networkDiagnoseServiceImpl.notifyUpdateProgress();
                    }
                    if (z2) {
                        this.oneceSuccess = true;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    this.logStrList.add(str);
                }
            } else if (z2) {
                this.oneceSuccess = true;
            }
        } catch (Exception e) {
            LogCatUtil.error("NetTest", e);
        }
    }

    public List<String> getLogStrList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f42fabf", new Object[]{this});
        }
        return this.logStrList;
    }

    public boolean getOneceSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c60441c", new Object[]{this})).booleanValue();
        }
        return this.oneceSuccess;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener, com.alipay.mobile.common.transportext.amnet.NetTest
    public void report(final boolean z, final boolean z2, final boolean z3, final String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else if (this.networkDiagnoseServiceImpl.isStateRunning()) {
            synchronized (this) {
                try {
                    if (this.firstReport) {
                        this.firstReport = false;
                        int nextInt = new Random().nextInt(20);
                        if (nextInt < 6) {
                            nextInt += 6;
                        }
                        i = nextInt * 1000;
                        this.executTime = System.currentTimeMillis() + i + 2000;
                    } else {
                        long currentTimeMillis = this.executTime - System.currentTimeMillis();
                        if (currentTimeMillis >= 1) {
                            i = (int) currentTimeMillis;
                            this.executTime = this.executTime + i + 2000;
                        }
                    }
                    LogCatUtil.info("NetTest", " delay=" + i);
                } catch (Throwable th) {
                    throw th;
                }
            }
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.DiagnoseStateListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DiagnoseStateListener.access$000(DiagnoseStateListener.this, z3, z2, str, z);
                    }
                }
            }, i, TimeUnit.MILLISECONDS);
        }
    }
}
