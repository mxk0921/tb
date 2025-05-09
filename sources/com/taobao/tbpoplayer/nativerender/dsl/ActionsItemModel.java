package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ActionsItemModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "content")
    public List<ActionModel> content;
    @JSONField(name = "countTire")
    public Boolean countTire;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "neverShow")
    public String neverShow;
    @JSONField(name = "startActions")
    public List<String> startActions;
    @JSONField(name = "type")
    public String type = "click";
    @JSONField(name = "userResult")
    public String userResult;

    static {
        t2o.a(790626434);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<ActionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.type) || (list = this.content) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
