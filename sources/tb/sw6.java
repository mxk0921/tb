package tb;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.kakalib.express.ExpressResult;
import com.taobao.taobao.scancode.gateway.activity.ResultViewController;
import com.taobao.taobao.scancode.huoyan.object.MailTraceWrapper;
import com.taobao.taobao.scancode.huoyan.object.MtopEtaoKakaMailtraceResponse;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sw6 extends tw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AccessMtopProcesser";
    public final jp1 f;
    public ResultViewController g;
    public final q1g<MtopEtaoKakaMailtraceResponse> h = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MailTraceWrapper f28313a;
        public final /* synthetic */ String b;

        public a(MailTraceWrapper mailTraceWrapper, String str) {
            this.f28313a = mailTraceWrapper;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<ExpressResult> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MailTraceWrapper mailTraceWrapper = this.f28313a;
            if (mailTraceWrapper != null) {
                arrayList = mailTraceWrapper.getTraces();
            } else {
                arrayList = null;
            }
            sw6 sw6Var = sw6.this;
            sw6Var.f.g(sw6Var.b, this.b, arrayList, 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends q1g<MtopEtaoKakaMailtraceResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/DecodeResultAccessMtopProcesser$2");
        }

        @Override // tb.y7b
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1df753c", new Object[]{this, th});
            } else {
                sw6.this.c(null, d());
            }
        }

        /* renamed from: f */
        public void a(MtopEtaoKakaMailtraceResponse mtopEtaoKakaMailtraceResponse, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2209b63", new Object[]{this, mtopEtaoKakaMailtraceResponse, str});
            } else if (mtopEtaoKakaMailtraceResponse != null) {
                sw6.this.c(mtopEtaoKakaMailtraceResponse.getData(), d());
            }
        }
    }

    static {
        t2o.a(760217720);
    }

    public sw6(hvm hvmVar, FragmentActivity fragmentActivity, Intent intent, boolean z, nmd nmdVar) {
        super(hvmVar, fragmentActivity, intent, z, nmdVar);
        this.f = new jp1(hvmVar);
    }

    public static /* synthetic */ Object ipc$super(sw6 sw6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/DecodeResultAccessMtopProcesser");
    }

    public void b(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b9e54e", new Object[]{this, maResult});
        } else if (!usj.c(this.b)) {
            this.f.h(this.b);
        } else {
            String text = maResult.getText();
            this.h.e(text);
            o1g.c(this.b, text, this.h);
            this.f.i(this.b);
        }
    }

    public void c(MailTraceWrapper mailTraceWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7d9020", new Object[]{this, mailTraceWrapper, str});
        } else if (this.b != null) {
            this.b.runOnUiThread(new a(mailTraceWrapper, str));
        }
    }
}
