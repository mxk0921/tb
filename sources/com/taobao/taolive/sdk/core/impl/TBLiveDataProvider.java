package com.taobao.taolive.sdk.core.impl;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.b0d;
import tb.cwd;
import tb.hlc;
import tb.igq;
import tb.jg7;
import tb.o3s;
import tb.qvs;
import tb.t2o;
import tb.v2s;
import tb.y6j;
import tb.zqq;
import tb.zxg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveDataProvider implements hlc, b0d, IRemoteExtendListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLiveDataProvider";
    private String mErrorCode;
    private String mFeedId;
    private IRemoteExtendListener mIRemoteExtendListener;
    private LiveEmbedType mIsShopEmbedType;
    private zxg mLiveDetailBusiness = null;
    private y6j mMtopResult;
    private c mResponseHeaderListener;
    private hlc.a mVideoInfoListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends AsyncTask<String, Integer, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806356085);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/core/impl/TBLiveDataProvider$CdnRequestTask");
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                Method dump skipped, instructions count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.b.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* renamed from: b */
        public void onPostExecute(String str) {
            VideoInfo videoInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
                return;
            }
            super.onPostExecute(str);
            try {
                videoInfo = (VideoInfo) JSON.parseObject(str, VideoInfo.class);
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    o3s.b(TBLiveDataProvider.TAG, "CDN MTop请求回调完成，结束解析(JsonObject-->VideoInfo):" + currentTimeMillis);
                    if (TBLiveDataProvider.access$100(TBLiveDataProvider.this) != null) {
                        TBLiveDataProvider.access$100(TBLiveDataProvider.this).c = currentTimeMillis;
                    }
                    TBLiveDataProvider.access$200(TBLiveDataProvider.this, String.valueOf(videoInfo.status));
                } catch (Exception unused) {
                    TBLiveDataProvider.access$300(TBLiveDataProvider.this, str);
                    if (TBLiveDataProvider.access$400(TBLiveDataProvider.this) != null) {
                        return;
                    }
                }
            } catch (Exception unused2) {
                videoInfo = null;
            }
            if (TBLiveDataProvider.access$400(TBLiveDataProvider.this) != null && videoInfo != null) {
                videoInfo.dataSource = "cdn";
                videoInfo.setMtopResult(TBLiveDataProvider.access$100(TBLiveDataProvider.this));
                TBLiveDataProvider.access$102(TBLiveDataProvider.this, null);
                TBLiveDataProvider.access$400(TBLiveDataProvider.this).onGetVideoInfoSuccess(videoInfo, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void onGetHeaderFields(Map<String, List<String>> map);
    }

    static {
        t2o.a(806356083);
        t2o.a(806356089);
        t2o.a(806355932);
        t2o.a(806355975);
    }

    public static /* synthetic */ y6j access$100(TBLiveDataProvider tBLiveDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6j) ipChange.ipc$dispatch("51179a0e", new Object[]{tBLiveDataProvider});
        }
        return tBLiveDataProvider.mMtopResult;
    }

    public static /* synthetic */ y6j access$102(TBLiveDataProvider tBLiveDataProvider, y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6j) ipChange.ipc$dispatch("401255ac", new Object[]{tBLiveDataProvider, y6jVar});
        }
        tBLiveDataProvider.mMtopResult = y6jVar;
        return y6jVar;
    }

    public static /* synthetic */ void access$200(TBLiveDataProvider tBLiveDataProvider, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c520f255", new Object[]{tBLiveDataProvider, str});
        } else {
            tBLiveDataProvider.onCdnSuccess(str);
        }
    }

    public static /* synthetic */ void access$300(TBLiveDataProvider tBLiveDataProvider, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2243f4", new Object[]{tBLiveDataProvider, str});
        } else {
            tBLiveDataProvider.onCdnFailed(str);
        }
    }

    public static /* synthetic */ hlc.a access$400(TBLiveDataProvider tBLiveDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hlc.a) ipChange.ipc$dispatch("8bc6e6ee", new Object[]{tBLiveDataProvider});
        }
        return tBLiveDataProvider.mVideoInfoListener;
    }

    private void onCdnFailed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e834fffc", new Object[]{this, str});
            return;
        }
        igq.n().c("liveroomLiveDetailFetchCdn", JSON.toJSONString(igq.n().m()), str, str);
        onRequestFailed(str);
    }

    private void onCdnSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f23726", new Object[]{this, str});
            return;
        }
        igq.n().e("liveroomLiveDetailFetchCdn", JSON.toJSONString(igq.n().m()));
        onRequestSuccess();
    }

    private void onMtopFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3791c57f", new Object[]{this, str, str2});
            return;
        }
        this.mErrorCode = str;
        if (ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            onRequestFailed(str);
            return;
        }
        igq.n().c("liveroomLiveDetailFetchMtop", JSON.toJSONString(igq.n().m()), str, str);
        if (qvs.O0()) {
            startCdnRequest(this.mFeedId);
        } else {
            onRequestFailed(str);
        }
    }

    private void onMtopSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619c843", new Object[]{this});
            return;
        }
        igq.n().e("liveroomLiveDetailFetchMtop", JSON.toJSONString(igq.n().m()));
        onRequestSuccess();
    }

    private void onRequestFailed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee02f2de", new Object[]{this, str});
            return;
        }
        igq.n().c("liveroomLiveDetailFetchAll", JSON.toJSONString(igq.n().m()), str, str);
        hlc.a aVar = this.mVideoInfoListener;
        if (aVar != null) {
            aVar.onGetVideoInfoFail(this.mErrorCode);
        }
    }

    private void onRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1065913a", new Object[]{this});
        } else {
            igq.n().e("liveroomLiveDetailFetchAll", JSON.toJSONString(igq.n().m()));
        }
    }

    private void setMtopResult(y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511629f2", new Object[]{this, y6jVar});
        } else if (y6jVar != null) {
            this.mMtopResult = y6jVar;
            o3s.b(TAG, "MTop请求回调完成，setMtopResult:" + this.mMtopResult.toString());
        }
    }

    private void startCdnRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5122335", new Object[]{this, str});
            return;
        }
        this.mMtopResult = new y6j();
        new b().execute(str);
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
            return;
        }
        IRemoteExtendListener iRemoteExtendListener = this.mIRemoteExtendListener;
        if (iRemoteExtendListener != null) {
            iRemoteExtendListener.dataParseBegin(j);
        }
    }

    @Override // tb.hlc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        zxg zxgVar = this.mLiveDetailBusiness;
        if (zxgVar != null) {
            this.mMtopResult = null;
            zxgVar.destroy();
            this.mLiveDetailBusiness = null;
        }
    }

    @Override // tb.hlc
    public void getVideoInfo(jg7 jg7Var, String str, hlc.a aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f198af0", new Object[]{this, jg7Var, str, aVar});
            return;
        }
        v2s.o().A().b(cwd.LOG_TAG, "getVideoInfo: feedId = " + jg7Var.g() + " userId = " + jg7Var.a() + "rcmd = " + str + " jsonStr = " + jg7Var.b());
        this.mVideoInfoListener = aVar;
        if (zqq.a(jg7Var.g())) {
            str2 = "account_" + jg7Var.a();
        } else {
            str2 = jg7Var.g();
        }
        this.mFeedId = str2;
        this.mErrorCode = "";
        if (qvs.N0()) {
            startCdnRequest(jg7Var.g());
            return;
        }
        if (this.mLiveDetailBusiness == null) {
            zxg zxgVar = new zxg(this);
            this.mLiveDetailBusiness = zxgVar;
            zxgVar.B(this);
        }
        jg7Var.A(this.mIsShopEmbedType);
        this.mLiveDetailBusiness.L(jg7Var, str);
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onSystemError(i, netResponse, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    @Override // tb.b0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(int r7, com.taobao.taolive.sdk.adapter.network.NetResponse r8, com.taobao.taolive.sdk.adapter.network.NetBaseOutDo r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.onSuccess(int, com.taobao.taolive.sdk.adapter.network.NetResponse, com.taobao.taolive.sdk.adapter.network.NetBaseOutDo, java.lang.Object):void");
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        if (netResponse != null) {
            str2 = netResponse.getRetMsg();
            str = netResponse.getRetCode();
        } else {
            str2 = "";
            str = str2;
        }
        cwd A = v2s.o().A();
        A.b(cwd.LOG_TAG, "getVideoInfo: onError:" + str2);
        onMtopFailed(str, str2);
    }

    @Override // tb.hlc
    public void setIRemoteExtendListener(IRemoteExtendListener iRemoteExtendListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636bea08", new Object[]{this, iRemoteExtendListener});
        } else {
            this.mIRemoteExtendListener = iRemoteExtendListener;
        }
    }

    public void setResponseHeaderListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588d3271", new Object[]{this, cVar});
        } else {
            this.mResponseHeaderListener = cVar;
        }
    }

    public void setShopEmbedType(LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e24319", new Object[]{this, liveEmbedType});
        } else {
            this.mIsShopEmbedType = liveEmbedType;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r3.equals(tb.zxg.SHOP_CARD_DETAIL) == false) goto L_0x0041;
     */
    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void responseReceive(tb.y6j r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0016
            java.lang.String r4 = "f400314d"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0016:
            if (r7 == 0) goto L_0x0077
            com.taobao.taolive.sdk.adapter.network.NetResponse r3 = r7.d
            if (r3 != 0) goto L_0x001d
            goto L_0x0077
        L_0x001d:
            java.lang.String r3 = r3.getApi()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0028
            return
        L_0x0028:
            java.lang.String r4 = tb.qvs.C0()
            boolean r4 = android.text.TextUtils.equals(r3, r4)
            if (r4 == 0) goto L_0x0036
            r6.setMtopResult(r7)
            return
        L_0x0036:
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1922374796: goto L_0x0065;
                case -1593480726: goto L_0x005b;
                case -1385158785: goto L_0x004f;
                case -414309054: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r0 = -1
            goto L_0x0070
        L_0x0043:
            java.lang.String r0 = "mtop.mediaplatform.live.livedetail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0041
        L_0x004d:
            r0 = 3
            goto L_0x0070
        L_0x004f:
            java.lang.String r0 = "mtop.tblive.live.detail.query"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0059
            goto L_0x0041
        L_0x0059:
            r0 = 2
            goto L_0x0070
        L_0x005b:
            java.lang.String r1 = "mtop.tblive.live.detail.query.room"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0070
            goto L_0x0041
        L_0x0065:
            java.lang.String r0 = "mtop.mediaplatform.live.recommend.livedetail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0041
        L_0x006f:
            r0 = 0
        L_0x0070:
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0074;
                case 2: goto L_0x0074;
                case 3: goto L_0x0074;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x0077
        L_0x0074:
            r6.setMtopResult(r7)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.responseReceive(tb.y6j):void");
    }
}
