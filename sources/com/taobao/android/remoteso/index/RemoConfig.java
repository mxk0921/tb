package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String afterAction;
    private int pv;
    private String uri;

    public String getAfterAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cc0a27d", new Object[]{this});
        }
        return this.afterAction;
    }

    public int getPv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2aca4276", new Object[]{this})).intValue();
        }
        return this.pv;
    }

    public String getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4afdd683", new Object[]{this});
        }
        return this.uri;
    }

    public void setAfterAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330adc01", new Object[]{this, str});
        } else {
            this.afterAction = str;
        }
    }

    public void setPv(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1efce54", new Object[]{this, new Integer(i)});
        } else {
            this.pv = i;
        }
    }

    public void setUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349dcbb", new Object[]{this, str});
        } else {
            this.uri = str;
        }
    }
}
