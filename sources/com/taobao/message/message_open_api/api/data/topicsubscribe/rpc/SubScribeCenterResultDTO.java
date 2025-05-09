package com.taobao.message.message_open_api.api.data.topicsubscribe.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SubScribeCenterResultDTO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> errTopicId;
    private String retCode;
    private String retMsg;
    private List<SubScribeTopicList> subScribeTopicList;
    private Map<String, Object> subscribeConfirmResponse;
    private String toastText;

    static {
        t2o.a(529531045);
    }

    public List<String> getErrTopicId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("912d8d85", new Object[]{this});
        }
        return this.errTopicId;
    }

    public String getRetCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.retCode;
    }

    public String getRetMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this});
        }
        return this.retMsg;
    }

    public List<SubScribeTopicList> getSubScribeTopicList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60710c27", new Object[]{this});
        }
        return this.subScribeTopicList;
    }

    public Map<String, Object> getSubscribeConfirmResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc6c6b29", new Object[]{this});
        }
        return this.subscribeConfirmResponse;
    }

    public String getToastText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f2c7b", new Object[]{this});
        }
        return this.toastText;
    }

    public void setErrTopicId(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555b097f", new Object[]{this, list});
        } else {
            this.errTopicId = list;
        }
    }

    public void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public void setRetMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f591333", new Object[]{this, str});
        } else {
            this.retMsg = str;
        }
    }

    public void setSubScribeTopicList(List<SubScribeTopicList> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fec931d", new Object[]{this, list});
        } else {
            this.subScribeTopicList = list;
        }
    }

    public void setSubscribeConfirmResponse(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7d4485", new Object[]{this, map});
        } else {
            this.subscribeConfirmResponse = map;
        }
    }

    public void setToastText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed41ec3", new Object[]{this, str});
        } else {
            this.toastText = str;
        }
    }
}
