package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rgm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sdm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements rgm.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(sdm sdmVar) {
        }

        @Override // tb.rgm.a
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d551eed", new Object[]{this, str, jSONObject});
            }
        }

        @Override // tb.rgm.a
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a38bd5c", new Object[]{this, str, jSONObject});
            }
        }
    }

    static {
        t2o.a(713031774);
    }

    public sdm() {
        rgm.h().q("PageTaoOrder", new a(this));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bb5fc9", new Object[]{this});
        } else {
            b("onNativePopAppear", null, null);
        }
    }

    public final void b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d687002b", new Object[]{this, str, jSONObject, jSONObject2});
        } else {
            rgm.h().p("PageTaoOrder", str, jSONObject, jSONObject2);
        }
    }
}
