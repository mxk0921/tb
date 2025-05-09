package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FlowOutConfigData implements Serializable {
    @JSONField(name = "androidActions")
    public String[] androidActions;
    @JSONField(name = "blockTip")
    public String blockTip;
    @JSONField(name = "floutEnable")
    public boolean floutEnable;
    @JSONField(name = "floutIdEnable")
    public boolean floutIdEnable;
    @JSONField(name = "floutIdList")
    public List<FloutIdListBean> floutIdList;
    @JSONField(name = "floutIdWhiteList")
    public String[] floutIdWhiteList;
    @JSONField(name = "floutWhiteList")
    public List<FloutWhiteListBean> floutWhiteList;
    @JSONField(name = "systemActions")
    public String[] systemActions;

    static {
        t2o.a(744489101);
    }
}
