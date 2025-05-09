package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kcx implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements bkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f22574a;

        public a(kcx kcxVar, vq vqVar) {
            this.f22574a = vqVar;
        }

        @Override // tb.bkb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e344e027", new Object[]{this, str});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("result", str);
            vq vqVar = this.f22574a;
            if (vqVar != null) {
                vqVar.c(new FinishResult(hashMap));
            }
            hgh.d("WidgetServiceAbility execute success result：" + str);
        }
    }

    static {
        t2o.a(437256237);
        t2o.a(144703491);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        try {
            ncx.a(ae7.c().b(), str, JSON.toJSONString(map), new a(this, vqVar));
            return null;
        } catch (Throwable th) {
            hgh.d("WidgetServiceAbility error：" + th.getMessage());
            return new ErrorResult(th.getMessage());
        }
    }
}
