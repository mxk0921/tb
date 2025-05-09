package com.taobao.android.nanocompose.foundation.components.text;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.trz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class TextDefinesKt$TEXT_PROVIDER$1 extends FunctionReferenceImpl implements d1a<trz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TextDefinesKt$TEXT_PROVIDER$1 INSTANCE = new TextDefinesKt$TEXT_PROVIDER$1();

    public TextDefinesKt$TEXT_PROVIDER$1() {
        super(0, trz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(TextDefinesKt$TEXT_PROVIDER$1 textDefinesKt$TEXT_PROVIDER$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/text/TextDefinesKt$TEXT_PROVIDER$1");
    }

    @Override // tb.d1a
    public final trz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (trz) ipChange.ipc$dispatch("3502bb8e", new Object[]{this}) : new trz();
    }
}
