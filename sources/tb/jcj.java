package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.DebugFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jcj extends j4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793743);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcj(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
    }

    public static /* synthetic */ Object ipc$super(jcj jcjVar, String str, Object... objArr) {
        if (str.hashCode() == -2054453127) {
            super.onEventMainThread((zxo) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/popup/MusPopupWidget");
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        DebugFrameLayout debugFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (c().g().isDebug()) {
            DebugFrameLayout debugFrameLayout2 = new DebugFrameLayout(getActivity());
            debugFrameLayout2.setDebugClickListener(new DebugFrameLayout.a(this) { // from class: tb.yfz
            });
            debugFrameLayout = debugFrameLayout2;
        } else {
            debugFrameLayout = new FrameLayout(getActivity());
        }
        debugFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return debugFrameLayout;
    }

    @Override // tb.m8j
    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    @Override // tb.j4p
    public void onEventMainThread(u2p u2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa51d788", new Object[]{this, u2pVar});
            return;
        }
        ckf.g(u2pVar, "before");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "research", String.valueOf(u2pVar.b()));
        this.c.x().sendInstanceMessage("MUISE", "requestStart", jSONObject);
    }

    @Override // tb.m8j
    public void onEventMainThread(zxo zxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858b8879", new Object[]{this, zxoVar});
            return;
        }
        ckf.g(zxoVar, "scrollStart");
        super.onEventMainThread(zxoVar);
        this.c.x().sendInstanceMessage("MUISE", "pageStartScroll", null);
    }
}
