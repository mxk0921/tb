package com.taobao.themis.kernel.utils;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.bbs;
import tb.d1a;
import tb.pcs;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSInstanceExtKt$autoReload$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ bbs $this_autoReload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSInstanceExtKt$autoReload$1(bbs bbsVar) {
        super(0);
        this.$this_autoReload = bbsVar;
    }

    public static /* synthetic */ Object ipc$super(TMSInstanceExtKt$autoReload$1 tMSInstanceExtKt$autoReload$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/utils/TMSInstanceExtKt$autoReload$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        bbs bbsVar = this.$this_autoReload;
        try {
            pcs pcsVar = new pcs();
            pcsVar.f26018a = Uri.parse(bbsVar.e0()).buildUpon().appendQueryParameter("tms_auto_reload", "true").build().toString();
            bbsVar.reload(pcsVar);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            TMSLogger.d("TMSInstanceExt", th2);
        }
    }
}
