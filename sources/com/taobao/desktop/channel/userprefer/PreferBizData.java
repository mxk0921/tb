package com.taobao.desktop.channel.userprefer;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PreferBizData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bizClassName;
    private String bizName;
    private String defaultValue;

    static {
        t2o.a(435159126);
    }

    public String getBizClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e24eeff3", new Object[]{this});
        }
        return this.bizClassName;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.bizName;
    }

    public String getDefaultValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4fa8493", new Object[]{this});
        }
        return this.defaultValue;
    }

    public void setBizClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82d82e3", new Object[]{this, str});
        } else {
            this.bizClassName = str;
        }
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public void setDefaultValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af48243", new Object[]{this, str});
        } else {
            this.defaultValue = str;
        }
    }
}
