package com.taobao.android.favsdk.remoteplugin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.j39;
import tb.oid;
import tb.pnd;
import tb.pzo;
import tb.qzo;
import tb.szo;
import tb.tzo;
import tb.yxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RemoteBusinessService implements pnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oid f7644a = new yxn();

    public static /* synthetic */ oid c(RemoteBusinessService remoteBusinessService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oid) ipChange.ipc$dispatch("f5ec97b7", new Object[]{remoteBusinessService});
        }
        return remoteBusinessService.f7644a;
    }

    @Override // tb.pnd
    public szo a(final qzo qzoVar, final pzo pzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (szo) ipChange.ipc$dispatch("b7571085", new Object[]{this, qzoVar, pzoVar});
        }
        MtopRequest b = ((yxn) this.f7644a).b(qzoVar);
        TLog.logd("FAVSDK_RemoteBusinessService", " sdkmtoprequest = " + b.toString());
        ApiID asyncRequest = RemoteBusiness.build(b).addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.favsdk.remoteplugin.RemoteBusinessService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    ((j39.b) pzoVar).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    ((j39.b) pzoVar).b(RemoteBusinessService.c(RemoteBusinessService.this).a(mtopResponse, qzoVar.g()));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    ((j39.b) pzoVar).c(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }
        }).asyncRequest();
        szo szoVar = new szo();
        szoVar.b = asyncRequest;
        qzoVar.n(szoVar);
        return szoVar;
    }

    @Override // tb.pnd
    public tzo b(qzo qzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("91b5cfbd", new Object[]{this, qzoVar});
        }
        MtopRequest b = ((yxn) this.f7644a).b(qzoVar);
        TLog.logd("FAVSDK_RemoteBusinessService", " sdkmtoprequest = " + b.toString());
        return ((yxn) this.f7644a).a(RemoteBusiness.build(b).syncRequest(), qzoVar.g());
    }
}
