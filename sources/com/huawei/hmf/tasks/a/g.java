package com.huawei.hmf.tasks.a;

import android.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import tb.ym8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class g extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final List<WeakReference<ym8<?>>> f5229a = new ArrayList();

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f5229a) {
            try {
                Iterator it = ((ArrayList) this.f5229a).iterator();
                while (it.hasNext()) {
                    ym8 ym8Var = (ym8) ((WeakReference) it.next()).get();
                    if (ym8Var != null) {
                        ym8Var.cancel();
                    }
                }
                ((ArrayList) this.f5229a).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
