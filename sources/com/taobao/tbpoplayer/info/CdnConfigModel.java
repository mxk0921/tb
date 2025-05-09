package com.taobao.tbpoplayer.info;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CdnConfigModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ac")
    public Map<String, String> configs;
    @JSONField(name = "sc")
    public String uriMap;
    @JSONField(name = "version")
    public String ver;

    static {
        t2o.a(790626364);
        t2o.a(625999896);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.ver)) {
            return false;
        }
        String str = this.uriMap;
        if ((str == null || this.configs == null) && (str != null || this.configs != null)) {
            return false;
        }
        return true;
    }
}
