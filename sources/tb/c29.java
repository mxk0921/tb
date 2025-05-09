package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.aidl.IFavContent;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static c29 n;

    /* renamed from: a  reason: collision with root package name */
    public Context f16788a;
    public int c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public IFavContentCallBack j;
    public IFavContent l;
    public boolean b = false;
    public int k = 0;
    public final ServiceConnection m = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            c29.b(c29.this, IFavContent.Stub.asInterface(iBinder));
            c29.d(c29.this, true);
            int e = c29.e(c29.this);
            if (e != 1) {
                if (e != 2) {
                    if (e == 3 && c29.a(c29.this) != null) {
                        try {
                            c29.a(c29.this).newDeleteFavoriteContent(c29.f(c29.this), c29.g(c29.this), c29.h(c29.this), c29.i(c29.this), c29.j(c29.this));
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                } else if (c29.a(c29.this) != null) {
                    try {
                        c29.a(c29.this).newAddFavoriteContent(c29.f(c29.this), c29.g(c29.this), c29.h(c29.this), c29.k(c29.this), c29.l(c29.this), c29.c(c29.this), c29.i(c29.this), c29.j(c29.this));
                    } catch (RemoteException e3) {
                        e3.printStackTrace();
                    }
                }
            } else if (c29.a(c29.this) != null) {
                try {
                    c29.a(c29.this).newIsFavoriteContent(c29.f(c29.this), c29.g(c29.this), c29.h(c29.this), c29.i(c29.this), c29.j(c29.this));
                } catch (RemoteException e4) {
                    e4.printStackTrace();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                c29.b(c29.this, null);
            }
        }
    }

    static {
        t2o.a(462422040);
    }

    public c29(Context context) {
        this.f16788a = context;
    }

    public static /* synthetic */ IFavContent a(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFavContent) ipChange.ipc$dispatch("258a6296", new Object[]{c29Var});
        }
        return c29Var.l;
    }

    public static /* synthetic */ IFavContent b(c29 c29Var, IFavContent iFavContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFavContent) ipChange.ipc$dispatch("f1704800", new Object[]{c29Var, iFavContent});
        }
        c29Var.l = iFavContent;
        return iFavContent;
    }

    public static /* synthetic */ String c(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f192fd", new Object[]{c29Var});
        }
        return c29Var.h;
    }

    public static /* synthetic */ boolean d(c29 c29Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d321da1", new Object[]{c29Var, new Boolean(z)})).booleanValue();
        }
        c29Var.b = z;
        return z;
    }

    public static /* synthetic */ int e(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95ecf689", new Object[]{c29Var})).intValue();
        }
        return c29Var.k;
    }

    public static /* synthetic */ int f(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb80ff8a", new Object[]{c29Var})).intValue();
        }
        return c29Var.c;
    }

    public static /* synthetic */ long g(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e115088c", new Object[]{c29Var})).longValue();
        }
        return c29Var.d;
    }

    public static /* synthetic */ String h(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74e52827", new Object[]{c29Var});
        }
        return c29Var.e;
    }

    public static /* synthetic */ boolean i(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c3d1a9e", new Object[]{c29Var})).booleanValue();
        }
        return c29Var.i;
    }

    public static /* synthetic */ IFavContentCallBack j(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFavContentCallBack) ipChange.ipc$dispatch("17cc1b8a", new Object[]{c29Var});
        }
        return c29Var.j;
    }

    public static /* synthetic */ String k(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4381384", new Object[]{c29Var});
        }
        return c29Var.f;
    }

    public static /* synthetic */ String l(c29 c29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dea90ca3", new Object[]{c29Var});
        }
        return c29Var.g;
    }

    public static c29 m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c29) ipChange.ipc$dispatch("5a69a83d", new Object[]{context});
        }
        c29 c29Var = n;
        if (c29Var == null || c29Var.f16788a == null) {
            n = new c29(context);
        }
        return n;
    }

    public void n(int i, long j, String str, String str2, String str3, String str4, boolean z, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5202c7d7", new Object[]{this, new Integer(i), new Long(j), str, str2, str3, str4, new Boolean(z), iFavContentCallBack});
        } else if (this.f16788a != null) {
            this.c = i;
            this.d = j;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = z;
            this.j = iFavContentCallBack;
            this.k = 2;
            if (!this.b) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent.setPackage(this.f16788a.getApplicationContext().getPackageName());
                this.f16788a.bindService(intent, this.m, 1);
                return;
            }
            try {
                IFavContent iFavContent = this.l;
                if (iFavContent != null) {
                    iFavContent.newAddFavoriteContent(i, j, str, str2, str3, str4, z, iFavContentCallBack);
                } else {
                    Intent intent2 = new Intent();
                    intent2.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                    intent2.setPackage(this.f16788a.getApplicationContext().getPackageName());
                    this.f16788a.bindService(intent2, this.m, 1);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void o(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144fbff", new Object[]{this, new Integer(i), new Long(j), str, new Boolean(z), iFavContentCallBack});
        } else if (this.f16788a != null) {
            this.c = i;
            this.d = j;
            this.e = str;
            this.i = z;
            this.j = iFavContentCallBack;
            this.k = 3;
            if (!this.b) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent.setPackage(this.f16788a.getApplicationContext().getPackageName());
                this.f16788a.bindService(intent, this.m, 1);
                return;
            }
            try {
                IFavContent iFavContent = this.l;
                if (iFavContent != null) {
                    iFavContent.newDeleteFavoriteContent(i, j, str, z, iFavContentCallBack);
                } else {
                    Intent intent2 = new Intent();
                    intent2.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                    intent2.setPackage(this.f16788a.getApplicationContext().getPackageName());
                    this.f16788a.bindService(intent2, this.m, 1);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void p(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44127abe", new Object[]{this, new Integer(i), new Long(j), str, new Boolean(z), iFavContentCallBack});
        } else if (this.f16788a != null) {
            this.c = i;
            this.d = j;
            this.e = str;
            this.i = z;
            this.j = iFavContentCallBack;
            this.k = 1;
            if (!this.b) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent.setPackage(this.f16788a.getApplicationContext().getPackageName());
                this.f16788a.bindService(intent, this.m, 1);
                return;
            }
            try {
                IFavContent iFavContent = this.l;
                if (iFavContent != null) {
                    iFavContent.newIsFavoriteContent(i, j, str, z, iFavContentCallBack);
                } else {
                    Intent intent2 = new Intent();
                    intent2.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                    intent2.setPackage(this.f16788a.getApplicationContext().getPackageName());
                    this.f16788a.bindService(intent2, this.m, 1);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        this.f16788a = null;
        this.j = null;
    }
}
