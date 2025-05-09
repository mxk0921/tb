package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.w4d;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w28 implements w4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30404a;
    public transient WeakReference<x28> b;

    static {
        t2o.a(491782463);
        t2o.a(491782460);
    }

    public w28(cfc cfcVar) {
        this.f30404a = cfcVar;
    }

    @Override // tb.w4d
    public void b(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2, x28.f fVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bd0de8", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, fVar});
            return;
        }
        if (fVar == null || !fVar.b) {
            hideOverlay();
        }
        x28 d = d();
        if (view.getParent() instanceof ViewGroup) {
            viewGroup = (ViewGroup) view.getParent();
        } else {
            viewGroup = null;
        }
        if (d != null && viewGroup != null) {
            d.q(aVar);
            d.t(view.getContext(), viewGroup, baseSectionModel, baseSectionModel2, view2, fVar);
            e(baseSectionModel2);
        }
    }

    @Override // tb.w4d
    public void c(String str, View view) {
        ViewGroup viewGroup;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bb088f", new Object[]{this, str, view});
            return;
        }
        View view2 = null;
        if (view.getParent() instanceof ViewGroup) {
            viewGroup = (ViewGroup) view.getParent();
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            while (true) {
                if (i >= viewGroup.getChildCount()) {
                    break;
                } else if (TextUtils.equals(String.valueOf(viewGroup.getChildAt(i).getTag(R.id.overlay_overlay_view_tag)), str)) {
                    view2 = viewGroup.getChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    public final x28 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x28) ipChange.ipc$dispatch("fb20c8d4", new Object[]{this});
        }
        WeakReference<x28> weakReference = new WeakReference<>(new x28(this.f30404a));
        this.b = weakReference;
        return weakReference.get();
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c937247b", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.getBooleanValue("isTracked")) {
            uve.a("Page_Home", 19999, "del_flipAdRender", "overlay", "overlayDxAppearExpose", null);
        }
    }

    @Override // tb.w4d
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        WeakReference<x28> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            this.b.get().n();
            this.b = null;
        }
    }

    @Override // tb.w4d
    public /* synthetic */ void a() {
    }
}
