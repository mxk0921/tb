package com.ut.userbehavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.mqv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BehaviorRecord implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BEHAVIOR_TYPE_APPEAR = 1;
    public static final int BEHAVIOR_TYPE_DISAPPEAR = 2;
    public static final String NAME_BEHAVIOR_TYPE_APPEAR = "a";
    public static final String NAME_BEHAVIOR_TYPE_DISAPPEAR = "d";
    public static final String NAME_BEHAVIOR_TYPE_UNKNOWN = "u";
    @JSONField(name = "ts")
    private int timeStamp;
    @JSONField(name = "t")
    private String type;

    static {
        t2o.a(964689928);
    }

    public BehaviorRecord(int i) {
        this.type = "u";
        this.timeStamp = 0;
        this.type = _normalizeBehaviorType(i);
        this.timeStamp = mqv.n().m();
    }

    public int getTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0eba", new Object[]{this})).intValue();
        }
        return this.timeStamp;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    private static String _normalizeBehaviorType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efafbe9e", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "a";
        }
        if (i != 2) {
            return "u";
        }
        return "d";
    }
}
