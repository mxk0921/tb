package com.taobao.message.biz.contacts;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UnreadInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private int tipNumber;
    private int tipType;

    static {
        t2o.a(529530892);
    }

    public int getTipNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c092688", new Object[]{this})).intValue();
        }
        return this.tipNumber;
    }

    public int getTipType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cff8739", new Object[]{this})).intValue();
        }
        return this.tipType;
    }

    public void setTipNumber(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd12871a", new Object[]{this, new Integer(i)});
        } else {
            this.tipNumber = i;
        }
    }

    public void setTipType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993acf89", new Object[]{this, new Integer(i)});
        } else {
            this.tipType = i;
        }
    }
}
