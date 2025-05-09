package com.taobao.message.message_open_api.api.data.topicsubscribe.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ExtParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String ori_id;

    static {
        t2o.a(529531044);
    }

    public String getOri_id() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1c4452f", new Object[]{this});
        }
        return this.ori_id;
    }

    public void setOri_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366e4e27", new Object[]{this, str});
        } else {
            this.ori_id = str;
        }
    }
}
