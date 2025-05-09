package com.taobao.message.launcher.init;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.log.TLog;
import java.security.InvalidParameterException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.d1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\b\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/taobao/message/launcher/init/FeatureInitHelper;", "", "<init>", "()V", "", "source", "clazzName", "Ltb/xhv;", "init", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "onSuccess", "onFailure", "(Ljava/lang/String;Ljava/lang/String;Ltb/d1a;Ltb/d1a;)V", "directInit", "(Ltb/d1a;)V", "", "getInitSwitch", "()Z", "userId", "isInit", "(Ljava/lang/String;)Z", "status", "setStatus", "(Ljava/lang/String;Z)V", "Ljava/util/concurrent/ConcurrentHashMap;", "statusMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getStatusMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setStatusMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class FeatureInitHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FeatureInitHelper INSTANCE = new FeatureInitHelper();
    private static ConcurrentHashMap<String, Boolean> statusMap = new ConcurrentHashMap<>();

    static {
        t2o.a(529531024);
    }

    private FeatureInitHelper() {
    }

    @JvmStatic
    public static final void directInit(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2c207", new Object[]{d1aVar});
            return;
        }
        ckf.h(d1aVar, "onSuccess");
        TLog.loge(BundleSplitUtil.TAG, "MSG_Direct_Init");
        ReInitHelper.init();
        d1aVar.invoke();
    }

    @JvmStatic
    public static final boolean getInitSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10667be5", new Object[0])).booleanValue();
        }
        return true;
    }

    @JvmStatic
    public static final void init(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b2572b", new Object[]{str, str2});
            return;
        }
        ckf.h(str, "source");
        ckf.h(str2, "clazzName");
        TLog.loge(BundleSplitUtil.TAG, "MSG_Feature_Init");
        if (!TextUtils.isEmpty(str2)) {
            ReInitHelper.sInitClassName = str2;
            BundleSplitUtil.checkMsgBundleReady$default(BundleSplitUtil.INSTANCE, str, 0, FeatureInitHelper$init$1.INSTANCE, FeatureInitHelper$init$2.INSTANCE, false, null, 48, null);
            return;
        }
        throw new InvalidParameterException("invalid init class name");
    }

    @JvmStatic
    public static final boolean isInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aad89c6f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ckf.b(statusMap.get(str), Boolean.TRUE);
    }

    @JvmStatic
    public static final void setStatus(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e410ef", new Object[]{str, new Boolean(z)});
            return;
        }
        ckf.h(str, "userId");
        if (!TextUtils.isEmpty(str)) {
            statusMap.put(str, Boolean.valueOf(z));
        }
    }

    public final ConcurrentHashMap<String, Boolean> getStatusMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("b2f373ab", new Object[]{this});
        }
        return statusMap;
    }

    public final void setStatusMap(ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c44f1f", new Object[]{this, concurrentHashMap});
            return;
        }
        ckf.h(concurrentHashMap, "<set-?>");
        statusMap = concurrentHashMap;
    }

    @JvmStatic
    public static final void init(String str, String str2, d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d6d5f9", new Object[]{str, str2, d1aVar, d1aVar2});
            return;
        }
        ckf.h(str, "source");
        ckf.h(str2, "clazzName");
        ckf.h(d1aVar, "onSuccess");
        ckf.h(d1aVar2, "onFailure");
        if (!TextUtils.isEmpty(str2)) {
            ReInitHelper.sInitClassName = str2;
            BundleSplitUtil.checkMsgBundleReady$default(BundleSplitUtil.INSTANCE, str, 0, new FeatureInitHelper$init$3(d1aVar), new FeatureInitHelper$init$4(d1aVar2), false, null, 48, null);
            return;
        }
        throw new InvalidParameterException("invalid init class name");
    }
}
