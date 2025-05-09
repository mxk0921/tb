package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wp8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lrp implements wp8.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23532a;

    static {
        t2o.a(729809724);
        t2o.a(329252915);
    }

    @Override // tb.wp8.b
    public String a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7d44af5", new Object[]{this, context, intent});
        }
        if (intent == null) {
            return String.valueOf(false);
        }
        return String.valueOf(e(intent));
    }

    public final boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22f0e12", new Object[]{this, uri})).booleanValue();
        }
        return "/awp/base/newcart.htm".equals(uri.getPath());
    }

    public final boolean d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f294268a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (f23532a) {
            return false;
        }
        f23532a = true;
        if (i <= i2) {
            return true;
        }
        return false;
    }

    public final boolean e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f25e89bf", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        int b = b();
        int b2 = dqm.b(z4a.REC_CART.f32522a);
        if (c(data)) {
            return d(b, b2);
        }
        if (b <= b2) {
            return true;
        }
        return false;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6768fae", new Object[]{this})).intValue();
        }
        JSONObject a2 = mh0.a(z4a.REC_CART.f32522a);
        if (a2 != null) {
            return a2.getIntValue("count");
        }
        uqa.b("recmdPrefetch", "ShoppingCartRecmdPrefetchParser", "sceneInfo == null");
        return 0;
    }
}
