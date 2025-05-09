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
public class StateModel extends StateBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "versions")
    public List<StateVersionModel> versions;

    static {
        t2o.a(790626456);
    }

    public static /* synthetic */ Object ipc$super(StateModel stateModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/dsl/StateModel");
    }

    public boolean isMultiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d782b7b4", new Object[]{this})).booleanValue();
        }
        List<StateVersionModel> list = this.versions;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<StateVersionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.layout) || TextUtils.isEmpty(this.id)) {
            return false;
        }
        List<JSONObject> list2 = this.children;
        if ((list2 == null || list2.isEmpty()) && ((list = this.versions) == null || list.isEmpty())) {
            return false;
        }
        return true;
    }
}
