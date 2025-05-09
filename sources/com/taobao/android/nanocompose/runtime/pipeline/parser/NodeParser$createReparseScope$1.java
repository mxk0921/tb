package com.taobao.android.nanocompose.runtime.pipeline.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.waz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NodeParser$createReparseScope$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ waz $layoutNode;
    public final /* synthetic */ Parsing $parsing;
    public final /* synthetic */ RenderContext $renderContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeParser$createReparseScope$1(Parsing parsing, waz wazVar, RenderContext renderContext) {
        super(0);
        this.$parsing = parsing;
        this.$layoutNode = wazVar;
        this.$renderContext = renderContext;
    }

    public static /* synthetic */ Object ipc$super(NodeParser$createReparseScope$1 nodeParser$createReparseScope$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/parser/NodeParser$createReparseScope$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            NodeParser.b(NodeParser.INSTANCE, this.$parsing, this.$layoutNode, this.$renderContext);
        }
    }
}
