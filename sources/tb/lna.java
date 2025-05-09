package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import tb.w4d;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lna implements v4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f23440a;
    public w4d b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23441a;
        public final /* synthetic */ BaseSectionModel b;
        public final /* synthetic */ BaseSectionModel c;
        public final /* synthetic */ w4d.a d;
        public final /* synthetic */ View e;
        public final /* synthetic */ x28.f f;

        public a(View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, w4d.a aVar, View view2, x28.f fVar) {
            this.f23441a = view;
            this.b = baseSectionModel;
            this.c = baseSectionModel2;
            this.d = aVar;
            this.e = view2;
            this.f = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lna.f(lna.this, this.f23441a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    static {
        t2o.a(491782510);
        t2o.a(491782450);
    }

    public lna(cfc cfcVar, String str) {
        this.f23440a = cfcVar;
        this.c = str;
    }

    public static /* synthetic */ void f(lna lnaVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, w4d.a aVar, View view2, x28.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b157cf5f", new Object[]{lnaVar, view, baseSectionModel, baseSectionModel2, aVar, view2, fVar});
        } else {
            lnaVar.h(view, baseSectionModel, baseSectionModel2, aVar, view2, fVar);
        }
    }

    @Override // tb.v4d
    public void b(BaseSectionModel<?> baseSectionModel, View view, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48a3a4a", new Object[]{this, baseSectionModel, view, baseSectionModel2, aVar, view2});
            return;
        }
        x28.f fVar = new x28.f();
        fVar.f31096a = true;
        g(baseSectionModel, baseSectionModel2, view, aVar, view2, fVar);
    }

    @Override // tb.v4d
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4579905", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.v4d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abc21da", new Object[]{this, view});
        }
    }

    @Override // tb.v4d
    public void e(BaseSectionModel<?> baseSectionModel, View view, w4d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edda9482", new Object[]{this, baseSectionModel, view, aVar});
            return;
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        if (subSection == null) {
            fve.e("GuideOverlayPresenter", "subsection == null");
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        BaseSectionModel guide = subSection.getGuide();
        if (j(guide, ext)) {
            g(baseSectionModel, guide, view, aVar, null, null);
        }
    }

    public final void g(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, View view, w4d.a aVar, View view2, x28.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef39625c", new Object[]{this, baseSectionModel, baseSectionModel2, view, aVar, view2, fVar});
        } else {
            view.post(new a(view, baseSectionModel, baseSectionModel2, aVar, view2, fVar));
        }
    }

    public final void h(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2, x28.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b33db5", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, fVar});
            return;
        }
        view.requestLayout();
        i().b(view, baseSectionModel, baseSectionModel2, aVar, view2, fVar);
        fve.e("GuideOverlayPresenter", "execute new guide overlay process");
    }

    @Override // tb.v4d
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        w4d w4dVar = this.b;
        if (w4dVar != null) {
            ((w28) w4dVar).hideOverlay();
        }
    }

    public final w4d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4d) ipChange.ipc$dispatch("2d09a81b", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new w28(this.f23440a);
        }
        return this.b;
    }

    public final boolean j(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("474ce2a9", new Object[]{this, baseSectionModel, jSONObject})).booleanValue();
        }
        return baseSectionModel != null && baseSectionModel.containsKey("template") && jSONObject.getBooleanValue("dxOverlayGuideEnable");
    }

    @Override // tb.v4d
    public /* synthetic */ void a() {
    }
}
