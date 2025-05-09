package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.i04;
import tb.ic1;
import tb.iiz;
import tb.u1a;
import tb.v6z;
import tb.w6z;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DownloadTask$downloadTemplate$1 extends Lambda implements g1a<byte[], xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $cachedFilePath;
    public final /* synthetic */ u1a<Boolean, String, xhv> $onDownloadCompleted;
    public final /* synthetic */ TemplateItem $templateItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DownloadTask$downloadTemplate$1(TemplateItem templateItem, String str, u1a<? super Boolean, ? super String, xhv> u1aVar) {
        super(1);
        this.$templateItem = templateItem;
        this.$cachedFilePath = str;
        this.$onDownloadCompleted = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(DownloadTask$downloadTemplate$1 downloadTask$downloadTemplate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/DownloadTask$downloadTemplate$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(byte[] bArr) {
        invoke2(bArr);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a077fe06", new Object[]{this, bArr});
            return;
        }
        ckf.g(bArr, "bytes");
        String e = w6z.Companion.a().e(this.$templateItem.d());
        v6z v6zVar = v6z.INSTANCE;
        boolean j = v6z.j(v6zVar, e, i04.x0(ic1.o0(bArr, bArr.length - 69)), false, 4, null);
        u1a<Boolean, String, xhv> u1aVar = this.$onDownloadCompleted;
        if (!j) {
            u1aVar.invoke(Boolean.FALSE, "文件写入失败");
        } else if (iiz.c()) {
            iiz.a aVar = iiz.Companion;
            aVar.j("SingleDownloadTask download success, 写入临时文件 tmpPath: " + e + "  准备开始解压");
        }
        boolean h = v6z.h(v6zVar, new File(e), new File(this.$cachedFilePath), 0, 4, null);
        u1a<Boolean, String, xhv> u1aVar2 = this.$onDownloadCompleted;
        String str = this.$cachedFilePath;
        if (iiz.c()) {
            iiz.a aVar2 = iiz.Companion;
            aVar2.j("文件解压的结果为 " + h + " 解压的路径为 " + str);
        }
        if (h) {
            u1aVar2.invoke(Boolean.TRUE, null);
        } else {
            u1aVar2.invoke(Boolean.FALSE, "文件解压失败");
        }
    }
}
