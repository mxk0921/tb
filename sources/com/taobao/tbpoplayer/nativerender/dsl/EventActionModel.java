package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class EventActionModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    public int costTimes = 0;
    @JSONField(name = "eventName")
    public String eventName;
    @JSONField(name = "listenTimes")
    public long listenTimes;
    @JSONField(name = MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT)
    public List<ConditionHandleModel> onEvent;
    @JSONField(name = "sourceName")
    public String sourceName;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ConditionHandleModel implements INativeModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "action")
        public ActionModel action;
        @JSONField(name = "actions")
        public List<ActionsItemModel> actions;
        @JSONField(name = "condition")
        public ConditionModel condition;

        static {
            t2o.a(790626445);
            t2o.a(790626449);
        }

        @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(790626444);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.sourceName) || TextUtils.isEmpty(this.eventName)) {
            return false;
        }
        return true;
    }
}
