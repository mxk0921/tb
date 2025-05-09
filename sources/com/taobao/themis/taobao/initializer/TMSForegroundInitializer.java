package com.taobao.themis.taobao.initializer;

import android.app.Application;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TMSOrangeProxy;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.h8s;
import tb.o9s;
import tb.t2o;
import tb.vxm;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042.\u0010\t\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006j\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/taobao/initializer/TMSForegroundInitializer;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "params", "Ltb/xhv;", "init", "(Landroid/app/Application;Ljava/util/HashMap;)V", "NAME", "Ljava/lang/String;", RPCDataItems.SWITCH_TAG_LOG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSForegroundInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "TMSForegroundInitializer";
    private static final String TAG = "TMSInitializer:TMSForegroundInitializer";
    public static final TMSForegroundInitializer INSTANCE = new TMSForegroundInitializer();
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    static {
        t2o.a(847249505);
    }

    private TMSForegroundInitializer() {
    }

    @JvmStatic
    public static final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        ckf.g(application, "application");
        TMSLogger.b(TAG, "TMSForegroundInitializer start");
        if (ckf.b(TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal("themis_common_config", "enableTMSForegroundInitializer", "true"), "true")) {
            AtomicBoolean atomicBoolean = isInitialized;
            if (!atomicBoolean.get()) {
                AtomicLong atomicLong = h8s.sTMSFORGROUNDTime;
                atomicLong.compareAndSet(-1L, System.currentTimeMillis());
                vxm.b.e().a("tmsForegroundTime", Long.valueOf(o9s.c(atomicLong.get())));
                if (h8s.sTMSRESUMEDTime.get() == -1) {
                    TMSResumedInitializer.init(application, hashMap);
                }
                atomicBoolean.set(true);
            }
        }
    }
}
