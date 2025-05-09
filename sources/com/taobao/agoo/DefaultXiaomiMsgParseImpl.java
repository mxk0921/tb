package com.taobao.agoo;

import android.content.Intent;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DefaultXiaomiMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933278);
        t2o.a(343933272);
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdc22e73", new Object[]{this});
        }
        return "xiaomi";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        try {
            String str = (String) PushMessageHelper.class.getField(AuthenticatorMessage.KEY_MESSAGE).get(null);
            if (intent.getSerializableExtra(str) != null) {
                return (String) MiPushMessage.class.getMethod("getContent", new Class[0]).invoke(MiPushMessage.class.cast(intent.getSerializableExtra(str)), new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            ALog.e("DefaultXiaomiMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return null;
        }
    }
}
