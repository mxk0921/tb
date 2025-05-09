package com.taobao.adaemon.anr;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.adaemon.ADaemon;
import com.taobao.adaemon.TriggerService;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import tb.cp;
import tb.f;
import tb.hkq;
import tb.jab;
import tb.pg1;
import tb.s55;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ANRHookListener implements jab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ANRHacker_ANRHookListener";
    private static final ConcurrentHashMap<Integer, IIntentReceiver> receiverDispatcherMap = new ConcurrentHashMap<>();

    static {
        t2o.a(349175893);
        t2o.a(393216005);
    }

    public ANRHookListener() {
        Integer valueOf = Integer.valueOf(Process.myPid());
        int i = Build.VERSION.SDK_INT;
        s55.i(TAG, "newInstance", MspDBHelper.BizEntry.COLUMN_NAME_PID, valueOf, "brand", Build.BRAND, "os_version", Integer.valueOf(i));
        ADaemon.appLaunchTimeInMill = System.currentTimeMillis();
        f.a();
        if (i >= 26) {
            ANRHacker.u0().w0();
        }
    }

    private void handleRegisterReceiver(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76ae10", new Object[]{this, objArr});
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            final Object obj = objArr[i];
            if (obj instanceof IIntentReceiver) {
                IIntentReceiver.Stub stub = new IIntentReceiver.Stub(this) { // from class: com.taobao.adaemon.anr.ANRHookListener.1
                    /* JADX WARN: Multi-variable type inference failed */
                    public void performReceive(Intent intent, int i2, String str, Bundle bundle, boolean z, boolean z2, int i3) {
                        Throwable th;
                        try {
                            g.e(this, i2, str, bundle, z, intent.getFlags());
                            try {
                                ((IIntentReceiver) obj).performReceive(intent, i2, str, bundle, z, z2, i3);
                                s55.g(ANRHookListener.TAG, "performReceive success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent, "hash", Integer.valueOf(hashCode()));
                            } catch (Throwable th2) {
                                th = th2;
                                s55.h(ANRHookListener.TAG, "performReceive err", th, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent, "hash", Integer.valueOf(hashCode()));
                                hkq.b(e.MODULE_NAME, e.b, "anr_perform", vu3.b.GEO_NOT_SUPPORT);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                };
                objArr[i] = stub;
                s55.g(TAG, "registerReceiver", "stubHash", Integer.valueOf(stub.hashCode()));
                receiverDispatcherMap.put(Integer.valueOf(obj.hashCode()), (IIntentReceiver) objArr[i]);
                return;
            }
        }
    }

    @Override // tb.jab
    public Pair<Boolean, Object> invoke(Method method, Object[] objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4ce8434", new Object[]{this, method, objArr});
        }
        if (objArr == null || objArr.length <= 0 || Build.VERSION.SDK_INT < 26 || !f.a()) {
            return null;
        }
        String name = method.getName();
        try {
            if (!"registerReceiver".equals(name) && !"registerReceiverWithFeature".equals(name)) {
                if (!"unregisterReceiver".equals(name)) {
                    return null;
                }
                Object obj2 = objArr[0];
                if (!(obj2 instanceof IIntentReceiver)) {
                    return null;
                }
                IIntentReceiver remove = receiverDispatcherMap.remove(Integer.valueOf(obj2.hashCode()));
                if (remove == null) {
                    obj = "null";
                } else {
                    obj = Integer.valueOf(remove.hashCode());
                }
                s55.g(TAG, "unregisterReceiver", "stubHash", obj);
                if (remove == null) {
                    return null;
                }
                objArr[0] = remove;
                return null;
            }
            if (TriggerService.b.get() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                s55.i(TAG, "registerReceiver", pg1.ATOM_stack, cp.c(Thread.currentThread().getStackTrace()));
            }
            handleRegisterReceiver(objArr);
            return null;
        } catch (Throwable th) {
            s55.h(TAG, "invoke err", th, new Object[0]);
            hkq.b(e.MODULE_NAME, e.b, "anr_hook", vu3.b.GEO_NOT_SUPPORT);
            return null;
        }
    }
}
