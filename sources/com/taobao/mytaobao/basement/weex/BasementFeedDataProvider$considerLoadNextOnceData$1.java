package com.taobao.mytaobao.basement.weex;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ckf;
import tb.i59;
import tb.lgj;
import tb.sc;
import tb.uj3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementFeedDataProvider$considerLoadNextOnceData$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BasementFeedDataProvider$considerLoadNextOnceData$1 INSTANCE = new BasementFeedDataProvider$considerLoadNextOnceData$1();

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        sc.b("basementPreloadData");
        BasementFeedDataProvider basementFeedDataProvider = BasementFeedDataProvider.INSTANCE;
        MtopRequest b = BasementFeedDataProvider.b(basementFeedDataProvider);
        if (b != null) {
            Application application = Globals.getApplication();
            ckf.c(application, "Globals.getApplication()");
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), b, TaoHelper.getTTID());
            String j = BasementFeedDataProvider.j(basementFeedDataProvider);
            if (j != null) {
                build.setUnitStrategy(j);
            }
            IRemoteBaseListener basementFeedDataProvider$considerLoadNextOnceData$1$mTopListener$1 = new IRemoteBaseListener() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$considerLoadNextOnceData$1$mTopListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bytedata;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse != null && (bytedata = mtopResponse.getBytedata()) != null) {
                        BasementFeedDataProvider basementFeedDataProvider2 = BasementFeedDataProvider.INSTANCE;
                        i59 A = basementFeedDataProvider2.A(new String(bytedata, uj3.UTF_8), i59.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis()));
                        TLog.loge("BasementFeedDP", "page next网络成功");
                        String str = A.f21099a;
                        ckf.c(str, "nextOnceData.feedData");
                        basementFeedDataProvider2.w(str);
                        TLog.loge("BasementFeedDP", "next page 存磁盘");
                        JSONObject parseObject = JSON.parseObject(A.f21099a);
                        if (!parseObject.getJSONObject("data").containsKey("timestamp")) {
                            parseObject.getJSONObject("data").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                        }
                        lgj.e(BasementFeedDataProvider.DB_KEY_FEED_DATA, parseObject.toJSONString());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            };
            try {
                MtopResponse syncRequest = build.syncRequest();
                if (syncRequest != null && syncRequest.isApiSuccess()) {
                    basementFeedDataProvider$considerLoadNextOnceData$1$mTopListener$1.onSuccess(build.getRequestType(), syncRequest, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
