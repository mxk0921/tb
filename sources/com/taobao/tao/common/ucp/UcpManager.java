package com.taobao.tao.common.ucp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.android.upp.d;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.HashSet;
import tb.h2b;
import tb.r5a;
import tb.t2o;
import tb.yyj;
import tb.z4a;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UcpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashSet<String> h;

    /* renamed from: a  reason: collision with root package name */
    public d f11951a = null;
    public long b = 0;
    public boolean c = false;
    public long d = 100;
    public JSONObject e = null;
    public final Handler f = new a(Looper.getMainLooper());
    public final d.b g = new b();
    public static final JSONObject EMPTY = new JSONObject();
    public static final UcpManager i = new UcpManager();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum FinishedType {
        UNKNOWN,
        NOT_OPEN,
        TIME_OUT,
        MODEL_FAILED,
        MODEL_SUCCESS,
        NOT_NEED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FinishedType finishedType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/common/ucp/UcpManager$FinishedType");
        }

        public static FinishedType valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FinishedType) ipChange.ipc$dispatch("e2a71f96", new Object[]{str}) : (FinishedType) Enum.valueOf(FinishedType.class, str);
        }

        public int value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
            }
            return ordinal();
        }

        public static FinishedType valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FinishedType) ipChange.ipc$dispatch("ca277051", new Object[]{new Integer(i)});
            }
            FinishedType finishedType = NOT_OPEN;
            if (i == finishedType.value()) {
                return finishedType;
            }
            FinishedType finishedType2 = TIME_OUT;
            if (i == finishedType2.value()) {
                return finishedType2;
            }
            FinishedType finishedType3 = MODEL_FAILED;
            if (i == finishedType3.value()) {
                return finishedType3;
            }
            FinishedType finishedType4 = MODEL_SUCCESS;
            if (i == finishedType4.value()) {
                return finishedType4;
            }
            FinishedType finishedType5 = NOT_NEED;
            return i == finishedType5.value() ? finishedType5 : UNKNOWN;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/common/ucp/UcpManager$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            UcpManager ucpManager = UcpManager.this;
            FinishedType valueOf = FinishedType.valueOf(i);
            Object obj = message.obj;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = UcpManager.a(UcpManager.this);
            }
            UcpManager.c(ucpManager, valueOf, jSONObject);
            UcpManager.d(UcpManager.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
            } else if (jSONObject == null || TextUtils.equals(com.taobao.android.upp.d.UPP_DOWNGRADE, jSONObject.getString("code"))) {
                UcpManager.e(UcpManager.this).sendEmptyMessage(FinishedType.MODEL_FAILED.value());
            } else {
                Message obtain = Message.obtain();
                obtain.what = FinishedType.MODEL_SUCCESS.value();
                obtain.obj = jSONObject;
                UcpManager.e(UcpManager.this).sendMessage(obtain);
                UcpManager.b(UcpManager.this, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UcpManager.f(UcpManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(FinishedType finishedType, JSONObject jSONObject);
    }

    public static /* synthetic */ JSONObject a(UcpManager ucpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4917fca", new Object[]{ucpManager});
        }
        return ucpManager.e;
    }

    public static /* synthetic */ JSONObject b(UcpManager ucpManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1f98f164", new Object[]{ucpManager, jSONObject});
        }
        ucpManager.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void c(UcpManager ucpManager, FinishedType finishedType, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c756564e", new Object[]{ucpManager, finishedType, jSONObject});
        } else {
            ucpManager.g(finishedType, jSONObject);
        }
    }

    public static /* synthetic */ d d(UcpManager ucpManager, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a69ebaa", new Object[]{ucpManager, dVar});
        }
        ucpManager.f11951a = dVar;
        return dVar;
    }

    public static /* synthetic */ Handler e(UcpManager ucpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("10159979", new Object[]{ucpManager});
        }
        return ucpManager.f;
    }

    public static /* synthetic */ void f(UcpManager ucpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48306ae", new Object[]{ucpManager});
        } else {
            ucpManager.h();
        }
    }

    public static UcpManager j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UcpManager) ipChange.ipc$dispatch("58f42237", new Object[0]);
        }
        return i;
    }

    public final void g(FinishedType finishedType, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437a2eef", new Object[]{this, finishedType, jSONObject});
            return;
        }
        d dVar = this.f11951a;
        if (dVar != null) {
            dVar.a(finishedType, jSONObject);
        }
        if (this.f11951a != null || FinishedType.TIME_OUT != finishedType) {
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            JSONObject jSONObject2 = new JSONObject();
            if (this.f11951a == null) {
                str = "NotCallback";
            } else {
                str = "Callback";
            }
            jSONObject2.put("status", (Object) str);
            jSONObject2.put(Constants.Monitor.EXECUTE_TIME, (Object) Long.valueOf(currentTimeMillis));
            jSONObject2.put("timeOut", (Object) Long.valueOf(this.d));
            r5a.j("Page_Home", 19999, "ucp", "pageBackMonitor", finishedType.name(), jSONObject2);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3486fc1d", new Object[]{this});
        } else {
            this.f.sendEmptyMessage(FinishedType.NOT_NEED.value());
        }
    }

    public final JSONObject i() {
        AwesomeGetContainerInnerData q;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        if (yyj.e().c() == null || (q = yyj.e().c().q(z4a.NEW_FACE_CHILD.f32522a)) == null || (jSONObject = q.ext) == null) {
            return EMPTY;
        }
        return jSONObject;
    }

    public JSONObject k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("99e49ada", new Object[]{this, str});
        }
        if (!p(str) || !q()) {
            return null;
        }
        return this.e;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae12fcd8", new Object[]{this})).booleanValue();
        }
        return i().getBooleanValue("enableUpp");
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return i().getIntValue("pageBackWaitTime");
    }

    public final JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6340213", new Object[]{this});
        }
        return i().getJSONObject("uppData");
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91135a8a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19bb149b", new Object[]{this, str})).booleanValue();
        }
        return !h.contains(str);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        if (!o() || !this.c) {
            return false;
        }
        return true;
    }

    public void r() {
        JSONObject n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0cff05", new Object[]{this});
        } else if (q() && (n = n()) != null) {
            z6d c2 = h2b.a().c();
            for (String str : n.keySet()) {
                JSONObject jSONObject = n.getJSONObject(str);
                if (jSONObject != null) {
                    UppProtocolImpl.getInstance().registerResourceSpace(r5a.f27121a, c2, str, jSONObject, null);
                }
            }
            UppProtocolImpl.getInstance().registerUPPCallbackWithScene(r5a.f27121a, c2, this.g);
        }
    }

    public boolean s(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14493318", new Object[]{this, dVar})).booleanValue();
        }
        if (!q()) {
            this.f.sendEmptyMessage(FinishedType.NOT_OPEN.value());
            return false;
        }
        z6d c2 = h2b.a().c();
        if (c2 == null) {
            this.f.sendEmptyMessage(FinishedType.NOT_NEED.value());
            return false;
        }
        View rootView = c2.getRootView();
        if (rootView == null) {
            this.f.sendEmptyMessage(FinishedType.NOT_NEED.value());
            return false;
        }
        rootView.post(new c());
        this.f11951a = dVar;
        this.b = System.currentTimeMillis();
        return true;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fee6047", new Object[]{this});
            return;
        }
        this.c = l();
        this.d = m();
    }

    static {
        t2o.a(729809249);
        HashSet<String> hashSet = new HashSet<>();
        h = hashSet;
        hashSet.add("editionSwitch");
        hashSet.add(LogContext.ENVENT_USERLOGIN);
        hashSet.add("scrollNextPage");
    }
}
