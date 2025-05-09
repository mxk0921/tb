package com.taobao.android.live.plugin.atype.flexalocal.profile;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.d9m;
import tb.gwg;
import tb.hw0;
import tb.ikr;
import tb.nh4;
import tb.pb6;
import tb.t2o;
import tb.ux9;
import tb.v2s;
import tb.vc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveAvatarAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8623a;
    public final List<LiveAvatarInfoCardResponseData.SimpleContent> b = new ArrayList();
    public boolean c;
    public String d;
    public final ux9 e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class FooterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TUrlImageView f8624a;

        static {
            t2o.a(295699553);
        }

        public FooterViewHolder(View view) {
            super(view);
            this.f8624a = (TUrlImageView) view.findViewById(R.id.personal_mini_icon_footer);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LiveAvatarViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(295699554);
        }

        public LiveAvatarViewHolder(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f8625a;
        public final /* synthetic */ DXRootView b;

        public a(RecyclerView.ViewHolder viewHolder, DXRootView dXRootView) {
            this.f8625a = viewHolder;
            this.b = dXRootView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f8625a.itemView.getLayoutParams();
            int i = this.b.getLayoutParams().width;
            if (i > layoutParams.width) {
                layoutParams.width = i;
                this.f8625a.itemView.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!TextUtils.isEmpty(LiveAvatarAdapter.M(LiveAvatarAdapter.this))) {
                v2s.o().v().b(LiveAvatarAdapter.N(LiveAvatarAdapter.this), LiveAvatarAdapter.M(LiveAvatarAdapter.this), null);
                gwg.a(LiveAvatarAdapter.O(LiveAvatarAdapter.this), LiveAvatarAdapter.P(LiveAvatarAdapter.this));
            }
        }
    }

    static {
        t2o.a(295699550);
    }

    public LiveAvatarAdapter(ux9 ux9Var, Context context) {
        this.e = ux9Var;
        this.f8623a = context;
    }

    public static /* synthetic */ String M(LiveAvatarAdapter liveAvatarAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("932ed92e", new Object[]{liveAvatarAdapter});
        }
        return liveAvatarAdapter.f;
    }

    public static /* synthetic */ Context N(LiveAvatarAdapter liveAvatarAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3e29bc9", new Object[]{liveAvatarAdapter});
        }
        return liveAvatarAdapter.f8623a;
    }

    public static /* synthetic */ ux9 O(LiveAvatarAdapter liveAvatarAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("4b66db4e", new Object[]{liveAvatarAdapter});
        }
        return liveAvatarAdapter.e;
    }

    public static /* synthetic */ String P(LiveAvatarAdapter liveAvatarAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef5d8071", new Object[]{liveAvatarAdapter});
        }
        return liveAvatarAdapter.d;
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarAdapter liveAvatarAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/profile/LiveAvatarAdapter");
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ac4a68", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public void S(List<LiveAvatarInfoCardResponseData.SimpleContent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e76ca7", new Object[]{this, list, str});
            return;
        }
        this.d = str;
        ((ArrayList) this.b).clear();
        ((ArrayList) this.b).addAll(list);
        notifyDataSetChanged();
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107ac10b", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4567d3f0", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.c) {
            return ((ArrayList) this.b).size() + 1;
        }
        return ((ArrayList) this.b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.c || i != ((ArrayList) this.b).size()) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder instanceof LiveAvatarViewHolder) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            if (vc.h(this.f8623a)) {
                layoutParams.width = pb6.d(ikr.f().e(), this.f8623a, 117.0f);
                layoutParams.height = pb6.d(ikr.f().e(), this.f8623a, 147.5f);
            } else {
                layoutParams.width = hw0.a(117.0f);
                layoutParams.height = hw0.a(147.5f);
            }
            viewHolder.itemView.setLayoutParams(layoutParams);
            DXRootView createDX = d9m.n().createDX(this.f8623a, LiveAvatarNewView.VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME2);
            if (createDX != null) {
                ViewGroup viewGroup = (ViewGroup) viewHolder.itemView;
                viewGroup.removeAllViews();
                viewGroup.addView(createDX);
                LiveAvatarInfoCardResponseData.SimpleContent simpleContent = (LiveAvatarInfoCardResponseData.SimpleContent) ((ArrayList) this.b).get(i);
                simpleContent.sourceType = this.d;
                d9m.n().renderDX(createDX, JSON.parseObject(JSON.toJSONString(simpleContent)));
                viewHolder.itemView.post(new a(viewHolder, createDX));
                gwg.k(this.e, simpleContent.type, this.d);
            }
        } else if (viewHolder instanceof FooterViewHolder) {
            ViewProxy.setOnClickListener(viewHolder.itemView, new b());
            ((FooterViewHolder) viewHolder).f8624a.setImageUrl(nh4.a());
            ViewGroup.LayoutParams layoutParams2 = viewHolder.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
            }
            if (vc.h(this.f8623a)) {
                layoutParams2.width = vc.b(this.f8623a);
            } else {
                layoutParams2.width = hw0.h() - hw0.a(18.0f);
            }
            layoutParams2.height = hw0.a(45.0f);
            viewHolder.itemView.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 0) {
            return new LiveAvatarViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_avatar_card_item_layout_flexalocal, (ViewGroup) null));
        }
        if (i != 1) {
            return new LiveAvatarViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_avatar_card_item_layout_flexalocal, (ViewGroup) null));
        }
        return new FooterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_avatar_layout_mini_user_video_list_footer_flexalocal, viewGroup, false));
    }
}
