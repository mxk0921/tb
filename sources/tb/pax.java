package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pax extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031838);
    }

    public static /* synthetic */ Object ipc$super(pax paxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/detail/WhetherToNativeOrderDetailTask");
    }

    /* renamed from: f */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        return !e(intent);
    }

    /* renamed from: g */
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ca31ec", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    public final boolean e(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a8f8723", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        String uri = data.toString();
        if (uri != null && uri.startsWith(itw.URL_SEPARATOR)) {
            data = Uri.parse("http:".concat(uri));
        }
        if (data != null && data.isHierarchical() && (("http".equals(data.getScheme()) || "https".equals(data.getScheme())) && "true".equals(data.getQueryParameter("hybrid")))) {
            return false;
        }
        if ("go".equals(data.getHost()) && "/order_detail".equals(data.getPath()) && ("taobao".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("tm.m.taobao.com".equals(data.getHost()) && "/order/order_detail.htm".equals(data.getPath()) && ("taobao".equals(data.getScheme()) || "https".equals(data.getScheme()) || "http".equals(data.getScheme()))) {
            return true;
        }
        if ("h5.m.taobao.com".equals(data.getHost()) && "/awp/mtb/odetail.htm".equals(data.getPath()) && ("taobao".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("trade.taobao.com".equals(data.getHost()) && "/trade/detail/trade_item_detail.htm".equals(data.getPath()) && ("taobao".equals(data.getScheme()) || "https".equals(data.getScheme()) || "http".equals(data.getScheme()))) {
            return true;
        }
        if (!"h5.wapa.taobao.com".equals(data.getHost()) || !"/mlapp/odetail.html".equals(data.getPath()) || (!"taobao".equals(data.getScheme()) && !"https".equals(data.getScheme()) && !"http".equals(data.getScheme()))) {
            return "h5.m.taobao.com".equals(data.getHost()) && "/mlapp/odetail.html".equals(data.getPath()) && ("taobao".equals(data.getScheme()) || "https".equals(data.getScheme()) || "http".equals(data.getScheme()));
        }
        return true;
    }
}
