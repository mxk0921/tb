package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import tb.t2o;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResponseContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String html;
    private int htmlLength;
    private String strategyCache;
    private String url;
    private boolean enable = false;
    private String rule = "";
    private String version = "0";
    private long expiredTime = 0;
    private FccStorageType storageType = FccStorageType.CACHE;
    private boolean noStorageCache = false;
    private int priority = 0;

    static {
        t2o.a(989856024);
    }

    public static long getDefaultExpiredTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5a9ad82", new Object[0])).longValue();
        }
        return System.currentTimeMillis() + (vpw.commonConfig.q2 * RemoteMessageConst.DEFAULT_TTL * 1000);
    }

    public long getExpiredTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da9b90d7", new Object[]{this})).longValue();
        }
        return this.expiredTime;
    }

    public String getHtml() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4adcd78", new Object[]{this});
        }
        String str = this.html;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int getHtmlLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97213361", new Object[]{this})).intValue();
        }
        return this.htmlLength;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    public String getRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b8aac7", new Object[]{this});
        }
        String str = this.rule;
        return str == null ? "" : str;
    }

    public FccStorageType getStorageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FccStorageType) ipChange.ipc$dispatch("966c6459", new Object[]{this});
        }
        return this.storageType;
    }

    public String getStrategyCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53966080", new Object[]{this});
        }
        return this.strategyCache;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        if (this.html == null) {
            return "";
        }
        return this.url;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        String str = this.version;
        if (str == null) {
            return "0";
        }
        return str;
    }

    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return this.enable;
    }

    public boolean isExpired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() > this.expiredTime) {
            return true;
        }
        return false;
    }

    public boolean isHtmlEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a117ae3", new Object[]{this})).booleanValue();
        }
        if (getHtmlLength() == 0) {
            return true;
        }
        return false;
    }

    public boolean isNoStorageCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbed5d7d", new Object[]{this})).booleanValue();
        }
        return this.noStorageCache;
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public void setExpiredTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd3974d", new Object[]{this, new Long(j)});
        } else {
            this.expiredTime = j;
        }
    }

    public void setHtml(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658b21fe", new Object[]{this, str});
        } else {
            this.html = str;
        }
    }

    public void setHtmlLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83dc46c9", new Object[]{this, new Integer(i)});
        } else {
            this.htmlLength = i;
        }
    }

    public void setNoStorageCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50fda43", new Object[]{this, new Boolean(z)});
        } else {
            this.noStorageCache = z;
        }
    }

    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.priority = i;
    }

    public void setRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dbee8f", new Object[]{this, str});
        } else {
            this.rule = str;
        }
    }

    public void setStorageType(FccStorageType fccStorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23061c3", new Object[]{this, fccStorageType});
        } else {
            this.storageType = fccStorageType;
        }
    }

    public void setStrategyCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d5915e", new Object[]{this, str});
        } else {
            this.strategyCache = str;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }
}
