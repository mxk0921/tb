package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.base.BaseActivity;
import com.taobao.android.order.bundle.helper.rec.OrderRecommendWrapper;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tnn extends sz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TAG = "native$recommend";
    public static final z9e CREATOR = new a();
    public zw d = null;
    public final ViewEngine e;
    public JSONObject f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements z9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z9e
        public sz a(ViewEngine viewEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sz) ipChange.ipc$dispatch("345e20e7", new Object[]{this, viewEngine});
            }
            return new tnn(viewEngine);
        }
    }

    static {
        t2o.a(713031916);
    }

    public tnn(ViewEngine viewEngine) {
        super(viewEngine);
        this.e = viewEngine;
    }

    public static /* synthetic */ Object ipc$super(tnn tnnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/view/RecommendHolder");
    }

    @Override // tb.sz
    public void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbfb67", new Object[]{this, iDMComponent});
            return;
        }
        lor.c("RecommendHolder", "onBindData", iDMComponent.getFields().toJSONString());
        if (iDMComponent.getFields() != null && this.d != null) {
            lor.c("RecommendHolder", "onBindData", iDMComponent.getFields().toJSONString());
            if (iDMComponent.getFields() != this.f) {
                ViewEngine viewEngine = this.e;
                iDMComponent.getFields().put("fromPageType", (Object) ((viewEngine == null || !(viewEngine.K() instanceof BaseActivity)) ? null : ((BaseActivity) this.e.K()).t1()));
                this.d.g(iDMComponent.getFields(), "");
                this.f = iDMComponent.getFields();
            }
        }
    }

    @Override // tb.sz
    public View e(ViewGroup viewGroup) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
        }
        lor.d("RecommendHolder", "onCreateView", "render", "页面渲染", "加载成功");
        if (o9l.a()) {
            OrderRecommendWrapper orderRecommendWrapper = new OrderRecommendWrapper((OrderRecyclerView) this.e.Z(), this.e.K(), OrderRecommendWrapper.RecType.GUESS, "", null);
            this.d = orderRecommendWrapper;
            orderRecommendWrapper.c(false);
            if (this.e.K() instanceof TBOrderDetailActivity) {
                ((TBOrderDetailActivity) this.e.K()).g4(this.d);
            }
        }
        if (viewGroup == null) {
            context = this.e.K();
        } else {
            context = viewGroup.getContext();
        }
        return new View(context);
    }
}
