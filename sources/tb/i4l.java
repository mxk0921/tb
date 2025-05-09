package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Props;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.BundleProductInfoFragment;
import com.taobao.android.detail.ttdetail.handler.fragment.ProductInfoFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openProductParams";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_product_params";
    public final FragmentActivity b;
    public final ze7 c;
    public JSONObject d;
    public String e;
    public String g;
    public ArrayList<Pair<String, String>> h;

    /* renamed from: a  reason: collision with root package name */
    public final String f21092a = b5m.H().localizedString(R.string.tt_detail_detail_title_product_info);
    public boolean f = false;

    static {
        t2o.a(912261905);
        t2o.a(912261826);
    }

    public i4l(Context context, ze7 ze7Var) {
        if (context instanceof FragmentActivity) {
            this.b = (FragmentActivity) context;
        }
        this.c = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        this.d = irVar.a();
        this.h = d();
        ArrayList<Pair<String, String>> c = c();
        List<Props.a> b = b();
        if (c != null && !c.isEmpty() && this.f) {
            try {
                String str = this.f21092a;
                if (!TextUtils.isEmpty(this.g)) {
                    str = this.g;
                }
                ProductInfoFragment.M2(this.b, str, c);
            } catch (Exception unused) {
            }
            return true;
        } else if (c != null && !c.isEmpty()) {
            try {
                ProductInfoFragment.M2(this.b, this.f21092a, c);
            } catch (Exception unused2) {
            }
            return true;
        } else if (b == null || b.isEmpty()) {
            return false;
        } else {
            try {
                BundleProductInfoFragment.N2(this.b, this.f21092a, b());
            } catch (Exception unused3) {
            }
            return true;
        }
    }

    public List<Props.a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fde2bf08", new Object[]{this});
        }
        Props props = (Props) this.c.e().f(Props.class);
        if (props != null) {
            return props.getBundleProps();
        }
        return null;
    }

    public ArrayList<Pair<String, String>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("109f65f8", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = this.h;
        if (arrayList != null && arrayList.size() != 0) {
            return this.h;
        }
        Props props = (Props) this.c.e().f(Props.class);
        if (props != null) {
            return props.getPropList();
        }
        return null;
    }

    public final ArrayList<Pair<String, String>> d() {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ac3ef1bd", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.d;
        if (jSONObject == null) {
            this.f = false;
            return arrayList;
        }
        this.f = true;
        try {
            Set<String> keySet2 = jSONObject.keySet();
            if (keySet2 != null) {
                Iterator<String> it = keySet2.iterator();
                if (it.hasNext()) {
                    this.e = it.next();
                }
            }
            Iterator<Object> it2 = this.d.getJSONArray(this.e).iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it2.next();
                if (TextUtils.isEmpty(this.g) && (keySet = jSONObject2.keySet()) != null) {
                    Iterator<String> it3 = keySet.iterator();
                    if (it3.hasNext()) {
                        this.g = it3.next();
                    }
                }
                Iterator<Object> it4 = jSONObject2.values().iterator();
                while (it4.hasNext()) {
                    Iterator<Object> it5 = ((JSONArray) it4.next()).iterator();
                    while (it5.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it5.next();
                        for (String str : jSONObject3.keySet()) {
                            String string = jSONObject3.getString(str);
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                                arrayList.add(new Pair<>(str, string));
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
