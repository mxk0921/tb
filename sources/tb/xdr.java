package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.hudong.TBHDActivity;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xdr implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1031798795);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TBHDNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (!(uri == null || zmjVar == null || !myu.INSTANCE.d(uri, intent))) {
            zmjVar.x(zmjVar.d().getPackageName());
            zmjVar.r(TBHDActivity.class.getName());
            intent.setPackage(zmjVar.d().getPackageName());
            intent.setClassName(zmjVar.d(), TBHDActivity.class.getName());
            intent.putExtra("hdRouteStart", currentTimeMillis);
            a(uri, intent);
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void a(Uri uri, Intent intent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa7b8d8", new Object[]{this, uri, intent});
            return;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ckf.f(queryParameterNames, "uri.queryParameterNames");
        if (!queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (kfp.h("_ariver_appid", "_wml_code", "uniapp_id").contains(str)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        String path = uri.getPath();
        boolean z2 = path != null && wsq.O(path, "/wow/z/uniapp", false, 2, null);
        if (z || z2) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            Set<String> queryParameterNames2 = uri.getQueryParameterNames();
            ckf.f(queryParameterNames2, "uri.queryParameterNames");
            for (String str2 : queryParameterNames2) {
                if (!ckf.b(str2, "_ariver_appid") && !ckf.b(str2, "_wml_code") && !ckf.b(str2, "uniapp_id")) {
                    buildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
                }
            }
            String path2 = uri.getPath();
            if (path2 != null && wsq.O(path2, "/wow/z/uniapp", false, 2, null)) {
                buildUpon.authority("hudong.taobao.com");
                buildUpon.path("index.html");
            }
            intent.setData(buildUpon.build());
        }
    }
}
