package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BatchDownloadTask$resume$5$1 extends Lambda implements u1a<Boolean, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ w1a<String, DownloadErrorCode, String, xhv> $callback;
    public final /* synthetic */ String $templateIdentifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BatchDownloadTask$resume$5$1(w1a<? super String, ? super DownloadErrorCode, ? super String, xhv> w1aVar, String str) {
        super(2);
        this.$callback = w1aVar;
        this.$templateIdentifier = str;
    }

    public static /* synthetic */ Object ipc$super(BatchDownloadTask$resume$5$1 batchDownloadTask$resume$5$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/BatchDownloadTask$resume$5$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool, String str) {
        invoke(bool.booleanValue(), str);
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7e8c3f", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            this.$callback.invoke(this.$templateIdentifier, DownloadErrorCode.SUCCESS, "");
        } else {
            w1a<String, DownloadErrorCode, String, xhv> w1aVar = this.$callback;
            String str2 = this.$templateIdentifier;
            DownloadErrorCode downloadErrorCode = DownloadErrorCode.DOWNLOAD_ERROR;
            if (str == null) {
                str = "下载失败";
            }
            w1aVar.invoke(str2, downloadErrorCode, str);
        }
    }
}
