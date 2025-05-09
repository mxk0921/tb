package com.taobao.agoo;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import org.android.agoo.message.MessageReceiverService;
import tb.rd0;
import tb.t2o;
import tb.y7t;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaobaoMessageIntentReceiverService extends MessageReceiverService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933283);
    }

    public static /* synthetic */ Object ipc$super(TaobaoMessageIntentReceiverService taobaoMessageIntentReceiverService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/TaobaoMessageIntentReceiverService");
    }

    @Override // org.android.agoo.message.MessageReceiverService
    public String getIntentServiceClassName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ea303f", new Object[]{this, context});
        }
        ALog.w(y7t.TAOBAO_TAG, "getPackage Name=" + context.getPackageName(), new Object[0]);
        return rd0.a(context.getPackageName());
    }
}
