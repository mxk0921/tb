package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.android.detail.ttdetail.widget.photoview.PhotoView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vle extends bje implements com.taobao.android.detail.ttdetail.widget.draglayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DragDismissLayout e;
    public boolean f = false;
    public final boolean y = vbl.g1();
    public final euk g = new a();
    public final atk h = new b();
    public final View.OnLongClickListener i = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements euk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.euk
        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91ccf720", new Object[]{this, new Float(f), new Float(f2)});
            } else if (Float.compare(f, f2) < 0 && Float.compare(f2, 1.0f) > 0) {
                JSONObject c = UtUtils.c(vle.this.mDetailContext.e());
                c.putAll(vle.this.B());
                UtUtils.f(2101, "Page_Detail_Enlagre_DarkPage_industry", c);
                UserBehaviorTracker.l(vle.this.mContext, UserBehaviorUtils.COMPONENT_NAME_GALLERY_LIGHTOFF_CONTAINER, "changeImageSize", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements atk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.atk
        public void a(ImageView imageView, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2b36851", new Object[]{this, imageView, new Float(f), new Float(f2)});
            } else {
                q84.f(vle.this.mContext, new qq7());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (vle.P(vle.this)) {
                return true;
            }
            q84.f(vle.this.mContext, new pog(jov.d(vle.this.K()), view.getRootView()));
            UtUtils.f(2101, "Page_Detail_LongPress_DarkPage_industry", UtUtils.c(vle.this.mDetailContext.e()));
            return true;
        }
    }

    static {
        t2o.a(912261431);
        t2o.a(912263017);
    }

    public vle(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ boolean P(vle vleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83dc7d43", new Object[]{vleVar})).booleanValue();
        }
        return vleVar.f;
    }

    public static /* synthetic */ Object ipc$super(vle vleVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/ImageLightOffComponent");
    }

    @Override // tb.u3a
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c75f5c45", new Object[]{this});
        }
        return "DarkFrame_industry";
    }

    @Override // tb.bje
    public View J(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ddl_image_component) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_image_component, (ViewGroup) null);
        }
        this.e = (DragDismissLayout) view.findViewById(R.id.ddl_image_component);
        PhotoView photoView = (PhotoView) view.findViewById(R.id.pv_image_content);
        String d = jov.d(K());
        if (this.y) {
            mpe.u(photoView, d);
        } else {
            mpe.m(photoView, d);
        }
        this.e.setTargetView(photoView);
        photoView.setOnLongClickListener(this.i);
        photoView.setOnPhotoTapListener(this.h);
        photoView.setOnScaledListener(this.g);
        return view;
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b3cde4", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c4cab260", new Object[]{this});
        }
        DragDismissLayout dragDismissLayout = this.e;
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
        DragDismissLayout dragDismissLayout = this.e;
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
        DragDismissLayout dragDismissLayout = this.e;
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
        DragDismissLayout dragDismissLayout = this.e;
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
        DragDismissLayout dragDismissLayout = this.e;
        if (dragDismissLayout != null) {
            return dragDismissLayout.startExitAnimation();
        }
        return false;
    }
}
