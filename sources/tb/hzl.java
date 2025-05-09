package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.taobao.windvane.runtimepermission.PermissionActivity;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class hzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f20985a;

    static {
        t2o.a(989856381);
    }

    public static /* synthetic */ a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8f4e939b", new Object[]{aVar});
        }
        f20985a = aVar;
        return aVar;
    }

    public static synchronized a b(Context context, String[] strArr) {
        synchronized (hzl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e558ba15", new Object[]{context, strArr});
            } else if (context == null) {
                throw new NullPointerException("context can not be null");
            } else if (strArr == null || strArr.length == 0) {
                throw new NullPointerException("permissions can not be null");
            } else {
                a aVar = new a();
                a.a(aVar, context);
                a.b(aVar, strArr);
                return aVar;
            }
        }
    }

    public static void c(int i, int i2, Intent intent) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{new Integer(i), new Integer(i2), intent});
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a aVar = f20985a;
            canDrawOverlays = Settings.canDrawOverlays(aVar.e());
            aVar.f(canDrawOverlays);
        }
        f20985a = null;
    }

    public static void d(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{new Integer(i), strArr, iArr});
            return;
        }
        a aVar = f20985a;
        if (aVar != null) {
            aVar.f(e(iArr));
            f20985a = null;
        }
    }

    public static boolean e(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ed827e4", new Object[]{iArr})).booleanValue();
        }
        if (iArr == null || iArr.length < 1) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f20986a;
        public String[] b;
        public String c;
        public String d;
        public Runnable e;
        public Runnable f;

        static {
            t2o.a(989856382);
        }

        public static /* synthetic */ Context a(a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("99f8c6a8", new Object[]{aVar, context});
            }
            aVar.f20986a = context;
            return context;
        }

        public static /* synthetic */ String[] b(a aVar, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("b43f8af5", new Object[]{aVar, strArr});
            }
            aVar.b = strArr;
            return strArr;
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            this.f20986a = null;
            this.e = null;
            this.f = null;
        }

        public Context e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
            }
            return this.f20986a;
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa541980", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = this.f;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            c();
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("98535103", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a h(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34029b20", new Object[]{this, runnable});
            }
            this.f = runnable;
            return this;
        }

        public a i(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ea0e23ca", new Object[]{this, runnable});
            }
            if (runnable != null) {
                this.e = runnable;
                return this;
            }
            throw new NullPointerException("permissionGrantedRunnable is null");
        }

        public a j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b6a30b69", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public void d() {
            String[] strArr;
            boolean canDrawOverlays;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            } else if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr2 = this.b;
                if (strArr2.length != 1 || !strArr2[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.b) {
                        try {
                            if (ContextCompat.checkSelfPermission(this.f20986a, str) != 0) {
                                arrayList.add(str);
                            }
                        } catch (Throwable unused) {
                            this.e.run();
                            return;
                        }
                    }
                    if (arrayList.size() == 0) {
                        this.e.run();
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setClass(this.f20986a, PermissionActivity.class);
                    if (!(this.f20986a instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    intent.putExtra("permissions", this.b);
                    intent.putExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME, this.d);
                    intent.putExtra("title", this.c);
                    hzl.a(this);
                    this.f20986a.startActivity(intent);
                    return;
                }
                canDrawOverlays = Settings.canDrawOverlays(this.f20986a);
                if (!canDrawOverlays) {
                    Intent intent2 = new Intent();
                    intent2.setClass(this.f20986a, PermissionActivity.class);
                    intent2.putExtra("permissions", this.b);
                    hzl.a(this);
                    this.f20986a.startActivity(intent2);
                    return;
                }
                this.e.run();
            } else if (ContextCompat.checkSelfPermission(this.f20986a, this.b[0]) == 0) {
                this.e.run();
            } else {
                this.f.run();
            }
        }
    }
}
