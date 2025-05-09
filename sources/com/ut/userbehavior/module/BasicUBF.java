package com.ut.userbehavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.bmv;
import tb.l5v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BasicUBF implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_MAX_PAGE_AMOUNT = 300;
    public static final String LOG_TYPE_BG = "bg";
    public static final String LOG_TYPE_END = "end";
    public static final String LOG_TYPE_TRUNC = "trunc";
    public static final String LOG_TYPE_UNKNOW = "unknown";
    @JSONField(name = "bt")
    private int beginTime = 0;
    @JSONField(name = "bts")
    private long beginTimeStamp = 0;
    @JSONField(name = "et")
    private int endTime = 0;
    @JSONField(name = bmv.MSGTYPE_INTERVAL)
    private Map<String, String> info;
    @JSONField(name = at.k)
    private String key;
    @JSONField(name = "lt")
    private String logType;
    @JSONField(name = "n")
    private String name;
    @JSONField(name = "p")
    private ArrayList<Page> pages;

    static {
        t2o.a(964689927);
    }

    public BasicUBF(String str, String str2) {
        this.info = null;
        this.pages = null;
        this.logType = "";
        this.key = str;
        this.name = str2;
        this.info = new HashMap();
        this.pages = new ArrayList<>();
        this.logType = "unknown";
    }

    public void addPage(Page page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bc81a8", new Object[]{this, page});
        } else if (page != null && this.pages.size() <= 300) {
            Iterator<Page> it = this.pages.iterator();
            while (it.hasNext()) {
                Page next = it.next();
                if (next != null && page.getKey().equalsIgnoreCase(next.getKey())) {
                    return;
                }
            }
            this.pages.add(page);
        }
    }

    public int getBeginTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c1f88da", new Object[]{this})).intValue();
        }
        return this.beginTime;
    }

    public long getBeginTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f11e863e", new Object[]{this})).longValue();
        }
        return this.beginTimeStamp;
    }

    public int getEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("250d18c", new Object[]{this})).intValue();
        }
        return this.endTime;
    }

    public Map<String, String> getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2a42eaa0", new Object[]{this});
        }
        return this.info;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    public String getLogType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f75f91", new Object[]{this});
        }
        return this.logType;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public ArrayList<Page> getPages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4277aaef", new Object[]{this});
        }
        return this.pages;
    }

    public void setBeginTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc86f08", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.beginTime = i;
        }
    }

    public void setBeginTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f7792e", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            this.beginTimeStamp = j;
        }
    }

    public void setEndTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e12cf96", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.endTime = i;
        }
    }

    public void setInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0bf5ee", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.info.putAll(map);
        }
    }

    public void setLogType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf81b6d", new Object[]{this, str});
        } else if (l5v.c(str)) {
            this.logType = str;
        }
    }
}
