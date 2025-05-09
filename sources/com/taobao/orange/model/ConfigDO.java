package com.taobao.orange.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dq3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConfigDO implements Serializable, dq3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ConfigDO";
    private static final long serialVersionUID = 6057693726984967889L;
    public String appKey;
    public String appVersion;
    public CandidateDO candidate;
    private String changeVersion;
    public Map<String, String> content;
    public String contentMd5;
    public String createTime;
    public String id;
    public String loadLevel;
    public String name;
    public String resourceId;
    public JSONObject scenes;
    public String type;
    public String version;
    private int configStatus = 0;
    public transient boolean persisted = true;
    public volatile transient boolean monitored = false;
    public boolean isCritical = false;
    public AtomicBoolean isExpired = new AtomicBoolean(false);

    static {
        t2o.a(613417083);
        t2o.a(613417081);
    }

    public String getChangeVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b837ee7", new Object[]{this});
        }
        return this.changeVersion;
    }

    public int getConfigStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("844e27c4", new Object[]{this})).intValue();
        }
        return this.configStatus;
    }

    public String getCurVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c0bd4b", new Object[]{this});
        }
        CandidateDO candidateDO = this.candidate;
        if (candidateDO == null) {
            return this.version;
        }
        return candidateDO.version;
    }

    public void setChangeVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398c3fd7", new Object[]{this, str});
        } else {
            this.changeVersion = str;
        }
    }

    public void setConfigStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10d51c6", new Object[]{this, new Integer(i)});
        } else {
            this.configStatus = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConfigDO{name:'" + this.name + "', appVersion:'" + this.appVersion + "', verison:'" + this.version + "', type:'" + this.type + "'}";
    }

    @Override // tb.dq3
    public boolean checkValid() {
        Map<String, String> map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.appKey) || TextUtils.isEmpty(this.appVersion) || TextUtils.isEmpty(this.id) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.resourceId) || TextUtils.isEmpty(this.type) || TextUtils.isEmpty(this.loadLevel) || TextUtils.isEmpty(this.version) || (map = this.content) == null || map.isEmpty()) {
            OLog.w(TAG, "lack param", new Object[0]);
            return false;
        }
        if ((!"*".equals(this.appVersion) && !a.j.equals(this.appVersion)) || !a.h.equals(this.appKey)) {
            z = false;
        }
        if (!z) {
            OLog.w(TAG, "invaild", new Object[0]);
        }
        return z;
    }
}
