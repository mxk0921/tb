package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IDMComponentsFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<IDMComponent> mComponents = new ArrayList();
    private final List<RecyclerViewHolder> mHolders = new ArrayList();

    static {
        t2o.a(295699208);
    }

    public IDMComponentsFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(IDMComponentsFrameLayout iDMComponentsFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/goods/list/IDMComponentsFrameLayout");
    }

    public void addIDMComponent(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7785901", new Object[]{this, iDMComponent});
        } else {
            this.mComponents.add(iDMComponent);
        }
    }

    public void addRecyclerViewHolder(RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818a17fb", new Object[]{this, recyclerViewHolder});
        } else {
            this.mHolders.add(recyclerViewHolder);
        }
    }

    public void clearIDMComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b99922", new Object[]{this});
        } else {
            this.mComponents.clear();
        }
    }

    public void clearRecyclerViewHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c32821d", new Object[]{this});
        } else {
            this.mHolders.clear();
        }
    }

    public List<IDMComponent> getComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this});
        }
        return this.mComponents;
    }

    public List<RecyclerViewHolder> getRecyclerViewHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9afefcd3", new Object[]{this});
        }
        return this.mHolders;
    }
}
