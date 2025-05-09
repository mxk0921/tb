package com.taobao.mytaobao.newSettingV2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a0g;
import tb.ckf;
import tb.dun;
import tb.fdb;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbSettingsCache {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbSettingsCache INSTANCE = new MtbSettingsCache();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f11217a = a.b(MtbSettingsCache$sCache$2.INSTANCE);

    public final fdb a() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("d66a72ac", new Object[]{this});
        } else {
            njg njgVar = f11217a;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return (fdb) value;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d07523", new Object[]{this, str});
        }
        ckf.h(str, "key");
        fdb a2 = a();
        return (String) a2.d0(Login.getUserId() + '_' + str);
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458dddfe", new Object[]{this, str, str2});
            return;
        }
        ckf.h(str, "key");
        ckf.h(str2, "value");
        fdb a2 = a();
        a2.N(Login.getUserId() + '_' + str, str2);
    }

    static {
        t2o.a(745537746);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(MtbSettingsCache.class), "sCache", "getSCache()Lcom/taobao/alivfssdk/cache/IAVFSCache;");
        dun.i(propertyReference1Impl);
        $$delegatedProperties = new a0g[]{propertyReference1Impl};
    }
}
