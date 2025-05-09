package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel;
import java.util.ArrayList;
import java.util.List;
import tb.bbd;
import tb.dbd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z28 implements dbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32479a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements bbd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dbd.a f32480a;
        public final /* synthetic */ List b;

        public a(z28 z28Var, dbd.a aVar, List list) {
            this.f32480a = aVar;
            this.b = list;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            dbd.a aVar = this.f32480a;
            if (aVar != null) {
                aVar.onSuccess(this.b);
            }
        }
    }

    @Override // tb.dbd
    public void a(ViewGroup viewGroup, View view, int i) {
        DXEvent dXEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcdf1ac", new Object[]{this, viewGroup, view, new Integer(i)});
            return;
        }
        DXWidgetNode c = tcm.c(view);
        if (c != null) {
            if (i == 0 && this.f32479a) {
                dXEvent = new DXEvent(-962581640L);
                this.f32479a = false;
            } else if (i == 0 || this.f32479a) {
                dXEvent = null;
            } else {
                dXEvent = new DXEvent(-1609878593L);
                this.f32479a = true;
            }
            if (dXEvent != null) {
                c.sendBroadcastEvent(dXEvent);
            }
        }
    }

    @Override // tb.dbd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
        }
    }

    @Override // tb.dbd
    public View c(View view, int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46e16d14", new Object[]{this, view, new Integer(i), iPopData});
        }
        return view;
    }

    @Override // tb.dbd
    public View d(ViewGroup viewGroup, IPopData iPopData, e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b2cfb7b", new Object[]{this, viewGroup, iPopData, e3bVar});
        }
        BasePopSectionModel fetchPopSection = iPopData.fetchPopSection();
        if (fetchPopSection == null || fetchPopSection.getTemplate() == null) {
            vfm.f("DxPopViewProvider ", "render dx pop error, section is empty");
            return null;
        } else if (e3bVar == null) {
            vfm.f("DxPopViewProvider ", "render dx pop error, engine is empty");
            return null;
        } else {
            View k = e3bVar.k().k(viewGroup, fetchPopSection, new scm(e3bVar, iPopData));
            vfm.c("DxPopViewProvider ", "create dx pop view success，" + fetchPopSection.getTemplate().toJSONString());
            vhm.f(fetchPopSection, null);
            return k;
        }
    }

    @Override // tb.dbd
    public View e(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9ffa72dc", new Object[]{this, view, new Long(j)});
        }
        return view;
    }

    @Override // tb.dbd
    public View f(View view, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("22a43b90", new Object[]{this, view, str, iPopData});
        }
        DXWidgetNode c = tcm.c(view);
        if (c == null) {
            return view;
        }
        long a2 = tcm.a(str);
        if (a2 == -1) {
            return view;
        }
        c.sendBroadcastEvent(new DXEvent(a2));
        return view;
    }

    @Override // tb.dbd
    public boolean g(View view, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fecc78a", new Object[]{this, view, iPopData})).booleanValue();
        }
        if (iPopData != null && iPopData.valid() && (view instanceof DXRootView)) {
            DXRootView dXRootView = (DXRootView) view;
            BasePopTemplateModel template = iPopData.fetchPopSection().getTemplate();
            if (!(template == null || dXRootView.getDxTemplateItem() == null)) {
                return !TextUtils.equals(template.getVersion(), String.valueOf(dXRootView.getDxTemplateItem().b));
            }
        }
        return false;
    }

    @Override // tb.dbd
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        }
    }

    @Override // tb.dbd
    public void h(e3b e3bVar, List<IPopData> list, dbd.a aVar) {
        BasePopSectionModel fetchPopSection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f314c1", new Object[]{this, e3bVar, list, aVar});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (IPopData iPopData : list) {
                if (iPopData.isAllowShow() && iPopData.getPopConfig().getPopContentType() == 1 && (fetchPopSection = iPopData.fetchPopSection()) != null) {
                    fetchPopSection.getExt().put("businessId", (Object) iPopData.getBusinessID());
                    arrayList.add(fetchPopSection);
                }
            }
            if (!arrayList.isEmpty()) {
                vfm.f("DxPopViewProvider ", "preload dx templates, size=" + arrayList.size());
                e3bVar.k().f(arrayList, new a(this, aVar, list));
            }
        }
    }
}
