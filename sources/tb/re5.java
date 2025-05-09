package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class re5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DX_EVENT_CDRESSBANNERCHANGE = 8497515281166909202L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f27312a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27313a;
        public String b;
        public String c;
        public int d;

        static {
            t2o.a(918552724);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fef04492", new Object[]{this});
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("837c7a63", new Object[]{this});
            }
            return this.b;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7b819390", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("11126697", new Object[]{this});
            }
            return this.f27313a;
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9940228c", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcdef373", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public final void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32db5a98", new Object[]{this, new Integer(i)});
            }
        }

        public final void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae1387a", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93782827", new Object[]{this, str});
            } else {
                this.f27313a = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        static {
            t2o.a(918552725);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552723);
    }

    public re5(qpu qpuVar) {
        ckf.g(qpuVar, "mTurboEngineContext");
        this.f27312a = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(re5 re5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXCDressBannerChangeEventHandler");
    }

    public final void a(int i, JSONObject jSONObject, Map<String, ? extends Object> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84be656a", new Object[]{this, new Integer(i), jSONObject, map});
            return;
        }
        t5d t5dVar = (t5d) this.f27312a.getService(t5d.class);
        Object G = t5dVar.G("cache_key_banner_exposure");
        a aVar = new a();
        aVar.g(i);
        aVar.i(jSONObject.getString("headTitle"));
        aVar.f(jSONObject.getString("bannerImageUrl"));
        String d = aVar.d();
        if (TextUtils.isEmpty(d)) {
            d = aVar.b();
        }
        if (TextUtils.isEmpty(d)) {
            d = String.valueOf(i);
        }
        aVar.e(d);
        if (G instanceof HashMap) {
            hashMap = (HashMap) G;
        } else {
            hashMap = new HashMap();
            t5dVar.A("cache_key_banner_exposure", hashMap);
        }
        a aVar2 = (a) hashMap.get(aVar.a());
        if (aVar2 == null) {
            hashMap.put(aVar.a(), aVar);
        } else {
            aVar = aVar2;
        }
        tpu.a aVar3 = tpu.Companion;
        aVar3.a("DXCDressBannerChangeEventHandler", "BannerChange:卡片开始检测曝光:bannerIndex:" + i + " token:" + aVar.a() + ":finalCardHolder:" + aVar.c(), null);
        aVar.h(aVar.c() + 1);
        d2e d2eVar = (d2e) this.f27312a.getService(d2e.class);
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(jSONObject);
        hashMap2.put("index", Integer.valueOf(i));
        if (map != null) {
            hashMap2.putAll(map);
        }
        d2eVar.H("Show-homeBanner", hashMap2, Boolean.TRUE, String.valueOf(i), null);
        aVar3.a("DXCDressBannerChangeEventHandler", "BannerChange:卡片完成曝光检测:bannerIndex:" + i + " token:" + aVar.a(), null);
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        tpu.a aVar = tpu.Companion;
        aVar.a("DXCDressBannerChangeEventHandler", "BannerChange:Start:handleEvent", null);
        if (!(dXEvent instanceof DXPageChangeEvent)) {
            aVar.a("DXCDressBannerChangeEventHandler", "BannerChange:Error:未知的事件类型。event:" + dXEvent.getClass().getCanonicalName(), null);
            return;
        }
        Object obj = objArr.length == 0 ? null : objArr[0];
        Object obj2 = objArr.length >= 2 ? objArr[1] : null;
        Object obj3 = objArr.length >= 3 ? objArr[2] : null;
        int i = ((DXPageChangeEvent) dXEvent).pageIndex;
        Integer valueOf = Integer.valueOf(i);
        DXWidgetNode W = dXRuntimeContext.W();
        JSONArray listData = (W == null || !(W instanceof DXSliderLayout)) ? null : ((DXSliderLayout) W).getListData();
        if (i < 0) {
            Integer a2 = oc5.Companion.a(obj);
            valueOf = Integer.valueOf(a2 != null ? a2.intValue() : -1);
            aVar.a("DXCDressBannerChangeEventHandler", "BannerChange:Try:无法获取到当前展示的卡片位置:已从args中读取:bannerIndex:" + valueOf, null);
        }
        if (listData == null) {
            listData = oc5.Companion.b(obj2);
            aVar.a("DXCDressBannerChangeEventHandler", "BannerChange:Try:无法获取Banner数组数据:已从args中读取:moduleJsonArray:" + listData, null);
        }
        Map<String, Object> c = oc5.Companion.c(obj3);
        if (valueOf.intValue() < 0 || listData == null || valueOf.intValue() > listData.size() - 1) {
            StringBuilder sb = new StringBuilder("BannerChange:Error:pageIndex或数据模型长度错误:bannerIndex:");
            sb.append(valueOf);
            sb.append(":bannerResultArr:");
            sb.append(listData);
            sb.append(":size:");
            sb.append(listData != null ? Integer.valueOf(listData.size()) : null);
            aVar.a("DXCDressBannerChangeEventHandler", sb.toString(), null);
            return;
        }
        aVar.a("DXCDressBannerChangeEventHandler", "BannerChange:Arg:bannerIndex:" + valueOf + ":extraArgs" + c, null);
        JSONObject jSONObject = listData.getJSONObject(valueOf.intValue());
        if (jSONObject == null) {
            aVar.a("DXCDressBannerChangeEventHandler", "BannerChange:Error:currentObj为null:bannerIndex:" + valueOf, null);
            return;
        }
        aVar.a("DXCDressBannerChangeEventHandler", "BannerChange 事件成功。bannerIndex:" + valueOf + ":currentObj:" + jSONObject, null);
        a(valueOf.intValue(), jSONObject, c);
    }
}
