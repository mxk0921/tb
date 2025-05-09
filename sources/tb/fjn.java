package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.lifecycle.LifecycleEventSource;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fjn extends k04<gjn> implements bhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean c;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19344a;
    public final List<v4g> b = new ArrayList();

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        c = z;
    }

    public fjn(Handler handler) {
        this.f19344a = handler;
    }

    public static /* synthetic */ Object ipc$super(fjn fjnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/memory/leak/ReachabilityObjectCollector");
    }

    @Override // tb.k04
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4c7c910", new Object[]{this});
        }
        return new int[]{4};
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    @Override // tb.k04
    public void d(int i, Map<String, ?> map) {
        Fragment fragment;
        View view;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa642358", new Object[]{this, new Integer(i), map});
            return;
        }
        Object obj = map.get(LifecycleEventSource.PARAM_LIFECYCLE);
        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : -1;
        if (intValue >= 0) {
            if (intValue == 107) {
                Object obj2 = map.get("page");
                if (obj2 instanceof Activity) {
                    Activity activity = (Activity) obj2;
                    Intent intent = activity.getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra("apmPageSession");
                    } else {
                        str = "null";
                    }
                    j(str, activity);
                }
            }
            if (intValue == 212) {
                Object obj3 = map.get("page");
                if ((obj3 instanceof Fragment) && (view = (fragment = (Fragment) obj3).getView()) != null) {
                    j(g(fragment) + "_" + fragment.getClass().getName(), view);
                }
            }
            if (intValue == 213) {
                Object obj4 = map.get("page");
                if (obj4 instanceof Fragment) {
                    Fragment fragment2 = (Fragment) obj4;
                    j(g(fragment2), fragment2);
                }
            }
        }
    }

    /* renamed from: f */
    public gjn a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gjn) ipChange.ipc$dispatch("ce4af9c5", new Object[]{this, new Integer(i), map});
        }
        if (!c) {
            return new gjn();
        }
        return new gjn(SystemClock.uptimeMillis(), h());
    }

    public final String g(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5216e962", new Object[]{this, fragment});
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments.getString("apmPageSession");
        }
        return "null";
    }

    public final List<v4g> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("daf456c6", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            v4g v4gVar = (v4g) it.next();
            if (v4gVar.get() != null) {
                arrayList.add(v4gVar);
            } else {
                it.remove();
            }
        }
        return arrayList;
    }

    public final /* synthetic */ void i(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1327ff", new Object[]{this, obj, str});
            return;
        }
        ((ArrayList) this.b).add(new v4g(obj, str, SystemClock.uptimeMillis()));
        TLog.loge("MetricKit.ReachabilityObjectCollector", "Watching " + obj.getClass().getName() + " with tag " + str);
    }

    public void j(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2f91fc", new Object[]{this, str, obj});
        } else if (c) {
            this.f19344a.post(new Runnable() { // from class: tb.ejn
                @Override // java.lang.Runnable
                public final void run() {
                    fjn.this.i(obj, str);
                }
            });
        }
    }
}
