package com.taobao.android.diagnose.scene.engine.reader;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RuleDefine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ActionDefine> actions;
    public String appVer;
    public String bizName;
    public String condition;
    public String conditionVer;
    public long expireTime;
    public int expireType;
    public String id;
    public String osVer;
    public int sampling;
    public String sceneCode;
    public String sceneRuleCode;
    public long sceneVersion;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ActionDefine {
        public String actionID;
        public int actionLimit = -1;
        public String actionData = null;
        public int sampling = 10000;

        static {
            t2o.a(615514212);
        }
    }

    static {
        t2o.a(615514211);
    }

    @JSONField(serialize = false)
    public boolean isExpire() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue();
        }
        if (this.expireType != 2 || System.currentTimeMillis() <= this.expireTime) {
            return false;
        }
        return true;
    }
}
