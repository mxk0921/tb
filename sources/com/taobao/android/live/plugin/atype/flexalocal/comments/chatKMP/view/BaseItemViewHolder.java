package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.ChatRecyclerView2;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent;
import com.taobao.android.nav.Nav;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.fzf;
import tb.giv;
import tb.gq0;
import tb.iw0;
import tb.nh4;
import tb.nof;
import tb.o3s;
import tb.t2o;
import tb.t54;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8434a;
    public fzf b;
    public TBLiveDataModel c;
    public final t54 d;
    public nof e;

    static {
        t2o.a(295698688);
    }

    public BaseItemViewHolder(View view, ux9 ux9Var) {
        super(view);
        this.f8434a = view.getContext();
        this.d = (t54) ux9Var;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), iw0.a(view.getContext(), ChatRecyclerView2.recycleViewItemCornerIconPaddingWidthDP), view.getPaddingBottom());
        ViewProxy.setOnClickListener(view, this);
        ViewProxy.setOnLongClickListener(view, this);
    }

    public static View d0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20ac7b06", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.taolive_chat_item_bubble);
        if (findViewById == null) {
            return view;
        }
        return findViewById;
    }

    public static /* synthetic */ Object ipc$super(BaseItemViewHolder baseItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/BaseItemViewHolder");
    }

    public void b0(fzf fzfVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
            return;
        }
        this.b = fzfVar;
        this.c = tBLiveDataModel;
    }

    public Drawable c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("3a7335ba", new Object[]{this});
        }
        if (nh4.v()) {
            return this.itemView.getResources().getDrawable(R.drawable.taolive_comment_denoise_bg_flexalocal);
        }
        return this.itemView.getResources().getDrawable(R.drawable.taolive_comment_bg_new_flexalocal);
    }

    public int e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e76c67f", new Object[]{this})).intValue();
        }
        if (nh4.v()) {
            return gq0.g().getApplication().getResources().getColor(R.color.tao_live_white_sixty_percent);
        }
        return gq0.g().getApplication().getResources().getColor(R.color.taolive_room_chat_color6);
    }

    public void f0(nof nofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecda6a3", new Object[]{this, nofVar});
        } else {
            this.e = nofVar;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VideoInfo.AdmireInfo admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (giv.c().b()) {
            o3s.b("BaseItemViewHolder", "commentItemCLick isDianTaoApp.");
        } else {
            TaoLiveKtCommentEntity taoLiveKtCommentEntity = this.b.f19644a;
            if (taoLiveKtCommentEntity != null) {
                VideoInfo videoInfo = this.c.mVideoInfo;
                if (videoInfo == null || (admireInfo = videoInfo.admireInfo) == null) {
                    o3s.b("BaseItemViewHolder", "commentItemCLick data is null");
                } else if (!admireInfo.contributionEnabled) {
                    o3s.b("BaseItemViewHolder", "videoInfo.admireInfo.contributionEnabled is false");
                } else {
                    String guangGuangJumpUrl = taoLiveKtCommentEntity.getGuangGuangJumpUrl();
                    if (TextUtils.isEmpty(guangGuangJumpUrl)) {
                        o3s.b("BaseItemViewHolder", "GuangGuangJumpUrl is empty");
                    } else {
                        Nav.from(this.f8434a).toUri(guangGuangJumpUrl);
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        nof nofVar = this.e;
        if (nofVar != null) {
            ((NormalComponent.a) nofVar).a(view, this.b);
        }
        return true;
    }
}
