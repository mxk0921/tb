package com.taobao.android.turbo.core.service.lbs;

import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.qpu;
import tb.sic;
import tb.t2o;
import tb.tpu;
import tb.unr;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LBSService implements sic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String LOCATION_MODE_DEFAULT = "default";
    public static final String LOCATION_MODE_NO_CACHE = "nocache";
    public static final String LOCATION_MODE_ONLY_CACHE = "onlycache";
    public static final String TAG = "LBSService";

    /* renamed from: a  reason: collision with root package name */
    public TBLocationClient f9744a;
    public qpu b;
    public final HashMap<String, TBLocationOption.TimeLimit> c;
    public final HashMap<Integer, TBLocationOption.Timeout> d;
    public final HashMap<String, TBLocationOption.Accuracy> e;
    public final HashMap<String, TBLocationOption.DataModel> f;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/android/turbo/core/service/lbs/LBSService$GGLocationOptions;", "Lcom/taobao/location/common/TBLocationOption;", "<init>", "()V", "", "locationMode", "Ltb/xhv;", "updateLocationMode", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getLocationMode", "()Ljava/lang/String;", "setLocationMode", "", "useDefaultFunc", "Z", "getUseDefaultFunc", "()Z", "setUseDefaultFunc", "(Z)V", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class GGLocationOptions extends TBLocationOption {
        private String locationMode;
        private boolean useDefaultFunc;

        static {
            t2o.a(919601286);
        }

        public final String getLocationMode() {
            return this.locationMode;
        }

        public final boolean getUseDefaultFunc() {
            return this.useDefaultFunc;
        }

        public final void setLocationMode(String str) {
            this.locationMode = str;
        }

        public final void setUseDefaultFunc(boolean z) {
            this.useDefaultFunc = z;
        }

        public final void updateLocationMode(String str) {
            ckf.g(str, "locationMode");
            this.locationMode = str;
            if (ckf.b("nocache", str)) {
                setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601285);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f9745a;

        public b(g1a g1aVar) {
            this.f9745a = g1aVar;
        }

        @Override // tb.unr
        public final void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            g1a g1aVar = this.f9745a;
            ckf.f(tBLocationDTO, "location");
            g1aVar.invoke(tBLocationDTO);
        }
    }

    static {
        t2o.a(919601284);
        t2o.a(919601283);
    }

    public LBSService() {
        HashMap<String, TBLocationOption.TimeLimit> hashMap = new HashMap<>();
        this.c = hashMap;
        HashMap<Integer, TBLocationOption.Timeout> hashMap2 = new HashMap<>();
        this.d = hashMap2;
        HashMap<String, TBLocationOption.Accuracy> hashMap3 = new HashMap<>();
        this.e = hashMap3;
        HashMap<String, TBLocationOption.DataModel> hashMap4 = new HashMap<>();
        this.f = hashMap4;
        hashMap.put("1m", TBLocationOption.TimeLimit.ONE_MIN);
        hashMap.put("2m", TBLocationOption.TimeLimit.SEC_MIN);
        hashMap.put("3m", TBLocationOption.TimeLimit.THR_MIN);
        hashMap.put("4m", TBLocationOption.TimeLimit.FOR_MIN);
        hashMap.put("5m", TBLocationOption.TimeLimit.FIR_MIN);
        hashMap.put("30m", TBLocationOption.TimeLimit.HALF_HOUR);
        hashMap.put("1h", TBLocationOption.TimeLimit.ONE_HOUR);
        hashMap.put("2h", TBLocationOption.TimeLimit.TWO_HOUR);
        hashMap.put("12h", TBLocationOption.TimeLimit.HALF_DAY);
        hashMap.put("1d", TBLocationOption.TimeLimit.ONE_DAY);
        hashMap2.put(0, TBLocationOption.Timeout.DEFAULT);
        hashMap2.put(500, TBLocationOption.Timeout.HALF_SECOND);
        hashMap2.put(1000, TBLocationOption.Timeout.ONE_SECOND);
        hashMap2.put(2000, TBLocationOption.Timeout.TWO_SECONDS);
        hashMap2.put(3000, TBLocationOption.Timeout.THREE_SECONDS);
        hashMap2.put(5000, TBLocationOption.Timeout.FIVE_SECONDS);
        hashMap2.put(10000, TBLocationOption.Timeout.TEN_SECONDS);
        hashMap3.put("tenMeters", TBLocationOption.Accuracy.TENMETER);
        hashMap3.put("hundredMeters", TBLocationOption.Accuracy.HEKTOMETER);
        hashMap3.put("kilometer", TBLocationOption.Accuracy.KILOMETER);
        hashMap4.put("Coordinate", TBLocationOption.DataModel.DEFAULT);
        hashMap4.put(WXAddressModule2.PLUGIN_NAME, TBLocationOption.DataModel.NEED_ADDRESS);
        hashMap4.put("poi", TBLocationOption.DataModel.NEED_ADDRESS_POI);
    }

    public final void B(g1a<? super TBLocationDTO, xhv> g1aVar, TBLocationOption tBLocationOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792e1e78", new Object[]{this, g1aVar, tBLocationOption});
            return;
        }
        if (this.f9744a == null) {
            qpu qpuVar = this.b;
            if (qpuVar != null) {
                this.f9744a = TBLocationClient.g(qpuVar.getContext());
            } else {
                ckf.y("context");
                throw null;
            }
        }
        TBLocationClient tBLocationClient = this.f9744a;
        ckf.d(tBLocationClient);
        tBLocationClient.h(tBLocationOption, new b(g1aVar), Looper.getMainLooper());
    }

    public final TBLocationOption.Accuracy L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("ea6a4c00", new Object[]{this, str});
        }
        TBLocationOption.Accuracy accuracy = this.e.get(str);
        if (accuracy != null) {
            return accuracy;
        }
        return TBLocationOption.Accuracy.DEFAULT;
    }

    public final TBLocationOption.DataModel M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.DataModel) ipChange.ipc$dispatch("32f2fbfe", new Object[]{this, str});
        }
        TBLocationOption.DataModel dataModel = this.f.get(str);
        if (dataModel != null) {
            return dataModel;
        }
        return TBLocationOption.DataModel.DEFAULT;
    }

    @Override // tb.sic
    public void N0(JSONObject jSONObject, g1a<? super TBLocationDTO, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f317342b", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        ckf.g(jSONObject, "args");
        ckf.g(g1aVar, "callback");
        GGLocationOptions r = r(jSONObject);
        if (ckf.b("onlycache", r.getLocationMode())) {
            g1aVar.invoke(x(r));
        } else if (ckf.b("nocache", r.getLocationMode())) {
            B(g1aVar, r);
        } else {
            TBLocationDTO x = x(r);
            if (x != null) {
                g1aVar.invoke(x);
            } else {
                B(g1aVar, r);
            }
        }
    }

    public final TBLocationOption.TimeLimit c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.TimeLimit) ipChange.ipc$dispatch("8ff8ef5e", new Object[]{this, str});
        }
        TBLocationOption.TimeLimit timeLimit = this.c.get(str);
        if (timeLimit != null) {
            return timeLimit;
        }
        return TBLocationOption.TimeLimit.DEFAULT;
    }

    public final TBLocationOption.Timeout m0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Timeout) ipChange.ipc$dispatch("107b9dcd", new Object[]{this, new Integer(i)});
        }
        TBLocationOption.Timeout timeout = this.d.get(Integer.valueOf(i));
        if (timeout != null) {
            return timeout;
        }
        return TBLocationOption.Timeout.DEFAULT;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.b = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    public final TBLocationDTO x(GGLocationOptions gGLocationOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("ba53f85d", new Object[]{this, gGLocationOptions});
        }
        if (gGLocationOptions.getUseDefaultFunc()) {
            return TBLocationClient.d();
        }
        return TBLocationClient.e(gGLocationOptions);
    }

    public final GGLocationOptions r(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GGLocationOptions) ipChange.ipc$dispatch("a334a677", new Object[]{this, jSONObject});
        }
        GGLocationOptions gGLocationOptions = new GGLocationOptions();
        try {
            String string = jSONObject.getString("timeLimit");
            if (string == null) {
                string = "none";
            }
            if (ckf.b("none", string)) {
                gGLocationOptions.setUseDefaultFunc(true);
            }
            gGLocationOptions.setTimeLimit(c0(string));
            if (jSONObject.getString(UserLocation.KEY_DOUBLE_ACCURACY) == null) {
                string = "tenMeters";
            }
            gGLocationOptions.setAccuracy(L(string));
            Integer integer = jSONObject.getInteger("timeOut");
            if (integer != null) {
                i = integer.intValue();
            }
            gGLocationOptions.setTimeout(m0(i));
            String string2 = jSONObject.getString("resultMode");
            if (string2 == null) {
                string2 = "Coordinate";
            }
            gGLocationOptions.setDataModel(M(string2));
            String string3 = jSONObject.getString("cachemode");
            if (string3 == null) {
                string3 = "default";
            }
            gGLocationOptions.updateLocationMode(string3);
        } catch (Exception e) {
            tpu.a.b(tpu.Companion, TAG, e.getMessage(), null, 4, null);
        }
        return gGLocationOptions;
    }
}
