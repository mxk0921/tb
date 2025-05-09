package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import com.taobao.android.riverlogger.inspector.ChannelVerifyStatus;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m7h extends com.taobao.android.riverlogger.inspector.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ArrayList<c> i = new ArrayList<>();
    public final ConcurrentHashMap<Integer, x24> j = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, x24> k = new ConcurrentHashMap<>();
    public x24 l;
    public ChannelVerifyStatus m;
    public String n;
    public boolean o;
    public boolean p;
    public final ConcurrentHashMap<String, Boolean> q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements RVLRemoteConnectCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f23818a;

        public a(m7h m7hVar, WeakReference weakReference) {
            this.f23818a = weakReference;
        }

        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
        public void finish(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str});
                return;
            }
            m7h m7hVar = (m7h) this.f23818a.get();
            if (m7hVar != null) {
                m7h.E(m7hVar, z, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$riverlogger$inspector$ChannelVerifyStatus;

        static {
            int[] iArr = new int[ChannelVerifyStatus.values().length];
            $SwitchMap$com$taobao$android$riverlogger$inspector$ChannelVerifyStatus = iArr;
            try {
                iArr[ChannelVerifyStatus.NotVerified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$riverlogger$inspector$ChannelVerifyStatus[ChannelVerifyStatus.Verifying.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$riverlogger$inspector$ChannelVerifyStatus[ChannelVerifyStatus.VerifySuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$riverlogger$inspector$ChannelVerifyStatus[ChannelVerifyStatus.VerifyFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f23819a;
        public final x24 b;

        static {
            t2o.a(649068589);
        }

        public c(JSONObject jSONObject, x24 x24Var) {
            this.f23819a = jSONObject;
            this.b = x24Var;
        }
    }

    static {
        t2o.a(649068586);
    }

    public m7h() {
        ChannelVerifyStatus channelVerifyStatus;
        if (qcn.a()) {
            channelVerifyStatus = ChannelVerifyStatus.VerifySuccess;
        } else {
            channelVerifyStatus = ChannelVerifyStatus.NotVerified;
        }
        this.m = channelVerifyStatus;
        this.n = null;
        this.o = false;
        this.p = false;
        this.q = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ void E(m7h m7hVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f054f36a", new Object[]{m7hVar, new Boolean(z), str});
        } else {
            m7hVar.K(z, str);
        }
    }

    public static /* synthetic */ Object ipc$super(m7h m7hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/LocalChannel");
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf8ff53", new Object[]{this})).booleanValue();
        }
        if (this.m == ChannelVerifyStatus.VerifySuccess) {
            return true;
        }
        return false;
    }

    public final void H(JSONObject jSONObject, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee41f40d", new Object[]{this, jSONObject, x24Var});
        } else if (jSONObject == null) {
            x24Var.a(wi3.a(-2, "invalid message"));
        } else {
            int o = o();
            try {
                jSONObject.put("id", o);
            } catch (JSONException unused) {
            }
            this.j.put(Integer.valueOf(o), x24Var);
            s(jSONObject);
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25b2880", new Object[]{this});
        } else if (this.m == ChannelVerifyStatus.NotVerified) {
            this.m = ChannelVerifyStatus.Verifying;
            C("Local", new a(this, new WeakReference(this)));
        }
    }

    public final void K(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6406d74c", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            this.m = ChannelVerifyStatus.VerifySuccess;
            ti3.a(this);
            synchronized (this.i) {
                try {
                    Iterator<c> it = this.i.iterator();
                    while (it.hasNext()) {
                        c next = it.next();
                        H(next.f23819a, next.b);
                    }
                    this.i.clear();
                } finally {
                }
            }
        } else {
            this.n = str;
            this.m = ChannelVerifyStatus.VerifyFailed;
            JSONObject a2 = wi3.a(101, str);
            synchronized (this.i) {
                try {
                    Iterator<c> it2 = this.i.iterator();
                    while (it2.hasNext()) {
                        it2.next().b.a(a2);
                    }
                    this.i.clear();
                } finally {
                }
            }
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void h(int i, String str, JSONObject jSONObject, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7821ac40", new Object[]{this, new Integer(i), str, jSONObject, messagePriority});
            return;
        }
        x24 remove = this.j.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.a(jSONObject);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void v(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a31fa92", new Object[]{this, str, messagePriority});
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void w(String str, String str2, String str3, MessagePriority messagePriority, x24 x24Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633db103", new Object[]{this, str, str2, str3, messagePriority, x24Var});
        } else if (str != null && this.l != null) {
            if (this.m == ChannelVerifyStatus.VerifySuccess || com.taobao.android.riverlogger.inspector.a.DEV_VERIFY.contentEquals(str)) {
                if (str3 != null) {
                    try {
                        jSONObject = new JSONObject(str3);
                    } catch (JSONException unused) {
                    }
                    x(str, str2, jSONObject, messagePriority, x24Var);
                }
                jSONObject = null;
                x(str, str2, jSONObject, messagePriority, x24Var);
            }
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void x(String str, String str2, JSONObject jSONObject, MessagePriority messagePriority, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c06c3", new Object[]{this, str, str2, jSONObject, messagePriority, x24Var});
        } else if (str != null && this.l != null) {
            if (this.m == ChannelVerifyStatus.VerifySuccess || com.taobao.android.riverlogger.inspector.a.DEV_VERIFY.contentEquals(str)) {
                if (x24Var == null) {
                    if (!this.o && !this.q.containsKey(str)) {
                        return;
                    }
                } else if (!this.p && !this.q.containsKey(str)) {
                    return;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (!F(str, jSONObject)) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("method", str);
                        jSONObject2.put("params", jSONObject);
                        jSONObject2.putOpt("sessionId", str2);
                        if (x24Var != null) {
                            String num = Integer.toString(o());
                            jSONObject2.put(wi3.ResponseId, num);
                            this.k.put(num, x24Var);
                        }
                    } catch (JSONException unused) {
                    }
                    this.l.a(jSONObject2);
                }
            }
        }
    }

    public final boolean F(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5c0292e", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (!"Dev.log".equals(str) || !"Bridge".equals(jSONObject.optString("module")) || (optJSONObject = jSONObject.optJSONObject("ext")) == null) {
            return false;
        }
        return optJSONObject.optString("name").startsWith("RiverLogger.");
    }

    public void I(JSONObject jSONObject, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfca6c6e", new Object[]{this, jSONObject, x24Var});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray == null) {
            this.o = true;
            this.p = true;
        } else {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    if ("event".contentEquals(optString)) {
                        this.o = true;
                    } else if ("method".contentEquals(optString)) {
                        this.p = true;
                    } else {
                        this.q.put(optString, Boolean.TRUE);
                    }
                }
            }
        }
        this.l = x24Var;
        ChannelVerifyStatus channelVerifyStatus = this.m;
        if (channelVerifyStatus == ChannelVerifyStatus.NotVerified) {
            J();
        } else if (!this.e && channelVerifyStatus == ChannelVerifyStatus.VerifySuccess) {
            ti3.a(this);
        }
    }

    public void G(JSONObject jSONObject, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265f7658", new Object[]{this, jSONObject, x24Var});
        } else if (jSONObject == null) {
            x24Var.a(wi3.a(-2, "invalid message"));
        } else {
            String optString = jSONObject.optString(wi3.ResponseId);
            if (!optString.isEmpty()) {
                x24 remove = this.k.remove(optString);
                if (remove == null) {
                    x24Var.a(wi3.a(-4, "responseId not found"));
                    return;
                }
                remove.a(jSONObject);
                x24Var.a(new JSONObject());
                return;
            }
            int i = b.$SwitchMap$com$taobao$android$riverlogger$inspector$ChannelVerifyStatus[this.m.ordinal()];
            if (i == 1) {
                J();
            } else if (i != 2) {
                if (i == 3) {
                    if (!this.e) {
                        ti3.a(this);
                    }
                    H(jSONObject, x24Var);
                    return;
                } else if (i == 4) {
                    x24Var.a(wi3.a(-10, this.n));
                    return;
                } else {
                    return;
                }
            }
            synchronized (this.i) {
                this.i.add(new c(jSONObject, x24Var));
            }
        }
    }
}
