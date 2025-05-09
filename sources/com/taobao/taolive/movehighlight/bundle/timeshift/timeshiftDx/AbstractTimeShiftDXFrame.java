package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.arq;
import tb.d47;
import tb.dxa;
import tb.gut;
import tb.huk;
import tb.iz1;
import tb.jfa;
import tb.m0e;
import tb.o0e;
import tb.s0u;
import tb.t2o;
import tb.t90;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class AbstractTimeShiftDXFrame extends BaseFrame implements huk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements m0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a f13051a;
        public final /* synthetic */ o0e b;
        public final /* synthetic */ gut c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0743a implements gut.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LiveTimemovingModel f13052a;

            public C0743a(LiveTimemovingModel liveTimemovingModel) {
                this.f13052a = liveTimemovingModel;
            }

            @Override // tb.gut.b
            public void a(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData) {
                LiveCommonIssueInteractResponseData.BenefitVO benefitVO;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e496a35f", new Object[]{this, liveCommonIssueInteractResponseData});
                } else if (AbstractTimeShiftDXFrame.this.mContext != null && (benefitVO = liveCommonIssueInteractResponseData.benefitVO) != null && !TextUtils.isEmpty(benefitVO.toastTips)) {
                    s0u.a(AbstractTimeShiftDXFrame.this.mContext, liveCommonIssueInteractResponseData.benefitVO.toastTips);
                    LiveTimemovingModel liveTimemovingModel = this.f13052a;
                    AbstractTimeShiftDXFrame abstractTimeShiftDXFrame = AbstractTimeShiftDXFrame.this;
                    t90.a(liveTimemovingModel, abstractTimeShiftDXFrame.mContext, abstractTimeShiftDXFrame.mFrameContext);
                }
            }

            @Override // tb.gut.b
            public void onError() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                    return;
                }
                Context context = AbstractTimeShiftDXFrame.this.mContext;
                if (context != null) {
                    s0u.a(context, "领取失败：活动太火爆了，领取失败");
                    LiveTimemovingModel liveTimemovingModel = this.f13052a;
                    AbstractTimeShiftDXFrame abstractTimeShiftDXFrame = AbstractTimeShiftDXFrame.this;
                    t90.a(liveTimemovingModel, abstractTimeShiftDXFrame.mContext, abstractTimeShiftDXFrame.mFrameContext);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b extends d47 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LiveTimemovingModel f13053a;
            public final /* synthetic */ DXRuntimeContext b;

            public b(LiveTimemovingModel liveTimemovingModel, DXRuntimeContext dXRuntimeContext) {
                this.f13053a = liveTimemovingModel;
                this.b = dXRuntimeContext;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/AbstractTimeShiftDXFrame$1$2");
            }

            @Override // tb.d47, tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                Context context = AbstractTimeShiftDXFrame.this.mContext;
                if (context != null) {
                    s0u.a(context, "取消预约失败，再试一次");
                }
            }

            @Override // tb.d47, tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
                    try {
                        if (netResponse.getDataJsonObject().getBoolean("result")) {
                            Context context = AbstractTimeShiftDXFrame.this.mContext;
                            if (context != null) {
                                s0u.a(context, "已取消预约");
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("subscribeStatus", "0");
                            o0e o0eVar = a.this.b;
                            if (o0eVar != null) {
                                o0eVar.c(this.f13053a.itemId, hashMap, this.b);
                                return;
                            }
                            return;
                        }
                        Context context2 = AbstractTimeShiftDXFrame.this.mContext;
                        if (context2 != null) {
                            s0u.a(context2, "取消预约失败，再试一次");
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class c extends d47 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LiveTimemovingModel f13054a;
            public final /* synthetic */ DXRuntimeContext b;

            public c(LiveTimemovingModel liveTimemovingModel, DXRuntimeContext dXRuntimeContext) {
                this.f13054a = liveTimemovingModel;
                this.b = dXRuntimeContext;
            }

            public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/AbstractTimeShiftDXFrame$1$3");
            }

            @Override // tb.d47, tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                Context context = AbstractTimeShiftDXFrame.this.mContext;
                if (context != null) {
                    s0u.a(context, "活动太火爆了，再试一次");
                }
            }

            @Override // tb.d47, tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
                    try {
                        if (netResponse.getDataJsonObject().getBoolean("result")) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("subscribeStatus", "1");
                            o0e o0eVar = a.this.b;
                            if (o0eVar != null) {
                                o0eVar.c(this.f13054a.itemId, hashMap, this.b);
                            }
                            Context context = AbstractTimeShiftDXFrame.this.mContext;
                            if (context != null) {
                                s0u.a(context, "预约成功，将在主播开卖时提醒你");
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    Context context2 = AbstractTimeShiftDXFrame.this.mContext;
                    if (context2 != null) {
                        s0u.a(context2, "活动太火爆了，再试一次");
                    }
                }
            }
        }

        public a(com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar, o0e o0eVar, gut gutVar) {
            this.f13051a = aVar;
            this.b = o0eVar;
            this.c = gutVar;
        }

        @Override // tb.m0e
        public void a(LiveTimemovingModel liveTimemovingModel, DXRuntimeContext dXRuntimeContext) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fdc2248", new Object[]{this, liveTimemovingModel, dXRuntimeContext});
            } else if (liveTimemovingModel != null && (jSONObject = liveTimemovingModel.personalityData) != null) {
                String string = jSONObject.getString("subscribeStatus");
                String str = liveTimemovingModel.extendVal.liveId;
                String str2 = liveTimemovingModel.itemId;
                if (TextUtils.isEmpty(string)) {
                    string = "0";
                }
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                if ("1".equals(string)) {
                    new jfa(new b(liveTimemovingModel, dXRuntimeContext)).K(arq.e(str), arq.e(str2), false, "preHeat");
                } else if ("0".equals(string)) {
                    new jfa(new c(liveTimemovingModel, dXRuntimeContext)).K(arq.e(str), arq.e(str2), true, "preHeat");
                }
            }
        }

        @Override // tb.m0e
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("442ccd57", new Object[]{this, new Boolean(z)});
            } else {
                AbstractTimeShiftDXFrame.this.abstractRefreshBottomByMute(z);
            }
        }

        @Override // tb.m0e
        public o0e c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o0e) ipChange.ipc$dispatch("473f8490", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.m0e
        public com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a) ipChange.ipc$dispatch("7afa8d75", new Object[]{this});
            }
            return this.f13051a;
        }

        @Override // tb.m0e
        public void e(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c5f5c29", new Object[]{this, jSONObject});
            }
        }

        @Override // tb.m0e
        public com.taobao.taolive.movehighlight.bundle.timeshiftContent.b f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.taolive.movehighlight.bundle.timeshiftContent.b) ipChange.ipc$dispatch("9d97d57b", new Object[]{this});
            }
            return null;
        }

        @Override // tb.m0e
        public void g(LiveTimemovingModel liveTimemovingModel) {
            gut gutVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f577d9f5", new Object[]{this, liveTimemovingModel});
                return;
            }
            LiveTimemovingModel.RightInfo rightInfo = liveTimemovingModel.rightInfo;
            if (rightInfo == null || !"1".equals(rightInfo.status) || (gutVar = this.c) == null) {
                AbstractTimeShiftDXFrame abstractTimeShiftDXFrame = AbstractTimeShiftDXFrame.this;
                t90.a(liveTimemovingModel, abstractTimeShiftDXFrame.mContext, abstractTimeShiftDXFrame.mFrameContext);
                return;
            }
            gutVar.a(liveTimemovingModel, new C0743a(liveTimemovingModel));
        }

        @Override // tb.m0e
        public void h(Map<String, String> map, boolean z, iz1 iz1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34520e15", new Object[]{this, map, new Boolean(z), iz1Var});
            } else {
                AbstractTimeShiftDXFrame.this.showTimeShiftLayerCallBack(map, z, iz1Var);
            }
        }
    }

    static {
        t2o.a(779092519);
        t2o.a(806355884);
    }

    public AbstractTimeShiftDXFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(AbstractTimeShiftDXFrame abstractTimeShiftDXFrame, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/AbstractTimeShiftDXFrame");
    }

    public void abstractRefreshBottomByMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6df1b99", new Object[]{this, new Boolean(z)});
        }
    }

    public void initTimeShiftAction(com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar, o0e o0eVar, gut gutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937b50f9", new Object[]{this, aVar, o0eVar, gutVar});
        } else {
            dxa.b(this.mFrameContext).u(new a(aVar, o0eVar, gutVar));
        }
    }

    @Override // tb.huk
    public abstract /* synthetic */ void onScreenOrientationChange(boolean z);

    public abstract void showTimeShiftLayerCallBack(Map<String, String> map, boolean z, iz1 iz1Var);
}
