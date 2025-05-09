package com.taobao.tbreachflow.shortcuts.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ModuleVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ContentMapVO contentMap;
    private RefreshVO refreshPolicy;

    public ContentMapVO getContentMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentMapVO) ipChange.ipc$dispatch("25c2c73b", new Object[]{this});
        }
        return this.contentMap;
    }

    public RefreshVO getRefreshPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshVO) ipChange.ipc$dispatch("8cbe6ce9", new Object[]{this});
        }
        return this.refreshPolicy;
    }

    public void setContentMap(ContentMapVO contentMapVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64e64b1", new Object[]{this, contentMapVO});
        } else {
            this.contentMap = contentMapVO;
        }
    }

    public void setRefreshPolicy(RefreshVO refreshVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d82749", new Object[]{this, refreshVO});
        } else {
            this.refreshPolicy = refreshVO;
        }
    }
}
