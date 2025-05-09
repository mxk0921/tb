package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.EventProcessResult;
import com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hh3 extends egu<Map<String, String>, List<Map<String, String>>, d0q<List<Map<String, String>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CEP.CepTriggerProtocol";
    public final com.tmall.android.dai.trigger.protocol.cep.pattern.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements CepNative.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(List<Map<String, String>> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d265d93d", new Object[]{this, list});
            } else {
                hh3.this.b.a(list);
            }
        }
    }

    static {
        t2o.a(1034944733);
    }

    public hh3(String str, com.tmall.android.dai.trigger.protocol.cep.pattern.a aVar, d0q<List<Map<String, String>>> d0qVar, String str2) {
        super(str, aVar, d0qVar, str2);
        this.c = aVar;
        aVar.d(new a());
    }

    public static /* synthetic */ Object ipc$super(hh3 hh3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/trigger/protocol/cep/CepTriggerProtocol");
    }

    @Override // tb.egu
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0964297", new Object[]{this});
        }
        Sink sink = this.b;
        if (sink instanceof o6n) {
            return ((o6n) sink).b();
        }
        return null;
    }

    /* renamed from: f */
    public List<Map<String, String>> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9d2ba535", new Object[]{this, map});
        }
        return null;
    }

    public EventProcessResult g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventProcessResult) ipChange.ipc$dispatch("2963ab41", new Object[]{this, map});
        }
        this.c.a(map);
        return EventProcessResult.RESULT_CONSUMED;
    }
}
