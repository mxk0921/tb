package com.taobao.android.turbo.adapter.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taobao/android/turbo/adapter/impl/ConfigAdapter;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ConfigAdapter$Companion$instance$2 extends Lambda implements d1a<ConfigAdapter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ConfigAdapter$Companion$instance$2 INSTANCE = new ConfigAdapter$Companion$instance$2();

    public ConfigAdapter$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ConfigAdapter$Companion$instance$2 configAdapter$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/adapter/impl/ConfigAdapter$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ConfigAdapter invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigAdapter) ipChange.ipc$dispatch("abda30ee", new Object[]{this}) : new ConfigAdapter();
    }
}
