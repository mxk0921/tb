package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.w4d;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jex implements v4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f21963a;
    public w4d b;

    static {
        t2o.a(491782512);
        t2o.a(491782450);
    }

    public jex(cfc cfcVar) {
        this.f21963a = cfcVar;
    }

    @Override // tb.v4d
    public void b(BaseSectionModel<?> baseSectionModel, View view, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48a3a4a", new Object[]{this, baseSectionModel, view, baseSectionModel2, aVar, view2});
        }
    }

    @Override // tb.v4d
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4579905", new Object[]{this});
        }
        return "";
    }

    @Override // tb.v4d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abc21da", new Object[]{this, view});
            return;
        }
        w4d g = g();
        this.b = g;
        if (g == null) {
            fve.e("WindVoneOverLayPresenter", "mOverlayViewController == null");
        } else {
            g.c("windvane", view);
        }
    }

    public final w4d f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4d) ipChange.ipc$dispatch("6d3663b5", new Object[]{this});
        }
        return new w28(this.f21963a);
    }

    public final w4d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4d) ipChange.ipc$dispatch("2d09a81b", new Object[]{this});
        }
        if (this.b == null) {
            this.b = f();
        }
        return this.b;
    }

    @Override // tb.v4d
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
        }
    }

    @Override // tb.v4d
    public void e(BaseSectionModel<?> baseSectionModel, View view, w4d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edda9482", new Object[]{this, baseSectionModel, view, aVar});
            return;
        }
        BaseSectionModel<?> windvaneOverlay = baseSectionModel.getSubSection().getWindvaneOverlay();
        if (windvaneOverlay == null) {
            fve.e("WindVoneOverLayPresenter", "itemData == null");
            return;
        }
        w4d g = g();
        this.b = g;
        if (g == null) {
            fve.e("WindVoneOverLayPresenter", "mOverlayViewController == null");
            return;
        }
        x28.f fVar = new x28.f();
        fVar.b = true;
        fVar.c = 250;
        fVar.d = "windvane";
        this.b.b(view, baseSectionModel, windvaneOverlay, aVar, null, fVar);
        fve.e("WindVoneOverLayPresenter", "execute new feedback overlay process");
    }

    @Override // tb.v4d
    public /* synthetic */ void a() {
    }
}
