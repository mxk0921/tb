package com.alipay.mobile.common.transport.httpdns.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StrategyRequestItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f4115a;
    public String b;
    public String d;
    public String f;
    public String g;
    public int i;
    public String j;
    public final String c = TimeCalculator.PLATFORM_ANDROID;
    public int e = 4;
    public int h = 1;

    public String getClientVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("589c7882", new Object[]{this});
        }
        return this.d;
    }

    public String getConfigVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("738fbf79", new Object[]{this});
        }
        return this.g;
    }

    public int getNetType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f8f4e3b", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public String getOsType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1b0b545", new Object[]{this});
        }
        return this.c;
    }

    public int getSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("541225ae", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        return this.j;
    }

    public String getUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this});
        }
        return this.f4115a;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.b;
    }

    public int getVer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52a1fe67", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String getWsid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8c87ac", new Object[]{this});
        }
        return this.f;
    }

    public void setClientVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92799c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setConfigVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33081185", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void setNetType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a3e8c7", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void setSdkVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65099e1c", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void setTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            this.f4115a = str;
        }
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setVer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a41b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void setWsid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83ae4a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }
}
