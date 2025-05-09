package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.ServiceImpl;

/* compiled from: Taobao */
@ServiceImpl("com.taobao.umipublish.monitor.UmiPublishMonitorImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface lvc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705543);
        }

        public static /* synthetic */ void a(lvc lvcVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8889eee", new Object[]{lvcVar, str, str2, jSONObject, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    jSONObject = null;
                }
                lvcVar.commitInfo(str, str2, jSONObject);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitInfo");
            }
        }

        public static /* synthetic */ void b(lvc lvcVar, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, int i, Object obj) {
            String str6;
            String str7;
            String str8;
            String str9;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b106046c", new Object[]{lvcVar, str, str2, str3, str4, str5, jSONObject, new Integer(i), obj});
            } else if (obj == null) {
                JSONObject jSONObject2 = null;
                if ((2 & i) != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if ((4 & i) != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if ((8 & i) != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if ((i & 16) != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if ((i & 32) == 0) {
                    jSONObject2 = jSONObject;
                }
                lvcVar.commitWarning(str, str6, str7, str8, str9, jSONObject2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitWarning");
            }
        }
    }

    void commitInfo(String str, String str2, JSONObject jSONObject);

    void commitWarning(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject);
}
