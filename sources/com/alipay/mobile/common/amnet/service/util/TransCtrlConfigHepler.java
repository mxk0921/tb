package com.alipay.mobile.common.amnet.service.util;

import android.os.Environment;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TransCtrlConfigHepler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static long f3920a = -1;
    public static long b = -1;

    public static void delExistForder(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a8229", new Object[]{file, file2});
            return;
        }
        if (!file.isFile()) {
            file.delete();
        }
        if (!file2.isFile()) {
            file2.delete();
        }
    }

    public static void doUpdateCfg(final File file, final File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9680a945", new Object[]{file, file2});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.util.TransCtrlConfigHepler.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    while (true) {
                        try {
                            Thread.sleep(3000L);
                            TransCtrlConfigHepler.updateTransFile(file);
                            TransCtrlConfigHepler.updateSrvCfig(file2);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();
        }
    }

    public static File getSDCardPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("54f7aaca", new Object[0]);
        }
        String externalStorageState = Environment.getExternalStorageState();
        if (TextUtils.equals("mounted", externalStorageState) || TextUtils.equals("mounted_ro", externalStorageState)) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory.exists() && externalStorageDirectory.isDirectory() && externalStorageDirectory.canRead()) {
                return externalStorageDirectory;
            }
            LogCatUtil.info("TransCtrlConfigHepler", "externalStorageDirectory fail");
            return null;
        }
        LogCatUtil.info("TransCtrlConfigHepler", "externalStorageState=[" + externalStorageState + "]");
        return null;
    }

    public static final void notifyConfigUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94353183", new Object[]{jSONObject});
            return;
        }
        LogCatUtil.info("TransCtrlConfigHepler", "notifyConfigUpdate");
        if (jSONObject == null) {
            LogCatUtil.printInfo("TransCtrlConfigHepler", "json is null.");
            return;
        }
        String optString = jSONObject.optString(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
        if (TextUtils.isEmpty(optString)) {
            LogCatUtil.printInfo("TransCtrlConfigHepler", "strConf is empty.");
        } else {
            a(optString);
        }
    }

    public static final void startRequestDnsTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a23690", new Object[0]);
            return;
        }
        int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.REQ_DC_INTERVAL);
        long millis = intValue != -1 ? TimeUnit.SECONDS.toMillis(intValue) : 7200000L;
        NetworkAsyncTaskExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.util.TransCtrlConfigHepler.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName("RequestDnsTimer");
                try {
                    AlipayHttpDnsClient.getDnsClient().refreshIPListOnly();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }, millis, millis, TimeUnit.MILLISECONDS);
        LogCatUtil.info("TransCtrlConfigHepler", "startRequestDnsTimer");
    }

    public static final void testNotifyConfigUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9035664d", new Object[0]);
        } else if (!MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            LogCatUtil.info("TransCtrlConfigHepler", "not debugger");
        } else {
            File sDCardPath = getSDCardPath();
            if (sDCardPath != null) {
                File file = new File(sDCardPath, TransportConfigureManager.SDCARD_CONFIG_FILE);
                File file2 = new File(sDCardPath, TransportConfigureManager.SDCARD_SRV_CONFIG_FILE);
                delExistForder(file, file2);
                if (createNewFile(file, file2) && isCanRead(file, file2)) {
                    doUpdateCfg(file, file2);
                    LogCatUtil.info("TransCtrlConfigHepler", "start observer file changed.  transCfgfile=[" + file.getPath() + "]   srvCfgFile=[" + file2.getPath() + "]");
                }
            }
        }
    }

    public static void updateTransFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131ce79", new Object[]{file});
            return;
        }
        long lastModified = file.lastModified();
        if (lastModified != f3920a) {
            f3920a = lastModified;
            if (file.length() > 0) {
                LogCatUtil.info("TransCtrlConfigHepler", "transCfgfile content changed!");
                TransportConfigureManager.getInstance().updateConfig(AmnetEnvHelper.getAppContext());
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        SwitchMonitorLogUtil.monitorCoreSwitchRecvLog(AmnetEnvHelper.getAppContext(), str, "push");
        try {
            TransportConfigureManager.getInstance().updateConfig(AmnetEnvHelper.getAppContext(), str, true);
        } finally {
            SwitchMonitorLogUtil.monitorSwitchUpdatedLog(AmnetEnvHelper.getAppContext(), "push");
            NwSharedSwitchUtil.putSwitchSrc("push");
        }
    }

    public static boolean createNewFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1487a159", new Object[]{file, file2})).booleanValue();
        }
        if (!createTransCfgFile(file)) {
            return false;
        }
        if (file2.exists()) {
            return true;
        }
        try {
            file2.createNewFile();
            return false;
        } catch (IOException e) {
            LogCatUtil.error("TransCtrlConfigHepler", "srvCfgFile create exception", e);
            return false;
        }
    }

    public static boolean createTransCfgFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de53416", new Object[]{file})).booleanValue();
        }
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return false;
        } catch (IOException e) {
            LogCatUtil.error("TransCtrlConfigHepler", "transCfgfile create exception", e);
            return false;
        }
    }

    public static boolean isCanRead(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3cff7b5", new Object[]{file, file2})).booleanValue();
        }
        if (!file.canRead()) {
            LogCatUtil.error("TransCtrlConfigHepler", "transCfgfile not can read!");
            return false;
        } else if (file2.canRead()) {
            return true;
        } else {
            LogCatUtil.error("TransCtrlConfigHepler", "srvCfgFile not can read!");
            return false;
        }
    }

    public static void updateSrvCfig(File file) {
        long lastModified = file.lastModified();
        if (lastModified != b) {
            b = lastModified;
            if (file.length() > 0) {
                LogCatUtil.info("TransCtrlConfigHepler", "srvCfgFile content changed!");
                try {
                    Class<?> cls = Class.forName("com.alipay.mobile.common.utils.FileUtils");
                    Object invoke = cls.getMethod("readFile", File.class).invoke(cls, file);
                    if (invoke != null) {
                        LogCatUtil.info("TransCtrlConfigHepler", "updateConfig json");
                        String str = new String((byte[]) invoke);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO, str);
                        notifyConfigUpdate(jSONObject);
                    }
                } catch (Exception e) {
                    LogCatUtil.warn("TransCtrlConfigHepler", "process srvCfgFile exception." + e.toString());
                }
            }
        }
    }
}
