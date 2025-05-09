package com.taobao.message.lab.comfrm.support.list;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleListWidgetInstance extends AbsListWidgetInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919851);
    }

    public static /* synthetic */ Object ipc$super(SimpleListWidgetInstance simpleListWidgetInstance, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SimpleListWidgetInstance");
    }

    @Override // com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance
    public boolean enableSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b40b6d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance
    public boolean isEmpty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2184aeea", new Object[]{this, jSONObject})).booleanValue();
        }
        if (getViewAdapterCount("content") == 0) {
            return true;
        }
        return false;
    }
}
