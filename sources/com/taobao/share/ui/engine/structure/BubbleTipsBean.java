package com.taobao.share.ui.engine.structure;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BubbleTipsBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String index;
    private String text;

    static {
        t2o.a(667942968);
    }

    public String getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a3a295d", new Object[]{this});
        }
        return this.index;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    public void setIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e39821", new Object[]{this, str});
        } else {
            this.index = str;
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }
}
