package com.taobao.android.nanocompose.runtime.pipeline.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import tb.bgz;
import tb.d1a;
import tb.hhz;
import tb.olz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Parsing$observations$2 extends Lambda implements d1a<Map<bgz<hhz>, Set<olz>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Parsing$observations$2 INSTANCE = new Parsing$observations$2();

    public Parsing$observations$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(Parsing$observations$2 parsing$observations$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/parser/Parsing$observations$2");
    }

    @Override // tb.d1a
    public final Map<bgz<hhz>, Set<olz>> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5d4cb4f4", new Object[]{this}) : new LinkedHashMap();
    }
}
