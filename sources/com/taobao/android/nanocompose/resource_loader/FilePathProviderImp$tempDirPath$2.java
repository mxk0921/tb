package com.taobao.android.nanocompose.resource_loader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class FilePathProviderImp$tempDirPath$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FilePathProviderImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePathProviderImp$tempDirPath$2(FilePathProviderImp filePathProviderImp) {
        super(0);
        this.this$0 = filePathProviderImp;
    }

    public static /* synthetic */ Object ipc$super(FilePathProviderImp$tempDirPath$2 filePathProviderImp$tempDirPath$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/FilePathProviderImp$tempDirPath$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this}) : FilePathProviderImp.f(this.this$0).getCacheDir().getAbsolutePath();
    }
}
