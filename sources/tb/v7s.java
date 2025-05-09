package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tmgcashier.TMGCashierActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v7s implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(860880898);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TMGNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null && data.isHierarchical() && "true".equals(data.getQueryParameter("tmg_container"))) {
            z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_router_block", "url=" + data);
            String uri = data.toString();
            if (uri.contains("renderType=2") && !uri.contains("wh_weex=true")) {
                uri = data.buildUpon().appendQueryParameter("wh_weex", "true").build().toString();
            }
            if (!TextUtils.isEmpty(uri) && uri.contains("renderType=2")) {
                intent.setClass(zmjVar.d(), TMGCashierActivity.class);
                intent.setData(Uri.parse(uri));
            } else if (!TextUtils.isEmpty(uri) && !uri.contains("wh_weex=true")) {
                intent.setClass(zmjVar.d(), TMGCashierActivity.class);
                intent.putExtra("hasNavBar", uri.contains("hasNavBar=1") ? 1 : 0);
                intent.putExtra("url", uri);
            }
        }
        return true;
    }
}
