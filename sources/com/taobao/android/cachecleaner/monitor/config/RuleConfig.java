package com.taobao.android.cachecleaner.monitor.config;

import com.alibaba.ability.impl.file.FileAbility;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizQuotaData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.autoclear.data.MatchBasedData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.pqw;
import tb.t2o;
import tb.vs3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RuleConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long KB_2_BYTE = 1024;
    public static final long MB_2_KB = 1024;
    private final String[] DEFAULT_BIZ_DIR_WHIT_LIST;
    private final String[] DEFAULT_FULL_CACHE_CLEAR_DIR;
    private final String[] EXPIRED_FILE_PATH_LIST;
    private final String[] SOFT_LINK_DIR_LIST;
    private final String[] SOFT_LINK_EXCLUDE_BRAND;
    private List<String> bizWhiteList;
    private List<String> expiredFilePathList;
    private List<String> fullCacheClearDir;
    private List<String> softLinkDir;
    private List<String> softLinkExcludeBrand;
    private boolean enable = true;
    private boolean innerCacheEnable = true;
    private boolean externalCacheEnable = true;
    private boolean externalFileEnable = true;
    private boolean apkFileEnable = true;
    private boolean libsFileEnable = true;
    private boolean innerCacheDifferEnable = true;
    private boolean trackEnable = true;
    private int maxDeepLevel = 10;
    private long largeFileSizeThreshold = FileAbility.MAX_FILE_SIZE;
    private long hugeFileSizeThreshold = 209715200;
    private long fileLastModifiedThreshold = pqw.DEFAULT_MAX_AGE;
    private long newInstallThreshold = 604800000;
    private long spFileSizeThreshold = 15360;
    private long dataBaseSizeThreshold = 30720;
    private long sizeIncreaseThreshold = FileAbility.MAX_FILE_SIZE;
    private int maxFilesSize = 150;
    private long hugeBizDirSizeThreshold = 104857600;
    private boolean enableSymbolicLink = true;
    private int softLinkCheckMaxDepth = 6;
    private boolean enableOatMonitor = true;
    private boolean enableApkSizeMonitor = true;
    private boolean enableAppDataMonitor = true;
    private long occupationSizeThreshold = 1048576;
    private long availableSizeThreshold = 1048576;
    private double availableSizeRateThreshold = 0.1d;
    private long silenceTime = 432000000;
    private long allSilenceTime = 432000000;
    public boolean enableZcacheClear = true;
    public boolean enableVFSClear = true;
    private boolean enableMsgClear = true;
    private long clearWaitTime = 2000;
    private boolean enableFore2BackGroundClear = true;
    private boolean enableDeleteExpiredFiles = true;
    private boolean enableMatchBasedClear = false;
    private List<MatchBasedData> matchBasedDataList = new ArrayList();
    private List<String> exceptFileSuffixes = new ArrayList();
    private List<BizTaskData> quotaClean = new ArrayList();
    private long fullCacheClearSilenceTime = 86400;
    private Map<String, List<BizQuotaData>> quotaSizeMap = new HashMap();
    private boolean enableSoftLinkApi = true;
    private long maxReportSize = 1048576;
    private boolean enableNewZcacheV1 = true;
    @JSONField(name = "iopm")
    private boolean ioPeriodMonitorEnable = false;
    @JSONField(name = "iolm")
    private boolean ioLifeCycleMonitorEnable = false;
    @JSONField(name = "iosm")
    private boolean ioSetupMonitorEnable = false;
    @JSONField(name = "dh")
    private String hashSampleRate = "1000000_0_500";
    @JSONField(name = "iopmi")
    private long ioPeriodMonitorInterval = 30000;

    static {
        t2o.a(737149041);
    }

    public RuleConfig() {
        String[] strArr = {vs3.INNER_ROOT_DIR + "/com.taobao.taobao/app_zcache"};
        this.DEFAULT_BIZ_DIR_WHIT_LIST = strArr;
        String[] strArr2 = {"databases/MLTK.db"};
        this.EXPIRED_FILE_PATH_LIST = strArr2;
        String[] strArr3 = {"app_swallows"};
        this.SOFT_LINK_DIR_LIST = strArr3;
        String[] strArr4 = {SystemUtils.PRODUCT_HONOR};
        this.SOFT_LINK_EXCLUDE_BRAND = strArr4;
        String[] strArr5 = {"InnerStorage/cache", "ExternalCache/", "InnerStorage/app_jsi", "ExternalFiles/AVFSCache"};
        this.DEFAULT_FULL_CACHE_CLEAR_DIR = strArr5;
        this.bizWhiteList = Arrays.asList(strArr);
        this.softLinkDir = Arrays.asList(strArr3);
        this.softLinkExcludeBrand = Arrays.asList(strArr4);
        this.expiredFilePathList = Arrays.asList(strArr2);
        this.fullCacheClearDir = Arrays.asList(strArr5);
    }

    public long getAllSilenceTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7efda9e", new Object[]{this})).longValue();
        }
        return this.allSilenceTime;
    }

    public boolean getApkFileEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d3f43b0", new Object[]{this})).booleanValue();
        }
        return this.apkFileEnable;
    }

    public double getAvailableSizeRateThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dceffa0c", new Object[]{this})).doubleValue();
        }
        return this.availableSizeRateThreshold;
    }

    public long getAvailableSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("985ce112", new Object[]{this})).longValue();
        }
        return this.availableSizeThreshold;
    }

    public List<String> getBizWhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f308df96", new Object[]{this});
        }
        return this.bizWhiteList;
    }

    public long getClearWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de80df94", new Object[]{this})).longValue();
        }
        return this.clearWaitTime;
    }

    public long getDataBaseSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5da35d4", new Object[]{this})).longValue();
        }
        return this.dataBaseSizeThreshold;
    }

    public boolean getEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f06e884", new Object[]{this})).booleanValue();
        }
        return this.enable;
    }

    public boolean getEnableApkSizeMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc25ecc1", new Object[]{this})).booleanValue();
        }
        return this.enableApkSizeMonitor;
    }

    public boolean getEnableAppDataMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5cfed3", new Object[]{this})).booleanValue();
        }
        return this.enableAppDataMonitor;
    }

    public boolean getEnableDeleteExpiredFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa15581", new Object[]{this})).booleanValue();
        }
        return this.enableDeleteExpiredFiles;
    }

    public boolean getEnableFore2BackGroundClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12a8916d", new Object[]{this})).booleanValue();
        }
        return this.enableFore2BackGroundClear;
    }

    public boolean getEnableMatchBasedClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d28dd1", new Object[]{this})).booleanValue();
        }
        return this.enableMatchBasedClear;
    }

    public boolean getEnableMsgClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c554f0", new Object[]{this})).booleanValue();
        }
        return this.enableMsgClear;
    }

    public boolean getEnableOatMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba56cb7c", new Object[]{this})).booleanValue();
        }
        return this.enableOatMonitor;
    }

    public boolean getEnableSoftLinkApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f28e008", new Object[]{this})).booleanValue();
        }
        return this.enableSoftLinkApi;
    }

    public boolean getEnableSymbolicLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350c30f0", new Object[]{this})).booleanValue();
        }
        return this.enableSymbolicLink;
    }

    public boolean getEnableVFSClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3713e2ee", new Object[]{this})).booleanValue();
        }
        return this.enableVFSClear;
    }

    public boolean getEnableZcacheClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11ef0037", new Object[]{this})).booleanValue();
        }
        return this.enableZcacheClear;
    }

    public List<String> getExceptFileSuffixes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6aa5f96", new Object[]{this});
        }
        return this.exceptFileSuffixes;
    }

    public List<String> getExpiredFilePathList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("56e5e392", new Object[]{this});
        }
        return this.expiredFilePathList;
    }

    public boolean getExternalCacheEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eff0e2f", new Object[]{this})).booleanValue();
        }
        return this.innerCacheEnable;
    }

    public boolean getExternalFileEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bc2fecb", new Object[]{this})).booleanValue();
        }
        return this.externalFileEnable;
    }

    public long getFileLastModifiedThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c028455", new Object[]{this})).longValue();
        }
        return this.fileLastModifiedThreshold;
    }

    public List<String> getFullCacheClearDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("966baa23", new Object[]{this});
        }
        return this.fullCacheClearDir;
    }

    public long getFullCacheClearSilenceTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec0db199", new Object[]{this})).longValue();
        }
        return this.fullCacheClearSilenceTime;
    }

    public String getHashSampleRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a881096b", new Object[]{this});
        }
        return this.hashSampleRate;
    }

    public long getHugeBizDirSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("261ff52a", new Object[]{this})).longValue();
        }
        return this.hugeBizDirSizeThreshold;
    }

    public long getHugeFileSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c169228", new Object[]{this})).longValue();
        }
        return this.hugeFileSizeThreshold;
    }

    public boolean getInnerCacheDifferEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6394082", new Object[]{this})).booleanValue();
        }
        return this.innerCacheDifferEnable;
    }

    public boolean getInnerCacheEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e72ab0f0", new Object[]{this})).booleanValue();
        }
        return this.externalCacheEnable;
    }

    public boolean getIoLifeCycleMonitorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cfeb39a", new Object[]{this})).booleanValue();
        }
        return this.ioLifeCycleMonitorEnable;
    }

    public boolean getIoPeriodMonitorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("140b430b", new Object[]{this})).booleanValue();
        }
        return this.ioPeriodMonitorEnable;
    }

    public long getIoPeriodMonitorInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88a5e5fd", new Object[]{this})).longValue();
        }
        return this.ioPeriodMonitorInterval;
    }

    public boolean getIoSetupMonitorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32585ac7", new Object[]{this})).booleanValue();
        }
        return this.ioSetupMonitorEnable;
    }

    public long getLargeFileSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50174a44", new Object[]{this})).longValue();
        }
        return this.largeFileSizeThreshold;
    }

    public boolean getLibsFileEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4922a34e", new Object[]{this})).booleanValue();
        }
        return this.libsFileEnable;
    }

    public List<MatchBasedData> getMatchBasedDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39ee3af4", new Object[]{this});
        }
        return this.matchBasedDataList;
    }

    public int getMaxDeepLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5f57ee4", new Object[]{this})).intValue();
        }
        return this.maxDeepLevel;
    }

    public int getMaxFilesSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1350804", new Object[]{this})).intValue();
        }
        return this.maxFilesSize;
    }

    public long getMaxReportSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d03f7b1e", new Object[]{this})).longValue();
        }
        return this.maxReportSize;
    }

    public long getNewInstallThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e59af15", new Object[]{this})).longValue();
        }
        return this.newInstallThreshold;
    }

    public long getOccupationSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54a7fda4", new Object[]{this})).longValue();
        }
        return this.occupationSizeThreshold;
    }

    public List<BizTaskData> getQuotaClean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("81f5dcd9", new Object[]{this});
        }
        return this.quotaClean;
    }

    public Map<String, List<BizQuotaData>> getQuotaSizeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e74348b5", new Object[]{this});
        }
        return this.quotaSizeMap;
    }

    public long getSilenceTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e8a253", new Object[]{this})).longValue();
        }
        return this.silenceTime;
    }

    public long getSizeIncreaseThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8287700d", new Object[]{this})).longValue();
        }
        return this.sizeIncreaseThreshold;
    }

    public int getSoftLinkCheckMaxDepth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0dc847", new Object[]{this})).intValue();
        }
        return this.softLinkCheckMaxDepth;
    }

    public List<String> getSoftLinkDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e27128d", new Object[]{this});
        }
        return this.softLinkDir;
    }

    public List<String> getSoftLinkExcludeBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7d5e73d9", new Object[]{this});
        }
        return this.softLinkExcludeBrand;
    }

    public long getSpFileSizeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec4dfc36", new Object[]{this})).longValue();
        }
        return this.spFileSizeThreshold;
    }

    public boolean getTrackEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad18ee03", new Object[]{this})).booleanValue();
        }
        return this.trackEnable;
    }

    public boolean isEnableNewZcacheV1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301829a1", new Object[]{this})).booleanValue();
        }
        return this.enableNewZcacheV1;
    }

    public void setAllSilenceTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a450b0ce", new Object[]{this, new Long(j)});
        } else {
            this.allSilenceTime = j;
        }
    }

    public void setApkFileEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d566b4", new Object[]{this, new Boolean(z)});
        } else {
            this.apkFileEnable = z;
        }
    }

    public void setAvailableSizeRateThreshold(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8cdb54", new Object[]{this, new Double(d)});
        } else {
            this.availableSizeRateThreshold = d;
        }
    }

    public void setAvailableSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b57c4da", new Object[]{this, new Long(j)});
        } else {
            this.availableSizeThreshold = j;
        }
    }

    public void setBizWhiteList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af6268e", new Object[]{this, list});
        } else {
            this.bizWhiteList = list;
        }
    }

    public void setClearWaitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c70d30", new Object[]{this, new Long(j)});
        } else {
            this.clearWaitTime = j;
        }
    }

    public void setDataBaseSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bb2f0", new Object[]{this, new Long(j)});
        } else {
            this.dataBaseSizeThreshold = j;
        }
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public void setEnableApkSizeMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f264b62b", new Object[]{this, new Boolean(z)});
        } else {
            this.enableApkSizeMonitor = z;
        }
    }

    public void setEnableAppDataMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fe659", new Object[]{this, new Boolean(z)});
        } else {
            this.enableAppDataMonitor = z;
        }
    }

    public void setEnableDeleteExpiredFiles(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcd0b6b", new Object[]{this, new Boolean(z)});
        } else {
            this.enableDeleteExpiredFiles = z;
        }
    }

    public void setEnableFore2BackGroundClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe77fff", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFore2BackGroundClear = z;
        }
    }

    public void setEnableMatchBasedClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523e94b3", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMatchBasedClear = z;
        }
    }

    public void setEnableMsgClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932abadc", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMsgClear = z;
        }
    }

    public void setEnableNewZcacheV1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecbb20f", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNewZcacheV1 = z;
        }
    }

    public void setEnableOatMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609608d0", new Object[]{this, new Boolean(z)});
        } else {
            this.enableOatMonitor = z;
        }
    }

    public void setEnableSoftLinkApi(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8376f5c", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSoftLinkApi = z;
        }
    }

    public void setEnableSymbolicLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aa84dc", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSymbolicLink = z;
        }
    }

    public void setEnableVFSClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9adec9e", new Object[]{this, new Boolean(z)});
        } else {
            this.enableVFSClear = z;
        }
    }

    public void setEnableZcacheClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e35550d", new Object[]{this, new Boolean(z)});
        } else {
            this.enableZcacheClear = z;
        }
    }

    public void setExceptFileSuffixes(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ddad8e", new Object[]{this, list});
        } else {
            this.exceptFileSuffixes = list;
        }
    }

    public void setExpiredFilePathList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94f227a", new Object[]{this, list});
        } else {
            this.expiredFilePathList = list;
        }
    }

    public void setExternalCacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b03315", new Object[]{this, new Boolean(z)});
        } else {
            this.externalCacheEnable = z;
        }
    }

    public void setExternalFileEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd7261", new Object[]{this, new Boolean(z)});
        } else {
            this.externalFileEnable = z;
        }
    }

    public void setFileLastModifiedThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6b4e8f", new Object[]{this, new Long(j)});
        } else {
            this.fileLastModifiedThreshold = j;
        }
    }

    public void setFullCacheClearDir(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272afb09", new Object[]{this, list});
        } else {
            this.fullCacheClearDir = list;
        }
    }

    public void setFullCacheClearSilenceTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc5c9cb", new Object[]{this, new Long(j)});
        } else {
            this.fullCacheClearSilenceTime = j;
        }
    }

    public void setHashSampleRate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786c456b", new Object[]{this, str});
        } else {
            this.hashSampleRate = str;
        }
    }

    public void setHugeBizDirSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c88b5a", new Object[]{this, new Long(j)});
        } else {
            this.hugeBizDirSizeThreshold = j;
        }
    }

    public void setHugeFileSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67ae11c", new Object[]{this, new Long(j)});
        } else {
            this.hugeFileSizeThreshold = j;
        }
    }

    public void setInnerCacheDifferEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19078d8a", new Object[]{this, new Boolean(z)});
        } else {
            this.innerCacheDifferEnable = z;
        }
    }

    public void setInnerCacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3ed1dc", new Object[]{this, new Boolean(z)});
        } else {
            this.innerCacheEnable = z;
        }
    }

    public void setIoLifeCycleMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51b7072", new Object[]{this, new Boolean(z)});
        } else {
            this.ioLifeCycleMonitorEnable = z;
        }
    }

    public void setIoPeriodMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1c86b9", new Object[]{this, new Boolean(z)});
        } else {
            this.ioPeriodMonitorEnable = z;
        }
    }

    public void setIoPeriodMonitorInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8700b4e7", new Object[]{this, new Long(j)});
        } else {
            this.ioPeriodMonitorInterval = j;
        }
    }

    public void setIoSetupMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628008e5", new Object[]{this, new Boolean(z)});
        } else {
            this.ioSetupMonitorEnable = z;
        }
    }

    public void setLargeFileSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baea81e8", new Object[]{this, new Long(j)});
        } else {
            this.largeFileSizeThreshold = j;
        }
    }

    public void setLibsFileEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2977383e", new Object[]{this, new Boolean(z)});
        } else {
            this.libsFileEnable = z;
        }
    }

    public void setMatchBasedDataList(List<MatchBasedData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76153df0", new Object[]{this, list});
        } else {
            this.matchBasedDataList = list;
        }
    }

    public void setMaxDeepLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e450dea6", new Object[]{this, new Integer(i)});
        } else {
            this.maxDeepLevel = i;
        }
    }

    public void setMaxFilesSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1027986", new Object[]{this, new Integer(i)});
        } else {
            this.maxFilesSize = i;
        }
    }

    public void setMaxReportSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedbe2e6", new Object[]{this, new Long(j)});
        } else {
            this.maxReportSize = j;
        }
    }

    public void setNewInstallThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca974cf", new Object[]{this, new Long(j)});
        } else {
            this.newInstallThreshold = j;
        }
    }

    public void setOccupationSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b419220", new Object[]{this, new Long(j)});
        } else {
            this.occupationSizeThreshold = j;
        }
    }

    public void setQuotaClean(List<BizTaskData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9ca4ab", new Object[]{this, list});
        } else {
            this.quotaClean = list;
        }
    }

    public void setQuotaSizeMap(Map<String, List<BizQuotaData>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d664a679", new Object[]{this, map});
        } else {
            this.quotaSizeMap = map;
        }
    }

    public void setSilenceTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9928b551", new Object[]{this, new Long(j)});
        } else {
            this.silenceTime = j;
        }
    }

    public void setSizeIncreaseThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be25bfd7", new Object[]{this, new Long(j)});
        } else {
            this.sizeIncreaseThreshold = j;
        }
    }

    public void setSoftLinkCheckMaxDepth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656a6b3b", new Object[]{this, new Integer(i)});
        } else {
            this.softLinkCheckMaxDepth = i;
        }
    }

    public void setSoftLinkDir(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def286df", new Object[]{this, list});
        } else {
            this.softLinkDir = list;
        }
    }

    public void setSoftLinkExcludeBrand(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b4eab", new Object[]{this, list});
        } else {
            this.softLinkExcludeBrand = list;
        }
    }

    public void setSpFileSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3ecbce", new Object[]{this, new Long(j)});
        } else {
            this.spFileSizeThreshold = j;
        }
    }

    public void setTrackEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0219c1", new Object[]{this, new Boolean(z)});
        } else {
            this.trackEnable = z;
        }
    }
}
