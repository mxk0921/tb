package com.taobao.android.nanocompose.runtime.pipeline.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.olz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Parsing$invalidations$2 extends Lambda implements d1a<Set<olz>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Parsing$invalidations$2 INSTANCE = new Parsing$invalidations$2();

    public Parsing$invalidations$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(Parsing$invalidations$2 parsing$invalidations$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/parser/Parsing$invalidations$2");
    }

    @Override // tb.d1a
    public final Set<olz> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("5d4f7eae", new Object[]{this}) : new LinkedHashSet();
    }
}
