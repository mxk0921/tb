package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.jq6;
import tb.t2o;
import tb.th5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class AbstractGoodsRecyclerAdapter<DataType> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699358);
    }

    public static /* synthetic */ Object ipc$super(AbstractGoodsRecyclerAdapter abstractGoodsRecyclerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/adapter/AbstractGoodsRecyclerAdapter");
    }

    public abstract th5 M(int i);

    public abstract List<DataType> N();

    public abstract void O(jq6 jq6Var);

    public abstract boolean P(boolean z);

    public abstract void Q(String str);

    public abstract void destroy();
}
