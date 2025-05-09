package tb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.schedule.ViewProxy;
import com.taobao.weex.common.Constants;
import io.unicorn.adapter.muise.UnicornMuiseJNI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import tb.q6x;
import tb.vu3;
import tb.xid;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x8x implements q6x, j6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dde f31220a;
    public w6a b;
    public final rrd d;
    public final WeexInstanceImpl g;
    public View h;
    public final ArrayList<String> i;
    public final WeexInstance j;
    public volatile ade k;
    public final WeexUnicornConfig p;
    public o6a c = new o6a();
    public xid e = null;
    public wid f = null;
    public final ConcurrentHashMap<Integer, WeexInstance> l = new ConcurrentHashMap<>();
    public boolean m = false;
    public ArrayList<yio> n = null;
    public final HashMap<String, String> o = new HashMap<>();
    public final AtomicInteger q = new AtomicInteger();
    public final Map<Integer, q6x.b> r = new ConcurrentHashMap();
    public int[] s = null;
    public boolean t = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$10");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).onResume();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$11");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).onPause();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$12");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).onStop();
                x8x.n(x8x.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Callable<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f31221a;

        public d(x8x x8xVar, JSONObject jSONObject) {
            this.f31221a = jSONObject;
        }

        /* renamed from: a */
        public JSONObject call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("31a17705", new Object[]{this});
            }
            return this.f31221a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements WeexInstanceImpl.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f31222a;
        public final /* synthetic */ FutureTask b;

        public e(JSONObject jSONObject, FutureTask futureTask) {
            this.f31222a = jSONObject;
            this.b = futureTask;
        }

        @Override // com.taobao.android.weex.WeexInstanceImpl.k
        public void a(WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daf414d8", new Object[]{this, weexValue});
                return;
            }
            if (weexValue.isObject()) {
                this.f31222a.putAll(weexValue.getObject());
            }
            x6x.c(x8x.l(x8x.this).getInstanceId(), "GetEngineInfoAsync", rb.RESULT_KEY).a("info", this.f31222a).f();
            this.b.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ hde d;

        public f(hde hdeVar) {
            this.d = hdeVar;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$15");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).c(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$19");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements ide {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("166d6835", new Object[]{this, str});
                return;
            }
            int instanceId = x8x.l(x8x.this).getInstanceId();
            x6x.c(instanceId, "Unicorn", "当前页面:" + x8x.l(x8x.this).getContext() + ",msg:" + str).f();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ q6x.a d;

        public i(q6x.a aVar) {
            this.d = aVar;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$20");
        }

        @Override // tb.yio
        public void e() throws Exception {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (x8x.q(x8x.this) != null) {
                i = x8x.q(x8x.this).j();
            } else {
                i = -1;
            }
            q6x.a aVar = this.d;
            if (aVar != null) {
                aVar.a(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                x8x.m(x8x.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            x8x.p(x8x.this).e(x8x.o(x8x.this));
            if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).w(true, x8x.p(x8x.this), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class l extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ pce d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements xid.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.xid.a
            public void a(boolean z, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eb33e231", new Object[]{this, new Boolean(z), str});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("state", Boolean.valueOf(z));
                hashMap.put("acceptGestureType", str);
                l.this.d.a(hashMap);
            }
        }

        public l(pce pceVar) {
            this.d = pceVar;
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                x8x.q(x8x.this).w(true, null, new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class m extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean d;

        public m(boolean z) {
            this.d = z;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).m("scrollable.enableScroll", Boolean.valueOf(this.d));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class n extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;

        public n(int i) {
            this.d = i;
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("velocity", Integer.valueOf(this.d));
                hashMap.put("velocityX", Integer.valueOf(this.d));
                hashMap.put("velocityY", Integer.valueOf(this.d));
                x8x.q(x8x.this).m("scrollable.goBallistic", hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class o implements xid.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        public void a(double d, double d2, String str, org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4afee1ed", new Object[]{this, new Double(d), new Double(d2), str, jSONObject});
            } else if (x8x.r(x8x.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pixels", Double.valueOf(d));
                hashMap.put("velocity", Double.valueOf(d2));
                hashMap.put(Constants.Name.CONTENT_OFFSET, jSONObject);
                hashMap.put("axis", str);
                x8x.r(x8x.this).a(hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class q extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$9");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (x8x.q(x8x.this) != null) {
                x8x.q(x8x.this).onViewAppear();
                x8x.q(x8x.this).onStart();
                x8x.v(x8x.this);
            }
        }
    }

    static {
        t2o.a(982515888);
        t2o.a(982515882);
        t2o.a(982515791);
    }

    public x8x(WeexInstanceImpl weexInstanceImpl, WeexInstance weexInstance, int i2, WeexInstanceConfig weexInstanceConfig) {
        this.d = null;
        ArrayList<String> arrayList = new ArrayList<>();
        this.i = arrayList;
        boolean z = false;
        this.g = weexInstanceImpl;
        this.j = weexInstance;
        if (weexInstanceConfig == null || weexInstanceConfig.f() == null) {
            this.p = new WeexUnicornConfig();
        } else {
            this.p = weexInstanceConfig.f();
        }
        M(arrayList, this.p.b(), weexInstanceImpl.getInstanceId() + "");
        arrayList.addAll(weexInstanceImpl.getRenderEngineOptions());
        if (this.p.e()) {
            arrayList.add("--enable-earlier-ready=true");
        }
        this.d = this.p.d();
        try {
            String o2 = w4x.o();
            if (!TextUtils.isEmpty(o2)) {
                String[] split = o2.split(",");
                String bundleUrl = weexInstanceImpl.getBundleUrl();
                if (!TextUtils.isEmpty(bundleUrl)) {
                    for (String str : split) {
                        if (bundleUrl.contains(str)) {
                            break;
                        }
                    }
                }
            }
            z = true;
            if (this.p.c() == WeexUnicornConfig.RenderMode.image && z) {
                this.p.i(WeexUnicornConfig.RenderMode.texture);
            }
        } catch (Exception unused) {
        }
        weexInstanceImpl.addInstanceListener(this);
    }

    public static void M(ArrayList<String> arrayList, HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc64acb3", new Object[]{arrayList, hashMap, str});
            return;
        }
        arrayList.addAll(w4x.v(null));
        arrayList.add("--instance-id=" + str);
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            arrayList.add("--" + entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static /* synthetic */ WeexInstanceImpl l(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceImpl) ipChange.ipc$dispatch("554de3d2", new Object[]{x8xVar});
        }
        return x8xVar.g;
    }

    public static /* synthetic */ void m(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84717641", new Object[]{x8xVar});
        } else {
            x8xVar.f0();
        }
    }

    public static /* synthetic */ void n(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9ea993", new Object[]{x8xVar});
        } else {
            x8xVar.A();
        }
    }

    public static /* synthetic */ w6a o(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6a) ipChange.ipc$dispatch("b8b61456", new Object[]{x8xVar});
        }
        return x8xVar.b;
    }

    public static /* synthetic */ o6a p(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o6a) ipChange.ipc$dispatch("28401a64", new Object[]{x8xVar});
        }
        return x8xVar.c;
    }

    public static /* synthetic */ xid q(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xid) ipChange.ipc$dispatch("16211512", new Object[]{x8xVar});
        }
        return x8xVar.e;
    }

    public static /* synthetic */ dde r(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dde) ipChange.ipc$dispatch("46b4f9af", new Object[]{x8xVar});
        }
        return x8xVar.f31220a;
    }

    public static /* synthetic */ Pair s(x8x x8xVar, v3x v3xVar, String str, Long l2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("2f6ee234", new Object[]{x8xVar, v3xVar, str, l2, str2});
        }
        return x8xVar.c0(v3xVar, str, l2, str2);
    }

    public static /* synthetic */ void t(x8x x8xVar, double d2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405e65ad", new Object[]{x8xVar, new Double(d2), str});
        } else {
            x8xVar.e0(d2, str);
        }
    }

    public static /* synthetic */ ade u(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ade) ipChange.ipc$dispatch("17535c77", new Object[]{x8xVar});
        }
        return x8xVar.k;
    }

    public static /* synthetic */ void v(x8x x8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebda2f39", new Object[]{x8xVar});
        } else {
            x8xVar.Z();
        }
    }

    public final void A() {
        boolean is64Bit;
        xid xidVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4524679b", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            if (!is64Bit && (xidVar = this.e) != null) {
                xidVar.i();
            }
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0160d", new Object[]{this});
            return;
        }
        ArrayList<yio> arrayList = this.n;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<yio> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.n = null;
        }
    }

    public void E() {
        wid widVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace79b2a", new Object[]{this});
            return;
        }
        u8x.a("ensureDelayedRenderComponent");
        if (this.e == null && (widVar = this.f) != null) {
            ((UnicornMuiseJNI.a) widVar).a(this.g);
            this.f = null;
        }
        u8x.b("ensureDelayedRenderComponent");
    }

    @Override // tb.j6x
    public void E1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    public WeexInstance F(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("6bbede70", new Object[]{this, new Integer(i2)});
        }
        return this.l.get(Integer.valueOf(i2));
    }

    public Map<Integer, WeexInstance> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b91b0e57", new Object[]{this});
        }
        return this.l;
    }

    public WeexInstance H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("63863e40", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.j6x
    public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    public Future<JSONObject> I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("8de072a5", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        FutureTask futureTask = new FutureTask(new d(this, jSONObject));
        this.g.getEngineInfoAsync(0, new e(jSONObject, futureTask));
        return futureTask;
    }

    @Override // tb.j6x
    public void I1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        }
    }

    public final Map<String, String> J(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("910544a", new Object[]{this, new Integer(i2)});
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            return xidVar.q(i2);
        }
        return null;
    }

    public rrd K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrd) ipChange.ipc$dispatch("c4868f26", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.j6x
    public void K0(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    public List<String> L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("860027d1", new Object[]{this});
        }
        return this.i;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df958898", new Object[]{this})).booleanValue();
        }
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        x6x.c(this.g.getInstanceId(), "Page", "onActivityPause").f();
        guw.a("", "", "");
        X(new b());
    }

    public void P() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        x6x.c(this.g.getInstanceId(), "Page", "onActivityResume").f();
        WeexValue weexValue = this.g.getInstanceInfo().get("js_version_info");
        String bundleUrl = this.g.getBundleUrl();
        if (weexValue == null) {
            str = "";
        } else {
            str = weexValue.toStringValue();
        }
        guw.a(bundleUrl, str, "true");
        X(new a());
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        x6x.c(this.g.getInstanceId(), "Page", "onActivityStart").f();
        X(new q());
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        x6x.c(this.g.getInstanceId(), "Page", "onActivityStop").f();
        X(new c());
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.onDestroyView();
            this.e.onDetach();
        }
    }

    public void T() {
        xid xidVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fb3978", new Object[]{this});
            return;
        }
        if (!(this.s == null || (xidVar = this.e) == null)) {
            xidVar.onViewAppear();
            this.s = null;
        }
        this.t = true;
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else if (this.e != null) {
            x6x.c(this.g.getInstanceId(), "Page", "onViewAppear").f();
            this.e.onViewAppear();
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else if (this.e != null) {
            x6x.c(this.g.getInstanceId(), "Page", "onViewDisappear").f();
            this.e.onViewDisappear();
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a5df16", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.g.getBundleUrl())) {
            Uri parse = Uri.parse(this.g.getBundleUrl());
            if (parse.isHierarchical() && "true".equals(parse.getQueryParameter("wx_limit_raster_cache"))) {
                g0();
            }
        }
    }

    public final void X(yio yioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c4525d", new Object[]{this, yioVar});
        } else if (this.e != null) {
            yioVar.run();
        } else {
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            this.n.add(yioVar);
        }
    }

    public final void Z() {
        boolean is64Bit;
        xid xidVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73602a72", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            if (!is64Bit && (xidVar = this.e) != null) {
                xidVar.D();
            }
        }
    }

    @Override // tb.q6x
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a1f88d", new Object[]{this});
        } else {
            X(new g());
        }
    }

    public void a0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6a2532", new Object[]{this, new Integer(i2)});
        } else {
            this.l.remove(Integer.valueOf(i2));
        }
    }

    @Override // tb.q6x
    public void b(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdc67cf", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.s = r0;
        int[] iArr = {i2, i3};
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.b(i2, i3);
        }
    }

    @Override // tb.q6x
    public void c(hde hdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb59be58", new Object[]{this, hdeVar});
        } else {
            X(new f(hdeVar));
        }
    }

    @Override // tb.q6x
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5969124b", new Object[]{this});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.d();
        }
    }

    public void d0(v3x v3xVar, HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f5df0f", new Object[]{this, v3xVar, hashMap, str});
        } else {
            b0(hashMap, v3xVar, str);
        }
    }

    @Override // tb.j6x
    public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.q6x
    public void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28bf9f2", new Object[]{this, l5xVar});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.dispatchExternalEvent(l5xVar);
        }
    }

    @Override // tb.q6x
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951fff51", new Object[]{this});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.e();
        }
    }

    public final void e0(double d2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdb8b41", new Object[]{this, new Double(d2), str});
            return;
        }
        Context context = this.g.getContext();
        if (context != null) {
            Intent intent = new Intent();
            intent.setAction("com.taobao.android.abnormal.action.weex.white");
            intent.putExtra("accountFor", d2);
            intent.putExtra("bundleUrl", str);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    @Override // tb.j6x
    public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.q6x
    public xid f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xid) ipChange.ipc$dispatch("b75e8a42", new Object[]{this});
        }
        return this.e;
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3508cbf", new Object[]{this});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null && this.f31220a != null) {
            xidVar.o(new o());
        }
    }

    @Override // tb.q6x
    public HashMap<String, String> g() {
        HashMap<String, String> g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2afa2f2", new Object[]{this});
        }
        xid xidVar = this.e;
        if (!(xidVar == null || (g2 = xidVar.g(this.g.getInstanceId())) == null)) {
            this.o.putAll(g2);
        }
        return this.o;
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a1a54a", new Object[]{this});
        } else if (this.e != null && this.g.getContext() != null) {
            this.e.m("setRasterCacheLimitSize", Float.valueOf(nxh.c(this.g.getContext()) * nxh.e(this.g.getContext()) * nxh.b(this.g.getContext())));
        }
    }

    @Override // tb.q6x
    public View getRenderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16d4539a", new Object[]{this});
        }
        View view = this.h;
        if (view instanceof ViewGroup) {
            return ((ViewGroup) view).getChildAt(0);
        }
        return null;
    }

    @Override // tb.q6x
    public void h(q6x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd329b", new Object[]{this, aVar});
        } else {
            X(new i(aVar));
        }
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac4c770", new Object[]{this});
            return;
        }
        String l2 = w4x.l();
        if (!(TextUtils.isEmpty(l2) || this.g == null || this.e == null)) {
            String[] split = l2.split(",");
            String bundleUrl = this.g.getBundleUrl();
            if (!TextUtils.isEmpty(bundleUrl)) {
                for (String str : split) {
                    if (bundleUrl.contains(str)) {
                        this.e.t(new h());
                        return;
                    }
                }
            }
        }
    }

    public void i0(int i2, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c96e9f", new Object[]{this, new Integer(i2), weexInstance});
        } else {
            this.l.put(Integer.valueOf(i2), weexInstance);
        }
    }

    @Override // tb.q6x
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89084b38", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void j0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162f6fd8", new Object[]{this});
            return;
        }
        String bundleUrl = this.g.getBundleUrl();
        WeexValue weexValue = this.g.getInstanceInfo().get("js_version_info");
        if (weexValue == null) {
            str = "";
        } else {
            str = weexValue.toStringValue();
        }
        guw.a(bundleUrl, str, "true");
    }

    @Override // tb.q6x
    public HashMap<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cd2656fe", new Object[]{this});
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            return xidVar.F(this.g.getInstanceId());
        }
        return null;
    }

    public void k0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94be627d", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.h(f2, f3);
        }
    }

    @Override // tb.j6x
    public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.q6x
    public void offScreenRendering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4db218", new Object[]{this});
        }
    }

    @Override // tb.q6x
    public void onScreenRendering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c11ba8", new Object[]{this});
        }
    }

    @Override // tb.q6x
    public void registerReportInfoListener(ade adeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6768198d", new Object[]{this, adeVar});
        } else {
            this.k = adeVar;
        }
    }

    @Override // tb.q6x
    public void scrollToDecelerate(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c3c958", new Object[]{this, new Integer(i2)});
        } else {
            X(new n(i2));
        }
    }

    @Override // tb.q6x
    public void setGestureConsumptionView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1261d72", new Object[]{this, view});
        } else if (view != null) {
            this.c.d(new WeakReference<>(view));
            if (this.e != null && this.g.getRootView() != null) {
                this.e.w(true, this.c, null);
                ViewProxy.setOnTouchListener(this.g.getRootView(), this.c);
            }
        }
    }

    @Override // tb.q6x
    public void setGestureEventListener(pce pceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c815e890", new Object[]{this, pceVar});
        } else {
            X(new l(pceVar));
        }
    }

    @Override // tb.q6x
    public void setGestureStateListener(w6a w6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41769c1", new Object[]{this, w6aVar});
            return;
        }
        this.b = w6aVar;
        if (this.c == null) {
            this.c = new o6a();
        }
        X(new k());
    }

    @Override // tb.q6x
    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            X(new m(z));
        }
    }

    @Override // tb.q6x
    public void setWeexScrollListener(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c526017", new Object[]{this, ddeVar});
            return;
        }
        this.f31220a = ddeVar;
        X(new j());
    }

    @Override // tb.q6x
    public void updateViewport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe86196", new Object[]{this});
            return;
        }
        xid xidVar = this.e;
        if (xidVar != null) {
            xidVar.updateViewport();
        }
    }

    public void w(wid widVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce877c9", new Object[]{this, widVar});
        } else {
            this.f = widVar;
        }
    }

    public void x(xid xidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99df1dd3", new Object[]{this, xidVar});
            return;
        }
        u8x.a("bindRenderComponent");
        ((ViewGroup) this.g.getRootView()).addView(y(xidVar), -1, -1);
        u8x.b("bindRenderComponent");
    }

    public View y(xid xidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d41fd98", new Object[]{this, xidVar});
        }
        this.e = xidVar;
        xidVar.B(this.g.getContext(), this.g);
        this.e.u();
        if (w4x.f()) {
            Map<String, String> map = f5x.builtinFontMaps;
            if (!map.isEmpty()) {
                this.e.r(new HashMap<>(map));
            }
        }
        int[] iArr = this.s;
        if (iArr != null) {
            this.e.b(iArr[0], iArr[1]);
        }
        this.h = this.e.onCreateView();
        z9x.d(this.g.getInstanceId(), "bindView", this.h);
        B();
        W();
        if (!this.t && this.s != null) {
            this.e.onViewDisappear();
        }
        h0();
        return this.h;
    }

    public void z(Bitmap bitmap, int i2, int i3, int i4, double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b5907e", new Object[]{this, bitmap, new Integer(i2), new Integer(i3), new Integer(i4), new Double(d2), new Double(d3), new Double(d4), new Double(d5)});
        } else if (((ConcurrentHashMap) this.r).get(Integer.valueOf(i2)) != null) {
            ((q6x.b) ((ConcurrentHashMap) this.r).get(Integer.valueOf(i2))).a(bitmap, i3, i4, d2, d3, d4, d5);
            ((ConcurrentHashMap) this.r).remove(Integer.valueOf(i2));
        }
    }

    @Override // tb.j6x
    public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v3x f31226a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        public p(v3x v3xVar, String str, Long l, String str2, String str3, String str4, String str5, String str6) {
            this.f31226a = v3xVar;
            this.b = str;
            this.c = l;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Pair s = x8x.s(x8x.this, this.f31226a, this.b, this.c, this.d);
            Double d = (Double) s.first;
            double doubleValue = d.doubleValue();
            boolean booleanValue = ((Boolean) s.second).booleanValue();
            String t = w4x.t("enable_weex_scene_white_screen");
            if (TextUtils.isEmpty(t) || "true".equals(t)) {
                z = true;
            }
            if (booleanValue && z) {
                x8x.t(x8x.this, doubleValue, this.d);
            }
            if (x8x.u(x8x.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(WMInstanceApm.KEY_PAGE_STAGES_AREA_COVERAGE, this.e);
                hashMap.put("wxInteraction", this.f);
                hashMap.put(WMInstanceApm.KEY_PAGE_STAGES_INTERACTION_OPT, this.g);
                hashMap.put(WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT, this.h);
                hashMap.put(WMInstanceApm.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT, d);
                x8x.u(x8x.this).a(hashMap);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(java.util.HashMap<java.lang.String, java.lang.String> r13, tb.v3x r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.x8x.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "4d4603dc"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r12
            r0 = 1
            r3[r0] = r13
            r13 = 2
            r3[r13] = r14
            r13 = 3
            r3[r13] = r15
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001b:
            tb.xid r1 = r12.e
            if (r1 != 0) goto L_0x0020
            return
        L_0x0020:
            java.lang.String r1 = "area_coverage"
            java.lang.Object r1 = r13.get(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "end_time_stamp"
            java.lang.Object r1 = r13.get(r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "end_time_stamp_opt"
            java.lang.Object r1 = r13.get(r1)
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = "raster_end_time_stamp_opt"
            java.lang.Object r13 = r13.get(r1)
            r11 = r13
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = android.text.TextUtils.isEmpty(r8)
            if (r13 != 0) goto L_0x0055
            java.lang.Long r13 = java.lang.Long.valueOf(r8)     // Catch: NumberFormatException -> 0x0051
        L_0x004f:
            r6 = r13
            goto L_0x0057
        L_0x0051:
            r13 = move-exception
            r13.printStackTrace()
        L_0x0055:
            r13 = 0
            goto L_0x004f
        L_0x0057:
            long r1 = android.os.SystemClock.uptimeMillis()
            double r1 = (double) r1
            tb.xid r13 = r12.e
            java.lang.String r5 = r13.A()
            long r3 = android.os.SystemClock.uptimeMillis()
            double r3 = (double) r3
            double r3 = r3 - r1
            r1 = 4658815484840378368(0x40a7700000000000, double:3000.0)
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x0083
            com.taobao.android.weex.WeexInstanceImpl r13 = r12.g
            int r13 = r13.getInstanceId()
            com.taobao.android.weex.WeexErrorType r1 = com.taobao.android.weex.WeexErrorType.WEEX_FRAMEWORK
            int r1 = r1.errCode
            java.lang.String r2 = "GET_SCREEN_PIXEL_TIMEOUT"
            java.lang.String r3 = "java getScreenshotPixelCheckInfo() over 3s"
            com.taobao.android.weex.bridge.WeexPlatformCommonBridge.reportException(r0, r13, r1, r2, r3)
        L_0x0083:
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r13.<init>(r0)
            tb.x8x$p r0 = new tb.x8x$p
            r2 = r0
            r3 = r12
            r4 = r14
            r7 = r15
            r2.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x8x.b0(java.util.HashMap, tb.v3x, java.lang.String):void");
    }

    @Override // tb.q6x
    public void i(String str, Map<String, Object> map, q6x.b bVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7655ec1", new Object[]{this, str, map, bVar});
            return;
        }
        int incrementAndGet = this.q.incrementAndGet();
        ((ConcurrentHashMap) this.r).put(Integer.valueOf(incrementAndGet), bVar);
        if (map == null || !"true".equals(map.get("isLongScreenShot"))) {
            z = false;
        }
        this.g.getSnapshot(str, incrementAndGet, z);
    }

    public WeexInstance C(Context context, String str, int i2, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("52e3c18a", new Object[]{this, context, str, new Integer(i2), new Float(f2), new Float(f3)});
        }
        int incrementAndGet = MUSDKInstance.INSTANCE_ID_COUNTER.incrementAndGet();
        x6x.c(incrementAndGet, "Page", "CreateInstanceInPlatform").f();
        long uptimeMillis = SystemClock.uptimeMillis();
        u8x.a("WeexCreateEmbed");
        Pair<String, String> c2 = b9x.c(str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", (Object) Float.valueOf(f2));
        jSONObject2.put("height", (Object) Float.valueOf(f3));
        jSONObject.put("render_param", (Object) jSONObject2);
        g6x g6xVar = new g6x(incrementAndGet, uptimeMillis, context, (String) c2.first, (String) c2.second, WeexInstanceInternalMode.DOM, WeexRenderType.UNICORN);
        g6xVar.k = this.g;
        g6xVar.l = i2;
        g6xVar.h = jSONObject;
        WeexDOMInstance createEmbed = WeexDOMInstance.createEmbed(g6xVar);
        this.l.put(Integer.valueOf(i2), createEmbed);
        u8x.b("WeexCreateEmbed");
        return createEmbed;
    }

    public WeexInstance D(Context context, String str, int i2, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("d1a006d2", new Object[]{this, context, str, new Integer(i2), new Float(f2), new Float(f3)});
        }
        int incrementAndGet = MUSDKInstance.INSTANCE_ID_COUNTER.incrementAndGet();
        x6x.c(incrementAndGet, "Page", "CreateInstanceInPlatform").f();
        long uptimeMillis = SystemClock.uptimeMillis();
        u8x.a("WeexCreateEmbedAsync");
        Pair<String, String> c2 = b9x.c(str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", (Object) Float.valueOf(f2));
        jSONObject2.put("height", (Object) Float.valueOf(f3));
        jSONObject.put("render_param", (Object) jSONObject2);
        g6x g6xVar = new g6x(incrementAndGet, uptimeMillis, context, (String) c2.first, (String) c2.second, WeexInstanceInternalMode.DOM, WeexRenderType.UNICORN);
        g6xVar.k = this.g;
        g6xVar.l = i2;
        g6xVar.h = jSONObject;
        g6xVar.m = true;
        WeexDOMInstance createEmbed = WeexDOMInstance.createEmbed(g6xVar);
        this.l.put(Integer.valueOf(i2), createEmbed);
        u8x.b("WeexCreateEmbedAsync");
        return createEmbed;
    }

    public final Pair<Double, Boolean> c0(v3x v3xVar, String str, Long l2, String str2) {
        Throwable th;
        double d2;
        double d3;
        String str3;
        double d4;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f9c46be1", new Object[]{this, v3xVar, str, l2, str2});
        }
        int instanceId = this.g.getInstanceId();
        boolean isEmpty = TextUtils.isEmpty(str);
        double d5 = vu3.b.GEO_NOT_SUPPORT;
        if (!isEmpty) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                double doubleValue = parseObject.getDouble("account_for").doubleValue();
                String string = parseObject.getString("pic_cull_rect");
                JSONArray jSONArray = parseObject.getJSONArray("platform_view_rects");
                double doubleValue2 = parseObject.getDouble("frame_size").doubleValue();
                String str4 = "";
                if (doubleValue2 > vu3.b.GEO_NOT_SUPPORT) {
                    if (jSONArray != null) {
                        d4 = 0.0d;
                        d2 = 0.0d;
                        String str5 = str4;
                        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                            try {
                                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                int intValue = jSONObject.getInteger("view_id").intValue();
                                Map<String, String> J = J(intValue);
                                if (J != null) {
                                    str5 = str5 + intValue + "_" + J.get("message") + ",";
                                    z = Boolean.parseBoolean(J.get("isWhiteScreen"));
                                } else {
                                    z = false;
                                }
                                double doubleValue3 = jSONObject.getDouble("area").doubleValue();
                                d2 += z ? doubleValue3 / doubleValue2 : vu3.b.GEO_NOT_SUPPORT;
                                d4 += doubleValue3;
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = false;
                                d5 = vu3.b.GEO_NOT_SUPPORT;
                                th.printStackTrace();
                                return new Pair<>(Double.valueOf(d5), Boolean.valueOf(z2));
                            }
                        }
                        str4 = str5;
                    } else {
                        d4 = vu3.b.GEO_NOT_SUPPORT;
                        d2 = vu3.b.GEO_NOT_SUPPORT;
                    }
                    d5 = (((doubleValue2 - d4) * doubleValue) / doubleValue2) + (d2 * 100.0d);
                    d3 = vu3.b.GEO_NOT_SUPPORT;
                } else {
                    str4 = str4;
                    d5 = vu3.b.GEO_NOT_SUPPORT;
                    d3 = vu3.b.GEO_NOT_SUPPORT;
                    d2 = vu3.b.GEO_NOT_SUPPORT;
                }
                if (d5 > d3) {
                    try {
                        v3xVar.c().d(WMInstanceApm.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT, Double.valueOf(d5).longValue());
                        x6x.f(instanceId, "Page", "samePixelMaxCount").a("screenshotAccountFor", Double.valueOf(d5)).f();
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = false;
                        th.printStackTrace();
                        return new Pair<>(Double.valueOf(d5), Boolean.valueOf(z2));
                    }
                }
                if (d5 < w4x.n(str2) || this.m) {
                    z2 = false;
                } else {
                    if (l2 != null) {
                        if (l2.longValue() == -1) {
                            str3 = "001";
                        } else {
                            str3 = (l2.longValue() < 0 || l2.longValue() > 10) ? null : "000";
                        }
                        if (str3 != null) {
                            WeexPlatformCommonBridge.reportExceptionInnerInfo(this.g.getInstanceId(), WeexErrorType.AREA_COVERAGE.errCode, "AREA_COVERAGE_" + str3, "area coverage:" + l2);
                        }
                    }
                    double d6 = d2 * 100.0d;
                    if (d6 > d5 - d6) {
                        WeexPlatformCommonBridge.reportExceptionInnerInfo(this.g.getInstanceId(), WeexErrorType.WHITE_SCREEN_PLATFORM_VIEW.errCode, "WHITE_SCREEN_PLATFORM_VIEW_000", str4);
                    }
                    if (parseObject.getBooleanValue("empty_root_layer_paint_bounds")) {
                        WeexPlatformCommonBridge.reportExceptionInnerInfo(this.g.getInstanceId(), WeexErrorType.UNICORN.errCode, "EMPTY_ROOT_LAYER_PAINT_BOUNDS_000", "root layer paint bounds was empty");
                    }
                    if (parseObject.getLongValue("duration") >= 5000.0d) {
                        WeexPlatformCommonBridge.reportException(false, this.g.getInstanceId(), WeexErrorType.WHITE_SCREEN_GE_5S.errCode, "WHITE_DEFAULT", "white screen pixel check\n account for:" + d5 + "  pic cull rect:" + string);
                    }
                    z2 = false;
                    try {
                        WeexPlatformCommonBridge.reportException(false, this.g.getInstanceId(), WeexErrorType.WHITE_SCREEN.errCode, "WHITE_DEFAULT", "white screen pixel check\n account for:" + d5 + "  pic cull rect:" + string);
                        z2 = true;
                    } catch (Throwable th4) {
                        th = th4;
                        th.printStackTrace();
                        return new Pair<>(Double.valueOf(d5), Boolean.valueOf(z2));
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return new Pair<>(Double.valueOf(d5), Boolean.valueOf(z2));
    }
}
