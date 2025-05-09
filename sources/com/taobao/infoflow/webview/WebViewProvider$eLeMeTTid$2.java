package com.taobao.infoflow.webview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.b5b;
import tb.d1a;
import tb.mve;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WebViewProvider$eLeMeTTid$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WebViewProvider$eLeMeTTid$2 INSTANCE = new WebViewProvider$eLeMeTTid$2();

    public WebViewProvider$eLeMeTTid$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(WebViewProvider$eLeMeTTid$2 webViewProvider$eLeMeTTid$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/webview/WebViewProvider$eLeMeTTid$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this}) : mve.d(b5b.ELEME_PREFETCH_TTID, "h5@Web_iphone_11.22.1");
    }
}
