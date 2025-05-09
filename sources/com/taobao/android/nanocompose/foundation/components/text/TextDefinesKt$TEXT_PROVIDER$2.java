package com.taobao.android.nanocompose.foundation.components.text;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.ogz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class TextDefinesKt$TEXT_PROVIDER$2 extends FunctionReferenceImpl implements d1a<ogz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TextDefinesKt$TEXT_PROVIDER$2 INSTANCE = new TextDefinesKt$TEXT_PROVIDER$2();

    public TextDefinesKt$TEXT_PROVIDER$2() {
        super(0, ogz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(TextDefinesKt$TEXT_PROVIDER$2 textDefinesKt$TEXT_PROVIDER$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/text/TextDefinesKt$TEXT_PROVIDER$2");
    }

    @Override // tb.d1a
    public final ogz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogz) ipChange.ipc$dispatch("4c92ac55", new Object[]{this}) : new ogz();
    }
}
