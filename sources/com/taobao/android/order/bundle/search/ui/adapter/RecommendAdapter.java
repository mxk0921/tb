package com.taobao.android.order.bundle.search.ui.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.common.OrderAdapter;
import com.taobao.android.order.bundle.search.factory.RecommendHolderFactory;
import java.util.List;
import tb.ka4;
import tb.stg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RecommendAdapter extends OrderAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mItemTypeCont = RecommendHolderFactory.RecommendViewHolderType.values().length;

    static {
        t2o.a(713031878);
    }

    public RecommendAdapter(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(RecommendAdapter recommendAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/ui/adapter/RecommendAdapter");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<ka4> list = this.mDatas;
        if (list == null || i < 0 || i >= list.size()) {
            return -1;
        }
        return RecommendHolderFactory.b(this.mDatas.get(i).getClass());
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        stg stgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            stgVar = RecommendHolderFactory.a(this.mAct, this.mDatas.get(i).getClass());
            if (!(stgVar == null || (view = stgVar.c()) == null)) {
                view.setTag(stgVar);
            }
        } else {
            stgVar = view.getTag() instanceof stg ? (stg) view.getTag() : null;
        }
        if (stgVar == null || view == null) {
            return new View(this.mAct);
        }
        stgVar.d(this.mDatas.get(i));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
        }
        return this.mItemTypeCont;
    }
}
