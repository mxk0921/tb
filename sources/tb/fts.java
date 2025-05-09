package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.model.common.AccountInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fts implements ffb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092400);
        t2o.a(806354994);
    }

    @Override // tb.ffb
    public void a(Context context, AccountInfo accountInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3039ce35", new Object[]{this, context, accountInfo, new Boolean(z)});
            return;
        }
        String str = accountInfo.accountInfoUrl;
        if (!TextUtils.isEmpty(str)) {
            Nav.from(context).toUri(str);
        }
    }
}
