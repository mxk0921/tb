package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StateVersionModel extends StateBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "verId")
    public String verId;

    static {
        t2o.a(790626457);
    }

    public static /* synthetic */ Object ipc$super(StateVersionModel stateVersionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/dsl/StateVersionModel");
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.verId) || TextUtils.isEmpty(this.id) || (list = this.children) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
