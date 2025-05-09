package com.taobao.message.lab.comfrm.inner2.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.SlotInstance;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LayoutInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bindData;
    @Deprecated
    public Map<String, SlotInstance> children;
    @Deprecated
    public Map<String, String> data;
    public Map<String, List<EventHandlerItem>> eventHandler;
    public RenderTemplate renderTemplate;
    @Deprecated
    public Map<String, Object> style;
    public String uniqueId;
    public UserTrackInfo userTrack;
    public String version;

    static {
        t2o.a(537919681);
    }

    public LayoutInfo copy(Map<String, List<EventHandlerItem>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInfo) ipChange.ipc$dispatch("2c7f2178", new Object[]{this, map});
        }
        LayoutInfo layoutInfo = new LayoutInfo();
        layoutInfo.uniqueId = this.uniqueId;
        layoutInfo.version = this.version;
        layoutInfo.renderTemplate = this.renderTemplate;
        layoutInfo.eventHandler = map;
        layoutInfo.userTrack = this.userTrack;
        layoutInfo.bindData = this.bindData;
        layoutInfo.data = this.data;
        layoutInfo.children = this.children;
        layoutInfo.style = this.style;
        return layoutInfo;
    }
}
