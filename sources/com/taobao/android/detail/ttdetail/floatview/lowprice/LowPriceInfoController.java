package com.taobao.android.detail.ttdetail.floatview.lowprice;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.bmv;
import tb.ckf;
import tb.lp1;
import tb.nmh;
import tb.omh;
import tb.pg1;
import tb.pos;
import tb.t2o;
import tb.tgh;
import tb.uj3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class LowPriceInfoController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6790a = new Handler(Looper.getMainLooper());
    public final omh b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController$LowPriceRequestCallBack;", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "<init>", "(Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController;)V", "", bmv.MSGTYPE_INTERVAL, "Lmtopsdk/mtop/domain/MtopResponse;", "mtopResponse", "Lmtopsdk/mtop/domain/BaseOutDo;", "baseOutDo", "", pg1.ATOM_EXT_any, "Ltb/xhv;", "onSuccess", "(ILmtopsdk/mtop/domain/MtopResponse;Lmtopsdk/mtop/domain/BaseOutDo;Ljava/lang/Object;)V", "p0", p1.d, "p2", "onError", "(ILmtopsdk/mtop/domain/MtopResponse;Ljava/lang/Object;)V", "onSystemError", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class LowPriceRequestCallBack implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse b;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController$LowPriceRequestCallBack$onSuccess$1$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            /* renamed from: com.taobao.android.detail.ttdetail.floatview.lowprice.LowPriceInfoController$LowPriceRequestCallBack$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public static final class RunnableC0364a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f6792a;
                public final /* synthetic */ a b;

                public RunnableC0364a(JSONObject jSONObject, a aVar) {
                    this.f6792a = jSONObject;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LowPriceInfoController.this.b(this.f6792a);
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.b = mtopResponse;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopResponse mtopResponse = this.b;
                if (mtopResponse != null) {
                    byte[] bytedata = mtopResponse.getBytedata();
                    ckf.c(bytedata, "it.bytedata");
                    jSONObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    LowPriceInfoController.a(LowPriceInfoController.this).post(new RunnableC0364a(jSONObject.getJSONObject("data"), this));
                }
            }
        }

        static {
            t2o.a(912261812);
            t2o.a(589299719);
        }

        public LowPriceRequestCallBack() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                str = mtopResponse.getRetMsg();
            } else {
                str = null;
            }
            tgh.b("lowPriceRequestListener", ckf.p(str, " onError"));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                pos.a(new a(mtopResponse));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                str = mtopResponse.getRetMsg();
            } else {
                str = null;
            }
            tgh.b("lowPriceRequestListener", ckf.p(str, " onSystemError"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261811);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261810);
    }

    public LowPriceInfoController(JSONObject jSONObject, String str, String str2, omh omhVar) {
        ckf.h(jSONObject, "data");
        ckf.h(str, "apiName");
        ckf.h(str2, "apiVersion");
        ckf.h(omhVar, "lowPriceInfoLoadListener");
        this.b = omhVar;
        nmh nmhVar = new nmh(new LowPriceRequestParams(jSONObject, str, str2));
        nmhVar.q(new LowPriceRequestCallBack());
        nmhVar.c();
    }

    public static final /* synthetic */ Handler a(LowPriceInfoController lowPriceInfoController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d13c2d29", new Object[]{lowPriceInfoController});
        }
        return lowPriceInfoController.f6790a;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a64d4e", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            ((lp1) this.b).R(jSONObject);
        }
    }
}
