package tb;

import android.view.MenuItem;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_ability.page.a;
import com.taobao.android.weex_ability.page.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lwh implements MenuItem.OnMenuItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23613a;
    public final /* synthetic */ jwh b;

    public lwh(jwh jwhVar, b bVar) {
        this.b = jwhVar;
        this.f23613a = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        int i = -1;
        if (!(menuItem == null || menuItem.getIntent() == null)) {
            try {
                i = menuItem.getIntent().getIntExtra("index", -1);
            } catch (Exception unused) {
            }
        }
        if (i >= 0) {
            jSONObject.put("index", (Object) Integer.valueOf(i));
            a.AbstractC0517a aVar = this.f23613a.g;
            if (aVar != null) {
                aVar.a(i);
            } else {
                jwh.E(this.b).s2(MSHCNavAdapter.f, jSONObject);
            }
        }
        return true;
    }
}
