package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tg0 extends ug0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements i6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sjd f28697a;

        public a(tg0 tg0Var, sjd sjdVar) {
            this.f28697a = sjdVar;
        }

        @Override // tb.i6j
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            vp9.a("linkx", "AfcLinkInfoRequest === onSuccess: " + jSONObject);
            pg0.i().a("link", "request");
            this.f28697a.a(jSONObject);
        }

        @Override // tb.i6j
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            vp9.b("linkx", "AfcLinkInfoRequest === onError: " + str);
            pg0.i().a("link", "request");
            this.f28697a.b(jSONObject);
        }

        @Override // tb.i6j
        public void c(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7369b0e", new Object[]{this, mtopResponse, jSONObject});
            }
        }
    }

    static {
        t2o.a(467664958);
    }

    public static /* synthetic */ Object ipc$super(tg0 tg0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/request/business/AfcLinkInfoRequest");
    }

    public void a(String str, String str2, boolean z, Map<String, String> map, sjd sjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935dfb50", new Object[]{this, str, str2, new Boolean(z), map, sjdVar});
            return;
        }
        pg0.i().A("link", "request");
        i4j.b().d(str, str2, map, false, new a(this, sjdVar), z ? new Handler(zsa.b.f32989a.getLooper()) : null, 5000);
    }
}
