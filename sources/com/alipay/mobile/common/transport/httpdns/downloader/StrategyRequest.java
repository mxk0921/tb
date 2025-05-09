package com.alipay.mobile.common.transport.httpdns.downloader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StrategyRequest extends StrategyRequestItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> k;
    public String l;
    public String m;
    public String n;
    public int o = 4;

    public StrategyRequest() {
    }

    public static /* synthetic */ Object ipc$super(StrategyRequest strategyRequest, String str, Object... objArr) {
        if (str.hashCode() == -1270622049) {
            super.setUid((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/httpdns/downloader/StrategyRequest");
    }

    public String getDg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2798a20", new Object[]{this});
        }
        return this.n;
    }

    public List<String> getDomains() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14e2f247", new Object[]{this});
        }
        return this.k;
    }

    public int getIpType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public String getLat_lng() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8938fe0a", new Object[]{this});
        }
        return this.m;
    }

    public String getS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f2c7b5c", new Object[]{this});
        }
        return this.l;
    }

    public void setDg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1450d56", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void setDomains(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4d7865", new Object[]{this, list});
        } else {
            this.k = list;
        }
    }

    public void setIpType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bc0d39", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void setLat_lng(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ea4c14", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void setS(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2525cb", new Object[]{this, new Integer(i)});
        } else {
            this.l = String.valueOf(i);
        }
    }

    public StrategyRequest(List<String> list) {
        this.k = list;
    }

    public StrategyRequest(String str, List<String> list) {
        super.setUid(str);
        this.k = list;
    }
}
