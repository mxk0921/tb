package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.w4d;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class skj implements w4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public transient WeakReference<tkj> f28115a;
    public final cfc b;
    public View.OnClickListener c = null;
    public View.OnClickListener d = null;

    static {
        t2o.a(491782486);
        t2o.a(491782460);
    }

    public skj(cfc cfcVar) {
        this.b = cfcVar;
    }

    @Override // tb.w4d
    public void b(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2, x28.f fVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bd0de8", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, fVar});
            return;
        }
        f(baseSectionModel, baseSectionModel2);
        hideOverlay();
        tkj d = d();
        if (view.getParent() instanceof ViewGroup) {
            viewGroup = (ViewGroup) view.getParent();
        } else {
            viewGroup = null;
        }
        if (d != null && viewGroup != null) {
            d.t(view.getContext(), e(view), viewGroup, this.c, this.d, baseSectionModel);
            aVar.a(baseSectionModel2, baseSectionModel);
        }
    }

    @Override // tb.w4d
    public void c(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bb088f", new Object[]{this, str, view});
        }
    }

    public final tkj d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tkj) ipChange.ipc$dispatch("ffe9dc5d", new Object[]{this});
        }
        WeakReference<tkj> weakReference = new WeakReference<>(new tkj(this.b));
        this.f28115a = weakReference;
        return weakReference.get();
    }

    public final DinamicXEngine e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("9e8a0088", new Object[]{this, view});
        }
        Object tag = view.getTag(R.id.overlay_dx_engine_tag);
        if (tag instanceof DinamicXEngine) {
            return (DinamicXEngine) tag;
        }
        return null;
    }

    public final void f(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc7cb1f", new Object[]{this, baseSectionModel, baseSectionModel2});
            return;
        }
        BaseItemModel item = baseSectionModel2.getItem();
        if (item != null) {
            g(baseSectionModel, baseSectionModel2, item);
            h(baseSectionModel, baseSectionModel2, item);
        }
    }

    public final void g(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, BaseItemModel baseItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16bdfcd4", new Object[]{this, baseSectionModel, baseSectionModel2, baseItemModel});
        } else if (baseItemModel.getBaseItemModel(0) != null) {
            this.c = new sjj(this.b, baseSectionModel, baseSectionModel2);
        }
    }

    public final void h(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, BaseItemModel baseItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e2b50", new Object[]{this, baseSectionModel, baseSectionModel2, baseItemModel});
        } else if (baseItemModel.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR) != null) {
            this.d = new akj(this.b, baseSectionModel, baseSectionModel2);
        }
    }

    @Override // tb.w4d
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        WeakReference<tkj> weakReference = this.f28115a;
        if (weakReference != null) {
            tkj tkjVar = weakReference.get();
            if (tkjVar != null) {
                tkjVar.n();
            }
            this.f28115a = null;
        }
    }

    @Override // tb.w4d
    public /* synthetic */ void a() {
    }
}
