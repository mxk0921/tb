package com.alibaba.android.ultron.vfw.weex2;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.obv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2DataPrefetchRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopBusiness f2355a;
    public final c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            UltronWeex2DataPrefetchRequest.this.a();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2357a;
        public String b;
        public Map<String, String> c;
        public String d = "get";
        public boolean e = false;
        public String f = "UNIT_TRADE";
        public c g;

        static {
            t2o.a(157286781);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5d3f7de", new Object[]{bVar});
            }
            return bVar.f2357a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("edf435f", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("27119ff5", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c0f5da61", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c7255a82", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("730c7163", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ c g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("736001f1", new Object[]{bVar});
            }
            return bVar.g;
        }

        public UltronWeex2DataPrefetchRequest h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronWeex2DataPrefetchRequest) ipChange.ipc$dispatch("46166075", new Object[]{this});
            }
            if (i()) {
                return new UltronWeex2DataPrefetchRequest(this);
            }
            UnifyLog.e("UltronWeex2DataPrefetchRequest.Builder", "build:args is invalid");
            return null;
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.f2357a) || TextUtils.isEmpty(this.b)) {
                return false;
            }
            return true;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("db26335d", new Object[]{this, str});
            }
            this.f2357a = str;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e69a2e7a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b l(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("889ca1ee", new Object[]{this, cVar});
            }
            this.g = cVar;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("db9e4e3d", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b n(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("80641f9f", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f6fbf373", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9ef54038", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a(String str, String str2);

        void onSuccess(JSONObject jSONObject);
    }

    static {
        t2o.a(157286778);
    }

    public UltronWeex2DataPrefetchRequest(b bVar) {
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(b.a(bVar));
        mtopRequest.setVersion(b.b(bVar));
        if (b.c(bVar) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(b.c(bVar));
            mtopRequest.setData(jSONObject.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        this.f2355a = build;
        if (TextUtils.equals("post", b.d(bVar))) {
            build.reqMethod(MethodEnum.POST);
        } else {
            build.reqMethod(MethodEnum.GET);
        }
        if (b.e(bVar)) {
            build.useWua();
        }
        if (!TextUtils.isEmpty(b.f(bVar))) {
            build.setUnitStrategy(b.f(bVar));
        }
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchRequest.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse == null) {
                    c cVar = UltronWeex2DataPrefetchRequest.this.b;
                    if (cVar != null) {
                        cVar.a("responseError", "mtopResponse is null");
                    }
                    obv.k(false, mtopResponse, "onError: mtopResponse is null");
                } else {
                    String str = "unknown";
                    String retCode = TextUtils.isEmpty(mtopResponse.getRetCode()) ? str : mtopResponse.getRetCode();
                    if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                        str = mtopResponse.getRetMsg();
                    }
                    c cVar2 = UltronWeex2DataPrefetchRequest.this.b;
                    if (cVar2 != null) {
                        cVar2.a(retCode, str);
                    }
                    obv.k(false, mtopResponse, "onError: errCode - " + retCode + ", errorMsg - " + str);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse == null) {
                    c cVar = UltronWeex2DataPrefetchRequest.this.b;
                    if (cVar != null) {
                        cVar.a("responseError", "mtopResponse is null");
                    }
                    obv.k(false, mtopResponse, "onSystemError: mtopResponse is null");
                } else {
                    String str = "unknown";
                    String retCode = TextUtils.isEmpty(mtopResponse.getRetCode()) ? str : mtopResponse.getRetCode();
                    if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                        str = mtopResponse.getRetMsg();
                    }
                    c cVar2 = UltronWeex2DataPrefetchRequest.this.b;
                    if (cVar2 != null) {
                        cVar2.a(retCode, str);
                    }
                    obv.k(false, mtopResponse, "onSystemError: errCode - " + retCode + ", errorMsg - " + str);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    c cVar = UltronWeex2DataPrefetchRequest.this.b;
                    if (cVar != null) {
                        cVar.a("responseError", "mtopResponse is null");
                    }
                    obv.k(false, mtopResponse, "onSuccess: mtopResponse is null");
                } else {
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        if (bytedata == null) {
                            c cVar2 = UltronWeex2DataPrefetchRequest.this.b;
                            if (cVar2 != null) {
                                cVar2.a("responseError", "byteData is null");
                            }
                            obv.k(false, mtopResponse, "onSuccess: byteData is null");
                            return;
                        }
                        JSONObject parseObject = JSON.parseObject(new String(bytedata));
                        c cVar3 = UltronWeex2DataPrefetchRequest.this.b;
                        if (cVar3 != null) {
                            cVar3.onSuccess(parseObject);
                        }
                        obv.k(true, mtopResponse, "onSuccess!");
                    } catch (Exception e) {
                        c cVar4 = UltronWeex2DataPrefetchRequest.this.b;
                        if (cVar4 != null) {
                            cVar4.a("responseError", e.toString());
                        }
                        String obj2 = e.toString();
                        obv.k(false, mtopResponse, "onSuccess: " + obj2);
                    }
                }
            }
        });
        this.b = b.g(bVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
        } else {
            this.f2355a.startRequest();
        }
    }

    public void b() {
        MessageQueue messageQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8c120a", new Object[]{this});
            return;
        }
        try {
            messageQueue = Looper.myQueue();
        } catch (Exception e) {
            UnifyLog.e("UltronWeex2DataPrefetchRequest.requestIdle", e.toString());
            messageQueue = null;
        }
        if (messageQueue == null) {
            UnifyLog.e("UltronWeex2DataPrefetchRequest.requestIdle", "messageQueue is null");
        } else {
            messageQueue.addIdleHandler(new a());
        }
    }
}
