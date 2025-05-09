package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.collect.TaobaoCollectionHelper;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tio implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "msoa";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28736a;
        public final /* synthetic */ String b;

        public a(tio tioVar, String str, String str2) {
            this.f28736a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            tgh.b("RunMsoaImplementor", "msoa 调用失败, serviceId: " + this.f28736a + " ;version: " + this.b + "errCode: " + str + " ;errStr: " + str2);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            tgh.b("RunMsoaImplementor", "msoa 调用成功, serviceId: " + this.f28736a + " ;version: " + this.b);
        }
    }

    static {
        t2o.a(354418757);
        t2o.a(912261826);
    }

    public tio(Context context, ze7 ze7Var) {
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("serviceId");
        String string2 = a2.getString("version");
        rrh.e().o(new vrh("msoa.taobao.detail", string, string2, TaobaoCollectionHelper.MSOA_SCENE_NAME, new HashMap(a2)), new a(this, string, string2));
        return true;
    }
}
