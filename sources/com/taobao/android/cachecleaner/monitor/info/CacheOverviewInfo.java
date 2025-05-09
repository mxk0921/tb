package com.taobao.android.cachecleaner.monitor.info;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CacheOverviewInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long apkInstallSize;
    private long apkSize;
    private long appDataSize;
    private long availableSize;
    private long externalCacheSize;
    private long externalFilesSize;
    private long innerCacheSize;
    private long libsSize;
    private long oatSize;
    private long totalSize;
    private long totalUsedSize;
    private long updateTime;
    public boolean isNewInstall = false;
    public long installTime = -1;
    private boolean enableCacheClean = false;
    private boolean enableQuota = false;

    static {
        t2o.a(737149049);
    }

    public long getApkInstallSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abeadef1", new Object[]{this})).longValue();
        }
        return this.apkInstallSize;
    }

    public long getApkSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("537dc502", new Object[]{this})).longValue();
        }
        return this.apkSize;
    }

    public long getAppDataSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a630fc51", new Object[]{this})).longValue();
        }
        return this.appDataSize;
    }

    public long getAvailableSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4b192f", new Object[]{this})).longValue();
        }
        return this.availableSize;
    }

    public boolean getEnableCacheClean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8f0fdcb", new Object[]{this})).booleanValue();
        }
        return this.enableCacheClean;
    }

    public boolean getEnableQuota() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e168a", new Object[]{this})).booleanValue();
        }
        return this.enableQuota;
    }

    public long getExternalCacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62cf4ddd", new Object[]{this})).longValue();
        }
        return this.externalCacheSize;
    }

    public long getExternalFilesSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6d193d2", new Object[]{this})).longValue();
        }
        return this.externalFilesSize;
    }

    public long getInnerCacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f56acde", new Object[]{this})).longValue();
        }
        return this.innerCacheSize;
    }

    public long getInstallTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc80394d", new Object[]{this})).longValue();
        }
        return this.installTime;
    }

    public boolean getIsNewInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec310e26", new Object[]{this})).booleanValue();
        }
        return this.isNewInstall;
    }

    public long getLibsSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d0b320", new Object[]{this})).longValue();
        }
        return this.libsSize;
    }

    public long getOatSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e19d1c8", new Object[]{this})).longValue();
        }
        return this.oatSize;
    }

    public long getTotalSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f15cf3aa", new Object[]{this})).longValue();
        }
        return this.totalSize;
    }

    public long getTotalUsedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cd9af87", new Object[]{this})).longValue();
        }
        return this.totalUsedSize;
    }

    public long getUpdateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a69139a7", new Object[]{this})).longValue();
        }
        return this.updateTime;
    }

    public void setApkInstallSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb636db", new Object[]{this, new Long(j)});
        } else {
            this.apkInstallSize = j;
        }
    }

    public void setApkSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52844e82", new Object[]{this, new Long(j)});
        } else {
            this.apkSize = j;
        }
    }

    public void setAppDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3eb9b13", new Object[]{this, new Long(j)});
        } else {
            this.appDataSize = j;
        }
    }

    public void setAvailableSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64406f5", new Object[]{this, new Long(j)});
        } else {
            this.availableSize = j;
        }
    }

    public void setEnableCacheClean(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5422061", new Object[]{this, new Boolean(z)});
        } else {
            this.enableCacheClean = z;
        }
    }

    public void setEnableQuota(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a2021a", new Object[]{this, new Boolean(z)});
        } else {
            this.enableQuota = z;
        }
    }

    public void setExternalCacheSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295e8207", new Object[]{this, new Long(j)});
        } else {
            this.externalCacheSize = j;
        }
    }

    public void setExternalFilesSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a4fab2", new Object[]{this, new Long(j)});
        } else {
            this.externalFilesSize = j;
        }
    }

    public void setInnerCacheSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4268e", new Object[]{this, new Long(j)});
        } else {
            this.innerCacheSize = j;
        }
    }

    public void setInstallTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3783fd97", new Object[]{this, new Long(j)});
        } else {
            this.installTime = j;
        }
    }

    public void setIsNewInstall(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75877566", new Object[]{this, new Boolean(z)});
        } else {
            this.isNewInstall = z;
        }
    }

    public void setLibsSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661c8f8c", new Object[]{this, new Long(j)});
        } else {
            this.libsSize = j;
        }
    }

    public void setOatSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b69da7c", new Object[]{this, new Long(j)});
        } else {
            this.oatSize = j;
        }
    }

    public void setTotalSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23861da", new Object[]{this, new Long(j)});
        } else {
            this.totalSize = j;
        }
    }

    public void setTotalUsedSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5883b9d", new Object[]{this, new Long(j)});
        } else {
            this.totalUsedSize = j;
        }
    }

    public void setUpdateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626d0ce5", new Object[]{this, new Long(j)});
        } else {
            this.updateTime = j;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BasicInfo{updateTime=" + this.updateTime + ", innerCacheSize=" + this.innerCacheSize + ", externalCacheSize=" + this.externalCacheSize + ", externalFilesSize=" + this.externalFilesSize + ", totalUsedSize=" + this.totalUsedSize + ", availableSize=" + this.availableSize + ", totalSize=" + this.totalSize + '}';
    }
}
