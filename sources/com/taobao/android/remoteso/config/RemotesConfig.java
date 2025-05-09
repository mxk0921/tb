package com.taobao.android.remoteso.config;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemotesConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String uri;
    private String processType = "remote";
    private String afterAction = "PlaceholderInApk";

    public String getAfterAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cc0a27d", new Object[]{this});
        }
        return this.afterAction;
    }

    public String getProcessType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fad90fc6", new Object[]{this});
        }
        return this.processType;
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

    public void setProcessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780017d8", new Object[]{this, str});
        } else {
            this.processType = str;
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemotesConfig{uri='" + this.uri + "', processType='" + this.processType + "', afterProcessAction='" + this.afterAction + "'}";
    }
}
