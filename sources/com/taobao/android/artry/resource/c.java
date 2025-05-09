package com.taobao.android.artry.resource;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.resource.ResourceManager;
import com.taobao.android.artry.resource.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tb.clv;
import tb.dxv;
import tb.mzd;
import tb.ndt;
import tb.ozd;
import tb.t2o;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements mzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final List<clv> f6394a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final int c;
    public final d.b d;

    static {
        t2o.a(396361807);
    }

    public c(List<clv> list, d.b bVar) {
        ArrayList arrayList = new ArrayList(list);
        this.f6394a = arrayList;
        this.c = arrayList.size();
        this.d = bVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40650274", new Object[]{this});
            return;
        }
        d.b bVar = this.d;
        if (bVar != null) {
            try {
                ((ResourceManager.c) bVar).a(this.f6394a);
            } catch (Throwable th) {
                String str = e;
                Log.e(str, "failed to invoke the onBatchUploadFinish method..." + th);
            }
        }
    }

    @Override // tb.mzd
    public void onCancel(z6e z6eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
            return;
        }
        String str2 = e;
        StringBuilder sb = new StringBuilder("cancel the task[%s]...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
        Log.e(str2, sb.toString());
    }

    @Override // tb.mzd
    public void onFailure(z6e z6eVar, ndt ndtVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
            return;
        }
        StringBuilder sb = new StringBuilder("failed the task[%s], the error is %s... ");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
        sb.append(" errorcode ");
        if (ndtVar == null) {
            str2 = "null";
        } else {
            str2 = ndtVar.f24666a;
        }
        sb.append(str2);
        if (!dxv.h(this.f6394a) && ((ArrayList) this.f6394a).contains(z6eVar)) {
            if (z6eVar instanceof clv) {
                clv clvVar = (clv) z6eVar;
                clvVar.e = false;
                clvVar.f = null;
            }
            if (this.b.addAndGet(1) >= this.c) {
                a();
            }
        }
    }

    @Override // tb.mzd
    public void onPause(z6e z6eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
            return;
        }
        StringBuilder sb = new StringBuilder("pause the task[%s]...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
    }

    @Override // tb.mzd
    public void onProgress(z6e z6eVar, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder("upload the task[%s], the progress is %d...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
    }

    @Override // tb.mzd
    public void onResume(z6e z6eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
            return;
        }
        StringBuilder sb = new StringBuilder("resume the task[%s]...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
    }

    @Override // tb.mzd
    public void onStart(z6e z6eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            return;
        }
        StringBuilder sb = new StringBuilder("submit the task[%s]...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
    }

    @Override // tb.mzd
    public void onWait(z6e z6eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            return;
        }
        String str2 = e;
        StringBuilder sb = new StringBuilder("waiting on the task[%s]...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
        Log.e(str2, sb.toString());
    }

    @Override // tb.mzd
    public void onSuccess(z6e z6eVar, ozd ozdVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
            return;
        }
        StringBuilder sb = new StringBuilder("success to invoke the task[%s]...");
        if (z6eVar == null) {
            str = "";
        } else {
            str = z6eVar.getFilePath();
        }
        sb.append(str);
        if (!dxv.h(this.f6394a) && ((ArrayList) this.f6394a).contains(z6eVar)) {
            if (ozdVar != null && (z6eVar instanceof clv)) {
                clv clvVar = (clv) z6eVar;
                clvVar.e = true;
                clvVar.f = ozdVar.a();
                clvVar.g = ozdVar.b();
                try {
                    clvVar.h = new JSONObject(ozdVar.b()).getString("ossObjectKey");
                } catch (Throwable unused) {
                }
            }
            if (this.b.addAndGet(1) >= this.c) {
                a();
            }
        }
    }
}
