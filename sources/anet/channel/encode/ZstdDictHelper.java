package anet.channel.encode;

import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.encode.ZstdResponseHelper;
import anet.channel.statist.LaunchLoadZstdObject;
import anet.channel.statist.ZstdLinkStatistic;
import anet.channel.strategy.dispatch.DispatchZstdDictEvent;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ZstdDictHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.ZstdDictHelper";
    public static LruCache<String, byte[]> zstdDcitLruCache = null;
    public static HashMap<String, ZstdAttributes> zstdAttributesMap = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LruCache<K, V> extends LinkedHashMap<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long dictSumLen = 0;

        static {
            t2o.a(607125620);
        }

        public LruCache() {
            super(AwcnConfig.getZstdDictMaxCount(), 0.75f, true);
        }

        public static /* synthetic */ Object ipc$super(LruCache lruCache, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/encode/ZstdDictHelper$LruCache");
        }

        public ZstdDictOverMaxLenType getOverMaxLenType(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ZstdDictOverMaxLenType) ipChange.ipc$dispatch("e92e2828", new Object[]{this, new Long(j), str});
            }
            if (j > 0) {
                if (j > AwcnConfig.getZstdPerDictMaxLength()) {
                    ALog.e(ZstdDictHelper.TAG, "[zstd-d] getOverMaxLenType, dictLen=" + j + " > " + AwcnConfig.getZstdPerDictMaxLength(), str, new Object[0]);
                    return ZstdDictOverMaxLenType.OVER_MAX_PRE_LEN;
                }
                long j2 = this.dictSumLen + j;
                if (j2 > AwcnConfig.getZstdDictMaxLength()) {
                    ALog.e(ZstdDictHelper.TAG, "[zstd-d] getOverMaxLenType, sumLen=" + j2 + " > " + AwcnConfig.getZstdDictMaxLength(), str, new Object[0]);
                    return ZstdDictOverMaxLenType.OVER_MAX_SUM_LEN;
                }
                this.dictSumLen += j;
            }
            return ZstdDictOverMaxLenType.NO_OVER_MAX_LEN;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > AwcnConfig.getZstdDictMaxCount()) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum ZstdDictOverMaxLenType {
        NO_OVER_MAX_LEN,
        OVER_MAX_PRE_LEN,
        OVER_MAX_SUM_LEN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ZstdDictOverMaxLenType zstdDictOverMaxLenType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/encode/ZstdDictHelper$ZstdDictOverMaxLenType");
        }

        public static ZstdDictOverMaxLenType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ZstdDictOverMaxLenType) ipChange.ipc$dispatch("a07a6aef", new Object[]{str});
            }
            return (ZstdDictOverMaxLenType) Enum.valueOf(ZstdDictOverMaxLenType.class, str);
        }
    }

    static {
        t2o.a(607125619);
    }

    public static synchronized boolean forceRemove(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("73efda6e", new Object[]{str, str2})).booleanValue();
            }
            return FileHelper.removeFile(str, str2, true);
        }
    }

    public static synchronized byte[] getDictByUrlKey(String str, String str2, String str3) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("157d5885", new Object[]{str, str2, str3});
            } else if (str2 == null) {
                ALog.e(TAG, "[zstd-d] getDictByUrlKey dictKey null!", str3, new Object[0]);
                return null;
            } else {
                if (zstdDcitLruCache == null) {
                    zstdDcitLruCache = new LruCache<>();
                }
                byte[] bArr = zstdDcitLruCache.get(str2);
                if (bArr == null) {
                    File file = FileHelper.getFile(str3, FileHelper.DEFAULT_PATH, str2, FileHelper.ZSTD_TAG);
                    if (file != null && file.exists()) {
                        ALog.e(TAG, "[zstd-d] getDictByUrlKey file=" + file.getName(), str3, new Object[0]);
                        LaunchLoadZstdObject launchLoadZstdObject = new LaunchLoadZstdObject("load_dict");
                        bArr = FileHelper.readFileToByteArray(launchLoadZstdObject, str3, file, FileHelper.ZSTD_TAG);
                        launchLoadZstdObject.dictFile = str;
                        AppMonitor.getInstance().commitStat(launchLoadZstdObject);
                    }
                    if (bArr == null) {
                        removeZstdAttributes(str3, str);
                        removeDictLruCache(str3, str2);
                        FileHelper.updateConfigFile(str3);
                        ALog.e(TAG, "[zstd-d] getDictByUrlKey file null", str3, new Object[0]);
                    }
                }
                return bArr;
            }
        }
    }

    public static synchronized String getDictKeyByZstdAttributes(String str, ZstdAttributes zstdAttributes, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e47a6ea6", new Object[]{str, zstdAttributes, str2});
            } else if (zstdAttributes == null) {
                ALog.e(TAG, "[zstd-d] getDictKeyByZstdAttributes zstdAttributes null!", str2, new Object[0]);
                return null;
            } else {
                removeExpired(str, str2);
                if (!zstdAttributes.isExpired(str, str2) && !zstdAttributes.isFileExpired()) {
                    String dictKey = zstdAttributes.getDictKey();
                    if (dictKey != null && !dictKey.isEmpty()) {
                        return dictKey;
                    }
                    ALog.e(TAG, "[zstd-d] getDictKeyByZstdAttributes dictKey null!", str2, new Object[0]);
                    return null;
                }
                ALog.e(TAG, "[zstd-d] getDictKeyByZstdAttributes zstdAttributes isExpired!", str2, "isFileExpired", Boolean.valueOf(zstdAttributes.isFileExpired()));
                return null;
            }
        }
    }

    public static synchronized List<String> getUrlKeyByDictKey(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("4fd49a0", new Object[]{str, str2});
            }
            if (str != null && !str.isEmpty()) {
                loadFile(str2);
                HashMap<String, ZstdAttributes> hashMap = zstdAttributesMap;
                if (hashMap != null && !hashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, ZstdAttributes> entry : zstdAttributesMap.entrySet()) {
                        String key = entry.getKey();
                        ZstdAttributes zstdAttributes = zstdAttributesMap.get(key);
                        if (zstdAttributes != null && str.equalsIgnoreCase(zstdAttributes.getDictKey())) {
                            arrayList.add(key);
                        }
                    }
                    return arrayList;
                }
                ALog.e(TAG, "[zstd-d] getUrlKeyByDictKey zstdAttributesMap null! dictKey=".concat(str), str2, new Object[0]);
                return null;
            }
            ALog.e(TAG, "[zstd-d] getUrlKeyByDictKey dictKey null", str2, new Object[0]);
            return null;
        }
    }

    public static synchronized ZstdAttributes getZstdAttributesByUrlKey(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ZstdAttributes) ipChange.ipc$dispatch("2606d3b3", new Object[]{str, str2});
            }
            if (str != null && !str.isEmpty()) {
                loadFile(str2);
                HashMap<String, ZstdAttributes> hashMap = zstdAttributesMap;
                if (hashMap != null && !hashMap.isEmpty()) {
                    ZstdAttributes zstdAttributes = zstdAttributesMap.get(str);
                    if (zstdAttributes != null) {
                        return zstdAttributes;
                    }
                    ALog.e(TAG, "[zstd-d] getZstdAttributesByUrlKey zstdAttributes null! urlKey=".concat(str), str2, new Object[0]);
                    return null;
                }
                ALog.e(TAG, "[zstd-d] getZstdAttributesByUrlKey zstdAttributesMap null! urlKey=".concat(str), str2, new Object[0]);
                return null;
            }
            ALog.e(TAG, "[zstd-d] getZstdAttributesByUrlKey urlKey null!", str2, new Object[0]);
            return null;
        }
    }

    public static synchronized void loadFile(String str) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac1893", new Object[]{str});
                return;
            }
            HashMap<String, ZstdAttributes> hashMap = zstdAttributesMap;
            if (hashMap == null || hashMap.isEmpty()) {
                zstdAttributesMap = (HashMap) FileHelper.loadFile(str, FileHelper.getFile(str, FileHelper.DEFAULT_CONFIG_PATH, FileHelper.DEFAULT_CONFIG, FileHelper.ZSTD_TAG), FileHelper.ZSTD_TAG);
            }
        }
    }

    public static synchronized void loadZstdAttributesMap() {
        Iterator<Map.Entry<String, ZstdAttributes>> it;
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66e20cdd", new Object[0]);
                return;
            }
            HashMap<String, ZstdAttributes> hashMap = zstdAttributesMap;
            if (hashMap != null) {
                if (hashMap.isEmpty()) {
                }
            }
            File file = FileHelper.getFile("init_load", FileHelper.DEFAULT_CONFIG_PATH, FileHelper.DEFAULT_CONFIG, FileHelper.ZSTD_TAG);
            LaunchLoadZstdObject launchLoadZstdObject = new LaunchLoadZstdObject("init_load");
            HashMap<String, ZstdAttributes> hashMap2 = (HashMap) FileHelper.loadFile(launchLoadZstdObject, "init_load", file, FileHelper.ZSTD_TAG);
            zstdAttributesMap = hashMap2;
            if (hashMap2 == null) {
                ALog.e(TAG, "[zstd-d] loadZstdAttributesMap zstdAttributesMap is null!", null, new Object[0]);
                return;
            }
            while (hashMap2.entrySet().iterator().hasNext()) {
                launchLoadZstdObject.indexList += "[" + it.next().getKey() + "]";
            }
            launchLoadZstdObject.indexList += "-[" + launchLoadZstdObject.flag + "]";
            AppMonitor.getInstance().commitStat(launchLoadZstdObject);
        }
    }

    public static synchronized void removeDictLruCache(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b0b02a8", new Object[]{str, str2});
                return;
            }
            if (str2 != null && !str2.isEmpty()) {
                LruCache<String, byte[]> lruCache = zstdDcitLruCache;
                if (lruCache != null && !lruCache.isEmpty()) {
                    byte[] bArr = zstdDcitLruCache.get(str2);
                    if (bArr != null && bArr.length > 0) {
                        zstdDcitLruCache.dictSumLen -= bArr.length;
                    }
                    zstdDcitLruCache.remove(str2);
                }
                ALog.e(TAG, "[zstd-d] removeDictLruCache! dictKey=".concat(str2), str, new Object[0]);
                return;
            }
            ALog.e(TAG, "[zstd-d] removeDictLruCache null!", str, new Object[0]);
        }
    }

    public static synchronized void removeExpired(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d02dd71c", new Object[]{str, str2});
            } else {
                FileHelper.removeFile(str, str2, false);
            }
        }
    }

    public static synchronized void removeZstdAttributes(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfb4855f", new Object[]{str, str2});
                return;
            }
            if (str2 != null && !str2.isEmpty()) {
                HashMap<String, ZstdAttributes> hashMap = zstdAttributesMap;
                if (hashMap != null && !hashMap.isEmpty()) {
                    zstdAttributesMap.remove(str2);
                }
                ALog.e(TAG, "[zstd-d] removeZstdAttributes! urlKey=".concat(str2), str, new Object[0]);
                return;
            }
            ALog.e(TAG, "[zstd-d] removeZstdAttributes null!", str, new Object[0]);
        }
    }

    public static DispatchZstdDictEvent getDispatchZstdDictEvent(String str, boolean z, String str2, String str3, String str4, String str5) {
        ZstdAttributes zstdAttributesByUrlKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DispatchZstdDictEvent) ipChange.ipc$dispatch("af59e09c", new Object[]{str, new Boolean(z), str2, str3, str4, str5});
        }
        if (!(str4 == null || (zstdAttributesByUrlKey = getZstdAttributesByUrlKey(str, str5)) == null || zstdAttributesByUrlKey.isCanUpdate())) {
            zstdAttributesByUrlKey.setAbandon(true);
            ALog.e(TAG, "[zstd-d] dict using, not can update, set dict abandon", str5, new Object[0]);
        }
        boolean equalsIgnoreCase = "zstd-d".equalsIgnoreCase(str2);
        if (str3 == null && str4 == null && !equalsIgnoreCase) {
            return null;
        }
        return new DispatchZstdDictEvent(z, str, str2, str3, str4);
    }

    public static synchronized void updateMatchPath(ZstdResponseHelper.UseAsDictionary useAsDictionary, String str, String str2) {
        ZstdAttributes zstdAttributesByUrlKey;
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2144168e", new Object[]{useAsDictionary, str, str2});
                return;
            }
            if (!(useAsDictionary == null || useAsDictionary.matchPath == null || (zstdAttributesByUrlKey = getZstdAttributesByUrlKey(str, str2)) == null)) {
                zstdAttributesByUrlKey.matchPath = useAsDictionary.matchPath;
                ALog.e(TAG, "[zstd-d] updateMatchPath! urlKey=" + str, str2, "matchPath", zstdAttributesByUrlKey.matchPath);
            }
        }
    }

    public static synchronized void updateZstdDictFail(String str, String str2) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba3a3601", new Object[]{str, str2});
                return;
            }
            ZstdAttributes zstdAttributesByUrlKey = getZstdAttributesByUrlKey(str, str2);
            if (zstdAttributesByUrlKey == null) {
                ALog.e(TAG, "[zstd-d] updateZstdDictFail zstdAttributes null! urlKey=" + str, str2, new Object[0]);
                return;
            }
            long j = zstdAttributesByUrlKey.zstdDictFailCount + 1;
            zstdAttributesByUrlKey.zstdDictFailCount = j;
            if (j > AwcnConfig.getZstdDictFailCount()) {
                ALog.e(TAG, "[zstd-d] updateZstdDictFail ! force remove dict file! zstdDictFailCount=" + zstdAttributesByUrlKey.zstdDictFailCount, str2, "urlKey", str);
                forceRemove(str, str2);
            }
            if (zstdAttributesByUrlKey.zstdDictFailStartTime == -1 || System.currentTimeMillis() - zstdAttributesByUrlKey.zstdDictFailStartTime > AwcnConfig.getZstdDictFailIntervalTime()) {
                zstdAttributesByUrlKey.zstdDictFailStartTime = System.currentTimeMillis();
                zstdAttributesByUrlKey.zstdDictFailCount = 1L;
                ALog.e(TAG, "[zstd-d] updateZstdDictFail ! zstdDictFailTime > " + AwcnConfig.getZstdDictFailIntervalTime(), str2, "urlKey", str);
            }
        }
    }

    public static synchronized boolean isAbandon(String str, String str2, String str3) {
        boolean z = true;
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce1a0554", new Object[]{str, str2, str3})).booleanValue();
            }
            if (str2 != null && !str2.isEmpty()) {
                HashMap<String, ZstdAttributes> hashMap = zstdAttributesMap;
                if (hashMap != null && !hashMap.isEmpty()) {
                    Iterator<Map.Entry<String, ZstdAttributes>> it = zstdAttributesMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        Map.Entry<String, ZstdAttributes> next = it.next();
                        ZstdAttributes value = next.getValue();
                        String key = next.getKey();
                        if (value != null && !str.equalsIgnoreCase(key) && str2.equalsIgnoreCase(value.getDictKey()) && value.isAbandon()) {
                            ALog.e(TAG, "[zstd-d] isAbandon, abandon! have key=" + key + " abandon true! ", str3, "urlKey", str, "dictKey", str2);
                            break;
                        }
                    }
                    return z;
                }
                ALog.e(TAG, "[zstd-d] isAbandon, curZstdAttributes  or zstdAttributesMap is null , ", str3, "urlKey", str);
                return false;
            }
            ALog.e(TAG, "[zstd-d] isAbandon, dictKey is null , ", str3, "urlKey", str);
            return false;
        }
    }

    public static synchronized boolean isCanUpdate(String str, String str2) {
        HashMap<String, ZstdAttributes> hashMap;
        boolean z = true;
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("274b71ce", new Object[]{str, str2})).booleanValue();
            }
            ZstdAttributes zstdAttributesByUrlKey = getZstdAttributesByUrlKey(str, str2);
            if (!(zstdAttributesByUrlKey == null || (hashMap = zstdAttributesMap) == null || hashMap.isEmpty())) {
                if (System.currentTimeMillis() - zstdAttributesByUrlKey.getTime() < AwcnConfig.getZstdDictProtectUpdateTime()) {
                    ALog.e(TAG, "[zstd-d] isCanUpdate, not can update! this file is protection period! ", str2, "urlKey", str, "protectUpdateTime", Long.valueOf(AwcnConfig.getZstdDictProtectUpdateTime()));
                    return false;
                }
                String dictKey = zstdAttributesByUrlKey.getDictKey();
                if (dictKey != null && !dictKey.isEmpty()) {
                    Iterator<Map.Entry<String, ZstdAttributes>> it = zstdAttributesMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, ZstdAttributes> next = it.next();
                        ZstdAttributes value = next.getValue();
                        String key = next.getKey();
                        if (value != null && !str.equalsIgnoreCase(key) && dictKey.equalsIgnoreCase(value.getDictKey()) && !value.isCanUpdate()) {
                            ALog.e(TAG, "[zstd-d] isCanUpdate, not update! have key=" + key + " isCanUpdate false! ", str2, "urlKey", str, "dictKey", dictKey);
                            z = false;
                            break;
                        }
                    }
                    return z;
                }
                ALog.e(TAG, "[zstd-d] isCanUpdate, dictKey is null , ", str2, "urlKey", str);
                return true;
            }
            ALog.e(TAG, "[zstd-d] isCanUpdate, curZstdAttributes  or zstdAttributesMap is null , ", str2, "urlKey", str);
            return true;
        }
    }

    public static synchronized void storage(String str, String str2, String str3, ZstdAttributes zstdAttributes, byte[] bArr, File file, String str4, ZstdLinkStatistic zstdLinkStatistic) {
        synchronized (ZstdDictHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a21ae737", new Object[]{str, str2, str3, zstdAttributes, bArr, file, str4, zstdLinkStatistic});
                return;
            }
            if (!(str3 == null || str3.isEmpty() || bArr == null || str == null)) {
                if (zstdDcitLruCache == null) {
                    zstdDcitLruCache = new LruCache<>();
                }
                if (zstdAttributesMap == null) {
                    HashMap<String, ZstdAttributes> hashMap = (HashMap) FileHelper.loadFile(str4, FileHelper.getFile(str4, FileHelper.DEFAULT_CONFIG_PATH, FileHelper.DEFAULT_CONFIG, FileHelper.ZSTD_TAG), FileHelper.ZSTD_TAG);
                    zstdAttributesMap = hashMap;
                    if (hashMap == null) {
                        zstdAttributesMap = new HashMap<>();
                    }
                }
                ZstdDictOverMaxLenType overMaxLenType = zstdDcitLruCache.getOverMaxLenType(bArr.length, str4);
                if (overMaxLenType == ZstdDictOverMaxLenType.OVER_MAX_PRE_LEN) {
                    zstdLinkStatistic.overMaxLenType = 1;
                    ALog.e(TAG, "[zstd-d] storageDcit getOverMaxLenType=1! dict length =" + bArr.length, str4, new Object[0]);
                } else if (overMaxLenType == ZstdDictOverMaxLenType.OVER_MAX_SUM_LEN) {
                    zstdLinkStatistic.overMaxLenType = 2;
                    ALog.e(TAG, "[zstd-d] storageDcit getOverMaxLenType=2! dict length =" + bArr.length, str4, new Object[0]);
                    if (forceRemove(str, str4)) {
                        zstdDcitLruCache.put(str3, bArr);
                        zstdAttributesMap.put(str, zstdAttributes == null ? new ZstdAttributes(str2, str3, str) : zstdAttributes);
                        FileHelper.storageFileByFileName(str4, file, str3, str);
                    }
                } else if (overMaxLenType == ZstdDictOverMaxLenType.NO_OVER_MAX_LEN) {
                    zstdLinkStatistic.overMaxLenType = 0;
                    ALog.e(TAG, "[zstd-d] storageDcit getOverMaxLenType=0! dict length =" + bArr.length, str4, new Object[0]);
                    zstdDcitLruCache.put(str3, bArr);
                    zstdAttributesMap.put(str, zstdAttributes == null ? new ZstdAttributes(str2, str3, str) : zstdAttributes);
                    FileHelper.storageFileByFileName(str4, file, str3, str);
                }
            }
        }
    }
}
