package com.taobao.desktop.widget.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String changeWidgetId;
    public String typeId;

    static {
        t2o.a(437256292);
    }

    public String getChangeWidgetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec6a64d4", new Object[]{this});
        }
        return this.changeWidgetId;
    }

    public String getTypeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c732aee", new Object[]{this});
        }
        return this.typeId;
    }

    public void setChangeWidgetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ae5722", new Object[]{this, str});
        } else {
            this.changeWidgetId = str;
        }
    }

    public void setTypeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219c2048", new Object[]{this, str});
        } else {
            this.typeId = str;
        }
    }
}
