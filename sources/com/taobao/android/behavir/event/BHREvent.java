package com.taobao.android.behavir.event;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import java.util.Map;
import tb.f6i;
import tb.hqv;
import tb.ly1;
import tb.t2o;
import tb.y78;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BHREvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionArgs;
    public JSONObject actionArgsJSON;
    public long actionDuration;
    public String actionName;
    public String actionType;
    public Map<String, Object> bizArgKVMapObject;
    public String bizArgs;
    public Map<String, String> bizArgsMap;
    public String bizId;
    public boolean cacheAbleOnInit;
    public long createTime;
    public int destroy;
    public String fromScene;
    private boolean isExcludeToHistoryEventList;
    public int isFirstEnter;
    public String itemId;
    private f6i mMatchModel;
    public String periodSessionId;
    public String reserve1;
    public String reserve2;
    public String scene;
    public long seqId;
    public String sessionId;
    public String toScene;
    public long updateTime;
    public String userId;

    static {
        t2o.a(404750370);
    }

    public BHREvent(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, false);
    }

    public static BHREvent buildInternalEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("7623363", new Object[]{str, str2, str3}) : buildInternalEvent(str, str2, str3, false);
    }

    private String getItemId(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c56dd8c6", new Object[]{this, map});
        }
        if (map != null) {
            return map.get("item_id");
        }
        return "";
    }

    private long getScrollDuration(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e4a2926", new Object[]{this, jSONObject})).longValue();
        }
        if (jSONObject == null) {
            return 0L;
        }
        return jSONObject.getLongValue("scrollDuration");
    }

    public f6i genMatchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6i) ipChange.ipc$dispatch("5e2a24cb", new Object[]{this});
        }
        f6i f6iVar = new f6i();
        f6iVar.f19049a = this.scene;
        f6iVar.c = this.actionName;
        f6iVar.b = this.actionType;
        f6iVar.g = this.bizArgKVMapObject;
        return f6iVar;
    }

    public f6i getMatchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6i) ipChange.ipc$dispatch("13873e51", new Object[]{this});
        }
        if (this.mMatchModel == null) {
            this.mMatchModel = genMatchModel();
        }
        return this.mMatchModel;
    }

    public boolean isExcludeToHistoryEventList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb7db3a", new Object[]{this})).booleanValue();
        }
        return this.isExcludeToHistoryEventList;
    }

    public void setExcludeToHistoryEventList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4557b96", new Object[]{this, new Boolean(z)});
        } else {
            this.isExcludeToHistoryEventList = z;
        }
    }

    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f8765c9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject(32);
        jSONObject.put("seqId", (Object) Long.valueOf(this.seqId));
        jSONObject.put("sessionId", (Object) this.sessionId);
        jSONObject.put("bizId", (Object) this.bizId);
        jSONObject.put("scene", (Object) this.scene);
        jSONObject.put("createTime", (Object) Long.valueOf(this.createTime));
        jSONObject.put(StWindow.UPDATE_TIME, (Object) Long.valueOf(this.updateTime));
        jSONObject.put("userId", (Object) this.userId);
        jSONObject.put("actionType", (Object) this.actionType);
        jSONObject.put("actionName", (Object) this.actionName);
        jSONObject.put("actionDuration", (Object) Long.valueOf(this.actionDuration));
        jSONObject.put("actionArgs", (Object) this.actionArgs);
        jSONObject.put("fromScene", (Object) this.fromScene);
        jSONObject.put("toScene", (Object) this.toScene);
        jSONObject.put("actionArgsJSON", (Object) this.actionArgsJSON);
        jSONObject.put("destroy", (Object) Integer.valueOf(this.destroy));
        jSONObject.put(yj4.PARAM_IS_FIRST_ENTER, (Object) Integer.valueOf(this.isFirstEnter));
        jSONObject.put("cacheAbleOnInit", (Object) Boolean.valueOf(this.cacheAbleOnInit));
        Map<String, Object> map = this.bizArgKVMapObject;
        if (map == null || map.isEmpty()) {
            jSONObject.put("bizArgsMap", (Object) this.bizArgsMap);
        } else {
            jSONObject.put("bizArgsMap", (Object) this.bizArgKVMapObject);
        }
        return jSONObject;
    }

    private BHREvent(String str, String str2, String str3, String str4, boolean z) {
        this.seqId = -1L;
        this.sessionId = "";
        this.bizId = "";
        this.createTime = 0L;
        this.updateTime = 0L;
        this.userId = "";
        this.actionDuration = 0L;
        this.fromScene = "";
        this.toScene = "";
        this.reserve1 = null;
        this.reserve2 = null;
        this.periodSessionId = null;
        this.bizArgsMap = null;
        this.bizArgs = null;
        this.itemId = null;
        this.isFirstEnter = 0;
        this.destroy = 0;
        this.bizArgKVMapObject = null;
        this.mMatchModel = null;
        this.isExcludeToHistoryEventList = false;
        this.scene = str;
        this.actionName = str2;
        this.actionType = str4;
        this.sessionId = Utils.k(str3);
        this.cacheAbleOnInit = z;
        this.createTime = System.currentTimeMillis();
    }

    public static BHREvent buildInternalEvent(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("37b9cccf", new Object[]{str, str2, str3, new Boolean(z)}) : new BHREvent(str, str2, str3, "internal", z);
    }

    private void assign(ly1 ly1Var) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f68b5e", new Object[]{this, ly1Var});
            return;
        }
        this.seqId = ly1Var.f23634a;
        this.sessionId = ly1Var.b;
        this.bizId = ly1Var.c;
        this.scene = ly1Var.d;
        this.createTime = ly1Var.e;
        this.updateTime = ly1Var.f;
        this.userId = ly1Var.g;
        this.actionType = ly1Var.h;
        this.actionName = ly1Var.i;
        this.actionArgs = ly1Var.k;
        this.actionDuration = ly1Var.j;
        this.fromScene = ly1Var.m;
        this.toScene = ly1Var.n;
        this.reserve1 = ly1Var.o;
        this.reserve2 = ly1Var.p;
        this.periodSessionId = ly1Var.q;
        String str = ly1Var.l;
        this.bizArgs = str;
        this.bizArgsMap = hqv.g(hqv.q(str).split(","));
        this.bizArgKVMapObject = ly1Var.u;
        JSONObject jSONObject = ly1Var.r;
        this.actionArgsJSON = jSONObject;
        this.isFirstEnter = ly1Var.s ? 1 : 0;
        this.sessionId = ly1Var.b;
        if (jSONObject == null || !jSONObject.getBooleanValue("destroy")) {
            i = 0;
        }
        this.destroy = i;
        this.itemId = getItemId(this.bizArgsMap);
        addBrMark();
    }

    public void addBrMark() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e413cc5", new Object[]{this});
            return;
        }
        Map map = this.bizArgKVMapObject;
        if (map == null) {
            map = this.bizArgsMap;
        }
        if (map != null) {
            map.put("br_destroy", String.valueOf(this.destroy != 0));
            if (this.isFirstEnter != 0) {
                z = true;
            }
            map.put("br_isFirstEnter", String.valueOf(z));
            map.put("br_fromScene", this.fromScene);
            map.put("br_toScene", this.toScene);
            if (this instanceof BHRScrollEvent) {
                if (getScrollDuration(this.actionArgsJSON) == 0) {
                    map.put("br_scrollType", "scrollStart");
                } else {
                    map.put("br_scrollType", "scrollEnd");
                }
            }
            map.put("br_editionCode", y78.a());
        }
    }

    public boolean isColdStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4992905f", new Object[]{this})).booleanValue();
        }
        return "internal".equals(this.actionType) && "coldStart".equals(this.actionName);
    }

    public boolean isInitEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa5ddeb", new Object[]{this})).booleanValue();
        }
        return "sdkInit".equals(this.actionName) && "internal".equals(this.actionType);
    }

    public BHREvent() {
        this.seqId = -1L;
        this.sessionId = "";
        this.bizId = "";
        this.scene = "";
        this.createTime = 0L;
        this.updateTime = 0L;
        this.userId = "";
        this.actionType = "";
        this.actionName = "";
        this.actionDuration = 0L;
        this.fromScene = "";
        this.toScene = "";
        this.reserve1 = null;
        this.reserve2 = null;
        this.periodSessionId = null;
        this.bizArgsMap = null;
        this.bizArgs = null;
        this.itemId = null;
        this.isFirstEnter = 0;
        this.destroy = 0;
        this.bizArgKVMapObject = null;
        this.mMatchModel = null;
        this.isExcludeToHistoryEventList = false;
    }

    public BHREvent(ly1 ly1Var) {
        this.seqId = -1L;
        this.sessionId = "";
        this.bizId = "";
        this.scene = "";
        this.createTime = 0L;
        this.updateTime = 0L;
        this.userId = "";
        this.actionType = "";
        this.actionName = "";
        this.actionDuration = 0L;
        this.fromScene = "";
        this.toScene = "";
        this.reserve1 = null;
        this.reserve2 = null;
        this.periodSessionId = null;
        this.bizArgsMap = null;
        this.bizArgs = null;
        this.itemId = null;
        this.isFirstEnter = 0;
        this.destroy = 0;
        this.bizArgKVMapObject = null;
        this.mMatchModel = null;
        this.isExcludeToHistoryEventList = false;
        assign(ly1Var);
    }
}
