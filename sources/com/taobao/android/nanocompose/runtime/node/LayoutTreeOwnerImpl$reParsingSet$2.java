package com.taobao.android.nanocompose.runtime.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.pipeline.parser.Parsing;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LayoutTreeOwnerImpl$reParsingSet$2 extends Lambda implements d1a<Set<Parsing>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LayoutTreeOwnerImpl$reParsingSet$2 INSTANCE = new LayoutTreeOwnerImpl$reParsingSet$2();

    public LayoutTreeOwnerImpl$reParsingSet$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(LayoutTreeOwnerImpl$reParsingSet$2 layoutTreeOwnerImpl$reParsingSet$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/LayoutTreeOwnerImpl$reParsingSet$2");
    }

    @Override // tb.d1a
    public final Set<Parsing> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("5d4f7eae", new Object[]{this}) : new LinkedHashSet();
    }
}
