package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ep9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<shx>> f18737a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ep9 f18738a = new ep9();

        static {
            t2o.a(435159110);
        }

        public static /* synthetic */ ep9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ep9) ipChange.ipc$dispatch("7fe1f088", new Object[0]);
            }
            return f18738a;
        }
    }

    static {
        t2o.a(435159109);
    }

    public static ep9 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ep9) ipChange.ipc$dispatch("65b47543", new Object[0]);
        }
        return a.a();
    }

    public static /* synthetic */ void j(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94598748", new Object[]{shxVar});
            return;
        }
        try {
            FloatWindow floatWindow = shxVar.b;
            if (floatWindow != null) {
                floatWindow.J();
                shxVar.b = null;
            }
        } catch (Throwable th) {
            yv8.b("FloatWindowManager.close.byRequest.error", th);
        }
    }

    public boolean c(shx shxVar) {
        agu aguVar;
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6f630f4", new Object[]{this, shxVar})).booleanValue();
        }
        if (shxVar == null || (aguVar = shxVar.f28064a) == null) {
            return false;
        }
        String str = aguVar.c;
        if (TextUtils.isEmpty(str)) {
            yv8.e("addNewRequest.bizCode.null.return", new Object[0]);
            return false;
        }
        if (((ConcurrentHashMap) this.f18737a).containsKey(str)) {
            list = (List) ((ConcurrentHashMap) this.f18737a).get(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            if (list == null) {
                list = new ArrayList();
                ((ConcurrentHashMap) this.f18737a).put(str, list);
            }
            list.add(shxVar);
            return true;
        }
        yv8.e("addNewRequest.sameBizCode.AlreadyPopping.cancel.bizCode=%s", str);
        return false;
    }

    public boolean d(String str) {
        List<shx> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f0f2a6c", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (list = (List) ((ConcurrentHashMap) this.f18737a).get(str)) != null && list.size() > 0) {
            for (shx shxVar : list) {
                if (shxVar != null && shxVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            yv8.e("close.bizCode.empty", new Object[0]);
        } else {
            lst.b(new Runnable() { // from class: tb.dp9
                @Override // java.lang.Runnable
                public final void run() {
                    ep9.this.i(str);
                }
            });
        }
    }

    public void f(final shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb5098", new Object[]{this, shxVar});
        } else if (shxVar == null) {
            yv8.e("close.windowRequest.invalid", new Object[0]);
        } else if (shxVar.a()) {
            yv8.e("close.windowRequest.isAlreadyClosed", new Object[0]);
        } else {
            shxVar.e(true);
            agu aguVar = shxVar.f28064a;
            if (aguVar != null) {
                String str = aguVar.c;
                if (!TextUtils.isEmpty(str)) {
                    List list = (List) ((ConcurrentHashMap) this.f18737a).get(str);
                    if (list != null) {
                        list.remove(shxVar);
                        if (list.isEmpty()) {
                            ((ConcurrentHashMap) this.f18737a).remove(str);
                        }
                    }
                    k(str);
                    if (aguVar.f != null) {
                        yv8.e("FloatWindowRequestManager.onClose.bizCode=%s", str);
                        aguVar.f.b(aguVar);
                        aguVar.f = null;
                    }
                } else {
                    return;
                }
            }
            lst.b(new Runnable() { // from class: tb.cp9
                @Override // java.lang.Runnable
                public final void run() {
                    ep9.j(shx.this);
                }
            });
        }
    }

    public Map<String, Integer> g() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83482f49", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.f18737a).entrySet()) {
                if (entry != null) {
                    String str = (String) entry.getKey();
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            break;
                        }
                        shx shxVar = (shx) it.next();
                        if (shxVar != null && shxVar.c()) {
                            i = 1;
                            break;
                        }
                    }
                    hashMap.put(str, Integer.valueOf(i));
                }
            }
        } catch (Throwable th) {
            yv8.b("FloatWindowManager.getAllWindowStatus.error", th);
        }
        return hashMap;
    }

    public final /* synthetic */ void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58763f8", new Object[]{this, str});
            return;
        }
        try {
            List<shx> list = (List) ((ConcurrentHashMap) this.f18737a).get(str);
            if (list != null && list.size() > 0) {
                for (shx shxVar : list) {
                    shxVar.c.g("NativeClose", "", true, null);
                }
            }
        } catch (Throwable th) {
            yv8.b("FloatWindowManager.close.byBizCode.error", th);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de935325", new Object[]{this, str});
            return;
        }
        try {
            Intent intent = new Intent("com.taobao.desktop.float_window_close");
            intent.putExtra("bizCode", str);
            sd7.d().a().sendBroadcast(intent);
            yv8.e("FloatWindowTrigger.sendFloatWindowClose.bizCode=%s", str);
        } catch (Throwable th) {
            yv8.b("FloatWindowTrigger.sendFloatWindowClose.error", th);
        }
    }
}
