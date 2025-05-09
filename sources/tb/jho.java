package tb;

import android.content.DialogInterface;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.vi.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jho {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RpcManager";
    public static jho e;

    /* renamed from: a  reason: collision with root package name */
    public HummerGWFacade f21999a;
    public fho b;
    public boolean c = false;
    public bld d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends AsyncTask<pho, Void, sho> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements DialogInterface.OnCancelListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                }
            }
        }

        static {
            t2o.a(245366870);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2026216808) {
                super.onPreExecute();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zoloz/hummer/rpc/RpcManager$PureRpcTask");
        }

        /* renamed from: a */
        public sho doInBackground(pho... phoVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sho) ipChange.ipc$dispatch("385e2580", new Object[]{this, phoVarArr});
            }
            if (phoVarArr[0].c) {
                vk0.e().h("", false, new a(this), true);
            }
            return jho.a(jho.this, phoVarArr[0]);
        }

        /* renamed from: b */
        public void onPostExecute(sho shoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33547bfe", new Object[]{this, shoVar});
                return;
            }
            vk0.e().d();
            if (jho.b(jho.this) != null) {
                jho.b(jho.this).a(shoVar);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873a6298", new Object[]{this});
            } else {
                super.onPreExecute();
            }
        }
    }

    static {
        t2o.a(245366868);
    }

    public static /* synthetic */ sho a(jho jhoVar, pho phoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sho) ipChange.ipc$dispatch("d150518f", new Object[]{jhoVar, phoVar});
        }
        return jhoVar.f(phoVar);
    }

    public static /* synthetic */ bld b(jho jhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bld) ipChange.ipc$dispatch("1f9b8f64", new Object[]{jhoVar});
        }
        return jhoVar.d;
    }

    public static jho d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jho) ipChange.ipc$dispatch("15f36ab", new Object[0]);
        }
        if (e == null) {
            synchronized (jho.class) {
                try {
                    if (e == null) {
                        e = new jho();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public pho c(f9b f9bVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pho) ipChange.ipc$dispatch("5a9a05a3", new Object[]{this, f9bVar, new Integer(i), new Boolean(z)});
        }
        if (f9bVar == null) {
            return null;
        }
        FactorNextRequest factorNextRequest = new FactorNextRequest();
        factorNextRequest.hummerId = f9bVar.f19115a;
        factorNextRequest.bizId = Long.toString(System.currentTimeMillis());
        factorNextRequest.versionToken = String.valueOf(f9bVar.o("versionToken"));
        factorNextRequest.nextIndex = Integer.valueOf(i);
        HashMap<String, Object> n = f9bVar.n();
        if (n != null) {
            factorNextRequest.params = n;
        }
        factorNextRequest.zStack = f9bVar.k();
        pho phoVar = new pho();
        phoVar.f26105a = factorNextRequest;
        phoVar.b = (String) f9bVar.o("currentTaskName");
        phoVar.c = z;
        return phoVar;
    }

    public void e(HummerGWFacade hummerGWFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af52f42", new Object[]{this, hummerGWFacade});
            return;
        }
        this.f21999a = hummerGWFacade;
        this.b = new fho();
        this.c = true;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (e != null) {
            this.c = false;
            e = null;
            this.d = null;
        }
    }

    public void h(bld bldVar, pho phoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93820f7", new Object[]{this, bldVar, phoVar});
            return;
        }
        this.d = bldVar;
        if (this.c) {
            new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, phoVar);
        } else if (bldVar != null) {
            bldVar.a(null);
        }
    }

    public final sho f(pho phoVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sho) ipChange.ipc$dispatch("57bed82a", new Object[]{this, phoVar});
        }
        sho shoVar = new sho();
        BioLog.i("RpcManager rpcRequest " + phoVar.toString());
        BioLog.i("RpcManager versionToken of request " + phoVar.f26105a.versionToken);
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(vqx.ZIM_IDENTIFY_NEXTINDEX, Integer.toString(phoVar.f26105a.nextIndex.intValue()));
        hashMap.put("currentTaskName", phoVar.b);
        hashMap.put("payload", String.valueOf(JSON.toJSONString(phoVar.f26105a).getBytes().length / 1024));
        jqn.a().c("ztech_next_start", hashMap);
        try {
            fho fhoVar = this.b;
            if (fhoVar != null) {
                shoVar.f28058a = fhoVar.a(phoVar.f26105a, this.f21999a);
            }
        } catch (Throwable th) {
            boolean z = th instanceof IRpcException;
            if (z || (th instanceof RpcException)) {
                shoVar.b = "network_exception";
                th.toString();
                hashMap.clear();
                if (z) {
                    IRpcException iRpcException = th;
                    hashMap.put("rpcResultMsg", iRpcException.getMsg());
                    hashMap.put(upx.RPC_RESULT_CODE, Integer.toString(iRpcException.getCode()));
                } else {
                    RpcException rpcException = (RpcException) th;
                    hashMap.put("rpcResultMsg", rpcException.getMsg());
                    hashMap.put(upx.RPC_RESULT_CODE, Integer.toString(rpcException.getCode()));
                }
                hashMap.put("action", "next");
                jqn.a().c("ztech_rpc_error", hashMap);
                BioLog.e(th);
            } else {
                shoVar.b = "exception";
            }
        }
        boolean isNullorEmpty = StringUtil.isNullorEmpty(shoVar.b);
        List<FactorNextResponseInner> list = shoVar.f28058a.response;
        if (list == null || list.size() <= 0) {
            str = "";
        } else {
            str = shoVar.f28058a.response.get(0).retCode;
        }
        hashMap.clear();
        hashMap.put("success", Boolean.toString(isNullorEmpty));
        hashMap.put("currentTaskName", phoVar.b);
        hashMap.put("bizResultCode", str);
        hashMap.put(upx.UPLOAD_TIME, Long.toString(System.currentTimeMillis() - currentTimeMillis));
        jqn.a().c("ztech_next_end", hashMap);
        BioLog.i("RpcManager rpcResponse = " + shoVar.toString());
        BioLog.i("RpcManager versionToken of response " + shoVar.f28058a.versionToken);
        return shoVar;
    }
}
