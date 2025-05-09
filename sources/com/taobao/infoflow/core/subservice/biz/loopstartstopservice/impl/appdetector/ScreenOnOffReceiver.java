package com.taobao.infoflow.core.subservice.biz.loopstartstopservice.impl.appdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ScreenOnOffReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<IMainFeedsLoopStartStopService.a> f10656a;
    public boolean b = true;

    static {
        t2o.a(486539545);
    }

    public ScreenOnOffReceiver(IMainFeedsLoopStartStopService.a aVar) {
        this.f10656a = new WeakReference<>(aVar);
    }

    public static /* synthetic */ Object ipc$super(ScreenOnOffReceiver screenOnOffReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/biz/loopstartstopservice/impl/appdetector/ScreenOnOffReceiver");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("674828c0", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        IMainFeedsLoopStartStopService.a aVar = this.f10656a.get();
        if (aVar != null) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                this.b = false;
                aVar.a(IMainFeedsLoopStartStopService.a.APP_SWITCH);
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                this.b = true;
                aVar.onStart(IMainFeedsLoopStartStopService.a.APP_SWITCH);
            }
        }
    }
}
