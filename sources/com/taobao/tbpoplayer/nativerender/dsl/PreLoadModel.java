package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreLoadModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ERTestUrl")
    public String ERTestUrl;
    @JSONField(name = "containerType")
    public String containerType = "h5";
    @JSONField(name = "enable")
    public boolean enable;
    @JSONField(name = "ignoreStatusCheck")
    public boolean ignoreStatusCheck;
    @JSONField(name = "url")
    public String url;

    static {
        t2o.a(790626454);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!this.enable) {
            return false;
        }
        if (!TextUtils.isEmpty(this.url) || !TextUtils.isEmpty(this.ERTestUrl)) {
            return true;
        }
        return false;
    }
}
