package com.taobao.themis.external.embed;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import org.android.agoo.common.AgooConstants;
import tb.gj8;
import tb.t2o;
import tb.uqx;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006&"}, d2 = {"Lcom/taobao/themis/external/embed/TMSWidgetInfo;", "Ljava/io/Serializable;", "()V", gj8.CONFIG_DATA_KEY, "", "getConfigData", "()Ljava/lang/String;", "setConfigData", "(Ljava/lang/String;)V", AgooConstants.MESSAGE_EXT, "getExtData", "setExtData", "metaInfo", uqx.ZIM_IDENTIFY_GET_META_INFO, "setMetaInfo", "relationUrl", "getRelationUrl", "setRelationUrl", "viewConfig", "Lcom/taobao/themis/external/embed/TMSWidgetInfo$ViewConfig;", "getViewConfig", "()Lcom/taobao/themis/external/embed/TMSWidgetInfo$ViewConfig;", "setViewConfig", "(Lcom/taobao/themis/external/embed/TMSWidgetInfo$ViewConfig;)V", "widgetDataId", "getWidgetDataId", "setWidgetDataId", "widgetId", "", "getWidgetId", "()Ljava/lang/Long;", "setWidgetId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "widgetVersion", "getWidgetVersion", "setWidgetVersion", "ViewConfig", "themis_interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String configData;
    private String extData;
    private String metaInfo;
    @JSONField(name = "url")
    private String relationUrl;
    private ViewConfig viewConfig;
    private String widgetDataId;
    private Long widgetId;
    private String widgetVersion;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/external/embed/TMSWidgetInfo$ViewConfig;", "Ljava/io/Serializable;", "()V", "alignment", "", "getAlignment", "()Ljava/lang/String;", "setAlignment", "(Ljava/lang/String;)V", "height", "getHeight", "setHeight", "widgetDegradePic", "getWidgetDegradePic", "setWidgetDegradePic", "width", "getWidth", "setWidth", "themis_interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class ViewConfig implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String alignment;
        private String height;
        private String widgetDegradePic;
        private String width;

        static {
            t2o.a(838860819);
        }

        public final String getAlignment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("52f9c9ec", new Object[]{this});
            }
            return this.alignment;
        }

        public final String getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f6ba1efc", new Object[]{this});
            }
            return this.height;
        }

        public final String getWidgetDegradePic() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("21f0892b", new Object[]{this});
            }
            return this.widgetDegradePic;
        }

        public final String getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dfb784e9", new Object[]{this});
            }
            return this.width;
        }

        public final void setAlignment(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e7d2f72", new Object[]{this, str});
            } else {
                this.alignment = str;
            }
        }

        public final void setHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8033adfa", new Object[]{this, str});
            } else {
                this.height = str;
            }
        }

        public final void setWidgetDegradePic(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58632aab", new Object[]{this, str});
            } else {
                this.widgetDegradePic = str;
            }
        }

        public final void setWidth(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c411ae15", new Object[]{this, str});
            } else {
                this.width = str;
            }
        }
    }

    static {
        t2o.a(838860818);
    }

    public final String getConfigData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93b63637", new Object[]{this});
        }
        return this.configData;
    }

    public final String getExtData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaa840e4", new Object[]{this});
        }
        return this.extData;
    }

    public final String getMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8db4d0", new Object[]{this});
        }
        return this.metaInfo;
    }

    public final String getRelationUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd2c1a7c", new Object[]{this});
        }
        return this.relationUrl;
    }

    public final ViewConfig getViewConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewConfig) ipChange.ipc$dispatch("4258b692", new Object[]{this});
        }
        return this.viewConfig;
    }

    public final String getWidgetDataId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("421ed01a", new Object[]{this});
        }
        return this.widgetDataId;
    }

    public final Long getWidgetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("47479f99", new Object[]{this});
        }
        return this.widgetId;
    }

    public final String getWidgetVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("205edf7b", new Object[]{this});
        }
        return this.widgetVersion;
    }

    public final void setConfigData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fa181f", new Object[]{this, str});
        } else {
            this.configData = str;
        }
    }

    public final void setExtData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7163647a", new Object[]{this, str});
        } else {
            this.extData = str;
        }
    }

    public final void setMetaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2063fa6", new Object[]{this, str});
        } else {
            this.metaInfo = str;
        }
    }

    public final void setRelationUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e2", new Object[]{this, str});
        } else {
            this.relationUrl = str;
        }
    }

    public final void setViewConfig(ViewConfig viewConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e525678e", new Object[]{this, viewConfig});
        } else {
            this.viewConfig = viewConfig;
        }
    }

    public final void setWidgetDataId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9259a79c", new Object[]{this, str});
        } else {
            this.widgetDataId = str;
        }
    }

    public final void setWidgetId(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5cc547", new Object[]{this, l});
        } else {
            this.widgetId = l;
        }
    }

    public final void setWidgetVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201cf1c3", new Object[]{this, str});
        } else {
            this.widgetVersion = str;
        }
    }
}
