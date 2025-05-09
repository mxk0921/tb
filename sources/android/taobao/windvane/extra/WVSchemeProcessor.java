package android.taobao.windvane.extra;

import android.text.TextUtils;
import anet.channel.strategy.StrategyCenter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h1p;
import tb.itw;
import tb.qsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVSchemeProcessor implements qsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855929);
        t2o.a(989856468);
    }

    @Override // tb.qsw
    public String dealUrlScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849ca447", new Object[]{this, str});
        }
        try {
            if (!TextUtils.isEmpty(str) && !str.startsWith("javascript:") && !str.equals("about:blank")) {
                String formalizeUrl = StrategyCenter.getInstance().getFormalizeUrl(str);
                v7t.d("Processor", "WVSchemeProcesor deal url, origin_url=[" + str + "], new_url=[" + formalizeUrl + "]");
                return TextUtils.isEmpty(formalizeUrl) ? str : formalizeUrl;
            }
            return str;
        } catch (Throwable unused) {
            v7t.d("WVSchemeProcessor", "Can not dealUrlScheme : " + str);
            return str.startsWith(itw.URL_SEPARATOR) ? str.replaceFirst(itw.URL_SEPARATOR, h1p.HTTP_PREFIX) : str;
        }
    }
}
