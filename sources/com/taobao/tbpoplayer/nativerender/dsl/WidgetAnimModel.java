package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WidgetAnimModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "imgSrcList")
    public String imgSrcList;
    @JSONField(name = Constants.Name.INTERVAL)
    public long interval;
    @JSONField(name = com.taobao.accs.common.Constants.KEY_TIMES)
    public int times;

    static {
        t2o.a(790626461);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.times <= 0 || this.interval <= 0 || !TextUtils.isEmpty(this.imgSrcList)) {
            return false;
        }
        return true;
    }
}
