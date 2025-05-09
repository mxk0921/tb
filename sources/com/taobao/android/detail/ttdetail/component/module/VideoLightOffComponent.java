package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.android.detail.ttdetail.widget.draglayout.a;
import com.taobao.android.detail.ttdetail.widget.video.NormalVideoView;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.nb4;
import tb.rcw;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VideoLightOffComponent extends VideoComponent implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DragDismissLayout k;
    public boolean l;

    static {
        t2o.a(912261457);
        t2o.a(912263017);
    }

    public VideoLightOffComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ boolean e0(VideoLightOffComponent videoLightOffComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99cd1863", new Object[]{videoLightOffComponent})).booleanValue();
        }
        return videoLightOffComponent.f0();
    }

    public static /* synthetic */ Object ipc$super(VideoLightOffComponent videoLightOffComponent, String str, Object... objArr) {
        if (str.hashCode() == 2045166572) {
            return new Boolean(super.s());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/VideoLightOffComponent");
    }

    @Override // tb.u3a
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c75f5c45", new Object[]{this});
        }
        return "DarkFrame_industry";
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.VideoComponent
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ab5edc", new Object[]{this});
        } else {
            J();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.VideoComponent
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbac91e", new Object[]{this});
        } else if (f0()) {
            playVideo(false);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.VideoComponent
    public View N(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (this.l && view == null) {
            view = this.mView;
            this.l = false;
        }
        if (view == null || view.getId() != R.id.ddl_video_component) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_video_component, (ViewGroup) null);
        }
        this.k = (DragDismissLayout) view.findViewById(R.id.ddl_video_component);
        NormalVideoView normalVideoView = (NormalVideoView) view.findViewById(R.id.vv_video_content);
        normalVideoView.bindData(this.mComponentData, this.mDetailContext, new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.VideoLightOffComponent.1
            {
                put("videoAutoPlay", String.valueOf(VideoLightOffComponent.e0(VideoLightOffComponent.this)));
            }
        });
        normalVideoView.setOnUserClickPlay(this.h);
        normalVideoView.setOnMuteClick(this.i);
        this.k.setTargetView(normalVideoView);
        this.e = normalVideoView;
        return view;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.VideoComponent
    public String O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("955fe42f", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "Page_Detail_Button_DarkFrame-VideoPlay";
        }
        return "Page_Detail_Button_DarkFrame-VideoPause";
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.VideoComponent
    public String R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b059e5d6", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "Page_Detail_Button_DarkFrame-VoiceOff";
        }
        return "Page_Detail_Button_DarkFrame-VoiceOn";
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c4cab260", new Object[]{this});
        }
        DragDismissLayout dragDismissLayout = this.k;
        if (dragDismissLayout == null) {
            return null;
        }
        return dragDismissLayout.getTargetViewRect();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void c(DragDismissLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70db4e75", new Object[]{this, bVar});
            return;
        }
        DragDismissLayout dragDismissLayout = this.k;
        if (dragDismissLayout != null) {
            dragDismissLayout.setPullListener(bVar);
        }
    }

    public final boolean f0() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51e20539", new Object[]{this})).booleanValue();
        }
        boolean e = com.taobao.android.detail.ttdetail.widget.video.a.d().e(this.mContext);
        if (rcw.b(this.mContext, (Feature) this.mDetailContext.e().f(Feature.class)) || e) {
            z = true;
        } else {
            z = false;
        }
        boolean g0 = g0();
        if (z || g0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd65b0f9", new Object[]{this})).booleanValue();
        }
        T t = this.mComponentData;
        if (t == 0 || (f = t.f()) == null) {
            return false;
        }
        return f.getBooleanValue("isForceVideoAutoPlay");
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void h(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161e49aa", new Object[]{this, rect});
            return;
        }
        DragDismissLayout dragDismissLayout = this.k;
        if (dragDismissLayout != null) {
            dragDismissLayout.setTargetViewInitScreenLocation(rect);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1763215", new Object[]{this});
            return;
        }
        DragDismissLayout dragDismissLayout = this.k;
        if (dragDismissLayout != null) {
            dragDismissLayout.startEnterAnimation();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f3814f", new Object[]{this})).booleanValue();
        }
        DragDismissLayout dragDismissLayout = this.k;
        if (dragDismissLayout != null) {
            return dragDismissLayout.startExitAnimation();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.VideoComponent, tb.s8e
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e6c3ec", new Object[]{this})).booleanValue();
        }
        boolean s = super.s();
        if (!s) {
            getComponentView(null);
            this.l = true;
            if (super.s()) {
                this.e.hideCoverImage();
            }
        }
        return s;
    }
}
