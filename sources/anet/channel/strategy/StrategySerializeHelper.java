package anet.channel.strategy;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ENV;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategySerializeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_NEW_STRATEGY_FOLDER_NAME = "new_awcn_strategy";
    private static final String DEFAULT_NEW_STRATEGY_PRE_FOLDER_NAME = "new_awcn_pre_strategy";
    private static final String DEFAULT_STRATEGY_FOLDER_NAME = "awcn_strategy";
    private static final String DEFAULT_STRATEGY_PRE_FOLDER_NAME = "awcn_pre_strategy";
    private static final long MAX_AVAILABLE_PERIOD = 172800000;
    private static final long MAX_FILE_NUM = 10;
    private static final String TAG = "awcn.StrategySerializeHelper";
    public static File strategyFolder = null;
    private static File strategyPreFolder = null;
    private static volatile boolean toDelete = false;
    private static Comparator<File> comparator = new Comparator<File>() { // from class: anet.channel.strategy.StrategySerializeHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue();
            }
            if (AwcnConfig.isStrategyCompareEnable()) {
                return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
            }
            return (int) (file2.lastModified() - file.lastModified());
        }
    };

    static {
        t2o.a(607125883);
    }

    private static boolean checkFolderExistOrCreate(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252116a2", new Object[]{file})).booleanValue();
        }
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public static synchronized File[] getPreSortedFiles() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File[]) ipChange.ipc$dispatch("fa38cad0", new Object[0]);
            }
            File file = strategyPreFolder;
            if (file == null) {
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, comparator);
            }
            return listFiles;
        }
    }

    public static File getPreStrategyFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c6cfe100", new Object[]{str});
        }
        checkFolderExistOrCreate(strategyPreFolder);
        return new File(strategyPreFolder, str);
    }

    public static synchronized File[] getSortedFiles() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File[]) ipChange.ipc$dispatch("ac5bb387", new Object[0]);
            } else if (GlobalAppRuntimeInfo.getEnv() == ENV.PREPARE) {
                return getPreSortedFiles();
            } else {
                File file = strategyFolder;
                if (file == null) {
                    return null;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    Arrays.sort(listFiles, comparator);
                }
                return listFiles;
            }
        }
    }

    public static synchronized void persist(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6b8666a", new Object[]{serializable, str, strategyStatObject});
            } else {
                SerializeHelper.persist(serializable, getStrategyFile(str), strategyStatObject);
            }
        }
    }

    public static synchronized void persistParcelable(Parcelable parcelable, String str, StrategyStatObject strategyStatObject) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("696aa3a4", new Object[]{parcelable, str, strategyStatObject});
            } else {
                SerializeHelper.persist(parcelable, getStrategyFile(str), strategyStatObject);
            }
        }
    }

    public static synchronized <T> T restore(String str, StrategyStatObject strategyStatObject) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("e2e072ee", new Object[]{str, strategyStatObject});
            }
            return (T) SerializeHelper.restore(getStrategyFile(str), strategyStatObject);
        }
    }

    public static synchronized Parcel restoreParcelable(String str, StrategyStatObject strategyStatObject) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcel) ipChange.ipc$dispatch("c8615cbe", new Object[]{str, strategyStatObject});
            }
            return SerializeHelper.restoreParcelable(getStrategyFile(str), strategyStatObject);
        }
    }

    public static File getStrategyFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("61d4a9f7", new Object[]{str});
        }
        if (GlobalAppRuntimeInfo.getEnv() == ENV.PREPARE) {
            ALog.e(TAG, "get pre StrategyFile", null, new Object[0]);
            return getPreStrategyFile(str);
        }
        ALog.e(TAG, "get online StrategyFile", null, new Object[0]);
        checkFolderExistOrCreate(strategyFolder);
        return new File(strategyFolder, str);
    }

    public static synchronized void clearOtherVersionStrategy() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a74575af", new Object[0]);
            } else if (AwcnConfig.isAmdcParcelableEnable()) {
                ALog.e(TAG, "clearOtherVersionStrategyFolder start.", null, new Object[0]);
                File file = new File(GlobalAppRuntimeInfo.getContext().getFilesDir(), DEFAULT_NEW_STRATEGY_FOLDER_NAME);
                if (file.exists()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String str = "version_" + Build.VERSION.SDK_INT;
                            if (file2.isDirectory() && !file2.getName().contains(str)) {
                                deleteDirectory(file2);
                            }
                        }
                        ALog.e(TAG, "clearOtherVersionStrategyFolder：clearOldVersionFile start.", null, new Object[0]);
                        exeClearOldVersionStrategy(new File(GlobalAppRuntimeInfo.getContext().getFilesDir(), DEFAULT_STRATEGY_FOLDER_NAME));
                        ALog.e(TAG, "clearOtherVersionStrategyFolder：preClearOldVersionFile start.", null, new Object[0]);
                        exeClearOldVersionStrategy(new File(GlobalAppRuntimeInfo.getContext().getFilesDir(), DEFAULT_STRATEGY_PRE_FOLDER_NAME));
                        ALog.e(TAG, "clearOtherVersionStrategyFolder end.", null, new Object[0]);
                    }
                }
            }
        }
    }

    public static synchronized void clearPreStrategyFolder() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dfc6d7e", new Object[0]);
                return;
            }
            ALog.i(TAG, "clear pre start.", null, new Object[0]);
            File file = strategyPreFolder;
            if (file == null) {
                ALog.w(TAG, "folder pre path not initialized, wait to clear", null, new Object[0]);
                toDelete = true;
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                        ALog.i(TAG, "clearStrategyFolder", null, "file", file2.getName());
                    }
                }
                ALog.i(TAG, "clear pre end.", null, new Object[0]);
            }
        }
    }

    public static synchronized void clearStrategyFolder() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bba81ef5", new Object[0]);
            } else if (AwcnConfig.isCancelHardExpiryEnable()) {
                ALog.e(TAG, "[cancel hard expiry] not need clear strategy!", null, new Object[0]);
            } else {
                ALog.i(TAG, "clear start.", null, new Object[0]);
                File file = strategyFolder;
                if (file == null) {
                    ALog.w(TAG, "folder path not initialized, wait to clear", null, new Object[0]);
                    toDelete = true;
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isFile()) {
                            file2.delete();
                            ALog.i(TAG, "clearStrategyFolder", null, "file", file2.getName());
                        }
                    }
                    ALog.i(TAG, "clear end.", null, new Object[0]);
                }
            }
        }
    }

    private static boolean deleteDirectory(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed50244", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                boolean deleteDirectory = deleteDirectory(file2);
                ALog.e(TAG, "clearOtherVersionStrategyFolder deleteDirectory. success=" + deleteDirectory, null, "filePath", file2.getAbsolutePath());
                if (!deleteDirectory) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static synchronized void exeClearOldVersionStrategy(File file) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ba109fd", new Object[]{file});
                return;
            }
            if (file != null && file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (!file2.isDirectory()) {
                            if (System.currentTimeMillis() - file2.lastModified() > (AwcnConfig.isAmdcStrategyOptEnable() ? AwcnConfig.getLongAmdcThreshold() : 172800000L)) {
                                ALog.e(TAG, "exeClearOldVersionStrategy removeInvalidFile: ", null, "file", file2.getName(), "isAmdcStrategyOptEnable", Boolean.valueOf(AwcnConfig.isAmdcStrategyOptEnable()));
                                file2.delete();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void initialize(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
            return;
        }
        if (context != null) {
            try {
                boolean isAmdcParcelableEnable = AwcnConfig.isAmdcParcelableEnable();
                if (isAmdcParcelableEnable) {
                    str = DEFAULT_NEW_STRATEGY_FOLDER_NAME;
                } else {
                    str = DEFAULT_STRATEGY_FOLDER_NAME;
                }
                File file = new File(context.getFilesDir(), str);
                strategyFolder = file;
                if (!checkFolderExistOrCreate(file)) {
                    ALog.e(TAG, "create directory failed!!!", null, "dir", strategyFolder.getAbsolutePath());
                }
                if (isAmdcParcelableEnable) {
                    File file2 = strategyFolder;
                    File file3 = new File(file2, "version_" + Build.VERSION.SDK_INT);
                    strategyFolder = file3;
                    if (!checkFolderExistOrCreate(file3)) {
                        ALog.e(TAG, "create directory failed!!!", null, "dir", strategyFolder.getAbsolutePath());
                    }
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess() || GlobalAppRuntimeInfo.isChannelProcess(context)) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file4 = new File(strategyFolder, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    strategyFolder = file4;
                    if (!checkFolderExistOrCreate(file4)) {
                        ALog.e(TAG, "create directory failed!!!", null, "dir", strategyFolder.getAbsolutePath());
                    }
                }
                ALog.i(TAG, "StrateyFolder", null, "path", strategyFolder.getAbsolutePath());
                if (toDelete) {
                    clearStrategyFolder();
                    toDelete = false;
                } else {
                    ALog.i(TAG, "StrateyFolder removeInvalidFile", null, "path", strategyFolder.getAbsolutePath());
                    removeInvalidFile();
                }
            } catch (Throwable th) {
                ALog.e(TAG, "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
                return;
            }
        }
        initializePre(context);
    }

    public static void initializePre(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e6c10e", new Object[]{context});
        } else if (context != null) {
            try {
                boolean isAmdcParcelableEnable = AwcnConfig.isAmdcParcelableEnable();
                if (AwcnConfig.isAmdcParcelableEnable()) {
                    str = DEFAULT_NEW_STRATEGY_PRE_FOLDER_NAME;
                } else {
                    str = DEFAULT_STRATEGY_PRE_FOLDER_NAME;
                }
                File file = new File(context.getFilesDir(), str);
                strategyPreFolder = file;
                if (!checkFolderExistOrCreate(file)) {
                    ALog.e(TAG, "create directory failed!!!", null, "dir", strategyPreFolder.getAbsolutePath());
                }
                if (isAmdcParcelableEnable) {
                    File file2 = strategyPreFolder;
                    File file3 = new File(file2, "version_" + Build.VERSION.SDK_INT);
                    strategyPreFolder = file3;
                    if (!checkFolderExistOrCreate(file3)) {
                        ALog.e(TAG, "create directory failed!!!", null, "dir", strategyPreFolder.getAbsolutePath());
                    }
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file4 = new File(strategyPreFolder, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    strategyPreFolder = file4;
                    if (!checkFolderExistOrCreate(file4)) {
                        ALog.e(TAG, "create directory failed!!!", null, "dir", strategyPreFolder.getAbsolutePath());
                    }
                }
                ALog.e(TAG, "strategyPreFolder", null, "path", strategyPreFolder.getAbsolutePath());
                if (toDelete) {
                    clearPreStrategyFolder();
                    toDelete = false;
                    return;
                }
                ALog.e(TAG, "strategyPreFolder removeInvalidFile", null, "path", strategyPreFolder.getAbsolutePath());
                removeInvalidFile();
            } catch (Throwable th) {
                ALog.e(TAG, "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    public static synchronized void removeInvalidFile() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4575f1f6", new Object[0]);
                return;
            }
            File[] sortedFiles = getSortedFiles();
            if (sortedFiles != null) {
                int i = 0;
                for (File file : sortedFiles) {
                    if (!file.isDirectory()) {
                        if (!AwcnConfig.isCancelHardExpiryEnable()) {
                            if (System.currentTimeMillis() - file.lastModified() > (AwcnConfig.isAmdcStrategyOptEnable() ? AwcnConfig.getLongAmdcThreshold() : 172800000L)) {
                                ALog.e(TAG, "removeInvalidFile 1: ", null, "file", file.getName(), "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "isAmdcStrategyOptEnable", Boolean.valueOf(AwcnConfig.isAmdcStrategyOptEnable()));
                                file.delete();
                            }
                        }
                        if (file.getName().startsWith("WIFI")) {
                            i++;
                            if (i > 10) {
                                ALog.e(TAG, "removeInvalidFile 2: ", null, "file", file.getName(), "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()));
                                file.delete();
                            }
                        }
                    }
                }
            }
        }
    }
}
