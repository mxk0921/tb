package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import tb.ckf;
import tb.d1a;
import tb.knv;
import tb.l4n;
import tb.lvc;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()Ltb/xhv;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PageTabsInterceptor$doNav$doNavAction$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $publishConfig;
    public final /* synthetic */ PageTabsInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageTabsInterceptor$doNav$doNavAction$1(PageTabsInterceptor pageTabsInterceptor, JSONObject jSONObject, Context context) {
        super(0);
        this.this$0 = pageTabsInterceptor;
        this.$publishConfig = jSONObject;
        this.$context = context;
    }

    public static /* synthetic */ Object ipc$super(PageTabsInterceptor$doNav$doNavAction$1 pageTabsInterceptor$doNav$doNavAction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/nav/interceptor/PageTabsInterceptor$doNav$doNavAction$1");
    }

    @Override // tb.d1a
    public final xhv invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c1e1c5fe", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(l4n.f23108a, this.this$0.c(this.$publishConfig));
        Uri e = knv.e(UmiWvPlugin.NEW_RECORD_PATH_DIRECT, jSONObject);
        ckf.f(e, "UriUtil.buildUriWithUrlA…rd_directly.html\", query)");
        Nav.from(this.$context).toUri(e);
        lvc e2 = this.this$0.e();
        if (e2 == null) {
            return null;
        }
        lvc.a.a(e2, "short_chain_success", this.this$0.f(), null, 4, null);
        return xhv.INSTANCE;
    }
}
