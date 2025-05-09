package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DxShareDetailHelper";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, com.taobao.android.fluid.framework.data.datamodel.a> f23016a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kz3 f23017a = new kz3();

        static {
            t2o.a(468713686);
        }

        public static /* synthetic */ kz3 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kz3) ipChange.ipc$dispatch("fe1f8535", new Object[0]);
            }
            return f23017a;
        }
    }

    static {
        t2o.a(468713685);
    }

    public static kz3 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kz3) ipChange.ipc$dispatch("4a8362ba", new Object[0]);
        }
        return a.a();
    }

    public final void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1abcc0", new Object[]{this, fluidContext, str, str2});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        ir9.b(TAG, "添加一跳Detail的key:" + str);
        if (currentMediaSetData != null && currentMediaSetData.e() != null && TextUtils.equals(currentMediaSetData.e().O(), str2)) {
            f(str, currentMediaSetData);
        }
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e65669c", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("id"))) {
            return true;
        }
        return false;
    }

    public HashMap<String, com.taobao.android.fluid.framework.data.datamodel.a> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5d8fd0ff", new Object[]{this});
        }
        return this.f23016a;
    }

    public String e(FluidContext fluidContext, String str, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94a1f721", new Object[]{this, fluidContext, str, jSONObject});
        }
        if (!b(str) || (parse = Uri.parse(str)) == null) {
            return str;
        }
        String queryParameter = parse.getQueryParameter("id");
        String str2 = "snapshot" + queryParameter;
        String str3 = (str + "&dxShareData=" + str2) + "&showCollectionPopupPanel=" + jSONObject.getString("showCollectionPopupPanel");
        a(fluidContext, str2, queryParameter);
        return str3;
    }

    public void f(String str, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97292127", new Object[]{this, str, aVar});
            return;
        }
        HashMap<String, com.taobao.android.fluid.framework.data.datamodel.a> hashMap = this.f23016a;
        if (hashMap != null) {
            hashMap.put(str, aVar);
        }
    }
}
