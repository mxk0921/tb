package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.tracker.JarvisTracker;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.qsf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rtf implements JarvisTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27595a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long g;
    public String h;
    public final WeakReference<Object> k;
    public final Map<String, String> f = new HashMap();
    public final Map<String, Long> i = new HashMap();
    public boolean j = false;

    static {
        t2o.a(1034944551);
        t2o.a(1034944550);
    }

    public rtf(Object obj) {
        this.k = new WeakReference<>(obj);
        try {
            this.f27595a = UUID.randomUUID().toString();
        } catch (Exception unused) {
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc10103", new Object[]{this, str});
            return;
        }
        try {
            if (!str.equals(qsf.EVENT_DESTORY) || this.b != null) {
                b(str).n();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final qsf.b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qsf.b) ipChange.ipc$dispatch("a601d393", new Object[]{this, str});
        }
        return qsf.a(str).p(this.f27595a).o(this.b).l(this.c).q(this.e).k(this.i).j("pageArgs", new HashMap(this.f));
    }

    public final String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206e0beb", new Object[]{this, map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value != null) {
                String d = sd8.d(value);
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(d);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onAreaAppear(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e575b3", new Object[]{this, str, map});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.g;
            String str2 = this.h;
            if (str2 != null) {
                Long l = (Long) ((HashMap) this.i).get(str2);
                if (l != null) {
                    ((HashMap) this.i).put(this.h, Long.valueOf(l.longValue() + j));
                } else {
                    ((HashMap) this.i).put(this.h, Long.valueOf(j));
                }
            }
            this.h = str;
            this.g = currentTimeMillis;
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onClick(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add73f8b", new Object[]{this, str, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onItemAppear(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47785263", new Object[]{this, str, str2, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onItemDisappear(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fefb4c", new Object[]{this, str, str2});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.d = currentTimeMillis;
            if (this.h != null) {
                this.g = currentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageCreate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee4876a", new Object[]{this, str, map});
            return;
        }
        try {
            this.b = str;
            if (map != null) {
                ((HashMap) this.f).putAll(map);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
            return;
        }
        try {
            a(qsf.EVENT_DESTORY);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPageDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.e += currentTimeMillis - this.d;
            String str = this.h;
            if (str != null) {
                long j = currentTimeMillis - this.g;
                Long l = (Long) ((HashMap) this.i).get(str);
                if (l != null) {
                    ((HashMap) this.i).put(this.h, Long.valueOf(l.longValue() + j));
                } else {
                    ((HashMap) this.i).put(this.h, Long.valueOf(j));
                }
            }
            if (this.j) {
                a(qsf.EVENT_UPDATE_STAY_TIME);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPopupAppear(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3160412", new Object[]{this, str, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void onPopupDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9827119d", new Object[]{this});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void updateAreaArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7104a4b", new Object[]{this, map});
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void updatePageArgs(Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc89609", new Object[]{this, map});
            return;
        }
        try {
            Object obj = this.k.get();
            if (obj instanceof Activity) {
                try {
                    map2 = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) obj);
                } catch (Exception unused) {
                    map2 = null;
                }
                String c = c(map2);
                this.c = c;
                if (c == null) {
                    try {
                        this.c = c(UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj));
                    } catch (Exception unused2) {
                    }
                }
            }
            if (map != null) {
                ((HashMap) this.f).putAll(map);
            }
            if (!this.j) {
                this.j = true;
                a(qsf.EVENT_ENTER);
            }
        } catch (Exception unused3) {
        }
    }

    @Override // com.taobao.android.jarviswe.tracker.JarvisTracker
    public void updatePopupArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c058333e", new Object[]{this, map});
        }
    }
}
