package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarResult;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.List;
import tb.s6o;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LiveAvatarAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<LiveAvatarResult.LiveAccount> f9519a;
    public LiveAvatarViewHolder.OnItemClickListener b;
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class LiveAvatarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FrameLayout f9520a;
        public final TUrlImageView b;
        public final TextView c;
        public final TextView d;
        public OnItemClickListener e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public interface OnItemClickListener {
            void onItemClick(int i);
        }

        static {
            t2o.a(779092172);
        }

        public LiveAvatarViewHolder(View view) {
            super(view);
            this.f9520a = (FrameLayout) view;
            this.b = (TUrlImageView) view.findViewById(R.id.avatar_cell_image);
            this.c = (TextView) view.findViewById(R.id.avatar_cell_title);
            this.d = (TextView) view.findViewById(R.id.tab2_live_room_avatar_new_status_text);
            ViewProxy.setOnClickListener(view, this);
        }

        public static /* synthetic */ Object ipc$super(LiveAvatarViewHolder liveAvatarViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/topAvatar/LiveAvatarAdapter$LiveAvatarViewHolder");
        }

        public void b0(OnItemClickListener onItemClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0f62119", new Object[]{this, onItemClickListener});
            } else {
                this.e = onItemClickListener;
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.e.onItemClick(getAdapterPosition());
            }
        }
    }

    static {
        t2o.a(779092171);
    }

    public LiveAvatarAdapter(List<LiveAvatarResult.LiveAccount> list) {
        this.f9519a = list;
    }

    public static FrameLayout.LayoutParams N(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("4bb366d9", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = i3;
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.rightMargin = i6;
        layoutParams.bottomMargin = i7;
        return layoutParams;
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarAdapter liveAvatarAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 430758011) {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tab2liveroom/liveroom/topAvatar/LiveAvatarAdapter");
        }
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2afaf22", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.f9519a.size()) {
            this.f9519a.remove(i);
            notifyItemRemoved(i);
            if (i < this.f9519a.size()) {
                notifyItemRangeChanged(i, this.f9519a.size() - i);
            }
        }
    }

    public List<LiveAvatarResult.LiveAccount> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
        }
        return this.f9519a;
    }

    public void Q(LiveAvatarViewHolder.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f62119", new Object[]{this, onItemClickListener});
        } else {
            this.b = onItemClickListener;
        }
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0cf51c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f9519a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder instanceof LiveAvatarViewHolder) {
            LiveAvatarViewHolder liveAvatarViewHolder = (LiveAvatarViewHolder) viewHolder;
            Context context = liveAvatarViewHolder.b.getContext();
            if (this.f9519a.get(i) == null || this.f9519a.get(i).status == null) {
                tfs.e("LiveAvatarAdapter", "onBindViewHolder " + this.f9519a.get(i));
                return;
            }
            liveAvatarViewHolder.c.setText(this.f9519a.get(i).accountNick);
            liveAvatarViewHolder.b.setImageUrl(this.f9519a.get(i).avatarUrl);
            M(context, liveAvatarViewHolder, this.f9519a.get(i));
            if (liveAvatarViewHolder.b.findFeature(RoundFeature.class) == null) {
                liveAvatarViewHolder.b.addFeature(new RoundFeature());
            }
            LiveAvatarViewHolder.OnItemClickListener onItemClickListener = this.b;
            if (onItemClickListener != null) {
                liveAvatarViewHolder.b0(onItemClickListener);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", (Object) Integer.valueOf(i));
            if (TextUtils.equals(this.f9519a.get(i).specialType, LiveAvatarController.MORE_LIVE)) {
                LiveAvatarController.T(2201, "Show-Tab2MoreLive", jSONObject);
                return;
            }
            if (TextUtils.isEmpty(this.f9519a.get(i).topParams)) {
                str = "0";
            } else {
                str = "1";
            }
            jSONObject.put("is_reddot", (Object) str);
            if (this.f9519a.get(i).accountLiveTag != null) {
                jSONObject.put("pushReason", (Object) this.f9519a.get(i).accountLiveTag.pushReason);
            }
            LiveAvatarController.T(2201, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Avatars_Show", jSONObject);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new LiveAvatarViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tab2_liveroom_live_avatar_cell, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        FrameLayout frameLayout;
        ExpandingCircleView expandingCircleView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof LiveAvatarViewHolder) && (frameLayout = ((LiveAvatarViewHolder) viewHolder).f9520a) != null && (expandingCircleView = (ExpandingCircleView) frameLayout.findViewById(R.id.tab2_live_room_avatar_cell_image_animation)) != null) {
            expandingCircleView.setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof LiveAvatarViewHolder) {
            LiveAvatarViewHolder liveAvatarViewHolder = (LiveAvatarViewHolder) viewHolder;
            if (liveAvatarViewHolder.f9520a != null) {
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition >= this.f9519a.size() || adapterPosition <= 0 || !TextUtils.equals(this.f9519a.get(adapterPosition).specialType, LiveAvatarController.MORE_LIVE)) {
                    FrameLayout frameLayout = liveAvatarViewHolder.f9520a;
                    int i = R.id.tab2_live_room_avatar_cell_image_animation;
                    ExpandingCircleView expandingCircleView = (ExpandingCircleView) frameLayout.findViewById(i);
                    Context context = liveAvatarViewHolder.f9520a.getContext();
                    if (expandingCircleView == null) {
                        expandingCircleView = new ExpandingCircleView(context);
                        expandingCircleView.setId(i);
                        expandingCircleView.setStaticRadius(s6o.c(context, 23));
                        expandingCircleView.setExpandingRadius(s6o.c(context, 30));
                        liveAvatarViewHolder.f9520a.addView(expandingCircleView, 0, N(s6o.c(context, 60), s6o.c(context, 60), 49, 0, -2, 0, 0));
                    }
                    expandingCircleView.setVisibility(0);
                }
            }
        }
    }

    public final void M(Context context, LiveAvatarViewHolder liveAvatarViewHolder, LiveAvatarResult.LiveAccount liveAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b907967b", new Object[]{this, context, liveAvatarViewHolder, liveAccount});
        } else if (TextUtils.equals(liveAccount.specialType, LiveAvatarController.MORE_LIVE)) {
            FrameLayout frameLayout = liveAvatarViewHolder.f9520a;
            int i = R.id.tab2_live_room_avatar_cell_status_text_image;
            if (frameLayout.findViewById(i) != null) {
                liveAvatarViewHolder.f9520a.removeView(liveAvatarViewHolder.f9520a.findViewById(i));
            }
            liveAvatarViewHolder.d.setVisibility(8);
        } else if (this.c) {
            if (liveAccount.accountLiveTag != null) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(Color.parseColor(liveAccount.accountLiveTag.backgroundColor));
                shapeDrawable.setShape(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null));
                liveAvatarViewHolder.d.setBackground(shapeDrawable);
                liveAvatarViewHolder.d.setText(liveAccount.accountLiveTag.tagName);
                liveAvatarViewHolder.d.setTextColor(Color.parseColor(liveAccount.accountLiveTag.fontColor));
                liveAvatarViewHolder.d.setVisibility(0);
            }
            FrameLayout frameLayout2 = liveAvatarViewHolder.f9520a;
            int i2 = R.id.tab2_live_room_avatar_cell_status_text_image;
            if (frameLayout2.findViewById(i2) != null) {
                liveAvatarViewHolder.f9520a.removeView(liveAvatarViewHolder.f9520a.findViewById(i2));
            }
        } else {
            FrameLayout frameLayout3 = liveAvatarViewHolder.f9520a;
            int i3 = R.id.tab2_live_room_avatar_cell_status_text_image;
            if (frameLayout3.findViewById(i3) == null) {
                TUrlImageView tUrlImageView = new TUrlImageView(context);
                tUrlImageView.setId(i3);
                tUrlImageView.setImageUrl(liveAccount.status.tagPic);
                liveAvatarViewHolder.f9520a.addView(tUrlImageView, N(s6o.c(context, 32), s6o.c(context, 13), 49, 0, s6o.c(context, 39) + 2, 0, 0));
            }
            liveAvatarViewHolder.d.setVisibility(8);
        }
    }
}
