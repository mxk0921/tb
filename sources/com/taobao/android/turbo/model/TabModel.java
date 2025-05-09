package com.taobao.android.turbo.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.ic1;
import tb.ir2;
import tb.mf6;
import tb.pg1;
import tb.r6o;
import tb.spu;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 e2\u00020\u0001:\u0003fghB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u0010R0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\u0010R\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010*R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010'\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010*R\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010L\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00106\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R*\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR*\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR$\u0010Y\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\r\u001a\u0004\bZ\u0010\u000b\"\u0004\b[\u0010\u0010R$\u0010]\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010'\u001a\u0004\bc\u0010\u0006\"\u0004\bd\u0010*¨\u0006i"}, d2 = {"Lcom/taobao/android/turbo/model/TabModel;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "<init>", "()V", "", "isLive", "()Z", "isDark", "isSupportFestival", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "", "time", "J", pg1.ATOM_EXT_getTime, "()J", pg1.ATOM_EXT_setTime, "(J)V", "pit", "getPit", "setPit", "", "", "utParams", "Ljava/util/Map;", "getUtParams", "()Ljava/util/Map;", "setUtParams", "(Ljava/util/Map;)V", "theme", "getTheme", "setTheme", mf6.TYPE_SELECTED, "Z", "getSelected", "setSelected", "(Z)V", "login", "getLogin", "setLogin", "Lcom/taobao/android/turbo/model/TabModel$TipsModel;", "tips", "Lcom/taobao/android/turbo/model/TabModel$TipsModel;", "getTips", "()Lcom/taobao/android/turbo/model/TabModel$TipsModel;", "setTips", "(Lcom/taobao/android/turbo/model/TabModel$TipsModel;)V", "options", "Ljava/lang/Object;", "getOptions", "()Ljava/lang/Object;", "setOptions", "(Ljava/lang/Object;)V", "Lcom/taobao/android/turbo/model/PicModel;", "tabPic", "Lcom/taobao/android/turbo/model/PicModel;", "getTabPic", "()Lcom/taobao/android/turbo/model/PicModel;", "setTabPic", "(Lcom/taobao/android/turbo/model/PicModel;)V", "apmValid", "getApmValid", "setApmValid", "", "subSelectedIndex", TLogTracker.LEVEL_INFO, "getSubSelectedIndex", "()I", "setSubSelectedIndex", "(I)V", "query", "getQuery", "setQuery", "", "tabs", "[Lcom/taobao/android/turbo/model/TabModel;", "getTabs", "()[Lcom/taobao/android/turbo/model/TabModel;", "setTabs", "([Lcom/taobao/android/turbo/model/TabModel;)V", "subTabs", "getSubTabs", "setSubTabs", "source", "getSource", "setSource", "Lcom/taobao/android/turbo/model/TabModel$StyleModel;", "style", "Lcom/taobao/android/turbo/model/TabModel$StyleModel;", "getStyle", "()Lcom/taobao/android/turbo/model/TabModel$StyleModel;", "setStyle", "(Lcom/taobao/android/turbo/model/TabModel$StyleModel;)V", "isTemporary", "setTemporary", "Companion", "a", "StyleModel", "TipsModel", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TabModel extends BaseSubPageComponent.SubPageModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DEFAULT_INIT_TAB_ID = "video";
    private boolean apmValid;
    private boolean isTemporary;
    private boolean login;
    public String name;
    private Object options;
    private String pit;
    private Object query;
    private boolean selected;
    private String source;
    private StyleModel style;
    private int subSelectedIndex;
    private TabModel[] subTabs;
    private PicModel tabPic;
    private TabModel[] tabs;
    private String theme = "auto";
    private long time;
    private TipsModel tips;
    private Map<String, ? extends Object> utParams;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/taobao/android/turbo/model/TabModel$StyleModel;", "", "()V", "paddingTop", "", "getPaddingTop", "()I", "setPaddingTop", "(I)V", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class StyleModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int paddingTop;

        static {
            t2o.a(916455486);
        }

        public final int getPaddingTop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
            }
            return this.paddingTop;
        }

        public final void setPaddingTop(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
            } else {
                this.paddingTop = i;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/taobao/android/turbo/model/TabModel$TipsModel;", "", "<init>", "()V", "", "type", "Ljava/lang/String;", NetworkAbility.API_GET_TYPE, "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class TipsModel {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion = new a(null);
        public static final String TYPE_RED_POINT = "redpoint";
        private String type = "redpoint";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            static {
                t2o.a(916455488);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        static {
            t2o.a(916455487);
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455485);
        }

        public a() {
        }

        public final void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1033b7e4", new Object[]{this, map});
                return;
            }
            Object obj = map.get("style");
            if (obj == null) {
                obj = new JSONObject();
                map.put("style", obj);
            }
            if (obj instanceof JSONObject) {
                r6o.a aVar = r6o.Companion;
                spu.a aVar2 = spu.Companion;
                ((JSONObject) obj).put("paddingTop", (Object) Integer.valueOf(aVar.g(aVar2.d()) + aVar.a(aVar2.d())));
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final List<TabModel> a(Object obj) {
            JSONObject jSONObject;
            String string;
            String string2;
            String string3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("7c89c9d8", new Object[]{this, obj});
            }
            if (!(obj instanceof JSONArray) || ((JSONArray) obj).isEmpty()) {
                return null;
            }
            Iterable iterable = (Iterable) obj;
            for (Object obj2 : iterable) {
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    String string4 = jSONObject2.getString("id");
                    if (ckf.b(string4, "more")) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("subTabs");
                        if (jSONArray != null && !jSONArray.isEmpty()) {
                            jSONObject2.putAll(jSONArray.getJSONObject(0));
                            if (ckf.b(jSONObject2.getString("id"), "theater")) {
                                jSONObject2.put("type", (Object) "dx");
                            }
                        }
                    } else if (ckf.b(string4, "home")) {
                        jSONObject2.put("url", (Object) "page_guangguangdiscovery?initDataKey=ggdiscovery&policy=localfirst");
                        jSONObject2.put("type", (Object) "node");
                        TabModel.Companion.b((Map) obj2);
                    } else if (ckf.b(string4, "video")) {
                        jSONObject2.put("type", (Object) "video");
                    } else if (ckf.b(string4, "follow")) {
                        TabModel.Companion.b((Map) obj2);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : iterable) {
                if (!(!(obj3 instanceof JSONObject) || (string = (jSONObject = (JSONObject) obj3).getString("id")) == null || string.length() == 0 || (string2 = jSONObject.getString("type")) == null || string2.length() == 0 || (string3 = jSONObject.getString("pageName")) == null || string3.length() == 0)) {
                    arrayList.add(obj3);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (obj4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                } else if (hashSet.add(((JSONObject) obj4).getString("id"))) {
                    arrayList2.add(obj4);
                }
            }
            JSONArray jSONArray2 = new JSONArray(arrayList2);
            if (jSONArray2.isEmpty()) {
                return null;
            }
            Object javaObject = JSON.toJavaObject(jSONArray2, TabModel[].class);
            ckf.f(javaObject, "JSONArray.toJavaObject(t…ay<TabModel>::class.java)");
            return ic1.i0((Object[]) javaObject);
        }
    }

    static {
        t2o.a(916455484);
    }

    public static /* synthetic */ Object ipc$super(TabModel tabModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/model/TabModel");
    }

    public final boolean getApmValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7c9707f", new Object[]{this})).booleanValue();
        }
        return this.apmValid;
    }

    public final boolean getLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98e108be", new Object[]{this})).booleanValue();
        }
        return this.login;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        String str = this.name;
        if (str != null) {
            return str;
        }
        ckf.y("name");
        throw null;
    }

    public final Object getOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("30d5a023", new Object[]{this});
        }
        return this.options;
    }

    public final String getPit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af6adb4", new Object[]{this});
        }
        return this.pit;
    }

    public final Object getQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6aa011b9", new Object[]{this});
        }
        return this.query;
    }

    public final boolean getSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f84d441c", new Object[]{this})).booleanValue();
        }
        return this.selected;
    }

    public final String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.source;
    }

    public final StyleModel getStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("e890bdc5", new Object[]{this});
        }
        return this.style;
    }

    public final int getSubSelectedIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("503a6607", new Object[]{this})).intValue();
        }
        return this.subSelectedIndex;
    }

    public final TabModel[] getSubTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabModel[]) ipChange.ipc$dispatch("e5464855", new Object[]{this});
        }
        return this.subTabs;
    }

    public final PicModel getTabPic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PicModel) ipChange.ipc$dispatch("9d1cb99a", new Object[]{this});
        }
        return this.tabPic;
    }

    public final TabModel[] getTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabModel[]) ipChange.ipc$dispatch("530e7989", new Object[]{this});
        }
        return this.tabs;
    }

    public final String getTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7106cc6", new Object[]{this});
        }
        return this.theme;
    }

    public final long getTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return this.time;
    }

    public final TipsModel getTips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsModel) ipChange.ipc$dispatch("1e31483b", new Object[]{this});
        }
        return this.tips;
    }

    public final Map<String, Object> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        return this.utParams;
    }

    public final boolean isLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue();
        }
        return ckf.b(getType(), "live");
    }

    public final boolean isSupportFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3981de8", new Object[]{this})).booleanValue();
        }
        return ckf.b(getType(), "node");
    }

    public final boolean isTemporary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43abc952", new Object[]{this})).booleanValue();
        }
        return this.isTemporary;
    }

    public final void setApmValid(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43bb82d", new Object[]{this, new Boolean(z)});
        } else {
            this.apmValid = z;
        }
    }

    public final void setLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1650f66", new Object[]{this, new Boolean(z)});
        } else {
            this.login = z;
        }
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.name = str;
    }

    public final void setOptions(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9837f", new Object[]{this, obj});
        } else {
            this.options = obj;
        }
    }

    public final void setPit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26bebaa", new Object[]{this, str});
        } else {
            this.pit = str;
        }
    }

    public final void setQuery(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5251a9", new Object[]{this, obj});
        } else {
            this.query = obj;
        }
    }

    public final void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.selected = z;
        }
    }

    public final void setSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad15ee", new Object[]{this, str});
        } else {
            this.source = str;
        }
    }

    public final void setStyle(StyleModel styleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7ae0a7", new Object[]{this, styleModel});
        } else {
            this.style = styleModel;
        }
    }

    public final void setSubSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872581e3", new Object[]{this, new Integer(i)});
        } else {
            this.subSelectedIndex = i;
        }
    }

    public final void setSubTabs(TabModel[] tabModelArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343960b1", new Object[]{this, tabModelArr});
        } else {
            this.subTabs = tabModelArr;
        }
    }

    public final void setTabPic(PicModel picModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87eba", new Object[]{this, picModel});
        } else {
            this.tabPic = picModel;
        }
    }

    public final void setTabs(TabModel[] tabModelArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabc595", new Object[]{this, tabModelArr});
        } else {
            this.tabs = tabModelArr;
        }
    }

    public final void setTemporary(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b0c07e", new Object[]{this, new Boolean(z)});
        } else {
            this.isTemporary = z;
        }
    }

    public final void setTheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d5c1d8", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.theme = str;
    }

    public final void setTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1b1a2e", new Object[]{this, new Long(j)});
        } else {
            this.time = j;
        }
    }

    public final void setTips(TipsModel tipsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea261f5", new Object[]{this, tipsModel});
        } else {
            this.tips = tipsModel;
        }
    }

    public final void setUtParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6666a537", new Object[]{this, map});
        } else {
            this.utParams = map;
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("TabModel(id='");
        sb.append(getId());
        sb.append("', name='");
        String str2 = this.name;
        String str3 = null;
        if (str2 != null) {
            sb.append(str2);
            sb.append("', url='");
            sb.append(getUrl());
            sb.append("', type='");
            sb.append(getType());
            sb.append("', options=");
            sb.append(this.options);
            sb.append(", tabPic=");
            sb.append(this.tabPic);
            sb.append(", apmValid=");
            sb.append(this.apmValid);
            sb.append(", subSelectedIndex=");
            sb.append(this.subSelectedIndex);
            sb.append(", query=");
            sb.append(this.query);
            sb.append(", tabs=");
            TabModel[] tabModelArr = this.tabs;
            if (tabModelArr != null) {
                str = Arrays.toString(tabModelArr);
                ckf.f(str, "java.util.Arrays.toString(this)");
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", subTabs=");
            TabModel[] tabModelArr2 = this.subTabs;
            if (tabModelArr2 != null) {
                str3 = Arrays.toString(tabModelArr2);
                ckf.f(str3, "java.util.Arrays.toString(this)");
            }
            sb.append(str3);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(", style=");
            sb.append(this.style);
            sb.append(", isTemporary=");
            sb.append(this.isTemporary);
            sb.append(')');
            return sb.toString();
        }
        ckf.y("name");
        throw null;
    }

    public final boolean isDark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("386b704b", new Object[]{this})).booleanValue();
        }
        if (!ckf.b(getId(), "theater")) {
            return ckf.b(getType(), "video") || ckf.b(this.theme, ir2.THEME_FORCE_DARK);
        }
        return false;
    }
}
