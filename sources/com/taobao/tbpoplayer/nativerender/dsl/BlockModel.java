package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BlockModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    @JSONField(name = "alignItems")
    public String alignItems;
    @JSONField(name = "blockLayout")
    public String blockLayout;
    @JSONField(name = "children")
    public List<JSONObject> children;
    @JSONField(name = "flexDirection")
    public String flexDirection;
    @JSONField(name = "justifyContent")
    public String justifyContent;
    @JSONField(name = "style")
    public StyleModel style;

    static {
        t2o.a(790626438);
    }

    public static /* synthetic */ Object ipc$super(BlockModel blockModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/dsl/BlockModel");
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        List<JSONObject> list = this.children;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
