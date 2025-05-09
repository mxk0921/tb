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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DescMtopStaticRequestClient extends MtopRequestClient<DescMtopStaticRequestParams, gf7> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdesc";
    private static final String API_VERSION = "7.0";
    public static final String TAG = "MtopDescLayoutClient";
    public hf7 mEngine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends AsyncTask<MtopResponse, Void, gf7> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f6909a;

        public a(MtopResponse mtopResponse) {
            this.f6909a = mtopResponse;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/request/DescMtopStaticRequestClient$1");
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
                return DescMtopStaticRequestClient.this.mEngine.a(str);
            } catch (Throwable th) {
                tgh.c(DescMtopStaticRequestClient.TAG, "Desc structure building error", th);
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3cc28d9", new Object[]{this, gf7Var});
                return;
            }
            l6j l6jVar = (l6j) DescMtopStaticRequestClient.this.mRequestListenerRef.get();
            if (l6jVar != null) {
                if (gf7Var == null) {
                    l6jVar.a(this.f6909a);
                } else {
                    l6jVar.onSuccess(gf7Var);
                }
            }
        }
    }

    static {
        t2o.a(912262440);
    }

    public DescMtopStaticRequestClient(DescMtopStaticRequestParams descMtopStaticRequestParams, String str, l6j<gf7> l6jVar, hf7 hf7Var) {
        super(descMtopStaticRequestParams, str, l6jVar);
        this.mEngine = hf7Var;
    }

    public static /* synthetic */ Object ipc$super(DescMtopStaticRequestClient descMtopStaticRequestClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/request/DescMtopStaticRequestClient");
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return API_NAME;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "7.0";
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
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new a(mtopResponse).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}
