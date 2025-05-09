package com.taobao.agoo;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DefaultOppoMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933276);
        t2o.a(343933272);
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdc22e73", new Object[]{this});
        }
        return "oppo";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fcbdd08", new Object[]{this, intent});
        }
        String str = null;
        if (intent == null) {
            ALog.e("DefaultOppoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra(AgooConstants.MESSAGE_OPPO_PAYLOAD);
            ALog.i("DefaultOppoMsgParseImpl", "parseMsgFromIntent", "msg", str);
            return str;
        } catch (Throwable th) {
            ALog.e("DefaultOppoMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
    }
}
