package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.start.StartHttpResponse;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.i1;
import com.alibaba.security.realidentity.service.sensor.model.SensorInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u1 extends i1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public v1 g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements y3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i1.b f2824a;

        public a(i1.b bVar) {
            this.f2824a = bVar;
        }

        @Override // com.alibaba.security.realidentity.y3
        public void onIlluminanceChangedListener(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35571687", new Object[]{this, new Float(f)});
                return;
            }
            u1.this.g.a(new SensorInfo(f));
            u1.this.g.a();
            u1.a(u1.this);
            u1 u1Var = u1.this;
            u1.a(u1Var, u1Var.g.d(), this.f2824a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements OnHttpCallBack<StartHttpResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i1.b f2825a;

        public b(i1.b bVar) {
            this.f2825a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(HttpRequest httpRequest, StartHttpResponse startHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bf6935d", new Object[]{this, httpRequest, startHttpResponse});
                return;
            }
            u1.this.g.b(startHttpResponse);
            if (this.f2825a == null) {
                return;
            }
            if (startHttpResponse == null || !startHttpResponse.isSuccessful()) {
                this.f2825a.a(u1.this.g, true);
            } else {
                this.f2825a.b(u1.this.g, true);
            }
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onFail(HttpRequest httpRequest, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7806fd23", new Object[]{this, httpRequest, exc});
                return;
            }
            i1.b bVar = this.f2825a;
            if (bVar != null) {
                bVar.a(u1.this.g, exc, "StartBusinessWorker", true);
            }
        }
    }

    public u1(Context context, RPBizConfig rPBizConfig, u4 u4Var) {
        super(context, rPBizConfig, u4Var);
    }

    public static /* synthetic */ Object ipc$super(u1 u1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/u1");
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d72f582", new Object[]{this, h1Var, i1Var, bucketParams});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : g4.b.E;
    }

    @Override // com.alibaba.security.realidentity.i1
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        v1 v1Var = this.g;
        if (v1Var == null) {
            return "";
        }
        return com.alibaba.security.realidentity.b.a(v1Var.d());
    }

    @Override // com.alibaba.security.realidentity.i1
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        v1 v1Var = this.g;
        if (v1Var == null) {
            return "";
        }
        return com.alibaba.security.realidentity.b.a(v1Var.e());
    }

    @Override // com.alibaba.security.realidentity.i1
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return "identity";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        return g4.b.D;
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ca82cc", new Object[]{this, h1Var, i1Var, bucketParams, str});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void b(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29afaae1", new Object[]{this, h1Var, i1Var, bucketParams});
        }
    }

    public static /* synthetic */ void a(u1 u1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36919f6", new Object[]{u1Var});
        } else {
            u1Var.i();
        }
    }

    public static /* synthetic */ void a(u1 u1Var, HttpRequest httpRequest, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e3db19", new Object[]{u1Var, httpRequest, bVar});
        } else {
            u1Var.a(httpRequest, bVar);
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474ec0ed", new Object[]{this, h1Var, bVar});
        } else if (h1Var != null) {
            this.g = h1Var.c;
            new s3(this.f2737a).a(new a(bVar));
        }
    }

    private void a(HttpRequest httpRequest, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26575e8b", new Object[]{this, httpRequest, bVar});
        } else {
            this.c.asyncRequest(httpRequest, new b(bVar));
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public BusinessType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BusinessType) ipChange.ipc$dispatch("a3686234", new Object[]{this}) : BusinessType.START;
    }
}
