package com.taobao.message.lab.comfrm.core;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WrapperEvent extends Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONArray auraEventHandler;
    public ViewObject viewObject;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Build {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WrapperEvent event;

        static {
            t2o.a(537919553);
        }

        public Build(String str) {
            this.event = new WrapperEvent(str);
        }

        public Build auraEventHandler(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("de3679a4", new Object[]{this, jSONArray});
            }
            this.event.auraEventHandler = jSONArray;
            return this;
        }

        public WrapperEvent build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WrapperEvent) ipChange.ipc$dispatch("a22c18c1", new Object[]{this});
            }
            return this.event;
        }

        public Build context(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("713c3771", new Object[]{this, map});
            }
            this.event.context = map;
            return this;
        }

        public Build data(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("cfba63af", new Object[]{this, obj});
            }
            this.event.data = obj;
            return this;
        }

        public Build viewObject(ViewObject viewObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("b01ed236", new Object[]{this, viewObject});
            }
            this.event.viewObject = viewObject;
            return this;
        }
    }

    static {
        t2o.a(537919552);
    }

    public WrapperEvent(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(WrapperEvent wrapperEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/core/WrapperEvent");
    }

    public JSONArray getAuraEventHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c9bed06e", new Object[]{this});
        }
        return this.auraEventHandler;
    }

    public ViewObject getViewObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("87ef67f0", new Object[]{this});
        }
        return this.viewObject;
    }
}
