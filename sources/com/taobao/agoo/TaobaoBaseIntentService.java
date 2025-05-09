package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.agoo.control.BaseIntentService;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class TaobaoBaseIntentService extends BaseIntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933281);
    }

    public static /* synthetic */ Object ipc$super(TaobaoBaseIntentService taobaoBaseIntentService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/TaobaoBaseIntentService");
    }

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onError(Context context, String str);

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onMessage(Context context, Intent intent);

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onRegistered(Context context, String str);

    public abstract void onUnregistered(Context context, String str);

    @Override // org.android.agoo.control.BaseIntentService
    public void onUserCommand(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4ecadd", new Object[]{this, context, intent});
        }
    }
}
