package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SingleDownloadTask$resume$1$2 extends Lambda implements u1a<Boolean, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SingleDownloadTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleDownloadTask$resume$1$2(SingleDownloadTask singleDownloadTask) {
        super(2);
        this.this$0 = singleDownloadTask;
    }

    public static /* synthetic */ Object ipc$super(SingleDownloadTask$resume$1$2 singleDownloadTask$resume$1$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/SingleDownloadTask$resume$1$2");
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
            SingleDownloadTask.h(this.this$0, true, null, 2, null);
        } else {
            this.this$0.g(false, str);
        }
    }
}
