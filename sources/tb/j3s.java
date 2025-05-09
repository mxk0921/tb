package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j3s implements k0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pt7 f21745a;

        public a(j3s j3sVar, pt7 pt7Var) {
            this.f21745a = pt7Var;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            pt7 pt7Var = this.f21745a;
            if (pt7Var != null) {
                pt7Var.onDownloadError(str, i, str2);
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            pt7 pt7Var = this.f21745a;
            if (pt7Var != null) {
                pt7Var.onDownloadFinish(str, str2);
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            pt7 pt7Var = this.f21745a;
            if (pt7Var != null) {
                pt7Var.onDownloadProgress(i);
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            pt7 pt7Var = this.f21745a;
            if (pt7Var != null) {
                pt7Var.onDownloadStateChange(str, z);
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            pt7 pt7Var = this.f21745a;
            if (pt7Var != null) {
                pt7Var.onFinish(z);
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    static {
        t2o.a(779092368);
        t2o.a(806355929);
    }

    @Override // tb.k0c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7d4d22", new Object[]{this, new Integer(i)});
        } else {
            rv7.e().a(i);
        }
    }

    @Override // tb.k0c
    public int b(Map map, pt7 pt7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94ce858", new Object[]{this, map, pt7Var})).intValue();
        }
        zu7 zu7Var = new zu7();
        if (map.get("downloadParam") instanceof Map) {
            HashMap hashMap = (HashMap) map.get("downloadParam");
            upl uplVar = new upl();
            uplVar.f29547a = (String) hashMap.get("bizId");
            if (hashMap.containsKey("useCache")) {
                uplVar.k = Boolean.valueOf(String.valueOf(hashMap.get("useCache"))).booleanValue();
            }
            zu7Var.b = uplVar;
        }
        if (map.get("downloadList") instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = ((JSONArray) map.get("downloadList")).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    onf onfVar = new onf();
                    onfVar.f25507a = ((JSONObject) next).getString("url");
                    arrayList.add(onfVar);
                }
            }
            zu7Var.f33016a = arrayList;
        }
        return rv7.e().b(zu7Var, new a(this, pt7Var));
    }
}
