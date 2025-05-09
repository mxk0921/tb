package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ListenEventModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "eventName")
    public List<String> eventName;
    @JSONField(name = "sourceName")
    public String sourceName;

    static {
        t2o.a(790626451);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.sourceName) || (list = this.eventName) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
