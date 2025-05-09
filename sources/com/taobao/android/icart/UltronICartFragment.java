package com.taobao.android.icart;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UltronICartFragment extends BaseICartFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150666);
    }

    public static /* synthetic */ Object ipc$super(UltronICartFragment ultronICartFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/UltronICartFragment");
    }

    @Override // com.taobao.android.icart.BaseICartFragment
    public BaseICartFragmentProxy p2(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("883c1a1d", new Object[]{this, bundle});
        }
        return BaseICartFragment.b.b(this, null, true);
    }

    @Override // com.taobao.android.icart.BaseICartFragment
    public boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e360ef", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
