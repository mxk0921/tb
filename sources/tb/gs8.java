package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.extend.ExtendClickLink;
import com.taobao.muniontaobaosdk.util.TaoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gs8 extends ExtendClickLink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118755);
    }

    public gs8(ExtendClickLink.a aVar) {
        super(aVar);
    }

    public static /* synthetic */ Object ipc$super(gs8 gs8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/click/extend/brand/ExtendBrandClickLink");
    }

    @Override // com.taobao.alimama.click.extend.ExtendClickLink
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8196b7b", new Object[]{this});
        }
        try {
            TaoLog.Logd("AlimamaSdk", this.d);
            if (TextUtils.isEmpty(this.d)) {
                return "mtop.ali.ad.settle.tanx.click";
            }
            Uri parse = Uri.parse(this.d);
            String host = parse.getHost();
            if (TextUtils.isEmpty(host)) {
                return "mtop.ali.ad.settle.tanx.click";
            }
            if (host.equals("click.tanx.com")) {
                TaoLog.Logd("AlimamaSdk", "return default old host : mtop.ali.ad.settle.tanx.click");
                return "mtop.ali.ad.settle.tanx.click";
            }
            String queryParameter = parse.getQueryParameter("mtop_api");
            if (!TextUtils.isEmpty(queryParameter)) {
                TaoLog.Logd("AlimamaSdk", "return mtop_host : " + queryParameter);
                return queryParameter;
            }
            TaoLog.Logd("AlimamaSdk", "return defalut brand host : mtop.ali.ad.settle.brand.log");
            return "mtop.ali.ad.settle.brand.log";
        } catch (Exception e) {
            e.printStackTrace();
            TaoLog.Logd("AlimamaSdk", "Exception return defalut old host : mtop.ali.ad.settle.tanx.click");
            return "mtop.ali.ad.settle.tanx.click";
        }
    }
}
