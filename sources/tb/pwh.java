package tb;

import android.view.MenuItem;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_ability.page.a;
import com.taobao.android.weex_ability.page.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pwh implements MenuItem.OnMenuItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f26358a;
    public final /* synthetic */ jwh b;

    public pwh(jwh jwhVar, b bVar) {
        this.b = jwhVar;
        this.f26358a = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
        }
        a.AbstractC0517a aVar = this.f26358a.g;
        if (aVar != null) {
            aVar.a(0);
        } else {
            jwh.G(this.b).s2(MSHCNavAdapter.e, new JSONObject());
        }
        return true;
    }
}
