package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.gf7;
import tb.hf7;
import tb.l6j;
import tb.t2o;
import tb.tgh;
import tb.vc7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DescDynamicClient extends MtopRequestClient<DescDynamicParams, gf7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "DescDynamicClient";
    private gf7 mDescStructure;
    private hf7 mEngine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends AsyncTask<MtopResponse, Void, gf7> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f6908a;

        public a(MtopResponse mtopResponse) {
            this.f6908a = mtopResponse;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/request/DescDynamicClient$1");
        }

        /* renamed from: a */
        public gf7 doInBackground(MtopResponse... mtopResponseArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gf7) ipChange.ipc$dispatch("b3968b5d", new Object[]{this, mtopResponseArr});
            }
            if (mtopResponseArr[0].getBytedata() != null) {
                str = new String(mtopResponseArr[0].getBytedata());
            } else {
                str = null;
            }
            try {
                DescDynamicClient descDynamicClient = DescDynamicClient.this;
                DescDynamicClient.access$002(descDynamicClient, DescDynamicClient.access$100(descDynamicClient).d(str));
            } catch (Throwable th) {
                tgh.c(DescDynamicClient.access$200(DescDynamicClient.this), "Desc structure engine rebuild error: ", th);
            }
            return DescDynamicClient.access$000(DescDynamicClient.this);
        }

        /* renamed from: b */
        public void onPostExecute(gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3cc28d9", new Object[]{this, gf7Var});
                return;
            }
            vc7 vc7Var = (vc7) DescDynamicClient.this.mRequestListenerRef.get();
            if (vc7Var != null) {
                if (gf7Var == null) {
                    vc7Var.c(hashCode(), this.f6908a);
                    return;
                }
                if (DescDynamicClient.access$000(DescDynamicClient.this).b != null && DescDynamicClient.access$000(DescDynamicClient.this).b.containsKey(this.f6908a.getApi())) {
                    DescDynamicClient.access$000(DescDynamicClient.this).b.remove(this.f6908a.getApi());
                }
                vc7Var.b(hashCode(), gf7Var);
            }
        }
    }

    static {
        t2o.a(912262434);
    }

    public DescDynamicClient(DescDynamicParams descDynamicParams, String str, l6j<gf7> l6jVar, hf7 hf7Var) {
        super(descDynamicParams, str, l6jVar);
        this.mEngine = hf7Var;
    }

    public static /* synthetic */ gf7 access$000(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf7) ipChange.ipc$dispatch("50049423", new Object[]{descDynamicClient});
        }
        return descDynamicClient.mDescStructure;
    }

    public static /* synthetic */ gf7 access$002(DescDynamicClient descDynamicClient, gf7 gf7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf7) ipChange.ipc$dispatch("35d8e465", new Object[]{descDynamicClient, gf7Var});
        }
        descDynamicClient.mDescStructure = gf7Var;
        return gf7Var;
    }

    public static /* synthetic */ hf7 access$100(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hf7) ipChange.ipc$dispatch("92b94ee0", new Object[]{descDynamicClient});
        }
        return descDynamicClient.mEngine;
    }

    public static /* synthetic */ String access$200(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bed6102f", new Object[]{descDynamicClient});
        }
        return descDynamicClient.TAG;
    }

    public static /* synthetic */ Object ipc$super(DescDynamicClient descDynamicClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/request/DescDynamicClient");
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return ((DescDynamicParams) this.mParams).apiName;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return ((DescDynamicParams) this.mParams).version;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return "UNIT_TRADE";
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        vc7 vc7Var = (vc7) this.mRequestListenerRef.get();
        if (vc7Var != null) {
            vc7Var.c(hashCode(), mtopResponse);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new a(mtopResponse).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        vc7 vc7Var = (vc7) this.mRequestListenerRef.get();
        if (vc7Var != null) {
            vc7Var.c(hashCode(), mtopResponse);
        }
    }
}
