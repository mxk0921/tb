package com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.a1u;
import tb.bwq;
import tb.d9m;
import tb.giv;
import tb.gt9;
import tb.jkd;
import tb.ob5;
import tb.qt9;
import tb.stk;
import tb.t2o;
import tb.v2s;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXTaoLiveEndRecommendActionEventHandler extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEENDRECOMMENDACTION = 6354536541928441340L;

    /* renamed from: a  reason: collision with root package name */
    public final TBLiveDataModel f8608a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8609a;
        public final /* synthetic */ DXRuntimeContext b;

        public a(DXTaoLiveEndRecommendActionEventHandler dXTaoLiveEndRecommendActionEventHandler, JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
            this.f8609a = jSONObject;
            this.b = dXRuntimeContext;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            this.f8609a.put(gt9.MTOP_ISFOLLOW, (Object) "true");
            d9m.n().renderDX(this.b.L(), this.f8609a);
            if (!(v2s.o() == null || v2s.o().f() == null)) {
                a1u.a(v2s.o().f().getApplication(), "关注成功");
            }
            HashMap hashMap = new HashMap();
            if (giv.f() != null) {
                giv.f().m(vx9.d(), "attention-clk", hashMap);
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8610a;
        public final /* synthetic */ DXRuntimeContext b;

        public b(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
            this.f8610a = jSONObject;
            this.b = dXRuntimeContext;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            this.f8610a.put("isPreview", (Object) "true");
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                d9m.n().renderDX(this.b.L(), this.f8610a);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                DXTaoLiveEndRecommendActionEventHandler.a(DXTaoLiveEndRecommendActionEventHandler.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8611a;
        public final /* synthetic */ DXRuntimeContext b;

        public c(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
            this.f8611a = jSONObject;
            this.b = dXRuntimeContext;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            this.f8611a.put("isPreview", (Object) "false");
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                d9m.n().renderDX(this.b.L(), this.f8611a);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                DXTaoLiveEndRecommendActionEventHandler.a(DXTaoLiveEndRecommendActionEventHandler.this);
            }
        }
    }

    static {
        t2o.a(295699512);
    }

    public DXTaoLiveEndRecommendActionEventHandler(TBLiveDataModel tBLiveDataModel) {
        this.f8608a = tBLiveDataModel;
    }

    public static /* synthetic */ void a(DXTaoLiveEndRecommendActionEventHandler dXTaoLiveEndRecommendActionEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e768c50e", new Object[]{dXTaoLiveEndRecommendActionEventHandler});
        } else {
            dXTaoLiveEndRecommendActionEventHandler.c();
        }
    }

    public static /* synthetic */ Object ipc$super(DXTaoLiveEndRecommendActionEventHandler dXTaoLiveEndRecommendActionEventHandler, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/liveend/dxhandler/DXTaoLiveEndRecommendActionEventHandler");
    }

    public final qt9 b() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("ea71fb2d", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.f8608a;
        if (tBLiveDataModel == null) {
            return new qt9();
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo == null) {
            return new qt9();
        }
        AccountInfo accountInfo = videoInfo.broadCaster;
        if (accountInfo != null) {
            str = accountInfo.accountId;
            str2 = accountInfo.type;
        } else {
            str = "";
            str2 = str;
        }
        String str3 = videoInfo.liveId;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new qt9();
        }
        qt9 qt9Var = new qt9();
        qt9Var.c = str3;
        qt9Var.b = str2;
        qt9Var.f26917a = str;
        qt9Var.o = qt9.FOLLOW_COMMENT;
        return giv.f().r(qt9Var);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edbc606", new Object[]{this});
        } else {
            a1u.a(v2s.o().f().getApplication(), "预约失败");
        }
    }

    public final void d(final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785615d", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null && dXRuntimeContext.i() != null) {
            final JSONObject jSONObject = (JSONObject) dXRuntimeContext.i().clone();
            final boolean equals = TextUtils.equals("true", jSONObject.getString("isPreview"));
            String string = jSONObject.getString("preLiveId");
            if (giv.c().b()) {
                bwq.b(equals, string, "taoLiveStartNotify", null, "tblive_inline", new IObserverX() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            a1u.a(v2s.o().f().getApplication(), "预约失败");
                        }
                    }

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                    public void onNext(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                            return;
                        }
                        if (equals) {
                            jSONObject.put("isPreview", (Object) "false");
                        } else {
                            jSONObject.put("isPreview", (Object) "true");
                        }
                        if ((obj instanceof SubScribeCenterResultDTO) && "SUCCESS".equals(((SubScribeCenterResultDTO) obj).getRetCode())) {
                            d9m.n().renderDX(dXRuntimeContext.L(), jSONObject);
                        }
                    }
                });
            } else if (!equals) {
                SubscribeUtils.INSTANCE.doSubscribe(string, "taoLiveStartNotify", null, "tblive_inline", new b(jSONObject, dXRuntimeContext));
            } else {
                SubscribeUtils.INSTANCE.cancelSubscribe(string, "taoLiveStartNotify", null, "tblive_inline", new c(jSONObject, dXRuntimeContext));
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r7.equals("previewBtnClick") == false) goto L_0x002d;
     */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r7, java.lang.Object[] r8, com.taobao.android.dinamicx.DXRuntimeContext r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "f9db7b67"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            int r7 = r8.length
            if (r7 <= 0) goto L_0x00bd
            r7 = r8[r2]
            java.lang.String r7 = (java.lang.String) r7
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -801419427: goto L_0x0044;
                case -84925846: goto L_0x0039;
                case 1759834228: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x004e
        L_0x002f:
            java.lang.String r2 = "previewBtnClick"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x004e
            goto L_0x002d
        L_0x0039:
            java.lang.String r0 = "gotoLiveRoom"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0042
            goto L_0x002d
        L_0x0042:
            r0 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "followBtnClick"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004d
            goto L_0x002d
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0056;
                case 2: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x00bd
        L_0x0052:
            r6.d(r9)
            goto L_0x00bd
        L_0x0056:
            int r7 = r8.length
            if (r7 <= r1) goto L_0x00bd
            r7 = r8[r1]
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = "jumpUrl"
            r8.put(r0, r7)
            tb.g5h r0 = tb.giv.f()
            if (r0 == 0) goto L_0x007b
            tb.g5h r0 = tb.giv.f()
            tb.ux9 r1 = tb.vx9.d()
            java.lang.String r2 = "recommend-clk"
            r0.m(r1, r2, r8)
        L_0x007b:
            android.content.Context r8 = r9.h()
            com.taobao.android.nav.Nav r8 = com.taobao.android.nav.Nav.from(r8)
            r8.toUri(r7)
            goto L_0x00bd
        L_0x0087:
            com.alibaba.fastjson.JSONObject r7 = r9.i()
            java.lang.Object r8 = r7.clone()
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8
            java.lang.String r0 = "isFollow"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "false"
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 == 0) goto L_0x00bd
            tb.v2s r7 = tb.v2s.o()
            tb.q7c r7 = r7.k()
            if (r7 == 0) goto L_0x00bd
            tb.v2s r7 = tb.v2s.o()
            tb.q7c r7 = r7.k()
            tb.qt9 r0 = r6.b()
            com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler$a r1 = new com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler$a
            r1.<init>(r6, r8, r9)
            r7.f(r0, r1)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
