package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UploadModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String docType = "";
    private int pageNo = 1;
    private float ratio = 0.7f;

    static {
        t2o.a(245366959);
    }

    public String getDocType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab09d81d", new Object[]{this});
        }
        return this.docType;
    }

    public int getPageNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("320a6920", new Object[]{this})).intValue();
        }
        return this.pageNo;
    }

    public float getRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13ea484c", new Object[]{this})).floatValue();
        }
        return this.ratio;
    }

    public void setDocType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd34b461", new Object[]{this, str});
        } else {
            this.docType = str;
        }
    }

    public void setPageNo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a8a2ea", new Object[]{this, new Integer(i)});
        } else {
            this.pageNo = i;
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else {
            this.ratio = f;
        }
    }
}
