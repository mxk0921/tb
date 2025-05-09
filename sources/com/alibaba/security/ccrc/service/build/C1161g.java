package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.g  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1161g implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseRequest f2591a;
    public final /* synthetic */ AbstractC1170j b;
    public final /* synthetic */ AbstractC1173k c;
    public final /* synthetic */ C1164h d;

    public C1161g(C1164h hVar, BaseRequest baseRequest, AbstractC1170j jVar, AbstractC1173k kVar) {
        this.d = hVar;
        this.f2591a = baseRequest;
        this.b = jVar;
        this.c = kVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            C1164h.a(this.d, this.f2591a, mtopResponse, this.b, this.c);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            C1164h.a(this.d, this.f2591a, mtopResponse, this.b, this.c);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            C1164h.a(this.d, this.f2591a, mtopResponse, this.b, this.c);
        }
    }
}
