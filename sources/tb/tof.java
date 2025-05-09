package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.itemrenderservice.local.NestedEmptyView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tof implements vgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rgc f28842a;
    public final IItemRenderService.a b;
    public final HashMap<String, rgc> c = new HashMap<>();
    public final HashMap<Integer, rgc> d = new HashMap<>();

    static {
        t2o.a(486539496);
        t2o.a(488636660);
    }

    public tof(cfc cfcVar, IItemRenderService.a aVar) {
        this.b = aVar;
        h(cfcVar);
    }

    @Override // tb.vgc
    public rgc b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("da5e132c", new Object[]{this, str});
        }
        return f(str, null);
    }

    @Override // tb.rgc
    public void bindData(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
        } else if (!(view instanceof NestedEmptyView)) {
            b(baseSectionModel.getSectionBizCode()).bindData(view, baseSectionModel);
        }
    }

    @Override // tb.rgc
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        View createView = e(i).createView(viewGroup, i);
        if (createView == null) {
            return new NestedEmptyView(viewGroup.getContext());
        }
        return createView;
    }

    public final rgc d(String str, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("6c37247e", new Object[]{this, str, baseSectionModel});
        }
        rgc a2 = this.b.a(str);
        if (a2 != null) {
            i(str, a2.getViewType(baseSectionModel), a2);
        }
        return a2;
    }

    public final rgc e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("c2f6e59f", new Object[]{this, new Integer(i)});
        }
        rgc rgcVar = this.d.get(Integer.valueOf(i));
        if (rgcVar == null) {
            return this.f28842a;
        }
        return rgcVar;
    }

    public final rgc f(String str, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("91ef50e4", new Object[]{this, str, baseSectionModel});
        }
        rgc rgcVar = this.c.get(str);
        if (rgcVar == null) {
            rgcVar = d(str, baseSectionModel);
        }
        if (rgcVar == null) {
            return this.f28842a;
        }
        return rgcVar;
    }

    public final Integer g(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("415fb839", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel != null && !TextUtils.isEmpty(baseSectionModel.getSectionBizCode())) {
            if (baseSectionModel.getExt() == null || !baseSectionModel.getExt().getBooleanValue("hidden")) {
                return null;
            }
            return -1;
        }
        return -1;
    }

    @Override // tb.rgc
    public int getViewType(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        Integer g = g(baseSectionModel);
        if (g != null) {
            return g.intValue();
        }
        return f(baseSectionModel.getSectionBizCode(), baseSectionModel).getViewType(baseSectionModel);
    }

    public final void h(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a723c9", new Object[]{this, cfcVar});
        } else {
            this.f28842a = (rgc) cfcVar.a(IDxItemRenderService.class);
        }
    }

    public final void i(String str, int i, rgc rgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f8706c", new Object[]{this, str, new Integer(i), rgcVar});
            return;
        }
        this.c.put(str, rgcVar);
        this.d.put(Integer.valueOf(i), rgcVar);
    }

    @Override // tb.rgc
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        } else {
            f(baseSectionModel.getSectionBizCode(), baseSectionModel).preRender(context, baseSectionModel, z, i);
        }
    }
}
