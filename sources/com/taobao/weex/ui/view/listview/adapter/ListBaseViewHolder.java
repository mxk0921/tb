package com.taobao.weex.ui.view.listview.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.list.IWXHeader;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ListBaseViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isRecycled;
    private WeakReference<WXComponent> mComponent;
    private int mViewType;

    static {
        t2o.a(985661765);
    }

    public ListBaseViewHolder(WXComponent wXComponent, int i) {
        super(wXComponent.getHostView());
        this.mViewType = i;
        this.mComponent = new WeakReference<>(wXComponent);
        this.isRecycled = wXComponent.canRecycled();
    }

    public static /* synthetic */ Object ipc$super(ListBaseViewHolder listBaseViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/listview/adapter/ListBaseViewHolder");
    }

    public void bindData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
            return;
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference != null && weakReference.get() != null) {
            this.mComponent.get().bindData(wXComponent);
            this.isRecycled = false;
        }
    }

    public boolean canRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c236802c", new Object[]{this})).booleanValue();
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference == null || weakReference.get() == null) {
            return true;
        }
        return this.mComponent.get().canRecycled();
    }

    public WXComponent getComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("bfd859ed", new Object[]{this});
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.itemView;
    }

    public int getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
        }
        return this.mViewType;
    }

    public boolean isFullSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2c40ce", new Object[]{this})).booleanValue();
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference == null || !(weakReference.get() instanceof IWXHeader)) {
            return false;
        }
        return true;
    }

    public boolean isRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d9d686", new Object[]{this})).booleanValue();
        }
        return this.isRecycled;
    }

    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference != null && weakReference.get() != null) {
            this.mComponent.get().recycled();
            this.isRecycled = true;
        }
    }

    public void setComponentUsing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159d9244", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference != null && weakReference.get() != null) {
            this.mComponent.get().setUsing(z);
        }
    }

    public ListBaseViewHolder(WXComponent wXComponent, int i, boolean z) {
        this(wXComponent, i);
        this.isRecycled = this.isRecycled || z;
    }

    public ListBaseViewHolder(View view, int i) {
        super(view);
        this.mViewType = i;
    }
}
