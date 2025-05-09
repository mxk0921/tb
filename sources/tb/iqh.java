package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import tb.dv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static iqh b = null;

    /* renamed from: a  reason: collision with root package name */
    public final dv7 f21507a;

    static {
        t2o.a(577765415);
    }

    public iqh() {
        this.f21507a = null;
        this.f21507a = zqh.d().b;
    }

    public static iqh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iqh) ipChange.ipc$dispatch("8f209b76", new Object[0]);
        }
        iqh iqhVar = b;
        if (iqhVar != null) {
            return iqhVar;
        }
        synchronized (iqh.class) {
            try {
                iqh iqhVar2 = b;
                if (iqhVar2 != null) {
                    return iqhVar2;
                }
                iqh iqhVar3 = new iqh();
                b = iqhVar3;
                return iqhVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(MRTResourceDescription mRTResourceDescription, dv7.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7d9d08", new Object[]{this, mRTResourceDescription, aVar});
        } else if (mRTResourceDescription == null) {
            aVar.a(false, new MRTRuntimeException(503, "Resource is null"), null);
        } else if (this.f21507a == null) {
            aVar.a(false, new MRTRuntimeException(501, "No download service provider registered"), null);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            kgh.a("MRTDownloader", "下载:" + mRTResourceDescription.furl);
            this.f21507a.a(mRTResourceDescription.furl, mRTResourceDescription.fmd5, new a(this, mRTResourceDescription, currentTimeMillis, aVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements dv7.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MRTResourceDescription f21508a;
        public final /* synthetic */ long b;
        public final /* synthetic */ dv7.a c;

        public a(iqh iqhVar, MRTResourceDescription mRTResourceDescription, long j, dv7.a aVar) {
            this.f21508a = mRTResourceDescription;
            this.b = j;
            this.c = aVar;
        }

        @Override // tb.dv7.a
        public void a(boolean z, Exception exc, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aff9c19e", new Object[]{this, new Boolean(z), exc, str});
                return;
            }
            StringBuilder sb = new StringBuilder("下载结束:");
            sb.append(this.f21508a.furl);
            sb.append(" ，结果:");
            if (exc == null) {
                str2 = ResultCode.MSG_SUCCESS;
            } else {
                str2 = ResultCode.MSG_FAILED;
            }
            sb.append(str2);
            kgh.a("MRTDownloader", sb.toString());
            long currentTimeMillis = System.currentTimeMillis();
            int i = exc == null ? 0 : 1;
            int i2 = exc == null ? 1 : 0;
            int i3 = 1 - i2;
            long j = currentTimeMillis - this.b;
            MRTResourceDescription mRTResourceDescription = this.f21508a;
            String str3 = mRTResourceDescription.resourceType;
            String str4 = mRTResourceDescription.resourceName;
            String str5 = mRTResourceDescription.furl;
            xqh.e(i, i2, i3, j, str3 == null ? "" : str3, str4 == null ? "" : str4, str5 == null ? "" : str5, "");
            dv7.a aVar = this.c;
            if (aVar != null) {
                aVar.a(z, exc, str);
            }
        }
    }
}
