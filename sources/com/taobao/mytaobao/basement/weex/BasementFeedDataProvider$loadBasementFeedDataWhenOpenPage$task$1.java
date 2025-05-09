package com.taobao.mytaobao.basement.weex;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.a;
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
import tb.p3j;
import tb.sc;
import tb.uj3;
import tb.uv6;
import tb.z6t;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1 INSTANCE = new BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1();

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        BasementFeedDataProvider basementFeedDataProvider = BasementFeedDataProvider.INSTANCE;
        if (BasementFeedDataProvider.f(basementFeedDataProvider) == 1 || BasementFeedDataProvider.g(basementFeedDataProvider) || a.g()) {
            TLog.loge("BasementFeedDP", "page load 加载中，return");
            return;
        }
        BasementFeedDataProvider.o(basementFeedDataProvider, true);
        BasementFeedDataProvider.n(basementFeedDataProvider, 1);
        z6t.S().b("PreloadInterface");
        uv6.k("准备进入mtop异步");
        p3j.g(new Runnable() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                final boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                uv6.k("进入mtop异步");
                sc.b("basementPreloadData");
                BasementFeedDataProvider basementFeedDataProvider2 = BasementFeedDataProvider.INSTANCE;
                if (BasementFeedDataProvider.h(basementFeedDataProvider2) == null && ckf.b(BasementFeedDataProvider.i(basementFeedDataProvider2), "delay")) {
                    String c = lgj.c(BasementFeedDataProvider.DB_KEY_FEED_DATA);
                    if (c != null) {
                        BasementFeedDataProvider.p(basementFeedDataProvider2, basementFeedDataProvider2.A(c, i59.SOURCE_FROM_DISK, null));
                    }
                    StringBuilder sb = new StringBuilder("page 读磁盘,内容=");
                    sb.append(BasementFeedDataProvider.h(basementFeedDataProvider2) != null);
                    sb.append(" time=");
                    i59 h = BasementFeedDataProvider.h(basementFeedDataProvider2);
                    sb.append(h != null ? Long.valueOf(h.c) : null);
                    TLog.loge("BasementFeedDP", sb.toString());
                }
                if (!BasementFeedDataProvider.c(basementFeedDataProvider2)) {
                    MtopRequest b = BasementFeedDataProvider.b(basementFeedDataProvider2);
                    if (b == null) {
                        BasementFeedDataProvider.n(basementFeedDataProvider2, 0);
                        return;
                    }
                    if (BasementFeedDataProvider.h(basementFeedDataProvider2) != null && ckf.b(BasementFeedDataProvider.i(basementFeedDataProvider2), "delay")) {
                        z = true;
                    }
                    Application application = Globals.getApplication();
                    ckf.c(application, "Globals.getApplication()");
                    MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), b, TaoHelper.getTTID());
                    String j = BasementFeedDataProvider.j(basementFeedDataProvider2);
                    if (j != null) {
                        build.setUnitStrategy(j);
                    }
                    IRemoteBaseListener basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1$1$run$mTopListener$1 = new IRemoteBaseListener() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1$1$run$mTopListener$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            byte[] bArr;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            z6t.S().e("PreloadInterface", z6t.Q());
                            String str = null;
                            if (mtopResponse != null) {
                                bArr = mtopResponse.getBytedata();
                            } else {
                                bArr = null;
                            }
                            if (bArr != null) {
                                BasementFeedDataProvider basementFeedDataProvider3 = BasementFeedDataProvider.INSTANCE;
                                BasementFeedDataProvider.p(basementFeedDataProvider3, basementFeedDataProvider3.A(new String(bArr, uj3.UTF_8), i59.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                            }
                            BasementFeedDataProvider basementFeedDataProvider4 = BasementFeedDataProvider.INSTANCE;
                            BasementFeedDataProvider.n(basementFeedDataProvider4, 2);
                            i59 h2 = BasementFeedDataProvider.h(basementFeedDataProvider4);
                            if (h2 != null) {
                                str = h2.f21099a;
                            }
                            BasementFeedDataProvider.e(basementFeedDataProvider4, str);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            byte[] bArr;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            z6t.S().e("PreloadInterface", z6t.Q());
                            String str = null;
                            if (mtopResponse != null) {
                                bArr = mtopResponse.getBytedata();
                            } else {
                                bArr = null;
                            }
                            if (bArr != null) {
                                BasementFeedDataProvider basementFeedDataProvider3 = BasementFeedDataProvider.INSTANCE;
                                BasementFeedDataProvider.p(basementFeedDataProvider3, basementFeedDataProvider3.A(new String(bArr, uj3.UTF_8), i59.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                            }
                            BasementFeedDataProvider basementFeedDataProvider4 = BasementFeedDataProvider.INSTANCE;
                            BasementFeedDataProvider.n(basementFeedDataProvider4, 2);
                            i59 h2 = BasementFeedDataProvider.h(basementFeedDataProvider4);
                            if (h2 != null) {
                                str = h2.f21099a;
                            }
                            BasementFeedDataProvider.e(basementFeedDataProvider4, str);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            uv6.k("进入mtop success");
                            z6t.S().e("PreloadInterface", null);
                            byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                            if (bytedata != null) {
                                BasementFeedDataProvider basementFeedDataProvider3 = BasementFeedDataProvider.INSTANCE;
                                BasementFeedDataProvider.p(basementFeedDataProvider3, basementFeedDataProvider3.A(new String(bytedata, uj3.UTF_8), i59.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                            }
                            BasementFeedDataProvider basementFeedDataProvider4 = BasementFeedDataProvider.INSTANCE;
                            BasementFeedDataProvider.n(basementFeedDataProvider4, 2);
                            TLog.loge("BasementFeedDP", "page 网络成功,isPreFetchForNextTime=" + z);
                            i59 h2 = BasementFeedDataProvider.h(basementFeedDataProvider4);
                            boolean e = BasementFeedDataProvider.e(basementFeedDataProvider4, h2 != null ? h2.f21099a : null);
                            sc.c("basementPreloadData");
                            if (e) {
                                BasementFeedDataProvider.a(basementFeedDataProvider4);
                            } else if (z) {
                                i59 h3 = BasementFeedDataProvider.h(basementFeedDataProvider4);
                                if (h3 != null) {
                                    String str = h3.f21099a;
                                    ckf.c(str, "mFeedDataModel!!.feedData");
                                    basementFeedDataProvider4.w(str);
                                    TLog.loge("BasementFeedDP", "page 存磁盘");
                                    i59 h4 = BasementFeedDataProvider.h(basementFeedDataProvider4);
                                    if (h4 != null) {
                                        JSONObject parseObject = JSON.parseObject(h4.f21099a);
                                        if (!parseObject.getJSONObject("data").containsKey("timestamp")) {
                                            parseObject.getJSONObject("data").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                                        }
                                        lgj.e(BasementFeedDataProvider.DB_KEY_FEED_DATA, parseObject.toJSONString());
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                } else {
                                    ckf.s();
                                    throw null;
                                }
                            }
                            if (!z && e) {
                                BasementFeedDataProvider.d(basementFeedDataProvider4);
                            }
                        }
                    };
                    try {
                        MtopResponse syncRequest = build.syncRequest();
                        if (syncRequest == null || !syncRequest.isApiSuccess()) {
                            basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1$1$run$mTopListener$1.onError(build.getRequestType(), syncRequest, null);
                        } else {
                            basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1$1$run$mTopListener$1.onSuccess(build.getRequestType(), syncRequest, null, null);
                        }
                    } catch (Throwable unused) {
                        BasementFeedDataProvider.n(BasementFeedDataProvider.INSTANCE, 2);
                        ckf.c(build, "business");
                        basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1$1$run$mTopListener$1.onError(build.getRequestType(), null, null);
                    }
                }
            }
        });
    }
}
