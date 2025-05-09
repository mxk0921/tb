package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class acv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cbv f15668a;

    static {
        t2o.a(157286838);
        t2o.a(157286824);
        t2o.a(157286825);
    }

    public acv(cbv cbvVar) {
        this.f15668a = cbvVar;
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else {
            b(str, str2, e(jSONObject));
        }
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        return UltronTradeHybridSwitcherHelper.g(str);
    }

    public final void d(String str, JSONObject jSONObject, String str2) {
        List<bcv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdeb453", new Object[]{this, str, jSONObject, str2});
        } else if (!c(str, null)) {
            hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", str + " switcher is off");
        } else {
            cbv cbvVar = this.f15668a;
            if (cbvVar == null) {
                hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": mConfig is null");
                return;
            }
            hcv c = cbvVar.c(str);
            if (c == null || (list = c.d) == null) {
                hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": sceneModel or sceneModel.preRequestFrontEndModels is null");
                return;
            }
            for (bcv bcvVar : list) {
                if (bcvVar != null) {
                    if (!TextUtils.equals(bcvVar.b, str2)) {
                        hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": no match stage");
                    } else if (TextUtils.isEmpty(bcvVar.f16323a)) {
                        hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": frontEndUrl is empty");
                    } else {
                        mbv b = this.f15668a.b(bcvVar.f16323a);
                        if (b == null) {
                            hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": preRenderModel is null");
                        } else {
                            if (jSONObject != null && jSONObject.containsKey("context")) {
                                jSONObject.remove("context");
                            }
                            Object f = qbv.j().f(b.b);
                            if (f instanceof String) {
                                qbv.j().b(f, jSONObject);
                                hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": backgroundPreRenderInstance is not ready(instance is string)");
                            } else if (!(f instanceof a)) {
                                hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": backgroundPreRenderInstance is null");
                            } else {
                                a aVar = (a) f;
                                ybv a2 = ybv.a(aVar);
                                if (a2 == null || !a2.c()) {
                                    qbv.j().b(aVar, jSONObject);
                                    hav.d("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", "onFailure: " + str + "_" + str2 + ": backgroundPreRenderInstance is not ready");
                                } else {
                                    aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "trade.data.preload", jSONObject);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return lbv.o(jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(String str, String str2, JSONObject jSONObject) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122b7611", new Object[]{this, str, str2, jSONObject});
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2096025532:
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                if (str.equals(str4)) {
                    c = 0;
                    break;
                }
                break;
            case -1701402653:
                str3 = UltronTradeHybridStage.ON_NAV;
                boolean equals = str.equals(UltronTradeHybridStage.ON_VIEW_SCROLL_END);
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                if (equals) {
                    c = 1;
                    break;
                }
                break;
            case -1012605245:
                if (str.equals(UltronTradeHybridStage.ON_NAV)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 2;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case -961315111:
                if (str.equals(UltronTradeHybridStage.ON_RENDER_START)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 3;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case -359179046:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_CREATE)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 4;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 58688523:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 5;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 72234379:
                if (str.equals(UltronTradeHybridStage.ON_MTOP_START)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 6;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 263594596:
                if (str.equals(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 7;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 285075351:
                if (str.equals(UltronTradeHybridStage.ON_DATA_PRE_LOAD)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = '\b';
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 776409915:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLLING)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = '\t';
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 1093956882:
                if (str.equals(UltronTradeHybridStage.ON_RENDER_END)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = '\n';
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            case 1347699050:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLL_START)) {
                    str3 = UltronTradeHybridStage.ON_NAV;
                    str4 = UltronTradeHybridStage.ON_MTOP_END;
                    c = 11;
                    break;
                }
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
            default:
                str3 = UltronTradeHybridStage.ON_NAV;
                str4 = UltronTradeHybridStage.ON_MTOP_END;
                break;
        }
        switch (c) {
            case 0:
                d(str2, jSONObject, str4);
                return;
            case 1:
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    hav.g("UltronTradeHybridPreRequestFrontEndManager", "ON_VIEW_SCROLL_END", "view is null");
                    return;
                } else {
                    d(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLL_END);
                    return;
                }
            case 2:
                d(str2, jSONObject, str3);
                return;
            case 3:
                d(str2, jSONObject, UltronTradeHybridStage.ON_RENDER_START);
                return;
            case 4:
                d(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_CREATE);
                return;
            case 5:
                d(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_RESUME);
                return;
            case 6:
                d(str2, jSONObject, UltronTradeHybridStage.ON_MTOP_START);
                return;
            case 7:
                d(str2, jSONObject, UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER);
                return;
            case '\b':
                d(str2, jSONObject, UltronTradeHybridStage.ON_DATA_PRE_LOAD);
                return;
            case '\t':
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    hav.g("UltronTradeHybridPreRequestFrontEndManager", "ON_VIEW_SCROLLING", "view is null");
                    return;
                } else {
                    d(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLLING);
                    return;
                }
            case '\n':
                d(str2, jSONObject, UltronTradeHybridStage.ON_RENDER_END);
                return;
            case 11:
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    hav.g("UltronTradeHybridPreRequestFrontEndManager", "ON_VIEW_SCROLL_START", "view is null");
                    return;
                } else {
                    d(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLL_START);
                    return;
                }
            default:
                hav.g("UltronTradeHybridPreRequestFrontEndManager", "onStage", "unknown stage");
                return;
        }
    }
}
