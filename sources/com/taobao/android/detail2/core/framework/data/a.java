package com.taobao.android.detail2.core.framework.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import java.util.List;
import tb.t2o;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements DetailDataManager.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321766);
        t2o.a(352321773);
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean a(boolean z, String str, int i, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4dbdb90", new Object[]{this, new Boolean(z), str, new Integer(i), x3wVar})).booleanValue();
        }
        return x3wVar.N();
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public void b(boolean z, String str, x3w x3wVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1736fd2", new Object[]{this, new Boolean(z), str, x3wVar, new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean c(boolean z, int i, JSONObject jSONObject, List<x3w> list, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309da830", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean d(boolean z, String str, int i, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ac07a4", new Object[]{this, new Boolean(z), str, new Integer(i), x3wVar})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public void e(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc90181d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }
}
