package com.taobao.themis.taobao.edtionswitcher;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEditionSwitcherAdapter;
import kotlin.Metadata;
import tb.a3w;
import tb.n78;
import tb.t1c;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/taobao/edtionswitcher/EditionSwitcherAdapter;", "Lcom/taobao/themis/kernel/adapter/IEditionSwitcherAdapter;", "()V", "queryCurrentVersionInfo", "Lcom/alibaba/fastjson/JSONObject;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class EditionSwitcherAdapter implements IEditionSwitcherAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249441);
        t2o.a(839909466);
    }

    @Override // com.taobao.themis.kernel.adapter.IEditionSwitcherAdapter
    public JSONObject queryCurrentVersionInfo() {
        a3w queryCurrentVersionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c90fe7c", new Object[]{this});
        }
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar == null || (queryCurrentVersionInfo = t1cVar.queryCurrentVersionInfo()) == null) {
            return null;
        }
        return queryCurrentVersionInfo.g();
    }
}
