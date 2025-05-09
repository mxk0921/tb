package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t3j extends e8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28466a = "mtbMainLink_data";

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public a(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONArray parseArray = JSON.parseArray(JSON.toJSONString(this.b));
                ckf.c(parseArray, "list");
                for (Object obj : parseArray) {
                    if (obj != null) {
                        JSONObject jSONObject = (JSONObject) obj;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("originData");
                        Integer valueOf = jSONObject2 != null ? Integer.valueOf(jSONObject2.size()) : null;
                        JSONObject jSONObject3 = jSONObject.getJSONObject("originData");
                        if (jSONObject3 != null) {
                            jSONObject3.clear();
                        }
                        jSONObject.put("originSize", (Object) valueOf);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                }
                String t = t3j.t(t3j.this);
                TLog.loge(t, "adapter setData:" + parseArray.toJSONString());
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public b(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String t = t3j.t(t3j.this);
                TLog.loge(t, "dx下载成功,nameList=" + JSON.toJSONString(this.b));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONArray b;

        public c(JSONArray jSONArray) {
            this.b = jSONArray;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String t = t3j.t(t3j.this);
                TLog.loge(t, "准备下载dx:" + this.b.toJSONString());
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(745537972);
    }

    public static /* synthetic */ Object ipc$super(t3j t3jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/plugin/MtbLogPlugin");
    }

    public static final /* synthetic */ String t(t3j t3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b76f6d4", new Object[]{t3jVar});
        }
        return t3jVar.f28466a;
    }

    @Override // tb.e8m, tb.z9d
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e7c19f", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        TLog.loge("mtbMainLink", "【onBindViewHolder】, identify=".concat(str));
    }

    @Override // tb.e8m, tb.z9d
    public void g(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b6f765", new Object[]{this, jSONArray});
            return;
        }
        ckf.h(jSONArray, "nameList");
        p3j.e(new c(jSONArray));
    }

    @Override // tb.e8m, tb.z9d
    public void j(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df37a422", new Object[]{this, list});
            return;
        }
        ckf.h(list, "originList");
        TLog.loge("mtbMainLink", "adapter setData, listSize=" + list.size());
        p3j.e(new a(list));
    }

    @Override // tb.e8m, tb.z9d
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846f1040", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        TLog.loge("mtbMainLink", "【onCreateViewHolder】, identify=".concat(str));
    }

    @Override // tb.e8m, tb.z9d
    public void q(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f266ab", new Object[]{this, list});
            return;
        }
        ckf.h(list, "nameList");
        p3j.e(new b(list));
    }
}
