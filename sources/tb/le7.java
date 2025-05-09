package tb;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class le7 extends sz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z9e CREATOR = new a();
    public View d;

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
            return new le7(viewEngine);
        }
    }

    static {
        t2o.a(713031914);
    }

    public le7(ViewEngine viewEngine) {
        super(viewEngine);
    }

    public static /* synthetic */ Object ipc$super(le7 le7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/view/DetailBundleLineHolder");
    }

    @Override // tb.sz
    public void d(IDMComponent iDMComponent) {
        JSONObject i;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbfb67", new Object[]{this, iDMComponent});
            return;
        }
        ViewEngine viewEngine = this.f28365a;
        if (viewEngine != null && viewEngine.N() != null && this.f28365a.N().d() != null && (i = this.f28365a.N().d().i()) != null && (jSONObject = i.getJSONObject("css")) != null) {
            try {
                String string = jSONObject.getString("backGroundColor");
                String string2 = jSONObject.getString("cardGroupHeight");
                if (!TextUtils.isEmpty(string2)) {
                    this.d.getLayoutParams().height = f2u.f(this.d.getContext(), Integer.parseInt(string2));
                }
                if (!TextUtils.isEmpty(string)) {
                    this.d.setBackgroundColor(Color.parseColor(string));
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.sz
    public View e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
        }
        View inflate = LayoutInflater.from(this.f28365a.K()).inflate(R.layout.babel_order_bundle_line_layout, viewGroup, false);
        this.d = inflate;
        return inflate;
    }
}
