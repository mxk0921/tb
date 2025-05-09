package tb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.permisson.PermissionActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f21016a;
    public static boolean b = false;
    public static b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f21017a;

        public a(b bVar) {
            this.f21017a = bVar;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                return;
            }
            b bVar = this.f21017a;
            if (bVar != null) {
                bVar.onDenied();
            }
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
                return;
            }
            b bVar = this.f21017a;
            if (bVar != null) {
                bVar.onGranted();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onDenied();

        void onGranted();
    }

    static {
        t2o.a(806356399);
    }

    public static void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374ecb52", new Object[]{context, bVar});
        } else if (context != null && bVar != null) {
            Intent intent = new Intent(context, PermissionActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
            f21016a = bVar;
            b = true;
            if (v2s.o().E() != null) {
                v2s.o().E().track4Show("Page_TaobaoLiveWatch", "Show-checkFloatWindowPermission", new HashMap());
            }
        }
    }

    public static void b(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e1537", new Object[]{context, bVar});
            return;
        }
        long serverTime = v2s.o().C().getServerTime();
        long f = f();
        if (f < 0 || serverTime - f > qvs.a() * 60000) {
            i(v2s.o().C().getServerTime());
            a(context, new a(bVar));
        } else if (bVar != null) {
            bVar.onDenied();
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a31ce28", new Object[0]);
            return;
        }
        f21016a = null;
        b = false;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fed068", new Object[0]);
        } else {
            c = null;
        }
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("330cda46", new Object[0])).longValue();
        }
        if (v2s.o().f() == null || v2s.o().f().getApplication() == null) {
            return -1L;
        }
        return v2s.o().f().getApplication().getSharedPreferences("taolive", 0).getLong("LastTimeCloseFloatWindowPermisson", -1L);
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86670918", new Object[]{new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hasOverlayPermission", String.valueOf(z));
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "checkFloatWindowPermission", hashMap);
        }
        b bVar = f21016a;
        if (bVar != null) {
            if (z) {
                bVar.onGranted();
            } else {
                bVar.onDenied();
            }
            f21016a = null;
            b = false;
        }
    }

    public static void h(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9eb3f4", new Object[]{new Integer(i), strArr, iArr});
        } else if (c != null) {
            if (j(iArr)) {
                c.onGranted();
            } else {
                c.onDenied();
            }
            c = null;
        }
    }

    public static boolean j(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ed827e4", new Object[]{iArr})).booleanValue();
        }
        if (iArr.length < 1) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d1c4bc8", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c610eabe", new Object[]{new Long(j)});
        } else if (v2s.o().f() != null && v2s.o().f().getApplication() != null) {
            SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("taolive", 0).edit();
            edit.putLong("LastTimeCloseFloatWindowPermisson", j);
            edit.apply();
        }
    }

    public static void c(Context context, String[] strArr, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324d5285", new Object[]{context, strArr, bVar});
        } else if (Build.VERSION.SDK_INT >= 23) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != 0) {
                try {
                    Intent intent = new Intent(context, PermissionActivity.class);
                    intent.putStringArrayListExtra("permissions", arrayList);
                    context.startActivity(intent);
                    c = bVar;
                } catch (Throwable unused) {
                    if (bVar != null) {
                        bVar.onDenied();
                    }
                }
            } else if (bVar != null) {
                bVar.onGranted();
            }
        } else if (bVar != null) {
            bVar.onGranted();
        }
    }
}
