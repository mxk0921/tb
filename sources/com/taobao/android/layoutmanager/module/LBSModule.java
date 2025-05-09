package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import java.util.HashMap;
import java.util.WeakHashMap;
import tb.t2o;
import tb.tfs;
import tb.unr;

/* compiled from: Taobao */
@AnyThread
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LBSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LBSModule";
    private static WeakHashMap<o, TBLocationClient> pluginManagerMap = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class GGLocationOptions extends TBLocationOption {
        private String locationMode = null;
        public boolean useDefaultFunc = false;

        static {
            t2o.a(502268106);
        }

        public String getLocationMode() {
            return this.locationMode;
        }

        public void setLocationMode(String str) {
            this.locationMode = str;
            if ("nocache".equals(str)) {
                setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8205a;

        public a(d.j jVar) {
            this.f8205a = jVar;
        }

        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
            } else if (tBLocationDTO != null) {
                d.j jVar = this.f8205a;
                jVar.c.a(jVar, tBLocationDTO);
            }
        }
    }

    static {
        t2o.a(502268104);
        t2o.a(503316559);
    }

    public static void clean(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557c1de0", new Object[]{oVar});
        } else {
            pluginManagerMap.remove(oVar);
        }
    }

    private static TBLocationDTO locationInCache(d.j jVar, GGLocationOptions gGLocationOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("68ec2d3", new Object[]{jVar, gGLocationOptions});
        }
        if (gGLocationOptions.useDefaultFunc) {
            return TBLocationClient.d();
        }
        return TBLocationClient.e(gGLocationOptions);
    }

    private static void locationInNocache(d.j jVar, TBLocationOption tBLocationOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf01907", new Object[]{jVar, tBLocationOption});
            return;
        }
        if (pluginManagerMap.get(jVar.f11976a) == null) {
            pluginManagerMap.put(jVar.f11976a, TBLocationClient.g(jVar.c()));
        }
        pluginManagerMap.get(jVar.f11976a).h(tBLocationOption, new a(jVar), jVar.f11976a.X().getLooper());
    }

    public static void requestAddressByCoordinate(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332e5ed8", new Object[]{jVar});
        }
    }

    public static void requestLocation(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f71f1a8", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            GGLocationOptions a2 = b.a((JSONObject) json);
            if ("onlycache".equals(a2.locationMode)) {
                jVar.c.a(jVar, locationInCache(jVar, a2));
            } else if ("nocache".equals(a2.locationMode)) {
                locationInNocache(jVar, a2);
            } else {
                TBLocationDTO locationInCache = locationInCache(jVar, a2);
                if (locationInCache != null) {
                    jVar.c.a(jVar, locationInCache);
                } else {
                    locationInNocache(jVar, a2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String LOCATION_MODE_DEFAULT = "default";
        public static final String LOCATION_MODE_NO_CACHE = "nocache";
        public static final String LOCATION_MODE_ONLY_CACHE = "onlycache";

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, TBLocationOption.TimeLimit> f8206a;
        public static final HashMap<Integer, TBLocationOption.Timeout> b;
        public static final HashMap<String, TBLocationOption.Accuracy> c;
        public static final HashMap<String, TBLocationOption.DataModel> d;

        public static TBLocationOption.Accuracy b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("ea6a4c00", new Object[]{str});
            }
            TBLocationOption.Accuracy accuracy = c.get(str);
            if (accuracy == null) {
                return TBLocationOption.Accuracy.DEFAULT;
            }
            return accuracy;
        }

        public static TBLocationOption.DataModel c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.DataModel) ipChange.ipc$dispatch("32f2fbfe", new Object[]{str});
            }
            TBLocationOption.DataModel dataModel = d.get(str);
            if (dataModel == null) {
                return TBLocationOption.DataModel.DEFAULT;
            }
            return dataModel;
        }

        public static TBLocationOption.TimeLimit d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.TimeLimit) ipChange.ipc$dispatch("8ff8ef5e", new Object[]{str});
            }
            TBLocationOption.TimeLimit timeLimit = f8206a.get(str);
            if (timeLimit == null) {
                return TBLocationOption.TimeLimit.DEFAULT;
            }
            return timeLimit;
        }

        public static TBLocationOption.Timeout e(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption.Timeout) ipChange.ipc$dispatch("caa44681", new Object[]{num});
            }
            TBLocationOption.Timeout timeout = b.get(num);
            if (timeout == null) {
                return TBLocationOption.Timeout.DEFAULT;
            }
            return timeout;
        }

        public static GGLocationOptions a(JSONObject jSONObject) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GGLocationOptions) ipChange.ipc$dispatch("dd808440", new Object[]{jSONObject});
            }
            GGLocationOptions gGLocationOptions = new GGLocationOptions();
            try {
                String string = jSONObject.getString("timeLimit");
                if (string == null) {
                    string = "none";
                }
                if ("none".equals(string)) {
                    gGLocationOptions.useDefaultFunc = true;
                }
                gGLocationOptions.setTimeLimit(d(string));
                if (jSONObject.getString(UserLocation.KEY_DOUBLE_ACCURACY) == null) {
                    string = "tenMeters";
                }
                gGLocationOptions.setAccuracy(b(string));
                Integer integer = jSONObject.getInteger("timeOut");
                if (integer != null) {
                    i = integer.intValue();
                }
                gGLocationOptions.setTimeout(e(Integer.valueOf(i)));
                String string2 = jSONObject.getString("resultMode");
                if (string2 == null) {
                    string2 = "Coordinate";
                }
                gGLocationOptions.setDataModel(c(string2));
                String string3 = jSONObject.getString("cachemode");
                if (string3 == null) {
                    string3 = "default";
                }
                gGLocationOptions.setLocationMode(string3);
            } catch (Exception e) {
                tfs.e(LBSModule.TAG, e.getMessage());
            }
            return gGLocationOptions;
        }

        static {
            t2o.a(502268107);
            HashMap<String, TBLocationOption.TimeLimit> hashMap = new HashMap<>();
            f8206a = hashMap;
            HashMap<Integer, TBLocationOption.Timeout> hashMap2 = new HashMap<>();
            b = hashMap2;
            HashMap<String, TBLocationOption.Accuracy> hashMap3 = new HashMap<>();
            c = hashMap3;
            HashMap<String, TBLocationOption.DataModel> hashMap4 = new HashMap<>();
            d = hashMap4;
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
    }
}
