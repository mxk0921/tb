package com.taobao.android.weex.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.Map;
import tb.amo;
import tb.dwh;
import tb.hxh;
import tb.vu3;
import tb.w3x;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexAppMonitor$Performance$Point {
    CREATE_INSTANCE("weexCreateInstancePerf", new String[]{"url", "instanceType"}, new String[0]),
    INIT_WITH("weexInitWithPerf", new String[]{"type", "url", "instanceType", "engineInfoTag"}, new String[0]),
    SPLASH_SNAPSHOT("weexSplashSnapshotPerf", new String[]{"url", "instanceType", "result", MUSAppMonitor.ERROR_MSG, "compat_error"}, new String[]{"storageTime", "decodeTime"}),
    ADD_TO_VIEW("weexAddToViewPerf", new String[]{"url", "instanceType", "engineInfoTag"}, new String[0]),
    USAGE("weexUsagePerf", new String[]{"url", "components", "methods"}, new String[0]),
    DESTROY("weexDestroyPerf", new String[]{"url", "viewAdded", "instanceType"}, new String[0]),
    SCRIPT_RESOURCE_DOWNLOAD("weexBridgeDownloadPerf", new String[]{"url", "cacheType", "zcacheInfo", "deviceLevel"}, new String[]{"zcacheCheckTime", amo.c.POINT_NAME, "resourceSize"}),
    HTTP_DOWNLOAD("weexHttpDownloadPerf", new String[]{"url", "cacheType", "code", "deviceLevel"}, new String[]{"zcacheCheckTime", amo.c.POINT_NAME, "resourceSize"});
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String[] dims;
    public final String point;
    public final String[] values;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ Map e;

        public a(JSONObject jSONObject, Map map) {
            this.d = jSONObject;
            this.e = map;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexAppMonitor$Performance$Point$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            w3x.a();
            DimensionValueSet create = DimensionValueSet.create();
            for (String str : this.d.keySet()) {
                create.setValue(str, this.d.getString(str));
            }
            MeasureValueSet create2 = MeasureValueSet.create();
            for (String str2 : this.e.keySet()) {
                Double d2 = (Double) this.e.get(str2);
                if (d2 == null) {
                    d = vu3.b.GEO_NOT_SUPPORT;
                } else {
                    d = d2.doubleValue();
                }
                create2.setValue(str2, d);
            }
            AppMonitor.Stat.commit(w3x.MODULE_NAME, WeexAppMonitor$Performance$Point.this.point, create, create2);
        }
    }

    WeexAppMonitor$Performance$Point(String str, String[] strArr, String[] strArr2) {
        this.point = str;
        this.dims = strArr;
        this.values = strArr2;
    }

    public static WeexAppMonitor$Performance$Point fromInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexAppMonitor$Performance$Point) ipChange.ipc$dispatch("73e75e4", new Object[]{new Integer(i)});
        }
        WeexAppMonitor$Performance$Point[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }

    public static /* synthetic */ Object ipc$super(WeexAppMonitor$Performance$Point weexAppMonitor$Performance$Point, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexAppMonitor$Performance$Point");
    }

    public static void register() {
        WeexAppMonitor$Performance$Point[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        for (WeexAppMonitor$Performance$Point weexAppMonitor$Performance$Point : values()) {
            AppMonitor.register(w3x.MODULE_NAME, weexAppMonitor$Performance$Point.point, weexAppMonitor$Performance$Point.values, weexAppMonitor$Performance$Point.dims, false);
        }
    }

    public static WeexAppMonitor$Performance$Point valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexAppMonitor$Performance$Point) ipChange.ipc$dispatch("a7697f86", new Object[]{str});
        }
        return (WeexAppMonitor$Performance$Point) Enum.valueOf(WeexAppMonitor$Performance$Point.class, str);
    }

    public void commitAsync(JSONObject jSONObject, Map<String, Double> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4997e821", new Object[]{this, jSONObject, map});
        } else {
            hxh.b(new a(jSONObject, map));
        }
    }

    public void commit(WeexValue weexValue, WeexValue weexValue2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9e383e", new Object[]{this, weexValue, weexValue2});
            return;
        }
        w3x.a();
        if (this.dims.length != 0 && (!weexValue.isArray() || weexValue.getArray().size() != this.dims.length)) {
            dwh.e("dims not match");
        } else if (this.values.length == 0 || (weexValue2.isArray() && weexValue2.getArray().size() == this.values.length)) {
            DimensionValueSet create = DimensionValueSet.create();
            for (int i2 = 0; i2 < this.dims.length; i2++) {
                create.setValue(this.dims[i2], weexValue.getArray().getString(i2));
            }
            MeasureValueSet create2 = MeasureValueSet.create();
            while (true) {
                String[] strArr = this.values;
                if (i < strArr.length) {
                    create2.setValue(strArr[i], weexValue2.getArray().getDoubleValue(i));
                    i++;
                } else {
                    AppMonitor.Stat.commit(w3x.MODULE_NAME, this.point, create, create2);
                    return;
                }
            }
        } else {
            dwh.e("values not match");
        }
    }
}
