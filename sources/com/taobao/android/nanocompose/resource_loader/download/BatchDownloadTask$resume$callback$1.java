package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.l2o;
import tb.mzy;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BatchDownloadTask$resume$callback$1 extends Lambda implements w1a<String, DownloadErrorCode, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ mzy this$0;

    public BatchDownloadTask$resume$callback$1(mzy mzyVar) {
        super(3);
    }

    public static /* synthetic */ Object ipc$super(BatchDownloadTask$resume$callback$1 batchDownloadTask$resume$callback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/BatchDownloadTask$resume$callback$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, DownloadErrorCode downloadErrorCode, String str2) {
        invoke2(str, downloadErrorCode, str2);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, DownloadErrorCode downloadErrorCode, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6394b3cd", new Object[]{this, str, downloadErrorCode, str2});
            return;
        }
        ckf.g(str, l2o.COL_TASK);
        ckf.g(downloadErrorCode, "errorCode");
        ckf.g(str2, "errorMsg");
        mzy.f(null, str, downloadErrorCode, str2);
    }
}
