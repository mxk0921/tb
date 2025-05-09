package com.alipay.android.msp.framework.statisticsv2.mechanism;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.Recorder;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.DateUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PersistStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String FILE_STATISTICS_V2 = "cashier_statistics_v2";

    /* renamed from: a  reason: collision with root package name */
    public static File f3666a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IUpdateCallback {
        File getFile();

        void setFile(File file);
    }

    public static synchronized void a() {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47cdcd7", new Object[0]);
                return;
            }
            LogUtil.record(4, "phonecashiermsp#log", "StatisticManager::uploadLocalRecord", "mdap channel");
            File[] listFiles = new File(MspConfig.getInstance().getLogsPathV2()).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public int compare(File file, File file2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue() : file2.getName().compareTo(file.getName());
                    }
                });
                int i = 0;
                for (File file : listFiles) {
                    if (!d(file)) {
                        i++;
                        if (i <= 4) {
                            String decryptRead = FileUtils.decryptRead(file);
                            if (!TextUtils.isEmpty(decryptRead)) {
                                String str = decryptRead.substring(0, decryptRead.length() - 1) + ",(" + DateUtil.format() + ")]";
                                LogUtil.record(4, "phonecashiermsp#log", "PersistStorage.uploadLocalRecords", Utils.truncateString(str, 256));
                                LoggerFactory.getBehavorLogger().customContent(LogCategory.CATEGORY_ALIPAYSDK, str);
                            }
                            FileUtils.delete(file);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void access$000(Recorder recorder, IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75eca21", new Object[]{recorder, iUpdateCallback});
        } else {
            b(recorder, iUpdateCallback);
        }
    }

    public static /* synthetic */ void access$100(IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e670f4", new Object[]{iUpdateCallback});
        } else {
            c(iUpdateCallback);
        }
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            a();
        }
    }

    public static void asyncDelete(final IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7ecc8a", new Object[]{iUpdateCallback});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PersistStorage.access$100(IUpdateCallback.this);
                    }
                }
            });
        }
    }

    public static void asyncSave(final Recorder recorder, final IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24842aca", new Object[]{recorder, iUpdateCallback});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PersistStorage.access$000(Recorder.this, iUpdateCallback);
                    }
                }
            });
        }
    }

    public static void asyncUploadPreviousRecords() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90029f75", new Object[0]);
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PersistStorage.access$200();
                    }
                }
            });
        }
    }

    public static synchronized void b(Recorder recorder, IUpdateCallback iUpdateCallback) {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d371d12", new Object[]{recorder, iUpdateCallback});
                return;
            }
            if (recorder != null) {
                String format = recorder.format();
                String buildRandomFileInBasePath = FileUtils.buildRandomFileInBasePath(f3666a.getAbsolutePath());
                FileUtils.encryptWrite(buildRandomFileInBasePath, format);
                if (iUpdateCallback != null) {
                    File file = iUpdateCallback.getFile();
                    if (file != null) {
                        FileUtils.delete(file);
                    }
                    iUpdateCallback.setFile(new File(buildRandomFileInBasePath));
                }
            }
        }
    }

    public static synchronized void c(IUpdateCallback iUpdateCallback) {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a97b0aa4", new Object[]{iUpdateCallback});
                return;
            }
            if (iUpdateCallback != null) {
                File file = iUpdateCallback.getFile();
                if (file != null && file.exists() && file.isFile()) {
                    file.delete();
                }
                iUpdateCallback.setFile(null);
            }
        }
    }

    public static boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        Map<Integer, MspContext> mspContextMap = MspContextManager.getInstance().getMspContextMap();
        if (mspContextMap == null || mspContextMap.isEmpty()) {
            return false;
        }
        for (MspContext mspContext : mspContextMap.values()) {
            if (mspContext.getStatisticInfo().persistCheck(file)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void init() {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (f3666a == null) {
                File file = new File(MspConfig.getInstance().getLogsPathV2());
                f3666a = file;
                if (!file.exists()) {
                    f3666a.mkdirs();
                }
            }
        }
    }
}
