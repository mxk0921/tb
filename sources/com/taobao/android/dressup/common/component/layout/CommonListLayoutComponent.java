package com.taobao.android.dressup.common.component.layout;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.outer.DressupListComponent;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.dressup.common.model.RootModel;
import com.taobao.android.dressup.common.service.data.CommonDataService;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import java.util.List;
import kotlin.a;
import tb.amb;
import tb.byb;
import tb.ckf;
import tb.eyb;
import tb.fwa;
import tb.njg;
import tb.qpu;
import tb.sod;
import tb.t2o;
import tb.uun;
import tb.vjc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommonListLayoutComponent extends fwa<PageModel, FrameLayout> implements eyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public fwa<CardModel, View> e;
    public DressupListComponent f;
    public fwa<CardModel, View> g;
    public final njg h;

    static {
        t2o.a(918552617);
        t2o.a(919601268);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonListLayoutComponent(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        this.h = a.b(new CommonListLayoutComponent$pageBusinessId$2(qpuVar));
    }

    public static /* synthetic */ Object ipc$super(CommonListLayoutComponent commonListLayoutComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -560092455) {
            super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
            return null;
        } else if (hashCode == -128189347) {
            super.onCreate(objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
            return null;
        } else if (hashCode == 916714806) {
            super.updateDataImpl(objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dressup/common/component/layout/CommonListLayoutComponent");
        }
    }

    public static /* synthetic */ void x(CommonListLayoutComponent commonListLayoutComponent, PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc74d52", new Object[]{commonListLayoutComponent, pageModel, iComponentLifecycle$TriggerType, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 2) != 0) {
                iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.UNSPECIFIED;
            }
            commonListLayoutComponent.w(pageModel, iComponentLifecycle$TriggerType);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initComponentTree");
        }
    }

    /* renamed from: A */
    public void updateDataImpl(PageModel pageModel) {
        fwa<CardModel, View> fwaVar;
        DressupListComponent dressupListComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb808807", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        super.updateDataImpl(pageModel);
        sod service = o().getService(byb.class);
        if (service != null) {
            CommonDataService commonDataService = (CommonDataService) service;
            CardModel N1 = commonDataService.N1(pageModel);
            if (N1 != null) {
                if (!y()) {
                    fwa<CardModel, View> fwaVar2 = this.e;
                    if (fwaVar2 != null) {
                        fwaVar2.updateData(N1);
                    }
                } else {
                    return;
                }
            }
            List<CardModel> M1 = commonDataService.M1(pageModel);
            if (!(M1 == null || (dressupListComponent = this.f) == null)) {
                dressupListComponent.updateData(M1);
            }
            CardModel U0 = commonDataService.U0(pageModel);
            if (U0 != null && (fwaVar = this.g) != null) {
                fwaVar.updateData(U0);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.service.data.CommonDataService");
    }

    @Override // tb.eyb
    public void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0098e0", new Object[]{this, obj});
            return;
        }
        if (!(obj instanceof PageModel)) {
            obj = null;
        }
        PageModel pageModel = (PageModel) obj;
        if (pageModel != null) {
            updateData(pageModel);
        }
    }

    @Override // tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return "root";
    }

    @Override // tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        sod service = o().getService(byb.class);
        if (service != null) {
            ((CommonDataService) service).T0(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.service.data.CommonDataService");
    }

    public final fwa<CardModel, View> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("d48c21a6", new Object[]{this});
        }
        return this.g;
    }

    public final DressupListComponent t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DressupListComponent) ipChange.ipc$dispatch("d4782663", new Object[]{this});
        }
        return this.f;
    }

    public final String u() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("a4e75d19", new Object[]{this});
        } else {
            value = this.h.getValue();
        }
        return (String) value;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdf55c67", new Object[]{this})).booleanValue();
        }
        fwa I = ((vjc) o().getService(vjc.class)).I();
        if (I instanceof uun) {
            return ((uun) I).F();
        }
        return false;
    }

    public void w(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df09acc", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        sod service = o().getService(byb.class);
        if (service != null) {
            CommonDataService commonDataService = (CommonDataService) service;
            amb ambVar = (amb) o().getService(amb.class);
            CardModel N1 = commonDataService.N1(pageModel);
            if (N1 != null) {
                fwa<CardModel, View> b0 = ambVar.b0(N1);
                this.e = b0;
                ckf.d(b0);
                b0.onCreate(N1, iComponentLifecycle$TriggerType);
                fwa<CardModel, View> fwaVar = this.e;
                ckf.d(fwaVar);
                k(fwaVar);
            }
            List<CardModel> M1 = commonDataService.M1(pageModel);
            DressupListComponent dressupListComponent = new DressupListComponent(o());
            this.f = dressupListComponent;
            dressupListComponent.onCreate(M1, iComponentLifecycle$TriggerType);
            DressupListComponent dressupListComponent2 = this.f;
            ckf.d(dressupListComponent2);
            k(dressupListComponent2);
            CardModel U0 = commonDataService.U0(pageModel);
            if (U0 != null) {
                fwa<CardModel, View> b02 = ambVar.b0(U0);
                this.g = b02;
                ckf.d(b02);
                b02.onCreate(U0, iComponentLifecycle$TriggerType);
                fwa<CardModel, View> fwaVar2 = this.g;
                ckf.d(fwaVar2);
                k(fwaVar2);
            }
            commonDataService.r(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.service.data.CommonDataService");
    }

    @Override // tb.eyb
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e1d39a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        RecyclerView C;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView C2;
        RecyclerView.ItemAnimator itemAnimator2;
        RecyclerView C3;
        DressupListComponent dressupListComponent;
        RecyclerView C4;
        RecyclerView C5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        fwa<CardModel, View> fwaVar = this.e;
        if (fwaVar != null) {
            linearLayout.addView(fwaVar.createView(), new LinearLayout.LayoutParams(-1, -2));
        }
        DressupListComponent dressupListComponent2 = this.f;
        if (dressupListComponent2 != null) {
            linearLayout.addView(dressupListComponent2.createView(), new LinearLayout.LayoutParams(-1, -1));
        }
        fwa<CardModel, View> fwaVar2 = this.g;
        if (fwaVar2 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(fwaVar2.createView(), layoutParams);
        }
        PageModel data = getData();
        if (data != null) {
            updateData(data);
        }
        if (TextUtils.equals(u(), DressupListComponent.BIZ_DRESS_UP_DETAIL)) {
            DressupListComponent dressupListComponent3 = this.f;
            if (!(dressupListComponent3 == null || (C5 = dressupListComponent3.C()) == null)) {
                C5.setBackgroundColor(-1);
            }
        } else if (!(!TextUtils.equals(u(), DressupListComponent.BIZ_DRESS_UP_FLOW) || (dressupListComponent = this.f) == null || (C4 = dressupListComponent.C()) == null)) {
            C4.setBackgroundColor(0);
        }
        DressupListComponent dressupListComponent4 = this.f;
        if (!(dressupListComponent4 == null || (C3 = dressupListComponent4.C()) == null)) {
            C3.setItemAnimator(new DefaultItemAnimator());
        }
        DressupListComponent dressupListComponent5 = this.f;
        if (!(dressupListComponent5 == null || (C2 = dressupListComponent5.C()) == null || (itemAnimator2 = C2.getItemAnimator()) == null)) {
            itemAnimator2.setChangeDuration(0L);
        }
        DressupListComponent dressupListComponent6 = this.f;
        if (!(dressupListComponent6 == null || (C = dressupListComponent6.C()) == null || (itemAnimator = C.getItemAnimator()) == null)) {
            itemAnimator.setMoveDuration(0L);
        }
        return frameLayout;
    }

    /* renamed from: z */
    public void onCreate(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5234f7c", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(pageModel, iComponentLifecycle$TriggerType);
        x(this, pageModel, null, 2, null);
    }

    public final boolean y() {
        JSONArray forbidRefreshContainers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558a380e", new Object[]{this})).booleanValue();
        }
        if (!v()) {
            return false;
        }
        Object s = ((byb) o().getService(byb.class)).s();
        if (s != null) {
            RootModel rootModel = ((PageModel) s).getRootModel();
            if (rootModel == null || (forbidRefreshContainers = rootModel.getForbidRefreshContainers()) == null || forbidRefreshContainers.isEmpty()) {
                return false;
            }
            int size = forbidRefreshContainers.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z = TextUtils.equals(forbidRefreshContainers.getString(i), "topBar");
            }
            return z;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.PageModel");
    }
}
