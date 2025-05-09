package com.taobao.homepage.messiah.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbHRLogModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mActionType;
    private Map<String, Object> mArgs;
    private String mLogType;
    private String mScene;
    private String mTimeStamp;

    static {
        t2o.a(447741994);
    }

    public TbHRLogModel() {
    }

    public String getActionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65717033", new Object[]{this});
        }
        return this.mActionType;
    }

    public Map<String, Object> getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.mArgs;
    }

    public String getLogType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f75f91", new Object[]{this});
        }
        return this.mLogType;
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.mScene;
    }

    public String getTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b946cb9", new Object[]{this});
        }
        return this.mTimeStamp;
    }

    public void setActionType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa61da3", new Object[]{this, str});
        } else {
            this.mActionType = str;
        }
    }

    public void setArgs(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.mArgs = map;
        }
    }

    public void setLogType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf81b6d", new Object[]{this, str});
        } else {
            this.mLogType = str;
        }
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.mScene = str;
        }
    }

    public void setTimeStamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a936e645", new Object[]{this, str});
        } else {
            this.mTimeStamp = str;
        }
    }

    public TbHRLogModel(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.mLogType = str;
        this.mScene = str2;
        this.mTimeStamp = str3;
        this.mActionType = str4;
        this.mArgs = map;
    }
}
