package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.a;
import tb.y0a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface c {
    public static final c alwaysFalse = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.flybird.deploy.callback.c
        public void askUserShouldRetry(y0a<Boolean, Void, Void> y0aVar, a.C0245a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c626cc57", new Object[]{this, y0aVar, aVar});
            } else {
                y0aVar.apply(Boolean.FALSE);
            }
        }
    }

    void askUserShouldRetry(y0a<Boolean, Void, Void> y0aVar, a.C0245a aVar);
}
