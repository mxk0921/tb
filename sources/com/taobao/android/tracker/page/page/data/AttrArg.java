package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AttrArg implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String attrName;
    private String commitKey;
    private boolean recursive;

    static {
        t2o.a(455082025);
    }

    public String getAttrName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e57c18a7", new Object[]{this});
        }
        return this.attrName;
    }

    public String getCommitKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec368b47", new Object[]{this});
        }
        return this.commitKey;
    }

    public boolean isRecursive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cbfd6b3", new Object[]{this})).booleanValue();
        }
        return this.recursive;
    }

    public void setAttrName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e456af", new Object[]{this, str});
        } else {
            this.attrName = str;
        }
    }

    public void setCommitKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd89977", new Object[]{this, str});
        } else {
            this.commitKey = str;
        }
    }

    public void setRecursive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e5f3d", new Object[]{this, new Boolean(z)});
        } else {
            this.recursive = z;
        }
    }
}
