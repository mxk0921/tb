package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopCloseBtnModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    @JSONField(name = "alignLeftStateMargin")
    public int alignLeftStateMargin;
    @JSONField(name = "alignScreenRightMargin")
    public int alignScreenRightMargin;
    @JSONField(name = "alignScreenTopMargin")
    public int alignScreenTopMargin;
    @JSONField(name = "belowStateMargin")
    public int belowStateMargin;
    @JSONField(name = "style")
    public StyleModel style;
    @JSONField(name = "url")
    public String url;

    static {
        t2o.a(790626452);
    }

    public static /* synthetic */ Object ipc$super(PopCloseBtnModel popCloseBtnModel, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/dsl/PopCloseBtnModel");
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!super.isValid() || TextUtils.isEmpty(this.url)) {
            return false;
        }
        return true;
    }
}
