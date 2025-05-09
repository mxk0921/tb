package com.etao.feimagesearch.struct;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ViewWidget$widgetMainHandler$2 extends Lambda implements d1a<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewWidget$widgetMainHandler$2 INSTANCE = new ViewWidget$widgetMainHandler$2();

    public ViewWidget$widgetMainHandler$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ViewWidget$widgetMainHandler$2 viewWidget$widgetMainHandler$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/struct/ViewWidget$widgetMainHandler$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Handler invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this}) : new Handler(Looper.getMainLooper());
    }
}
