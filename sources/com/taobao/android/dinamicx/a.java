package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.IDXApmManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.h36;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a implements IDXApmManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<WeakReference<IDXApmManager.a>> f7302a = new ArrayList();

    static {
        t2o.a(444596471);
        t2o.a(444596605);
    }

    public void a(IDXApmManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c1f639", new Object[]{this, aVar});
            return;
        }
        Iterator it = ((ArrayList) this.f7302a).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null) {
                it.remove();
            } else {
                IDXApmManager.a aVar2 = (IDXApmManager.a) weakReference.get();
                if (aVar2 == null) {
                    it.remove();
                } else if (aVar2 == aVar) {
                    return;
                }
            }
        }
        ((ArrayList) this.f7302a).add(new WeakReference(aVar));
    }

    @Override // com.taobao.android.dinamicx.IDXApmManager.a
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            return;
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXApmEventListener", "onEvent: " + i);
        }
        Iterator it = ((ArrayList) this.f7302a).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null) {
                it.remove();
            } else {
                IDXApmManager.a aVar = (IDXApmManager.a) weakReference.get();
                if (aVar == null) {
                    it.remove();
                } else {
                    aVar.onEvent(i);
                }
            }
        }
    }
}
