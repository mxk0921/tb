package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Code implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2694892259626406011L;
    private Map<String, String> ext;
    private int moduleToken;

    static {
        t2o.a(789577783);
    }

    public Map<String, String> getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this});
        }
        return this.ext;
    }

    public int getModuleToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769b5eb1", new Object[]{this})).intValue();
        }
        return this.moduleToken;
    }

    public void setExt(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
        } else {
            this.ext = map;
        }
    }

    public void setModuleToken(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8111", new Object[]{this, new Integer(i)});
        } else {
            this.moduleToken = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Code [moduleToken=" + this.moduleToken + ", ext=" + this.ext + "]";
    }
}
