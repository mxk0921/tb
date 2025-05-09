package com.taobao.android.appdevtools.core.storage;

import android.taobao.windvane.extra.storage.IStorage;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsStorage INSTANCE = new DevToolsStorage();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f6351a = a.b(DevToolsStorage$mStorage$2.INSTANCE);

    static {
        t2o.a(998244393);
    }

    @JvmStatic
    public static final IStorage b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("ea41f4f0", new Object[0]);
        }
        return INSTANCE.a();
    }

    public final IStorage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("e8fc5611", new Object[]{this});
        }
        return (IStorage) f6351a.getValue();
    }
}
