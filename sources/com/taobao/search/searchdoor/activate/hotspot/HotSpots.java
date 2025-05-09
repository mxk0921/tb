package com.taobao.search.searchdoor.activate.hotspot;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.List;
import tb.bbz;
import tb.ckf;
import tb.t2o;
import tb.x6b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpots extends ActivateTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;
    private JSONObject originData;
    private boolean preload;
    private String tabKey;
    private List<x6b> tabs;
    private boolean trendExposed;
    private String trendRuleText;
    private String trendRuleUrl;
    private boolean validExposureSent;

    static {
        t2o.a(815792995);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HotSpots(boolean r10, java.util.List r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, com.alibaba.fastjson.JSONObject r16, boolean r17, boolean r18, int r19, tb.a07 r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 4
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0013
        L_0x0012:
            r3 = r12
        L_0x0013:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0019
            r5 = r4
            goto L_0x001a
        L_0x0019:
            r5 = r13
        L_0x001a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0020
            r6 = r4
            goto L_0x0021
        L_0x0020:
            r6 = r14
        L_0x0021:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = r15
        L_0x0027:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r2 = r16
        L_0x002e:
            r7 = r0 & 128(0x80, float:1.794E-43)
            r8 = 0
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0037
        L_0x0035:
            r7 = r17
        L_0x0037:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r8 = r18
        L_0x003e:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r3
            r15 = r5
            r16 = r6
            r17 = r4
            r18 = r2
            r19 = r7
            r20 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.searchdoor.activate.hotspot.HotSpots.<init>(boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, boolean, boolean, int, tb.a07):void");
    }

    public static /* synthetic */ HotSpots copy$default(HotSpots hotSpots, boolean z, List list, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z2, boolean z3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpots) ipChange.ipc$dispatch("5422507b", new Object[]{hotSpots, new Boolean(z), list, str, str2, str3, str4, jSONObject, new Boolean(z2), new Boolean(z3), new Integer(i), obj});
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = (1 & i) != 0 ? hotSpots.preload : z;
        List list2 = (2 & i) != 0 ? hotSpots.tabs : list;
        String str5 = (4 & i) != 0 ? hotSpots.name : str;
        String str6 = (8 & i) != 0 ? hotSpots.trendRuleText : str2;
        String str7 = (i & 16) != 0 ? hotSpots.trendRuleUrl : str3;
        String str8 = (i & 32) != 0 ? hotSpots.tabKey : str4;
        JSONObject jSONObject2 = (i & 64) != 0 ? hotSpots.originData : jSONObject;
        if ((i & 128) != 0) {
            z4 = hotSpots.validExposureSent;
        }
        if ((i & 256) != 0) {
            z5 = hotSpots.trendExposed;
        }
        return hotSpots.copy(z6, list2, str5, str6, str7, str8, jSONObject2, z4, z5);
    }

    public static /* synthetic */ Object ipc$super(HotSpots hotSpots, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/HotSpots");
    }

    public final boolean component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f047d5f", new Object[]{this})).booleanValue();
        }
        return this.preload;
    }

    public final List<x6b> component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8d369eb", new Object[]{this});
        }
        return this.tabs;
    }

    public final String component3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b05ede3", new Object[]{this});
        }
        return this.name;
    }

    public final String component4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("118ba882", new Object[]{this});
        }
        return this.trendRuleText;
    }

    public final String component5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98116321", new Object[]{this});
        }
        return this.trendRuleUrl;
    }

    public final String component6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e971dc0", new Object[]{this});
        }
        return this.tabKey;
    }

    public final JSONObject component7() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bfadf181", new Object[]{this});
        }
        return this.originData;
    }

    public final boolean component8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f6721e6", new Object[]{this})).booleanValue();
        }
        return this.validExposureSent;
    }

    public final boolean component9() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f753967", new Object[]{this})).booleanValue();
        }
        return this.trendExposed;
    }

    public final HotSpots copy(boolean z, List<x6b> list, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpots) ipChange.ipc$dispatch("bacc284b", new Object[]{this, new Boolean(z), list, str, str2, str3, str4, jSONObject, new Boolean(z2), new Boolean(z3)});
        }
        return new HotSpots(z, list, str, str2, str3, str4, jSONObject, z2, z3);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSpots)) {
            return false;
        }
        HotSpots hotSpots = (HotSpots) obj;
        if (this.preload == hotSpots.preload && ckf.b(this.tabs, hotSpots.tabs) && ckf.b(this.name, hotSpots.name) && ckf.b(this.trendRuleText, hotSpots.trendRuleText) && ckf.b(this.trendRuleUrl, hotSpots.trendRuleUrl) && ckf.b(this.tabKey, hotSpots.tabKey) && ckf.b(this.originData, hotSpots.originData) && this.validExposureSent == hotSpots.validExposureSent && this.trendExposed == hotSpots.trendExposed) {
            return true;
        }
        return false;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public final JSONObject getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d23a08d", new Object[]{this});
        }
        return this.originData;
    }

    public final boolean getPreload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3880cde", new Object[]{this})).booleanValue();
        }
        return this.preload;
    }

    public final String getTabKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33abb979", new Object[]{this});
        }
        return this.tabKey;
    }

    public final List<x6b> getTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e58aa66c", new Object[]{this});
        }
        return this.tabs;
    }

    public final boolean getTrendExposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd93344", new Object[]{this})).booleanValue();
        }
        return this.trendExposed;
    }

    public final String getTrendRuleText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e65939a9", new Object[]{this});
        }
        return this.trendRuleText;
    }

    public final String getTrendRuleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aeb678d", new Object[]{this});
        }
        return this.trendRuleUrl;
    }

    public final boolean getValidExposureSent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39ee0b0", new Object[]{this})).booleanValue();
        }
        return this.validExposureSent;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int a2 = bbz.a(this.preload) * 31;
        List<x6b> list = this.tabs;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i7 = (a2 + i) * 31;
        String str = this.name;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        String str2 = this.trendRuleText;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.trendRuleUrl;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        String str4 = this.tabKey;
        if (str4 == null) {
            i5 = 0;
        } else {
            i5 = str4.hashCode();
        }
        int i11 = (i10 + i5) * 31;
        JSONObject jSONObject = this.originData;
        if (jSONObject != null) {
            i6 = jSONObject.hashCode();
        }
        return ((((i11 + i6) * 31) + bbz.a(this.validExposureSent)) * 31) + bbz.a(this.trendExposed);
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final void setOriginData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5bbc97", new Object[]{this, jSONObject});
        } else {
            this.originData = jSONObject;
        }
    }

    public final void setPreload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c33c46", new Object[]{this, new Boolean(z)});
        } else {
            this.preload = z;
        }
    }

    public final void setTabKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e175631d", new Object[]{this, str});
        } else {
            this.tabKey = str;
        }
    }

    public final void setTabs(List<x6b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56510678", new Object[]{this, list});
        } else {
            this.tabs = list;
        }
    }

    public final void setTrendExposed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e3f408", new Object[]{this, new Boolean(z)});
        } else {
            this.trendExposed = z;
        }
    }

    public final void setTrendRuleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196ddd55", new Object[]{this, str});
        } else {
            this.trendRuleText = str;
        }
    }

    public final void setTrendRuleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31ffe89", new Object[]{this, str});
        } else {
            this.trendRuleUrl = str;
        }
    }

    public final void setValidExposureSent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28183b4", new Object[]{this, new Boolean(z)});
        } else {
            this.validExposureSent = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HotSpots(preload=" + this.preload + ", tabs=" + this.tabs + ", name=" + this.name + ", trendRuleText=" + this.trendRuleText + ", trendRuleUrl=" + this.trendRuleUrl + ", tabKey=" + this.tabKey + ", originData=" + this.originData + ", validExposureSent=" + this.validExposureSent + ", trendExposed=" + this.trendExposed + ')';
    }

    public HotSpots(boolean z, List<x6b> list, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z2, boolean z3) {
        this.preload = z;
        this.tabs = list;
        this.name = str;
        this.trendRuleText = str2;
        this.trendRuleUrl = str3;
        this.tabKey = str4;
        this.originData = jSONObject;
        this.validExposureSent = z2;
        this.trendExposed = z3;
    }
}
