package com.taobao.tbicontext;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import tb.zfr;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class TBIPageManager$initRootViewIfNeeded$1 extends MutablePropertyReference0Impl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TBIPageManager$initRootViewIfNeeded$1(zfr zfrVar) {
        super(zfrVar, zfr.class, "rootView", "getRootView()Landroid/view/ViewGroup;", 0);
    }

    public static /* synthetic */ Object ipc$super(TBIPageManager$initRootViewIfNeeded$1 tBIPageManager$initRootViewIfNeeded$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbicontext/TBIPageManager$initRootViewIfNeeded$1");
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return ((zfr) this.receiver).b();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, obj});
        } else {
            ((zfr) this.receiver).s((ViewGroup) obj);
        }
    }
}
