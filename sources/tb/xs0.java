package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.phone.inside.api.model.consultroute.ConsultRouteModel;
import com.alipay.android.phone.inside.api.model.scan.CodeTypeEnum;
import com.alipay.android.phone.inside.service.InsideOperationService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import org.json.JSONObject;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xs0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31570a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31571a;
        public final /* synthetic */ b b;

        /* compiled from: Taobao */
        /* renamed from: tb.xs0$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1102a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1102a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                xs0.a(xs0.this, aVar.f31571a, aVar.b);
            }
        }

        public a(String str, b bVar) {
            this.f31571a = str;
            this.b = bVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else {
                Coordinator.execute(new RunnableC1102a());
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(this.f31571a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(String str);
    }

    static {
        t2o.a(760217608);
    }

    public xs0(Context context) {
        this.f31570a = context;
    }

    public static /* synthetic */ void a(xs0 xs0Var, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad207c43", new Object[]{xs0Var, str, bVar});
        } else {
            xs0Var.b(str, bVar);
        }
    }

    public final void b(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f88e70b", new Object[]{this, str, bVar});
            return;
        }
        ConsultRouteModel consultRouteModel = new ConsultRouteModel();
        consultRouteModel.setCode(str);
        consultRouteModel.setTimeout(6);
        if (TextUtils.equals("qrCode", "qrCode")) {
            consultRouteModel.setCodeType(CodeTypeEnum.QRCODE);
        } else {
            consultRouteModel.setCodeType(CodeTypeEnum.BARCODE);
        }
        try {
            String string = new JSONObject(InsideOperationService.getInstance().startAction(this.f31570a, consultRouteModel).getResult()).getJSONObject("supportParams").getString("alipayRouteScheme");
            if (TextUtils.isEmpty(string)) {
                throw new NullPointerException();
            } else if (bVar != null) {
                bVar.a(string);
            }
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.a(str);
            }
        }
    }

    public boolean c(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d37f96a", new Object[]{this, str, bVar})).booleanValue();
        }
        if (!d(str)) {
            return false;
        }
        zk9.b("com.alipay.android.phone.inside.service.InsideOperationService", new a(str, bVar));
        return true;
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb8862a9", new Object[]{this, str})).booleanValue();
        }
        if (!gbl.a() || str == null || (!str.startsWith("https://qr.alipay.com") && !str.startsWith("http://qr.alipay.com") && !str.startsWith("alp://"))) {
            return false;
        }
        return true;
    }
}
