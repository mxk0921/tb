package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.m5d;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "downloadSize", "totalSize", "Ltb/xhv;", "invoke", "(JJ)V", "<no name provided>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1 extends Lambda implements u1a<Long, Long, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ m5d.c $downloadCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1(m5d.c cVar) {
        super(2);
        this.$downloadCallback = cVar;
    }

    public static /* synthetic */ Object ipc$super(ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1 zCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/packages/downloader/ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Long l, Long l2) {
        invoke(l.longValue(), l2.longValue());
        return xhv.INSTANCE;
    }

    public final void invoke(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07061bf", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        int i = j == j2 ? 100 : (int) (((float) j) / ((float) j2));
        m5d.c cVar = this.$downloadCallback;
        if (cVar != null) {
            cVar.onDownloadProgress(i);
        }
    }
}
