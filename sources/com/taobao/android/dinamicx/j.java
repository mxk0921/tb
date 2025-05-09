package com.taobao.android.dinamicx;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.TakePhotoApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.bjo;
import tb.h36;
import tb.ic5;
import tb.m09;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j implements ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<WeakReference<a>> f7314a = new ArrayList();
    public final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        String e();

        void onLowMemory();
    }

    static {
        t2o.a(444596510);
    }

    public j(boolean z) {
        this.b = z;
        if (!DinamicXEngine.j0()) {
            return;
        }
        if (z) {
            h36.g("DXConfigCenter", "全局 LowMemory 上报开");
        } else {
            h36.g("DXConfigCenter", "全局 LowMemory 上报关");
        }
    }

    public <T> void a(List<WeakReference<T>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88b9745", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            Iterator<WeakReference<T>> it = list.iterator();
            while (it.hasNext()) {
                WeakReference<T> next = it.next();
                if (next == null || next.get() == null) {
                    it.remove();
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a28972b", new Object[]{this});
            return;
        }
        synchronized (this.f7314a) {
            a(this.f7314a);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed9b6d4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) this.f7314a).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (!(weakReference == null || weakReference.get() == null)) {
                String e = ((a) weakReference.get()).e();
                if (!TextUtils.isEmpty(e)) {
                    sb.append(e);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ae23a", new Object[]{this});
            return;
        }
        g();
        synchronized (this.f7314a) {
            try {
                Iterator it = ((ArrayList) this.f7314a).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference == null) {
                        it.remove();
                    } else {
                        a aVar = (a) weakReference.get();
                        if (aVar == null) {
                            it.remove();
                        } else {
                            aVar.onLowMemory();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f7f383", new Object[]{this, aVar});
        } else if (aVar != null) {
            synchronized (this.f7314a) {
                try {
                    if (!((ArrayList) this.f7314a).isEmpty()) {
                        Iterator it = ((ArrayList) this.f7314a).iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            if (weakReference != null && weakReference.get() == aVar) {
                                return;
                            }
                        }
                    }
                    ((ArrayList) this.f7314a).add(new WeakReference(aVar));
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e50a07", new Object[]{this});
        } else if (DinamicXEngine.j0()) {
            h36.g("DXLowMemory", "After onLowMemory: \n" + c());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaabc16", new Object[]{this});
        } else if (DinamicXEngine.j0()) {
            h36.g("DXLowMemory", "Before onLowMemory: \n" + c());
        }
    }

    public void h(a aVar) {
        DinamicXEngine f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4cad0a", new Object[]{this, aVar});
        } else if (aVar != null) {
            synchronized (this.f7314a) {
                try {
                    Iterator it = ((ArrayList) this.f7314a).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference != null) {
                            a aVar2 = (a) weakReference.get();
                            if (!(aVar2 == null || aVar2 == aVar)) {
                                if ((aVar instanceof DinamicXEngine) && (aVar2 instanceof DXWidgetNode)) {
                                    DXWidgetNode dXWidgetNode = (DXWidgetNode) aVar2;
                                    if (dXWidgetNode.getDXRuntimeContext() != null && ((f = dXWidgetNode.getDXRuntimeContext().s().f()) == null || f == aVar)) {
                                        it.remove();
                                    }
                                }
                            }
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c2c0c1", new Object[]{this, str});
            return;
        }
        Context x = DinamicXEngine.x();
        if (x != null && this.b) {
            HashMap hashMap = new HashMap();
            hashMap.put(m09.TASK_TYPE_LEVEL, str);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) x.getSystemService("activity")).getMemoryInfo(memoryInfo);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bjo.AVAIL_MEM, (Object) ((((((float) memoryInfo.availMem) * 1.0f) / 1024.0f) / 1024.0f) + "M"));
            jSONObject.put(bjo.TOTAL_MEM, (Object) ((((((float) memoryInfo.totalMem) * 1.0f) / 1024.0f) / 1024.0f) + "M"));
            jSONObject.put("threshold", (Object) ((((((float) memoryInfo.threshold) * 1.0f) / 1024.0f) / 1024.0f) + "M"));
            hashMap.put("pss", jSONObject.toJSONString());
            Runtime runtime = Runtime.getRuntime();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("totalMemory", (Object) ((((((float) runtime.totalMemory()) * 1.0f) / 1024.0f) / 1024.0f) + "M"));
            jSONObject2.put("freeMemory", (Object) ((((((float) runtime.freeMemory()) * 1.0f) / 1024.0f) / 1024.0f) + "M"));
            jSONObject2.put("maxMemory", (Object) ((((((float) runtime.maxMemory()) * 1.0f) / 1024.0f) / 1024.0f) + "M"));
            jSONObject2.put("availableProcessors", (Object) Integer.valueOf(runtime.availableProcessors()));
            hashMap.put("jvmHeap", jSONObject2.toJSONString());
            f fVar = new f("dinamicx");
            fVar.c = new ArrayList();
            f.a aVar = new f.a("DX_LowMemory", "DX_LowMemory", f.DX_LOW_MEMORY_MONITOR);
            ((ArrayList) fVar.c).add(aVar);
            aVar.e = "dx_low_memory";
            aVar.f = hashMap;
            if (DinamicXEngine.j0()) {
                h36.g("DXLowMemoryUpload", JSON.toJSONString(aVar.f));
            }
            ic5.p(fVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        i(TakePhotoApi.LOW_MEMORY);
        d();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        b();
        if (i == 80) {
            i("TRIM_MEMORY_COMPLETE");
            d();
        }
    }
}
