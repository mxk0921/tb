package com.alibaba.ariver.kernel.api.extension.bridge;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BridgeDSL {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CMD = "cmd";
    public static final String EVENT = "event";
    public static final String INVOKE = "invoke";
    public static final String NAME = "name";
    public static final String NAME_SPACE = "namespace";
    public static final String TYPE = "type";
    public String cmd;
    public String name;
    public String namespace;
    public String type;

    public BridgeDSL(String str, String str2, String str3, String str4) {
        this.cmd = str;
        this.name = str2;
        this.namespace = str3;
        this.type = str4;
    }

    public String toJSONString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
        }
        if (TextUtils.equals("invoke", this.type)) {
            return "{'namespace':'" + this.namespace + "','name':'" + this.name + "','cmd':'" + this.cmd + "','type':'" + this.type + "'}";
        } else if (TextUtils.equals("event", this.type)) {
            return "{'namespace':'" + this.namespace + "','name':'" + this.name + "','type':'" + this.type + "'}";
        } else {
            RVLogger.e("Register DSL error: Invalid type [" + this.type + "]");
            return "";
        }
    }

    public BridgeDSL(String str, String str2, String str3) {
        this.name = str;
        this.namespace = str2;
        this.type = str3;
        this.cmd = "";
    }
}
