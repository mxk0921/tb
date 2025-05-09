package com.taobao.android.artry.resource;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.resource.ResourceManager;
import java.util.List;
import tb.clv;
import tb.dxv;
import tb.omv;
import tb.pmv;
import tb.t2o;
import tb.x6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Object f6395a;
    public boolean b;
    public x6e c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final d f6396a = new d();

        static {
            t2o.a(396361811);
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8fd9be01", new Object[0]);
            }
            return f6396a;
        }
    }

    static {
        t2o.a(396361808);
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("979f081c", new Object[0]);
        }
        return c.a();
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (context != null) {
            synchronized (this.f6395a) {
                try {
                    if (!this.b) {
                        this.b = true;
                        x6e a2 = omv.a();
                        this.c = a2;
                        a2.initialize(context, new pmv());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        synchronized (this.f6395a) {
            z = this.b;
        }
        return z;
    }

    public void d(List<clv> list, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5019ffc1", new Object[]{this, list, bVar});
        } else if (c() && !dxv.h(list)) {
            com.taobao.android.artry.resource.c cVar = new com.taobao.android.artry.resource.c(list, bVar);
            for (clv clvVar : list) {
                clvVar.getFilePath();
                this.c.uploadAsync(clvVar, cVar, null);
            }
        } else if (bVar != null) {
            try {
                ((ResourceManager.c) bVar).a(list);
            } catch (Throwable th) {
                String str = d;
                Log.e(str, "failed to invoke the onBatchUploadFinish method..." + th);
            }
        }
    }

    public d() {
        this.f6395a = new Object();
        this.b = false;
    }
}
