package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.IDXApmManager;
import com.taobao.application.common.IApmEventListener;
import java.util.HashMap;
import java.util.Map;
import tb.c21;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b implements IDXApmManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<IDXApmManager.a, IApmEventListener> f7303a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDXApmManager.a f7304a;

        public a(b bVar, IDXApmManager.a aVar) {
            this.f7304a = aVar;
        }

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else {
                this.f7304a.onEvent(i);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.IDXApmManager
    public void a(IDXApmManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec08447", new Object[]{this, aVar});
        } else if (!((HashMap) this.f7303a).containsKey(aVar)) {
            a aVar2 = new a(this, aVar);
            ((HashMap) this.f7303a).put(aVar, aVar2);
            c21.c(aVar2);
        }
    }
}
