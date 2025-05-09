package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mxn extends com.taobao.android.riverlogger.inspector.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static File n;
    public final String i;
    public boolean j;
    public rcn k;
    public RVLRemoteConnectCallback l;
    public int m = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements l0x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d377a080", new Object[]{this, new Integer(i), str});
                return;
            }
            mxn.H(mxn.this);
            if (i == 4040) {
                str = "Debug page is closed";
            } else if (TextUtils.isEmpty(str)) {
                str = "WebSocket closed";
            }
            mxn.this.q(i, str);
            if (i == 4040) {
                mxn.this.i(str);
            } else if (mxn.F(mxn.this) >= 3) {
                mxn.this.i("connect failed");
            }
            mxn.I(mxn.this, null);
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7adf907", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "WebSocket error";
            }
            mxn.this.q(-1, str);
            mxn.I(mxn.this, null);
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("118d2a46", new Object[]{this, str});
                return;
            }
            mxn.G(mxn.this, 0);
            mxn.this.r(str);
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb387e23", new Object[]{this});
            } else {
                mxn.E(mxn.this);
            }
        }
    }

    static {
        t2o.a(649068605);
    }

    public mxn(String str) {
        this.i = str;
        M();
    }

    public static /* synthetic */ void E(mxn mxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18885547", new Object[]{mxnVar});
        } else {
            mxnVar.Q();
        }
    }

    public static /* synthetic */ int F(mxn mxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c17d97b", new Object[]{mxnVar})).intValue();
        }
        return mxnVar.m;
    }

    public static /* synthetic */ int G(mxn mxnVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f60a9ac", new Object[]{mxnVar, new Integer(i)})).intValue();
        }
        mxnVar.m = i;
        return i;
    }

    public static /* synthetic */ int H(mxn mxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfc4dd83", new Object[]{mxnVar})).intValue();
        }
        int i = mxnVar.m;
        mxnVar.m = 1 + i;
        return i;
    }

    public static /* synthetic */ rcn I(mxn mxnVar, rcn rcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rcn) ipChange.ipc$dispatch("c7cec4b7", new Object[]{mxnVar, rcnVar});
        }
        mxnVar.k = rcnVar;
        return rcnVar;
    }

    public static /* synthetic */ Object ipc$super(mxn mxnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1810248055:
                super.i((String) objArr[0]);
                return null;
            case -334794824:
                super.k();
                return null;
            case -296774751:
                super.q(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            case -291083033:
                super.t();
                return null;
            case 499312007:
                super.g();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/RemoteChannel");
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9a2496", new Object[]{this});
            return;
        }
        this.k = new rcn(URI.create(this.i), new a());
        if (this.e) {
            u();
        }
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb5faa60", new Object[]{this});
        }
        return this.i;
    }

    public final rcn M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rcn) ipChange.ipc$dispatch("c10a3b39", new Object[]{this});
        }
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        K();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.k;
    }

    public void O(RVLRemoteConnectCallback rVLRemoteConnectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb30766", new Object[]{this, rVLRemoteConnectCallback});
        } else {
            this.l = rVLRemoteConnectCallback;
        }
    }

    public void P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1b429c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edffce5d", new Object[]{this});
            return;
        }
        RVLRemoteConnectCallback rVLRemoteConnectCallback = this.l;
        if (rVLRemoteConnectCallback != null) {
            this.l = null;
            rVLRemoteConnectCallback.finish(true, null);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc2e587", new Object[]{this});
            return;
        }
        super.g();
        N();
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        super.i(str);
        rcn rcnVar = this.k;
        if (rcnVar != null) {
            rcnVar.close();
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0b6fb8", new Object[]{this});
            return;
        }
        super.k();
        N();
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4f93a1", new Object[]{this, new Integer(i), str});
            return;
        }
        super.q(i, str);
        RVLRemoteConnectCallback rVLRemoteConnectCallback = this.l;
        if (rVLRemoteConnectCallback != null) {
            this.l = null;
            rVLRemoteConnectCallback.finish(false, str);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void t() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea66ce7", new Object[]{this});
            return;
        }
        super.t();
        if (this.j && (file = n) != null) {
            file.delete();
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void v(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a31fa92", new Object[]{this, str, messagePriority});
            return;
        }
        rcn M = M();
        if (M != null) {
            M.g(str, messagePriority);
        }
    }

    public static mxn J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mxn) ipChange.ipc$dispatch("12e0247a", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        File file = new File(str, "rc_config");
        n = file;
        try {
            JSONObject b = qcn.b(qcn.c(file));
            if (b == null) {
                return null;
            }
            String optString = b.optString("server");
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            mxn mxnVar = new mxn(optString);
            mxnVar.P(true);
            JSONArray optJSONArray = b.optJSONArray("enabled");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString2)) {
                        hashSet.add(optString2);
                    }
                }
                ((CopyOnWriteArraySet) mxnVar.d).addAll(hashSet);
            }
            return mxnVar;
        } catch (IOException e) {
            icn j = lcn.a(RVLLevel.Error, qcn.RVLModuleName).j("openRemote");
            j.g(101, "read config failed: " + e.getMessage()).f();
            return null;
        }
    }

    public final void N() {
        Throwable th;
        IOException e;
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4ab73e", new Object[]{this});
        } else if (this.j && n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("server", this.i);
                jSONObject.put("enabled", new JSONArray((Collection) this.d));
                String jSONObject2 = jSONObject.toString();
                n.getParentFile().mkdirs();
                FileWriter fileWriter2 = null;
                try {
                    try {
                        try {
                            n.createNewFile();
                            fileWriter = new FileWriter(n);
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        fileWriter.write(jSONObject2);
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException e3) {
                        e = e3;
                        fileWriter2 = fileWriter;
                        lcn.a(RVLLevel.Warn, qcn.RVLModuleName).k("persistServer", A()).h(102, "write config failed: ", e.getMessage()).f();
                        if (fileWriter2 != null) {
                            fileWriter2.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileWriter2 = fileWriter;
                        if (fileWriter2 != null) {
                            try {
                                fileWriter2.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            } catch (JSONException e4) {
                lcn.a(RVLLevel.Warn, qcn.RVLModuleName).k("persistServer", A()).h(101, "write config failed: ", e4.getMessage()).f();
            }
        }
    }
}
