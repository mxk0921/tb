package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class si6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TLPERSONALINTRODUCTIONCLICK = -2546843614216696025L;

    /* renamed from: a  reason: collision with root package name */
    public final TBLiveDataModel f28068a;
    public final ux9 b;
    public long c = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements lly {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f28069a;

        public a(DXRuntimeContext dXRuntimeContext) {
            this.f28069a = dXRuntimeContext;
        }

        @Override // tb.lly
        public void a(boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a6087ae", new Object[]{this, new Boolean(z), map});
            } else if (z) {
                si6.a(si6.this, this.f28069a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ qt9 b;

        public b(qt9 qt9Var) {
            this.b = qt9Var;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if ((jkdVar instanceof hnf) && !((hnf) jkdVar).f20761a) {
                si6.b(si6.this, this.b);
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
    public class c implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            if (jkdVar instanceof st9) {
                kiv.c(gq0.g().getApplication(), ((st9) jkdVar).f28260a);
            }
            si6 si6Var = si6.this;
            si6Var.e(si6.j(si6Var));
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            String string = gq0.g().getApplication().getString(R.string.taolive_comments_user_follow_fail_flexalocal);
            if (!TextUtils.isEmpty(str2)) {
                str2 = string;
            }
            kiv.c(gq0.g().getApplication(), str2);
        }
    }

    static {
        t2o.a(295698571);
    }

    public si6(TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        this.f28068a = tBLiveDataModel;
        this.b = ux9Var;
    }

    public static /* synthetic */ void a(si6 si6Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82cf816", new Object[]{si6Var, dXRuntimeContext});
        } else {
            si6Var.k(dXRuntimeContext);
        }
    }

    public static /* synthetic */ void b(si6 si6Var, qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08230c7", new Object[]{si6Var, qt9Var});
        } else {
            si6Var.i(qt9Var);
        }
    }

    public static /* synthetic */ Object ipc$super(si6 si6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/handler/DXTlPersonalIntroductionClickEventHandler");
    }

    public static /* synthetic */ ux9 j(si6 si6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("b1a910bb", new Object[]{si6Var});
        }
        return si6Var.b;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f7c0f9", new Object[]{this});
            return;
        }
        qt9 qt9Var = new qt9();
        VideoInfo videoInfo = this.f28068a.mVideoInfo;
        qt9Var.f26917a = videoInfo.broadCaster.accountId;
        qt9Var.c = videoInfo.liveId;
        qt9Var.l = "livewatch_personalgreeting";
        qt9 r = giv.f().r(qt9Var);
        v2s.o().k().d(r, new b(r));
    }

    public final void d(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9d36a0", new Object[]{this, dXRuntimeContext, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString(rg0.JUMP_URL);
            if (!TextUtils.isEmpty(string)) {
                voj.a(dXRuntimeContext.h(), string);
            }
        }
    }

    public void e(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4457d375", new Object[]{this, ux9Var});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_location", "personalgreeting");
        hashMap.put("followdegree", "NORMAL");
        g5h f = giv.f();
        if (f != null) {
            f.m(ux9Var, "AccountFollow", hashMap);
        }
    }

    public final void f(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        JSONObject jSONObject2;
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f18d98", new Object[]{this, dXRuntimeContext, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("liveItemDO")) != null && (liveItem = (LiveItem) fkx.f(jSONObject2.toJSONString(), LiveItem.class)) != null) {
            kkr.i().d().h(this.b, (Activity) dXRuntimeContext.h(), liveItem, "detail", null);
        }
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be615f9f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("itemId");
            if (!TextUtils.isEmpty(string)) {
                HashMap hashMap = new HashMap();
                hashMap.put("bizTopItemId", string);
                sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, null);
            }
        }
    }

    public final void i(qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c84779", new Object[]{this, qt9Var});
        } else {
            v2s.o().k().f(qt9Var, new c());
        }
    }

    public final void k(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a3e2cc", new Object[]{this, dXRuntimeContext});
            return;
        }
        JSONObject i = dXRuntimeContext.i();
        if (i != null) {
            JSONObject jSONObject = i.getJSONObject("actions");
            if (jSONObject != null) {
                jSONObject.put("complete", "true");
            }
            d9m.n().renderDX(dXRuntimeContext.L(), new JSONObject(i));
            return;
        }
        o3s.b("PersonalIntroduction", "handleEvent data error");
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r11, java.lang.Object[] r12, com.taobao.android.dinamicx.DXRuntimeContext r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.si6.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    public void h(DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36cf4f06", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
            o3s.b("PersonalIntroduction", "openIntimacy runtimeContext is null");
        } else {
            Context h = dXRuntimeContext.h();
            if (!vc.a() || vc.i(h) || h.getResources().getConfiguration().orientation != 2) {
                ux9 ux9Var = this.b;
                if (ux9Var instanceof t54) {
                    IInteractiveProxy.h z0 = ((t54) ux9Var).z0();
                    VideoInfo videoInfo = null;
                    IInteractiveProxy.f d = z0 != null ? z0.d() : null;
                    if (d != null) {
                        HashMap hashMap = new HashMap();
                        TBLiveDataModel tBLiveDataModel = this.f28068a;
                        if (tBLiveDataModel != null) {
                            videoInfo = tBLiveDataModel.mVideoInfo;
                        }
                        if (videoInfo == null || !videoInfo.landScape) {
                            z = false;
                        }
                        hashMap.put("isLandscape", Boolean.valueOf(z));
                        hashMap.put("status", 2);
                        d.a(tws.M(), hashMap);
                        return;
                    }
                    o3s.b("PersonalIntroduction", "openIntimacy componentManager is null");
                    return;
                }
                o3s.b("PersonalIntroduction", "openIntimacy frameContext is not CommonFrameContext");
                return;
            }
            kiv.c(h, "请切换至竖屏状态查看");
        }
    }
}
