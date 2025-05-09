package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.remote.RemoteManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.result.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "m2";
    public static volatile m2 c;
    public static volatile boolean d;

    /* renamed from: a  reason: collision with root package name */
    public n2 f2766a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements o2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o2 f2767a;

        public a(o2 o2Var) {
            this.f2767a = o2Var;
        }

        @Override // com.alibaba.security.realidentity.o2
        public void remoteAssetsResult(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d43f0ca6", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            if (z) {
                m2.a(true);
            }
            this.f2767a.remoteAssetsResult(z, i, str);
        }
    }

    public m2() {
        b(g1.f().b());
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    private void b(Context context) {
        try {
            Object newInstance = RemoteManager.class.getConstructor(Context.class).newInstance(context);
            if (newInstance instanceof n2) {
                this.f2766a = (n2) newInstance;
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (!b()) {
                System.loadLibrary("ALBiometricsJni");
                d = true;
            }
        } catch (Throwable th) {
            com.alibaba.security.realidentity.a.a(b, th);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.f2766a != null) {
            return true;
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!d) {
            n2 n2Var = this.f2766a;
            if (n2Var == null) {
                d();
            } else {
                d = n2Var.loadRemoteSo();
            }
        }
    }

    public static m2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2) ipChange.ipc$dispatch("3c85ee93", new Object[0]);
        }
        if (c == null) {
            synchronized (m2.class) {
                try {
                    if (c == null) {
                        c = new m2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return d;
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        n2 n2Var = this.f2766a;
        if (n2Var == null) {
            return false;
        }
        return n2Var.needLoadRemoteSo();
    }

    public void a(Context context, o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df443f47", new Object[]{this, context, o2Var});
            return;
        }
        n2 n2Var = this.f2766a;
        if (n2Var == null) {
            o2Var.remoteAssetsResult(true, 0, Result.MSG_SUCCESS);
        } else {
            n2Var.getRemoteSoAsync(new a(o2Var));
        }
    }

    public void a(Context context, RPBizConfig rPBizConfig, o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f62cf82b", new Object[]{this, context, rPBizConfig, o2Var});
            return;
        }
        n2 n2Var = this.f2766a;
        if (n2Var == null) {
            o2Var.remoteAssetsResult(true, 0, Result.MSG_SUCCESS);
        } else {
            n2Var.getRemoteModel(context, rPBizConfig, o2Var);
        }
    }

    public boolean a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c542848", new Object[]{this, context, rPBizConfig})).booleanValue();
        }
        n2 n2Var = this.f2766a;
        if (n2Var == null) {
            return false;
        }
        return n2Var.needDownloadModel(rPBizConfig);
    }
}
