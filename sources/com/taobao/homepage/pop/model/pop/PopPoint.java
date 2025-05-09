package com.taobao.homepage.pop.model.pop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopPoint implements IPopPoint, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String itemBizCode;
    private String sectionBizCode;

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopPoint
    public String getItemBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb53d582", new Object[]{this});
        }
        return this.itemBizCode;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopPoint
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("275317a8", new Object[]{this});
        }
        return this.sectionBizCode;
    }

    public void setItemBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6de099c", new Object[]{this, str});
        } else {
            this.itemBizCode = str;
        }
    }

    public void setSectionBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dbfece", new Object[]{this, str});
        } else {
            this.sectionBizCode = str;
        }
    }
}
