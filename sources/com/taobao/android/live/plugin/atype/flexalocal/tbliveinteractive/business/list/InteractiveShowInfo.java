package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractiveShowInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionUrl;
    public String extraParams;
    public String iconAction;
    public String iconViewStyle;
    public boolean isNeedShow = false;
    public boolean isNotifying = false;
    public String notificationViewParams;
    public String viewParams;

    static {
        t2o.a(295699848);
        t2o.a(806355930);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveShowInfo{isNeedShow=" + this.isNeedShow + ", isNotifying=" + this.isNotifying + ", notificationViewParams=" + this.notificationViewParams + ", viewParams='" + this.viewParams + "', extraParams=" + this.extraParams + ", iconAction='" + this.iconAction + "', actionUrl='" + this.actionUrl + "', iconViewStyle='" + this.iconViewStyle + "'}";
    }
}
