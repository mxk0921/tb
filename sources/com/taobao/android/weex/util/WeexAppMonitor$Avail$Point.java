package com.taobao.android.weex.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import tb.hxh;
import tb.w3x;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexAppMonitor$Avail$Point {
    SCRIPT_RESOURCE_DOWNLOAD("weexBridgeDownloadAvail", new String[]{"url", "cacheType", "fullErrMsg", "deviceLevel"}),
    HTTP_DOWNLOAD("weexHttpDownloadAvail", new String[]{"url", "cacheType", "code", "deviceLevel"});
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String[] dims;
    public final String point;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject d;

        public a(JSONObject jSONObject) {
            this.d = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexAppMonitor$Avail$Point$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitSuccess(w3x.MODULE_NAME, WeexAppMonitor$Avail$Point.this.point, this.d.toJSONString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public b(JSONObject jSONObject, String str, String str2) {
            this.d = jSONObject;
            this.e = str;
            this.f = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexAppMonitor$Avail$Point$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitFail(w3x.MODULE_NAME, WeexAppMonitor$Avail$Point.this.point, this.d.toJSONString(), this.e, this.f);
            }
        }
    }

    WeexAppMonitor$Avail$Point(String str, String[] strArr) {
        this.point = str;
        this.dims = strArr;
    }

    public static WeexAppMonitor$Avail$Point fromInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexAppMonitor$Avail$Point) ipChange.ipc$dispatch("d5e83c05", new Object[]{new Integer(i)});
        }
        WeexAppMonitor$Avail$Point[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }

    public static /* synthetic */ Object ipc$super(WeexAppMonitor$Avail$Point weexAppMonitor$Avail$Point, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexAppMonitor$Avail$Point");
    }

    public static WeexAppMonitor$Avail$Point valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexAppMonitor$Avail$Point) ipChange.ipc$dispatch("8efba727", new Object[]{str});
        }
        return (WeexAppMonitor$Avail$Point) Enum.valueOf(WeexAppMonitor$Avail$Point.class, str);
    }

    public void commitFail(WeexValue weexValue, String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5c6f24", new Object[]{this, weexValue, str, str2});
        } else if (this.dims.length == 0 || (weexValue.isArray() && weexValue.getArray().size() == this.dims.length)) {
            JSONObject jSONObject = new JSONObject();
            JSONArray array = weexValue.getArray();
            while (true) {
                String[] strArr = this.dims;
                if (i < strArr.length) {
                    jSONObject.put(strArr[i], array.get(i));
                    i++;
                } else {
                    AppMonitor.Alarm.commitFail(w3x.MODULE_NAME, this.point, jSONObject.toJSONString(), str, str2);
                    return;
                }
            }
        }
    }

    public void commitFailAsync(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a1e536", new Object[]{this, jSONObject, str, str2});
        } else {
            hxh.b(new b(jSONObject, str, str2));
        }
    }

    public void commitSuccess(WeexValue weexValue) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6960fc59", new Object[]{this, weexValue});
        } else if (this.dims.length == 0 || (weexValue.isArray() && weexValue.getArray().size() == this.dims.length)) {
            JSONObject jSONObject = new JSONObject();
            JSONArray array = weexValue.getArray();
            while (true) {
                String[] strArr = this.dims;
                if (i < strArr.length) {
                    jSONObject.put(strArr[i], array.get(i));
                    i++;
                } else {
                    AppMonitor.Alarm.commitSuccess(w3x.MODULE_NAME, this.point, jSONObject.toJSONString());
                    return;
                }
            }
        }
    }

    public void commitSuccessAsync(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa80e39", new Object[]{this, jSONObject});
        } else {
            hxh.b(new a(jSONObject));
        }
    }
}
