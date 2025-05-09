package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CommentListAdapter extends RecyclerView.Adapter<MyViewHodler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class MyViewHodler extends RecyclerView.ViewHolder {
        static {
            t2o.a(779092542);
        }

        public MyViewHodler(CommentListAdapter commentListAdapter, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.comment_content_text);
        }
    }

    static {
        t2o.a(779092541);
    }

    public static /* synthetic */ Object ipc$super(CommentListAdapter commentListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/single/adapter/CommentListAdapter");
    }

    public void M(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73acc544", new Object[]{this, chatMessage});
        }
    }

    /* renamed from: N */
    public void onBindViewHolder(MyViewHodler myViewHodler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3907d6a5", new Object[]{this, myViewHodler, new Integer(i)});
        }
    }

    /* renamed from: O */
    public MyViewHodler onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MyViewHodler) ipChange.ipc$dispatch("6f663cf", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new MyViewHodler(this, LayoutInflater.from(null).inflate(R.layout.taolive_highlight_single_comment_item, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        throw null;
    }
}
