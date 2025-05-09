package com.taobao.android.diagnose.snapshot;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.b8q;
import tb.idh;
import tb.mk7;
import tb.o6e;
import tb.r6e;
import tb.t2o;
import tb.uk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SnapshotMtopUploader implements o6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7255a;

    static {
        t2o.a(615514227);
        t2o.a(615514221);
    }

    public SnapshotMtopUploader(Context context) {
        this.f7255a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public void b(String str, String str2, r6e r6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90b4441", new Object[]{this, str, str2, r6eVar});
        } else if (!mk7.q()) {
            idh.b("MtopUploader", "Diagnose upload is disable");
        } else {
            c(str, str2, r6eVar);
        }
    }

    public final void c(final String str, String str2, final r6e r6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3a7e60", new Object[]{this, str, str2, r6eVar});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.alibaba.emas.publish.update.resource.get");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", (Object) uk7.i().j().f21986a);
            jSONObject.put("resourceType", (Object) "snapshot");
            jSONObject.put(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, (Object) str);
            jSONObject.put("resourceContent", (Object) str2);
            jSONObject.put("appVersion", (Object) uk7.i().g().c().appVer);
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(Mtop.instance(uk7.i().j().b, this.f7255a), mtopRequest).reqMethod(MethodEnum.POST).retryTime(2).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.diagnose.snapshot.SnapshotMtopUploader.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    r6e r6eVar2 = r6eVar;
                    if (r6eVar2 != null) {
                        ((b8q.a) r6eVar2).c(str, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    r6e r6eVar2 = r6eVar;
                    if (r6eVar2 != null) {
                        ((b8q.a) r6eVar2).d(str);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    r6e r6eVar2 = r6eVar;
                    if (r6eVar2 != null) {
                        ((b8q.a) r6eVar2).c(str, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    }
                }
            }).startRequest();
        } catch (Exception e) {
            idh.c("MtopUploader", "sendRequest", e);
            if (r6eVar != null) {
                ((b8q.a) r6eVar).c(str, TLogTracker.SCENE_EXCEPTION, e.getMessage());
            }
        }
    }
}
