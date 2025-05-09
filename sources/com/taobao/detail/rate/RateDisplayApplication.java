package com.taobao.detail.rate;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateDisplayApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static JSONObject previewDatas;
    public int MAX_IMUMSIZE = 100;
    public static HashMap<String, JSONObject> previewDataMap = new HashMap<>();
    public static boolean isColdStart = true;

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
        } else {
            previewDataMap.clear();
        }
    }

    public static /* synthetic */ Object ipc$super(RateDisplayApplication rateDisplayApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/RateDisplayApplication");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        isColdStart = false;
        o.o0(this);
        if (zhn.s(this)) {
            previewDataMap = new LinkedHashMap<String, JSONObject>() { // from class: com.taobao.detail.rate.RateDisplayApplication.1
                public static volatile transient /* synthetic */ IpChange $ipChange = null;
                private static final long serialVersionUID = 1;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/RateDisplayApplication$1");
                }

                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, JSONObject> entry) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                    }
                    if (size() > RateDisplayApplication.this.MAX_IMUMSIZE) {
                        return true;
                    }
                    return false;
                }
            };
        }
    }
}
