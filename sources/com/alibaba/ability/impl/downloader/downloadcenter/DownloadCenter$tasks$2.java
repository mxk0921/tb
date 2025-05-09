package com.alibaba.ability.impl.downloader.downloadcenter;

import com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DownloadCenter$tasks$2 extends Lambda implements d1a<ConcurrentHashMap<String, DownloadCenter.b>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DownloadCenter$tasks$2 INSTANCE = new DownloadCenter$tasks$2();

    public DownloadCenter$tasks$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DownloadCenter$tasks$2 downloadCenter$tasks$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/downloader/downloadcenter/DownloadCenter$tasks$2");
    }

    @Override // tb.d1a
    public final ConcurrentHashMap<String, DownloadCenter.b> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("da029207", new Object[]{this}) : new ConcurrentHashMap<>();
    }
}
