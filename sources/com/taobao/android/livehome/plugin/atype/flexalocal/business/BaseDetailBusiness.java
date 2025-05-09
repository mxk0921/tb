package com.taobao.android.livehome.plugin.atype.flexalocal.business;

import android.os.AsyncTask;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopConvert;
import tb.p0;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BaseDetailBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IRemoteBaseListener f8783a;
    public MtopRequest b;
    public long c;
    public final String d = null;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface IRemoteExtendListener extends IMTOPDataObject {
        void dataParseBegin(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public MtopResponse f8784a;
        public BaseOutDo b;

        static {
            t2o.a(310378513);
        }

        public a(BaseDetailBusiness baseDetailBusiness) {
        }
    }

    static {
        t2o.a(310378511);
    }

    public BaseDetailBusiness(IRemoteBaseListener iRemoteBaseListener) {
        this.f8783a = iRemoteBaseListener;
    }

    public static /* synthetic */ MtopRequest a(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("de5ae5f1", new Object[]{baseDetailBusiness});
        }
        return baseDetailBusiness.b;
    }

    public static /* synthetic */ boolean b(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a90a9", new Object[]{baseDetailBusiness})).booleanValue();
        }
        return baseDetailBusiness.e;
    }

    public static /* synthetic */ boolean c(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70e5a788", new Object[]{baseDetailBusiness})).booleanValue();
        }
        baseDetailBusiness.getClass();
        return false;
    }

    public static /* synthetic */ long d(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d340be57", new Object[]{baseDetailBusiness})).longValue();
        }
        return baseDetailBusiness.c;
    }

    public static /* synthetic */ String e(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abbf0b9e", new Object[]{baseDetailBusiness});
        }
        return baseDetailBusiness.d;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04ebc4b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void g(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f58ffc4", new Object[]{this, new Integer(i), iMTOPDataObject, cls});
        } else {
            h(i, iMTOPDataObject, cls, false);
        }
    }

    public void h(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc7ab90", new Object[]{this, new Integer(i), iMTOPDataObject, cls, new Boolean(z)});
        } else {
            i(i, MtopConvert.inputDoToMtopRequest(iMTOPDataObject), cls, z);
        }
    }

    public void i(int i, MtopRequest mtopRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb3b9f9", new Object[]{this, new Integer(i), mtopRequest, cls, new Boolean(z)});
            return;
        }
        this.b = mtopRequest;
        new b(i, cls, z).execute(new Void[0]);
        this.c = System.currentTimeMillis();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f8785a;
        public final boolean b;
        public final Class<?> c;

        static {
            t2o.a(310378514);
        }

        public b(int i, Class<?> cls, boolean z) {
            this.f8785a = i;
            this.b = z;
            this.c = cls;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/business/BaseDetailBusiness$RequestTask");
        }

        /* renamed from: a */
        public a doInBackground(Void... voidArr) {
            MethodEnum methodEnum;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a2d4769", new Object[]{this, voidArr});
            }
            if (BaseDetailBusiness.a(BaseDetailBusiness.this) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            MtopBuilder bizId = Mtop.instance(Globals.getApplication()).build(BaseDetailBusiness.a(BaseDetailBusiness.this), "").setBizId(59);
            if (BaseDetailBusiness.b(BaseDetailBusiness.this)) {
                methodEnum = MethodEnum.POST;
            } else {
                methodEnum = MethodEnum.GET;
            }
            MtopBuilder headers = bizId.reqMethod(methodEnum).headers(hashMap);
            if (this.b) {
                headers.useWua();
            }
            r0h.a("BaseDetailBusiness", "mtopBegin real:" + System.currentTimeMillis());
            MtopResponse syncRequest = headers.syncRequest();
            a aVar = new a(BaseDetailBusiness.this);
            aVar.f8784a = syncRequest;
            r0h.a("BaseDetailBusiness", "mtopend:" + System.currentTimeMillis());
            if (syncRequest.isApiSuccess()) {
                System.currentTimeMillis();
                aVar.b = MtopConvert.jsonToOutputDO(syncRequest.getBytedata(), this.c);
            }
            return aVar;
        }

        /* renamed from: b */
        public void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27ce2d87", new Object[]{this, aVar});
            } else if (aVar == null) {
                if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                    AppMonitor.Alarm.commitFail("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - BaseDetailBusiness.d(BaseDetailBusiness.this))), "0", "response is null 2");
                }
                BaseDetailBusiness baseDetailBusiness = BaseDetailBusiness.this;
                IRemoteBaseListener iRemoteBaseListener = baseDetailBusiness.f8783a;
                if (iRemoteBaseListener != null) {
                    iRemoteBaseListener.onError(this.f8785a, null, baseDetailBusiness);
                }
            } else {
                BaseDetailBusiness.this.getClass();
                String format = String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - BaseDetailBusiness.d(BaseDetailBusiness.this)));
                MtopResponse mtopResponse = aVar.f8784a;
                if (mtopResponse == null) {
                    if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                        AppMonitor.Alarm.commitFail("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), format, "0", "response is null");
                    }
                    BaseDetailBusiness baseDetailBusiness2 = BaseDetailBusiness.this;
                    IRemoteBaseListener iRemoteBaseListener2 = baseDetailBusiness2.f8783a;
                    if (iRemoteBaseListener2 != null) {
                        iRemoteBaseListener2.onError(this.f8785a, null, baseDetailBusiness2);
                    }
                } else if (mtopResponse.isApiSuccess()) {
                    r0h.d("BaseDetailBusiness", "isApiSuccess-----");
                    BaseOutDo baseOutDo = aVar.b;
                    if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                        AppMonitor.Alarm.commitSuccess("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), format);
                    }
                    if (BaseDetailBusiness.this.f8783a != null) {
                        MtopResponse mtopResponse2 = aVar.f8784a;
                        if (mtopResponse2 != null) {
                            Map<String, List<String>> headerFields = mtopResponse2.getHeaderFields();
                            BaseDetailBusiness.this.getClass();
                            p0.c(headerFields, null);
                        }
                        BaseDetailBusiness baseDetailBusiness3 = BaseDetailBusiness.this;
                        baseDetailBusiness3.f8783a.onSuccess(this.f8785a, aVar.f8784a, baseOutDo, baseDetailBusiness3);
                    }
                } else {
                    if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                        AppMonitor.Alarm.commitFail("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), format, aVar.f8784a.getRetCode(), aVar.f8784a.getRetMsg());
                    }
                    if (aVar.f8784a.isSessionInvalid()) {
                        r0h.d("BaseDetailBusiness", "isApiFail----- session invalid");
                        BaseDetailBusiness baseDetailBusiness4 = BaseDetailBusiness.this;
                        IRemoteBaseListener iRemoteBaseListener3 = baseDetailBusiness4.f8783a;
                        if (iRemoteBaseListener3 != null) {
                            iRemoteBaseListener3.onSystemError(this.f8785a, aVar.f8784a, baseDetailBusiness4);
                        }
                    } else if (aVar.f8784a.isSystemError() || aVar.f8784a.isNetworkError() || aVar.f8784a.isExpiredRequest() || aVar.f8784a.is41XResult() || aVar.f8784a.isApiLockedResult() || aVar.f8784a.isMtopSdkError()) {
                        r0h.d("BaseDetailBusiness", "isApiFail----- system error");
                        BaseDetailBusiness baseDetailBusiness5 = BaseDetailBusiness.this;
                        IRemoteBaseListener iRemoteBaseListener4 = baseDetailBusiness5.f8783a;
                        if (iRemoteBaseListener4 != null) {
                            iRemoteBaseListener4.onSystemError(this.f8785a, aVar.f8784a, baseDetailBusiness5);
                        }
                    } else {
                        r0h.d("BaseDetailBusiness", "isApiFail----- business error");
                        BaseDetailBusiness baseDetailBusiness6 = BaseDetailBusiness.this;
                        IRemoteBaseListener iRemoteBaseListener5 = baseDetailBusiness6.f8783a;
                        if (iRemoteBaseListener5 != null) {
                            iRemoteBaseListener5.onError(this.f8785a, aVar.f8784a, baseDetailBusiness6);
                        }
                    }
                }
            }
        }
    }
}
