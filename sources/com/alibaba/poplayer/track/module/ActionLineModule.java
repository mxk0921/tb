package com.alibaba.poplayer.track.module;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ActionLineModule implements Serializable {
    public List<ActionItem> actions = new ArrayList();
    public List<ActionItem> animations = new ArrayList();
    public boolean countTire;
    public String stateId;
    public int stateIndex;
    public String stateVer;
    public String triggerType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ActionExecuteItem implements Serializable {
        public String act;
        public String exp;

        static {
            t2o.a(625999994);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ActionItem implements Serializable {
        public String componentId;
        public String exception;
        public List<ActionExecuteItem> executes;
        public String id;

        static {
            t2o.a(625999995);
        }
    }

    static {
        t2o.a(625999993);
    }

    public ActionLineModule(String str, String str2, int i) {
        this.stateId = str;
        this.stateVer = str2;
        this.stateIndex = i;
    }
}
