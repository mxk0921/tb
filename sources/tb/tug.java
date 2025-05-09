package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28968a;
    public final Map<String, String> b = new HashMap();
    public final Map<String, String> c = new HashMap();
    public final List<a> d = new LinkedList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<String>> f28969a = new HashMap();

        static {
            t2o.a(774897957);
        }

        public a(String str) {
            JSONObject parseObject = JSON.parseObject(str);
            for (String str2 : parseObject.keySet()) {
                LinkedList linkedList = new LinkedList();
                JSONArray jSONArray = parseObject.getJSONArray(str2);
                for (int i = 0; i < jSONArray.size(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        linkedList.add(string);
                    }
                }
                if (linkedList.size() > 0) {
                    this.f28969a.put(str2, linkedList);
                }
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("372d169e", new Object[]{this})).booleanValue();
            }
            int size = ((HashMap) this.f28969a).size();
            int i = 0;
            for (Map.Entry entry : ((HashMap) this.f28969a).entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if ((tug.a(tug.this).containsKey(str) && list.contains((String) tug.a(tug.this).get(str))) || (tug.b(tug.this).containsKey(str) && list.contains((String) tug.b(tug.this).get(str)))) {
                    i++;
                }
            }
            if (size <= 0 || size != i) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(774897956);
    }

    public static /* synthetic */ Map a(tug tugVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("805aafae", new Object[]{tugVar});
        }
        return tugVar.b;
    }

    public static /* synthetic */ Map b(tug tugVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("865e7b0d", new Object[]{tugVar});
        }
        return tugVar.c;
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7312bd4", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((HashMap) this.c).put(str, str2);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25d02a5", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((HashMap) this.b).put(str, str2);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4c5be71", new Object[]{this})).booleanValue();
        }
        List<a> list = this.d;
        if (!(list == null || ((LinkedList) list).size() == 0)) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                if (((a) ((LinkedList) this.d).get(i)).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce07574e", new Object[]{this});
        } else {
            ((HashMap) this.c).clear();
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd4589", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !str.equals(this.f28968a)) {
            ((LinkedList) this.d).clear();
            this.f28968a = str;
            try {
                JSONArray parseArray = JSON.parseArray(str);
                for (int i = 0; i < parseArray.size(); i++) {
                    String string = parseArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        ((LinkedList) this.d).add(new a(string));
                    }
                }
            } catch (Throwable th) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "initCompareRule exception " + th.toString());
            }
        }
    }
}
