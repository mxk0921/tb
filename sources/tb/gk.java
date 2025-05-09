package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.redirect.mega")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gk implements jbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f20052a;
    public lo b;
    public String c;
    public AURAGlobalData d;
    public hbb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(gk gkVar) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            }
        }
    }

    static {
        t2o.a(81789067);
        t2o.a(80740436);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.b = loVar;
        this.c = loVar.d();
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.e = hbbVar;
        AbilityHubAdapter abilityHubAdapter = (AbilityHubAdapter) aURAGlobalData.get("megaAbilityAdapter", AbilityHubAdapter.class);
        lo loVar = this.b;
        if (loVar != null) {
            this.f20052a = loVar.f();
        }
        if (abilityHubAdapter == null) {
            String str = this.c;
            if (str == null) {
                str = "aura";
            }
            zq zqVar = new zq(str, "aura");
            zqVar.a(this.f20052a);
            aURAGlobalData.update("megaAbilityAdapter", new AbilityHubAdapter(zqVar));
        }
        this.d = aURAGlobalData;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final void x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
            return;
        }
        hbb hbbVar = this.e;
        if (hbbVar != null) {
            hbbVar.b(new mi(1, "AURAEventServiceDomain", str, str2));
        }
    }

    public final View r(Context context, AURAGlobalData aURAGlobalData, AURARenderComponent aURARenderComponent) {
        View view;
        RecyclerView recyclerView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("29a39174", new Object[]{this, context, aURAGlobalData, aURARenderComponent});
        }
        View view2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() != null) {
                view = activity.getWindow().getDecorView();
                recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
                if (recyclerView != null || recyclerView.getLayoutManager() == null) {
                    ck.g().e("AURAMegaEventRedirectExtensionImpl.findTriggerView:recyclerView or layoutManager is null");
                    return view;
                }
                List list = (List) aURAGlobalData.get("render_view_item_models", List.class);
                if (list == null) {
                    ck.g().e("AURAMegaEventRedirectExtensionImpl.findTriggerView:renderTree is null");
                    return view;
                } else if (aURARenderComponent == null) {
                    ck.g().e("AURAMegaEventRedirectExtensionImpl.findTriggerView:component is null");
                    return view;
                } else {
                    while (true) {
                        if (i >= list.size()) {
                            break;
                        }
                        Object obj = list.get(i);
                        if ((obj instanceof AURARenderComponent) && TextUtils.equals(((AURARenderComponent) obj).key, aURARenderComponent.key)) {
                            view2 = recyclerView.getLayoutManager().findViewByPosition(i);
                            break;
                        }
                        i++;
                    }
                    return view2 == null ? view : view2;
                }
            }
        }
        view = null;
        recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        if (recyclerView != null) {
        }
        ck.g().e("AURAMegaEventRedirectExtensionImpl.findTriggerView:recyclerView or layoutManager is null");
        return view;
    }

    @Override // tb.jbb
    public boolean o0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e24416c5", new Object[]{this, aURAEventIO})).booleanValue();
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null) {
            x("redirectMega", "mGlobalData 为空");
            ck.g().e("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:mGlobalData is null");
            return false;
        }
        AbilityHubAdapter abilityHubAdapter = (AbilityHubAdapter) aURAGlobalData.get("megaAbilityAdapter", AbilityHubAdapter.class);
        if (abilityHubAdapter == null) {
            x("redirectMega", "adapter 为空");
            ck.g().e("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:adapter is null");
            return false;
        }
        String eventType = aURAEventIO.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            x("redirectMega", "eventType is empty");
            ck.g().e("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:eventType is empty");
            return false;
        }
        String[] split = eventType.split("\\.");
        if (split == null || split.length < 2) {
            x("redirectMega", "eventType is invalid");
            ck.g().e("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:eventType is invalid");
            return false;
        }
        String str = split[0];
        String str2 = split[1];
        xq xqVar = new xq();
        View r = r(this.f20052a, this.d, aURAEventIO.getEventModel().j());
        if (r != null) {
            xqVar.p(r);
        }
        ExecuteResult z = abilityHubAdapter.z(str, str2, xqVar, aURAEventIO.getEventModel().c(), new a(this));
        if (!(z instanceof ErrorResult)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" 执行失败，case ：");
        ErrorResult errorResult = (ErrorResult) z;
        sb.append(errorResult.getCode());
        x("redirectMega", sb.toString());
        rbb g = ck.g();
        g.e("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:result error:" + errorResult.getCode());
        return false;
    }
}
