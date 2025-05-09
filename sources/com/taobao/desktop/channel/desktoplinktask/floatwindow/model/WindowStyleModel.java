package com.taobao.desktop.channel.desktoplinktask.floatwindow.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mg8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WindowStyleModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "absorb")
    public boolean absorb;
    @JSONField(name = "absorbAnimDuration")
    public long absorbAnimDuration;
    @JSONField(name = "absorbArea")
    public Area absorbArea;
    @JSONField(name = mg8.EVENT_DRAG)
    public boolean drag;
    @JSONField(name = "dragArea")
    public Area dragArea;
    @JSONField(name = "dragWall")
    public boolean dragWall;
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Area implements IModel {
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
            t2o.a(435159088);
            t2o.a(435159086);
        }

        @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.model.IModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(435159087);
        t2o.a(435159086);
    }

    @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.model.IModel
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
