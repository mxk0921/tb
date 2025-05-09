package com.taobao.message.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.coj;
import tb.n78;
import tb.scc;
import tb.t2o;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageTabNavProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MessageTabNavProcessor";

    static {
        t2o.a(530579505);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return TAG;
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
        if (!(intent == null || intent.getExtras() == null)) {
            String string = intent.getExtras().getString(coj.KEY_REDIRECT_SOURCE_URI);
            if (!TextUtils.isEmpty(string) && string.contains(MessageNavProcessorV2.ROUTE_URL_MESSAGETAB) && ((scc) n78.a(scc.class)).b("newBarVersion_newUser")) {
                TLog.loge(TAG, "change url| originUrl".concat(string));
                intent.setData(Uri.parse("http://m.taobao.com/go/msgcentercategory"));
            }
        }
        return true;
    }
}
