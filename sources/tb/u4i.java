package tb;

import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class u4i implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v4i f29135a;

    public u4i(v4i v4iVar) {
        this.f29135a = v4iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!r54.f(v4i.a(this.f29135a), v4i.b(this.f29135a))) {
            Map<String, String> uTProperties = this.f29135a.getUTProperties();
            ckf.d(uTProperties);
            uTProperties.put("spm", "a2141.b91375813.c1638791741528.d1638791741528");
            a1v.m("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_click", uTProperties);
            Bundle bundle = new Bundle();
            bundle.putBoolean("triver_close_activity_animation", true);
            Nav.from(v4i.a(this.f29135a)).withExtras(bundle).withFlags(65536).toUri(v4i.b(this.f29135a));
        }
    }
}
