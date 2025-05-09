package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.kkr;
import tb.t2o;
import tb.xea;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ButtonStateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum ButtonState {
        DOWN_SHELF("1"),
        VIP_BUY("2"),
        TIME_SHELF("3"),
        PRE_SALE_PREHEATING("4"),
        SINGLE_DEFAULT("6"),
        SINGLE_DEFAULT_NEWBUY("7"),
        PRE_SALE_DEPOSIT("8");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String value;

        ButtonState(String str) {
            this.value = str;
        }

        public static /* synthetic */ String access$000(ButtonState buttonState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b59f454e", new Object[]{buttonState});
            }
            return buttonState.value;
        }

        public static /* synthetic */ Object ipc$super(ButtonState buttonState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/ButtonStateHelper$ButtonState");
        }

        public static ButtonState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ButtonState) ipChange.ipc$dispatch("636aa7d2", new Object[]{str});
            }
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }
    }

    static {
        t2o.a(295699327);
    }

    public void a(xea xeaVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825ed340", new Object[]{this, xeaVar, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (jSONObject != null) {
            jSONObject.put("native_buttonStatus", (Object) d(xeaVar, jSONObject, z, z2));
        }
    }

    public void b(xea xeaVar, LiveItem liveItem, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1aa0b", new Object[]{this, xeaVar, liveItem, new Boolean(z), new Boolean(z2)});
        } else if (liveItem != null) {
            liveItem.native_buttonStatus = e(xeaVar, liveItem, z, z2);
        }
    }

    public final String d(xea xeaVar, JSONObject jSONObject, boolean z, boolean z2) {
        ButtonState buttonState;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a26547a4", new Object[]{this, xeaVar, jSONObject, new Boolean(z), new Boolean(z2)});
        }
        if (jSONObject == null) {
            return ButtonState.access$000(ButtonState.SINGLE_DEFAULT);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("liveItemStatusData");
        if (jSONObject3 != null && (jSONObject3.getBooleanValue("isDownShelf") || jSONObject3.getBooleanValue("isGray"))) {
            return ButtonState.access$000(ButtonState.DOWN_SHELF);
        }
        if (kkr.i().m(xeaVar) != 0 && !kkr.i().r(xeaVar) && z2 && (jSONObject2 = jSONObject.getJSONObject("extendVal")) != null) {
            String string = jSONObject2.getString("liveItemBizTags");
            if (!TextUtils.isEmpty(string) && (string.contains("vipFirst") || string.contains("vipBuyGift"))) {
                return ButtonState.access$000(ButtonState.VIP_BUY);
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("itemExtData");
        if (jSONObject4 != null) {
            if (TextUtils.equals("0", jSONObject4.getString("timingUpShelfStatus")) && yga.Q()) {
                return ButtonState.access$000(ButtonState.TIME_SHELF);
            }
            String string2 = jSONObject4.getString("preSaleStatus");
            if (TextUtils.equals("0", string2)) {
                return ButtonState.access$000(ButtonState.PRE_SALE_PREHEATING);
            }
            if (TextUtils.equals("1", string2)) {
                return ButtonState.access$000(ButtonState.PRE_SALE_DEPOSIT);
            }
        }
        if (z) {
            buttonState = ButtonState.SINGLE_DEFAULT_NEWBUY;
        } else {
            buttonState = ButtonState.SINGLE_DEFAULT;
        }
        return ButtonState.access$000(buttonState);
    }

    public final String e(xea xeaVar, LiveItem liveItem, boolean z, boolean z2) {
        ButtonState buttonState;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3735231", new Object[]{this, xeaVar, liveItem, new Boolean(z), new Boolean(z2)});
        }
        if (liveItem == null) {
            return ButtonState.access$000(ButtonState.SINGLE_DEFAULT);
        }
        JSONObject jSONObject = liveItem.liveItemStatusData;
        if (jSONObject != null && (jSONObject.getBooleanValue("isDownShelf") || liveItem.liveItemStatusData.getBooleanValue("isGray"))) {
            return ButtonState.access$000(ButtonState.DOWN_SHELF);
        }
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null && (str = ext.liveItemBizTags) != null && ((str.contains("vipFirst") || liveItem.extendVal.liveItemBizTags.contains("vipBuyGift")) && kkr.i().m(xeaVar) != 0 && !kkr.i().r(xeaVar) && z2)) {
            return ButtonState.access$000(ButtonState.VIP_BUY);
        }
        JSONObject jSONObject2 = liveItem.itemExtData;
        if (jSONObject2 != null) {
            if (TextUtils.equals("0", jSONObject2.getString("timingUpShelfStatus")) && yga.Q()) {
                return ButtonState.access$000(ButtonState.TIME_SHELF);
            }
            String string = liveItem.itemExtData.getString("preSaleStatus");
            if (TextUtils.equals("0", string)) {
                return ButtonState.access$000(ButtonState.PRE_SALE_PREHEATING);
            }
            if (TextUtils.equals("1", string)) {
                return ButtonState.access$000(ButtonState.PRE_SALE_DEPOSIT);
            }
        }
        if (z) {
            buttonState = ButtonState.SINGLE_DEFAULT_NEWBUY;
        } else {
            buttonState = ButtonState.SINGLE_DEFAULT;
        }
        return ButtonState.access$000(buttonState);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ad7a90b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("nbButton", str) || TextUtils.equals("twoButton", str);
    }
}
