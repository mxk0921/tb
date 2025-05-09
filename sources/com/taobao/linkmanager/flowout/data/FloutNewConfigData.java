package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloutNewConfigData implements Serializable {
    public static final boolean DEFAULT_INTERRUPT_ENABLE = false;
    public static final boolean DEFAULT_SEC_CONTROL_ENABLE = false;
    public static final boolean DEFAULT_SHARE_ENABLE = true;
    @JSONField(name = "browserFloutControl")
    public FloutNewBrowserConfigData browserFloutControl;
    @JSONField(name = "floutControl")
    public Map<String, FloutNewConfigItemData> floutControl;
    @JSONField(name = "newFloutEnable")
    public boolean newFloutEnable;
    @JSONField(name = "system10HookEnable")
    public boolean system10HookEnable;
    @JSONField(name = "shareEnable")
    public boolean shareEnable = true;
    @JSONField(name = "defaultInterruptEnable")
    public boolean defaultInterruptEnable = false;
    @JSONField(name = "securityControlEnable")
    public boolean securityControlEnable = false;
    @JSONField(name = "securityControlSecs")
    public long securityControlSecs = 0;
    @JSONField(name = "securityControlLevel")
    public int securityControlLevel = 0;

    static {
        t2o.a(744489097);
    }
}
