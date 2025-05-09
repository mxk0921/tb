package tb;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.framework.container.PluginInfo;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class r9g extends e8g implements x9e, q3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PluginInfo f;
    public View g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f27209a;

        public a(JSONObject jSONObject) {
            this.f27209a = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            r9g.this.i0();
            JSONObject jSONObject = this.f27209a;
            if (jSONObject != null) {
                String string = jSONObject.getString("clickUTName");
                if (!TextUtils.isEmpty(string)) {
                    r9g.this.s().f(string, r9g.this.X("clickUTName"));
                }
            }
        }
    }

    static {
        t2o.a(511705490);
        t2o.a(511705487);
        t2o.a(511705486);
    }

    public static /* synthetic */ Object ipc$super(r9g r9gVar, String str, Object... objArr) {
        if (str.hashCode() == 1135586760) {
            return super.i();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/LCPlugin");
    }

    public void M(b8g b8gVar, PluginInfo pluginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8d7bdb", new Object[]{this, b8gVar, pluginInfo});
            return;
        }
        G(b8gVar);
        this.f = pluginInfo;
        Z(pluginInfo.params);
    }

    public void N(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0b4cab", new Object[]{this, viewGroup});
            return;
        }
        View g0 = g0(viewGroup);
        if (W() == null) {
            viewGroup.addView(g0);
        } else {
            viewGroup.addView(g0, W());
        }
        this.g = g0;
    }

    public boolean O(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96b643ac", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null) {
            return false;
        }
        ebg.l(this.d, Localization.q(R.string.gg_pub_data_exception_retry_soon));
        return true;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58d09a6d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final q3e Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3e) ipChange.ipc$dispatch("6bcea97a", new Object[]{this});
        }
        if (i() == null) {
            return this;
        }
        if (i().i() == null) {
            return (q3e) i();
        }
        b8g b8gVar = this;
        while (b8gVar.i().i() != null) {
            b8gVar = b8gVar.i();
        }
        return (q3e) b8gVar;
    }

    public <T extends q3e> T R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((q3e) ipChange.ipc$dispatch("55f96cbc", new Object[]{this, str}));
        }
        q3e Q = Q();
        if (Q == null) {
            return null;
        }
        return (T) Q.d(str);
    }

    public void S(h8g h8gVar, y7g y7gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afefcb3e", new Object[]{this, h8gVar, y7gVar});
        } else {
            ((k8m) i()).N(h8gVar, y7gVar);
        }
    }

    public View T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("aa5d41ca", new Object[]{this});
        }
        return this.g;
    }

    public String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        if (TextUtils.isEmpty(V().name)) {
            return "undefine";
        }
        return V().name;
    }

    public PluginInfo V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PluginInfo) ipChange.ipc$dispatch("698ebb76", new Object[]{this});
        }
        return this.f;
    }

    public ViewGroup.LayoutParams W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6c251dad", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4e12f4f", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", muu.j(this.d));
        return hashMap;
    }

    public abstract void Y(h8g h8gVar, y7g y7gVar);

    public abstract void Z(JSONObject jSONObject);

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20856d1c", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(Resource.TYPE_TEMPLATE_LITE, muu.i(this.d));
    }

    public boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.q3e
    public <T extends q3e> T d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((q3e) ipChange.ipc$dispatch("ff1b39be", new Object[]{this, str}));
        }
        if (!TextUtils.equals(str, "undefine") && TextUtils.equals(str, U())) {
            return this;
        }
        return null;
    }

    public void d0(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d64d190", new Object[]{this, v8eVar});
        } else {
            ((k8m) i()).S(v8eVar);
        }
    }

    public void e0(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c604af76", new Object[]{this, v8eVar});
        } else {
            ((k8m) i()).T(v8eVar);
        }
    }

    public void f0() {
        PluginInfo V;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (c0() && (V = V()) != null && (jSONObject = V.params) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("utParams");
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("exposeUTName");
                if (!TextUtils.isEmpty(string)) {
                    s().j(string, X("exposeUTName"));
                }
            }
            if (P()) {
                ViewProxy.setOnClickListener(T(), new a19(new a(jSONObject2)));
            }
        }
    }

    public View g0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d837ae44", new Object[]{this, viewGroup});
        }
        return LayoutInflater.from(this.d).inflate(c(), viewGroup, false);
    }

    @Override // tb.q3e
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.g;
    }

    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.e8g, tb.b8g
    public b8g i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8g) ipChange.ipc$dispatch("43afadc8", new Object[]{this});
        }
        return super.i();
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795586f6", new Object[]{this});
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void k0(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ceb313a", new Object[]{this, v8eVar});
        }
    }

    public void l0(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58b0f20", new Object[]{this, v8eVar});
        }
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }
}
