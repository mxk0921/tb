package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonitorLoggerModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_LEVEL_DEBUG = "DEBUG";
    public static final String LOG_LEVEL_FATAL = "FATAL";
    public static final int LOG_LEVEL_HIGH = 1;
    public static final String LOG_LEVEL_INFO = "INFO";
    public static final int LOG_LEVEL_LOW = 3;
    public static final int LOG_LEVEL_MEDIUM = 2;

    /* renamed from: a  reason: collision with root package name */
    public String f4020a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f = 2;
    public Map<String, String> g = new HashMap();

    public void addExtParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc7c8", new Object[]{this, str, str2});
        } else {
            this.g.put(str, str2);
        }
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.g;
    }

    public Map<String, String> getExtPramas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e211cee7", new Object[]{this});
        }
        return getExtParams();
    }

    public int getLoggerLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e4fc18", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String getParam1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b57edaff", new Object[]{this});
        }
        return this.c;
    }

    public String getParam2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c04959e", new Object[]{this});
        }
        return this.d;
    }

    public String getParam3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c28a503d", new Object[]{this});
        }
        return this.e;
    }

    public String getSubType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d565815", new Object[]{this});
        }
        return this.f4020a;
    }

    public void removeExtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4459221", new Object[]{this, str});
        } else {
            this.g.remove(str);
        }
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public void setLoggerLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b7908a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void setParam1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a067257", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setParam2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4380b98", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setParam3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e69a4d9", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void setSubType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94783369", new Object[]{this, str});
        } else {
            this.f4020a = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getSubType());
        stringBuffer.append(",");
        stringBuffer.append(getParam1());
        stringBuffer.append(",");
        stringBuffer.append(getParam2());
        stringBuffer.append(",");
        stringBuffer.append(getParam3());
        stringBuffer.append(",");
        for (String str : getExtPramas().keySet()) {
            stringBuffer.append(str + "=" + getExtPramas().get(str) + "^");
        }
        return stringBuffer.toString();
    }
}
