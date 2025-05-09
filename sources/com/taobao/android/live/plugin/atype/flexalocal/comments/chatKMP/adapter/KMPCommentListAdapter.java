package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import tb.epf;
import tb.fkx;
import tb.fzf;
import tb.gnk;
import tb.nof;
import tb.o3s;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class KMPCommentListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<fzf> f8415a = new ArrayList();
    public final ux9 b;
    public final TBLiveDataModel c;
    public nof d;

    static {
        t2o.a(295698623);
    }

    public KMPCommentListAdapter(ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        this.b = ux9Var;
        this.c = tBLiveDataModel;
    }

    public static /* synthetic */ Object ipc$super(KMPCommentListAdapter kMPCommentListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/adapter/KMPCommentListAdapter");
    }

    public void M(fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d38283", new Object[]{this, fzfVar});
            return;
        }
        List<fzf> list = this.f8415a;
        if (list != null) {
            if (((ArrayList) list).size() >= 200) {
                ((ArrayList) this.f8415a).remove(0);
                notifyItemRemoved(0);
            }
            int itemCount = getItemCount();
            ((ArrayList) this.f8415a).add(fzfVar);
            notifyItemInserted(itemCount);
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        List<fzf> list = this.f8415a;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
            this.f8415a = null;
        }
    }

    public final fzf O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzf) ipChange.ipc$dispatch("1a574628", new Object[]{this, new Integer(i)});
        }
        List<fzf> list = this.f8415a;
        if (list == null || list.isEmpty() || i < 0 || i >= this.f8415a.size()) {
            return null;
        }
        return this.f8415a.get(i);
    }

    public void P() {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4d6eb8", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.c.mVideoInfo;
        if (!(gnk.a().g(videoInfo) || videoInfo == null || (accountInfo = videoInfo.broadCaster) == null)) {
            accountInfo.follow = true;
        }
        for (int i = 0; i < ((ArrayList) this.f8415a).size(); i++) {
            if (((fzf) ((ArrayList) this.f8415a).get(i)).b()) {
                notifyItemChanged(i);
            }
        }
    }

    public void Q(nof nofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecda6a3", new Object[]{this, nofVar});
        } else {
            this.d = nofVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<fzf> list = this.f8415a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        fzf O = O(i);
        if (O != null) {
            return epf.b(O);
        }
        return epf.KMP_NORMAL_TXT;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        try {
            ((BaseItemViewHolder) viewHolder).b0((fzf) ((ArrayList) this.f8415a).get(i), this.c);
        } catch (Throwable th) {
            viewHolder.setIsRecyclable(false);
            viewHolder.itemView.setVisibility(8);
            o3s.b("KMPCommentListAdapter", fkx.i(th));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        try {
            BaseItemViewHolder a2 = epf.a(viewGroup, i, this.b);
            a2.f0(this.d);
            return a2;
        } catch (Throwable unused) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            return new BaseItemViewHolder(this, view, this.b) { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.adapter.KMPCommentListAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == -815397012) {
                        super.b0((fzf) objArr[0], (TBLiveDataModel) objArr[1]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/adapter/KMPCommentListAdapter$1");
                }

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder
                public void b0(fzf fzfVar, TBLiveDataModel tBLiveDataModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
                    } else {
                        super.b0(fzfVar, tBLiveDataModel);
                    }
                }
            };
        }
    }
}
