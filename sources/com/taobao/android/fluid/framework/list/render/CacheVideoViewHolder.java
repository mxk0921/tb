package com.taobao.android.fluid.framework.list.render;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.atb;
import tb.ir9;
import tb.ntm;
import tb.pcw;
import tb.pto;
import tb.qtm;
import tb.r8e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CacheVideoViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ntm f7842a;
    public final FluidContext b;

    static {
        t2o.a(468714456);
    }

    public CacheVideoViewHolder(FluidContext fluidContext, View view) {
        super(view);
        this.b = fluidContext;
    }

    public static /* synthetic */ Object ipc$super(CacheVideoViewHolder cacheVideoViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/CacheVideoViewHolder");
    }

    public void b0(ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2714cfa2", new Object[]{this, ntmVar});
            return;
        }
        this.f7842a = ntmVar;
        if (ntmVar != null) {
            FrameLayout frameLayout = (FrameLayout) this.itemView;
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            atb atbVar = ntmVar.f24942a;
            ViewGroup view = atbVar.getView();
            qtm.n(view);
            if (view != null) {
                r8e videoCommentSizeObject = ((IUsePreloadService) this.b.getService(IUsePreloadService.class)).setVideoCommentSizeObject(view);
                atbVar.f(videoCommentSizeObject.d, videoCommentSizeObject.c);
                atbVar.i(DWInstanceType.VIDEO);
                FrameLayout.LayoutParams y = pcw.y(this.b.getContext(), videoCommentSizeObject, pto.i(this.b), this.b);
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                frameLayout.addView(view, y);
                TUrlImageView tUrlImageView = this.f7842a.n;
                if (tUrlImageView != null) {
                    if (tUrlImageView.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.f7842a.n.getParent()).removeView(this.f7842a.n);
                    }
                    if (atbVar.getVideoState() != 1) {
                        frameLayout.addView(this.f7842a.n, y);
                    }
                }
                ir9.b("CacheVideoViewHolder", "添加预加载视频到cell videoCommentSizeObject = " + videoCommentSizeObject);
                ir9.b("CacheVideoViewHolder", "添加预加载视频到cell, w:" + y.width + " h:" + y.height + " top:" + y.topMargin + " bottom:" + y.bottomMargin + ", videoView.w=" + view.getMeasuredWidth() + " h=" + view.getMeasuredHeight());
            }
        }
    }
}
