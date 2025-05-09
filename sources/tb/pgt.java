package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pgt implements x2c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ID = "error";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26085a;
    public TBErrorView b;

    static {
        t2o.a(491782230);
        t2o.a(488636658);
    }

    public pgt(cfc cfcVar) {
        this.f26085a = cfcVar;
    }

    public static /* synthetic */ void d(pgt pgtVar, TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a90679f", new Object[]{pgtVar, tBErrorView, new Boolean(z)});
        } else {
            pgtVar.i(tBErrorView, z);
        }
    }

    public static /* synthetic */ cfc e(pgt pgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("2a3707e3", new Object[]{pgtVar});
        }
        return pgtVar.f26085a;
    }

    public static /* synthetic */ void f(pgt pgtVar, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfdda6e", new Object[]{pgtVar, cfcVar});
        } else {
            pgtVar.h(cfcVar);
        }
    }

    @Override // tb.rgc
    public void bindData(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
        }
    }

    @Override // tb.x2c
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41aa23c", new Object[]{this, new Boolean(z)});
            return;
        }
        TBErrorView tBErrorView = this.b;
        if (tBErrorView != null) {
            i(tBErrorView, z);
        }
    }

    /* renamed from: g */
    public TBErrorView createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("ddad0635", new Object[]{this, viewGroup, new Integer(i)});
        }
        TBErrorView tBErrorView = new TBErrorView(viewGroup.getContext());
        this.b = tBErrorView;
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        i(this.b, true);
        this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.b;
    }

    @Override // tb.rgc
    public int getViewType(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        return -2;
    }

    public final void h(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1164d3a1", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ErrorViewRender", "triggerErrorClick dataService == null");
        } else {
            iContainerDataService.triggerEvent("ErrorViewClick", null);
        }
    }

    public final void i(TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80388e8", new Object[]{this, tBErrorView, new Boolean(z)});
        } else if (z) {
            tBErrorView.setTitle(Localization.q(R.string.taobao_app_1000_1_16165));
            tBErrorView.setSubTitle(Localization.q(R.string.app_please_wait));
            TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView.setButton(buttonType, Localization.q(R.string.app_loading), new ngt(this));
            tBErrorView.setButtonVisibility(buttonType, 4);
        } else {
            tBErrorView.setTitle(Localization.q(R.string.app_network_crash));
            tBErrorView.setSubTitle(Localization.q(R.string.app_relax_and_reload));
            TBErrorView.ButtonType buttonType2 = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView.setButton(buttonType2, Localization.q(R.string.app_refresh), new ogt(this, tBErrorView));
            tBErrorView.setButtonVisibility(buttonType2, 0);
        }
    }

    @Override // tb.rgc
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        }
    }
}
