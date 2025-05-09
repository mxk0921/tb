package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gi implements fbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static gi c;

    /* renamed from: a  reason: collision with root package name */
    public final gbb f20013a = di.c();
    public final ConcurrentHashMap<ci, CopyOnWriteArrayList<ebb>> b = new ConcurrentHashMap<>();

    static {
        t2o.a(79691863);
        t2o.a(79691861);
    }

    public static gi d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gi) ipChange.ipc$dispatch("6fbb7b7", new Object[0]);
        }
        if (c == null) {
            synchronized (gi.class) {
                try {
                    if (c == null) {
                        c = new gi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // tb.fbb
    public void a(List<String> list) {
        Map.Entry<ci, CopyOnWriteArrayList<ebb>> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6613af9f", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (c2 = c(str)) != null) {
                ci key = c2.getKey();
                hi.d(key);
                hi.b(key);
                fi.g(key);
                fi.c(key);
                CopyOnWriteArrayList<ebb> value = c2.getValue();
                if (value != null) {
                    Iterator it = new ArrayList(value).iterator();
                    while (it.hasNext()) {
                        ebb ebbVar = (ebb) it.next();
                        if (ebbVar != null) {
                            ebbVar.a(key);
                        }
                    }
                }
            }
        }
    }

    @Override // tb.fbb
    public void b(List<String> list, String str, String str2) {
        Map.Entry<ci, CopyOnWriteArrayList<ebb>> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a687a5", new Object[]{this, list, str, str2});
            return;
        }
        for (String str3 : list) {
            if (!TextUtils.isEmpty(str3) && (c2 = c(str3)) != null) {
                ci key = c2.getKey();
                hi.c(key, str, str2);
                ii.a(key, str, str2);
                fi.f(key, str, str2);
                CopyOnWriteArrayList<ebb> value = c2.getValue();
                if (value != null) {
                    Iterator it = new ArrayList(value).iterator();
                    while (it.hasNext()) {
                        ebb ebbVar = (ebb) it.next();
                        if (ebbVar != null) {
                            ebbVar.b(key, str, str2);
                        }
                    }
                }
            }
        }
    }

    public final Map.Entry<ci, CopyOnWriteArrayList<ebb>> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("595107d8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<ci, CopyOnWriteArrayList<ebb>> entry : this.b.entrySet()) {
            ci key = entry.getKey();
            if (key != null && TextUtils.equals(key.f17067a, str)) {
                return entry;
            }
        }
        return null;
    }

    public boolean e(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daa206c0", new Object[]{this, ciVar})).booleanValue();
        }
        return ((di) this.f20013a).d(ciVar);
    }

    public String f(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("956722a", new Object[]{this, ciVar});
        }
        return ((di) this.f20013a).e(ciVar);
    }

    public int g(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad162e9f", new Object[]{this, ciVar})).intValue();
        }
        int f = ((di) this.f20013a).f(ciVar);
        if (f == 4) {
            hi.a(ciVar);
            fi.e(ciVar);
        } else {
            hi.e(ciVar);
            ii.b(ciVar);
            fi.h(ciVar);
        }
        return f;
    }

    public void h(ci ciVar, ebb ebbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21934071", new Object[]{this, ciVar, ebbVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureService.registerInstallListener:bundleInfo is invalid");
        } else if (ebbVar == null) {
            ck.g().e("AURADynamicFeatureService.registerInstallListener:listener is null");
        } else {
            Map.Entry<ci, CopyOnWriteArrayList<ebb>> c2 = c(ciVar.f17067a);
            if (c2 == null) {
                CopyOnWriteArrayList<ebb> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add(ebbVar);
                this.b.put(ciVar, copyOnWriteArrayList);
                return;
            }
            CopyOnWriteArrayList<ebb> value = c2.getValue();
            if (value == null) {
                value = new CopyOnWriteArrayList<>();
                this.b.put(c2.getKey(), value);
            }
            value.add(ebbVar);
        }
    }

    public void i(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28ab1da", new Object[]{this, ciVar});
            return;
        }
        hi.f(ciVar);
        fi.d(ciVar);
        ((di) this.f20013a).g(this);
        ((di) this.f20013a).h(ciVar);
    }

    public void j(ci ciVar, ebb ebbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ee494a", new Object[]{this, ciVar, ebbVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureService.unregisterInstallListener:bundleInfo is invalid");
        } else if (ebbVar == null) {
            ck.g().e("AURADynamicFeatureService.unregisterInstallListener:listener is null");
        } else {
            Map.Entry<ci, CopyOnWriteArrayList<ebb>> c2 = c(ciVar.f17067a);
            if (c2 == null || c2.getValue() == null) {
                ck.g().e("AURADynamicFeatureService.unregisterInstallListener:no target listener");
            } else {
                c2.getValue().remove(ebbVar);
            }
        }
    }
}
