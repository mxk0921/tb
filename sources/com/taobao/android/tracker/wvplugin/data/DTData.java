package com.taobao.android.tracker.wvplugin.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DTData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String conf;
    private String pageId;

    static {
        t2o.a(455082048);
    }

    public String getConf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c3bb9f", new Object[]{this});
        }
        return this.conf;
    }

    public String getPageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.pageId;
    }

    public void setConf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632f8b7", new Object[]{this, str});
        } else {
            this.conf = str;
        }
    }

    public void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.pageId = str;
        }
    }
}
