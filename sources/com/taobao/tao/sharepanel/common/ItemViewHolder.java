package com.taobao.tao.sharepanel.common;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ma4;
import tb.rnf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ItemViewHolder<T extends ma4> extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final rnf f12757a;

    static {
        t2o.a(666894548);
    }

    public ItemViewHolder(rnf rnfVar, boolean z, JSONObject jSONObject) {
        super(rnfVar.b(z, jSONObject));
        this.f12757a = rnfVar;
    }

    public static /* synthetic */ Object ipc$super(ItemViewHolder itemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/common/ItemViewHolder");
    }

    public void b0(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30315917", new Object[]{this, t, new Integer(i)});
            return;
        }
        rnf rnfVar = this.f12757a;
        if (rnfVar != null) {
            rnfVar.a(t, i);
        }
    }
}
