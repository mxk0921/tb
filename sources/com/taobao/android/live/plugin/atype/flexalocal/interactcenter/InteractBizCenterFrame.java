package com.taobao.android.live.plugin.atype.flexalocal.interactcenter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.TaoLiveActionType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.a4s;
import tb.fkx;
import tb.giv;
import tb.gnk;
import tb.gq0;
import tb.hmy;
import tb.jkd;
import tb.kiv;
import tb.kkr;
import tb.lly;
import tb.mly;
import tb.o3s;
import tb.qt9;
import tb.rg0;
import tb.s3c;
import tb.s3s;
import tb.sjr;
import tb.st9;
import tb.stk;
import tb.t2o;
import tb.t54;
import tb.tny;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractBizCenterFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InteractBizCenterFrame";
    private final hmy interactData = new hmy();
    private final Map<TaoLiveActionType, String> atomicAbilityMap = new HashMap();
    private final tny followAction = new e();
    private final tny followAndRewardAction = new f();
    private final tny openGoodsListAction = new g();
    private final tny openAliveAction = new h();
    private final tny addFavorAction = new i();
    private final tny showSharePanelAction = new j();
    private final tny openShopWindowAction = new k();
    private final tny showInputPanelAction = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$000(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$100(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.this.showInputPanel(jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lly f8598a;

        public d(InteractBizCenterFrame interactBizCenterFrame, lly llyVar) {
            this.f8598a = llyVar;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if (jkdVar instanceof st9) {
                lly llyVar = this.f8598a;
                if (llyVar != null) {
                    llyVar.a(true, null);
                }
                kiv.c(gq0.g().getApplication(), ((st9) jkdVar).f28260a);
            }
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
            lly llyVar = this.f8598a;
            if (llyVar != null) {
                llyVar.a(false, null);
            }
            kiv.c(gq0.g().getApplication(), str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$200(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$300(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$400(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$500(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$600(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$700(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements tny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // tb.tny
        public void a(JSONObject jSONObject, lly llyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fb6cbfd", new Object[]{this, jSONObject, llyVar});
            } else {
                InteractBizCenterFrame.access$800(InteractBizCenterFrame.this, jSONObject, llyVar);
            }
        }
    }

    static {
        t2o.a(295699484);
        t2o.a(806355016);
    }

    public InteractBizCenterFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
        initAtomicMap();
        a4s.b(this.mContext, this.mFrameContext.z(), this);
        pendingInteractAction("Nav", new a());
        pendingInteractAction("Item", new b());
    }

    public static /* synthetic */ void access$000(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786f7fb8", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.doNav(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$100(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1c1039", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.nav2Detail(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$200(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc8a0ba", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.realFollow(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$300(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375313b", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.followAndReward(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$400(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8721c1bc", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.openGoodsList(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$500(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace523d", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.openAlive(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$600(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7ae2be", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.addFavor(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$700(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1227733f", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.showSharePanel(jSONObject, llyVar);
        }
    }

    public static /* synthetic */ void access$800(InteractBizCenterFrame interactBizCenterFrame, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d403c0", new Object[]{interactBizCenterFrame, jSONObject, llyVar});
        } else {
            interactBizCenterFrame.openShopWindow(jSONObject, llyVar);
        }
    }

    private void addFavor(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6fc06b", new Object[]{this, jSONObject, llyVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            hashMap.putAll(jSONObject);
        }
        hashMap.put("callBack", llyVar);
        hashMap.put("showDoubleClickFavorAnim", Boolean.TRUE);
        sjr.g().c("com.taolive.taolive.room.mediaplatform_addfavor", hashMap, observeUniqueIdentification());
    }

    private void doNav(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59522c10", new Object[]{this, jSONObject, llyVar});
        } else if (jSONObject == null) {
            o3s.b(TAG, "doNav -> actionData is null");
            if (llyVar != null) {
                llyVar.a(false, null);
            }
        } else {
            String string = jSONObject.getString(rg0.JUMP_URL);
            if (TextUtils.isEmpty(string)) {
                o3s.b(TAG, "doNav -> jumpUrl is empty");
                if (llyVar != null) {
                    llyVar.a(false, null);
                    return;
                }
                return;
            }
            boolean h2 = s3s.h(this.mContext, string);
            if (llyVar != null) {
                llyVar.a(h2, null);
            }
        }
    }

    private void executeAction(TaoLiveActionType taoLiveActionType, Object obj, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6126847", new Object[]{this, taoLiveActionType, obj, llyVar});
        } else if (taoLiveActionType != null) {
            if (this.atomicAbilityMap.containsKey(taoLiveActionType)) {
                tryRunInteractAction(this.atomicAbilityMap.get(taoLiveActionType), obj instanceof JSONObject ? (JSONObject) obj : null, llyVar);
                return;
            }
            o3s.b(TAG, "onEvent -> actionType is unknown: " + taoLiveActionType);
        }
    }

    private void executeActionWithOriginData(Object obj, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67e2143", new Object[]{this, obj, llyVar});
        } else if (!(obj instanceof JSONObject)) {
            o3s.b(TAG, "executeActionWithOriginData -> data is not JSONObject");
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            tryRunInteractAction(jSONObject.getString("type"), jSONObject.getJSONObject("data"), llyVar);
        }
    }

    private void followAndReward(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509b0853", new Object[]{this, jSONObject, llyVar});
            return;
        }
        realFollow(jSONObject, llyVar);
        doNav(jSONObject, null);
    }

    private void initAtomicMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65352c08", new Object[]{this});
            return;
        }
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_FOLLOW, z9u.SEARCH_ACCOUNT_LIVE_FOLLOW);
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_FOLLOW_AND_REWARD, "FollowAndReward");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_NAV, "Nav");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_ITEM, "Item");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_POCKET, "Pocket");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_OPEN_ALIVE, "OpenAlive");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_LIKE, "Like");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_SHARE, "Share");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_SHOP_WINDOW, "ShopWindow");
        this.atomicAbilityMap.put(TaoLiveActionType.ACTION_SEND_COMMENT, "SendComment");
    }

    public static /* synthetic */ Object ipc$super(InteractBizCenterFrame interactBizCenterFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -822581903) {
            super.onViewHolderDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/interactcenter/InteractBizCenterFrame");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r12.equals("Pocket") == false) goto L_0x002c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void notifyAction(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "ShopWindow"
            java.lang.String r1 = "Share"
            java.lang.String r2 = "Like"
            java.lang.String r3 = "OpenAlive"
            java.lang.String r4 = "Pocket"
            java.lang.String r5 = "SendComment"
            r6 = 1
            r7 = 0
            r8 = 2
            com.android.alibaba.ip.runtime.IpChange r9 = com.taobao.android.live.plugin.atype.flexalocal.interactcenter.InteractBizCenterFrame.$ipChange
            boolean r10 = r9 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r10 == 0) goto L_0x0021
            java.lang.String r0 = "43a4e030"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r7] = r11
            r1[r6] = r12
            r9.ipc$dispatch(r0, r1)
            return
        L_0x0021:
            r12.hashCode()
            r9 = -1
            int r10 = r12.hashCode()
            switch(r10) {
                case -1940171369: goto L_0x0059;
                case -1899069002: goto L_0x0052;
                case -772603773: goto L_0x0049;
                case 2368439: goto L_0x0040;
                case 79847359: goto L_0x0037;
                case 963243686: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r6 = -1
            goto L_0x0061
        L_0x002e:
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0035
            goto L_0x002c
        L_0x0035:
            r6 = 5
            goto L_0x0061
        L_0x0037:
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L_0x003e
            goto L_0x002c
        L_0x003e:
            r6 = 4
            goto L_0x0061
        L_0x0040:
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0047
            goto L_0x002c
        L_0x0047:
            r6 = 3
            goto L_0x0061
        L_0x0049:
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x0050
            goto L_0x002c
        L_0x0050:
            r6 = 2
            goto L_0x0061
        L_0x0052:
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x0061
            goto L_0x002c
        L_0x0059:
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0060
            goto L_0x002c
        L_0x0060:
            r6 = 0
        L_0x0061:
            switch(r6) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007d;
                case 2: goto L_0x0077;
                case 3: goto L_0x0071;
                case 4: goto L_0x006b;
                case 5: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x0088
        L_0x0065:
            tb.tny r12 = r11.openShopWindowAction
            r11.pendingInteractAction(r0, r12)
            goto L_0x0088
        L_0x006b:
            tb.tny r12 = r11.showSharePanelAction
            r11.pendingInteractAction(r1, r12)
            goto L_0x0088
        L_0x0071:
            tb.tny r12 = r11.addFavorAction
            r11.pendingInteractAction(r2, r12)
            goto L_0x0088
        L_0x0077:
            tb.tny r12 = r11.openAliveAction
            r11.pendingInteractAction(r3, r12)
            goto L_0x0088
        L_0x007d:
            tb.tny r12 = r11.openGoodsListAction
            r11.pendingInteractAction(r4, r12)
            goto L_0x0088
        L_0x0083:
            tb.tny r12 = r11.showInputPanelAction
            r11.pendingInteractAction(r5, r12)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.interactcenter.InteractBizCenterFrame.notifyAction(java.lang.String):void");
    }

    private void openGoodsList(JSONObject jSONObject, lly llyVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a02717e", new Object[]{this, jSONObject, llyVar});
            return;
        }
        if (jSONObject == null) {
            o3s.b(TAG, "openGoodsList -> actionData is null");
        }
        if (jSONObject != null) {
            str = jSONObject.getString("itemId");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            o3s.b(TAG, "openGoodsList -> itemId is null");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizTopItemId", str);
        sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, null);
    }

    private void openShopWindow(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cf3138", new Object[]{this, jSONObject, llyVar});
        } else if (this.mFrameContext == null) {
            o3s.b(TAG, "openShopWindow -> mFrameContext is null");
        } else if (gnk.a().f(this.mLiveDataModel)) {
            VideoInfo.OfficialLiveInfo officialLiveInfo = this.mLiveDataModel.mVideoInfo.officialLiveInfo;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("accountId", (Object) officialLiveInfo.accountId);
            jSONObject2.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) officialLiveInfo.encryptAnchorId);
            jSONObject2.put("liveId", (Object) officialLiveInfo.officialLiveId);
            jSONObject2.put("sourceType", (Object) "official-live");
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            this.mFrameContext.h().c("com.taobao.taolive.room.avatar_card_show", jSONObject2, observeUniqueIdentification());
        } else {
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                hashMap.putAll(jSONObject);
            }
            this.mFrameContext.h().c("com.taobao.taolive.room.avatar_card_show", hashMap, observeUniqueIdentification());
        }
    }

    private void pendingInteractAction(String str, tny tnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe7bd8f", new Object[]{this, str, tnyVar});
            return;
        }
        if (this.interactData.b.containsKey(str)) {
            mly mlyVar = this.interactData.b.get(str);
            if (tnyVar == null || mlyVar == null) {
                o3s.b(TAG, "pendingInteractAction action is null-> type is " + str);
            } else {
                tnyVar.a(mlyVar.b(), mlyVar.a());
            }
            this.interactData.b.remove(str);
        }
        if (tnyVar != null) {
            this.interactData.f20756a.put(str, tnyVar);
        }
    }

    private void realFollow(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de224e59", new Object[]{this, jSONObject, llyVar});
            return;
        }
        if (jSONObject == null) {
            o3s.b(TAG, "realFollow -> actionData is null");
        }
        qt9 qt9Var = new qt9();
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        qt9Var.f26917a = videoInfo.broadCaster.accountId;
        qt9Var.c = videoInfo.liveId;
        if (jSONObject != null) {
            if (jSONObject.containsKey("originPage")) {
                qt9Var.l = jSONObject.getString("originPage");
            }
            if (jSONObject.containsKey("followSource")) {
                qt9Var.o = jSONObject.getString("followSource");
            }
        }
        v2s.o().k().f(giv.f().r(qt9Var), new d(this, llyVar));
    }

    private void showSharePanel(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7fa426", new Object[]{this, jSONObject, llyVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            hashMap.putAll(jSONObject);
        }
        sjr.g().c("com.taolive.taolive.room.mediaplatform_show_sharepanel", hashMap, observeUniqueIdentification());
        if (llyVar != null) {
            llyVar.a(true, null);
        }
    }

    private void tryRunInteractAction(String str, JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14cbe2e2", new Object[]{this, str, jSONObject, llyVar});
        } else if (!this.atomicAbilityMap.containsValue(str)) {
            o3s.b(TAG, "onEvent -> actionType is unknown: " + str);
        } else if (this.interactData.f20756a.containsKey(str)) {
            tny tnyVar = this.interactData.f20756a.get(str);
            if (tnyVar != null) {
                tnyVar.a(jSONObject, llyVar);
            }
        } else {
            this.interactData.b.put(str, new mly(jSONObject, llyVar));
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return TAG;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.INTERACTIVE_EVENT_BIZ_CENTER, uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        o3s.b(TAG, Constants.KEY_DATA_RECEIVED_TIME);
        pendingInteractAction(z9u.SEARCH_ACCOUNT_LIVE_FOLLOW, this.followAction);
        pendingInteractAction("FollowAndReward", this.followAndRewardAction);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        o3s.b(TAG, "onDestroy: " + this);
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.INTERACTIVE_EVENT_BIZ_CENTER.equals(str)) {
            o3s.b(TAG, "onEvent -> INTERACTIVE_EVENT_BIZ_CENTER");
            try {
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    Object obj2 = map.get("type");
                    Object obj3 = map.get("callBack");
                    Object obj4 = map.get("data");
                    if (obj2 instanceof TaoLiveActionType) {
                        executeAction((TaoLiveActionType) obj2, obj4, (lly) obj3);
                    } else if ((obj4 instanceof JSONObject) && ((JSONObject) obj4).containsKey("type")) {
                        executeActionWithOriginData(obj4, (lly) obj3);
                    }
                }
            } catch (Exception e2) {
                o3s.b(TAG, "onEvent -> exception: " + e2.getMessage());
            }
        } else if (uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY.equals(str) && (obj instanceof String)) {
            String str2 = (String) obj;
            o3s.b(TAG, "onEvent -> INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, type:" + str2);
            notifyAction(str2);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
            return;
        }
        super.onViewHolderDestroy();
        this.mFrameContext.z().b(this);
        o3s.b(TAG, "onViewHolderDestroy: " + this);
    }

    public void showInputPanel(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed4d11", new Object[]{this, jSONObject, llyVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            hashMap.putAll(jSONObject);
        }
        hashMap.put("callBack", llyVar);
        sjr.g().c(uyg.EVENT_INPUT_SHOW, hashMap, observeUniqueIdentification());
    }

    private void openAlive(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5816e425", new Object[]{this, jSONObject, llyVar});
            return;
        }
        if (jSONObject == null) {
            o3s.b(TAG, "openAlive -> actionData is null");
        }
        if (this.mContext == null || !vc.a() || vc.i(this.mContext) || this.mContext.getResources().getConfiguration().orientation != 2) {
            if (jSONObject != null && !jSONObject.containsKey("componentName")) {
                o3s.b(TAG, "openAlive -> componentName is empty");
            }
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var instanceof t54) {
                IInteractiveProxy.h z0 = ((t54) ux9Var).z0();
                if (z0 != null) {
                    z0.v("TBLiveWVPlugin.Event.openComponent", jSONObject);
                } else {
                    o3s.b(TAG, "openAlive -> InteractiveManager is null");
                }
            } else {
                o3s.b(TAG, "openAlive -> mFrameContext is not CommonFrameContext");
            }
        } else {
            kiv.c(this.mContext, "请切换至竖屏状态查看");
        }
    }

    private void nav2Detail(JSONObject jSONObject, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c99308", new Object[]{this, jSONObject, llyVar});
        } else if (jSONObject == null) {
            if (llyVar != null) {
                llyVar.a(false, null);
            }
            o3s.b(TAG, "nav2Detail -> actionData is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("liveItemDO");
            if (jSONObject2 == null) {
                if (llyVar != null) {
                    llyVar.a(false, null);
                }
                o3s.b(TAG, "nav2Detail -> liveItemObj is null");
                return;
            }
            LiveItem liveItem = (LiveItem) fkx.f(jSONObject2.toJSONString(), LiveItem.class);
            if (liveItem == null) {
                if (llyVar != null) {
                    llyVar.a(false, null);
                }
                o3s.b(TAG, "nav2Detail -> liveItem is null");
            } else if (this.mFrameContext == null) {
                if (llyVar != null) {
                    llyVar.a(false, null);
                }
                o3s.b(TAG, "nav2Detail -> mFrameContext is null");
            } else if (kkr.i().d() == null) {
                if (llyVar != null) {
                    llyVar.a(false, null);
                }
                o3s.b(TAG, "nav2Detail -> getActionAdapter is null");
            } else {
                kkr.i().d().h(this.mFrameContext, (Activity) this.mContext, liveItem, "detail", null);
                if (llyVar != null) {
                    llyVar.a(true, null);
                }
            }
        }
    }
}
