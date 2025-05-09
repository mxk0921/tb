package com.taobao.android.hudong;

import android.app.Application;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/hudong/TBHDColdLaunchTask;", "Ljava/io/Serializable;", "<init>", "()V", "Landroid/app/Application;", "application", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "params", "Ltb/xhv;", "init", "(Landroid/app/Application;Ljava/util/HashMap;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "hudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TBHDColdLaunchTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TBHDColdLaunchTask INSTANCE = new TBHDColdLaunchTask();
    private static final String TAG = "TBHD极简链路";

    static {
        t2o.a(1031798794);
    }

    private TBHDColdLaunchTask() {
    }

    @JvmStatic
    public static final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        ckf.g(application, "application");
        ckf.g(hashMap, "params");
        TLog.loge(TAG, "TBHDColdLaunchTask end");
    }
}
