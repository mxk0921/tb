package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MtopTbliveSeckillLimitCheckResponse;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gh6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD = 2067261922142202874L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f19994a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ LiveItem d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ boolean h;

        public a(xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
            this.f19994a = xeaVar;
            this.b = context;
            this.c = jSONObject;
            this.d = liveItem;
            this.e = jSONObject2;
            this.f = str;
            this.g = str2;
            this.h = z;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a1u.a(this.b, g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (((MtopTbliveSeckillLimitCheckResponse) netBaseOutDo).getData().result) {
                gh6.d(gh6.this, this.f19994a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            } else {
                a1u.a(this.b, g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19995a;
        public final /* synthetic */ xea b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ LiveItem e;
        public final /* synthetic */ JSONObject f;

        public b(Context context, xea xeaVar, Object[] objArr, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2) {
            this.f19995a = context;
            this.b = xeaVar;
            this.c = objArr;
            this.d = jSONObject;
            this.e = liveItem;
            this.f = jSONObject2;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if (jkdVar instanceof st9) {
                st9 st9Var = (st9) jkdVar;
                a1u.a(this.f19995a, st9Var.f28260a);
                gh6.e(gh6.this, this.b, this.c, this.d, this.f19995a, this.e, this.f, true);
                hha.c("SeckillOpt", "follow success:" + st9Var.f28260a);
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else {
                a1u.a(this.f19995a, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveItem f19996a;
        public final /* synthetic */ xea b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean g;

        public c(LiveItem liveItem, xea xeaVar, Context context, JSONObject jSONObject, String str, String str2, boolean z) {
            this.f19996a = liveItem;
            this.b = xeaVar;
            this.c = context;
            this.d = jSONObject;
            this.e = str;
            this.f = str2;
            this.g = z;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a1u.a(this.c, g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemActionQueryData data = ((ItemActionQueryResponse) netBaseOutDo).getData();
            LiveItem.Ext ext = this.f19996a.extendVal;
            ext.business = data.business;
            String str = data.secKillInfo;
            ext.secKillInfo = str;
            JSONObject d = fkx.d(str);
            gh6.f(gh6.this, this.b, this.c, this.d, this.f19996a, d != null ? d.getJSONObject("threshold") : null, this.e, this.f, this.g);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements l8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19997a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ xea c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends d47 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_goods_seckill_item_addEventHandler$4$1");
            }

            @Override // tb.d47, tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a1u.a(d.this.f19997a, "取消预约失败，再试一次");
                }
            }

            @Override // tb.d47, tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                a1u.a(d.this.f19997a, "取消预约成功");
                d.this.b.personalityData.put("goodsSubscribeStatus", (Object) "102");
                d dVar = d.this;
                j3a.a(dVar.c, dVar.b);
            }
        }

        public d(gh6 gh6Var, Context context, LiveItem liveItem, xea xeaVar) {
            this.f19997a = context;
            this.b = liveItem;
            this.c = xeaVar;
        }

        @Override // tb.l8d
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else {
                a1u.a(this.f19997a, "请授权日历权限！");
            }
        }

        @Override // tb.l8d
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                new l23(new a()).L(zqq.h(this.b.liveId), this.b.itemId, "bblb.miaosha.2021.1212");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements l8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19999a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ xea c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends d47 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_goods_seckill_item_addEventHandler$5$1");
            }

            @Override // tb.d47, tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a1u.a(e.this.f19999a, "活动太火爆了，再试一次");
                }
            }

            @Override // tb.d47, tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                if (!(netResponse == null || netResponse.getDataJsonObject() == null)) {
                    try {
                        if (netResponse.getDataJsonObject().getBoolean("result")) {
                            a1u.a(e.this.f19999a, "预约成功，注意查收手机日历通知！");
                            e.this.b.personalityData.put("goodsSubscribeStatus", (Object) "103");
                            e eVar = e.this;
                            j3a.a(eVar.c, eVar.b);
                            wem.a(e.this.f19999a);
                            return;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                a1u.a(e.this.f19999a, "活动太火爆了，再试一次");
            }
        }

        public e(gh6 gh6Var, Context context, LiveItem liveItem, xea xeaVar) {
            this.f19999a = context;
            this.b = liveItem;
            this.c = xeaVar;
        }

        @Override // tb.l8d
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else {
                a1u.a(this.f19999a, "请授权日历权限！");
            }
        }

        @Override // tb.l8d
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                new w7n(new a()).L(zqq.h(this.b.liveId), this.b.itemId, "bblb.miaosha.2021.1212");
            }
        }
    }

    static {
        t2o.a(295698950);
    }

    public static /* synthetic */ void d(gh6 gh6Var, xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cdb067", new Object[]{gh6Var, xeaVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
        } else {
            gh6Var.l(xeaVar, context, jSONObject, liveItem, jSONObject2, str, str2, z);
        }
    }

    public static /* synthetic */ void e(gh6 gh6Var, xea xeaVar, Object[] objArr, JSONObject jSONObject, Context context, LiveItem liveItem, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4579b575", new Object[]{gh6Var, xeaVar, objArr, jSONObject, context, liveItem, jSONObject2, new Boolean(z)});
        } else {
            gh6Var.i(xeaVar, objArr, jSONObject, context, liveItem, jSONObject2, z);
        }
    }

    public static /* synthetic */ void f(gh6 gh6Var, xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece36aa5", new Object[]{gh6Var, xeaVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
        } else {
            gh6Var.m(xeaVar, context, jSONObject, liveItem, jSONObject2, str, str2, z);
        }
    }

    public static /* synthetic */ Object ipc$super(gh6 gh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_goods_seckill_item_addEventHandler");
    }

    public final boolean g(xea xeaVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dee58c3", new Object[]{this, xeaVar, liveItem})).booleanValue();
        }
        if (!or.a(xeaVar.q(), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) || !yga.p()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        if (liveItem != null) {
            jSONObject.put("itemId", (Object) Long.valueOf(liveItem.itemId));
        }
        sjr.g().c("com.taobao.taolive.goods.pop.card.click", jSONObject, xea.E(xeaVar));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(tb.xea r15, java.lang.Object[] r16, com.alibaba.fastjson.JSONObject r17, android.content.Context r18, com.taobao.taolive.sdk.model.common.LiveItem r19, com.alibaba.fastjson.JSONObject r20, boolean r21) {
        /*
            r14 = this;
            r0 = r16
            r10 = r19
            r6 = r20
            r1 = 3
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.gh6.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0035
            java.lang.Boolean r4 = new java.lang.Boolean
            r9 = r21
            r4.<init>(r9)
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r7 = 0
            r5[r7] = r14
            r7 = 1
            r5[r7] = r15
            r5[r2] = r0
            r5[r1] = r17
            r0 = 4
            r5[r0] = r18
            r0 = 5
            r5[r0] = r10
            r0 = 6
            r5[r0] = r6
            r0 = 7
            r5[r0] = r4
            java.lang.String r0 = "213a0ee"
            r3.ipc$dispatch(r0, r5)
            return
        L_0x0035:
            r9 = r21
            int r3 = r0.length
            java.lang.String r4 = ""
            if (r3 <= r1) goto L_0x0046
            r2 = r0[r2]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = (java.lang.String) r2
            r7 = r2
            goto L_0x0047
        L_0x0046:
            r7 = r4
        L_0x0047:
            int r2 = r0.length
            if (r2 <= r1) goto L_0x0054
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            goto L_0x0055
        L_0x0054:
            r8 = r4
        L_0x0055:
            boolean r0 = tb.jga.i(r15)
            if (r0 == 0) goto L_0x008b
            if (r6 == 0) goto L_0x0063
            java.lang.String r0 = "activityId"
            java.lang.String r4 = r6.getString(r0)
        L_0x0063:
            r11 = r4
            tb.q7j r12 = new tb.q7j
            tb.gh6$a r13 = new tb.gh6$a
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r18
            r4 = r17
            r5 = r19
            r6 = r20
            r9 = r21
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            com.taobao.taolive.sdk.model.common.LiveItem$Ext r0 = r10.extendVal
            java.lang.String r0 = r0.anchorId
            java.lang.String r1 = r10.liveId
            long r2 = r10.itemId
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r12.K(r0, r1, r2, r11)
            goto L_0x009c
        L_0x008b:
            r0 = r14
            r1 = r15
            r2 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r8
            r8 = r21
            r0.l(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gh6.i(tb.xea, java.lang.Object[], com.alibaba.fastjson.JSONObject, android.content.Context, com.taobao.taolive.sdk.model.common.LiveItem, com.alibaba.fastjson.JSONObject, boolean):void");
    }

    public final void m(xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320f314", new Object[]{this, xeaVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
        } else if (jSONObject2 != null && jSONObject2.containsKey(yj4.PARAM_VRPASS) && jSONObject2.getBoolean(yj4.PARAM_VRPASS).booleanValue()) {
            k(xeaVar, context, jSONObject, liveItem, str, str2);
        } else if (jSONObject2 == null) {
            a1u.a(context, g7p.MSG_TOAST_DEFAULT);
        } else if (z) {
            k(xeaVar, context, jSONObject, liveItem, str, str2);
        } else {
            a1u.a(context, jSONObject2.getString("denyMsg"));
        }
    }

    public final void n(DXRuntimeContext dXRuntimeContext, LiveItem liveItem) {
        jxg jxgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebdc47d", new Object[]{this, dXRuntimeContext, liveItem});
            return;
        }
        JSONObject parseJsonObject = liveItem.parseJsonObject();
        fl6 S = dXRuntimeContext.S();
        if (S instanceof jxg) {
            jxgVar = (jxg) S;
        } else {
            jxgVar = null;
        }
        ikr.f().l(dXRuntimeContext.L(), parseJsonObject, jxgVar);
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

    public final void j(xea xeaVar, Object[] objArr, JSONObject jSONObject, Context context, LiveItem liveItem, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("decb7c11", new Object[]{this, xeaVar, objArr, jSONObject, context, liveItem, jSONObject2});
            return;
        }
        boolean m = kkr.i().d().m(xeaVar == null ? null : xeaVar.q(), jga.c(xeaVar));
        hha.c("SeckillOpt", "follow :" + m);
        if (zga.b()) {
            if (!jSONObject2.containsKey("threshold") || (jSONObject3 = jSONObject2.getJSONObject("threshold")) == null || !jSONObject3.containsKey("isFollowThreshold") || !TextUtils.equals(jSONObject3.getString("isFollowThreshold"), "true")) {
                z = false;
            } else {
                hha.c("SeckillOpt", "isFollowThreshold true");
            }
            if (kkr.i().f(xeaVar) || !z) {
                i(xeaVar, objArr, jSONObject, context, liveItem, jSONObject2, false);
                return;
            }
            kkr.i().b(xeaVar, new b(context, xeaVar, objArr, jSONObject, liveItem, jSONObject2), "goods_seckill_" + jSONObject2.getString("activityType"));
            return;
        }
        i(xeaVar, objArr, jSONObject, context, liveItem, jSONObject2, false);
    }

    public final void l(xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106fda3", new Object[]{this, xeaVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
            return;
        }
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("threshold") : null;
        if (jSONObject3 == null || !jSONObject3.containsKey(yj4.PARAM_VRPASS) || !jSONObject3.getBoolean(yj4.PARAM_VRPASS).booleanValue() || yga.y0()) {
            new qnf(new c(liveItem, xeaVar, context, jSONObject, str, str2, z)).K(xeaVar, liveItem);
        } else {
            k(xeaVar, context, jSONObject, liveItem, str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:6:0x0024, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:16:0x004f, B:18:0x005f, B:20:0x0062, B:22:0x0068, B:27:0x0072, B:28:0x007d, B:30:0x0085, B:32:0x008b, B:34:0x008e, B:36:0x0094, B:38:0x009d, B:39:0x00a6, B:40:0x00b5, B:42:0x00bd, B:43:0x00c9, B:45:0x00d2, B:46:0x00d6, B:48:0x00de, B:50:0x00e4, B:52:0x00ea, B:54:0x00ee, B:56:0x00f3, B:58:0x00f9, B:60:0x00fe), top: B:64:0x0024 }] */
    @Override // tb.l10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.taobao.android.dinamicx.expression.event.DXEvent r14, java.lang.Object[] r15, com.taobao.android.dinamicx.DXRuntimeContext r16, tb.xea r17) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gh6.c(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext, tb.xea):void");
    }

    public final void h(Context context, LiveItem liveItem, JSONObject jSONObject, String str, xea xeaVar) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc1d4d3", new Object[]{this, context, liveItem, jSONObject, str, xeaVar});
            return;
        }
        if (liveItem.personalityData == null) {
            liveItem.personalityData = new JSONObject();
        }
        if (liveItem.personalityData.getString("goodsSubscribeStatus") == null) {
            liveItem.personalityData.put("goodsSubscribeStatus", (Object) "102");
        }
        long j = 0;
        long longValue = jSONObject != null ? jSONObject.getLongValue("startTime") : 0L;
        if (jSONObject != null) {
            j = jSONObject.getLongValue("endTime");
        }
        if (kkr.i().o() != null && !TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = new HashMap<>();
            if ("103".equals(liveItem.personalityData.getString("goodsSubscribeStatus"))) {
                str2 = "cancel";
            } else {
                str2 = "reserve";
            }
            hashMap.put("action", str2);
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            LiveItem.Ext ext = liveItem.extendVal;
            if (ext != null) {
                str3 = ext.itemBizType;
            } else {
                str3 = "";
            }
            hashMap.put("itemBizType", str3);
            hashMap.put("liveId", liveItem.liveId);
            if ("goods_list".equals(str)) {
                str4 = vrp.BIZ_GOODS_LIST;
            } else {
                str4 = "showcase";
            }
            hashMap.put("from", str4);
            if (jSONObject != null) {
                hashMap.put("secKillInfo", jSONObject.toJSONString());
            }
            kkr.i().o().c("secKillreserve", hashMap);
        }
        String string = liveItem.personalityData.getString("goodsSubscribeStatus");
        string.hashCode();
        ux9 ux9Var = null;
        if (!string.equals("103")) {
            String str5 = "https://h5.m.taobao.com/taolive/video.html?id=" + liveItem.liveId + "&livesource=miaosha_subscribe";
            beb d2 = kkr.i().d();
            if (xeaVar != null) {
                ux9Var = xeaVar.q();
            }
            d2.f(ux9Var, context, "您淘宝直播预约的宝贝马上开抢！", str5, longValue, j, 1L, new e(this, context, liveItem, xeaVar));
            return;
        }
        beb d3 = kkr.i().d();
        if (xeaVar != null) {
            ux9Var = xeaVar.q();
        }
        d3.p(ux9Var, context, "您淘宝直播预约的宝贝马上开抢！", longValue, j, new d(this, context, liveItem, xeaVar));
    }

    public final void k(xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1231be96", new Object[]{this, xeaVar, context, jSONObject, liveItem, str, str2});
            return;
        }
        String p = pfa.p(liveItem);
        if (TextUtils.equals(str, "goods_list")) {
            str3 = "口袋列表";
        } else {
            str3 = TextUtils.equals(str, "showcase") ? "小卡" : str;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isSecKill", (Object) Boolean.TRUE);
        jSONObject2.put("scene", (Object) p);
        iha.t(str3, liveItem, true, jSONObject2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", p);
        hashMap.put("itemBizType", "secKill");
        if ("goods_list".equals(str)) {
            str4 = vrp.BIZ_GOODS_LIST;
        } else {
            str4 = "showcase";
        }
        hashMap.put("from", str4);
        hashMap.put("area", str2);
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null) {
            str5 = ext.secKillInfo;
        } else {
            str5 = "";
        }
        hashMap.put("secKillInfo", str5);
        String str13 = "2";
        hashMap.put("laiyuan", str13);
        hashMap.put("item_position", jSONObject.getString("item_position"));
        LiveItem.Ext ext2 = liveItem.extendVal;
        if (ext2 == null || !"secKill".equals(ext2.itemBizType)) {
            str13 = "1";
        }
        hashMap.put("bubbleType", str13);
        liveItem.cpsClickPos = pfa.j(liveItem, TextUtils.equals(str2, "btn"), "");
        if (kkr.i().d() != null) {
            Activity activity = (Activity) context;
            str9 = "item_position";
            str6 = "";
            str8 = "area";
            str11 = "showcase";
            str7 = "from";
            str10 = "itemBizType";
            kkr.i().d().h(xeaVar == null ? null : xeaVar.q(), activity, liveItem, "detail", hashMap);
        } else {
            str9 = "item_position";
            str6 = "";
            str8 = "area";
            str10 = "itemBizType";
            str11 = "showcase";
            str7 = "from";
        }
        if (kkr.i().o() != null) {
            LiveItem.Ext ext3 = liveItem.extendVal;
            JSONObject d2 = fkx.d(ext3 != null ? ext3.secKillInfo : str6);
            if (d2 != null && d2.containsKey("status")) {
                int intValue = d2.getIntValue("status");
                if (intValue == 2) {
                    str12 = "sellout";
                } else if (intValue == 1) {
                    str12 = z9u.CLICK_GOODS_BUY;
                } else {
                    str12 = "close";
                }
                hashMap.put("type", str12);
            }
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put("liveId", liveItem.liveId);
            LiveItem.Ext ext4 = liveItem.extendVal;
            hashMap.put(str10, ext4 != null ? ext4.itemBizType : str6);
            if ("goods_list".equals(str)) {
                str11 = vrp.BIZ_GOODS_LIST;
            }
            hashMap.put(str7, str11);
            hashMap.put(str8, str2);
            kkr.i().o().c("flashsale", hashMap);
        }
        if ("goods_list".equals(str)) {
            pfa.b(xeaVar, liveItem);
            he7.b(xeaVar, liveItem, jSONObject.getString(str9));
            return;
        }
        dvp.c(xeaVar, liveItem, null);
    }
}
