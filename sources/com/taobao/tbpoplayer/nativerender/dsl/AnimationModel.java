package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.List;
import tb.t2o;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AnimationModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int costTimes = 0;
    public int curLoopTimes = 0;
    @JSONField(name = "endBehavior")
    public String endBehavior;
    @JSONField(name = xpc.RECORD_EXECUTE)
    public List<Execute> execute;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "listenTimes")
    public long listenTimes;
    @JSONField(name = "loop")
    public Boolean loop;
    @JSONField(name = "loopTimes")
    public Long loopTimes;
    @JSONField(name = "pivotX")
    public String pivotX;
    @JSONField(name = "pivotY")
    public String pivotY;
    @JSONField(name = "preCondition")
    public ConditionModel preCondition;
    @JSONField(name = "preDelay")
    public long preDelay;
    @JSONField(name = "trigger")
    public JSONObject trigger;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Execute implements INativeModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "duration")
        public long duration;
        @JSONField(name = "object")
        public String object;
        @JSONField(name = TimeCalculator.TIMELINE_TAG)
        public List<TimeLineNode> timeline;
        @JSONField(name = "timelineMode")
        public String timelineMode;

        static {
            t2o.a(790626436);
            t2o.a(790626449);
        }

        @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
        public boolean isValid() {
            List<TimeLineNode> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.object) || (list = this.timeline) == null || list.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TimeLineNode implements INativeModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "easing")
        public String easing;
        @JSONField(name = "extra")
        public JSONObject extra;
        @JSONField(name = "fraction")
        public Float fraction;
        @JSONField(name = "value")
        public String value;

        static {
            t2o.a(790626437);
            t2o.a(790626449);
        }

        @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.value) || this.fraction == null) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(790626435);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<Execute> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.trigger == null || (list = this.execute) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
