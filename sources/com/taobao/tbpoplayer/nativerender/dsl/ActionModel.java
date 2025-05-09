package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ActionModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "autoClose")
    public boolean autoClose;
    @JSONField(name = "behavior")
    public String behavior;
    @JSONField(name = "content")
    public String content;
    @JSONField(name = "countTire")
    public Boolean countTire;
    @JSONField(name = "extraRequests")
    public JSONArray extraRequests;
    @JSONField(name = "fallbackActions")
    public List<String> fallbackActions;
    @JSONField(name = "fallbackNextActions")
    public List<String> fallbackNextActions;
    @JSONField(name = "fallbackToast")
    public String fallbackToast;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "neverShow")
    public boolean neverShow;
    @JSONField(name = "nextActions")
    public List<String> nextActions;
    @JSONField(name = "preCondition")
    public ConditionModel preCondition;
    @JSONField(name = "target")
    public String target;
    @JSONField(name = "type")
    public String type = "click";
    @JSONField(name = "userResult")
    public String userResult;
    @JSONField(name = "withToast")
    public String withToast;

    static {
        t2o.a(790626433);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.behavior);
    }
}
