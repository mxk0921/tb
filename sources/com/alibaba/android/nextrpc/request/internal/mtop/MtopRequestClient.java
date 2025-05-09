package com.alibaba.android.nextrpc.request.internal.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mwc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopBusiness f2224a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Response implements IRemoteBaseListener, IRemoteCacheListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final mwc callback;

        public Response(mwc mwcVar) {
            this.callback = mwcVar;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
            } else {
                this.callback.onCached(mtopCacheEvent, baseOutDo, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                this.callback.onError(i, mtopResponse, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                this.callback.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                this.callback.onSystemError(i, mtopResponse, obj);
            }
        }
    }

    public MtopRequestClient(MtopBusiness mtopBusiness) {
        this.f2224a = mtopBusiness;
    }

    public void a(mwc mwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2166cd35", new Object[]{this, mwcVar});
            return;
        }
        Response response = new Response(mwcVar);
        MtopBusiness mtopBusiness = this.f2224a;
        if (mtopBusiness != null) {
            mtopBusiness.addListener((MtopListener) response).startRequest();
        }
    }
}
