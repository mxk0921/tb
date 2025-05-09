package com.taobao.message.message_open_api.api.data.topicsubscribe.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SubScribeTopicList {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String errCode;
    private ExtParams extParams;
    private String status;
    private String topicId;

    static {
        t2o.a(529531046);
    }

    public String getErrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49f20fbd", new Object[]{this});
        }
        return this.errCode;
    }

    public ExtParams getExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtParams) ipChange.ipc$dispatch("3da0c347", new Object[]{this});
        }
        return this.extParams;
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.status;
    }

    public String getTopicId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2be37d05", new Object[]{this});
        }
        return this.topicId;
    }

    public void setErrCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5370c1", new Object[]{this, str});
        } else {
            this.errCode = str;
        }
    }

    public void setExtParams(ExtParams extParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8637a6f3", new Object[]{this, extParams});
        } else {
            this.extParams = extParams;
        }
    }

    public void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status = str;
        }
    }

    public void setTopicId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578fac79", new Object[]{this, str});
        } else {
            this.topicId = str;
        }
    }
}
