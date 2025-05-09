package com.taobao.android.turbo.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.p3h;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b,\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R$\u0010)\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001b\u001a\u0004\bA\u0010\u001d\"\u0004\bB\u0010\u001fR\"\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010GR$\u0010H\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0011\u001a\u0004\bI\u0010\u0013\"\u0004\bJ\u0010\u0015R$\u0010K\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0011\u001a\u0004\bL\u0010\u0013\"\u0004\bM\u0010\u0015R$\u0010N\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0011\u001a\u0004\bO\u0010\u0013\"\u0004\bP\u0010\u0015R$\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0011\u001a\u0004\bR\u0010\u0013\"\u0004\bS\u0010\u0015R\"\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010D\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010GR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\u001b\u001a\u0004\bX\u0010\u001d\"\u0004\bY\u0010\u001fR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u001b\u001a\u0004\b[\u0010\u001d\"\u0004\b\\\u0010\u001fR$\u0010]\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0011\u001a\u0004\b^\u0010\u0013\"\u0004\b_\u0010\u0015R\"\u0010`\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010D\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010G¨\u0006e"}, d2 = {"Lcom/taobao/android/turbo/model/RedpointModel;", "", "<init>", "()V", "", "isSingleTabIconMode", "()Z", "isIconMode", "Lcom/taobao/android/turbo/model/PrefetchModel;", "prefetchModel", "Lcom/taobao/android/turbo/model/PrefetchModel;", "getPrefetchModel", "()Lcom/taobao/android/turbo/model/PrefetchModel;", "setPrefetchModel", "(Lcom/taobao/android/turbo/model/PrefetchModel;)V", "", "iconStreamReceiver", "Ljava/lang/String;", "getIconStreamReceiver", "()Ljava/lang/String;", "setIconStreamReceiver", "(Ljava/lang/String;)V", "iconStreams", "getIconStreams", "setIconStreams", "", "passLongParam", "Ljava/util/Map;", "getPassLongParam", "()Ljava/util/Map;", "setPassLongParam", "(Ljava/util/Map;)V", "subTabInfo", "getSubTabInfo", "setSubTabInfo", "clientReceiverData", "getClientReceiverData", "setClientReceiverData", "clientReceiverPage", "getClientReceiverPage", "setClientReceiverPage", "clientReceiverPit", "getClientReceiverPit", "setClientReceiverPit", "utParams", "getUtParams", "setUtParams", "Lcom/alibaba/fastjson/JSONObject;", p3h.KEY_PAGE_UT_PARAMS, "Lcom/alibaba/fastjson/JSONObject;", "getPageUtParams", "()Lcom/alibaba/fastjson/JSONObject;", "setPageUtParams", "(Lcom/alibaba/fastjson/JSONObject;)V", "globalUtParams", "getGlobalUtParams", "setGlobalUtParams", "", "lightDuration", TLogTracker.LEVEL_INFO, "getLightDuration", "()I", "setLightDuration", "(I)V", "top", "getTop", "setTop", "linkSwitch", "Z", "getLinkSwitch", "setLinkSwitch", "(Z)V", "picUrl", "getPicUrl", "setPicUrl", "picMode", "getPicMode", "setPicMode", "contentMode", "getContentMode", "setContentMode", "frameType", "getFrameType", "setFrameType", "liveAnimation", "getLiveAnimation", "setLiveAnimation", "card", "getCard", "setCard", "topRight", "getTopRight", "setTopRight", "tabbarItemTitle", "getTabbarItemTitle", "setTabbarItemTitle", "hitLTV", "getHitLTV", "setHitLTV", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RedpointModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Map<String, String> card;
    private Map<String, String> clientReceiverData;
    private String clientReceiverPage;
    private String clientReceiverPit;
    private String contentMode;
    private String frameType;
    private JSONObject globalUtParams;
    private boolean hitLTV;
    private String iconStreamReceiver;
    private String iconStreams;
    private int lightDuration = 4000;
    private boolean linkSwitch;
    private boolean liveAnimation;
    private JSONObject pageUtParams;
    private Map<String, String> passLongParam;
    private String picMode;
    private String picUrl;
    private PrefetchModel prefetchModel;
    private Map<String, String> subTabInfo;
    private String tabbarItemTitle;
    private Map<String, String> top;
    private Map<String, String> topRight;
    private Map<String, String> utParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455483);
        }

        public a() {
        }

        public final String a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1a6c2afb", new Object[]{this, map});
            }
            List<TabModel> a2 = TabModel.Companion.a(map.get("topTabConfigs"));
            String str = "video";
            if (a2 != null) {
                for (TabModel tabModel : a2) {
                    if (tabModel.getSelected()) {
                        str = tabModel.getId();
                    }
                }
            }
            return str;
        }

        public final RedpointModel b(Map<String, ? extends Object> map) {
            String str;
            Map<String, String> clientConfig;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RedpointModel) ipChange.ipc$dispatch("7a879e1e", new Object[]{this, map});
            }
            ckf.g(map, "data");
            RedpointModel redpointModel = (RedpointModel) JSON.toJavaObject((JSONObject) map, RedpointModel.class);
            Object obj = map.get("preloadingDTO");
            if (obj != null && (obj instanceof JSONObject)) {
                redpointModel.setPrefetchModel((PrefetchModel) JSON.toJavaObject((JSON) obj, PrefetchModel.class));
            }
            PrefetchModel prefetchModel = redpointModel.getPrefetchModel();
            if (!(prefetchModel == null || (clientConfig = prefetchModel.getClientConfig()) == null)) {
                clientConfig.put("enable", "true");
            }
            String clientReceiverPage = redpointModel.getClientReceiverPage();
            if (ckf.b(clientReceiverPage, "defaultselected")) {
                clientReceiverPage = a(map);
            } else if (ckf.b(clientReceiverPage, "recommend")) {
                clientReceiverPage = "home";
            }
            redpointModel.setClientReceiverPage(clientReceiverPage);
            if (redpointModel.getClientReceiverPit() != null) {
                String clientReceiverPit = redpointModel.getClientReceiverPit();
                ckf.d(clientReceiverPit);
                if (clientReceiverPit.length() > 0) {
                    str = redpointModel.getClientReceiverPit();
                    ckf.d(str);
                    redpointModel.setClientReceiverPit(str);
                    return redpointModel;
                }
            }
            if (ckf.b(redpointModel.getIconStreamReceiver(), "tab")) {
                str = "tabbar";
            } else {
                str = "list";
            }
            redpointModel.setClientReceiverPit(str);
            return redpointModel;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455482);
    }

    private final boolean isSingleTabIconMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14e2c40a", new Object[]{this})).booleanValue();
        }
        if (this.picUrl == null && this.top == null && this.topRight == null) {
            return false;
        }
        return true;
    }

    public final Map<String, String> getCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("649fec82", new Object[]{this});
        }
        return this.card;
    }

    public final Map<String, String> getClientReceiverData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3302bb96", new Object[]{this});
        }
        return this.clientReceiverData;
    }

    public final String getClientReceiverPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ebe81da", new Object[]{this});
        }
        return this.clientReceiverPage;
    }

    public final String getClientReceiverPit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("689fe42e", new Object[]{this});
        }
        return this.clientReceiverPit;
    }

    public final String getContentMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82dc1a33", new Object[]{this});
        }
        return this.contentMode;
    }

    public final String getFrameType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e7a408", new Object[]{this});
        }
        return this.frameType;
    }

    public final JSONObject getGlobalUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4bb56f65", new Object[]{this});
        }
        return this.globalUtParams;
    }

    public final boolean getHitLTV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56b29e5c", new Object[]{this})).booleanValue();
        }
        return this.hitLTV;
    }

    public final String getIconStreamReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c938f55b", new Object[]{this});
        }
        return this.iconStreamReceiver;
    }

    public final String getIconStreams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bae2c075", new Object[]{this});
        }
        return this.iconStreams;
    }

    public final int getLightDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72cf078e", new Object[]{this})).intValue();
        }
        return this.lightDuration;
    }

    public final boolean getLinkSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7deaa4f", new Object[]{this})).booleanValue();
        }
        return this.linkSwitch;
    }

    public final boolean getLiveAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff423cd", new Object[]{this})).booleanValue();
        }
        return this.liveAnimation;
    }

    public final JSONObject getPageUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec2521d1", new Object[]{this});
        }
        return this.pageUtParams;
    }

    public final Map<String, String> getPassLongParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4a1192a6", new Object[]{this});
        }
        return this.passLongParam;
    }

    public final String getPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad3aed42", new Object[]{this});
        }
        return this.picMode;
    }

    public final String getPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this});
        }
        return this.picUrl;
    }

    public final PrefetchModel getPrefetchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrefetchModel) ipChange.ipc$dispatch("6fa0d19a", new Object[]{this});
        }
        return this.prefetchModel;
    }

    public final Map<String, String> getSubTabInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9429e1b5", new Object[]{this});
        }
        return this.subTabInfo;
    }

    public final String getTabbarItemTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34d14588", new Object[]{this});
        }
        return this.tabbarItemTitle;
    }

    public final Map<String, String> getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dd3766db", new Object[]{this});
        }
        return this.top;
    }

    public final Map<String, String> getTopRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7080479", new Object[]{this});
        }
        return this.topRight;
    }

    public final Map<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        return this.utParams;
    }

    public final boolean isIconMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f043e91", new Object[]{this})).booleanValue();
        }
        return isSingleTabIconMode();
    }

    public final void setCard(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4f304c", new Object[]{this, map});
        } else {
            this.card = map;
        }
    }

    public final void setClientReceiverData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7da8b8", new Object[]{this, map});
        } else {
            this.clientReceiverData = map;
        }
    }

    public final void setClientReceiverPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce374dc", new Object[]{this, str});
        } else {
            this.clientReceiverPage = str;
        }
    }

    public final void setClientReceiverPit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8dba970", new Object[]{this, str});
        } else {
            this.clientReceiverPit = str;
        }
    }

    public final void setContentMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05e5b0b", new Object[]{this, str});
        } else {
            this.contentMode = str;
        }
    }

    public final void setFrameType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164a98d6", new Object[]{this, str});
        } else {
            this.frameType = str;
        }
    }

    public final void setGlobalUtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c359eebf", new Object[]{this, jSONObject});
        } else {
            this.globalUtParams = jSONObject;
        }
    }

    public final void setHitLTV(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160752f0", new Object[]{this, new Boolean(z)});
        } else {
            this.hitLTV = z;
        }
    }

    public final void setIconStreamReceiver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b7717b", new Object[]{this, str});
        } else {
            this.iconStreamReceiver = str;
        }
    }

    public final void setIconStreams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b92c7d09", new Object[]{this, str});
        } else {
            this.iconStreams = str;
        }
    }

    public final void setLightDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3de0d4", new Object[]{this, new Integer(i)});
        } else {
            this.lightDuration = i;
        }
    }

    public final void setLinkSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3acdeb5d", new Object[]{this, new Boolean(z)});
        } else {
            this.linkSwitch = z;
        }
    }

    public final void setLiveAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc8a37", new Object[]{this, new Boolean(z)});
        } else {
            this.liveAnimation = z;
        }
    }

    public final void setPageUtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dbdd6d3", new Object[]{this, jSONObject});
        } else {
            this.pageUtParams = jSONObject;
        }
    }

    public final void setPassLongParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20b6640", new Object[]{this, map});
        } else {
            this.passLongParam = map;
        }
    }

    public final void setPicMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12643dc", new Object[]{this, str});
        } else {
            this.picMode = str;
        }
    }

    public final void setPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0599d8", new Object[]{this, str});
        } else {
            this.picUrl = str;
        }
    }

    public final void setPrefetchModel(PrefetchModel prefetchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6e15de", new Object[]{this, prefetchModel});
        } else {
            this.prefetchModel = prefetchModel;
        }
    }

    public final void setSubTabInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b16fa79", new Object[]{this, map});
        } else {
            this.subTabInfo = map;
        }
    }

    public final void setTabbarItemTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7f4056", new Object[]{this, str});
        } else {
            this.tabbarItemTitle = str;
        }
    }

    public final void setTop(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bab7ab", new Object[]{this, map});
        } else {
            this.top = map;
        }
    }

    public final void setTopRight(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d23d35", new Object[]{this, map});
        } else {
            this.topRight = map;
        }
    }

    public final void setUtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6666a537", new Object[]{this, map});
        } else {
            this.utParams = map;
        }
    }
}
