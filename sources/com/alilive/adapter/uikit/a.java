package com.alilive.adapter.uikit;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import tb.fq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.alilive.adapter.uikit.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface AbstractC0194a {
    }

    boolean addFeature(fq0<? super RecyclerView> fq0Var);

    void addFooterView(View view);

    void addHeaderView(View view);

    void clearFeatures();

    RecyclerView.ViewHolder findViewHolderForAdapterPosition(int i);

    int getHeaderViewsCount();

    int getItemCount();

    void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener);

    void setOnItemClickListener(AbstractC0194a aVar);
}
