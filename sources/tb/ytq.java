package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bbd;
import tb.z28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ytq implements bbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cfc f32346a;
    public IMainFeedsViewService b;
    public IContainerDataService c;
    public IDxItemRenderService d;
    public FrameLayout e;
    public final Map<Integer, WeakReference<View>> f = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbd.a f32347a;

        public a(ytq ytqVar, bbd.a aVar) {
            this.f32347a = aVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            bbd.a aVar = this.f32347a;
            if (aVar != null) {
                ((z28.a) aVar).a();
            }
        }
    }

    static {
        t2o.a(491782593);
        t2o.a(477102092);
    }

    @Override // tb.bbd
    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9abc0f4", new Object[]{this, str})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return -1;
        }
        return iMainFeedsViewService.getPositionBySectionBizCode(str);
    }

    @Override // tb.bbd
    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae01f7a8", new Object[]{this, str, jSONObject});
            return;
        }
        IContainerDataService iContainerDataService = this.c;
        if (iContainerDataService != null) {
            iContainerDataService.triggerEvent(str, jSONObject);
        }
    }

    @Override // tb.bbd
    public boolean d(String str, String str2, Object obj) {
        int positionBySectionBizCode;
        BaseSectionModel<?> findItemDataByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af5844d0", new Object[]{this, str, str2, obj})).booleanValue();
        }
        if (this.b == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (positionBySectionBizCode = this.b.getPositionBySectionBizCode(str)) < 0 || (findItemDataByPosition = this.b.findItemDataByPosition(positionBySectionBizCode)) == null) {
            return false;
        }
        if (obj == null) {
            findItemDataByPosition.getExt().remove(str2);
        } else {
            findItemDataByPosition.getExt().put(str2, obj);
        }
        return true;
    }

    @Override // tb.bbd
    public void f(List<JSONObject> list, bbd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843c7906", new Object[]{this, list, aVar});
        } else if (!list.isEmpty() && this.d != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (JSONObject jSONObject : list) {
                arrayList.add(m(jSONObject));
            }
            vfm.f("SubContainerProvider ", "preload dx templates, size=" + list.size());
            this.d.downloadTemplateWithoutPrefetch(arrayList, new a(this, aVar));
        }
    }

    @Override // tb.bbd
    public View findItemViewByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a245f2cd", new Object[]{this, new Integer(i)});
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return null;
        }
        return iMainFeedsViewService.findItemViewByPosition(i);
    }

    @Override // tb.bbd
    public String g(int i) {
        BaseSectionModel<?> findItemDataByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e02178d0", new Object[]{this, new Integer(i)});
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null || (findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i)) == null) {
            return null;
        }
        return findItemDataByPosition.getSectionBizCode();
    }

    @Override // tb.bbd
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        cfc cfcVar = this.f32346a;
        if (cfcVar == null || cfcVar.getContainerType() == null) {
            return null;
        }
        return this.f32346a.getContainerType().getContainerId();
    }

    @Override // tb.bbd
    public int[] getVisiblePositionRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("67b2b985", new Object[]{this});
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return null;
        }
        return iMainFeedsViewService.getVisiblePositionRange();
    }

    @Override // tb.bbd
    public boolean h(int i) {
        BaseSectionModel<?> findItemDataByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7be6ed", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null || (findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i)) == null) {
            return false;
        }
        this.b.updateItem(findItemDataByPosition);
        return true;
    }

    @Override // tb.bbd
    public void i(String str) {
        IFeedbackService iFeedbackService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d6b1c6", new Object[]{this, str});
            return;
        }
        cfc cfcVar = this.f32346a;
        if (cfcVar != null && (iFeedbackService = (IFeedbackService) cfcVar.a(IFeedbackService.class)) != null) {
            iFeedbackService.deleteHostCardByBizCode(str);
        }
    }

    @Override // tb.bbd
    public View k(ViewGroup viewGroup, JSONObject jSONObject, Object obj) {
        BaseSectionModel m;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b344fdb", new Object[]{this, viewGroup, jSONObject, obj});
        }
        if (this.d == null || (m = m(jSONObject)) == null) {
            return null;
        }
        int viewType = this.d.getViewType(m);
        if (viewType < 0) {
            vfm.f("SubContainerProvider ", "render dx pop error, template is empty");
            return null;
        }
        boolean n = n();
        if (n) {
            WeakReference weakReference = (WeakReference) ((HashMap) this.f).get(Integer.valueOf(viewType));
            if (weakReference != null) {
                view = (View) weakReference.get();
                vfm.f("SubContainerProvider ", "obtain pop view by cache, viewType=" + viewType);
            } else {
                view = null;
            }
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        } else {
            view = null;
        }
        if (view == null) {
            view = this.d.createView(viewGroup, viewType);
            vfm.f("SubContainerProvider ", "obtain pop view by createView, viewType=" + viewType);
            if (n && view != null) {
                ((HashMap) this.f).put(Integer.valueOf(viewType), new WeakReference(view));
            }
        }
        if (view == null) {
            vfm.f("SubContainerProvider ", "create dx pop view error");
            return null;
        }
        view.setTag(PopConst.DX_POP_USER_CONTEXT_TAG, obj);
        this.d.bindData(view, m);
        return view;
    }

    @Override // tb.pad
    public boolean l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed0191b3", new Object[]{this, view})).booleanValue();
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            return false;
        }
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return true;
    }

    public final BaseSectionModel m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("9188eb55", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return new SectionModel(jSONObject);
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebf83eba", new Object[]{this})).booleanValue();
        }
        return mve.a("enablePopViewCache", true);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            ((HashMap) this.f).clear();
        }
    }

    public void p(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39748e8", new Object[]{this, cfcVar});
            return;
        }
        this.f32346a = cfcVar;
        if (cfcVar != null) {
            this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
            this.c = (IContainerDataService) cfcVar.a(IContainerDataService.class);
            this.d = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        }
    }

    public void q(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad59f2d", new Object[]{this, frameLayout});
        } else {
            this.e = frameLayout;
        }
    }

    @Override // tb.bbd
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.scrollToPositionWithOffset(i, i2);
        }
    }
}
