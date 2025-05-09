package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qf6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEANCHORCARDACTION = 2913601765067462942L;

    static {
        t2o.a(295698937);
    }

    public static /* synthetic */ Object ipc$super(qf6 qf6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTaoLiveAnchorCardActionEventHandler");
    }

    public final boolean e() {
        AccountInfo accountInfo;
        AccountInfo accountInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8867c86", new Object[]{this})).booleanValue();
        }
        if (vx9.d() == null) {
            return false;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        FandomInfo B = up6.B(vx9.d());
        if (c0 != null && (accountInfo2 = c0.broadCaster) != null) {
            return accountInfo2.follow;
        }
        if (B == null || (accountInfo = B.broadCaster) == null) {
            return false;
        }
        return accountInfo.follow;
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

    public final void d(Object[] objArr, HashMap<String, String> hashMap, String str, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c526535", new Object[]{this, objArr, hashMap, str, xeaVar});
        } else if (kkr.i().o() != null) {
            Object obj = objArr[2];
            if (obj instanceof JSONObject) {
                hashMap.put("link_feed_id", ((JSONObject) obj).getString("liveId"));
            }
            hashMap.put("spm-cnt", "a2141.8001249");
            hashMap.put("sourceType", lca.b);
            hashMap.put("dynamic_type", str);
            if (xeaVar != null) {
                hashMap.put("spm-url", up6.U(xeaVar.q()));
            }
            kkr.i().o().c("LayerThickness_MiniProfile_GuideCast", hashMap);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        JSONObject jSONObject;
        String str;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
            return;
        }
        if (objArr != null && objArr.length > 0) {
            Context h = dXRuntimeContext.h();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (objArr.length > 4) {
                Object obj = objArr[4];
                if (obj instanceof String) {
                    hashMap2.putAll(op3.k((String) obj));
                }
            }
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                String str2 = (String) obj2;
                ux9 d = vx9.d();
                str = "UNFOLLOW";
                String C = d == null ? null : d.C();
                str2.hashCode();
                str = "NORMAL";
                String str3 = "0";
                switch (str2.hashCode()) {
                    case -1925818336:
                        if (str2.equals("chatGroupClicked")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1633213306:
                        if (str2.equals("reputationTagClicked")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1590527677:
                        if (str2.equals("widgetClicked")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1571649069:
                        if (str2.equals("openComponent")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1255161247:
                        if (str2.equals(rg0.JUMP_URL)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -888742219:
                        if (str2.equals("openGoodsContainer")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -365652245:
                        if (str2.equals("favoriteClicked")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1523202360:
                        if (str2.equals("openH5Url")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1737331510:
                        if (str2.equals("followClicked")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        o3s.d("DXTaoLiveAnchorCardActionEventHandler", "chatGroupClicked");
                        sjr.g().c("com.taobao.taolive.anchor_avatar_join_group", xeaVar, C);
                        return;
                    case 1:
                        sjr.g().c(uyg.EVENT_AVATAR_CARD__HIDE, "openReputationDetail", C);
                        break;
                    case 2:
                        if (objArr.length > 1) {
                            Object obj3 = objArr[1];
                            if (obj3 instanceof JSONObject) {
                                JSONObject jSONObject2 = (JSONObject) obj3;
                                String string = jSONObject2.getString("widgetJumpUrl");
                                boolean booleanValue = jSONObject2.getBooleanValue("installedWidget");
                                p3u.h(string, d, jSONObject2.getString("jumpType"), (AccountInfo.ComponentData) jSONObject2.getObject("componentData", AccountInfo.ComponentData.class), h);
                                HashMap<String, String> hashMap3 = new HashMap<>();
                                if (booleanValue) {
                                    str3 = "1";
                                }
                                hashMap3.put("addType", str3);
                                if (kkr.i().o() != null) {
                                    kkr.i().o().c("personal_anchorDesktop", hashMap3);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        ux9 ux9Var = null;
                        if (objArr.length > 1) {
                            Object obj4 = objArr[1];
                            if (obj4 instanceof String) {
                                String str4 = (String) obj4;
                                hashMap2.remove("componentName");
                                if (!hashMap2.containsKey("dxAction")) {
                                    hashMap2.put("dxAction", "unknown");
                                }
                                hashMap.putAll(hashMap2);
                                if (kkr.i().d() != null) {
                                    beb d2 = kkr.i().d();
                                    if (xeaVar != null) {
                                        ux9Var = xeaVar.q();
                                    }
                                    d2.o(ux9Var, h, str4, hashMap);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        if (objArr.length > 4) {
                            Object obj5 = objArr[4];
                            if (obj5 instanceof String) {
                                String str5 = (String) obj5;
                                o3s.d("DXTaoLiveAnchorCardActionEventHandler", "jumpUrl:" + objArr[4] + " " + str5);
                                if (!TextUtils.isEmpty(str5)) {
                                    Bundle bundle = new Bundle();
                                    if (!(vx9.d() == null || vx9.d().u() == null)) {
                                        bundle.putString("initMuteStatus", String.valueOf(vx9.d().u().j()));
                                    }
                                    Nav.from(h).withExtras(bundle).toUri(str5);
                                    sjr.g().c(uyg.EVENT_AVATAR_CARD__HIDE, null, C);
                                }
                                Object obj6 = objArr[3];
                                if (obj6 instanceof String) {
                                    String str6 = (String) obj6;
                                    HashMap<String, String> hashMap4 = new HashMap<>();
                                    if (!TextUtils.equals("shopClick", str6)) {
                                        if (!TextUtils.equals("playbackInfoClick", str6)) {
                                            if (!TextUtils.equals("videoClick", str6)) {
                                                if (!TextUtils.equals("preLiveInfoClick", str6)) {
                                                    if (TextUtils.equals("anchorSubscribeInfoClick", str6)) {
                                                        d(objArr, hashMap4, "subscribe", xeaVar);
                                                        break;
                                                    }
                                                } else {
                                                    d(objArr, hashMap4, "preview", xeaVar);
                                                    break;
                                                }
                                            } else {
                                                Object obj7 = objArr[2];
                                                if (obj7 instanceof JSONObject) {
                                                    hashMap4.put("type", ((JSONObject) obj7).getString("type"));
                                                }
                                                hashMap4.put("spm-cnt", "a2141.8001249");
                                                hashMap4.put("sourceType", lca.b);
                                                if (kkr.i().o() != null) {
                                                    kkr.i().o().c("LayerThickness_MiniProfile_FeedCard", hashMap4);
                                                    break;
                                                }
                                            }
                                        } else {
                                            d(objArr, hashMap4, "playback", xeaVar);
                                            break;
                                        }
                                    } else if (kkr.i().o() != null) {
                                        hashMap4.put("name", "shop");
                                        hashMap4.put("spm-cnt", "a2141.8001249");
                                        hashMap4.put("followDegree", e() ? str : str);
                                        hashMap4.put("sourceType", lca.b);
                                        kkr.i().o().c("LayerThickness_MiniProfile_GuideIcon", hashMap4);
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        if (hashMap2.containsKey("clickSource")) {
                            hashMap2.put("from", hashMap2.get("clickSource"));
                        }
                        hashMap.putAll(hashMap2);
                        d9m.n().getActionAdapter().g(xeaVar == null ? null : xeaVar.q(), uyg.EVENT_SHOW_GOODSPACKAGE, hashMap);
                        break;
                    case 6:
                        if (objArr.length > 1) {
                            sjr.g().c("com.taobao.taolive.anchor_avatar_favorite_changed", String.valueOf(((Boolean) objArr[1]).booleanValue()), C);
                        }
                        break;
                    case 7:
                        if (objArr.length > 3) {
                            Object obj8 = objArr[4];
                            if (obj8 instanceof String) {
                                String str7 = (String) obj8;
                                if (!TextUtils.isEmpty(str7)) {
                                    HashMap hashMap5 = new HashMap();
                                    hashMap5.put("x", str3);
                                    hashMap5.put("y", String.valueOf(0));
                                    hashMap5.put("width", String.valueOf(-1));
                                    hashMap5.put("height", "0.66");
                                    hashMap5.put("modal", "true");
                                    kkr.i().d().d(xeaVar == null ? null : xeaVar.q(), h, hashMap5, str7, "anchorCard");
                                    sjr.g().c(uyg.EVENT_AVATAR_CARD__HIDE, null, C);
                                }
                            }
                        }
                        break;
                    case '\b':
                        if (objArr.length > 1) {
                            sjr.g().c("com.taobao.taolive.anchor_avatar_follow_changed", String.valueOf(((Boolean) objArr[1]).booleanValue()), C);
                            return;
                        }
                        break;
                    default:
                        o3s.d("DXTaoLiveAnchorCardActionEventHandler", "no click type");
                        break;
                }
                if (objArr != null && objArr.length > 5) {
                    Object obj9 = objArr[5];
                    if ((obj9 instanceof JSONObject) && (jSONObject = (JSONObject) obj9) != null && jSONObject.containsKey("controlName")) {
                        try {
                            LiveAvatarInfoCardResponseData.GenerateParams generateParams = (LiveAvatarInfoCardResponseData.GenerateParams) jSONObject.toJavaObject(LiveAvatarInfoCardResponseData.GenerateParams.class);
                            if (kkr.i().o() != null && !TextUtils.isEmpty(generateParams.controlName)) {
                                HashMap<String, String> hashMap6 = new HashMap<>();
                                HashMap<String, String> hashMap7 = generateParams.params;
                                if (hashMap7 != null) {
                                    hashMap6.putAll(hashMap7);
                                }
                                hashMap6.put("spm-cnt", "a2141.8001249");
                                if (e()) {
                                }
                                hashMap6.put("followDegree", str);
                                hashMap6.put("sourceType", lca.b);
                                if (xeaVar != null) {
                                    hashMap6.put("spm-url", up6.U(xeaVar.q()));
                                }
                                kkr.i().o().c(generateParams.controlName, hashMap6);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            q0h.a("DXTaoLiveAnchorCardActionEventHandler", "parse error: " + e.getMessage());
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        str = "UNFOLLOW";
        str = "NORMAL";
        if (objArr != null) {
        }
    }
}
