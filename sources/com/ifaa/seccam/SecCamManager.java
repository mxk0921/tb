package com.ifaa.seccam;

import android.content.Context;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.IFAASecCamCallback;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import org.json.JSONObject;
import tb.n1f;
import tb.opa;
import tb.pi4;
import tb.q4l;
import tb.s6p;
import tb.v6p;
import tb.x6p;
import tb.zu6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SecCamManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SecCamManager d = new SecCamManager();

    /* renamed from: a  reason: collision with root package name */
    public Context f5541a;
    public q4l b;
    public IFAASecCamInterface c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements pi4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f5542a;
        public final /* synthetic */ n1f b;

        public a(byte[] bArr, n1f n1fVar) {
            this.f5542a = bArr;
            this.b = n1fVar;
        }

        @Override // tb.pi4
        public void a(IFAASecCamInterface iFAASecCamInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4204cb8d", new Object[]{this, iFAASecCamInterface});
            } else if (iFAASecCamInterface != null) {
                SecCamManager.a(SecCamManager.this, this.f5542a, this.b);
            } else {
                v6p.a("SecCamManager", "the connection is failed.");
                this.b.a(101, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements pi4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zu6 f5543a;

        public b(zu6 zu6Var) {
            this.f5543a = zu6Var;
        }

        @Override // tb.pi4
        public void a(IFAASecCamInterface iFAASecCamInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4204cb8d", new Object[]{this, iFAASecCamInterface});
            } else if (iFAASecCamInterface != null) {
                SecCamManager.this.f(this.f5543a);
            } else {
                v6p.a("SecCamManager", "the deviceinfo connection is failed.");
                ((opa.a) this.f5543a).a(401, null);
            }
        }
    }

    public static /* synthetic */ void a(SecCamManager secCamManager, byte[] bArr, n1f n1fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fd0120", new Object[]{secCamManager, bArr, n1fVar});
        } else {
            secCamManager.j(bArr, n1fVar);
        }
    }

    public static /* synthetic */ q4l b(SecCamManager secCamManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q4l) ipChange.ipc$dispatch("2a322ece", new Object[]{secCamManager});
        }
        return secCamManager.b;
    }

    public static SecCamManager h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecCamManager) ipChange.ipc$dispatch("500194fe", new Object[0]);
        }
        return d;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d07817b1", new Object[]{this})).intValue();
        }
        try {
            v6p.a("SecCamManager", "closeCam start!");
            this.f5541a = null;
            this.b = null;
            v6p.a("SecCamManager", "closeCam end!");
            return this.c.closeSecCam();
        } catch (Exception e) {
            v6p.a("SecCamManager", "close error :: " + e.toString());
            return -1;
        }
    }

    public s6p d(int i, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6p) ipChange.ipc$dispatch("61966fbb", new Object[]{this, new Integer(i), bArr, new Boolean(z)});
        }
        s6p s6pVar = new s6p();
        try {
            SharedMemory d2 = x6p.d(bArr);
            int secImg = this.c.getSecImg(i, d2);
            v6p.a("SecCamManager", "CamImg code = " + secImg);
            if (secImg == 0) {
                byte[] k = x6p.k(d2);
                v6p.a("SecCamManager", "CamImg length = " + k.length);
                s6pVar.f(k);
                s6pVar.h(300);
                if (z && !x6p.h(s6pVar, k)) {
                    v6p.a("SecCamManager", "CamImg imgAnalysis = ");
                    s6pVar.h(303);
                }
            } else {
                s6pVar.h(301);
            }
        } catch (Exception e) {
            v6p.a("SecCamManager", "get img error :: " + e.toString());
            s6pVar.h(302);
        }
        return s6pVar;
    }

    public void e(zu6 zu6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c35dfa", new Object[]{this, zu6Var});
        } else if (x6p.i()) {
            v6p.a("SecCamManager", "device info connected!");
            f(zu6Var);
        } else if (!x6p.b(this.f5541a, new b(zu6Var))) {
            v6p.a("SecCamManager", "the init connection is failed.");
            ((opa.a) zu6Var).a(401, null);
        }
    }

    public void f(zu6 zu6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd45a968", new Object[]{this, zu6Var});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", String.valueOf(this.c.getVersion()));
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, this.c.getDeviceModel());
            ((opa.a) zu6Var).a(400, String.valueOf(jSONObject));
        } catch (Exception unused) {
            v6p.a("SecCamManager", "the deviceinfo connection is failed.");
            ((opa.a) zu6Var).a(402, null);
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this});
        }
        try {
            return this.c.getDeviceModel();
        } catch (Exception e) {
            v6p.a("SecCamManager", "get device model error :: " + e.toString());
            return null;
        }
    }

    public void i(byte[] bArr, n1f n1fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1941662", new Object[]{this, bArr, n1fVar});
        } else if (x6p.i()) {
            v6p.a("SecCamManager", "init connected!");
            j(bArr, n1fVar);
        } else if (!x6p.b(this.f5541a, new a(bArr, n1fVar))) {
            v6p.a("SecCamManager", "the init connection is failed.");
            n1fVar.a(101, null);
        }
    }

    public final void j(byte[] bArr, n1f n1fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ac127a", new Object[]{this, bArr, n1fVar});
            return;
        }
        try {
            v6p.a("SecCamManager", "initCamStep2!");
            SharedMemory d2 = x6p.d(bArr);
            if (d2 != null) {
                if (this.c.initSecCam(d2) == 0) {
                    n1fVar.a(100, x6p.k(d2));
                } else {
                    n1fVar.a(102, null);
                }
            }
        } catch (Exception e) {
            v6p.a("SecCamManager", "init error :: " + e.toString());
            n1fVar.a(102, null);
        }
    }

    public void k(int i, q4l q4lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d30920", new Object[]{this, new Integer(i), q4lVar});
            return;
        }
        try {
            this.b = q4lVar;
            this.c.openSecCam(i, new IFAASecCamCallback.Stub() { // from class: com.ifaa.seccam.SecCamManager.2
                @Override // com.ifaa.seccam.IFAASecCamCallback
                public void onFrameEvent(int i2, int i3) throws RemoteException {
                    if (i2 == 0) {
                        SecCamManager.b(SecCamManager.this).a(200, i3);
                    } else {
                        SecCamManager.b(SecCamManager.this).a(201, -1);
                    }
                }
            });
        } catch (Exception e) {
            v6p.a("SecCamManager", "open error :: " + e.toString());
            q4lVar.a(202, -1);
        }
    }

    public void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c0dab", new Object[]{this, context});
        } else {
            this.f5541a = context;
        }
    }
}
