package com.alibaba.android.ultron.engine.template;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TemplateInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String templateId;
    private String url;
    private String version;

    static {
        t2o.a(157286467);
    }

    public TemplateInfo() {
    }

    public String getTemplateId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a67390ae", new Object[]{this});
        }
        return this.templateId;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        String str = this.version;
        if (str != null) {
            return str;
        }
        return "0";
    }

    public void setTemplateId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee80c88", new Object[]{this, str});
        } else {
            this.templateId = str;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateInfo{version='" + this.version + "', templateId='" + this.templateId + "', url='" + this.url + "'}";
    }

    public TemplateInfo(String str, String str2, String str3) {
        this.version = str2;
        this.templateId = str;
        this.url = str3;
    }
}
