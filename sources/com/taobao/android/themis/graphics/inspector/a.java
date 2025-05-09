package com.taobao.android.themis.graphics.inspector;

import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.inspector.InspectorRepository;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final InspectorRepository f9676a = InspectorRepository.b(InspectorRepository.HOST.DAILY, InspectorRepository.JSType.BINARY);
    public final WeakReference<IRiverBackend> b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.themis.graphics.inspector.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0498a implements InspectorRepository.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f9677a;

        public C0498a(b bVar) {
            this.f9677a = bVar;
        }

        @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository.d
        public void a(InspectorRepository.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eacf53ef", new Object[]{this, eVar});
            } else if (Looper.getMainLooper() != Looper.myLooper()) {
                Log.e("themis:inspector", "failed to load resource: non ui thread");
                b bVar = this.f9677a;
                if (bVar != null) {
                    bVar.a();
                }
            } else if (eVar == null || !eVar.a()) {
                Log.e("themis:inspector", "failed to load resource: result invalid");
                b bVar2 = this.f9677a;
                if (bVar2 != null) {
                    bVar2.a();
                }
            } else {
                IRiverBackend iRiverBackend = (IRiverBackend) a.a(a.this).get();
                if (iRiverBackend != null) {
                    if (eVar.c == InspectorRepository.JSType.JS) {
                        iRiverBackend.s(new String(eVar.f9675a), eVar.b);
                    } else {
                        iRiverBackend.t(eVar.f9675a, eVar.b);
                    }
                    b bVar3 = this.f9677a;
                    if (bVar3 != null) {
                        bVar3.a();
                        return;
                    }
                    return;
                }
                Log.e("themis:inspector", "failed to load resource: backend invalid");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();
    }

    public a(WeakReference<IRiverBackend> weakReference) {
        this.b = weakReference;
    }

    public static /* synthetic */ WeakReference a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("235bb738", new Object[]{aVar});
        }
        return aVar.b;
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfba6c23", new Object[]{this, bVar});
        } else if (this.b != null) {
            this.f9676a.c(new C0498a(bVar));
        } else {
            bVar.a();
        }
    }
}
