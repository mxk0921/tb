package com.taobao.kirinvideoengine.album;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.kirinvideoengine.album.AlbumAdapter;
import com.taobao.livephoto.LivePhotoView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import tb.azf;
import tb.b3m;
import tb.ckf;
import tb.f27;
import tb.sj4;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/kirinvideoengine/album/LivePhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "kirinvideoengine_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LivePhotoViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LivePhotoView f10882a;
    public final a b = new a();
    public final AlbumAdapter c;
    public final ViewGroup d;
    public final ArrayList<AlbumAdapter.c> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a extends f27 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1482579505) {
                super.onVideoError(objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == -1028467347) {
                super.onVideoStart();
                return null;
            } else if (hashCode == -742210244) {
                super.onVideoComplete();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kirinvideoengine/album/LivePhotoViewHolder$mLivePhotoListener$1");
            }
        }

        @Override // tb.f27, tb.ytb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            super.onVideoComplete();
            int Q = LivePhotoViewHolder.b0(LivePhotoViewHolder.this).Q(LivePhotoViewHolder.this.getAdapterPosition());
            azf.d(AlbumAdapter.TAG, "mLivePhotoListener onVideoComplete adapterPosition=" + LivePhotoViewHolder.this.getAdapterPosition() + ", realPosition=" + Q, new Object[0]);
            if (!LivePhotoViewHolder.c0(LivePhotoViewHolder.this).isEmpty()) {
                for (AlbumAdapter.c cVar : LivePhotoViewHolder.c0(LivePhotoViewHolder.this)) {
                    cVar.a(Q);
                }
            }
        }

        @Override // tb.f27, tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            super.onVideoError(obj, i, i2);
            int Q = LivePhotoViewHolder.b0(LivePhotoViewHolder.this).Q(LivePhotoViewHolder.this.getAdapterPosition());
            azf.d(AlbumAdapter.TAG, "mLivePhotoListener onVideoError " + obj + ", " + i + ", " + i2 + ", adapterPosition=" + LivePhotoViewHolder.this.getAdapterPosition() + ", realPosition=" + Q, new Object[0]);
            if (!LivePhotoViewHolder.c0(LivePhotoViewHolder.this).isEmpty()) {
                for (AlbumAdapter.c cVar : LivePhotoViewHolder.c0(LivePhotoViewHolder.this)) {
                    cVar.c(Q, obj, i, i2);
                }
            }
        }

        @Override // tb.f27, tb.ytb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            super.onVideoStart();
            int Q = LivePhotoViewHolder.b0(LivePhotoViewHolder.this).Q(LivePhotoViewHolder.this.getAdapterPosition());
            azf.d(AlbumAdapter.TAG, "mLivePhotoListener onVideoStart adapterPosition=" + LivePhotoViewHolder.this.getAdapterPosition() + ", realPosition=" + Q, new Object[0]);
            if (!LivePhotoViewHolder.c0(LivePhotoViewHolder.this).isEmpty()) {
                for (AlbumAdapter.c cVar : LivePhotoViewHolder.c0(LivePhotoViewHolder.this)) {
                    cVar.b(Q);
                }
            }
        }
    }

    static {
        t2o.a(500170770);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LivePhotoViewHolder(com.taobao.kirinvideoengine.album.AlbumAdapter r3, android.view.ViewGroup r4, java.util.ArrayList<com.taobao.kirinvideoengine.album.AlbumAdapter.b> r5, java.util.ArrayList<com.taobao.kirinvideoengine.album.AlbumAdapter.c> r6) {
        /*
            r2 = this;
            java.lang.String r0 = "adapter"
            tb.ckf.g(r3, r0)
            java.lang.String r0 = "parent"
            tb.ckf.g(r4, r0)
            java.lang.String r0 = "onAlbumItemStateListeners"
            tb.ckf.g(r5, r0)
            java.lang.String r5 = "onAlbumLivePhotoStateListeners"
            tb.ckf.g(r6, r5)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            android.content.Context r0 = r4.getContext()
            r5.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r5.setLayoutParams(r0)
            tb.xhv r0 = tb.xhv.INSTANCE
            r2.<init>(r5)
            r2.c = r3
            r2.d = r4
            r2.e = r6
            com.taobao.kirinvideoengine.album.LivePhotoViewHolder$a r3 = new com.taobao.kirinvideoengine.album.LivePhotoViewHolder$a
            r3.<init>()
            r2.b = r3
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "AlbumAdapter"
            java.lang.String r5 = "LivePhotoViewHolder init"
            tb.azf.d(r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.kirinvideoengine.album.LivePhotoViewHolder.<init>(com.taobao.kirinvideoengine.album.AlbumAdapter, android.view.ViewGroup, java.util.ArrayList, java.util.ArrayList):void");
    }

    public static final /* synthetic */ AlbumAdapter b0(LivePhotoViewHolder livePhotoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlbumAdapter) ipChange.ipc$dispatch("949e0337", new Object[]{livePhotoViewHolder});
        }
        return livePhotoViewHolder.c;
    }

    public static final /* synthetic */ ArrayList c0(LivePhotoViewHolder livePhotoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8f0eb08f", new Object[]{livePhotoViewHolder});
        }
        return livePhotoViewHolder.e;
    }

    public static /* synthetic */ Object ipc$super(LivePhotoViewHolder livePhotoViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kirinvideoengine/album/LivePhotoViewHolder");
    }

    public final Pair<Float, Float> e0(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("10bd7cd1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        float f = i3;
        float f2 = i4;
        float min = Math.min(i / f, i2 / f2);
        return new Pair<>(Float.valueOf(f * min), Float.valueOf(f2 * min));
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        azf.d(AlbumAdapter.TAG, "LivePhotoViewHolder doDestroy,adapterPosition=" + getAdapterPosition() + ", mLivePhotoView=" + this.f10882a, new Object[0]);
        try {
            LivePhotoView livePhotoView = this.f10882a;
            if (livePhotoView != null) {
                livePhotoView.destroy();
            }
        } catch (Throwable th) {
            azf.c(AlbumAdapter.TAG, "LivePhotoViewHolder doDestroy error", th, new Object[0]);
        }
    }

    public final void g0() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a200b66", new Object[]{this});
            return;
        }
        azf.d(AlbumAdapter.TAG, "LivePhotoViewHolder doPlay,adapterPosition=" + getAdapterPosition() + ", mLivePhotoView=" + this.f10882a, new Object[0]);
        LivePhotoView livePhotoView = this.f10882a;
        if (livePhotoView != null) {
            view = livePhotoView.getLivePhotoView();
        } else {
            view = null;
        }
        if (view == null) {
            h0();
        }
        try {
            LivePhotoView livePhotoView2 = this.f10882a;
            if (livePhotoView2 != null) {
                livePhotoView2.start();
            }
        } catch (Throwable th) {
            azf.c(AlbumAdapter.TAG, "LivePhotoViewHolder doPlay error", th, new Object[0]);
        }
    }

    public final void h0() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964e9c83", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("LivePhotoViewHolder doPrepare,adapterPosition=");
        sb.append(getAdapterPosition());
        sb.append(" ; ");
        LivePhotoView livePhotoView = this.f10882a;
        View view2 = null;
        if (livePhotoView != null) {
            view = livePhotoView.getLivePhotoView();
        } else {
            view = null;
        }
        sb.append(view);
        azf.d(AlbumAdapter.TAG, sb.toString(), new Object[0]);
        LivePhotoView livePhotoView2 = this.f10882a;
        if (livePhotoView2 != null) {
            view2 = livePhotoView2.getLivePhotoView();
        }
        if (view2 == null) {
            try {
                LivePhotoView livePhotoView3 = this.f10882a;
                if (livePhotoView3 != null) {
                    livePhotoView3.prepare();
                }
            } catch (Throwable th) {
                azf.c(AlbumAdapter.TAG, "LivePhotoViewHolder doPrepare error", th, new Object[0]);
            }
        }
        LivePhotoView livePhotoView4 = this.f10882a;
        if (livePhotoView4 != null) {
            livePhotoView4.setLiveIconVisible(true);
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
            return;
        }
        azf.d(AlbumAdapter.TAG, "LivePhotoViewHolder doStop,adapterPosition=" + getAdapterPosition() + ", mLivePhotoView=" + this.f10882a, new Object[0]);
        try {
            LivePhotoView livePhotoView = this.f10882a;
            if (livePhotoView != null) {
                livePhotoView.stop();
            }
        } catch (Throwable th) {
            azf.c(AlbumAdapter.TAG, "LivePhotoViewHolder doStop error", th, new Object[0]);
        }
    }

    public final void d0(int i, b3m b3mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b24c681", new Object[]{this, new Integer(i), b3mVar});
            return;
        }
        ckf.g(b3mVar, "model");
        azf.d(AlbumAdapter.TAG, "LivePhotoViewHolder bindData,position=" + i + "; model=" + b3mVar + "; " + this.d.getMeasuredWidth() + ", " + this.d.getMeasuredHeight(), new Object[0]);
        LivePhotoView livePhotoView = new LivePhotoView(this.d.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        xhv xhvVar = xhv.INSTANCE;
        livePhotoView.setLayoutParams(layoutParams);
        livePhotoView.setIsMute(true);
        livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_CENTER_CROP);
        livePhotoView.addListener(this.b);
        livePhotoView.setPlayScenes(sj4.PLAY_SCENES);
        livePhotoView.setBizCode("guangguang");
        livePhotoView.setLiveIconVisible(true);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (b3mVar.d() != null) {
            JSONObject d = b3mVar.d();
            livePhotoView.setLivePhotoInfo(d != null ? new org.json.JSONObject(d) : null);
        }
        this.f10882a = livePhotoView;
        View view = this.itemView;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.itemView;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.f10882a);
                Pair<Float, Float> e0 = e0(this.d.getMeasuredWidth(), this.d.getMeasuredHeight(), b3mVar.f(), b3mVar.c());
                azf.d(AlbumAdapter.TAG, "LivePhotoViewHolder bindData, fitCenterSize=" + e0.getFirst().floatValue() + ", " + e0.getSecond().floatValue(), new Object[0]);
                LivePhotoView livePhotoView2 = this.f10882a;
                if (livePhotoView2 != null) {
                    layoutParams2 = livePhotoView2.getLayoutParams();
                }
                if (layoutParams2 != null) {
                    layoutParams2.width = (int) e0.getFirst().floatValue();
                }
                if (layoutParams2 != null) {
                    layoutParams2.height = (int) e0.getSecond().floatValue();
                }
                LivePhotoView livePhotoView3 = this.f10882a;
                if (livePhotoView3 != null) {
                    livePhotoView3.setWidthAndHeight((int) e0.getFirst().floatValue(), (int) e0.getSecond().floatValue());
                }
                h0();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
