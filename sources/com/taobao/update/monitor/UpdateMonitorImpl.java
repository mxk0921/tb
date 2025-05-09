package com.taobao.update.monitor;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.ekv;
import tb.jkv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UpdateMonitorImpl implements ekv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String PERF_KEY = "update_unique_monit";
    private Map<String, Set<UpdateAlarmData>> updateAlarmDatas = new HashMap();
    private jkv updateStatMonitor = new jkv();

    static {
        t2o.a(955252740);
        t2o.a(946864137);
    }

    @Override // tb.ekv
    public void add(String str, boolean z, String str2, String str3, String str4, String str5, String str6, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e13994", new Object[]{this, str, new Boolean(z), str2, str3, str4, str5, str6, new Long(j), new Long(j2)});
            return;
        }
        UpdateAlarmData updateAlarmData = new UpdateAlarmData();
        updateAlarmData.success = z;
        if (str2 == null) {
            str2 = "";
        }
        updateAlarmData.arg = str2;
        if (str3 == null) {
            str3 = "0";
        }
        updateAlarmData.errorCode = str3;
        if (str4 == null) {
            str4 = "";
        }
        updateAlarmData.errorMsg = str4;
        if (str5 == null) {
            str5 = "";
        }
        updateAlarmData.toVersion = str5;
        updateAlarmData.fromVersion = "";
        if (str6 == null) {
            str6 = "";
        }
        updateAlarmData.url = str6;
        updateAlarmData.elapsed_time = j2;
        updateAlarmData.disk_size = String.valueOf(j);
        add(str, updateAlarmData);
    }

    @Override // tb.ekv
    public synchronized void commit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d9088", new Object[]{this, str});
            return;
        }
        clear();
        Set<UpdateAlarmData> set = this.updateAlarmDatas.get(str);
        if (set != null && !set.isEmpty()) {
            for (UpdateAlarmData updateAlarmData : set) {
                this.updateStatMonitor.stat(str, updateAlarmData);
            }
            this.updateAlarmDatas.remove(str);
        }
    }

    @Override // tb.ekv
    public void commitCount(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5653f8a1", new Object[]{this, str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    @Override // tb.ekv
    public void commitFail(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{this, str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4);
        }
    }

    @Override // tb.ekv
    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    private void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            UpdateRuntime.getContext().getSharedPreferences("update_point", 0).edit().clear().commit();
        }
    }

    private void commitToDisk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107c6fd6", new Object[]{this});
        } else if (this.updateAlarmDatas.containsKey("ddefficiency")) {
            SharedPreferences sharedPreferences = UpdateRuntime.getContext().getSharedPreferences("update_point", 0);
            String string = sharedPreferences.getString("dd_update", "");
            if (TextUtils.isEmpty(string)) {
                sharedPreferences.edit().putString("dd_update", JSON.toJSONString(this.updateAlarmDatas.get("ddefficiency"))).commit();
                return;
            }
            List<UpdateAlarmData> parseArray = JSON.parseArray(string, UpdateAlarmData.class);
            if (parseArray != null && parseArray.size() > 0) {
                for (UpdateAlarmData updateAlarmData : parseArray) {
                    if (!this.updateAlarmDatas.get("ddefficiency").contains(updateAlarmData)) {
                        this.updateAlarmDatas.get("ddefficiency").add(updateAlarmData);
                    }
                }
            }
            sharedPreferences.edit().putString("dd_update", JSON.toJSONString(this.updateAlarmDatas.get("ddefficiency"))).commit();
        }
    }

    @Override // tb.ekv
    public void add(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fae2de", new Object[]{this, str, new Boolean(z), str2, str3, str4, str5, str6, str7});
            return;
        }
        UpdateAlarmData updateAlarmData = new UpdateAlarmData();
        updateAlarmData.success = z;
        if (str2 == null) {
            str2 = "";
        }
        updateAlarmData.arg = str2;
        if (str3 == null) {
            str3 = "";
        }
        updateAlarmData.errorCode = str3;
        if (str4 == null) {
            str4 = "";
        }
        updateAlarmData.errorMsg = str4;
        if (str6 == null) {
            str6 = "";
        }
        updateAlarmData.toVersion = str6;
        if (str5 == null) {
            str5 = "";
        }
        updateAlarmData.fromVersion = str5;
        if (str7 == null) {
            str7 = "";
        }
        updateAlarmData.url = str7;
        add(str, updateAlarmData);
    }

    private synchronized void add(String str, UpdateAlarmData updateAlarmData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ed70e5", new Object[]{this, str, updateAlarmData});
            return;
        }
        if (!this.updateAlarmDatas.containsKey(str)) {
            this.updateAlarmDatas.put(str, new HashSet());
        }
        this.updateAlarmDatas.get(str).add(updateAlarmData);
        commitToDisk();
    }
}
