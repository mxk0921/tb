package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class mwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f24349a;
    public final List<String> b = new CopyOnWriteArrayList();

    static {
        t2o.a(589300076);
    }

    public static mwp b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwp) ipChange.ipc$dispatch("aefa475b", new Object[]{jSONObject});
        }
        mwp mwpVar = new mwp();
        try {
            mwpVar.f24349a = jSONObject.getString("ab");
            JSONArray optJSONArray = jSONObject.optJSONArray("api");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        ((CopyOnWriteArrayList) mwpVar.b).add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return mwpVar;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6708369", new Object[]{this, str})).booleanValue();
        }
        return ((CopyOnWriteArrayList) this.b).contains(str);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b54ffe05", new Object[]{this});
        }
        return this.f24349a;
    }
}
