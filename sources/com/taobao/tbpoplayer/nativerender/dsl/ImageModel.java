package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.style.ImageStyleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImageModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    @JSONField(name = "isAnimate")
    public boolean isAnimate;
    @JSONField(name = "loopEndAction")
    public ActionModel loopEndAction;
    @JSONField(name = "loopEndActions")
    public List<ActionsItemModel> loopEndActions;
    @JSONField(name = "loopTimes")
    public int loopTimes;
    @JSONField(name = "style")
    public ImageStyleModel style;
    @JSONField(name = "url")
    public String url;

    static {
        t2o.a(790626450);
    }

    public static /* synthetic */ Object ipc$super(ImageModel imageModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/dsl/ImageModel");
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.url);
    }
}
