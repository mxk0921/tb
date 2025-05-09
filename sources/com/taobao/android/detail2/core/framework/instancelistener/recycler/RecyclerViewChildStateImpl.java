package com.taobao.android.detail2.core.framework.instancelistener.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import tb.cxj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecyclerViewChildStateImpl implements RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321866);
    }

    public RecyclerViewChildStateImpl(cxj cxjVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (view.getTag(327533409) != null) {
            ((VerticalAbsViewHolder) view.getTag(327533409)).h1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if (view.getTag(327533409) != null) {
            ((VerticalAbsViewHolder) view.getTag(327533409)).i1();
        }
    }
}
