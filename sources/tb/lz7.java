package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lz7 implements rgc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DRESS_UP_BIZ_CODE = "dressUpHostView";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f23659a;
    public final IDressUpHostService b;

    static {
        t2o.a(486539505);
        t2o.a(488636659);
    }

    public lz7(cfc cfcVar) {
        this.f23659a = cfcVar;
        this.b = (IDressUpHostService) cfcVar.a(IDressUpHostService.class);
    }

    @Override // tb.rgc
    public void bindData(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        eve.c("DressUpHostViewRender", "bindData_hostView");
        IDressUpHostService iDressUpHostService = this.b;
        if (iDressUpHostService != null) {
            iDressUpHostService.bindData(view, baseSectionModel);
            eve.b("DressUpHostViewRender", "bindData_hostView");
        }
    }

    @Override // tb.rgc
    public View createView(ViewGroup viewGroup, int i) {
        IDressUpHostService iDressUpHostService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (this.f23659a == null || (iDressUpHostService = this.b) == null) {
            return null;
        }
        return iDressUpHostService.createHostView(viewGroup, i);
    }

    @Override // tb.rgc
    public int getViewType(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        IDressUpHostService iDressUpHostService = this.b;
        if (iDressUpHostService == null) {
            return -4;
        }
        return iDressUpHostService.getViewType(baseSectionModel);
    }

    @Override // tb.rgc
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        }
    }
}
