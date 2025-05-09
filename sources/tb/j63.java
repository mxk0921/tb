package tb;

import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_framework.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class j63 extends MSHCNavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final AppCompatActivity h;

    static {
        t2o.a(481296643);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j63(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        ckf.g(appCompatActivity, "activity");
        this.h = appCompatActivity;
    }

    public static /* synthetic */ Object ipc$super(j63 j63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/CaptureMUSNavBarAdapter");
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("7b1d496a", new Object[]{this, aVar});
        }
        return new lq0(Integer.valueOf(ipj.INSTANCE.a(this.h)).toString(), "");
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("abb1de95", new Object[]{this, aVar});
        }
        Integer b = ipj.INSTANCE.b(this.h);
        if (b == null) {
            return null;
        }
        return new lq0(b.toString(), "");
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 c(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("c01c1684", new Object[]{this, aVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 d(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("bfeda8ed", new Object[]{this, aVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public boolean e(a aVar, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc326d08", new Object[]{this, aVar, menu})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 f(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("36fe40fb", new Object[]{this, aVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 j(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("835bc75a", new Object[]{this, aVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 l(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("f8d6e2bb", new Object[]{this, aVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 m(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("2957d368", new Object[]{this, aVar, jSONObject});
        }
        return null;
    }
}
