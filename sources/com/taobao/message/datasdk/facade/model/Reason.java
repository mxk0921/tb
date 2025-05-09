package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Reason {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object content;
    private String name;
    private String subName;

    static {
        t2o.a(529530918);
    }

    public Reason(String str, Object obj) {
        this.name = str;
        this.content = obj;
    }

    public Object getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff29b928", new Object[]{this});
        }
        return this.content;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public String getSubName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("857a5964", new Object[]{this});
        }
        return this.subName;
    }

    public void setContent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5288b1a", new Object[]{this, obj});
        } else {
            this.content = obj;
        }
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public void setSubName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d45bfa", new Object[]{this, str});
        } else {
            this.subName = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Reason{name='" + this.name + "', subName='" + this.subName + "', content=" + this.content + '}';
    }
}
