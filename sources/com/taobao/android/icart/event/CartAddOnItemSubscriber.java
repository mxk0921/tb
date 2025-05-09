package com.taobao.android.icart.event;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.manager.CartPopupWindowManager;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.qrcode.result.Result;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.net.URLEncoder;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ct1;
import tb.hav;
import tb.kmb;
import tb.lcu;
import tb.lmb;
import tb.sca;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartAddOnItemSubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ct1.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.icart.event.CartAddOnItemSubscriber$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0425a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0425a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    CartAddOnItemSubscriber.q(CartAddOnItemSubscriber.this);
                }
            }
        }

        public a() {
        }

        @Override // tb.ct1.b
        public void a(PageInfo pageInfo, DataInfo dataInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cbf0fa3", new Object[]{this, pageInfo, dataInfo});
                return;
            }
            ((CartPopupWindowManager) CartAddOnItemSubscriber.p(CartAddOnItemSubscriber.this).e().h0()).i().post(new RunnableC0425a());
            CartAddOnItemSubscriber.r(CartAddOnItemSubscriber.this).d().P(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7984a;
        public final /* synthetic */ int b;

        public b(RecyclerView recyclerView, int i) {
            this.f7984a = recyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f7984a.scrollToPosition(this.b - 1);
            }
        }
    }

    static {
        t2o.a(478150767);
    }

    public static /* synthetic */ Object ipc$super(CartAddOnItemSubscriber cartAddOnItemSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartAddOnItemSubscriber");
    }

    public static /* synthetic */ kmb p(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("13dc4c42", new Object[]{cartAddOnItemSubscriber});
        }
        return cartAddOnItemSubscriber.j;
    }

    public static /* synthetic */ void q(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea7aafa", new Object[]{cartAddOnItemSubscriber});
        } else {
            cartAddOnItemSubscriber.A();
        }
    }

    public static /* synthetic */ kmb r(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("d5f4c144", new Object[]{cartAddOnItemSubscriber});
        }
        return cartAddOnItemSubscriber.j;
    }

    public static /* synthetic */ int s(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95c6b36f", new Object[]{cartAddOnItemSubscriber})).intValue();
        }
        return cartAddOnItemSubscriber.l;
    }

    public static /* synthetic */ IDMComponent t(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ad591f41", new Object[]{cartAddOnItemSubscriber});
        }
        return cartAddOnItemSubscriber.e;
    }

    public static /* synthetic */ kmb u(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("791970c7", new Object[]{cartAddOnItemSubscriber});
        }
        return cartAddOnItemSubscriber.j;
    }

    public static /* synthetic */ kmb v(CartAddOnItemSubscriber cartAddOnItemSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5a25ab48", new Object[]{cartAddOnItemSubscriber});
        }
        return cartAddOnItemSubscriber.j;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87170f05", new Object[]{this});
            return;
        }
        RecyclerView i = this.j.e().h0().i();
        int itemCount = i.getLayoutManager().getItemCount();
        if (itemCount != 0) {
            i.scrollToPosition(itemCount - 1);
            i.post(new b(i, itemCount));
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        JSONObject fields = this.e.getFields();
        if (fields != null) {
            fields.remove("_asyncStatus");
        }
        this.j.e().E(2);
    }

    public final JSONObject y() {
        Object[] objArr;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae4b92d9", new Object[]{this});
        }
        JSONObject fields = this.e.getFields();
        if (!(fields == null || (objArr = (Object[]) this.f23048a.e("extraParams")) == null || objArr.length != 2)) {
            try {
                i = Integer.parseInt(objArr[1].toString());
            } catch (Exception e) {
                UnifyLog.e("CartAddOnItemSubscriber", "addBag parse int error=" + e.getMessage());
                i = -1;
            }
            if (i < 0) {
                return null;
            }
            JSONArray jSONArray = fields.getJSONArray("items");
            if (jSONArray == null) {
                jSONArray = fields.getJSONArray("combinationItemList");
            }
            if (jSONArray != null && jSONArray.size() >= 1 + i) {
                return jSONArray.getJSONObject(i);
            }
        }
        return null;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0da4cc", new Object[]{this});
            return;
        }
        JSONObject y = y();
        if (y != null) {
            String string = y.getString("url");
            JSONObject c = c();
            if (c == null || string == null) {
                UnifyLog.n("CartAddOnItemSubscriber", "openUrl fail fields=" + c + ",url=" + string);
                return;
            }
            StringBuilder sb = new StringBuilder(string);
            Map<String, String> e = AddCartUtil.e((Activity) this.b, "detail", AddCartUtil.ADD_ON_MODULE, y.getString("customParam"));
            for (String str : e.keySet()) {
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(e.get(str));
            }
            c.put("url", (Object) sb.toString());
            lcu d = this.j.g().d();
            d.q("itemClick");
            d.l("openUrl");
            d.k(this.f23048a.c());
            this.j.g().h(d);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2714ae", new Object[]{this});
            return;
        }
        JSONObject y = y();
        if (y != null) {
            hav.d("CartAddOnItemSubscriber", "省心凑加购");
            AddCartUtil.d(this.j, y, AddCartUtil.ADD_ON_MODULE, true);
        }
    }

    public final void x() {
        String str;
        String str2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95d0bc1", new Object[]{this});
            return;
        }
        final JSONObject fields = this.e.getFields();
        if (fields.getString("_asyncStatus") == null) {
            final int i = this.l + 1;
            this.l = i;
            fields.put("_asyncStatus", (Object) "Loading");
            MtopRequest mtopRequest = new MtopRequest();
            JSONObject c = c();
            JSONObject jSONObject2 = new JSONObject();
            if (c == null || !c.containsKey("mtopConfig") || (jSONObject = c.getJSONObject("mtopConfig")) == null) {
                str = "mtop.mine.cart.cou";
                str2 = "1.0";
            } else {
                str = jSONObject.getString("apiMethod");
                str2 = jSONObject.getString("apiVersion");
                jSONObject2.put("cartFrom", (Object) QueryParamsManager.DEFAULT_CART_FROM);
            }
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            jSONObject2.putAll(AddCartUtil.e(this.j.getContext(), "detail", AddCartUtil.ADD_ON_MODULE, null));
            final JSONObject f = sca.f(this.k);
            if (f != null) {
                jSONObject2.putAll(f.getJSONObject("customParams"));
            }
            mtopRequest.setData(jSONObject2.toString());
            RemoteBusiness build = RemoteBusiness.build(mtopRequest);
            build.reqMethod(MethodEnum.POST);
            build.setUnitStrategy("UNIT_TRADE");
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.icart.event.CartAddOnItemSubscriber.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        onError(i2, mtopResponse, obj);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    UnifyLog.n("CartAddOnItemSubscriber", "onError mtopResponse=" + mtopResponse);
                    fields.put("_asyncStatus", (Object) "Fail");
                    CartAddOnItemSubscriber.v(CartAddOnItemSubscriber.this).e().E(2);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    } else if (CartAddOnItemSubscriber.s(CartAddOnItemSubscriber.this) != i) {
                        UnifyLog.n("CartAddOnItemSubscriber", "onSuccess return,requestId=" + i);
                    } else if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                        String str3 = new String(mtopResponse.getBytedata());
                        UnifyLog.d("CartAddOnItemSubscriber", "body=".concat(str3));
                        try {
                            JSONObject jSONObject3 = JSON.parseObject(str3).getJSONObject("data");
                            JSONObject fields2 = CartAddOnItemSubscriber.t(CartAddOnItemSubscriber.this).getFields();
                            if (!(fields2 == null || jSONObject3 == null || jSONObject3.isEmpty())) {
                                fields2.putAll(jSONObject3);
                                fields2.put("_asyncStatus", (Object) Result.MSG_SUCCESS);
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.putAll(f.getJSONObject("customParams"));
                                fields2.put("_requestParams", (Object) jSONObject4);
                                fields2.put("_responseData", (Object) URLEncoder.encode(jSONObject3.toJSONString(), "UTF-8"));
                                CartAddOnItemSubscriber.u(CartAddOnItemSubscriber.this).e().h0().c(2);
                            }
                        } catch (Exception e) {
                            UnifyLog.d("CartAddOnItemSubscriber", "parse mtop error msg=" + e.getMessage());
                        }
                    }
                }
            });
            build.startRequest();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r6.equals("cartAddonFetch") == false) goto L_0x0024;
     */
    @Override // tb.l12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.lcu r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.icart.event.CartAddOnItemSubscriber.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "8fbad8af"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r1[r2] = r6
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            java.lang.String r6 = r6.d()
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -770667622: goto L_0x0052;
                case -227437228: goto L_0x0047;
                case 170418107: goto L_0x003c;
                case 1734529735: goto L_0x0031;
                case 2116736933: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x005b
        L_0x0026:
            java.lang.String r0 = "cartAddonOpenUrl"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r0 = 4
            goto L_0x005b
        L_0x0031:
            java.lang.String r0 = "cartAddonAddBag"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003a
            goto L_0x0024
        L_0x003a:
            r0 = 3
            goto L_0x005b
        L_0x003c:
            java.lang.String r0 = "cartAddonRefresh"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x0024
        L_0x0045:
            r0 = 2
            goto L_0x005b
        L_0x0047:
            java.lang.String r0 = "cartScrollToFeedflow"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x0024
        L_0x0050:
            r0 = 1
            goto L_0x005b
        L_0x0052:
            java.lang.String r1 = "cartAddonFetch"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x005b
            goto L_0x0024
        L_0x005b:
            switch(r0) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x006b;
                case 2: goto L_0x0067;
                case 3: goto L_0x0063;
                case 4: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x00a5
        L_0x005f:
            r5.z()
            goto L_0x00a5
        L_0x0063:
            r5.w()
            goto L_0x00a5
        L_0x0067:
            r5.B()
            goto L_0x00a5
        L_0x006b:
            tb.kmb r6 = r5.j
            tb.zxb r6 = r6.d()
            boolean r6 = r6.t()
            if (r6 == 0) goto L_0x009e
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r0 = "isPopLayerRequest"
            java.lang.String r1 = "true"
            r6.put(r0, r1)
            java.lang.String r0 = "isFullDataQuery"
            r6.put(r0, r1)
            tb.kmb r0 = r5.j
            r1 = 0
            r0.f0(r2, r6, r1)
            tb.kmb r6 = r5.j
            tb.zxb r6 = r6.d()
            com.taobao.android.icart.event.CartAddOnItemSubscriber$a r0 = new com.taobao.android.icart.event.CartAddOnItemSubscriber$a
            r0.<init>()
            r6.l(r0)
            goto L_0x00a5
        L_0x009e:
            r5.A()
            goto L_0x00a5
        L_0x00a2:
            r5.x()
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.event.CartAddOnItemSubscriber.j(tb.lcu):void");
    }
}
