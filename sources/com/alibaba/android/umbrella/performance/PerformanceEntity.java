package com.alibaba.android.umbrella.performance;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PerformanceEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> args;
    public String bizName;
    public Map<String, Long> otherMeasure;
    public long registerTime;
    public String serviceId;

    public PerformanceEntity(String str, String str2, List<String> list) {
        this(str, str2, list, SystemClock.uptimeMillis());
    }

    public void addArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a824d139", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.args.put(str, str2);
        }
    }

    public void addRecordPoint(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8d5035", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str)) {
            this.otherMeasure.put(str, Long.valueOf(j));
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }

    public PerformanceEntity(String str, String str2, List<String> list, long j) {
        this.bizName = str;
        this.serviceId = str2;
        this.otherMeasure = new HashMap();
        this.args = new HashMap();
        this.registerTime = j;
    }

    public void addArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a255240", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            this.args.putAll(map);
        }
    }
}
