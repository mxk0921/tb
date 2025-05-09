package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StateBaseModel extends ComponentBaseModel {
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    @JSONField(name = "appendTraceInfo")
    public JSONObject appendTraceInfo;
    @JSONField(name = "children")
    public List<JSONObject> children;
    @JSONField(name = "condition")
    public ConditionModel condition;
    @JSONField(name = "event")
    public EventModel event;
    @JSONField(name = "focusComponent")
    public String focusComponent;
    @JSONField(name = "hasMask")
    public boolean hasMask;
    @JSONField(name = "layout")
    public String layout;
    @JSONField(name = "maskOpacity")
    public float maskOpacity = 0.7f;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "offsetBottom")
    public String offsetBottom;
    @JSONField(name = "offsetLeft")
    public String offsetLeft;
    @JSONField(name = "offsetRight")
    public String offsetRight;
    @JSONField(name = "offsetTop")
    public String offsetTop;
    @JSONField(name = "pageAnimation")
    public List<AnimationModel> pageAnimation;
    @JSONField(name = "style")
    public StyleModel style;
    @JSONField(name = "triggerActions")
    public List<TriggerActionsModel> triggerActions;

    static {
        t2o.a(790626455);
    }
}
