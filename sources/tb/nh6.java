package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillBusinessThresholdGetResponse;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillBusinessThresholdGetResponseData;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillLimitCheckResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nh6 extends v10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_TIMEMOVE_SECKILL_ITEM_ADD = -3790645740344653746L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24732a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ LiveItem c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ ux9 h;

        public a(Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, ux9 ux9Var) {
            this.f24732a = context;
            this.b = jSONObject;
            this.c = liveItem;
            this.d = jSONObject2;
            this.e = str;
            this.f = str2;
            this.g = z;
            this.h = ux9Var;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                s0u.a(this.f24732a, g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (((MtopTbliveSeckillLimitCheckResponse) netBaseOutDo).getData().result) {
                nh6.c(nh6.this, this.f24732a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            } else {
                s0u.a(this.f24732a, g7p.MSG_TOAST_DEFAULT);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24733a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ LiveItem d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ ux9 f;

        public b(Context context, Object[] objArr, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, ux9 ux9Var) {
            this.f24733a = context;
            this.b = objArr;
            this.c = jSONObject;
            this.d = liveItem;
            this.e = jSONObject2;
            this.f = ux9Var;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if (jkdVar instanceof st9) {
                st9 st9Var = (st9) jkdVar;
                s0u.a(this.f24733a, st9Var.f28260a);
                nh6.d(nh6.this, this.b, this.c, this.f24733a, this.d, this.e, true, this.f);
                o3s.d("SeckillOpt", "follow success:" + st9Var.f28260a);
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else {
                s0u.a(this.f24733a, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveItem f24734a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ ux9 g;

        public c(LiveItem liveItem, Context context, JSONObject jSONObject, String str, String str2, boolean z, ux9 ux9Var) {
            this.f24734a = liveItem;
            this.b = context;
            this.c = jSONObject;
            this.d = str;
            this.e = str2;
            this.f = z;
            this.g = ux9Var;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                s0u.a(this.b, g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            MtopTbliveSeckillBusinessThresholdGetResponseData data = ((MtopTbliveSeckillBusinessThresholdGetResponse) netBaseOutDo).getData();
            LiveItem.Ext ext = this.f24734a.extendVal;
            ext.business = data.business;
            String str = data.secKillInfo;
            ext.secKillInfo = str;
            JSONObject d = fkx.d(str);
            nh6.e(nh6.this, this.b, this.c, this.f24734a, d != null ? d.getJSONObject("threshold") : null, this.d, this.e, this.f, this.g);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24735a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ ux9 c;
        public final /* synthetic */ DXRuntimeContext d;

        public d(nh6 nh6Var, Context context, LiveItem liveItem, ux9 ux9Var, DXRuntimeContext dXRuntimeContext) {
            this.f24735a = context;
            this.b = liveItem;
            this.c = ux9Var;
            this.d = dXRuntimeContext;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/DXTblive_timemove_seckill_item_addEventHandler$4");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                s0u.a(this.f24735a, "取消预约失败，再试一次");
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            s0u.a(this.f24735a, "取消预约成功");
            this.b.personalityData.put("goodsSubscribeStatus", (Object) "102");
            dxa b = dxa.b(this.c);
            if (b.l() != null && b.l().c() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("goodsSubscribeStatus", "102");
                b.l().c().c(String.valueOf(this.b.itemId), hashMap, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24736a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ ux9 c;
        public final /* synthetic */ DXRuntimeContext d;

        public e(nh6 nh6Var, Context context, LiveItem liveItem, ux9 ux9Var, DXRuntimeContext dXRuntimeContext) {
            this.f24736a = context;
            this.b = liveItem;
            this.c = ux9Var;
            this.d = dXRuntimeContext;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/DXTblive_timemove_seckill_item_addEventHandler$5");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                s0u.a(this.f24736a, "活动太火爆了，再试一次");
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
                        s0u.a(this.f24736a, "预约成功！");
                        this.b.personalityData.put("goodsSubscribeStatus", (Object) "103");
                        dxa b = dxa.b(this.c);
                        if (!(b.l() == null || b.l().c() == null)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("goodsSubscribeStatus", "103");
                            b.l().c().c(String.valueOf(this.b.itemId), hashMap, this.d);
                        }
                        wem.a(this.f24736a);
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            s0u.a(this.f24736a, "活动太火爆了，再试一次");
        }
    }

    static {
        t2o.a(779092631);
    }

    public static /* synthetic */ void c(nh6 nh6Var, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf1841c", new Object[]{nh6Var, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), ux9Var});
        } else {
            nh6Var.j(context, jSONObject, liveItem, jSONObject2, str, str2, z, ux9Var);
        }
    }

    public static /* synthetic */ void d(nh6 nh6Var, Object[] objArr, JSONObject jSONObject, Context context, LiveItem liveItem, JSONObject jSONObject2, boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf194e", new Object[]{nh6Var, objArr, jSONObject, context, liveItem, jSONObject2, new Boolean(z), ux9Var});
        } else {
            nh6Var.g(objArr, jSONObject, context, liveItem, jSONObject2, z, ux9Var);
        }
    }

    public static /* synthetic */ void e(nh6 nh6Var, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e645121e", new Object[]{nh6Var, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), ux9Var});
        } else {
            nh6Var.k(context, jSONObject, liveItem, jSONObject2, str, str2, z, ux9Var);
        }
    }

    public static /* synthetic */ Object ipc$super(nh6 nh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/DXTblive_timemove_seckill_item_addEventHandler");
    }

    public final void f(Context context, LiveItem liveItem, JSONObject jSONObject, String str, DXRuntimeContext dXRuntimeContext, ux9 ux9Var) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30044608", new Object[]{this, context, liveItem, jSONObject, str, dXRuntimeContext, ux9Var});
            return;
        }
        if (liveItem.personalityData == null) {
            liveItem.personalityData = new JSONObject();
        }
        if (!liveItem.personalityData.containsKey("goodsSubscribeStatus")) {
            liveItem.personalityData.put("goodsSubscribeStatus", (Object) "102");
        }
        String string = liveItem.personalityData.getString("goodsSubscribeStatus");
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            if ("103".equals(string)) {
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
            hashMap.put("secKillInfo", jSONObject.toJSONString());
            sbu.f(ux9Var, "secKillreserve", hashMap);
        }
        string.hashCode();
        if (!string.equals("103")) {
            new v7n(new e(this, context, liveItem, ux9Var, dXRuntimeContext)).K(zqq.h(liveItem.liveId), liveItem.itemId, "bblb.miaosha.2021.1212");
        } else {
            new k23(new d(this, context, liveItem, ux9Var, dXRuntimeContext)).K(zqq.h(liveItem.liveId), liveItem.itemId, "bblb.miaosha.2021.1212");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object[] r15, com.alibaba.fastjson.JSONObject r16, android.content.Context r17, com.taobao.taolive.sdk.model.common.LiveItem r18, com.alibaba.fastjson.JSONObject r19, boolean r20, tb.ux9 r21) {
        /*
            r14 = this;
            r0 = r15
            r10 = r18
            r5 = r19
            r1 = 3
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.nh6.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0034
            java.lang.Boolean r4 = new java.lang.Boolean
            r8 = r20
            r4.<init>(r8)
            r6 = 8
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r14
            r7 = 1
            r6[r7] = r0
            r6[r2] = r16
            r6[r1] = r17
            r0 = 4
            r6[r0] = r10
            r0 = 5
            r6[r0] = r5
            r0 = 6
            r6[r0] = r4
            r0 = 7
            r6[r0] = r21
            java.lang.String r0 = "dffa64ba"
            r3.ipc$dispatch(r0, r6)
            return
        L_0x0034:
            r8 = r20
            int r3 = r0.length
            java.lang.String r4 = ""
            if (r3 <= r1) goto L_0x0045
            r2 = r0[r2]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0045
            java.lang.String r2 = (java.lang.String) r2
            r6 = r2
            goto L_0x0046
        L_0x0045:
            r6 = r4
        L_0x0046:
            int r2 = r0.length
            if (r2 <= r1) goto L_0x0053
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            goto L_0x0054
        L_0x0053:
            r7 = r4
        L_0x0054:
            com.taobao.taolive.sdk.model.common.VideoInfo r0 = tb.up6.c0(r21)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r0.secSkillNeedLimit
            if (r0 == 0) goto L_0x008f
            if (r5 == 0) goto L_0x0066
            java.lang.String r0 = "activityId"
            java.lang.String r4 = r5.getString(r0)
        L_0x0066:
            r11 = r4
            tb.p7j r12 = new tb.p7j
            tb.nh6$a r13 = new tb.nh6$a
            r0 = r13
            r1 = r14
            r2 = r17
            r3 = r16
            r4 = r18
            r5 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            com.taobao.taolive.sdk.model.common.LiveItem$Ext r0 = r10.extendVal
            java.lang.String r0 = r0.anchorId
            java.lang.String r1 = r10.liveId
            long r2 = r10.itemId
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r12.K(r0, r1, r2, r11)
            goto L_0x00a1
        L_0x008f:
            r0 = r14
            r1 = r17
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r6
            r6 = r7
            r7 = r20
            r8 = r21
            r0.j(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nh6.g(java.lang.Object[], com.alibaba.fastjson.JSONObject, android.content.Context, com.taobao.taolive.sdk.model.common.LiveItem, com.alibaba.fastjson.JSONObject, boolean, tb.ux9):void");
    }

    public final void i(Context context, JSONObject jSONObject, LiveItem liveItem, String str, String str2, ux9 ux9Var) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7959a9a", new Object[]{this, context, jSONObject, liveItem, str, str2, ux9Var});
            return;
        }
        String d2 = qfa.d(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("scene", d2);
        hashMap.put("itemBizType", "secKill");
        if ("goods_list".equals(str)) {
            str3 = vrp.BIZ_GOODS_LIST;
        } else {
            str3 = "showcase";
        }
        hashMap.put("from", str3);
        hashMap.put("area", str2);
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null) {
            str4 = ext.secKillInfo;
        } else {
            str4 = "";
        }
        hashMap.put("secKillInfo", str4);
        String str5 = "2";
        hashMap.put("laiyuan", str5);
        hashMap.put("highlight_card_clickPos", "timemove_cart");
        hashMap.put("item_position", jSONObject.getString("item_position"));
        LiveItem.Ext ext2 = liveItem.extendVal;
        if (ext2 == null || !"secKill".equals(ext2.itemBizType)) {
            LiveItem.Ext ext3 = liveItem.extendVal;
            if (ext3 == null || !"groupItem".equals(ext3.itemBizType)) {
                str5 = "1";
            } else {
                str5 = "3";
            }
        }
        hashMap.put("bubbleType", str5);
        if (d9m.n().getActionAdapter() != null) {
            d9m.n().getActionAdapter().h(null, (Activity) context, liveItem, "detail", hashMap);
        }
        sbu.g(ux9Var, "timeshiftlayer-todetail", z9u.ARG_ITEM_ID + liveItem.itemId, "timemove_item_type=2", "coupon_type=0", "coupon_id=");
    }

    public final void k(Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1bc5a18", new Object[]{this, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), ux9Var});
        } else if (jSONObject2 != null && jSONObject2.containsKey(yj4.PARAM_VRPASS) && jSONObject2.getBoolean(yj4.PARAM_VRPASS).booleanValue()) {
            i(context, jSONObject, liveItem, str, str2, ux9Var);
        } else if (jSONObject2 == null) {
            s0u.a(context, g7p.MSG_TOAST_DEFAULT);
        } else if (z) {
            i(context, jSONObject, liveItem, str, str2, ux9Var);
        } else {
            s0u.a(context, jSONObject2.getString("denyMsg"));
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

    public static boolean l(Context context, LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941194c3", new Object[]{context, liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null) {
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isGray");
        if (booleanValue) {
            s0u.a(context, "商品已下架，看看其它商品吧");
        }
        return booleanValue;
    }

    @Override // tb.v10
    public void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, ux9 ux9Var) {
        LiveItem.Ext ext;
        Object obj;
        LiveTimemovingModel liveTimemovingModel;
        LiveTimemovingModel.TimeMovingHorListButtonStyleVO timeMovingHorListButtonStyleVO;
        LiveTimemovingModel liveTimemovingModel2;
        LiveTimemovingModel.TimeMovingHorListItemPicVO timeMovingHorListItemPicVO;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c45658f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, ux9Var});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[1];
            String str2 = (String) objArr[0];
            Context h = dXRuntimeContext.h();
            LiveItem liveItem = (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class);
            if (liveItem != null && (ext = liveItem.extendVal) != null && ext.secKillInfo != null && !l(h, liveItem)) {
                JSONObject d2 = fkx.d(liveItem.extendVal.secKillInfo);
                if ("follow".equals(str2)) {
                    if (objArr.length > 2) {
                        Object obj2 = objArr[2];
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                            f(h, liveItem, d2, str, dXRuntimeContext, ux9Var);
                        }
                    }
                    str = "";
                    f(h, liveItem, d2, str, dXRuntimeContext, ux9Var);
                } else if (to8.GOTO_DETAIL.equals(str2)) {
                    g(objArr, jSONObject, h, liveItem, d2, false, ux9Var);
                } else if ("followAndGotoDetail".equals(str2)) {
                    h(objArr, jSONObject, h, liveItem, d2, ux9Var);
                } else if ("update".equals(str2)) {
                    dxa b2 = dxa.b(ux9Var);
                    if (b2.l() != null && b2.l().c() != null) {
                        b2.l().c().b(String.valueOf(liveItem.itemId), dXRuntimeContext);
                    }
                } else if ("itemClickToast".equals(str2)) {
                    Object obj3 = objArr[1];
                    if (obj3 != null && !TextUtils.isEmpty(obj3.toString()) && (liveTimemovingModel2 = (LiveTimemovingModel) fkx.f(((JSONObject) objArr[1]).toJSONString(), LiveTimemovingModel.class)) != null && (timeMovingHorListItemPicVO = liveTimemovingModel2.timeMovingHorListItemPicVO) != null && !TextUtils.isEmpty(timeMovingHorListItemPicVO.clickToast)) {
                        s0u.a(dXRuntimeContext.h(), liveTimemovingModel2.timeMovingHorListItemPicVO.clickToast);
                    }
                } else if ("buttonClickToast".equals(str2) && (obj = objArr[1]) != null && !TextUtils.isEmpty(obj.toString()) && (liveTimemovingModel = (LiveTimemovingModel) fkx.f(((JSONObject) objArr[1]).toJSONString(), LiveTimemovingModel.class)) != null && (timeMovingHorListButtonStyleVO = liveTimemovingModel.timeMovingHorListButtonStyleVO) != null && !TextUtils.isEmpty(timeMovingHorListButtonStyleVO.buttonToast)) {
                    s0u.a(dXRuntimeContext.h(), liveTimemovingModel.timeMovingHorListButtonStyleVO.buttonToast);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void j(Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768c61a7", new Object[]{this, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), ux9Var});
            return;
        }
        if (jSONObject2 != null) {
            jSONObject2.getJSONObject("threshold");
        }
        n7j n7jVar = new n7j(new c(liveItem, context, jSONObject, str, str2, z, ux9Var));
        LiveItem.Ext ext = liveItem.extendVal;
        n7jVar.K(ext.anchorId, liveItem.liveId, liveItem.itemId, ext.secKillRecordId);
    }

    public final void h(Object[] objArr, JSONObject jSONObject, Context context, LiveItem liveItem, JSONObject jSONObject2, ux9 ux9Var) {
        String str;
        boolean z;
        JSONObject jSONObject3;
        AccountInfo accountInfo;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b896f15", new Object[]{this, objArr, jSONObject, context, liveItem, jSONObject2, ux9Var});
            return;
        }
        boolean w = uwa.w();
        if (w) {
            VideoInfo c0 = up6.c0(ux9Var);
            str = (c0 == null || (accountInfo = c0.broadCaster) == null) ? null : accountInfo.accountId;
        } else {
            d9m.n().getCurrentAnchorId();
            str = null;
        }
        if (w) {
            qt9 qt9Var = new qt9();
            qt9Var.f26917a = str;
            z = v2s.o().k().e(qt9Var);
        } else {
            z = d9m.n().getActionAdapter().m(null, str);
        }
        o3s.d("SeckillOpt", "follow :" + z);
        if (zga.b()) {
            if (!jSONObject2.containsKey("threshold") || (jSONObject3 = jSONObject2.getJSONObject("threshold")) == null || !jSONObject3.containsKey("isFollowThreshold") || !TextUtils.equals(jSONObject3.getString("isFollowThreshold"), "true")) {
                z2 = false;
            } else {
                o3s.d("SeckillOpt", "isFollowThreshold true");
            }
            if (!w) {
                z = d9m.n().getFollowState();
            }
            if (z || !z2) {
                g(objArr, jSONObject, context, liveItem, jSONObject2, false, ux9Var);
                return;
            }
            b bVar = new b(context, objArr, jSONObject, liveItem, jSONObject2, ux9Var);
            String str2 = "goods_seckill_" + jSONObject2.getString("activityType");
            if (w) {
                qt9 qt9Var2 = new qt9();
                qt9Var2.f26917a = str;
                qt9Var2.o = str2;
                v2s.o().k().f(qt9Var2, bVar);
                return;
            }
            d9m.n().follow(bVar, str2);
            return;
        }
        g(objArr, jSONObject, context, liveItem, jSONObject2, false, ux9Var);
    }
}
