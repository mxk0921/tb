package com.alibaba.poplayer.config.model.style;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mg8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StyleModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = mg8.EVENT_DRAG)
    public boolean drag;
    @JSONField(name = "dragArea")
    public DragArea dragArea;
    @JSONField(name = "dragMode")
    public String dragMode;
    @JSONField(name = "height")
    public String height;
    @JSONField(name = "layout")
    public String layout;
    @JSONField(name = "offsetBottom")
    public String offsetBottom;
    @JSONField(name = "offsetLeft")
    public String offsetLeft;
    @JSONField(name = "offsetRight")
    public String offsetRight;
    @JSONField(name = "offsetTop")
    public String offsetTop;
    @JSONField(name = "width")
    public String width;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DragArea implements IModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "offsetBottom")
        public String offsetBottom;
        @JSONField(name = "offsetLeft")
        public String offsetLeft;
        @JSONField(name = "offsetRight")
        public String offsetRight;
        @JSONField(name = "offsetTop")
        public String offsetTop;

        static {
            t2o.a(625999901);
            t2o.a(625999896);
        }

        @Override // com.alibaba.poplayer.config.model.base.IModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(625999900);
        t2o.a(625999896);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.layout) || TextUtils.isEmpty(this.width) || TextUtils.isEmpty(this.height)) {
            return false;
        }
        return true;
    }
}
