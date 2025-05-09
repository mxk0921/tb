package tb;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i97 extends tz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i97 INSTANCE = new i97();
    public String e;

    public static /* synthetic */ Object ipc$super(i97 i97Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/data/DefaultWebView");
    }

    @Override // tb.wbe
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f25b880", new Object[]{this, view})).booleanValue();
        }
        return view instanceof WebView;
    }

    @Override // tb.tz
    public int f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86cad9db", new Object[]{this, view})).intValue();
        }
        WebView webView = (WebView) view;
        String url = webView.getUrl();
        if (TextUtils.equals(this.e, url)) {
            return webView.getProgress();
        }
        this.e = url;
        return 0;
    }
}
