package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ConditionModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "left")
    public String left;
    @JSONField(name = x96.PATH_OPERATOR)
    public String operator;
    @JSONField(name = "right")
    public String right;

    static {
        t2o.a(790626440);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if ((!TextUtils.isEmpty(this.left) || !TextUtils.isEmpty(this.right)) && !TextUtils.isEmpty(this.operator)) {
            return true;
        }
        return false;
    }
}
