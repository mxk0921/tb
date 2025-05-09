package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.falco.n;
import com.taobao.mmad.render.dx.widget.a;
import com.taobao.taobao.R;
import tb.go5;
import tb.ho5;
import tb.hq5;
import tb.io5;
import tb.jgh;
import tb.k46;
import tb.kr7;
import tb.me0;
import tb.t2o;
import tb.th2;
import tb.tm1;
import tb.uwb;
import tb.xh2;
import tb.ya6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BootImageInteractDXView extends BootImageInteractSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BootImageInteractDXView";
    private JSONObject bootImageObj;
    private boolean loadDXFailed;
    private th2 mAddCartPresenter;
    private xh2 mCouponPresenter;
    public DinamicXEngine mDinamicXEngine;
    public DXRootView mDinamicXView;
    private final String DX_INTERACT_TYPE_ADD_CART = me0.EVENT_TYPE;
    private final String DX_INTERACT_TYPE_COUPON = "claimedCoupon";
    private final String DX_EVENT_NAV = n.LEAVE_TYPE_JUMP_NEXT_PAGE;
    private final String DX_COMMENT_ACTION_EVENT = "commonActionEvent";
    private final String ACTION_RESPONSE_ADD_CART = "1";
    private final String ACTION_RESPONSE_ADD_CART_JUMP_PAGE = "101";
    private final String ACTION_RESPONSE_COUPON = "2";
    private final String ACTION_RESPONSE_COUPON_JUMP_PAGE = "102";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements uwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
            if (r8.equals(com.taobao.falco.n.LEAVE_TYPE_JUMP_NEXT_PAGE) == false) goto L_0x0073;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.taobao.android.dinamicx.expression.event.DXEvent r8, java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
            /*
                r7 = this;
                r0 = 3
                r1 = 2
                r2 = 1
                r3 = 0
                com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.a.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x001b
                java.lang.String r5 = "f9db7b67"
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r3] = r7
                r6[r2] = r8
                r6[r1] = r9
                r6[r0] = r10
                r4.ipc$dispatch(r5, r6)
                return
            L_0x001b:
                boolean r10 = r8 instanceof com.taobao.mmad.render.dx.event.DXSwipeInteractEvent
                java.lang.String r4 = "BootImageInteractDXView"
                if (r10 == 0) goto L_0x0034
                java.lang.String r10 = "handleEvent DXSwipeInteractEvent"
                tb.jgh.a(r4, r10)
                com.taobao.mmad.render.dx.event.DXSwipeInteractEvent r8 = (com.taobao.mmad.render.dx.event.DXSwipeInteractEvent) r8
                boolean r8 = r8.isTriggerInteractSuccess()
                if (r8 != 0) goto L_0x0049
                java.lang.String r8 = "handleEvent DXSwipeInteractEvent isTriggerInteractSuccess = false"
                tb.jgh.a(r4, r8)
                return
            L_0x0034:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r10 = "handleEvent default click event, mSlideSuccess="
                r8.<init>(r10)
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r10 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                boolean r10 = r10.mSlideSuccess
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                tb.jgh.a(r4, r8)
            L_0x0049:
                if (r9 == 0) goto L_0x0055
                int r8 = r9.length
                if (r8 <= 0) goto L_0x0055
                r8 = r9[r3]
                java.lang.String r8 = r8.toString()
                goto L_0x0057
            L_0x0055:
                java.lang.String r8 = ""
            L_0x0057:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r10 = "handleEvent eventName = "
                r9.<init>(r10)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                tb.jgh.a(r4, r9)
                r8.hashCode()
                r9 = -1
                int r10 = r8.hashCode()
                switch(r10) {
                    case -414047463: goto L_0x0095;
                    case 23457852: goto L_0x008a;
                    case 1475693025: goto L_0x007f;
                    case 1980299888: goto L_0x0075;
                    default: goto L_0x0073;
                }
            L_0x0073:
                r0 = -1
                goto L_0x009f
            L_0x0075:
                java.lang.String r10 = "jumpNextPage"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x009f
                goto L_0x0073
            L_0x007f:
                java.lang.String r10 = "claimedCoupon"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x0088
                goto L_0x0073
            L_0x0088:
                r0 = 2
                goto L_0x009f
            L_0x008a:
                java.lang.String r10 = "addToCart"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x0093
                goto L_0x0073
            L_0x0093:
                r0 = 1
                goto L_0x009f
            L_0x0095:
                java.lang.String r10 = "commonActionEvent"
                boolean r8 = r8.equals(r10)
                if (r8 != 0) goto L_0x009e
                goto L_0x0073
            L_0x009e:
                r0 = 0
            L_0x009f:
                switch(r0) {
                    case 0: goto L_0x00ba;
                    case 1: goto L_0x00b4;
                    case 2: goto L_0x00ae;
                    case 3: goto L_0x00a8;
                    default: goto L_0x00a2;
                }
            L_0x00a2:
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r8 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.access$000(r8)
                goto L_0x00c3
            L_0x00a8:
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r8 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.access$000(r8)
                goto L_0x00c3
            L_0x00ae:
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r8 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.access$200(r8)
                goto L_0x00c3
            L_0x00b4:
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r8 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.access$100(r8)
                goto L_0x00c3
            L_0x00ba:
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r8 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                com.taobao.bootimage.data.BootImageInfo r9 = r8.mBootImageInfo
                java.lang.String r9 = r9.actionResponse
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.access$300(r8, r9)
            L_0x00c3:
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView r8 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.this
                com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.access$400(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.a.a(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (BootImageInteractDXView.this.getBootImageContentListener() != null) {
                    jgh.a(BootImageInteractDXView.TAG, "handleEvent getBootImageContentListener().onClose ");
                    BootImageInteractDXView.this.getBootImageContentListener().a("redirect");
                }
            } catch (Throwable th) {
                jgh.b(BootImageInteractDXView.TAG, "handleEvent getBootImageContentListener().onClose error", th);
            }
        }
    }

    static {
        t2o.a(573571110);
    }

    public BootImageInteractDXView(Context context, BootImageInfo bootImageInfo, JSONObject jSONObject) {
        super(context, bootImageInfo);
        if (bootImageInfo != null) {
            try {
                bootImageInfo.isDxTemplate = true;
            } catch (Throwable th) {
                tm1.b(TAG, "BootImageInteractDXView constructor error", th);
                return;
            }
        }
        BootImageInfo bootImageInfo2 = this.mBootImageInfo;
        if (bootImageInfo2 != null) {
            bootImageInfo2.isDxTemplate = true;
        }
        this.splashObject = jSONObject;
        this.mDisableInteract = true;
        LayoutInflater.from(context).inflate(R.layout.bootimage_interact_dx, this);
        this.mInteractClickContainer = (LinearLayout) findViewById(R.id.bootimage_interact_dx_click_container);
        this.mDinamicXEngine = new DinamicXEngine(new DXEngineConfig.b(ya6.BIZ_TYPE).F());
        tm1.a(TAG, "do start show DXTemplateItem dinamicXEngine = " + this.mDinamicXEngine);
        this.mDinamicXEngine.e1(com.taobao.mmad.render.dx.widget.a.DXMMSWIPEINTERACTIONVIEW_MMSWIPEINTERACTIONVIEW, new a.C0622a());
        this.mDinamicXEngine.V0(go5.DX_PARSER_MMGETLOCALURL, new go5());
        this.mDinamicXEngine.V0(ho5.DX_PARSER_MM_ORANGE, new ho5());
        this.mDinamicXEngine.V0(hq5.DX_PARSER_SPLITJSONARRAY, new hq5());
        this.mDinamicXEngine.V0(io5.DX_PARSER_MM_REMOVE_URL_QUERY, new io5());
        this.mDinamicXEngine.W0(18615516725124L, new k46(new a()));
        DXRootView dXView = getDXView(context);
        this.mDinamicXView = dXView;
        if (dXView == null) {
            tm1.a(TAG, "getDXView mDinamicXView == null , setVisibility(GONE)");
            setVisibility(8);
            this.loadDXFailed = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams = dXView.getLayoutParams();
        this.mInteractClickContainer.addView(this.mDinamicXView, layoutParams == null ? new FrameLayout.LayoutParams(-1, -2) : layoutParams);
        this.mAddCartPresenter = new th2(context, bootImageInfo, this);
        this.mCouponPresenter = new xh2(context, bootImageInfo, this);
    }

    public static /* synthetic */ void access$000(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93429152", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.jumpNextPage();
        }
    }

    public static /* synthetic */ void access$100(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e3d3f1", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.addCart();
        }
    }

    public static /* synthetic */ void access$200(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e851690", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.receiveCoupon();
        }
    }

    public static /* synthetic */ void access$300(BootImageInteractDXView bootImageInteractDXView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67af3539", new Object[]{bootImageInteractDXView, str});
        } else {
            bootImageInteractDXView.processCommonActionEvent(str);
        }
    }

    public static /* synthetic */ void access$400(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c79bce", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.refreshAfterInteract();
        }
    }

    private void addAdditionalInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1569d893", new Object[]{this, jSONObject});
        } else {
            jSONObject.put("topshowScreenHeight", (Object) Float.valueOf(kr7.c(null)));
        }
    }

    private void addCart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63f1b68", new Object[]{this});
            return;
        }
        th2 th2Var = this.mAddCartPresenter;
        if (th2Var != null) {
            th2Var.c();
        }
    }

    private DXRootView getDXView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("4d8b5245", new Object[]{this, context});
        }
        try {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            JSONObject jSONObject = this.splashObject.getJSONObject("template");
            dXTemplateItem.b = Long.parseLong(jSONObject.getString("version"));
            dXTemplateItem.f7343a = jSONObject.getString("name");
            dXTemplateItem.c = jSONObject.getString("url");
            tm1.a(TAG, "getDXView DXTemplateItem version = " + dXTemplateItem.b + ", name = " + dXTemplateItem.f7343a + ", templateUrl = " + dXTemplateItem.c);
            JSONObject jSONObject2 = this.splashObject.getJSONObject("item").getJSONObject("0").getJSONObject("content");
            this.bootImageObj = jSONObject2;
            if (jSONObject2 == null) {
                tm1.a(TAG, "getDXView bootImageObj == null");
                return null;
            }
            DXTemplateItem u = this.mDinamicXEngine.u(dXTemplateItem);
            if (u == null) {
                tm1.a(TAG, "getDXView DXTemplateItem is null");
                return null;
            }
            long parseLong = Long.parseLong(jSONObject.getString("version"));
            u.b = parseLong;
            if (parseLong != dXTemplateItem.b) {
                tm1.a(TAG, "getDXView different DXTemplateItem version, return null, nowVer = " + u.b + "lastVer = " + dXTemplateItem.b);
                return null;
            }
            addAdditionalInfo(this.bootImageObj);
            DXResult<DXRootView> j1 = this.mDinamicXEngine.j1(this.mDinamicXEngine.o(context, u).f7291a, this.bootImageObj);
            this.mDinamicXEngine.t0(j1.f7291a);
            tm1.a(TAG, "getDXView do end show DXTemplateItem");
            return j1.f7291a;
        } catch (Throwable th) {
            tm1.b(TAG, "getDXView error", th);
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractDXView bootImageInteractDXView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2023236405) {
            return new Boolean(super.showWithAnim((Animation.AnimationListener) objArr[0]));
        }
        if (hashCode == -483678593) {
            super.close();
            return null;
        } else if (hashCode == -340027128) {
            return new Boolean(super.show());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageInteractDXView");
        }
    }

    private void jumpNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3bc6f7", new Object[]{this});
            return;
        }
        try {
            String string = this.splashObject.getJSONObject("item").getJSONObject("0").getString("targetUrl");
            jgh.a(TAG, "handleEvent jumpNextPage: targetUrl=" + string);
            if (!TextUtils.isEmpty(string)) {
                Nav.from(getContext()).toUri(string);
                postDelayed(new b(), 500L);
            }
        } catch (Throwable th) {
            tm1.b(TAG, "jumpNextPage error", th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r6.equals("2") == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processCommonActionEvent(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "e162bf7b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 49: goto L_0x0041;
                case 50: goto L_0x0038;
                case 48626: goto L_0x002d;
                case 48627: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "102"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r0 = 3
            goto L_0x004b
        L_0x002d:
            java.lang.String r0 = "101"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r0 = 2
            goto L_0x004b
        L_0x0038:
            java.lang.String r1 = "2"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x004b
            goto L_0x0020
        L_0x0041:
            java.lang.String r0 = "1"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x0020
        L_0x004a:
            r0 = 0
        L_0x004b:
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006b;
                case 2: goto L_0x0064;
                case 3: goto L_0x005d;
                default: goto L_0x004e;
            }
        L_0x004e:
            java.lang.String r0 = "handleEvent DX_COMMENT_ACTION_EVENT default jumpNextPage, actionResponse = "
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "BootImageInteractDXView"
            tb.jgh.a(r0, r6)
            r5.jumpNextPage()
            goto L_0x0072
        L_0x005d:
            r5.receiveCoupon()
            r5.jumpNextPage()
            goto L_0x0072
        L_0x0064:
            r5.addCart()
            r5.jumpNextPage()
            goto L_0x0072
        L_0x006b:
            r5.receiveCoupon()
            goto L_0x0072
        L_0x006f:
            r5.addCart()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.processCommonActionEvent(java.lang.String):void");
    }

    private void receiveCoupon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c28f0", new Object[]{this});
            return;
        }
        xh2 xh2Var = this.mCouponPresenter;
        if (xh2Var != null) {
            xh2Var.c();
        }
    }

    private void refreshAfterInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f3de1e", new Object[]{this});
        } else if (this.mDinamicXEngine == null || this.mDinamicXView == null) {
            jgh.a(TAG, "refreshAfterInteract null, dinamicXEngine=" + this.mDinamicXEngine + ", renderView=" + this.mDinamicXView);
        } else {
            JSONObject jSONObject = new JSONObject(this.bootImageObj);
            Boolean bool = Boolean.TRUE;
            jSONObject.put("disableAnimation", (Object) bool);
            jSONObject.put("disableInteract", (Object) bool);
            this.mDinamicXEngine.j1(this.mDinamicXView, jSONObject);
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        stopInteract();
        xh2 xh2Var = this.mCouponPresenter;
        if (xh2Var != null) {
            xh2Var.a();
        }
        th2 th2Var = this.mAddCartPresenter;
        if (th2Var != null) {
            th2Var.a();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
        } else {
            tm1.a(TAG, "onAdClick ");
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
            return;
        }
        tm1.a(TAG, "onSlide");
        onInteractSuccess(null);
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void renderDefaultCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83db882", new Object[]{this});
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        boolean show = super.show();
        if (!show) {
            return false;
        }
        return show;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void switchToReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c9f057", new Object[]{this});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x001d, B:8:0x0027, B:12:0x0031, B:15:0x003c, B:17:0x0046, B:22:0x0059, B:25:0x0063, B:31:0x0072, B:34:0x007a, B:36:0x0080, B:38:0x0086, B:43:0x00a2, B:46:0x00aa, B:52:0x00b6, B:53:0x00ca, B:55:0x00ce, B:56:0x00d2, B:58:0x00d6, B:59:0x00d9), top: B:62:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onInteractSuccess(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.onInteractSuccess(java.lang.Object):void");
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public boolean showWithAnim(Animation.AnimationListener animationListener) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8767dccb", new Object[]{this, animationListener})).booleanValue();
        }
        if (!super.showWithAnim(animationListener) || this.loadDXFailed) {
            z = false;
        }
        if (z) {
            try {
                setVisibility(0);
                if (animationListener != null) {
                    animationListener.onAnimationEnd(null);
                }
            } catch (Throwable th) {
                tm1.b(TAG, "showWithAnimError", th);
            }
        }
        return z;
    }
}
