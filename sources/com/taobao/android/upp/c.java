package com.taobao.android.upp;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.d;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c extends WeakReference<d.a> implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750770);
        t2o.a(404750767);
    }

    public c(d.a aVar) {
        super(aVar);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1666372597) {
            return cVar.get();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/upp/UppCallbackWeakRef");
    }

    @Override // java.lang.ref.Reference, com.taobao.android.upp.a
    public /* bridge */ /* synthetic */ d.a get() {
        return get();
    }
}
