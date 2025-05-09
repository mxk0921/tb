package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FileAbility$unzipSync$5 extends Lambda implements d1a<ZipEntry> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$ObjectRef $zipIn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAbility$unzipSync$5(Ref$ObjectRef ref$ObjectRef) {
        super(0);
        this.$zipIn = ref$ObjectRef;
    }

    public static /* synthetic */ Object ipc$super(FileAbility$unzipSync$5 fileAbility$unzipSync$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/file/FileAbility$unzipSync$5");
    }

    @Override // tb.d1a
    public final ZipEntry invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZipEntry) ipChange.ipc$dispatch("6508ec27", new Object[]{this}) : ((ZipInputStream) this.$zipIn.element).getNextEntry();
    }
}
