package tb;

import com.alibaba.evo.internal.event.ExperimentWhitelistDataV5;
import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lo8 {
    @JSONField(name = "beta")
    public fo8 experimentBetaIndexData;
    @JSONField(name = "exp")
    public oo8 experimentIndexData;
    @JSONField(name = "whitelist")
    public ExperimentWhitelistDataV5 experimentWhitelistData;
    @JSONField(name = "msgCode")
    public String msgCode;
    @JSONField(name = "msgInfo")
    public String msgInfo;
    @JSONField(name = "md5")
    public String signature;
    @JSONField(name = "success")
    public boolean success = false;
    @JSONField(name = "nextAvailableTime")
    public long nextAvailableTime = -1;

    static {
        t2o.a(961544246);
    }
}
