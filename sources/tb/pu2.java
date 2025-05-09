package tb;

import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.pu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pu2 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ukb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f26304a;

        public a(pu2 pu2Var, vq vqVar) {
            this.f26304a = vqVar;
        }

        public static /* synthetic */ void c(vq vqVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d8fd943", new Object[]{vqVar, str});
            } else if (vqVar != null) {
                vqVar.b(ErrorResult.a.a(str));
            }
        }

        public void e(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75204f67", new Object[]{this, str});
                return;
            }
            final vq vqVar = this.f26304a;
            MegaUtils.z(new Runnable() { // from class: tb.ou2
                @Override // java.lang.Runnable
                public final void run() {
                    pu2.a.c(vq.this, str);
                }
            }, -1L);
        }

        public void f(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edd0e7d6", new Object[]{this, str});
                return;
            }
            final vq vqVar = this.f26304a;
            MegaUtils.z(new Runnable() { // from class: tb.nu2
                @Override // java.lang.Runnable
                public final void run() {
                    pu2.a.d(vq.this, str);
                }
            }, -1L);
        }

        public static /* synthetic */ void d(vq vqVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af8ae5d9", new Object[]{vqVar, str});
            } else if (vqVar == null) {
            } else {
                if (TextUtils.isEmpty(str)) {
                    vqVar.c(new FinishResult());
                    return;
                }
                HashMap<String, String> hashMap = iu2.f21585a;
                if (hashMap.containsKey(str)) {
                    vqVar.b(new ErrorResult(hashMap.get(str), str));
                    return;
                }
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("value", str);
                vqVar.c(new FinishResult(hashMap2));
            }
        }
    }

    static {
        t2o.a(435159050);
        t2o.a(144703491);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        try {
            ggh.d("CalendarServiceAbility execute api: " + str + ", params: " + map);
            ru2.b(td7.b().a(), str, JSON.parseObject(JSON.toJSONString(map)), new a(this, vqVar));
            return null;
        } catch (Throwable th) {
            ggh.d("CalendarServiceAbility execute." + map + ".error: " + th.getMessage());
            return new ErrorResult(th.getMessage());
        }
    }
}
