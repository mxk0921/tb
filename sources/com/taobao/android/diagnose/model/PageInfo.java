package com.taobao.android.diagnose.model;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.CircularList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.idh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PageInfo implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PageInfo";
    public List<AbnormalInfo> bizError;
    public long createTime;
    public long destroyTime;
    @JSONField(serialize = false)
    private boolean isUrlChanged;
    public long lastAppearTime;
    public long lastDisappearTime;
    public List<AbnormalInfo> network;
    public List<AbnormalInfo> other;
    private Map<String, String> pageFlags;
    private String pageFragment;
    private String pageID;
    private String pageName;
    private String pageUrl;

    static {
        t2o.a(615514177);
    }

    private PageInfo() {
        this.pageID = null;
        this.pageName = null;
        this.pageFragment = null;
        this.pageUrl = null;
        this.pageFlags = null;
        this.isUrlChanged = false;
        this.bizError = null;
        this.network = null;
        this.other = null;
        this.createTime = 0L;
        this.lastAppearTime = 0L;
        this.lastDisappearTime = 0L;
        this.destroyTime = 0L;
    }

    private static String generatePageID(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2057208", new Object[]{activity});
        }
        int hashCode = activity.hashCode();
        int myPid = Process.myPid();
        return myPid + "@" + hashCode;
    }

    public synchronized void addAbnormalInfo(AbnormalInfo abnormalInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b08c33", new Object[]{this, abnormalInfo});
        } else if (abnormalInfo != null) {
            int i = abnormalInfo.type;
            if (i == 4) {
                if (this.bizError == null) {
                    this.bizError = new CircularList(20);
                }
                this.bizError.add(abnormalInfo);
            } else if (i == 12 || i == 13) {
                if (this.network == null) {
                    this.network = new CircularList(20);
                }
                this.network.add(abnormalInfo);
            } else {
                if (this.other == null) {
                    this.other = new CircularList(20);
                }
                this.other.add(abnormalInfo);
            }
        }
    }

    public void addPageFlag(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96e5877", new Object[]{this, str, str2});
            return;
        }
        if (this.pageFlags == null) {
            this.pageFlags = new ConcurrentHashMap();
        }
        this.pageFlags.put(str, str2);
    }

    public void addPageFlags(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14980127", new Object[]{this, map});
            return;
        }
        if (this.pageFlags == null) {
            this.pageFlags = new ConcurrentHashMap();
        }
        this.pageFlags.putAll(map);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.pageID, ((PageInfo) obj).pageID);
    }

    public Map<String, String> getPageFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18c107e", new Object[]{this});
        }
        return this.pageFlags;
    }

    public String getPageFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e84abda4", new Object[]{this});
        }
        return this.pageFragment;
    }

    public String getPageID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84651419", new Object[]{this}) : this.pageID;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.pageName;
    }

    public String getPageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return this.pageUrl;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.pageID;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isUrlChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57456c1a", new Object[]{this})).booleanValue();
        }
        return this.isUrlChanged;
    }

    public void removePageFlag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6554090", new Object[]{this, str});
            return;
        }
        Map<String, String> map = this.pageFlags;
        if (map != null) {
            map.remove(str);
        }
    }

    public void setPageFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ab6b52", new Object[]{this, str});
        } else {
            this.pageFragment = str;
        }
    }

    public void setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
        } else if (!TextUtils.equals(this.pageUrl, str)) {
            this.pageUrl = str;
            this.isUrlChanged = true;
        }
    }

    public void setUrlChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddbc346", new Object[]{this, new Boolean(z)});
        } else {
            this.isUrlChanged = z;
        }
    }

    public static String getPageID(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9cac1a47", new Object[]{activity}) : generatePageID(activity);
    }

    public PageInfo clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("ab5c2c60", new Object[]{this});
        }
        PageInfo pageInfo = new PageInfo();
        pageInfo.pageID = this.pageID;
        pageInfo.pageName = this.pageName;
        pageInfo.pageFragment = this.pageFragment;
        pageInfo.pageUrl = this.pageUrl;
        pageInfo.isUrlChanged = this.isUrlChanged;
        pageInfo.createTime = this.createTime;
        pageInfo.lastAppearTime = this.lastAppearTime;
        pageInfo.lastDisappearTime = this.lastDisappearTime;
        pageInfo.destroyTime = this.destroyTime;
        return pageInfo;
    }

    public PageInfo(Activity activity) {
        String pageID = getPageID(activity);
        idh.a(TAG, "PageID=" + pageID);
        this.createTime = System.currentTimeMillis();
        this.pageID = pageID;
        this.pageName = activity.getClass().getName();
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.pageUrl = intent.getDataString();
            this.isUrlChanged = true;
            return;
        }
        idh.b(TAG, "Can't get the intent!!");
    }
}
