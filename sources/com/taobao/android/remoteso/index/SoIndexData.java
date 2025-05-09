package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.trq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SoIndexData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appVersion;
    private final Map<String, SoIndexEntry> entries = new ConcurrentHashMap();
    private final Map<String, SoFileInfo> assets = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class SoFileInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String FROM_COMPRESSED_ASSETS = "Compressed-assets";
        private static final String FROM_COMPRESSED_LIB = "Compressed-lib";
        private static final String FROM_COMPRESSED_PREFIX = "Compressed";
        private static final String FROM_REMOTE = "Remote";
        private String from;
        private String majorVersion;
        private String md5;
        private String minorVersion;
        private String uri;
        private long length = -1;
        private String storageKey = null;

        public String getFrom() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
            }
            return this.from;
        }

        public long getLength() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33609457", new Object[]{this})).longValue();
            }
            return this.length;
        }

        public String getMajorVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9ced26c4", new Object[]{this});
            }
            return this.majorVersion;
        }

        public String getMd5() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
            }
            return this.md5;
        }

        public String getMinorVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("321246c0", new Object[]{this});
            }
            return this.minorVersion;
        }

        public String getUri() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4afdd683", new Object[]{this});
            }
            return this.uri;
        }

        public boolean isAssetsUri() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb68c5ea", new Object[]{this})).booleanValue();
            }
            return FROM_COMPRESSED_ASSETS.equals(this.from);
        }

        public boolean isFromCompressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ae448a0", new Object[]{this})).booleanValue();
            }
            if (!trq.e(this.from) || !this.from.startsWith(FROM_COMPRESSED_PREFIX)) {
                return false;
            }
            return true;
        }

        public boolean isFromRemote() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4b9a58e5", new Object[]{this})).booleanValue();
            }
            return FROM_REMOTE.equals(this.from);
        }

        public boolean isLibUri() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7d82b67c", new Object[]{this})).booleanValue();
            }
            return FROM_COMPRESSED_LIB.equals(this.from);
        }

        public String provideStorageKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("59b58cb4", new Object[]{this});
            }
            if (trq.e(this.storageKey)) {
                return this.storageKey;
            }
            return this.md5;
        }

        public void setFrom(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
            } else {
                this.from = str;
            }
        }

        public void setLength(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf17e235", new Object[]{this, new Long(j)});
            } else {
                this.length = j;
            }
        }

        public void setMajorVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91562632", new Object[]{this, str});
            } else {
                this.majorVersion = str;
            }
        }

        public void setMd5(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
            } else {
                this.md5 = str;
            }
        }

        public void setMinorVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0d505b6", new Object[]{this, str});
            } else {
                this.minorVersion = str;
            }
        }

        public void setUri(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("349dcbb", new Object[]{this, str});
            } else {
                this.uri = str;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "SoFileInfo{uri='" + this.uri + "', md5='" + this.md5 + "', from='" + this.from + "', majorVersion='" + this.majorVersion + "', minorVersion='" + this.minorVersion + "', length=" + this.length + ", storageKey='" + this.storageKey + "'}";
        }

        public void updateStorageKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37b45e5e", new Object[]{this, str});
            } else {
                this.storageKey = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class SoIndexEntry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Map<String, SoFileInfo> files = new ConcurrentHashMap();
        private String version;

        public Map<String, SoFileInfo> getFiles() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("560db0fd", new Object[]{this});
            }
            return this.files;
        }

        public String getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            return this.version;
        }

        public void setVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                this.version = str;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "SoIndexEntry{files=" + this.files + ", version='" + this.version + "'}";
        }
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return this.appVersion;
    }

    public Map<String, SoFileInfo> getAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72bbe8b5", new Object[]{this});
        }
        return this.assets;
    }

    public Map<String, SoIndexEntry> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6aebbc56", new Object[]{this});
        }
        return this.entries;
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.appVersion = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SoIndexData{appVersion='" + this.appVersion + "', entries=" + this.entries.size() + ", assets.size=" + this.assets.size() + '}';
    }
}
