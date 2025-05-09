package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.ItemModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ffe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<ViewGroup> f19252a;
    public final IContainerDataService<?> b;
    public final dfp c;
    public WeakReference<Context> d;
    public rdc e;

    static {
        t2o.a(491782381);
    }

    public ffe(cfc cfcVar, dfp dfpVar) {
        this.f19252a = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.b = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.c = dfpVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57275542", new Object[]{this});
            return;
        }
        rdc rdcVar = this.e;
        if (rdcVar != null && !((x10) rdcVar).t()) {
            rdc.a s = ((x10) this.e).s();
            if (!s.l()) {
                fve.m("IconAnimeTrigger", "Invalidate config:config" + s.toString());
                return;
            }
            View j = j(s, d(s));
            if (j == null) {
                this.e = null;
                fve.m("IconAnimeTrigger", "No visible TargetView found:target" + s.toString());
                return;
            }
            Bitmap e = this.c.e(s.e());
            if (e == null || e.isRecycled()) {
                this.e = null;
                fve.m("IconAnimeTrigger", "No legal bitmap can be use" + s.toString());
                return;
            }
            TUrlImageView k = k(e);
            if (k == null) {
                fve.m("IconAnimeTrigger", "imageView == null");
                return;
            }
            rdc rdcVar2 = this.e;
            if (rdcVar2 != null) {
                ((x10) rdcVar2).w(k);
                ((x10) this.e).x(j);
                ((x10) this.e).e();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ee826", new Object[]{this});
            return;
        }
        rdc rdcVar = this.e;
        if (rdcVar != null) {
            ((x10) rdcVar).g();
        }
    }

    public final boolean d(rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8038fb6d", new Object[]{this, aVar})).booleanValue();
        }
        if (h(aVar.d(), aVar.f()) >= 10) {
            return true;
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1a1c63", new Object[]{this});
            return;
        }
        rdc rdcVar = this.e;
        if (rdcVar != null) {
            this.c.d(((x10) rdcVar).s().e());
        }
    }

    public final DXRootView f(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("55ea5980", new Object[]{this, view});
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
            i++;
        }
    }

    public final View g(DXRootView dXRootView, String str) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ede49f8", new Object[]{this, dXRootView, str});
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str + "_frame");
        if (queryWidgetNodeByUserId == null || (dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext()) == null) {
            return null;
        }
        return dXRuntimeContext.D();
    }

    public final int h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25ba0c2e", new Object[]{this, str, str2})).intValue();
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            fve.e("IconAnimeTrigger", "containerDataService == null");
            return -1;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            return -1;
        }
        for (BaseSectionModel<?> baseSectionModel : containerData.getTotalData()) {
            if (TextUtils.equals(str, baseSectionModel.getSectionBizCode())) {
                return a(str2, baseSectionModel);
            }
        }
        return -1;
    }

    public final DXRootView i(String str) {
        View findItemViewByPosition;
        DXRootView f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("1e883498", new Object[]{this, str});
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            fve.e("IconAnimeTrigger", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            return null;
        }
        List totalData = containerData.getTotalData();
        for (int i = 0; i < totalData.size(); i++) {
            if (TextUtils.equals(str, ((SectionModel) totalData.get(i)).getSectionBizCode()) && (findItemViewByPosition = this.f19252a.findItemViewByPosition(i)) != null && findItemViewByPosition.getVisibility() == 0 && (f = f(findItemViewByPosition)) != null) {
                return f;
            }
        }
        return null;
    }

    public final View j(rdc.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5c761f89", new Object[]{this, aVar, new Boolean(z)});
        }
        DXRootView i = i(aVar.d());
        if (i == null) {
            return null;
        }
        View g = g(i, aVar.f());
        View g2 = g(i, aVar.b());
        if (z || g == null) {
            return g2;
        }
        return g;
    }

    public final TUrlImageView k(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("268b17f5", new Object[]{this, bitmap});
        }
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        if (!(context instanceof Activity)) {
            return null;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(((Activity) context).getResources(), bitmap);
        create.setCornerRadius(24.0f);
        tUrlImageView.setImageDrawable(create);
        tUrlImageView.setMaxHeight(pb6.r(context));
        tUrlImageView.setMaxWidth(pb6.s(context));
        return tUrlImageView;
    }

    public final int l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a74ef70d", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            fve.e("IconAnimeTrigger", "find icon index failed,check icon protocol.");
            return -1;
        }
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da18885", new Object[]{this, jSONObject});
            return;
        }
        rdc rdcVar = this.e;
        if (rdcVar != null) {
            ((x10) rdcVar).g();
        }
        if (this.d != null) {
            rdc.a m = rdc.a.m(jSONObject);
            Context context = this.d.get();
            if (m != null && context != null) {
                this.e = new rfe(context, m);
            }
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471c5d8d", new Object[]{this, new Boolean(z)});
            return;
        }
        rdc rdcVar = this.e;
        if (rdcVar != null) {
            ((x10) rdcVar).y(z, 300L);
        }
    }

    public void o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.d = new WeakReference<>(context);
        }
    }

    public final int a(String str, BaseSectionModel<?> baseSectionModel) {
        int i;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4758a2c", new Object[]{this, str, baseSectionModel})).intValue();
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        Iterator<String> it = subSection.keySet().iterator();
        int i2 = -1;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            String next = it.next();
            ItemModel item = new SectionModel(subSection.getJSONObject(next)).getItem();
            if (item != null) {
                Iterator<String> it2 = item.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next2 = it2.next();
                        JSONObject jSONObject2 = item.getJSONObject(next2);
                        if (jSONObject2 != null && jSONObject2.containsKey("content") && (jSONObject = jSONObject2.getJSONObject("content")) != null && TextUtils.equals(str, jSONObject.getString("miniAppId"))) {
                            i2 = l(next2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i2 >= 0) {
                    i = l(next);
                    break;
                }
            }
        }
        if (i2 < 0 || i < 0) {
            return -1;
        }
        return (i * 2) + i2;
    }
}
