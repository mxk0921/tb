package com.taobao.android.nanocompose.foundation.components.rich_text;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.tlz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final /* synthetic */ class RichTextDefinesKt$RICH_TEXT_PROVIDER$1 extends FunctionReferenceImpl implements d1a<tlz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RichTextDefinesKt$RICH_TEXT_PROVIDER$1 INSTANCE = new RichTextDefinesKt$RICH_TEXT_PROVIDER$1();

    public RichTextDefinesKt$RICH_TEXT_PROVIDER$1() {
        super(0, tlz.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(RichTextDefinesKt$RICH_TEXT_PROVIDER$1 richTextDefinesKt$RICH_TEXT_PROVIDER$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/rich_text/RichTextDefinesKt$RICH_TEXT_PROVIDER$1");
    }

    @Override // tb.d1a
    public final tlz invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tlz) ipChange.ipc$dispatch("88fd2d3f", new Object[]{this}) : new tlz();
    }
}
