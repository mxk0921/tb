package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.android.detail.ttdetail.widget.draglayout.a;
import com.taobao.android.detail.ttdetail.widget.video.LivePhotoVideoView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i2h extends LivePhotoComponent implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DragDismissLayout i;
    public boolean j;

    static {
        t2o.a(912261441);
        t2o.a(912263017);
    }

    public i2h(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ Object ipc$super(i2h i2hVar, String str, Object... objArr) {
        if (str.hashCode() == 2045166572) {
            return new Boolean(super.s());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/LivePhotoLightOffComponent");
    }

    @Override // tb.u3a
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c75f5c45", new Object[]{this});
        }
        return "DarkFrame_industry";
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ab5edc", new Object[]{this});
        } else {
            J();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbac91e", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent
    public View N(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (this.j && view == null) {
            view = this.mView;
            this.j = false;
        }
        if (view == null || view.getId() != R.id.ddl_live_photo_component) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_live_photo_component, (ViewGroup) null);
        }
        this.i = (DragDismissLayout) view.findViewById(R.id.ddl_live_photo_component);
        LivePhotoVideoView livePhotoVideoView = (LivePhotoVideoView) view.findViewById(R.id.vv_live_photo_video_content);
        livePhotoVideoView.bindData(this.mComponentData, this.mDetailContext);
        livePhotoVideoView.setLivePhotoExposureListener(this.g);
        this.i.setTargetView(livePhotoVideoView);
        this.e = livePhotoVideoView;
        return view;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c4cab260", new Object[]{this});
        }
        DragDismissLayout dragDismissLayout = this.i;
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
        DragDismissLayout dragDismissLayout = this.i;
        if (dragDismissLayout != null) {
            dragDismissLayout.setPullListener(bVar);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void h(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161e49aa", new Object[]{this, rect});
            return;
        }
        DragDismissLayout dragDismissLayout = this.i;
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
        DragDismissLayout dragDismissLayout = this.i;
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
        DragDismissLayout dragDismissLayout = this.i;
        if (dragDismissLayout != null) {
            return dragDismissLayout.startExitAnimation();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent, tb.s8e
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e6c3ec", new Object[]{this})).booleanValue();
        }
        boolean s = super.s();
        if (!s) {
            getComponentView(null);
            this.j = true;
            if (super.s()) {
                this.e.hideCoverImage();
            }
        }
        return s;
    }
}
