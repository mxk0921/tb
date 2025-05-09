package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.ChatFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModelFactory;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.goodlist.BottomMode;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import com.taobao.taolive.sdk.utils.newutils.TLiveBizUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f26060a;
    public static int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements bec {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26061a;
        public final /* synthetic */ float b;
        public final /* synthetic */ AliUrlImageView c;

        public a(Context context, float f, AliUrlImageView aliUrlImageView) {
            this.f26061a = context;
            this.b = f;
            this.c = aliUrlImageView;
        }

        @Override // tb.bec
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f7d4f", new Object[]{this, drawable});
                return;
            }
            this.c.getLayoutParams().width = (nw0.d(this.f26061a, this.b) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight();
            this.c.requestLayout();
        }

        @Override // tb.bec
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(295699249);
    }

    public static boolean A(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a54e84a", new Object[]{iDMComponent})).booleanValue();
        }
        return TextUtils.equals("dinamicx", iDMComponent.getContainerType());
    }

    public static boolean C(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3479933", new Object[]{xeaVar})).booleanValue();
        }
        if (xeaVar == null || !TextUtils.equals(xeaVar.O, bia.UNDER_TAKE_INSIDE_DETAIL)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c23cff1", new Object[0])).booleanValue();
        }
        return TLiveBizUtils.a();
    }

    public static boolean E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1a3557a", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 4 || i == 7) {
            return true;
        }
        return false;
    }

    public static boolean F(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c0b0f7e", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null) {
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isGray");
        boolean booleanValue2 = liveItem.liveItemStatusData.getBooleanValue("isDownShelf");
        if (booleanValue || booleanValue2) {
            return true;
        }
        return false;
    }

    public static boolean G(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc10232", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var == null || ux9Var.A() == null) {
            return false;
        }
        if (TextUtils.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString(), ux9Var.A().bizCode) || TextUtils.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), ux9Var.A().bizCode)) {
            return true;
        }
        return false;
    }

    public static boolean H(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("338c3950", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (ext = liveItem.extendVal) == null || !TextUtils.equals("liveshop", ext.itemShopType)) {
            return false;
        }
        return true;
    }

    public static boolean K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3033c9e1", new Object[]{str})).booleanValue();
        }
        return "preHeat".equals(str);
    }

    public static boolean M(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e47be00", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null || !jSONObject.getBooleanValue("isSpeaking")) {
            return false;
        }
        return true;
    }

    public static boolean N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52433a52", new Object[]{str})).booleanValue();
        }
        return new File(ey1.SWITCH_FILE_DIR, str).exists();
    }

    public static boolean O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51fa64db", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 2 || i == 1 || i == 8) {
            return true;
        }
        return false;
    }

    public static boolean P(String str, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9e33c91", new Object[]{str, liveItem})).booleanValue();
        }
        if (liveItem == null || TextUtils.isEmpty(liveItem.liveId) || TextUtils.isEmpty(str) || !yga.v() || TextUtils.equals(str, liveItem.liveId)) {
            return true;
        }
        hha.b("GoodUtils", "liveIdCheck | currLiveId=" + str + " itemLiveId=" + liveItem.liveId + "    itemId=" + liveItem.itemId);
        igq.n().a("good_liveId_check");
        return false;
    }

    public static void Q(GoodMsgNew goodMsgNew, LiveItem liveItem) {
        LiveItem liveItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b18a2", new Object[]{goodMsgNew, liveItem});
        } else if (goodMsgNew != null && (liveItem2 = goodMsgNew.liveItemDO) != null && liveItem != null && liveItem2.itemExtData != null) {
            if (liveItem.itemExtData == null) {
                liveItem.itemExtData = new JSONObject();
            }
            liveItem.itemExtData.put("isMainSubItemReplace", (Object) goodMsgNew.liveItemDO.itemExtData.getString("isMainSubItemReplace"));
        }
    }

    public static void R(ux9 ux9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1ca066", new Object[]{ux9Var, new Boolean(z)});
        } else if (ux9Var == null) {
            hha.b("GoodUtils", "postInteractiveMsg | context is null.");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "pop");
            hashMap.put("from", "goods");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("show", Boolean.toString(z));
            hashMap.put("extra", hashMap2);
            ux9Var.O(hashMap, null);
        }
    }

    public static void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d930db08", new Object[0]);
            return;
        }
        f26060a = 0;
        b = 0;
    }

    public static boolean T(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4594eba", new Object[]{extraGoodsTabItem, extraGoodsTabItem2})).booleanValue();
        }
        if (extraGoodsTabItem == null || extraGoodsTabItem2 == null || !TextUtils.equals(extraGoodsTabItem.bizType, extraGoodsTabItem2.bizType) || !TextUtils.equals(extraGoodsTabItem.type, extraGoodsTabItem2.type)) {
            return false;
        }
        return true;
    }

    public static void U(xea xeaVar, int i, int i2, boolean z) {
        hp3 hp3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b677648", new Object[]{xeaVar, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (xeaVar != null && xeaVar.q() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bottomOffset", (Object) String.valueOf(i));
            jSONObject.put("containerHeight", (Object) String.valueOf(i2));
            if (z) {
                hp3Var = jp3.a();
            } else {
                hp3Var = jp3.b();
            }
            jSONObject.put("commentShowStyle", (Object) hp3Var);
            hha.b("GoodUtils", "sendCommentNotifyMsg | isShow=" + z + "   data=" + jSONObject);
            xeaVar.q().h().c(ChatFrameKMP.CHAT_VIEW_STYLE_CHANGE, jSONObject.toJSONString(), xeaVar.q().C());
            if (!z) {
                jSONObject = null;
            }
            xeaVar.R = jSONObject;
        }
    }

    public static void V(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc37e5b", new Object[]{liveItem});
        } else if (y(liveItem) && (jSONObject = liveItem.nativeConfigInfos) != null) {
            f26060a = jSONObject.getIntValue("algoItemIndex");
        }
    }

    public static void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce80352", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    public static boolean X(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e90099d", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.itemExtData) == null) {
            return false;
        }
        return zqq.d(jSONObject.getString("isMainSubItemReplace"), false);
    }

    public static x4h Y(th5 th5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4h) ipChange.ipc$dispatch("fc5582de", new Object[]{th5Var});
        }
        x4h x4hVar = new x4h();
        x4hVar.f31139a = th5Var.f28716a;
        x4hVar.b = th5Var.c;
        x4hVar.e = th5Var.e;
        x4hVar.a(th5Var);
        x4hVar.f = th5Var.h;
        return x4hVar;
    }

    public static void Z(LiveItem liveItem, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df6932c", new Object[]{liveItem, xeaVar});
        } else if (liveItem != null && xeaVar != null) {
            sjr.g().c("com.taobao.taolive.room.goodlist.all.refresh.item.inner", liveItem, xea.E(xeaVar));
            if (xeaVar.j() != null) {
                xeaVar.j().b0(liveItem);
            }
        }
    }

    public static void a(Context context, AliUrlImageView aliUrlImageView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b524358", new Object[]{context, aliUrlImageView, new Float(f)});
        } else if (context != null && aliUrlImageView != null) {
            aliUrlImageView.setImageLoadListener(new a(context, f, aliUrlImageView));
        }
    }

    public static void b(xea xeaVar, LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4edad79", new Object[]{xeaVar, liveItem});
        } else if (xeaVar != null && liveItem != null && (jSONObject = liveItem.nativeConfigInfos) != null) {
            jSONObject.remove("entry_clkPos");
            if (!TextUtils.isEmpty(xeaVar.m.c)) {
                liveItem.nativeConfigInfos.put("entry_clkPos", (Object) xeaVar.m.c);
            }
        }
    }

    public static qt9 c(VideoInfo videoInfo, xea xeaVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("7dbd1e74", new Object[]{videoInfo, xeaVar});
        }
        ux9 ux9Var = null;
        if (videoInfo == null) {
            return null;
        }
        qt9 qt9Var = new qt9();
        AccountInfo accountInfo = videoInfo.broadCaster;
        if (accountInfo != null) {
            str = accountInfo.accountId;
        } else {
            str = "";
        }
        qt9Var.f26917a = str;
        qt9Var.c = videoInfo.liveId;
        if (accountInfo != null) {
            qt9Var.b = accountInfo.type;
        }
        if (kkr.i().d() != null) {
            beb d = kkr.i().d();
            if (xeaVar != null) {
                ux9Var = xeaVar.q();
            }
            d.b(ux9Var, qt9Var);
        }
        hha.c("GoodUtils", "accountId:" + qt9Var.b + " liveId:" + qt9Var.c);
        return qt9Var;
    }

    public static boolean f(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44cfc744", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null) {
            return false;
        }
        JSONObject jSONObject = liveItem.itemExtData;
        if (jSONObject != null && jSONObject.containsKey("enableSku")) {
            return zqq.c(liveItem.itemExtData.getString("enableSku"));
        }
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null) {
            return ext.enableSKU;
        }
        return false;
    }

    public static boolean g(VideoInfo videoInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("544c4473", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (jSONObject = videoInfo.itemConfigInfo) == null || jSONObject.getJSONObject("itemAlgoRecommendCardParam") == null || !videoInfo.itemConfigInfo.getJSONObject("itemAlgoRecommendCardParam").getBooleanValue("enableShowRecCardIdle") || !yga.E()) {
            return false;
        }
        return true;
    }

    public static int h(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6667457f", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            Object a2 = qm7.a(str, "", new bn7.b().j(jSONObject).f());
            if (a2 instanceof String) {
                return o66.f((String) a2);
            }
        }
        return i;
    }

    public static void i(xea xeaVar, stk stkVar, String str) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6229ce", new Object[]{xeaVar, stkVar, str});
        } else if (xeaVar != null && (videoInfo = xeaVar.n.b) != null) {
            qt9 c = c(videoInfo, xeaVar);
            if (c != null) {
                c.o = str;
                v2s.o().k().f(c, stkVar);
                hha.c("GoodUtils", "start follow");
                return;
            }
            hha.c("GoodUtils", "followParams is null");
        }
    }

    public static String j(LiveItem liveItem, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32b63921", new Object[]{liveItem, new Boolean(z), str});
        }
        if (liveItem == null || liveItem.nativeConfigInfos == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String string = liveItem.nativeConfigInfos.getString("goodsDisplayStyle");
        if (!TextUtils.isEmpty(string)) {
            sb.append(string);
        }
        if (!z) {
            sb.append("_itm");
            return sb.toString();
        }
        if (TextUtils.equals(BottomMode.ADDCART.getValue(), str)) {
            str2 = "_cart";
        } else {
            str2 = "_buy";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static int k(JSONObject jSONObject, xea xeaVar, String str, int i) {
        IDMComponent componentByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e6a622c", new Object[]{jSONObject, xeaVar, str, new Integer(i)})).intValue();
        }
        if (!(jSONObject == null || xeaVar == null || TextUtils.isEmpty(str) || xeaVar.D() == null || xeaVar.D().w() == null || (componentByName = xeaVar.D().w().getComponentByName(str)) == null || componentByName.getFields() == null)) {
            String string = componentByName.getFields().getString("height");
            if (TextUtils.isEmpty(string)) {
                return i;
            }
            int h = h(jSONObject, string, -1);
            if (h > 0) {
                return h;
            }
        }
        return i;
    }

    public static String l(LiveItem liveItem, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a310a207", new Object[]{liveItem, str});
        }
        if (liveItem == null || (jSONObject = liveItem.nativeConfigInfos) == null) {
            return str;
        }
        String string = jSONObject.getString("goodsDisplayStyle");
        if (TextUtils.isEmpty(string)) {
            return str;
        }
        return string;
    }

    @Deprecated
    public static long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec0bfeda", new Object[0])).longValue();
        }
        return f4s.a();
    }

    public static String n(LiveItem liveItem) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fd2d2a", new Object[]{liveItem});
        }
        if (liveItem == null || (jSONObject = liveItem.personalityData) == null) {
            return "";
        }
        if (!TextUtils.isEmpty(jSONObject.getString("promotionPrice"))) {
            jSONObject2 = liveItem.personalityData;
            str = "promotionPriceDesc";
        } else {
            jSONObject2 = liveItem.personalityData;
            str = "itemPriceDesc";
        }
        return jSONObject2.getString(str);
    }

    public static String o(LiveItem liveItem) {
        String str;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cab005dc", new Object[]{liveItem});
        }
        if (liveItem == null) {
            return "-1";
        }
        if (L(liveItem)) {
            String str2 = liveItem.itemPrice;
            LiveItem.Ext ext = liveItem.extendVal;
            return (ext == null || (str = ext.secKillInfo) == null || (d = fkx.d(str)) == null) ? str2 : d.getString("price");
        }
        JSONObject jSONObject = liveItem.personalityData;
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("promotionPrice"))) {
            return liveItem.personalityData.getString("promotionPrice");
        }
        JSONObject jSONObject2 = liveItem.personalityData;
        if (jSONObject2 == null || TextUtils.isEmpty(jSONObject2.getString("singlePromotionPrice"))) {
            return liveItem.itemPrice;
        }
        return liveItem.personalityData.getString("singlePromotionPrice");
    }

    public static String p(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13ef2d27", new Object[]{liveItem});
        }
        if (liveItem == null || (ext = liveItem.extendVal) == null) {
            return null;
        }
        return ext.scene;
    }

    public static long r(LiveItem liveItem) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5325efc9", new Object[]{liveItem})).longValue();
        }
        if (liveItem == null || liveItem.extendVal == null) {
            return 0L;
        }
        if (!yga.h() || TextUtils.isEmpty(liveItem.extendVal.lastTimepoint)) {
            j = 0;
        } else {
            j = i4s.d(liveItem.extendVal.lastTimepoint, 0L);
        }
        if (j > 0 || TextUtils.isEmpty(liveItem.extendVal.timepoint)) {
            return j;
        }
        return i4s.d(liveItem.extendVal.timepoint, j);
    }

    public static String s(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c9541c", new Object[]{new Long(j), str});
        }
        return new SimpleDateFormat("MM.dd HH:mm" + str).format(new Date(j));
    }

    public static String t(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa45bf6d", new Object[]{context});
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.get(0) == null)) {
                    componentName = runningTasks.get(0).topActivity;
                    if (componentName != null) {
                        componentName2 = runningTasks.get(0).topActivity;
                        return String.valueOf(componentName2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static UltronInstanceViewModel u(ViewModelStoreOwner viewModelStoreOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceViewModel) ipChange.ipc$dispatch("b2995180", new Object[]{viewModelStoreOwner});
        }
        return (UltronInstanceViewModel) new ViewModelProvider(viewModelStoreOwner, new UltronInstanceViewModelFactory()).get(UltronInstanceViewModel.class);
    }

    public static boolean w(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae830c18", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.nativeConfigInfos) == null || jSONObject.getIntValue("algoItemIndex") - f26060a <= b) {
            return false;
        }
        return true;
    }

    public static boolean x(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f988c10", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || liveItem.extendVal == null || (jSONObject = liveItem.personalityData) == null || jSONObject.getJSONArray("itemGifts") == null || liveItem.personalityData.getJSONArray("itemGifts").isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean z(VideoInfo videoInfo, EnterGoodsData enterGoodsData, List<LiveItem> list) {
        LiveItem liveItem;
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b3edf3", new Object[]{videoInfo, enterGoodsData, list})).booleanValue();
        }
        if (wda.a() && list != null && !list.isEmpty() && enterGoodsData != null && (liveItem = list.get(0)) != null && (ext = liveItem.extendVal) != null && !Boolean.parseBoolean(ext.closePopItem) && fv1.e(videoInfo, liveItem, null)) {
            return TextUtils.equals(enterGoodsData.itemHoldType, bia.UNDER_TAKE_BIG_CARD);
        }
        return false;
    }

    public static int q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82d1868f", new Object[]{jSONObject})).intValue();
        }
        if (jSONObject == null) {
            return 0;
        }
        int d = urf.d(jSONObject, "itemSellableQuantity", 0);
        if (urf.c(jSONObject, "needDisplayInventoryRemain", false)) {
            return d;
        }
        return 0;
    }

    public static boolean v(Context context, LiveItem liveItem) {
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
            a1u.a(context, "商品已下架，看看其它商品吧");
        }
        return booleanValue;
    }

    public static boolean B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70f3467d", new Object[]{str, str2})).booleanValue();
        }
        return "全部".equals(str) && "0".equals(str2);
    }

    public static boolean I(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("625d63cc", new Object[]{liveItem})).booleanValue();
        }
        return (liveItem == null || (ext = liveItem.extendVal) == null || !TextUtils.equals("preHeat", ext.itemBizType)) ? false : true;
    }

    public static boolean J(th5 th5Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b08a5057", new Object[]{th5Var})).booleanValue();
        }
        return (th5Var == null || (jSONObject = th5Var.b) == null || (jSONObject2 = jSONObject.getJSONObject("extendVal")) == null || !TextUtils.equals("preHeat", jSONObject2.getString("itemBizType"))) ? false : true;
    }

    public static boolean L(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21eba6e8", new Object[]{liveItem})).booleanValue();
        }
        return liveItem != null && (ext = liveItem.extendVal) != null && TextUtils.equals("secKill", ext.itemBizType) && zga.c();
    }

    public static JSONObject d(boolean z, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1f3df490", new Object[]{new Boolean(z), str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchKeyWord", (Object) str);
        if (z) {
            str4 = "bag_default";
        } else {
            str4 = "bag_more";
        }
        jSONObject.put("search_entry", (Object) str4);
        jSONObject.put("blankMode", (Object) Boolean.valueOf(z));
        jSONObject.put("refer", (Object) "search");
        jSONObject.put("gl_search_id", (Object) str3);
        if (TextUtils.isEmpty(str2)) {
            str2 = yga.c0();
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str) && !str2.contains("keyword")) {
                if (str2.contains("?")) {
                    str2 = str2.concat("&keyword=%s");
                } else {
                    str2 = str2.concat("?keyword=%s");
                }
            }
            if (str2.contains("?")) {
                str2 = str2.concat("&disableFcc=true&search_entry=koudai");
            } else {
                str2 = str2.concat("?disableFcc=true&search_entry=koudai");
            }
        }
        jSONObject.put(rg0.JUMP_URL, (Object) String.format(str2, Uri.encode(str)));
        return jSONObject;
    }

    public static boolean e(LiveItem liveItem, String str, String str2) {
        JSONArray b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac9a9a4", new Object[]{liveItem, str, str2})).booleanValue();
        }
        if (liveItem == null) {
            return false;
        }
        if ("全部".equals(str)) {
            return true;
        }
        if (TextUtils.isEmpty(liveItem.extendVal.itemCategoryIdList) || (b2 = fkx.b(liveItem.extendVal.itemCategoryIdList)) == null) {
            return false;
        }
        for (int i = 0; i < b2.size(); i++) {
            if (TextUtils.equals(b2.getString(i), str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b0ee4e0", new Object[]{liveItem})).booleanValue();
        }
        return (liveItem == null || (jSONObject = liveItem.itemExtData) == null || !"algo".equals(jSONObject.getString("smallCardItemType"))) ? false : true;
    }
}
