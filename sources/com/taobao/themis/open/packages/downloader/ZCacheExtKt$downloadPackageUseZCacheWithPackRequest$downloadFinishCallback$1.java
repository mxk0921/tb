package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ekl;
import tb.gkl;
import tb.m5d;
import tb.u1a;
import tb.xhv;
import tb.yox;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "packName", "Ltb/gkl;", "result", "Ltb/xhv;", "invoke", "(Ljava/lang/String;Ltb/gkl;)V", "<no name provided>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1 extends Lambda implements u1a<String, gkl, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ m5d.c $downloadCallback;
    public final /* synthetic */ ekl $packRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1(m5d.c cVar, ekl eklVar) {
        super(2);
        this.$downloadCallback = cVar;
        this.$packRequest = eklVar;
    }

    public static /* synthetic */ Object ipc$super(ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1 zCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/packages/downloader/ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, gkl gklVar) {
        invoke2(str, gklVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, gkl gklVar) {
        boolean z = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a5a765", new Object[]{this, str, gklVar});
            return;
        }
        Error error = gklVar == null ? null : gklVar.b;
        if (str == null) {
            m5d.c cVar = this.$downloadCallback;
            if (cVar != null) {
                if (error != null) {
                    i = error.getCode();
                }
                cVar.b(new m5d.b(i, "no packName return"));
            }
        } else if (error == null || error.getCode() == 0) {
            String e = yox.e(this.$packRequest.b(), this.$packRequest.a());
            if (e == null || e.length() == 0) {
                m5d.c cVar2 = this.$downloadCallback;
                if (cVar2 != null) {
                    cVar2.b(new m5d.b(1, "callback success but path null"));
                    return;
                }
                return;
            }
            m5d.c cVar3 = this.$downloadCallback;
            if (cVar3 != null) {
                if (gklVar != null) {
                    z = gklVar.f20061a;
                }
                cVar3.a(e, z);
            }
        } else {
            m5d.c cVar4 = this.$downloadCallback;
            if (cVar4 != null) {
                cVar4.b(new m5d.b(error.getCode(), error.getMessage()));
            }
        }
    }
}
