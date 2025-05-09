package com.taobao.android.nanocompose.runtime.pipeline.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import tb.bgz;
import tb.ckf;
import tb.g1a;
import tb.hhz;
import tb.njz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NodeParser$createFuncContextWithParsing$readObserver$1 extends Lambda implements g1a<bgz<hhz>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeakReference<njz> $parsingContextWeak;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeParser$createFuncContextWithParsing$readObserver$1(WeakReference<njz> weakReference) {
        super(1);
        this.$parsingContextWeak = weakReference;
    }

    public static /* synthetic */ Object ipc$super(NodeParser$createFuncContextWithParsing$readObserver$1 nodeParser$createFuncContextWithParsing$readObserver$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/parser/NodeParser$createFuncContextWithParsing$readObserver$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(bgz<hhz> bgzVar) {
        invoke2(bgzVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(bgz<hhz> bgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b703ff3", new Object[]{this, bgzVar});
            return;
        }
        ckf.g(bgzVar, "state");
        NodeParser.a(NodeParser.INSTANCE, this.$parsingContextWeak, bgzVar);
    }
}
